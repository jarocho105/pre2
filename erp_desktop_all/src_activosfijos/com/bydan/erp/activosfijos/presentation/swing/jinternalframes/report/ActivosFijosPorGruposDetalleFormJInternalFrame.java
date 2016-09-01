/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ActivosFijosPorGruposConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class ActivosFijosPorGruposDetalleFormJInternalFrame extends ActivosFijosPorGruposBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleActivosFijosPorGrupos;
	
	protected JMenuBar jmenuBarDetalleActivosFijosPorGrupos;
	
	protected JMenu jmenuDetalleActivosFijosPorGrupos;
	protected JMenu jmenuDetalleArchivoActivosFijosPorGrupos;
	protected JMenu jmenuDetalleAccionesActivosFijosPorGrupos;
	protected JMenu jmenuDetalleDatosActivosFijosPorGrupos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutActivosFijosPorGrupos;	
	protected GridBagConstraints gridBagConstraintsActivosFijosPorGrupos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ActivosFijosPorGruposBeanSwingJInternalFrameAdditional jInternalFrameDetalleActivosFijosPorGrupos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ActivosFijosPorGruposSessionBean activosfijosporgruposSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public ActivosFijosPorGruposLogic activosfijosporgruposLogic;
	
	public JScrollPane jScrollPanelDatosActivosFijosPorGrupos;
	public JScrollPane jScrollPanelDatosEdicionActivosFijosPorGrupos;
	public JScrollPane jScrollPanelDatosGeneralActivosFijosPorGrupos;
	
	protected JPanel jPanelCamposActivosFijosPorGrupos;    
	protected JPanel jPanelCamposOcultosActivosFijosPorGrupos;    	
	protected JPanel jPanelAccionesActivosFijosPorGrupos;
	protected JPanel jPanelAccionesFormularioActivosFijosPorGrupos;
    
	
	
	protected Integer iXPanelCamposActivosFijosPorGrupos=0;
	protected Integer iYPanelCamposActivosFijosPorGrupos=0;
	
	protected Integer iXPanelCamposOcultosActivosFijosPorGrupos=0;
	protected Integer iYPanelCamposOcultosActivosFijosPorGrupos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoActivosFijosPorGrupos;
	public JButton jButtonModificarActivosFijosPorGrupos;
	public JButton jButtonActualizarActivosFijosPorGrupos;
    public JButton jButtonEliminarActivosFijosPorGrupos;
	public JButton jButtonCancelarActivosFijosPorGrupos;
    public JButton jButtonGuardarCambiosActivosFijosPorGrupos;
	public JButton jButtonGuardarCambiosTablaActivosFijosPorGrupos;
	protected JButton jButtonCerrarActivosFijosPorGrupos;
	
	
	protected JButton jButtonProcesarInformacionActivosFijosPorGrupos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoActivosFijosPorGrupos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarActivosFijosPorGrupos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeActivosFijosPorGrupos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarActivosFijosPorGrupos;
	protected JButton jButtonModificarToolBarActivosFijosPorGrupos;
	protected JButton jButtonActualizarToolBarActivosFijosPorGrupos;
    protected JButton jButtonEliminarToolBarActivosFijosPorGrupos;
	protected JButton jButtonCancelarToolBarActivosFijosPorGrupos;
    protected JButton jButtonGuardarCambiosToolBarActivosFijosPorGrupos;
	protected JButton jButtonGuardarCambiosTablaToolBarActivosFijosPorGrupos;
	protected JButton jButtonMostrarOcultarTablaToolBarActivosFijosPorGrupos;
	protected JButton jButtonCerrarToolBarActivosFijosPorGrupos;
	
	protected JButton jButtonProcesarInformacionToolBarActivosFijosPorGrupos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoActivosFijosPorGrupos;
	protected JMenuItem jMenuItemModificarActivosFijosPorGrupos;
	protected JMenuItem jMenuItemActualizarActivosFijosPorGrupos;
    protected JMenuItem jMenuItemEliminarActivosFijosPorGrupos;
	protected JMenuItem jMenuItemCancelarActivosFijosPorGrupos;
    protected JMenuItem jMenuItemGuardarCambiosActivosFijosPorGrupos;
	protected JMenuItem jMenuItemGuardarCambiosTablaActivosFijosPorGrupos;
	protected JMenuItem jMenuItemCerrarActivosFijosPorGrupos;
	protected JMenuItem jMenuItemDetalleCerrarActivosFijosPorGrupos;
	protected JMenuItem jMenuItemDetalleMostarOcultarActivosFijosPorGrupos;
	
	protected JMenuItem jMenuItemProcesarInformacionActivosFijosPorGrupos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos;
	protected JMenuItem jMenuItemMostrarOcultarActivosFijosPorGrupos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesActivosFijosPorGrupos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesActivosFijosPorGrupos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioActivosFijosPorGrupos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidActivosFijosPorGrupos;
	public JLabel jLabelIdActivosFijosPorGrupos;
	public JLabel jLabelidActivosFijosPorGrupos;
	public JButton jButtonidActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sub_grupoActivosFijosPorGrupos;
	public JLabel jLabelcodigo_sub_grupoActivosFijosPorGrupos;
	public JTextField jTextFieldcodigo_sub_grupoActivosFijosPorGrupos;
	public JButton jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoActivosFijosPorGrupos;
	public JLabel jLabelnombre_sub_grupoActivosFijosPorGrupos;
	public JTextArea jTextAreanombre_sub_grupoActivosFijosPorGrupos;
	public JScrollPane jscrollPanenombre_sub_grupoActivosFijosPorGrupos;
	public JButton jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoActivosFijosPorGrupos;
	public JLabel jLabelcodigo_detalle_grupoActivosFijosPorGrupos;
	public JTextField jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos;
	public JButton jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoActivosFijosPorGrupos;
	public JLabel jLabelnombre_detalle_grupoActivosFijosPorGrupos;
	public JTextArea jTextAreanombre_detalle_grupoActivosFijosPorGrupos;
	public JScrollPane jscrollPanenombre_detalle_grupoActivosFijosPorGrupos;
	public JButton jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelclaveActivosFijosPorGrupos;
	public JLabel jLabelclaveActivosFijosPorGrupos;
	public JTextField jTextFieldclaveActivosFijosPorGrupos;
	public JButton jButtonclaveActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelnombreActivosFijosPorGrupos;
	public JLabel jLabelnombreActivosFijosPorGrupos;
	public JTextArea jTextAreanombreActivosFijosPorGrupos;
	public JScrollPane jscrollPanenombreActivosFijosPorGrupos;
	public JButton jButtonnombreActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraActivosFijosPorGrupos;
	public JLabel jLabelfecha_compraActivosFijosPorGrupos;
	//public JFormattedTextField jDateChooserfecha_compraActivosFijosPorGrupos;

	public JDateChooser jDateChooserfecha_compraActivosFijosPorGrupos;
	public JButton jButtonfecha_compraActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilActivosFijosPorGrupos;
	public JLabel jLabelvida_utilActivosFijosPorGrupos;
	public JTextField jTextFieldvida_utilActivosFijosPorGrupos;
	public JButton jButtonvida_utilActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraActivosFijosPorGrupos;
	public JLabel jLabelcosto_de_compraActivosFijosPorGrupos;
	public JTextField jTextFieldcosto_de_compraActivosFijosPorGrupos;
	public JButton jButtoncosto_de_compraActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelmarcaActivosFijosPorGrupos;
	public JLabel jLabelmarcaActivosFijosPorGrupos;
	public JTextArea jTextAreamarcaActivosFijosPorGrupos;
	public JScrollPane jscrollPanemarcaActivosFijosPorGrupos;
	public JButton jButtonmarcaActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelmodeloActivosFijosPorGrupos;
	public JLabel jLabelmodeloActivosFijosPorGrupos;
	public JTextArea jTextAreamodeloActivosFijosPorGrupos;
	public JScrollPane jscrollPanemodeloActivosFijosPorGrupos;
	public JButton jButtonmodeloActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelcolorActivosFijosPorGrupos;
	public JLabel jLabelcolorActivosFijosPorGrupos;
	public JTextField jTextFieldcolorActivosFijosPorGrupos;
	public JButton jButtoncolorActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelserieActivosFijosPorGrupos;
	public JLabel jLabelserieActivosFijosPorGrupos;
	public JTextField jTextFieldserieActivosFijosPorGrupos;
	public JButton jButtonserieActivosFijosPorGruposBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaActivosFijosPorGrupos;
	public JLabel jLabelid_empresaActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaActivosFijosPorGrupos;
	public JButton jButtonid_empresaActivosFijosPorGrupos= new JButtonMe();
	public JButton jButtonid_empresaActivosFijosPorGruposUpdate= new JButtonMe();
	public JButton jButtonid_empresaActivosFijosPorGruposBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalActivosFijosPorGrupos;
	public JLabel jLabelid_sucursalActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalActivosFijosPorGrupos;
	public JButton jButtonid_sucursalActivosFijosPorGrupos= new JButtonMe();
	public JButton jButtonid_sucursalActivosFijosPorGruposUpdate= new JButtonMe();
	public JButton jButtonid_sucursalActivosFijosPorGruposBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesActivosFijosPorGrupos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ActivosFijosPorGruposDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposActivosFijosPorGrupos=new JPanel();
				this.jPanelAccionesFormularioActivosFijosPorGrupos=new JPanel();
				this.jmenuBarDetalleActivosFijosPorGrupos=new JMenuBar();
				this.jTtoolBarDetalleActivosFijosPorGrupos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorGruposDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ActivosFijosPorGruposDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorGruposDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorGruposDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorGruposDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarActivosFijosPorGrupos() {
		return this.jButtonActualizarToolBarActivosFijosPorGrupos;
	}
	
	public JButton getjButtonEliminarToolBarActivosFijosPorGrupos() {
		return this.jButtonEliminarToolBarActivosFijosPorGrupos;
	}
	
	public JButton getjButtonCancelarToolBarActivosFijosPorGrupos() {
		return this.jButtonCancelarToolBarActivosFijosPorGrupos;
	}		
	
	public JButton getjButtonProcesarInformacionActivosFijosPorGrupos() {
		return this.jButtonProcesarInformacionActivosFijosPorGrupos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionActivosFijosPorGrupos)	{
		this.jButtonProcesarInformacionActivosFijosPorGrupos = jButtonProcesarInformacionActivosFijosPorGrupos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesActivosFijosPorGrupos() {
		return this.jComboBoxTiposAccionesActivosFijosPorGrupos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesActivosFijosPorGrupos(
			JComboBox jComboBoxTiposRelacionesActivosFijosPorGrupos) {
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos = jComboBoxTiposRelacionesActivosFijosPorGrupos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesActivosFijosPorGrupos(
			JComboBox jComboBoxTiposAccionesActivosFijosPorGrupos) {
		this.jComboBoxTiposAccionesActivosFijosPorGrupos = jComboBoxTiposAccionesActivosFijosPorGrupos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioActivosFijosPorGrupos() {
		return this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioActivosFijosPorGrupos(
			JComboBox jComboBoxTiposAccionesFormularioActivosFijosPorGrupos) {
		this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos = jComboBoxTiposAccionesFormularioActivosFijosPorGrupos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.activosfijosporgruposSessionBean=new ActivosFijosPorGruposSessionBean();
		
		this.activosfijosporgruposSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosporgruposSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.activosfijosporgruposSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ActivosFijosPorGruposJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ActivosFijosPorGruposJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ActivosFijosPorGruposJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Activos Fijos Por Grupos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		ActivosFijosPorGruposJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleActivosFijosPorGrupos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarActivosFijosPorGrupos=new JButtonMe();
				this.jButtonModificarToolBarActivosFijosPorGrupos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarActivosFijosPorGrupos,this.jTtoolBarDetalleActivosFijosPorGrupos,
							"actualizar","actualizar","Actualizar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarActivosFijosPorGrupos,this.jTtoolBarDetalleActivosFijosPorGrupos,
							"eliminar","eliminar","Eliminar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarActivosFijosPorGrupos,this.jTtoolBarDetalleActivosFijosPorGrupos,
							"cancelar","cancelar","Cancelar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarActivosFijosPorGrupos,this.jTtoolBarDetalleActivosFijosPorGrupos,
							"guardarcambios","guardarcambios","Guardar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleActivosFijosPorGrupos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleActivosFijosPorGrupos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoActivosFijosPorGrupos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesActivosFijosPorGrupos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosActivosFijosPorGrupos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoActivosFijosPorGrupos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoActivosFijosPorGrupos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoActivosFijosPorGrupos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarActivosFijosPorGrupos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarActivosFijosPorGrupos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarActivosFijosPorGrupos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarActivosFijosPorGrupos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarActivosFijosPorGrupos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarActivosFijosPorGrupos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarActivosFijosPorGrupos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarActivosFijosPorGrupos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarActivosFijosPorGrupos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarActivosFijosPorGrupos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarActivosFijosPorGrupos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarActivosFijosPorGrupos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosActivosFijosPorGrupos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosActivosFijosPorGrupos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosActivosFijosPorGrupos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarActivosFijosPorGrupos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarActivosFijosPorGrupos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarActivosFijosPorGrupos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarActivosFijosPorGrupos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarActivosFijosPorGrupos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarActivosFijosPorGrupos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarActivosFijosPorGrupos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarActivosFijosPorGrupos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarActivosFijosPorGrupos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoActivosFijosPorGrupos.add(this.jMenuItemDetalleCerrarActivosFijosPorGrupos);
		
		this.jmenuDetalleAccionesActivosFijosPorGrupos.add(this.jMenuItemActualizarActivosFijosPorGrupos);
		this.jmenuDetalleAccionesActivosFijosPorGrupos.add(this.jMenuItemEliminarActivosFijosPorGrupos);
		this.jmenuDetalleAccionesActivosFijosPorGrupos.add(this.jMenuItemCancelarActivosFijosPorGrupos);		
		
		//this.jmenuDetalleDatosActivosFijosPorGrupos.add(this.jMenuItemDetalleAbrirOrderByActivosFijosPorGrupos);				
		this.jmenuDetalleDatosActivosFijosPorGrupos.add(this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos);				
				
		//this.jmenuDetalleAccionesActivosFijosPorGrupos.add(this.jMenuItemGuardarCambiosActivosFijosPorGrupos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleActivosFijosPorGrupos.add(this.jmenuDetalleArchivoActivosFijosPorGrupos);		
		this.jmenuBarDetalleActivosFijosPorGrupos.add(this.jmenuDetalleAccionesActivosFijosPorGrupos);		
		this.jmenuBarDetalleActivosFijosPorGrupos.add(this.jmenuDetalleDatosActivosFijosPorGrupos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleActivosFijosPorGrupos);				
	}
	
	
	public void inicializarElementosCamposActivosFijosPorGrupos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdActivosFijosPorGrupos = new JLabelMe();
		jLabelIdActivosFijosPorGrupos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidActivosFijosPorGrupos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutActivosFijosPorGrupos= new GridBagLayout();

		this.jPanelidActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);

		jLabelidActivosFijosPorGrupos = new JLabel();
		jLabelidActivosFijosPorGrupos.setText("Id");

		jLabelidActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_sub_grupoActivosFijosPorGrupos = new JLabelMe();
		this.jLabelcodigo_sub_grupoActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO+" : *");
		this.jLabelcodigo_sub_grupoActivosFijosPorGrupos.setToolTipText("Codigo Sub Grupo");
		this.jLabelcodigo_sub_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sub_grupoActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sub_grupoActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sub_grupoActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelcodigo_sub_grupoActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextFieldcodigo_sub_grupoActivosFijosPorGrupos= new JTextFieldMe();

		jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setEnabled(false);
		jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sub_grupoActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.setText("U");
		this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sub_grupoActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sub_grupoActivosFijosPorGrupos = new JLabelMe();
		this.jLabelnombre_sub_grupoActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoActivosFijosPorGrupos.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelnombre_sub_grupoActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextAreanombre_sub_grupoActivosFijosPorGrupos= new JTextAreaMe();
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.setEnabled(false);
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.setLineWrap(true);
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoActivosFijosPorGrupos = new JScrollPane(jTextAreanombre_sub_grupoActivosFijosPorGrupos);
		jscrollPanenombre_sub_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoActivosFijosPorGrupos = new JLabelMe();
		this.jLabelcodigo_detalle_grupoActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoActivosFijosPorGrupos.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setEnabled(false);
		jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoActivosFijosPorGrupos = new JLabelMe();
		this.jLabelnombre_detalle_grupoActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoActivosFijosPorGrupos.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelnombre_detalle_grupoActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextAreanombre_detalle_grupoActivosFijosPorGrupos= new JTextAreaMe();
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setEnabled(false);
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setLineWrap(true);
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoActivosFijosPorGrupos = new JScrollPane(jTextAreanombre_detalle_grupoActivosFijosPorGrupos);
		jscrollPanenombre_detalle_grupoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelclaveActivosFijosPorGrupos = new JLabelMe();
		this.jLabelclaveActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveActivosFijosPorGrupos.setToolTipText("Clave");
		this.jLabelclaveActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelclaveActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextFieldclaveActivosFijosPorGrupos= new JTextFieldMe();

		jTextFieldclaveActivosFijosPorGrupos.setEnabled(false);
		jTextFieldclaveActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonclaveActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonclaveActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelnombreActivosFijosPorGrupos = new JLabelMe();
		this.jLabelnombreActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreActivosFijosPorGrupos.setToolTipText("Nombre");
		this.jLabelnombreActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelnombreActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextAreanombreActivosFijosPorGrupos= new JTextAreaMe();
		jTextAreanombreActivosFijosPorGrupos.setEnabled(false);
		jTextAreanombreActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreActivosFijosPorGrupos.setLineWrap(true);
		jTextAreanombreActivosFijosPorGrupos.setWrapStyleWord(true);
		jTextAreanombreActivosFijosPorGrupos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreActivosFijosPorGrupos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreActivosFijosPorGrupos = new JScrollPane(jTextAreanombreActivosFijosPorGrupos);
		jscrollPanenombreActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonnombreActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonnombreActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraActivosFijosPorGrupos = new JLabelMe();
		this.jLabelfecha_compraActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraActivosFijosPorGrupos.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelfecha_compraActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		//jFormattedTextFieldfecha_compraActivosFijosPorGrupos= new JFormattedTextFieldMe();

		jDateChooserfecha_compraActivosFijosPorGrupos= new JDateChooser();
		jDateChooserfecha_compraActivosFijosPorGrupos.setEnabled(false);
		jDateChooserfecha_compraActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraActivosFijosPorGrupos.setDate(new Date());
		jDateChooserfecha_compraActivosFijosPorGrupos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraActivosFijosPorGrupos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonfecha_compraActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonfecha_compraActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilActivosFijosPorGrupos = new JLabelMe();
		this.jLabelvida_utilActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilActivosFijosPorGrupos.setToolTipText("Va Util");
		this.jLabelvida_utilActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelvida_utilActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextFieldvida_utilActivosFijosPorGrupos= new JTextFieldMe();
		jTextFieldvida_utilActivosFijosPorGrupos.setEnabled(false);
		jTextFieldvida_utilActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilActivosFijosPorGrupos.setText("0.0");

		this.jButtonvida_utilActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonvida_utilActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonvida_utilActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraActivosFijosPorGrupos = new JLabelMe();
		this.jLabelcosto_de_compraActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraActivosFijosPorGrupos.setToolTipText("Costo De Compra");
		this.jLabelcosto_de_compraActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcosto_de_compraActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcosto_de_compraActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelcosto_de_compraActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextFieldcosto_de_compraActivosFijosPorGrupos= new JTextFieldMe();
		jTextFieldcosto_de_compraActivosFijosPorGrupos.setEnabled(false);
		jTextFieldcosto_de_compraActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraActivosFijosPorGrupos.setText("0.0");

		this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.setText("U");
		this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelmarcaActivosFijosPorGrupos = new JLabelMe();
		this.jLabelmarcaActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA+" : *");
		this.jLabelmarcaActivosFijosPorGrupos.setToolTipText("Marca");
		this.jLabelmarcaActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmarcaActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmarcaActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmarcaActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelmarcaActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextAreamarcaActivosFijosPorGrupos= new JTextAreaMe();
		jTextAreamarcaActivosFijosPorGrupos.setEnabled(false);
		jTextAreamarcaActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaActivosFijosPorGrupos.setLineWrap(true);
		jTextAreamarcaActivosFijosPorGrupos.setWrapStyleWord(true);
		jTextAreamarcaActivosFijosPorGrupos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamarcaActivosFijosPorGrupos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamarcaActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemarcaActivosFijosPorGrupos = new JScrollPane(jTextAreamarcaActivosFijosPorGrupos);
		jscrollPanemarcaActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmarcaActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonmarcaActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmarcaActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonmarcaActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmarcaActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmarcaActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamarcaActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamarcaActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"marcaActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmarcaActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelmodeloActivosFijosPorGrupos = new JLabelMe();
		this.jLabelmodeloActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO+" : *");
		this.jLabelmodeloActivosFijosPorGrupos.setToolTipText("Modelo");
		this.jLabelmodeloActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmodeloActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmodeloActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmodeloActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelmodeloActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextAreamodeloActivosFijosPorGrupos= new JTextAreaMe();
		jTextAreamodeloActivosFijosPorGrupos.setEnabled(false);
		jTextAreamodeloActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloActivosFijosPorGrupos.setLineWrap(true);
		jTextAreamodeloActivosFijosPorGrupos.setWrapStyleWord(true);
		jTextAreamodeloActivosFijosPorGrupos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamodeloActivosFijosPorGrupos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamodeloActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemodeloActivosFijosPorGrupos = new JScrollPane(jTextAreamodeloActivosFijosPorGrupos);
		jscrollPanemodeloActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmodeloActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonmodeloActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmodeloActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonmodeloActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmodeloActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmodeloActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamodeloActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamodeloActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modeloActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmodeloActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelcolorActivosFijosPorGrupos = new JLabelMe();
		this.jLabelcolorActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR+" : *");
		this.jLabelcolorActivosFijosPorGrupos.setToolTipText("Color");
		this.jLabelcolorActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcolorActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcolorActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcolorActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcolorActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcolorActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelcolorActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextFieldcolorActivosFijosPorGrupos= new JTextFieldMe();

		jTextFieldcolorActivosFijosPorGrupos.setEnabled(false);
		jTextFieldcolorActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcolorActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcolorActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcolorActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncolorActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtoncolorActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncolorActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncolorActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncolorActivosFijosPorGruposBusqueda.setText("U");
		this.jButtoncolorActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncolorActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncolorActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcolorActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcolorActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"colorActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncolorActivosFijosPorGruposBusqueda.setVisible(false);		}


					
		this.jLabelserieActivosFijosPorGrupos = new JLabelMe();
		this.jLabelserieActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE+" : *");
		this.jLabelserieActivosFijosPorGrupos.setToolTipText("Serie");
		this.jLabelserieActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelserieActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jTextFieldserieActivosFijosPorGrupos= new JTextFieldMe();

		jTextFieldserieActivosFijosPorGrupos.setEnabled(false);
		jTextFieldserieActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonserieActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonserieActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieActivosFijosPorGruposBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysActivosFijosPorGrupos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaActivosFijosPorGrupos = new JLabelMe();
		this.jLabelid_empresaActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaActivosFijosPorGrupos.setToolTipText("Empresa");
		this.jLabelid_empresaActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelid_empresaActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jComboBoxid_empresaActivosFijosPorGrupos= new JComboBoxMe();
		jComboBoxid_empresaActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaActivosFijosPorGrupos.setEnabled(false);

		this.jButtonid_empresaActivosFijosPorGrupos= new JButtonMe();
		this.jButtonid_empresaActivosFijosPorGrupos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActivosFijosPorGrupos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActivosFijosPorGrupos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActivosFijosPorGrupos.setText("Buscar");
		this.jButtonid_empresaActivosFijosPorGrupos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaActivosFijosPorGrupos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActivosFijosPorGrupos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActivosFijosPorGrupos"));

		this.jButtonid_empresaActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonid_empresaActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonid_empresaActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaActivosFijosPorGruposBusqueda.setVisible(false);		}

		this.jButtonid_empresaActivosFijosPorGruposUpdate= new JButtonMe();
		this.jButtonid_empresaActivosFijosPorGruposUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActivosFijosPorGruposUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActivosFijosPorGruposUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaActivosFijosPorGruposUpdate.setText("U");
		this.jButtonid_empresaActivosFijosPorGruposUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaActivosFijosPorGruposUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActivosFijosPorGruposUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActivosFijosPorGruposUpdate"));



					
		this.jLabelid_sucursalActivosFijosPorGrupos = new JLabelMe();
		this.jLabelid_sucursalActivosFijosPorGrupos.setText(""+ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalActivosFijosPorGrupos.setToolTipText("Sucursal");
		this.jLabelid_sucursalActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalActivosFijosPorGrupos.setToolTipText(ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		this.jPanelid_sucursalActivosFijosPorGrupos.setLayout(this.gridaBagLayoutActivosFijosPorGrupos);


		jComboBoxid_sucursalActivosFijosPorGrupos= new JComboBoxMe();
		jComboBoxid_sucursalActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalActivosFijosPorGrupos.setEnabled(false);

		this.jButtonid_sucursalActivosFijosPorGrupos= new JButtonMe();
		this.jButtonid_sucursalActivosFijosPorGrupos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalActivosFijosPorGrupos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalActivosFijosPorGrupos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalActivosFijosPorGrupos.setText("Buscar");
		this.jButtonid_sucursalActivosFijosPorGrupos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalActivosFijosPorGrupos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalActivosFijosPorGrupos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalActivosFijosPorGrupos"));

		this.jButtonid_sucursalActivosFijosPorGruposBusqueda= new JButtonMe();
		this.jButtonid_sucursalActivosFijosPorGruposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalActivosFijosPorGruposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalActivosFijosPorGruposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalActivosFijosPorGruposBusqueda.setText("U");
		this.jButtonid_sucursalActivosFijosPorGruposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalActivosFijosPorGruposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalActivosFijosPorGruposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalActivosFijosPorGruposBusqueda"));

		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalActivosFijosPorGruposBusqueda.setVisible(false);		}

		this.jButtonid_sucursalActivosFijosPorGruposUpdate= new JButtonMe();
		this.jButtonid_sucursalActivosFijosPorGruposUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalActivosFijosPorGruposUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalActivosFijosPorGruposUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalActivosFijosPorGruposUpdate.setText("U");
		this.jButtonid_sucursalActivosFijosPorGruposUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalActivosFijosPorGruposUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalActivosFijosPorGruposUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalActivosFijosPorGruposUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleActivosFijosPorGrupos = new ActivosFijosPorGruposBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Activos Fijos Por Grupos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutActivosFijosPorGrupos= new GridBagLayout();
		

		
		String sToolTipActivosFijosPorGrupos="";
		sToolTipActivosFijosPorGrupos=ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipActivosFijosPorGrupos+="(ActivosFijos.ActivosFijosPorGrupos)";
		}
		
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			sToolTipActivosFijosPorGrupos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoActivosFijosPorGrupos = new JButtonMe();
		this.jButtonModificarActivosFijosPorGrupos = new JButtonMe();
        this.jButtonActualizarActivosFijosPorGrupos = new JButtonMe();
        this.jButtonEliminarActivosFijosPorGrupos = new JButtonMe();
        this.jButtonCancelarActivosFijosPorGrupos = new JButtonMe();
        this.jButtonGuardarCambiosActivosFijosPorGrupos = new JButtonMe();
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos = new JButtonMe();
		this.jButtonCerrarActivosFijosPorGrupos = new JButtonMe();
		
		this.jScrollPanelDatosActivosFijosPorGrupos = new JScrollPane();   
        this.jScrollPanelDatosEdicionActivosFijosPorGrupos = new JScrollPane();
		this.jScrollPanelDatosGeneralActivosFijosPorGrupos = new JScrollPane();
				
		
		
		this.jPanelCamposActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Activos Fijos Por Grupos";
		
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Gruposes" + this.sPath));
		} else {
			this.jScrollPanelDatosActivosFijosPorGrupos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposActivosFijosPorGrupos.setName("jPanelCamposActivosFijosPorGrupos"); 

		this.jPanelCamposOcultosActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosActivosFijosPorGrupos.setName("jPanelCamposOcultosActivosFijosPorGrupos"); 

        this.jPanelAccionesActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesActivosFijosPorGrupos.setToolTipText("Acciones");
        this.jPanelAccionesActivosFijosPorGrupos.setName("Acciones"); 

		this.jPanelAccionesFormularioActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioActivosFijosPorGrupos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioActivosFijosPorGrupos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoActivosFijosPorGrupos.setText("Nuevo");
		this.jButtonModificarActivosFijosPorGrupos.setText("Editar");
        this.jButtonActualizarActivosFijosPorGrupos.setText("Actualizar");
        this.jButtonEliminarActivosFijosPorGrupos.setText("Eliminar");
        this.jButtonCancelarActivosFijosPorGrupos.setText("Cancelar");
        this.jButtonGuardarCambiosActivosFijosPorGrupos.setText("Guardar");
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.setText("Guardar");
		this.jButtonCerrarActivosFijosPorGrupos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoActivosFijosPorGrupos,"nuevo_button","Nuevo",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarActivosFijosPorGrupos,"modificar_button","Editar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarActivosFijosPorGrupos,"actualizar_button","Actualizar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarActivosFijosPorGrupos,"eliminar_button","Eliminar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarActivosFijosPorGrupos,"cancelar_button","Cancelar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosActivosFijosPorGrupos,"guardarcambios_button","Guardar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaActivosFijosPorGrupos,"guardarcambiostabla_button","Guardar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarActivosFijosPorGrupos,"cerrar_button","Salir",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoActivosFijosPorGrupos.setToolTipText("Nuevo"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarActivosFijosPorGrupos.setToolTipText("Editar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarActivosFijosPorGrupos.setToolTipText("Actualizar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarActivosFijosPorGrupos.setToolTipText("Eliminar)"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarActivosFijosPorGrupos.setToolTipText("Cancelar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosActivosFijosPorGrupos.setToolTipText("Guardar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.setToolTipText("Guardar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarActivosFijosPorGrupos.setToolTipText("Salir"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoActivosFijosPorGrupos";
		inputMap = this.jButtonNuevoActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoActivosFijosPorGrupos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoActivosFijosPorGrupos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarActivosFijosPorGrupos";
		inputMap = this.jButtonActualizarActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarActivosFijosPorGrupos"));
		
		//ELIMINAR
		sMapKey = "EliminarActivosFijosPorGrupos";
		inputMap = this.jButtonEliminarActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarActivosFijosPorGrupos"));
		
		//CANCELAR	
		sMapKey = "CancelarActivosFijosPorGrupos";
		inputMap = this.jButtonCancelarActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarActivosFijosPorGrupos"));
		
		//CERRAR		
		sMapKey = "CerrarActivosFijosPorGrupos";
		inputMap = this.jButtonCerrarActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarActivosFijosPorGrupos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaActivosFijosPorGrupos";
		inputMap = this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaActivosFijosPorGrupos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoActivosFijosPorGrupos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoActivosFijosPorGrupos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoActivosFijosPorGrupos.setToolTipText("Nuevo ActivosFijosPorGrupos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarActivosFijosPorGrupos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarActivosFijosPorGrupos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarActivosFijosPorGrupos.setToolTipText("Sin Cerrar Ventana ActivosFijosPorGrupos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeActivosFijosPorGrupos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeActivosFijosPorGrupos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeActivosFijosPorGrupos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesActivosFijosPorGrupos.setText("Accion");
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesActivosFijosPorGrupos = new JLabelMe();
		
		this.jLabelAccionesActivosFijosPorGrupos.setText("Acciones");		
		this.jLabelAccionesActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposActivosFijosPorGrupos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysActivosFijosPorGrupos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesActivosFijosPorGrupos=new JTabbedPane();
		this.jTabbedPaneRelacionesActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposActivosFijosPorGrupos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosActivosFijosPorGrupos = new GridBagLayout();
		
		this.jPanelCamposActivosFijosPorGrupos.setLayout(gridaBagLayoutCamposActivosFijosPorGrupos);
		this.jPanelCamposOcultosActivosFijosPorGrupos.setLayout(gridaBagLayoutCamposOcultosActivosFijosPorGrupos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidActivosFijosPorGrupos.add(jLabelIdActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidActivosFijosPorGrupos.add(jLabelidActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaActivosFijosPorGrupos.add(jLabelid_empresaActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaActivosFijosPorGrupos.add(jButtonid_empresaActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 3;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaActivosFijosPorGrupos.add(jButtonid_empresaActivosFijosPorGruposUpdate, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaActivosFijosPorGrupos.add(jComboBoxid_empresaActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalActivosFijosPorGrupos.add(jLabelid_sucursalActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalActivosFijosPorGrupos.add(jButtonid_sucursalActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 3;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalActivosFijosPorGrupos.add(jButtonid_sucursalActivosFijosPorGruposUpdate, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalActivosFijosPorGrupos.add(jComboBoxid_sucursalActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sub_grupoActivosFijosPorGrupos.add(jLabelcodigo_sub_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sub_grupoActivosFijosPorGrupos.add(jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sub_grupoActivosFijosPorGrupos.add(jTextFieldcodigo_sub_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoActivosFijosPorGrupos.add(jLabelnombre_sub_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoActivosFijosPorGrupos.add(jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoActivosFijosPorGrupos.add(jscrollPanenombre_sub_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoActivosFijosPorGrupos.add(jLabelcodigo_detalle_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoActivosFijosPorGrupos.add(jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoActivosFijosPorGrupos.add(jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoActivosFijosPorGrupos.add(jLabelnombre_detalle_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoActivosFijosPorGrupos.add(jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoActivosFijosPorGrupos.add(jscrollPanenombre_detalle_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveActivosFijosPorGrupos.add(jLabelclaveActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveActivosFijosPorGrupos.add(jButtonclaveActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveActivosFijosPorGrupos.add(jTextFieldclaveActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreActivosFijosPorGrupos.add(jLabelnombreActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreActivosFijosPorGrupos.add(jButtonnombreActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreActivosFijosPorGrupos.add(jscrollPanenombreActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraActivosFijosPorGrupos.add(jLabelfecha_compraActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraActivosFijosPorGrupos.add(jButtonfecha_compraActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraActivosFijosPorGrupos.add(jDateChooserfecha_compraActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilActivosFijosPorGrupos.add(jLabelvida_utilActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilActivosFijosPorGrupos.add(jButtonvida_utilActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilActivosFijosPorGrupos.add(jTextFieldvida_utilActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraActivosFijosPorGrupos.add(jLabelcosto_de_compraActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraActivosFijosPorGrupos.add(jButtoncosto_de_compraActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraActivosFijosPorGrupos.add(jTextFieldcosto_de_compraActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmarcaActivosFijosPorGrupos.add(jLabelmarcaActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelmarcaActivosFijosPorGrupos.add(jButtonmarcaActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmarcaActivosFijosPorGrupos.add(jscrollPanemarcaActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmodeloActivosFijosPorGrupos.add(jLabelmodeloActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelmodeloActivosFijosPorGrupos.add(jButtonmodeloActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmodeloActivosFijosPorGrupos.add(jscrollPanemodeloActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcolorActivosFijosPorGrupos.add(jLabelcolorActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcolorActivosFijosPorGrupos.add(jButtoncolorActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcolorActivosFijosPorGrupos.add(jTextFieldcolorActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieActivosFijosPorGrupos.add(jLabelserieActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieActivosFijosPorGrupos.add(jButtonserieActivosFijosPorGruposBusqueda, this.gridBagConstraintsActivosFijosPorGrupos);
	}

	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieActivosFijosPorGrupos.add(jTextFieldserieActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelidActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelcodigo_sub_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelnombre_sub_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelcodigo_detalle_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelnombre_detalle_grupoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelclaveActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelnombreActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelfecha_compraActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelvida_utilActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelcosto_de_compraActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelmarcaActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelmodeloActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelcolorActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorGrupos.add(this.jPanelserieActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposActivosFijosPorGrupos % 2==0) {
		iXPanelCamposActivosFijosPorGrupos=0;
		iYPanelCamposActivosFijosPorGrupos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposOcultosActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposOcultosActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosActivosFijosPorGrupos.add(this.jPanelid_empresaActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposOcultosActivosFijosPorGrupos % 2==0) {
		iXPanelCamposOcultosActivosFijosPorGrupos=0;
		iYPanelCamposOcultosActivosFijosPorGrupos++;
	}
	this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorGrupos.gridy = iYPanelCamposOcultosActivosFijosPorGrupos;
	this.gridBagConstraintsActivosFijosPorGrupos.gridx = iXPanelCamposOcultosActivosFijosPorGrupos++;
	this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorGrupos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosActivosFijosPorGrupos.add(this.jPanelid_sucursalActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);



	if(iXPanelCamposOcultosActivosFijosPorGrupos % 2==0) {
		iXPanelCamposOcultosActivosFijosPorGrupos=0;
		iYPanelCamposOcultosActivosFijosPorGrupos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesActivosFijosPorGrupos= new GridBagLayout();
		this.jPanelAccionesActivosFijosPorGrupos.setLayout(gridaBagLayoutAccionesActivosFijosPorGrupos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioActivosFijosPorGrupos= new GridBagLayout();
		this.jPanelAccionesFormularioActivosFijosPorGrupos.setLayout(gridaBagLayoutAccionesFormularioActivosFijosPorGrupos);
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioActivosFijosPorGrupos.add(this.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccion++;
			
		this.jPanelAccionesActivosFijosPorGrupos.add(this.jButtonModificarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);							

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx =iPosXAccion++;
			
		this.jPanelAccionesActivosFijosPorGrupos.add(this.jButtonEliminarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
			
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccion++;
		
		this.jPanelAccionesActivosFijosPorGrupos.add(this.jButtonActualizarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccion++;
		
		this.jPanelAccionesActivosFijosPorGrupos.add(this.jButtonGuardarCambiosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);	
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx =iPosXAccion++;
		
		this.jPanelAccionesActivosFijosPorGrupos.add(this.jButtonCancelarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutActivosFijosPorGrupos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();						
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;		
			//this.gridBagConstraintsActivosFijosPorGrupos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx =0;
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsActivosFijosPorGrupos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleActivosFijosPorGrupos = new ActivosFijosPorGruposBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Activos Fijos Por Grupos DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Activos Fijos Por Grupos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Activos Fijos Por Grupos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ActivosFijosPorGruposModel activosfijosporgruposModel=new ActivosFijosPorGruposModel(this);
			
			//SI USARA CLASE INTERNA
			//ActivosFijosPorGruposModel.ActivosFijosPorGruposFocusTraversalPolicy activosfijosporgruposFocusTraversalPolicy = activosfijosporgruposModel.new ActivosFijosPorGruposFocusTraversalPolicy(this);
			
			//activosfijosporgruposFocusTraversalPolicy.setactivosfijosporgruposJInternalFrame(this);
			
			this.setFocusTraversalPolicy(activosfijosporgruposModel);
			
			
			this.jContentPaneDetalleActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleActivosFijosPorGrupos = new GridBagLayout();	
			this.jContentPaneDetalleActivosFijosPorGrupos.setLayout(gridaBagLayoutDetalleActivosFijosPorGrupos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosActivosFijosPorGrupos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
				this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
					
				
				this.jContentPaneDetalleActivosFijosPorGrupos.add(jTtoolBarDetalleActivosFijosPorGrupos, gridBagConstraintsActivosFijosPorGrupos);								
				
}
			
			this.jScrollPanelDatosEdicionActivosFijosPorGrupos=   new JScrollPane(jContentPaneDetalleActivosFijosPorGrupos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralActivosFijosPorGrupos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	        
			this.jContentPaneDetalleActivosFijosPorGrupos.add(jPanelCamposActivosFijosPorGrupos, gridBagConstraintsActivosFijosPorGrupos);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						//&& activosfijosporgruposSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsActivosFijosPorGrupos= new GridBagConstraints();
						this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
						this.jContentPaneDetalleActivosFijosPorGrupos.add(this.jTabbedPaneRelacionesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesActivosFijosPorGrupos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosActivosFijosPorGrupos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
					this.gridBagConstraintsActivosFijosPorGrupos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
					
				
					this.jContentPaneDetalleActivosFijosPorGrupos.add(jPanelCamposOcultosActivosFijosPorGrupos, gridBagConstraintsActivosFijosPorGrupos);
				
					this.jPanelCamposOcultosActivosFijosPorGrupos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	        this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleActivosFijosPorGrupos.add(this.jPanelAccionesFormularioActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);							
			
			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
	        this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
	        
			
			this.jContentPaneDetalleActivosFijosPorGrupos.add(this.jPanelAccionesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionActivosFijosPorGrupos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionActivosFijosPorGrupos=   new JScrollPane(this.jPanelCamposActivosFijosPorGrupos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsActivosFijosPorGrupos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			
			
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
			
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralActivosFijosPorGrupos;//jContentPane;
		
		return jScrollPanelDatosEdicionActivosFijosPorGrupos;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
