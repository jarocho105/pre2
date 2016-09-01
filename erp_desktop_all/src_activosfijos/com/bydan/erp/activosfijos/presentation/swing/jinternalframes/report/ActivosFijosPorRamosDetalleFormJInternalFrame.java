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
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.activosfijos.util.report.ActivosFijosPorRamosConstantesFunciones;

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
public class ActivosFijosPorRamosDetalleFormJInternalFrame extends ActivosFijosPorRamosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleActivosFijosPorRamos;
	
	protected JMenuBar jmenuBarDetalleActivosFijosPorRamos;
	
	protected JMenu jmenuDetalleActivosFijosPorRamos;
	protected JMenu jmenuDetalleArchivoActivosFijosPorRamos;
	protected JMenu jmenuDetalleAccionesActivosFijosPorRamos;
	protected JMenu jmenuDetalleDatosActivosFijosPorRamos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutActivosFijosPorRamos;	
	protected GridBagConstraints gridBagConstraintsActivosFijosPorRamos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ActivosFijosPorRamosBeanSwingJInternalFrameAdditional jInternalFrameDetalleActivosFijosPorRamos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoRamoActivoFijoBeanSwingJInternalFrame tiporamoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporamoactivofijo="";
	
	public ActivosFijosPorRamosSessionBean activosfijosporramosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean;	
	
	public ActivosFijosPorRamosLogic activosfijosporramosLogic;
	
	public JScrollPane jScrollPanelDatosActivosFijosPorRamos;
	public JScrollPane jScrollPanelDatosEdicionActivosFijosPorRamos;
	public JScrollPane jScrollPanelDatosGeneralActivosFijosPorRamos;
	
	protected JPanel jPanelCamposActivosFijosPorRamos;    
	protected JPanel jPanelCamposOcultosActivosFijosPorRamos;    	
	protected JPanel jPanelAccionesActivosFijosPorRamos;
	protected JPanel jPanelAccionesFormularioActivosFijosPorRamos;
    
	
	
	protected Integer iXPanelCamposActivosFijosPorRamos=0;
	protected Integer iYPanelCamposActivosFijosPorRamos=0;
	
	protected Integer iXPanelCamposOcultosActivosFijosPorRamos=0;
	protected Integer iYPanelCamposOcultosActivosFijosPorRamos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoActivosFijosPorRamos;
	public JButton jButtonModificarActivosFijosPorRamos;
	public JButton jButtonActualizarActivosFijosPorRamos;
    public JButton jButtonEliminarActivosFijosPorRamos;
	public JButton jButtonCancelarActivosFijosPorRamos;
    public JButton jButtonGuardarCambiosActivosFijosPorRamos;
	public JButton jButtonGuardarCambiosTablaActivosFijosPorRamos;
	protected JButton jButtonCerrarActivosFijosPorRamos;
	
	
	protected JButton jButtonProcesarInformacionActivosFijosPorRamos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoActivosFijosPorRamos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarActivosFijosPorRamos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeActivosFijosPorRamos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarActivosFijosPorRamos;
	protected JButton jButtonModificarToolBarActivosFijosPorRamos;
	protected JButton jButtonActualizarToolBarActivosFijosPorRamos;
    protected JButton jButtonEliminarToolBarActivosFijosPorRamos;
	protected JButton jButtonCancelarToolBarActivosFijosPorRamos;
    protected JButton jButtonGuardarCambiosToolBarActivosFijosPorRamos;
	protected JButton jButtonGuardarCambiosTablaToolBarActivosFijosPorRamos;
	protected JButton jButtonMostrarOcultarTablaToolBarActivosFijosPorRamos;
	protected JButton jButtonCerrarToolBarActivosFijosPorRamos;
	
	protected JButton jButtonProcesarInformacionToolBarActivosFijosPorRamos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoActivosFijosPorRamos;
	protected JMenuItem jMenuItemModificarActivosFijosPorRamos;
	protected JMenuItem jMenuItemActualizarActivosFijosPorRamos;
    protected JMenuItem jMenuItemEliminarActivosFijosPorRamos;
	protected JMenuItem jMenuItemCancelarActivosFijosPorRamos;
    protected JMenuItem jMenuItemGuardarCambiosActivosFijosPorRamos;
	protected JMenuItem jMenuItemGuardarCambiosTablaActivosFijosPorRamos;
	protected JMenuItem jMenuItemCerrarActivosFijosPorRamos;
	protected JMenuItem jMenuItemDetalleCerrarActivosFijosPorRamos;
	protected JMenuItem jMenuItemDetalleMostarOcultarActivosFijosPorRamos;
	
	protected JMenuItem jMenuItemProcesarInformacionActivosFijosPorRamos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosActivosFijosPorRamos;
	protected JMenuItem jMenuItemMostrarOcultarActivosFijosPorRamos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesActivosFijosPorRamos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesActivosFijosPorRamos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioActivosFijosPorRamos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidActivosFijosPorRamos;
	public JLabel jLabelIdActivosFijosPorRamos;
	public JLabel jLabelidActivosFijosPorRamos;
	public JButton jButtonidActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoActivosFijosPorRamos;
	public JLabel jLabelnombre_sub_grupoActivosFijosPorRamos;
	public JTextArea jTextAreanombre_sub_grupoActivosFijosPorRamos;
	public JScrollPane jscrollPanenombre_sub_grupoActivosFijosPorRamos;
	public JButton jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoActivosFijosPorRamos;
	public JLabel jLabelnombre_detalle_grupoActivosFijosPorRamos;
	public JTextArea jTextAreanombre_detalle_grupoActivosFijosPorRamos;
	public JScrollPane jscrollPanenombre_detalle_grupoActivosFijosPorRamos;
	public JButton jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelclaveActivosFijosPorRamos;
	public JLabel jLabelclaveActivosFijosPorRamos;
	public JTextField jTextFieldclaveActivosFijosPorRamos;
	public JButton jButtonclaveActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelnombreActivosFijosPorRamos;
	public JLabel jLabelnombreActivosFijosPorRamos;
	public JTextArea jTextAreanombreActivosFijosPorRamos;
	public JScrollPane jscrollPanenombreActivosFijosPorRamos;
	public JButton jButtonnombreActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraActivosFijosPorRamos;
	public JLabel jLabelfecha_compraActivosFijosPorRamos;
	//public JFormattedTextField jDateChooserfecha_compraActivosFijosPorRamos;

	public JDateChooser jDateChooserfecha_compraActivosFijosPorRamos;
	public JButton jButtonfecha_compraActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilActivosFijosPorRamos;
	public JLabel jLabelvida_utilActivosFijosPorRamos;
	public JTextField jTextFieldvida_utilActivosFijosPorRamos;
	public JButton jButtonvida_utilActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraActivosFijosPorRamos;
	public JLabel jLabelcosto_de_compraActivosFijosPorRamos;
	public JTextField jTextFieldcosto_de_compraActivosFijosPorRamos;
	public JButton jButtoncosto_de_compraActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelmarcaActivosFijosPorRamos;
	public JLabel jLabelmarcaActivosFijosPorRamos;
	public JTextArea jTextAreamarcaActivosFijosPorRamos;
	public JScrollPane jscrollPanemarcaActivosFijosPorRamos;
	public JButton jButtonmarcaActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelmodeloActivosFijosPorRamos;
	public JLabel jLabelmodeloActivosFijosPorRamos;
	public JTextArea jTextAreamodeloActivosFijosPorRamos;
	public JScrollPane jscrollPanemodeloActivosFijosPorRamos;
	public JButton jButtonmodeloActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_matriculaActivosFijosPorRamos;
	public JLabel jLabelnumero_matriculaActivosFijosPorRamos;
	public JTextField jTextFieldnumero_matriculaActivosFijosPorRamos;
	public JButton jButtonnumero_matriculaActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_motorActivosFijosPorRamos;
	public JLabel jLabelnumero_motorActivosFijosPorRamos;
	public JTextField jTextFieldnumero_motorActivosFijosPorRamos;
	public JButton jButtonnumero_motorActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chasisActivosFijosPorRamos;
	public JLabel jLabelnumero_chasisActivosFijosPorRamos;
	public JTextField jTextFieldnumero_chasisActivosFijosPorRamos;
	public JButton jButtonnumero_chasisActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_placaActivosFijosPorRamos;
	public JLabel jLabelnumero_placaActivosFijosPorRamos;
	public JTextField jTextFieldnumero_placaActivosFijosPorRamos;
	public JButton jButtonnumero_placaActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_comercialActivosFijosPorRamos;
	public JLabel jLabelvalor_comercialActivosFijosPorRamos;
	public JTextField jTextFieldvalor_comercialActivosFijosPorRamos;
	public JButton jButtonvalor_comercialActivosFijosPorRamosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaActivosFijosPorRamos;
	public JLabel jLabelid_empresaActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaActivosFijosPorRamos;
	public JButton jButtonid_empresaActivosFijosPorRamos= new JButtonMe();
	public JButton jButtonid_empresaActivosFijosPorRamosUpdate= new JButtonMe();
	public JButton jButtonid_empresaActivosFijosPorRamosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos;
	public JLabel jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos;
	public JButton jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos= new JButtonMe();
	public JButton jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesActivosFijosPorRamos;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ActivosFijosPorRamosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposActivosFijosPorRamos=new JPanel();
				this.jPanelAccionesFormularioActivosFijosPorRamos=new JPanel();
				this.jmenuBarDetalleActivosFijosPorRamos=new JMenuBar();
				this.jTtoolBarDetalleActivosFijosPorRamos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorRamosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ActivosFijosPorRamosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorRamosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorRamosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorRamosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarActivosFijosPorRamos() {
		return this.jButtonActualizarToolBarActivosFijosPorRamos;
	}
	
	public JButton getjButtonEliminarToolBarActivosFijosPorRamos() {
		return this.jButtonEliminarToolBarActivosFijosPorRamos;
	}
	
	public JButton getjButtonCancelarToolBarActivosFijosPorRamos() {
		return this.jButtonCancelarToolBarActivosFijosPorRamos;
	}		
	
	public JButton getjButtonProcesarInformacionActivosFijosPorRamos() {
		return this.jButtonProcesarInformacionActivosFijosPorRamos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionActivosFijosPorRamos)	{
		this.jButtonProcesarInformacionActivosFijosPorRamos = jButtonProcesarInformacionActivosFijosPorRamos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesActivosFijosPorRamos() {
		return this.jComboBoxTiposAccionesActivosFijosPorRamos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesActivosFijosPorRamos(
			JComboBox jComboBoxTiposRelacionesActivosFijosPorRamos) {
		this.jComboBoxTiposRelacionesActivosFijosPorRamos = jComboBoxTiposRelacionesActivosFijosPorRamos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesActivosFijosPorRamos(
			JComboBox jComboBoxTiposAccionesActivosFijosPorRamos) {
		this.jComboBoxTiposAccionesActivosFijosPorRamos = jComboBoxTiposAccionesActivosFijosPorRamos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioActivosFijosPorRamos() {
		return this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioActivosFijosPorRamos(
			JComboBox jComboBoxTiposAccionesFormularioActivosFijosPorRamos) {
		this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos = jComboBoxTiposAccionesFormularioActivosFijosPorRamos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.activosfijosporramosSessionBean=new ActivosFijosPorRamosSessionBean();
		
		this.activosfijosporramosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosporramosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.activosfijosporramosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ActivosFijosPorRamosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ActivosFijosPorRamosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ActivosFijosPorRamosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Activos Fijos Por Ramos MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
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
	
		ActivosFijosPorRamosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleActivosFijosPorRamos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarActivosFijosPorRamos=new JButtonMe();
				this.jButtonModificarToolBarActivosFijosPorRamos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarActivosFijosPorRamos,this.jTtoolBarDetalleActivosFijosPorRamos,
							"actualizar","actualizar","Actualizar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarActivosFijosPorRamos,this.jTtoolBarDetalleActivosFijosPorRamos,
							"eliminar","eliminar","Eliminar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarActivosFijosPorRamos,this.jTtoolBarDetalleActivosFijosPorRamos,
							"cancelar","cancelar","Cancelar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarActivosFijosPorRamos,this.jTtoolBarDetalleActivosFijosPorRamos,
							"guardarcambios","guardarcambios","Guardar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleActivosFijosPorRamos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleActivosFijosPorRamos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoActivosFijosPorRamos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesActivosFijosPorRamos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosActivosFijosPorRamos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoActivosFijosPorRamos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoActivosFijosPorRamos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoActivosFijosPorRamos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarActivosFijosPorRamos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarActivosFijosPorRamos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarActivosFijosPorRamos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarActivosFijosPorRamos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarActivosFijosPorRamos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarActivosFijosPorRamos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarActivosFijosPorRamos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarActivosFijosPorRamos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarActivosFijosPorRamos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarActivosFijosPorRamos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarActivosFijosPorRamos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarActivosFijosPorRamos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosActivosFijosPorRamos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosActivosFijosPorRamos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosActivosFijosPorRamos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarActivosFijosPorRamos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarActivosFijosPorRamos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarActivosFijosPorRamos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarActivosFijosPorRamos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarActivosFijosPorRamos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarActivosFijosPorRamos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarActivosFijosPorRamos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarActivosFijosPorRamos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarActivosFijosPorRamos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoActivosFijosPorRamos.add(this.jMenuItemDetalleCerrarActivosFijosPorRamos);
		
		this.jmenuDetalleAccionesActivosFijosPorRamos.add(this.jMenuItemActualizarActivosFijosPorRamos);
		this.jmenuDetalleAccionesActivosFijosPorRamos.add(this.jMenuItemEliminarActivosFijosPorRamos);
		this.jmenuDetalleAccionesActivosFijosPorRamos.add(this.jMenuItemCancelarActivosFijosPorRamos);		
		
		//this.jmenuDetalleDatosActivosFijosPorRamos.add(this.jMenuItemDetalleAbrirOrderByActivosFijosPorRamos);				
		this.jmenuDetalleDatosActivosFijosPorRamos.add(this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos);				
				
		//this.jmenuDetalleAccionesActivosFijosPorRamos.add(this.jMenuItemGuardarCambiosActivosFijosPorRamos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleActivosFijosPorRamos.add(this.jmenuDetalleArchivoActivosFijosPorRamos);		
		this.jmenuBarDetalleActivosFijosPorRamos.add(this.jmenuDetalleAccionesActivosFijosPorRamos);		
		this.jmenuBarDetalleActivosFijosPorRamos.add(this.jmenuDetalleDatosActivosFijosPorRamos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleActivosFijosPorRamos);				
	}
	
	
	public void inicializarElementosCamposActivosFijosPorRamos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdActivosFijosPorRamos = new JLabelMe();
		jLabelIdActivosFijosPorRamos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidActivosFijosPorRamos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutActivosFijosPorRamos= new GridBagLayout();

		this.jPanelidActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);

		jLabelidActivosFijosPorRamos = new JLabel();
		jLabelidActivosFijosPorRamos.setText("Id");

		jLabelidActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_sub_grupoActivosFijosPorRamos = new JLabelMe();
		this.jLabelnombre_sub_grupoActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoActivosFijosPorRamos.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelnombre_sub_grupoActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextAreanombre_sub_grupoActivosFijosPorRamos= new JTextAreaMe();
		jTextAreanombre_sub_grupoActivosFijosPorRamos.setEnabled(false);
		jTextAreanombre_sub_grupoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoActivosFijosPorRamos.setLineWrap(true);
		jTextAreanombre_sub_grupoActivosFijosPorRamos.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoActivosFijosPorRamos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoActivosFijosPorRamos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoActivosFijosPorRamos = new JScrollPane(jTextAreanombre_sub_grupoActivosFijosPorRamos);
		jscrollPanenombre_sub_grupoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoActivosFijosPorRamos = new JLabelMe();
		this.jLabelnombre_detalle_grupoActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoActivosFijosPorRamos.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelnombre_detalle_grupoActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextAreanombre_detalle_grupoActivosFijosPorRamos= new JTextAreaMe();
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.setEnabled(false);
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.setLineWrap(true);
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoActivosFijosPorRamos = new JScrollPane(jTextAreanombre_detalle_grupoActivosFijosPorRamos);
		jscrollPanenombre_detalle_grupoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelclaveActivosFijosPorRamos = new JLabelMe();
		this.jLabelclaveActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveActivosFijosPorRamos.setToolTipText("Clave");
		this.jLabelclaveActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelclaveActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextFieldclaveActivosFijosPorRamos= new JTextFieldMe();

		jTextFieldclaveActivosFijosPorRamos.setEnabled(false);
		jTextFieldclaveActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonclaveActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonclaveActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelnombreActivosFijosPorRamos = new JLabelMe();
		this.jLabelnombreActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreActivosFijosPorRamos.setToolTipText("Nombre");
		this.jLabelnombreActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelnombreActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextAreanombreActivosFijosPorRamos= new JTextAreaMe();
		jTextAreanombreActivosFijosPorRamos.setEnabled(false);
		jTextAreanombreActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreActivosFijosPorRamos.setLineWrap(true);
		jTextAreanombreActivosFijosPorRamos.setWrapStyleWord(true);
		jTextAreanombreActivosFijosPorRamos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreActivosFijosPorRamos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreActivosFijosPorRamos = new JScrollPane(jTextAreanombreActivosFijosPorRamos);
		jscrollPanenombreActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonnombreActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonnombreActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraActivosFijosPorRamos = new JLabelMe();
		this.jLabelfecha_compraActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraActivosFijosPorRamos.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelfecha_compraActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		//jFormattedTextFieldfecha_compraActivosFijosPorRamos= new JFormattedTextFieldMe();

		jDateChooserfecha_compraActivosFijosPorRamos= new JDateChooser();
		jDateChooserfecha_compraActivosFijosPorRamos.setEnabled(false);
		jDateChooserfecha_compraActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraActivosFijosPorRamos.setDate(new Date());
		jDateChooserfecha_compraActivosFijosPorRamos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraActivosFijosPorRamos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonfecha_compraActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonfecha_compraActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilActivosFijosPorRamos = new JLabelMe();
		this.jLabelvida_utilActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilActivosFijosPorRamos.setToolTipText("Va Util");
		this.jLabelvida_utilActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelvida_utilActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextFieldvida_utilActivosFijosPorRamos= new JTextFieldMe();
		jTextFieldvida_utilActivosFijosPorRamos.setEnabled(false);
		jTextFieldvida_utilActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilActivosFijosPorRamos.setText("0.0");

		this.jButtonvida_utilActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonvida_utilActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonvida_utilActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraActivosFijosPorRamos = new JLabelMe();
		this.jLabelcosto_de_compraActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraActivosFijosPorRamos.setToolTipText("Costo Compra");
		this.jLabelcosto_de_compraActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelcosto_de_compraActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextFieldcosto_de_compraActivosFijosPorRamos= new JTextFieldMe();
		jTextFieldcosto_de_compraActivosFijosPorRamos.setEnabled(false);
		jTextFieldcosto_de_compraActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraActivosFijosPorRamos.setText("0.0");

		this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.setText("U");
		this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelmarcaActivosFijosPorRamos = new JLabelMe();
		this.jLabelmarcaActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA+" : *");
		this.jLabelmarcaActivosFijosPorRamos.setToolTipText("Marca");
		this.jLabelmarcaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmarcaActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmarcaActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmarcaActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_MARCA);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelmarcaActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextAreamarcaActivosFijosPorRamos= new JTextAreaMe();
		jTextAreamarcaActivosFijosPorRamos.setEnabled(false);
		jTextAreamarcaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaActivosFijosPorRamos.setLineWrap(true);
		jTextAreamarcaActivosFijosPorRamos.setWrapStyleWord(true);
		jTextAreamarcaActivosFijosPorRamos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamarcaActivosFijosPorRamos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamarcaActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemarcaActivosFijosPorRamos = new JScrollPane(jTextAreamarcaActivosFijosPorRamos);
		jscrollPanemarcaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmarcaActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonmarcaActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmarcaActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonmarcaActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmarcaActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmarcaActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamarcaActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamarcaActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"marcaActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmarcaActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelmodeloActivosFijosPorRamos = new JLabelMe();
		this.jLabelmodeloActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO+" : *");
		this.jLabelmodeloActivosFijosPorRamos.setToolTipText("Modelo");
		this.jLabelmodeloActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmodeloActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmodeloActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmodeloActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_MODELO);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelmodeloActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextAreamodeloActivosFijosPorRamos= new JTextAreaMe();
		jTextAreamodeloActivosFijosPorRamos.setEnabled(false);
		jTextAreamodeloActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloActivosFijosPorRamos.setLineWrap(true);
		jTextAreamodeloActivosFijosPorRamos.setWrapStyleWord(true);
		jTextAreamodeloActivosFijosPorRamos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamodeloActivosFijosPorRamos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamodeloActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemodeloActivosFijosPorRamos = new JScrollPane(jTextAreamodeloActivosFijosPorRamos);
		jscrollPanemodeloActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmodeloActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonmodeloActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmodeloActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonmodeloActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmodeloActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmodeloActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamodeloActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamodeloActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modeloActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmodeloActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_matriculaActivosFijosPorRamos = new JLabelMe();
		this.jLabelnumero_matriculaActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA+" : *");
		this.jLabelnumero_matriculaActivosFijosPorRamos.setToolTipText("Numero Matricula");
		this.jLabelnumero_matriculaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_matriculaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_matriculaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_matriculaActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_matriculaActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_matriculaActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMATRICULA);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelnumero_matriculaActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextFieldnumero_matriculaActivosFijosPorRamos= new JTextFieldMe();

		jTextFieldnumero_matriculaActivosFijosPorRamos.setEnabled(false);
		jTextFieldnumero_matriculaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_matriculaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_matriculaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_matriculaActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_matriculaActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_matriculaActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_matriculaActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_matriculaActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_motorActivosFijosPorRamos = new JLabelMe();
		this.jLabelnumero_motorActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR+" : *");
		this.jLabelnumero_motorActivosFijosPorRamos.setToolTipText("Numero Motor");
		this.jLabelnumero_motorActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_motorActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_motorActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_motorActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_motorActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_motorActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROMOTOR);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelnumero_motorActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextFieldnumero_motorActivosFijosPorRamos= new JTextFieldMe();

		jTextFieldnumero_motorActivosFijosPorRamos.setEnabled(false);
		jTextFieldnumero_motorActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_motorActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_motorActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_motorActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_motorActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonnumero_motorActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_motorActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_motorActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_motorActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonnumero_motorActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_motorActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_motorActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_motorActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_motorActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_motorActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_motorActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chasisActivosFijosPorRamos = new JLabelMe();
		this.jLabelnumero_chasisActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS+" : *");
		this.jLabelnumero_chasisActivosFijosPorRamos.setToolTipText("Numero Chasis");
		this.jLabelnumero_chasisActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chasisActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chasisActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chasisActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chasisActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chasisActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROCHASIS);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelnumero_chasisActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextFieldnumero_chasisActivosFijosPorRamos= new JTextFieldMe();

		jTextFieldnumero_chasisActivosFijosPorRamos.setEnabled(false);
		jTextFieldnumero_chasisActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chasisActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chasisActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chasisActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chasisActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonnumero_chasisActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chasisActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chasisActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chasisActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonnumero_chasisActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chasisActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chasisActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chasisActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chasisActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chasisActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chasisActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_placaActivosFijosPorRamos = new JLabelMe();
		this.jLabelnumero_placaActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA+" : *");
		this.jLabelnumero_placaActivosFijosPorRamos.setToolTipText("Numero Placa");
		this.jLabelnumero_placaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_placaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_placaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_placaActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_placaActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_placaActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_NUMEROPLACA);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelnumero_placaActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextFieldnumero_placaActivosFijosPorRamos= new JTextFieldMe();

		jTextFieldnumero_placaActivosFijosPorRamos.setEnabled(false);
		jTextFieldnumero_placaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_placaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_placaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_placaActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_placaActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonnumero_placaActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_placaActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_placaActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_placaActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonnumero_placaActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_placaActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_placaActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_placaActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_placaActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_placaActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_placaActivosFijosPorRamosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_comercialActivosFijosPorRamos = new JLabelMe();
		this.jLabelvalor_comercialActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL+" : *");
		this.jLabelvalor_comercialActivosFijosPorRamos.setToolTipText("Valor Comercial");
		this.jLabelvalor_comercialActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_comercialActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_comercialActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_comercialActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_comercialActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_comercialActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_VALORCOMERCIAL);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelvalor_comercialActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jTextFieldvalor_comercialActivosFijosPorRamos= new JTextFieldMe();
		jTextFieldvalor_comercialActivosFijosPorRamos.setEnabled(false);
		jTextFieldvalor_comercialActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comercialActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comercialActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_comercialActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_comercialActivosFijosPorRamos.setText("0.0");

		this.jButtonvalor_comercialActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonvalor_comercialActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comercialActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comercialActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_comercialActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonvalor_comercialActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_comercialActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_comercialActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_comercialActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_comercialActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_comercialActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_comercialActivosFijosPorRamosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysActivosFijosPorRamos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaActivosFijosPorRamos = new JLabelMe();
		this.jLabelid_empresaActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaActivosFijosPorRamos.setToolTipText("Empresa");
		this.jLabelid_empresaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelid_empresaActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jComboBoxid_empresaActivosFijosPorRamos= new JComboBoxMe();
		jComboBoxid_empresaActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaActivosFijosPorRamos.setEnabled(false);

		this.jButtonid_empresaActivosFijosPorRamos= new JButtonMe();
		this.jButtonid_empresaActivosFijosPorRamos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActivosFijosPorRamos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActivosFijosPorRamos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaActivosFijosPorRamos.setText("Buscar");
		this.jButtonid_empresaActivosFijosPorRamos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaActivosFijosPorRamos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActivosFijosPorRamos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActivosFijosPorRamos"));

		this.jButtonid_empresaActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonid_empresaActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonid_empresaActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaActivosFijosPorRamosBusqueda.setVisible(false);		}

		this.jButtonid_empresaActivosFijosPorRamosUpdate= new JButtonMe();
		this.jButtonid_empresaActivosFijosPorRamosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActivosFijosPorRamosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaActivosFijosPorRamosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaActivosFijosPorRamosUpdate.setText("U");
		this.jButtonid_empresaActivosFijosPorRamosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaActivosFijosPorRamosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaActivosFijosPorRamosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaActivosFijosPorRamosUpdate"));



					
		this.jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos = new JLabelMe();
		this.jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos.setText(""+ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO+" : *");
		this.jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos.setToolTipText("Tipo Ramo Activo Fijo");
		this.jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos.setToolTipText(ActivosFijosPorRamosConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO);
		this.gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		this.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos.setLayout(this.gridaBagLayoutActivosFijosPorRamos);


		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos= new JComboBoxMe();
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos= new JButtonMe();
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos.setText("Buscar");
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamos"));

		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda= new JButtonMe();
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.setText("U");
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda"));

		if(this.activosfijosporramosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate= new JButtonMe();
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.setText("U");
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate"));



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
		//this.jInternalFrameDetalleActivosFijosPorRamos = new ActivosFijosPorRamosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Activos Fijos Por Ramos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutActivosFijosPorRamos= new GridBagLayout();
		

		
		String sToolTipActivosFijosPorRamos="";
		sToolTipActivosFijosPorRamos=ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipActivosFijosPorRamos+="(ActivosFijos.ActivosFijosPorRamos)";
		}
		
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			sToolTipActivosFijosPorRamos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoActivosFijosPorRamos = new JButtonMe();
		this.jButtonModificarActivosFijosPorRamos = new JButtonMe();
        this.jButtonActualizarActivosFijosPorRamos = new JButtonMe();
        this.jButtonEliminarActivosFijosPorRamos = new JButtonMe();
        this.jButtonCancelarActivosFijosPorRamos = new JButtonMe();
        this.jButtonGuardarCambiosActivosFijosPorRamos = new JButtonMe();
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos = new JButtonMe();
		this.jButtonCerrarActivosFijosPorRamos = new JButtonMe();
		
		this.jScrollPanelDatosActivosFijosPorRamos = new JScrollPane();   
        this.jScrollPanelDatosEdicionActivosFijosPorRamos = new JScrollPane();
		this.jScrollPanelDatosGeneralActivosFijosPorRamos = new JScrollPane();
				
		
		
		this.jPanelCamposActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Activos Fijos Por Ramos";
		
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Ramoses" + this.sPath));
		} else {
			this.jScrollPanelDatosActivosFijosPorRamos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposActivosFijosPorRamos.setName("jPanelCamposActivosFijosPorRamos"); 

		this.jPanelCamposOcultosActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosActivosFijosPorRamos.setName("jPanelCamposOcultosActivosFijosPorRamos"); 

        this.jPanelAccionesActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesActivosFijosPorRamos.setToolTipText("Acciones");
        this.jPanelAccionesActivosFijosPorRamos.setName("Acciones"); 

		this.jPanelAccionesFormularioActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioActivosFijosPorRamos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioActivosFijosPorRamos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoActivosFijosPorRamos.setText("Nuevo");
		this.jButtonModificarActivosFijosPorRamos.setText("Editar");
        this.jButtonActualizarActivosFijosPorRamos.setText("Actualizar");
        this.jButtonEliminarActivosFijosPorRamos.setText("Eliminar");
        this.jButtonCancelarActivosFijosPorRamos.setText("Cancelar");
        this.jButtonGuardarCambiosActivosFijosPorRamos.setText("Guardar");
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.setText("Guardar");
		this.jButtonCerrarActivosFijosPorRamos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoActivosFijosPorRamos,"nuevo_button","Nuevo",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarActivosFijosPorRamos,"modificar_button","Editar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarActivosFijosPorRamos,"actualizar_button","Actualizar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarActivosFijosPorRamos,"eliminar_button","Eliminar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarActivosFijosPorRamos,"cancelar_button","Cancelar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosActivosFijosPorRamos,"guardarcambios_button","Guardar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaActivosFijosPorRamos,"guardarcambiostabla_button","Guardar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarActivosFijosPorRamos,"cerrar_button","Salir",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoActivosFijosPorRamos.setToolTipText("Nuevo"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarActivosFijosPorRamos.setToolTipText("Editar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarActivosFijosPorRamos.setToolTipText("Actualizar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarActivosFijosPorRamos.setToolTipText("Eliminar)"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarActivosFijosPorRamos.setToolTipText("Cancelar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosActivosFijosPorRamos.setToolTipText("Guardar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.setToolTipText("Guardar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarActivosFijosPorRamos.setToolTipText("Salir"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoActivosFijosPorRamos";
		inputMap = this.jButtonNuevoActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoActivosFijosPorRamos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoActivosFijosPorRamos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarActivosFijosPorRamos";
		inputMap = this.jButtonActualizarActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarActivosFijosPorRamos"));
		
		//ELIMINAR
		sMapKey = "EliminarActivosFijosPorRamos";
		inputMap = this.jButtonEliminarActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarActivosFijosPorRamos"));
		
		//CANCELAR	
		sMapKey = "CancelarActivosFijosPorRamos";
		inputMap = this.jButtonCancelarActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarActivosFijosPorRamos"));
		
		//CERRAR		
		sMapKey = "CerrarActivosFijosPorRamos";
		inputMap = this.jButtonCerrarActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarActivosFijosPorRamos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaActivosFijosPorRamos";
		inputMap = this.jButtonGuardarCambiosTablaActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaActivosFijosPorRamos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoActivosFijosPorRamos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoActivosFijosPorRamos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoActivosFijosPorRamos.setToolTipText("Nuevo ActivosFijosPorRamos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarActivosFijosPorRamos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarActivosFijosPorRamos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarActivosFijosPorRamos.setToolTipText("Sin Cerrar Ventana ActivosFijosPorRamos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeActivosFijosPorRamos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeActivosFijosPorRamos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeActivosFijosPorRamos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesActivosFijosPorRamos.setText("Accion");
		this.jComboBoxTiposAccionesActivosFijosPorRamos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesActivosFijosPorRamos = new JLabelMe();
		
		this.jLabelAccionesActivosFijosPorRamos.setText("Acciones");		
		this.jLabelAccionesActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposActivosFijosPorRamos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysActivosFijosPorRamos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesActivosFijosPorRamos=new JTabbedPane();
		this.jTabbedPaneRelacionesActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesActivosFijosPorRamos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijosPorRamos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijosPorRamos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposActivosFijosPorRamos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosActivosFijosPorRamos = new GridBagLayout();
		
		this.jPanelCamposActivosFijosPorRamos.setLayout(gridaBagLayoutCamposActivosFijosPorRamos);
		this.jPanelCamposOcultosActivosFijosPorRamos.setLayout(gridaBagLayoutCamposOcultosActivosFijosPorRamos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidActivosFijosPorRamos.add(jLabelIdActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidActivosFijosPorRamos.add(jLabelidActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaActivosFijosPorRamos.add(jLabelid_empresaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaActivosFijosPorRamos.add(jButtonid_empresaActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 3;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaActivosFijosPorRamos.add(jButtonid_empresaActivosFijosPorRamosUpdate, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaActivosFijosPorRamos.add(jComboBoxid_empresaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos.add(jLabelid_tipo_ramo_activo_fijoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos.add(jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 3;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos.add(jButtonid_tipo_ramo_activo_fijoActivosFijosPorRamosUpdate, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos.add(jComboBoxid_tipo_ramo_activo_fijoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoActivosFijosPorRamos.add(jLabelnombre_sub_grupoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoActivosFijosPorRamos.add(jButtonnombre_sub_grupoActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoActivosFijosPorRamos.add(jscrollPanenombre_sub_grupoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoActivosFijosPorRamos.add(jLabelnombre_detalle_grupoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoActivosFijosPorRamos.add(jButtonnombre_detalle_grupoActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoActivosFijosPorRamos.add(jscrollPanenombre_detalle_grupoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveActivosFijosPorRamos.add(jLabelclaveActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveActivosFijosPorRamos.add(jButtonclaveActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveActivosFijosPorRamos.add(jTextFieldclaveActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreActivosFijosPorRamos.add(jLabelnombreActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreActivosFijosPorRamos.add(jButtonnombreActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreActivosFijosPorRamos.add(jscrollPanenombreActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraActivosFijosPorRamos.add(jLabelfecha_compraActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraActivosFijosPorRamos.add(jButtonfecha_compraActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraActivosFijosPorRamos.add(jDateChooserfecha_compraActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilActivosFijosPorRamos.add(jLabelvida_utilActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilActivosFijosPorRamos.add(jButtonvida_utilActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilActivosFijosPorRamos.add(jTextFieldvida_utilActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraActivosFijosPorRamos.add(jLabelcosto_de_compraActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraActivosFijosPorRamos.add(jButtoncosto_de_compraActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraActivosFijosPorRamos.add(jTextFieldcosto_de_compraActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmarcaActivosFijosPorRamos.add(jLabelmarcaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelmarcaActivosFijosPorRamos.add(jButtonmarcaActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmarcaActivosFijosPorRamos.add(jscrollPanemarcaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmodeloActivosFijosPorRamos.add(jLabelmodeloActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelmodeloActivosFijosPorRamos.add(jButtonmodeloActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmodeloActivosFijosPorRamos.add(jscrollPanemodeloActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_matriculaActivosFijosPorRamos.add(jLabelnumero_matriculaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_matriculaActivosFijosPorRamos.add(jButtonnumero_matriculaActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_matriculaActivosFijosPorRamos.add(jTextFieldnumero_matriculaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_motorActivosFijosPorRamos.add(jLabelnumero_motorActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_motorActivosFijosPorRamos.add(jButtonnumero_motorActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_motorActivosFijosPorRamos.add(jTextFieldnumero_motorActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chasisActivosFijosPorRamos.add(jLabelnumero_chasisActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chasisActivosFijosPorRamos.add(jButtonnumero_chasisActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chasisActivosFijosPorRamos.add(jTextFieldnumero_chasisActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_placaActivosFijosPorRamos.add(jLabelnumero_placaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_placaActivosFijosPorRamos.add(jButtonnumero_placaActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_placaActivosFijosPorRamos.add(jTextFieldnumero_placaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_comercialActivosFijosPorRamos.add(jLabelvalor_comercialActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 2;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
		this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_comercialActivosFijosPorRamos.add(jButtonvalor_comercialActivosFijosPorRamosBusqueda, this.gridBagConstraintsActivosFijosPorRamos);
	}

	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = 1;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_comercialActivosFijosPorRamos.add(jTextFieldvalor_comercialActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelidActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelid_tipo_ramo_activo_fijoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelnombre_sub_grupoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelnombre_detalle_grupoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelclaveActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelnombreActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelfecha_compraActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelvida_utilActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelcosto_de_compraActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelmarcaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelmodeloActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelnumero_matriculaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelnumero_motorActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelnumero_chasisActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelnumero_placaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposActivosFijosPorRamos.add(this.jPanelvalor_comercialActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposActivosFijosPorRamos % 2==0) {
		iXPanelCamposActivosFijosPorRamos=0;
		iYPanelCamposActivosFijosPorRamos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsActivosFijosPorRamos.gridy = iYPanelCamposOcultosActivosFijosPorRamos;
	this.gridBagConstraintsActivosFijosPorRamos.gridx = iXPanelCamposOcultosActivosFijosPorRamos++;
	this.gridBagConstraintsActivosFijosPorRamos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsActivosFijosPorRamos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosActivosFijosPorRamos.add(this.jPanelid_empresaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);



	if(iXPanelCamposOcultosActivosFijosPorRamos % 2==0) {
		iXPanelCamposOcultosActivosFijosPorRamos=0;
		iYPanelCamposOcultosActivosFijosPorRamos++;
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
			
		GridBagLayout gridaBagLayoutAccionesActivosFijosPorRamos= new GridBagLayout();
		this.jPanelAccionesActivosFijosPorRamos.setLayout(gridaBagLayoutAccionesActivosFijosPorRamos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioActivosFijosPorRamos= new GridBagLayout();
		this.jPanelAccionesFormularioActivosFijosPorRamos.setLayout(gridaBagLayoutAccionesFormularioActivosFijosPorRamos);
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioActivosFijosPorRamos.add(this.jComboBoxTiposAccionesFormularioActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccion++;
			
		this.jPanelAccionesActivosFijosPorRamos.add(this.jButtonModificarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);							

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx =iPosXAccion++;
			
		this.jPanelAccionesActivosFijosPorRamos.add(this.jButtonEliminarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
			
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccion++;
		
		this.jPanelAccionesActivosFijosPorRamos.add(this.jButtonActualizarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccion++;
		
		this.jPanelAccionesActivosFijosPorRamos.add(this.jButtonGuardarCambiosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);	
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx =iPosXAccion++;
		
		this.jPanelAccionesActivosFijosPorRamos.add(this.jButtonCancelarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutActivosFijosPorRamos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();						
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;		
			//this.gridBagConstraintsActivosFijosPorRamos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsActivosFijosPorRamos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsActivosFijosPorRamos.gridx =0;
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsActivosFijosPorRamos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleActivosFijosPorRamos = new ActivosFijosPorRamosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Activos Fijos Por Ramos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Activos Fijos Por Ramos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Activos Fijos Por Ramos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ActivosFijosPorRamosModel activosfijosporramosModel=new ActivosFijosPorRamosModel(this);
			
			//SI USARA CLASE INTERNA
			//ActivosFijosPorRamosModel.ActivosFijosPorRamosFocusTraversalPolicy activosfijosporramosFocusTraversalPolicy = activosfijosporramosModel.new ActivosFijosPorRamosFocusTraversalPolicy(this);
			
			//activosfijosporramosFocusTraversalPolicy.setactivosfijosporramosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(activosfijosporramosModel);
			
			
			this.jContentPaneDetalleActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleActivosFijosPorRamos = new GridBagLayout();	
			this.jContentPaneDetalleActivosFijosPorRamos.setLayout(gridaBagLayoutDetalleActivosFijosPorRamos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosActivosFijosPorRamos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
				this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
					
				
				this.jContentPaneDetalleActivosFijosPorRamos.add(jTtoolBarDetalleActivosFijosPorRamos, gridBagConstraintsActivosFijosPorRamos);								
				
}
			
			this.jScrollPanelDatosEdicionActivosFijosPorRamos=   new JScrollPane(jContentPaneDetalleActivosFijosPorRamos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralActivosFijosPorRamos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	        
			this.jContentPaneDetalleActivosFijosPorRamos.add(jPanelCamposActivosFijosPorRamos, gridBagConstraintsActivosFijosPorRamos);
			
			
			
			
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
						//&& activosfijosporramosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.activosfijosporramosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsActivosFijosPorRamos= new GridBagConstraints();
						this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
						this.jContentPaneDetalleActivosFijosPorRamos.add(this.jTabbedPaneRelacionesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesActivosFijosPorRamos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosActivosFijosPorRamos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
					this.gridBagConstraintsActivosFijosPorRamos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
					
				
					this.jContentPaneDetalleActivosFijosPorRamos.add(jPanelCamposOcultosActivosFijosPorRamos, gridBagConstraintsActivosFijosPorRamos);
				
					this.jPanelCamposOcultosActivosFijosPorRamos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	        this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleActivosFijosPorRamos.add(this.jPanelAccionesFormularioActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);							
			
			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
	        this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
	        
			
			this.jContentPaneDetalleActivosFijosPorRamos.add(this.jPanelAccionesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionActivosFijosPorRamos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionActivosFijosPorRamos=   new JScrollPane(this.jPanelCamposActivosFijosPorRamos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsActivosFijosPorRamos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			
			
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
			
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralActivosFijosPorRamos;//jContentPane;
		
		return jScrollPanelDatosEdicionActivosFijosPorRamos;
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
