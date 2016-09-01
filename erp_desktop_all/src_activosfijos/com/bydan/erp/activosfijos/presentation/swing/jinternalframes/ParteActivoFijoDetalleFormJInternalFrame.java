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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.ParteActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class ParteActivoFijoDetalleFormJInternalFrame extends ParteActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParteActivoFijo;
	
	protected JMenuBar jmenuBarDetalleParteActivoFijo;
	
	protected JMenu jmenuDetalleParteActivoFijo;
	protected JMenu jmenuDetalleArchivoParteActivoFijo;
	protected JMenu jmenuDetalleAccionesParteActivoFijo;
	protected JMenu jmenuDetalleDatosParteActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParteActivoFijo;	
	protected GridBagConstraints gridBagConstraintsParteActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParteActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParteActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstadoActivoFijoBeanSwingJInternalFrame estadoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoactivofijo="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";
	
	public ParteActivoFijoSessionBean parteactivofijoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstadoActivoFijoSessionBean estadoactivofijoSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;	
	
	public ParteActivoFijoLogic parteactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosParteActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionParteActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralParteActivoFijo;
	
	protected JPanel jPanelCamposParteActivoFijo;    
	protected JPanel jPanelCamposOcultosParteActivoFijo;    	
	protected JPanel jPanelAccionesParteActivoFijo;
	protected JPanel jPanelAccionesFormularioParteActivoFijo;
    
	
	
	protected Integer iXPanelCamposParteActivoFijo=0;
	protected Integer iYPanelCamposParteActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosParteActivoFijo=0;
	protected Integer iYPanelCamposOcultosParteActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParteActivoFijo;
	public JButton jButtonModificarParteActivoFijo;
	public JButton jButtonActualizarParteActivoFijo;
    public JButton jButtonEliminarParteActivoFijo;
	public JButton jButtonCancelarParteActivoFijo;
    public JButton jButtonGuardarCambiosParteActivoFijo;
	public JButton jButtonGuardarCambiosTablaParteActivoFijo;
	protected JButton jButtonCerrarParteActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionParteActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParteActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParteActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParteActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParteActivoFijo;
	protected JButton jButtonModificarToolBarParteActivoFijo;
	protected JButton jButtonActualizarToolBarParteActivoFijo;
    protected JButton jButtonEliminarToolBarParteActivoFijo;
	protected JButton jButtonCancelarToolBarParteActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarParteActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarParteActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarParteActivoFijo;
	protected JButton jButtonCerrarToolBarParteActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarParteActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParteActivoFijo;
	protected JMenuItem jMenuItemModificarParteActivoFijo;
	protected JMenuItem jMenuItemActualizarParteActivoFijo;
    protected JMenuItem jMenuItemEliminarParteActivoFijo;
	protected JMenuItem jMenuItemCancelarParteActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosParteActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaParteActivoFijo;
	protected JMenuItem jMenuItemCerrarParteActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarParteActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarParteActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionParteActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParteActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarParteActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParteActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParteActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParteActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParteActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParteActivoFijo;
	public JLabel jLabelIdParteActivoFijo;
	public JLabel jLabelidParteActivoFijo;
	public JButton jButtonidParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoParteActivoFijo;
	public JLabel jLabelcodigoParteActivoFijo;
	public JTextField jTextFieldcodigoParteActivoFijo;
	public JButton jButtoncodigoParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreParteActivoFijo;
	public JLabel jLabelnombreParteActivoFijo;
	public JTextArea jTextAreanombreParteActivoFijo;
	public JScrollPane jscrollPanenombreParteActivoFijo;
	public JButton jButtonnombreParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelmarcaParteActivoFijo;
	public JLabel jLabelmarcaParteActivoFijo;
	public JTextField jTextFieldmarcaParteActivoFijo;
	public JButton jButtonmarcaParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelserieParteActivoFijo;
	public JLabel jLabelserieParteActivoFijo;
	public JTextField jTextFieldserieParteActivoFijo;
	public JButton jButtonserieParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadParteActivoFijo;
	public JLabel jLabelcantidadParteActivoFijo;
	public JTextField jTextFieldcantidadParteActivoFijo;
	public JButton jButtoncantidadParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfotoParteActivoFijo;
	public JLabel jLabelfotoParteActivoFijo;
	public JTextArea jTextAreafotoParteActivoFijo;
	public JScrollPane jscrollPanefotoParteActivoFijo;
	public JButton jButtonfotoParteActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParteActivoFijo;
	public JLabel jLabelid_empresaParteActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParteActivoFijo;
	public JButton jButtonid_empresaParteActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaParteActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParteActivoFijo;
	public JLabel jLabelid_sucursalParteActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParteActivoFijo;
	public JButton jButtonid_sucursalParteActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursalParteActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_activo_fijoParteActivoFijo;
	public JLabel jLabelid_estado_activo_fijoParteActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_activo_fijoParteActivoFijo;
	public JButton jButtonid_estado_activo_fijoParteActivoFijo= new JButtonMe();
	public JButton jButtonid_estado_activo_fijoParteActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_estado_activo_fijoParteActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijoParteActivoFijo;
	public JLabel jLabelid_detalle_activo_fijoParteActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoParteActivoFijo;
	public JButton jButtonid_detalle_activo_fijoParteActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoParteActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoParteActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParteActivoFijo;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParteActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParteActivoFijo=new JPanel();
				this.jPanelAccionesFormularioParteActivoFijo=new JPanel();
				this.jmenuBarDetalleParteActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleParteActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParteActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParteActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParteActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParteActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParteActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParteActivoFijo() {
		return this.jButtonActualizarToolBarParteActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarParteActivoFijo() {
		return this.jButtonEliminarToolBarParteActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarParteActivoFijo() {
		return this.jButtonCancelarToolBarParteActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionParteActivoFijo() {
		return this.jButtonProcesarInformacionParteActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParteActivoFijo)	{
		this.jButtonProcesarInformacionParteActivoFijo = jButtonProcesarInformacionParteActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParteActivoFijo() {
		return this.jComboBoxTiposAccionesParteActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParteActivoFijo(
			JComboBox jComboBoxTiposRelacionesParteActivoFijo) {
		this.jComboBoxTiposRelacionesParteActivoFijo = jComboBoxTiposRelacionesParteActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParteActivoFijo(
			JComboBox jComboBoxTiposAccionesParteActivoFijo) {
		this.jComboBoxTiposAccionesParteActivoFijo = jComboBoxTiposAccionesParteActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParteActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioParteActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParteActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioParteActivoFijo) {
		this.jComboBoxTiposAccionesFormularioParteActivoFijo = jComboBoxTiposAccionesFormularioParteActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		
		this.parteactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parteactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parteactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParteActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parte Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParteActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParteActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParteActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarParteActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParteActivoFijo,this.jTtoolBarDetalleParteActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParteActivoFijo,this.jTtoolBarDetalleParteActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParteActivoFijo,this.jTtoolBarDetalleParteActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParteActivoFijo,this.jTtoolBarDetalleParteActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParteActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParteActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParteActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParteActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParteActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParteActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParteActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParteActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParteActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParteActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParteActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParteActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParteActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParteActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParteActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParteActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParteActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParteActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParteActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParteActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParteActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParteActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParteActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParteActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParteActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParteActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParteActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParteActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParteActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParteActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParteActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParteActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParteActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParteActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParteActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParteActivoFijo.add(this.jMenuItemDetalleCerrarParteActivoFijo);
		
		this.jmenuDetalleAccionesParteActivoFijo.add(this.jMenuItemActualizarParteActivoFijo);
		this.jmenuDetalleAccionesParteActivoFijo.add(this.jMenuItemEliminarParteActivoFijo);
		this.jmenuDetalleAccionesParteActivoFijo.add(this.jMenuItemCancelarParteActivoFijo);		
		
		//this.jmenuDetalleDatosParteActivoFijo.add(this.jMenuItemDetalleAbrirOrderByParteActivoFijo);				
		this.jmenuDetalleDatosParteActivoFijo.add(this.jMenuItemDetalleMostarOcultarParteActivoFijo);				
				
		//this.jmenuDetalleAccionesParteActivoFijo.add(this.jMenuItemGuardarCambiosParteActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParteActivoFijo.add(this.jmenuDetalleArchivoParteActivoFijo);		
		this.jmenuBarDetalleParteActivoFijo.add(this.jmenuDetalleAccionesParteActivoFijo);		
		this.jmenuBarDetalleParteActivoFijo.add(this.jmenuDetalleDatosParteActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParteActivoFijo);				
	}
	
	
	public void inicializarElementosCamposParteActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParteActivoFijo = new JLabelMe();
		jLabelIdParteActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParteActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParteActivoFijo= new GridBagLayout();

		this.jPanelidParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);

		jLabelidParteActivoFijo = new JLabel();
		jLabelidParteActivoFijo.setText("Id");

		jLabelidParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoParteActivoFijo = new JLabelMe();
		this.jLabelcodigoParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoParteActivoFijo.setToolTipText("Codigo");
		this.jLabelcodigoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelcodigoParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jTextFieldcodigoParteActivoFijo= new JTextFieldMe();

		jTextFieldcodigoParteActivoFijo.setEnabled(false);
		jTextFieldcodigoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoParteActivoFijoBusqueda= new JButtonMe();
		this.jButtoncodigoParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoParteActivoFijoBusqueda.setText("U");
		this.jButtoncodigoParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoParteActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelnombreParteActivoFijo = new JLabelMe();
		this.jLabelnombreParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreParteActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelnombreParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jTextAreanombreParteActivoFijo= new JTextAreaMe();
		jTextAreanombreParteActivoFijo.setEnabled(false);
		jTextAreanombreParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParteActivoFijo.setLineWrap(true);
		jTextAreanombreParteActivoFijo.setWrapStyleWord(true);
		jTextAreanombreParteActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreParteActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreParteActivoFijo = new JScrollPane(jTextAreanombreParteActivoFijo);
		jscrollPanenombreParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreParteActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreParteActivoFijoBusqueda.setText("U");
		this.jButtonnombreParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreParteActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelmarcaParteActivoFijo = new JLabelMe();
		this.jLabelmarcaParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_MARCA+" : *");
		this.jLabelmarcaParteActivoFijo.setToolTipText("Marca");
		this.jLabelmarcaParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmarcaParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmarcaParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmarcaParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_MARCA);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelmarcaParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jTextFieldmarcaParteActivoFijo= new JTextFieldMe();

		jTextFieldmarcaParteActivoFijo.setEnabled(false);
		jTextFieldmarcaParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmarcaParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmarcaParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmarcaParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonmarcaParteActivoFijoBusqueda= new JButtonMe();
		this.jButtonmarcaParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmarcaParteActivoFijoBusqueda.setText("U");
		this.jButtonmarcaParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmarcaParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmarcaParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmarcaParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmarcaParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"marcaParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmarcaParteActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelserieParteActivoFijo = new JLabelMe();
		this.jLabelserieParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_SERIE+" : *");
		this.jLabelserieParteActivoFijo.setToolTipText("Serie");
		this.jLabelserieParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelserieParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jTextFieldserieParteActivoFijo= new JTextFieldMe();

		jTextFieldserieParteActivoFijo.setEnabled(false);
		jTextFieldserieParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieParteActivoFijoBusqueda= new JButtonMe();
		this.jButtonserieParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieParteActivoFijoBusqueda.setText("U");
		this.jButtonserieParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieParteActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcantidadParteActivoFijo = new JLabelMe();
		this.jLabelcantidadParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadParteActivoFijo.setToolTipText("Cantidad");
		this.jLabelcantidadParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelcantidadParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jTextFieldcantidadParteActivoFijo= new JTextFieldMe();
		jTextFieldcantidadParteActivoFijo.setEnabled(false);
		jTextFieldcantidadParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadParteActivoFijo.setText("0");

		this.jButtoncantidadParteActivoFijoBusqueda= new JButtonMe();
		this.jButtoncantidadParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadParteActivoFijoBusqueda.setText("U");
		this.jButtoncantidadParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadParteActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfotoParteActivoFijo = new JLabelMe();
		this.jLabelfotoParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_FOTO+" : *");
		this.jLabelfotoParteActivoFijo.setToolTipText("Foto");
		this.jLabelfotoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfotoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfotoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfotoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfotoParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfotoParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_FOTO);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelfotoParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jTextAreafotoParteActivoFijo= new JTextAreaMe();
		jTextAreafotoParteActivoFijo.setEnabled(false);
		jTextAreafotoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreafotoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreafotoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreafotoParteActivoFijo.setLineWrap(true);
		jTextAreafotoParteActivoFijo.setWrapStyleWord(true);
		jTextAreafotoParteActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreafotoParteActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreafotoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanefotoParteActivoFijo = new JScrollPane(jTextAreafotoParteActivoFijo);
		jscrollPanefotoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanefotoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanefotoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonfotoParteActivoFijoBusqueda= new JButtonMe();
		this.jButtonfotoParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfotoParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfotoParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfotoParteActivoFijoBusqueda.setText("U");
		this.jButtonfotoParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfotoParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfotoParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreafotoParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreafotoParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fotoParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfotoParteActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParteActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParteActivoFijo = new JLabelMe();
		this.jLabelid_empresaParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParteActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelid_empresaParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jComboBoxid_empresaParteActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParteActivoFijo.setEnabled(false);

		this.jButtonid_empresaParteActivoFijo= new JButtonMe();
		this.jButtonid_empresaParteActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParteActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParteActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParteActivoFijo.setText("Buscar");
		this.jButtonid_empresaParteActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParteActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParteActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParteActivoFijo"));

		this.jButtonid_empresaParteActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParteActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParteActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParteActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaParteActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParteActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParteActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParteActivoFijoUpdate.setText("U");
		this.jButtonid_empresaParteActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParteActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParteActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParteActivoFijoUpdate"));



					
		this.jLabelid_sucursalParteActivoFijo = new JLabelMe();
		this.jLabelid_sucursalParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParteActivoFijo.setToolTipText("Sucursal");
		this.jLabelid_sucursalParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelid_sucursalParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jComboBoxid_sucursalParteActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursalParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParteActivoFijo.setEnabled(false);

		this.jButtonid_sucursalParteActivoFijo= new JButtonMe();
		this.jButtonid_sucursalParteActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParteActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParteActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParteActivoFijo.setText("Buscar");
		this.jButtonid_sucursalParteActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParteActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParteActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParteActivoFijo"));

		this.jButtonid_sucursalParteActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sucursalParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParteActivoFijoBusqueda.setText("U");
		this.jButtonid_sucursalParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParteActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParteActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sucursalParteActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParteActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParteActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParteActivoFijoUpdate.setText("U");
		this.jButtonid_sucursalParteActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParteActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParteActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParteActivoFijoUpdate"));



					
		this.jLabelid_estado_activo_fijoParteActivoFijo = new JLabelMe();
		this.jLabelid_estado_activo_fijoParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO+" : *");
		this.jLabelid_estado_activo_fijoParteActivoFijo.setToolTipText("Estado Activo Fijo");
		this.jLabelid_estado_activo_fijoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_activo_fijoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_activo_fijoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_activo_fijoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_activo_fijoParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_activo_fijoParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelid_estado_activo_fijoParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jComboBoxid_estado_activo_fijoParteActivoFijo= new JComboBoxMe();
		jComboBoxid_estado_activo_fijoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_activo_fijoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_activo_fijoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_activo_fijoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_activo_fijoParteActivoFijo= new JButtonMe();
		this.jButtonid_estado_activo_fijoParteActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_activo_fijoParteActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_activo_fijoParteActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_activo_fijoParteActivoFijo.setText("Buscar");
		this.jButtonid_estado_activo_fijoParteActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_activo_fijoParteActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_activo_fijoParteActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_activo_fijoParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_activo_fijoParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_activo_fijoParteActivoFijo"));

		this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.setText("U");
		this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_activo_fijoParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_activo_fijoParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_activo_fijoParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_estado_activo_fijoParteActivoFijoUpdate= new JButtonMe();
		this.jButtonid_estado_activo_fijoParteActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_activo_fijoParteActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_activo_fijoParteActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_activo_fijoParteActivoFijoUpdate.setText("U");
		this.jButtonid_estado_activo_fijoParteActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_activo_fijoParteActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_activo_fijoParteActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_activo_fijoParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_activo_fijoParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_activo_fijoParteActivoFijoUpdate"));



					
		this.jLabelid_detalle_activo_fijoParteActivoFijo = new JLabelMe();
		this.jLabelid_detalle_activo_fijoParteActivoFijo.setText(""+ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO+" : *");
		this.jLabelid_detalle_activo_fijoParteActivoFijo.setToolTipText("Detalle Activo Fijo");
		this.jLabelid_detalle_activo_fijoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijoParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijoParteActivoFijo.setToolTipText(ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		this.gridaBagLayoutParteActivoFijo = new GridBagLayout();
		this.jPanelid_detalle_activo_fijoParteActivoFijo.setLayout(this.gridaBagLayoutParteActivoFijo);


		jComboBoxid_detalle_activo_fijoParteActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijoParteActivoFijo= new JButtonMe();
		this.jButtonid_detalle_activo_fijoParteActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoParteActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoParteActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoParteActivoFijo.setText("Buscar");
		this.jButtonid_detalle_activo_fijoParteActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijoParteActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoParteActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijoParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoParteActivoFijo"));

		this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijoParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoParteActivoFijoBusqueda"));

		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijoParteActivoFijoUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.setText("U");
		this.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoParteActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijoParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoParteActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleParteActivoFijo = new ParteActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parte Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParteActivoFijo= new GridBagLayout();
		

		
		String sToolTipParteActivoFijo="";
		sToolTipParteActivoFijo=ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParteActivoFijo+="(ActivosFijos.ParteActivoFijo)";
		}
		
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParteActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParteActivoFijo = new JButtonMe();
		this.jButtonModificarParteActivoFijo = new JButtonMe();
        this.jButtonActualizarParteActivoFijo = new JButtonMe();
        this.jButtonEliminarParteActivoFijo = new JButtonMe();
        this.jButtonCancelarParteActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosParteActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaParteActivoFijo = new JButtonMe();
		this.jButtonCerrarParteActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosParteActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionParteActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralParteActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parte Activo Fijo";
		
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parte Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosParteActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParteActivoFijo.setName("jPanelCamposParteActivoFijo"); 

		this.jPanelCamposOcultosParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParteActivoFijo.setName("jPanelCamposOcultosParteActivoFijo"); 

        this.jPanelAccionesParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParteActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesParteActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParteActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParteActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParteActivoFijo.setText("Nuevo");
		this.jButtonModificarParteActivoFijo.setText("Editar");
        this.jButtonActualizarParteActivoFijo.setText("Actualizar");
        this.jButtonEliminarParteActivoFijo.setText("Eliminar");
        this.jButtonCancelarParteActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosParteActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaParteActivoFijo.setText("Guardar");
		this.jButtonCerrarParteActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParteActivoFijo,"nuevo_button","Nuevo",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParteActivoFijo,"modificar_button","Editar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParteActivoFijo,"actualizar_button","Actualizar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParteActivoFijo,"eliminar_button","Eliminar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParteActivoFijo,"cancelar_button","Cancelar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParteActivoFijo,"guardarcambios_button","Guardar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParteActivoFijo,"guardarcambiostabla_button","Guardar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParteActivoFijo,"cerrar_button","Salir",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParteActivoFijo.setToolTipText("Nuevo"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParteActivoFijo.setToolTipText("Editar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParteActivoFijo.setToolTipText("Actualizar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParteActivoFijo.setToolTipText("Eliminar)"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParteActivoFijo.setToolTipText("Cancelar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParteActivoFijo.setToolTipText("Guardar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParteActivoFijo.setToolTipText("Guardar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParteActivoFijo.setToolTipText("Salir"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParteActivoFijo";
		inputMap = this.jButtonNuevoParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParteActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParteActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParteActivoFijo";
		inputMap = this.jButtonActualizarParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParteActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarParteActivoFijo";
		inputMap = this.jButtonEliminarParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParteActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarParteActivoFijo";
		inputMap = this.jButtonCancelarParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParteActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarParteActivoFijo";
		inputMap = this.jButtonCerrarParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParteActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParteActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParteActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParteActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParteActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParteActivoFijo.setToolTipText("Nuevo ParteActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParteActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParteActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParteActivoFijo.setToolTipText("Sin Cerrar Ventana ParteActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParteActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParteActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParteActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParteActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesParteActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParteActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParteActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParteActivoFijo = new JLabelMe();
		
		this.jLabelAccionesParteActivoFijo.setText("Acciones");		
		this.jLabelAccionesParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParteActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParteActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParteActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParteActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParteActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParteActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParteActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParteActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParteActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParteActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParteActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParteActivoFijo = new GridBagLayout();
		
		this.jPanelCamposParteActivoFijo.setLayout(gridaBagLayoutCamposParteActivoFijo);
		this.jPanelCamposOcultosParteActivoFijo.setLayout(gridaBagLayoutCamposOcultosParteActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParteActivoFijo.add(jLabelIdParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParteActivoFijo.add(jLabelidParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParteActivoFijo.add(jLabelid_empresaParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParteActivoFijo.add(jButtonid_empresaParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 3;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParteActivoFijo.add(jButtonid_empresaParteActivoFijoUpdate, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParteActivoFijo.add(jComboBoxid_empresaParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParteActivoFijo.add(jLabelid_sucursalParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParteActivoFijo.add(jButtonid_sucursalParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 3;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParteActivoFijo.add(jButtonid_sucursalParteActivoFijoUpdate, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParteActivoFijo.add(jComboBoxid_sucursalParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_activo_fijoParteActivoFijo.add(jLabelid_estado_activo_fijoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_activo_fijoParteActivoFijo.add(jButtonid_estado_activo_fijoParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 3;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_activo_fijoParteActivoFijo.add(jButtonid_estado_activo_fijoParteActivoFijoUpdate, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_activo_fijoParteActivoFijo.add(jComboBoxid_estado_activo_fijoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijoParteActivoFijo.add(jLabelid_detalle_activo_fijoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoParteActivoFijo.add(jButtonid_detalle_activo_fijoParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 3;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoParteActivoFijo.add(jButtonid_detalle_activo_fijoParteActivoFijoUpdate, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijoParteActivoFijo.add(jComboBoxid_detalle_activo_fijoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoParteActivoFijo.add(jLabelcodigoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoParteActivoFijo.add(jButtoncodigoParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoParteActivoFijo.add(jTextFieldcodigoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreParteActivoFijo.add(jLabelnombreParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreParteActivoFijo.add(jButtonnombreParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreParteActivoFijo.add(jscrollPanenombreParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmarcaParteActivoFijo.add(jLabelmarcaParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelmarcaParteActivoFijo.add(jButtonmarcaParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmarcaParteActivoFijo.add(jTextFieldmarcaParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieParteActivoFijo.add(jLabelserieParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieParteActivoFijo.add(jButtonserieParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieParteActivoFijo.add(jTextFieldserieParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadParteActivoFijo.add(jLabelcantidadParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadParteActivoFijo.add(jButtoncantidadParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadParteActivoFijo.add(jTextFieldcantidadParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 0;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfotoParteActivoFijo.add(jLabelfotoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 2;
		this.gridBagConstraintsParteActivoFijo.ipadx = 0;
		this.gridBagConstraintsParteActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfotoParteActivoFijo.add(jButtonfotoParteActivoFijoBusqueda, this.gridBagConstraintsParteActivoFijo);
	}

	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParteActivoFijo.gridy = 0;
	this.gridBagConstraintsParteActivoFijo.gridx = 1;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfotoParteActivoFijo.add(jscrollPanefotoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelidParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelid_estado_activo_fijoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelid_detalle_activo_fijoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelcodigoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelnombreParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelmarcaParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelserieParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelcantidadParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParteActivoFijo.add(this.jPanelfotoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposParteActivoFijo % 1==0) {
		iXPanelCamposParteActivoFijo=0;
		iYPanelCamposParteActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposOcultosParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposOcultosParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParteActivoFijo.add(this.jPanelid_empresaParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposOcultosParteActivoFijo % 1==0) {
		iXPanelCamposOcultosParteActivoFijo=0;
		iYPanelCamposOcultosParteActivoFijo++;
	}
	this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParteActivoFijo.gridy = iYPanelCamposOcultosParteActivoFijo;
	this.gridBagConstraintsParteActivoFijo.gridx = iXPanelCamposOcultosParteActivoFijo++;
	this.gridBagConstraintsParteActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParteActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParteActivoFijo.add(this.jPanelid_sucursalParteActivoFijo, this.gridBagConstraintsParteActivoFijo);



	if(iXPanelCamposOcultosParteActivoFijo % 1==0) {
		iXPanelCamposOcultosParteActivoFijo=0;
		iYPanelCamposOcultosParteActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesParteActivoFijo= new GridBagLayout();
		this.jPanelAccionesParteActivoFijo.setLayout(gridaBagLayoutAccionesParteActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParteActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioParteActivoFijo.setLayout(gridaBagLayoutAccionesFormularioParteActivoFijo);
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParteActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParteActivoFijo.add(this.jComboBoxTiposAccionesFormularioParteActivoFijo, this.gridBagConstraintsParteActivoFijo);

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParteActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParteActivoFijo.add(this.jCheckBoxPostAccionNuevoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParteActivoFijo.add(this.jCheckBoxPostAccionSinCerrarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParteActivoFijo.add(this.jCheckBoxPostAccionSinMensajeParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesParteActivoFijo.add(this.jButtonModificarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);							

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesParteActivoFijo.add(this.jButtonEliminarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
			
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = 0;		
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesParteActivoFijo.add(this.jButtonActualizarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);


		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = 0;		
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesParteActivoFijo.add(this.jButtonGuardarCambiosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);	
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = 0;		
		this.gridBagConstraintsParteActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesParteActivoFijo.add(this.jButtonCancelarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParteActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParteActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParteActivoFijo.gridx = 0;		
			//this.gridBagConstraintsParteActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParteActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParteActivoFijo.gridx =0;
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParteActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParteActivoFijo = new ParteActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parte Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parte Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parte Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParteActivoFijoModel parteactivofijoModel=new ParteActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParteActivoFijoModel.ParteActivoFijoFocusTraversalPolicy parteactivofijoFocusTraversalPolicy = parteactivofijoModel.new ParteActivoFijoFocusTraversalPolicy(this);
			
			//parteactivofijoFocusTraversalPolicy.setparteactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parteactivofijoModel);
			
			
			this.jContentPaneDetalleParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParteActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleParteActivoFijo.setLayout(gridaBagLayoutDetalleParteActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParteActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsParteActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParteActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleParteActivoFijo.add(jTtoolBarDetalleParteActivoFijo, gridBagConstraintsParteActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionParteActivoFijo=   new JScrollPane(jContentPaneDetalleParteActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParteActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParteActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParteActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParteActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParteActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParteActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParteActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParteActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParteActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleParteActivoFijo.add(jPanelCamposParteActivoFijo, gridBagConstraintsParteActivoFijo);
			
			
			
			
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
						&& parteactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParteActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsParteActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParteActivoFijo.gridx = 0;
						this.jContentPaneDetalleParteActivoFijo.add(this.jTabbedPaneRelacionesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParteActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParteActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsParteActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParteActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParteActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleParteActivoFijo.add(jPanelCamposOcultosParteActivoFijo, gridBagConstraintsParteActivoFijo);
				
					this.jPanelCamposOcultosParteActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParteActivoFijo.gridx = 0;
	        this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParteActivoFijo.add(this.jPanelAccionesFormularioParteActivoFijo, this.gridBagConstraintsParteActivoFijo);							
			
			
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsParteActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParteActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleParteActivoFijo.add(this.jPanelAccionesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParteActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParteActivoFijo=   new JScrollPane(this.jPanelCamposParteActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParteActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParteActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParteActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParteActivoFijo.gridx = 0;
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParteActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParteActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParteActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			
			
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
			
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParteActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionParteActivoFijo;
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
