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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.DatoGeneralUsuarioConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class DatoGeneralUsuarioDetalleFormJInternalFrame extends DatoGeneralUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDatoGeneralUsuario;
	
	protected JMenuBar jmenuBarDetalleDatoGeneralUsuario;
	
	protected JMenu jmenuDetalleDatoGeneralUsuario;
	protected JMenu jmenuDetalleArchivoDatoGeneralUsuario;
	protected JMenu jmenuDetalleAccionesDatoGeneralUsuario;
	protected JMenu jmenuDetalleDatosDatoGeneralUsuario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoGeneralUsuario;	
	protected GridBagConstraints gridBagConstraintsDatoGeneralUsuario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DatoGeneralUsuarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleDatoGeneralUsuario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public DatoGeneralUsuarioSessionBean datogeneralusuarioSessionBean;
	
	
	
	
	public UsuarioSessionBean usuarioSessionBean;
	public PaisSessionBean paisSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public DatoGeneralUsuarioLogic datogeneralusuarioLogic;
	
	public JScrollPane jScrollPanelDatosDatoGeneralUsuario;
	public JScrollPane jScrollPanelDatosEdicionDatoGeneralUsuario;
	public JScrollPane jScrollPanelDatosGeneralDatoGeneralUsuario;
	
	protected JPanel jPanelCamposDatoGeneralUsuario;    
	protected JPanel jPanelCamposOcultosDatoGeneralUsuario;    	
	protected JPanel jPanelAccionesDatoGeneralUsuario;
	protected JPanel jPanelAccionesFormularioDatoGeneralUsuario;
    
	
	
	protected Integer iXPanelCamposDatoGeneralUsuario=0;
	protected Integer iYPanelCamposDatoGeneralUsuario=0;
	
	protected Integer iXPanelCamposOcultosDatoGeneralUsuario=0;
	protected Integer iYPanelCamposOcultosDatoGeneralUsuario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDatoGeneralUsuario;
	public JButton jButtonModificarDatoGeneralUsuario;
	public JButton jButtonActualizarDatoGeneralUsuario;
    public JButton jButtonEliminarDatoGeneralUsuario;
	public JButton jButtonCancelarDatoGeneralUsuario;
    public JButton jButtonGuardarCambiosDatoGeneralUsuario;
	public JButton jButtonGuardarCambiosTablaDatoGeneralUsuario;
	protected JButton jButtonCerrarDatoGeneralUsuario;
	
	
	protected JButton jButtonProcesarInformacionDatoGeneralUsuario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDatoGeneralUsuario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDatoGeneralUsuario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDatoGeneralUsuario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoGeneralUsuario;
	protected JButton jButtonModificarToolBarDatoGeneralUsuario;
	protected JButton jButtonActualizarToolBarDatoGeneralUsuario;
    protected JButton jButtonEliminarToolBarDatoGeneralUsuario;
	protected JButton jButtonCancelarToolBarDatoGeneralUsuario;
    protected JButton jButtonGuardarCambiosToolBarDatoGeneralUsuario;
	protected JButton jButtonGuardarCambiosTablaToolBarDatoGeneralUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoGeneralUsuario;
	protected JButton jButtonCerrarToolBarDatoGeneralUsuario;
	
	protected JButton jButtonProcesarInformacionToolBarDatoGeneralUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoGeneralUsuario;
	protected JMenuItem jMenuItemModificarDatoGeneralUsuario;
	protected JMenuItem jMenuItemActualizarDatoGeneralUsuario;
    protected JMenuItem jMenuItemEliminarDatoGeneralUsuario;
	protected JMenuItem jMenuItemCancelarDatoGeneralUsuario;
    protected JMenuItem jMenuItemGuardarCambiosDatoGeneralUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoGeneralUsuario;
	protected JMenuItem jMenuItemCerrarDatoGeneralUsuario;
	protected JMenuItem jMenuItemDetalleCerrarDatoGeneralUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoGeneralUsuario;
	
	protected JMenuItem jMenuItemProcesarInformacionDatoGeneralUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoGeneralUsuario;
	protected JMenuItem jMenuItemMostrarOcultarDatoGeneralUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoGeneralUsuario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoGeneralUsuario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDatoGeneralUsuario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelcedulaDatoGeneralUsuario;
	public JLabel jLabelcedulaDatoGeneralUsuario;
	public JTextField jTextFieldcedulaDatoGeneralUsuario;
	public JButton jButtoncedulaDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelapellidosDatoGeneralUsuario;
	public JLabel jLabelapellidosDatoGeneralUsuario;
	public JTextArea jTextAreaapellidosDatoGeneralUsuario;
	public JScrollPane jscrollPaneapellidosDatoGeneralUsuario;
	public JButton jButtonapellidosDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnombresDatoGeneralUsuario;
	public JLabel jLabelnombresDatoGeneralUsuario;
	public JTextArea jTextAreanombresDatoGeneralUsuario;
	public JScrollPane jscrollPanenombresDatoGeneralUsuario;
	public JButton jButtonnombresDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoDatoGeneralUsuario;
	public JLabel jLabeltelefonoDatoGeneralUsuario;
	public JTextArea jTextAreatelefonoDatoGeneralUsuario;
	public JScrollPane jscrollPanetelefonoDatoGeneralUsuario;
	public JButton jButtontelefonoDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_movilDatoGeneralUsuario;
	public JLabel jLabeltelefono_movilDatoGeneralUsuario;
	public JTextArea jTextAreatelefono_movilDatoGeneralUsuario;
	public JScrollPane jscrollPanetelefono_movilDatoGeneralUsuario;
	public JButton jButtontelefono_movilDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanele_mailDatoGeneralUsuario;
	public JLabel jLabele_mailDatoGeneralUsuario;
	public JTextArea jTextAreae_mailDatoGeneralUsuario;
	public JScrollPane jscrollPanee_mailDatoGeneralUsuario;
	public JButton jButtone_mailDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelurlDatoGeneralUsuario;
	public JLabel jLabelurlDatoGeneralUsuario;
	public JTextArea jTextAreaurlDatoGeneralUsuario;
	public JScrollPane jscrollPaneurlDatoGeneralUsuario;
	public JButton jButtonurlDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimientoDatoGeneralUsuario;
	public JLabel jLabelfecha_nacimientoDatoGeneralUsuario;
	//public JFormattedTextField jDateChooserfecha_nacimientoDatoGeneralUsuario;

	public JDateChooser jDateChooserfecha_nacimientoDatoGeneralUsuario;
	public JButton jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneldireccionDatoGeneralUsuario;
	public JLabel jLabeldireccionDatoGeneralUsuario;
	public JTextArea jTextAreadireccionDatoGeneralUsuario;
	public JScrollPane jscrollPanedireccionDatoGeneralUsuario;
	public JButton jButtondireccionDatoGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioDatoGeneralUsuario;
	public JLabel jLabelid_usuarioDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioDatoGeneralUsuario;
	public JButton jButtonid_usuarioDatoGeneralUsuario= new JButtonMe();
	public JButton jButtonid_usuarioDatoGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_paisDatoGeneralUsuario;
	public JLabel jLabelid_paisDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisDatoGeneralUsuario;
	public JButton jButtonid_paisDatoGeneralUsuario= new JButtonMe();
	public JButton jButtonid_paisDatoGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_paisDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaDatoGeneralUsuario;
	public JLabel jLabelid_provinciaDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaDatoGeneralUsuario;
	public JButton jButtonid_provinciaDatoGeneralUsuario= new JButtonMe();
	public JButton jButtonid_provinciaDatoGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_provinciaDatoGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadDatoGeneralUsuario;
	public JLabel jLabelid_ciudadDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadDatoGeneralUsuario;
	public JButton jButtonid_ciudadDatoGeneralUsuario= new JButtonMe();
	public JButton jButtonid_ciudadDatoGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_ciudadDatoGeneralUsuarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDatoGeneralUsuario;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DatoGeneralUsuarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDatoGeneralUsuario=new JPanel();
				this.jPanelAccionesFormularioDatoGeneralUsuario=new JPanel();
				this.jmenuBarDetalleDatoGeneralUsuario=new JMenuBar();
				this.jTtoolBarDetalleDatoGeneralUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralUsuarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DatoGeneralUsuarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralUsuarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralUsuarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralUsuarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDatoGeneralUsuario() {
		return this.jButtonActualizarToolBarDatoGeneralUsuario;
	}
	
	public JButton getjButtonEliminarToolBarDatoGeneralUsuario() {
		return this.jButtonEliminarToolBarDatoGeneralUsuario;
	}
	
	public JButton getjButtonCancelarToolBarDatoGeneralUsuario() {
		return this.jButtonCancelarToolBarDatoGeneralUsuario;
	}		
	
	public JButton getjButtonProcesarInformacionDatoGeneralUsuario() {
		return this.jButtonProcesarInformacionDatoGeneralUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoGeneralUsuario)	{
		this.jButtonProcesarInformacionDatoGeneralUsuario = jButtonProcesarInformacionDatoGeneralUsuario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoGeneralUsuario() {
		return this.jComboBoxTiposAccionesDatoGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoGeneralUsuario(
			JComboBox jComboBoxTiposRelacionesDatoGeneralUsuario) {
		this.jComboBoxTiposRelacionesDatoGeneralUsuario = jComboBoxTiposRelacionesDatoGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoGeneralUsuario(
			JComboBox jComboBoxTiposAccionesDatoGeneralUsuario) {
		this.jComboBoxTiposAccionesDatoGeneralUsuario = jComboBoxTiposAccionesDatoGeneralUsuario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDatoGeneralUsuario() {
		return this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDatoGeneralUsuario(
			JComboBox jComboBoxTiposAccionesFormularioDatoGeneralUsuario) {
		this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario = jComboBoxTiposAccionesFormularioDatoGeneralUsuario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
		
		this.datogeneralusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datogeneralusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datogeneralusuarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoGeneralUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato General Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
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
	
		DatoGeneralUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDatoGeneralUsuario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDatoGeneralUsuario=new JButtonMe();
				this.jButtonModificarToolBarDatoGeneralUsuario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDatoGeneralUsuario,this.jTtoolBarDetalleDatoGeneralUsuario,
							"actualizar","actualizar","Actualizar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDatoGeneralUsuario,this.jTtoolBarDetalleDatoGeneralUsuario,
							"eliminar","eliminar","Eliminar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDatoGeneralUsuario,this.jTtoolBarDetalleDatoGeneralUsuario,
							"cancelar","cancelar","Cancelar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDatoGeneralUsuario,this.jTtoolBarDetalleDatoGeneralUsuario,
							"guardarcambios","guardarcambios","Guardar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDatoGeneralUsuario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDatoGeneralUsuario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDatoGeneralUsuario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDatoGeneralUsuario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDatoGeneralUsuario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoGeneralUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoGeneralUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoGeneralUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDatoGeneralUsuario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDatoGeneralUsuario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDatoGeneralUsuario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDatoGeneralUsuario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDatoGeneralUsuario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDatoGeneralUsuario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDatoGeneralUsuario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDatoGeneralUsuario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDatoGeneralUsuario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDatoGeneralUsuario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDatoGeneralUsuario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDatoGeneralUsuario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDatoGeneralUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoGeneralUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoGeneralUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoGeneralUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoGeneralUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoGeneralUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDatoGeneralUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDatoGeneralUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDatoGeneralUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoGeneralUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoGeneralUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoGeneralUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDatoGeneralUsuario.add(this.jMenuItemDetalleCerrarDatoGeneralUsuario);
		
		this.jmenuDetalleAccionesDatoGeneralUsuario.add(this.jMenuItemActualizarDatoGeneralUsuario);
		this.jmenuDetalleAccionesDatoGeneralUsuario.add(this.jMenuItemEliminarDatoGeneralUsuario);
		this.jmenuDetalleAccionesDatoGeneralUsuario.add(this.jMenuItemCancelarDatoGeneralUsuario);		
		
		//this.jmenuDetalleDatosDatoGeneralUsuario.add(this.jMenuItemDetalleAbrirOrderByDatoGeneralUsuario);				
		this.jmenuDetalleDatosDatoGeneralUsuario.add(this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario);				
				
		//this.jmenuDetalleAccionesDatoGeneralUsuario.add(this.jMenuItemGuardarCambiosDatoGeneralUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDatoGeneralUsuario.add(this.jmenuDetalleArchivoDatoGeneralUsuario);		
		this.jmenuBarDetalleDatoGeneralUsuario.add(this.jmenuDetalleAccionesDatoGeneralUsuario);		
		this.jmenuBarDetalleDatoGeneralUsuario.add(this.jmenuDetalleDatosDatoGeneralUsuario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDatoGeneralUsuario);				
	}
	
	
	public void inicializarElementosCamposDatoGeneralUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelcedulaDatoGeneralUsuario = new JLabelMe();
		this.jLabelcedulaDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA+" : *");
		this.jLabelcedulaDatoGeneralUsuario.setToolTipText("Cedula");
		this.jLabelcedulaDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcedulaDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcedulaDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcedulaDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelcedulaDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jTextFieldcedulaDatoGeneralUsuario= new JTextFieldMe();

		jTextFieldcedulaDatoGeneralUsuario.setEnabled(false);
		jTextFieldcedulaDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcedulaDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncedulaDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncedulaDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncedulaDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtoncedulaDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncedulaDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncedulaDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcedulaDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcedulaDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cedulaDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncedulaDatoGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelapellidosDatoGeneralUsuario = new JLabelMe();
		this.jLabelapellidosDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS+" : *");
		this.jLabelapellidosDatoGeneralUsuario.setToolTipText("Apellidos");
		this.jLabelapellidosDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidosDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidosDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidosDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidosDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidosDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelapellidosDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jTextAreaapellidosDatoGeneralUsuario= new JTextAreaMe();
		jTextAreaapellidosDatoGeneralUsuario.setEnabled(false);
		jTextAreaapellidosDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidosDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidosDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidosDatoGeneralUsuario.setLineWrap(true);
		jTextAreaapellidosDatoGeneralUsuario.setWrapStyleWord(true);
		jTextAreaapellidosDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidosDatoGeneralUsuario.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidosDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidosDatoGeneralUsuario = new JScrollPane(jTextAreaapellidosDatoGeneralUsuario);
		jscrollPaneapellidosDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneapellidosDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneapellidosDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonapellidosDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonapellidosDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidosDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidosDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidosDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtonapellidosDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidosDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidosDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidosDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidosDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidosDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidosDatoGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnombresDatoGeneralUsuario = new JLabelMe();
		this.jLabelnombresDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES+" : *");
		this.jLabelnombresDatoGeneralUsuario.setToolTipText("Nombres");
		this.jLabelnombresDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombresDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombresDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombresDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombresDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombresDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelnombresDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jTextAreanombresDatoGeneralUsuario= new JTextAreaMe();
		jTextAreanombresDatoGeneralUsuario.setEnabled(false);
		jTextAreanombresDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombresDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombresDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombresDatoGeneralUsuario.setLineWrap(true);
		jTextAreanombresDatoGeneralUsuario.setWrapStyleWord(true);
		jTextAreanombresDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombresDatoGeneralUsuario.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombresDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombresDatoGeneralUsuario = new JScrollPane(jTextAreanombresDatoGeneralUsuario);
		jscrollPanenombresDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombresDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombresDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombresDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonnombresDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombresDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombresDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombresDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtonnombresDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombresDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombresDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombresDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombresDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombresDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombresDatoGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoDatoGeneralUsuario = new JLabelMe();
		this.jLabeltelefonoDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoDatoGeneralUsuario.setToolTipText("Telefono");
		this.jLabeltelefonoDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPaneltelefonoDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jTextAreatelefonoDatoGeneralUsuario= new JTextAreaMe();
		jTextAreatelefonoDatoGeneralUsuario.setEnabled(false);
		jTextAreatelefonoDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoDatoGeneralUsuario.setLineWrap(true);
		jTextAreatelefonoDatoGeneralUsuario.setWrapStyleWord(true);
		jTextAreatelefonoDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoDatoGeneralUsuario.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoDatoGeneralUsuario = new JScrollPane(jTextAreatelefonoDatoGeneralUsuario);
		jscrollPanetelefonoDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonoDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtontelefonoDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtontelefonoDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoDatoGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_movilDatoGeneralUsuario = new JLabelMe();
		this.jLabeltelefono_movilDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL+" : *");
		this.jLabeltelefono_movilDatoGeneralUsuario.setToolTipText("Telefono Movil");
		this.jLabeltelefono_movilDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefono_movilDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefono_movilDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_movilDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_movilDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_movilDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPaneltelefono_movilDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jTextAreatelefono_movilDatoGeneralUsuario= new JTextAreaMe();
		jTextAreatelefono_movilDatoGeneralUsuario.setEnabled(false);
		jTextAreatelefono_movilDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_movilDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_movilDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_movilDatoGeneralUsuario.setLineWrap(true);
		jTextAreatelefono_movilDatoGeneralUsuario.setWrapStyleWord(true);
		jTextAreatelefono_movilDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_movilDatoGeneralUsuario.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_movilDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_movilDatoGeneralUsuario = new JScrollPane(jTextAreatelefono_movilDatoGeneralUsuario);
		jscrollPanetelefono_movilDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_movilDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_movilDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefono_movilDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtontelefono_movilDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_movilDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_movilDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_movilDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtontelefono_movilDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_movilDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_movilDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_movilDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_movilDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_movilDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_movilDatoGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabele_mailDatoGeneralUsuario = new JLabelMe();
		this.jLabele_mailDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabele_mailDatoGeneralUsuario.setToolTipText("E Mail");
		this.jLabele_mailDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabele_mailDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanele_mailDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanele_mailDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanele_mailDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jTextAreae_mailDatoGeneralUsuario= new JTextAreaMe();
		jTextAreae_mailDatoGeneralUsuario.setEnabled(false);
		jTextAreae_mailDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailDatoGeneralUsuario.setLineWrap(true);
		jTextAreae_mailDatoGeneralUsuario.setWrapStyleWord(true);
		jTextAreae_mailDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreae_mailDatoGeneralUsuario.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreae_mailDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanee_mailDatoGeneralUsuario = new JScrollPane(jTextAreae_mailDatoGeneralUsuario);
		jscrollPanee_mailDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mailDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mailDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtone_mailDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtone_mailDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtone_mailDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtone_mailDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtone_mailDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtone_mailDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreae_mailDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreae_mailDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"e_mailDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtone_mailDatoGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelurlDatoGeneralUsuario = new JLabelMe();
		this.jLabelurlDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_URL+" : *");
		this.jLabelurlDatoGeneralUsuario.setToolTipText("Url");
		this.jLabelurlDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelurlDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelurlDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelurlDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelurlDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelurlDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_URL);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelurlDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jTextAreaurlDatoGeneralUsuario= new JTextAreaMe();
		jTextAreaurlDatoGeneralUsuario.setEnabled(false);
		jTextAreaurlDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaurlDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaurlDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaurlDatoGeneralUsuario.setLineWrap(true);
		jTextAreaurlDatoGeneralUsuario.setWrapStyleWord(true);
		jTextAreaurlDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaurlDatoGeneralUsuario.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaurlDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneurlDatoGeneralUsuario = new JScrollPane(jTextAreaurlDatoGeneralUsuario);
		jscrollPaneurlDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneurlDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneurlDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonurlDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonurlDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonurlDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonurlDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonurlDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtonurlDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonurlDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonurlDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaurlDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaurlDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"urlDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonurlDatoGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_nacimientoDatoGeneralUsuario = new JLabelMe();
		this.jLabelfecha_nacimientoDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO+" : *");
		this.jLabelfecha_nacimientoDatoGeneralUsuario.setToolTipText("Fecha Nacimiento");
		this.jLabelfecha_nacimientoDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimientoDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimientoDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelfecha_nacimientoDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		//jFormattedTextFieldfecha_nacimientoDatoGeneralUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimientoDatoGeneralUsuario= new JDateChooser();
		jDateChooserfecha_nacimientoDatoGeneralUsuario.setEnabled(false);
		jDateChooserfecha_nacimientoDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimientoDatoGeneralUsuario.setDate(new Date());
		jDateChooserfecha_nacimientoDatoGeneralUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimientoDatoGeneralUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimientoDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimientoDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimientoDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeldireccionDatoGeneralUsuario = new JLabelMe();
		this.jLabeldireccionDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionDatoGeneralUsuario.setToolTipText("Direccion");
		this.jLabeldireccionDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPaneldireccionDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jTextAreadireccionDatoGeneralUsuario= new JTextAreaMe();
		jTextAreadireccionDatoGeneralUsuario.setEnabled(false);
		jTextAreadireccionDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDatoGeneralUsuario.setLineWrap(true);
		jTextAreadireccionDatoGeneralUsuario.setWrapStyleWord(true);
		jTextAreadireccionDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionDatoGeneralUsuario.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionDatoGeneralUsuario = new JScrollPane(jTextAreadireccionDatoGeneralUsuario);
		jscrollPanedireccionDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtondireccionDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtondireccionDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionDatoGeneralUsuarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDatoGeneralUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_usuarioDatoGeneralUsuario = new JLabelMe();
		this.jLabelid_usuarioDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_ID+" : *");
		this.jLabelid_usuarioDatoGeneralUsuario.setToolTipText("Id");
		this.jLabelid_usuarioDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelid_usuarioDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jComboBoxid_usuarioDatoGeneralUsuario= new JComboBoxMe();
		jComboBoxid_usuarioDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_usuarioDatoGeneralUsuario= new JButtonMe();
		this.jButtonid_usuarioDatoGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDatoGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDatoGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDatoGeneralUsuario.setText("Buscar");
		this.jButtonid_usuarioDatoGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioDatoGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDatoGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDatoGeneralUsuario"));

		this.jButtonid_usuarioDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_usuarioDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_usuarioDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioDatoGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioDatoGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_usuarioDatoGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDatoGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDatoGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDatoGeneralUsuarioUpdate.setText("U");
		this.jButtonid_usuarioDatoGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioDatoGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDatoGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDatoGeneralUsuarioUpdate"));



					
		this.jLabelid_paisDatoGeneralUsuario = new JLabelMe();
		this.jLabelid_paisDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisDatoGeneralUsuario.setToolTipText("Pais");
		this.jLabelid_paisDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelid_paisDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jComboBoxid_paisDatoGeneralUsuario= new JComboBoxMe();
		jComboBoxid_paisDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisDatoGeneralUsuario= new JButtonMe();
		this.jButtonid_paisDatoGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisDatoGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisDatoGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisDatoGeneralUsuario.setText("Buscar");
		this.jButtonid_paisDatoGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisDatoGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisDatoGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisDatoGeneralUsuario"));

		this.jButtonid_paisDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_paisDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_paisDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisDatoGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_paisDatoGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_paisDatoGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisDatoGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisDatoGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisDatoGeneralUsuarioUpdate.setText("U");
		this.jButtonid_paisDatoGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisDatoGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisDatoGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisDatoGeneralUsuarioUpdate"));



					
		this.jLabelid_provinciaDatoGeneralUsuario = new JLabelMe();
		this.jLabelid_provinciaDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaDatoGeneralUsuario.setToolTipText("Provincia");
		this.jLabelid_provinciaDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelid_provinciaDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jComboBoxid_provinciaDatoGeneralUsuario= new JComboBoxMe();
		jComboBoxid_provinciaDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaDatoGeneralUsuario= new JButtonMe();
		this.jButtonid_provinciaDatoGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaDatoGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaDatoGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaDatoGeneralUsuario.setText("Buscar");
		this.jButtonid_provinciaDatoGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaDatoGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaDatoGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaDatoGeneralUsuario"));

		this.jButtonid_provinciaDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_provinciaDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_provinciaDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaDatoGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_provinciaDatoGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_provinciaDatoGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaDatoGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaDatoGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaDatoGeneralUsuarioUpdate.setText("U");
		this.jButtonid_provinciaDatoGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaDatoGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaDatoGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaDatoGeneralUsuarioUpdate"));



					
		this.jLabelid_ciudadDatoGeneralUsuario = new JLabelMe();
		this.jLabelid_ciudadDatoGeneralUsuario.setText(""+DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadDatoGeneralUsuario.setToolTipText("Ciudad");
		this.jLabelid_ciudadDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadDatoGeneralUsuario.setToolTipText(DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		this.jPanelid_ciudadDatoGeneralUsuario.setLayout(this.gridaBagLayoutDatoGeneralUsuario);


		jComboBoxid_ciudadDatoGeneralUsuario= new JComboBoxMe();
		jComboBoxid_ciudadDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadDatoGeneralUsuario= new JButtonMe();
		this.jButtonid_ciudadDatoGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadDatoGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadDatoGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadDatoGeneralUsuario.setText("Buscar");
		this.jButtonid_ciudadDatoGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadDatoGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadDatoGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadDatoGeneralUsuario"));

		this.jButtonid_ciudadDatoGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_ciudadDatoGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadDatoGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadDatoGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadDatoGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_ciudadDatoGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadDatoGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadDatoGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadDatoGeneralUsuarioBusqueda"));

		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadDatoGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_ciudadDatoGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_ciudadDatoGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadDatoGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadDatoGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadDatoGeneralUsuarioUpdate.setText("U");
		this.jButtonid_ciudadDatoGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadDatoGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadDatoGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadDatoGeneralUsuarioUpdate"));



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
		//this.jInternalFrameDetalleDatoGeneralUsuario = new DatoGeneralUsuarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dato General Usuario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoGeneralUsuario= new GridBagLayout();
		

		
		String sToolTipDatoGeneralUsuario="";
		sToolTipDatoGeneralUsuario=DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoGeneralUsuario+="(Seguridad.DatoGeneralUsuario)";
		}
		
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoGeneralUsuario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDatoGeneralUsuario = new JButtonMe();
		this.jButtonModificarDatoGeneralUsuario = new JButtonMe();
        this.jButtonActualizarDatoGeneralUsuario = new JButtonMe();
        this.jButtonEliminarDatoGeneralUsuario = new JButtonMe();
        this.jButtonCancelarDatoGeneralUsuario = new JButtonMe();
        this.jButtonGuardarCambiosDatoGeneralUsuario = new JButtonMe();
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario = new JButtonMe();
		this.jButtonCerrarDatoGeneralUsuario = new JButtonMe();
		
		this.jScrollPanelDatosDatoGeneralUsuario = new JScrollPane();   
        this.jScrollPanelDatosEdicionDatoGeneralUsuario = new JScrollPane();
		this.jScrollPanelDatosGeneralDatoGeneralUsuario = new JScrollPane();
				
		
		
		this.jPanelCamposDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dato General Usuario";
		
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDatoGeneralUsuario.setName("jPanelCamposDatoGeneralUsuario"); 

		this.jPanelCamposOcultosDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDatoGeneralUsuario.setName("jPanelCamposOcultosDatoGeneralUsuario"); 

        this.jPanelAccionesDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoGeneralUsuario.setToolTipText("Acciones");
        this.jPanelAccionesDatoGeneralUsuario.setName("Acciones"); 

		this.jPanelAccionesFormularioDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDatoGeneralUsuario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDatoGeneralUsuario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDatoGeneralUsuario.setText("Nuevo");
		this.jButtonModificarDatoGeneralUsuario.setText("Editar");
        this.jButtonActualizarDatoGeneralUsuario.setText("Actualizar");
        this.jButtonEliminarDatoGeneralUsuario.setText("Eliminar");
        this.jButtonCancelarDatoGeneralUsuario.setText("Cancelar");
        this.jButtonGuardarCambiosDatoGeneralUsuario.setText("Guardar");
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.setText("Guardar");
		this.jButtonCerrarDatoGeneralUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoGeneralUsuario,"nuevo_button","Nuevo",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDatoGeneralUsuario,"modificar_button","Editar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDatoGeneralUsuario,"actualizar_button","Actualizar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDatoGeneralUsuario,"eliminar_button","Eliminar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDatoGeneralUsuario,"cancelar_button","Cancelar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDatoGeneralUsuario,"guardarcambios_button","Guardar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoGeneralUsuario,"guardarcambiostabla_button","Guardar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoGeneralUsuario,"cerrar_button","Salir",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDatoGeneralUsuario.setToolTipText("Nuevo"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDatoGeneralUsuario.setToolTipText("Editar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDatoGeneralUsuario.setToolTipText("Actualizar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDatoGeneralUsuario.setToolTipText("Eliminar)"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDatoGeneralUsuario.setToolTipText("Cancelar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDatoGeneralUsuario.setToolTipText("Guardar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.setToolTipText("Guardar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoGeneralUsuario.setToolTipText("Salir"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoGeneralUsuario";
		inputMap = this.jButtonNuevoDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoGeneralUsuario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDatoGeneralUsuario";
		inputMap = this.jButtonActualizarDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDatoGeneralUsuario"));
		
		//ELIMINAR
		sMapKey = "EliminarDatoGeneralUsuario";
		inputMap = this.jButtonEliminarDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDatoGeneralUsuario"));
		
		//CANCELAR	
		sMapKey = "CancelarDatoGeneralUsuario";
		inputMap = this.jButtonCancelarDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDatoGeneralUsuario"));
		
		//CERRAR		
		sMapKey = "CerrarDatoGeneralUsuario";
		inputMap = this.jButtonCerrarDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoGeneralUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoGeneralUsuario";
		inputMap = this.jButtonGuardarCambiosTablaDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoGeneralUsuario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDatoGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDatoGeneralUsuario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDatoGeneralUsuario.setToolTipText("Nuevo DatoGeneralUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDatoGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDatoGeneralUsuario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDatoGeneralUsuario.setToolTipText("Sin Cerrar Ventana DatoGeneralUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDatoGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDatoGeneralUsuario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDatoGeneralUsuario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoGeneralUsuario.setText("Accion");
		this.jComboBoxTiposAccionesDatoGeneralUsuario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDatoGeneralUsuario = new JLabelMe();
		
		this.jLabelAccionesDatoGeneralUsuario.setText("Acciones");		
		this.jLabelAccionesDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDatoGeneralUsuario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDatoGeneralUsuario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDatoGeneralUsuario=new JTabbedPane();
		this.jTabbedPaneRelacionesDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDatoGeneralUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoGeneralUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoGeneralUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDatoGeneralUsuario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDatoGeneralUsuario = new GridBagLayout();
		
		this.jPanelCamposDatoGeneralUsuario.setLayout(gridaBagLayoutCamposDatoGeneralUsuario);
		this.jPanelCamposOcultosDatoGeneralUsuario.setLayout(gridaBagLayoutCamposOcultosDatoGeneralUsuario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioDatoGeneralUsuario.add(jLabelid_usuarioDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDatoGeneralUsuario.add(jButtonid_usuarioDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 3;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDatoGeneralUsuario.add(jButtonid_usuarioDatoGeneralUsuarioUpdate, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioDatoGeneralUsuario.add(jComboBoxid_usuarioDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisDatoGeneralUsuario.add(jLabelid_paisDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisDatoGeneralUsuario.add(jButtonid_paisDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 3;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisDatoGeneralUsuario.add(jButtonid_paisDatoGeneralUsuarioUpdate, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisDatoGeneralUsuario.add(jComboBoxid_paisDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaDatoGeneralUsuario.add(jLabelid_provinciaDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaDatoGeneralUsuario.add(jButtonid_provinciaDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 3;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaDatoGeneralUsuario.add(jButtonid_provinciaDatoGeneralUsuarioUpdate, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaDatoGeneralUsuario.add(jComboBoxid_provinciaDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadDatoGeneralUsuario.add(jLabelid_ciudadDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadDatoGeneralUsuario.add(jButtonid_ciudadDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 3;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadDatoGeneralUsuario.add(jButtonid_ciudadDatoGeneralUsuarioUpdate, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadDatoGeneralUsuario.add(jComboBoxid_ciudadDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcedulaDatoGeneralUsuario.add(jLabelcedulaDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcedulaDatoGeneralUsuario.add(jButtoncedulaDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcedulaDatoGeneralUsuario.add(jTextFieldcedulaDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidosDatoGeneralUsuario.add(jLabelapellidosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidosDatoGeneralUsuario.add(jButtonapellidosDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidosDatoGeneralUsuario.add(jscrollPaneapellidosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombresDatoGeneralUsuario.add(jLabelnombresDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombresDatoGeneralUsuario.add(jButtonnombresDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombresDatoGeneralUsuario.add(jscrollPanenombresDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoDatoGeneralUsuario.add(jLabeltelefonoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoDatoGeneralUsuario.add(jButtontelefonoDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoDatoGeneralUsuario.add(jscrollPanetelefonoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_movilDatoGeneralUsuario.add(jLabeltelefono_movilDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_movilDatoGeneralUsuario.add(jButtontelefono_movilDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_movilDatoGeneralUsuario.add(jscrollPanetelefono_movilDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanele_mailDatoGeneralUsuario.add(jLabele_mailDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanele_mailDatoGeneralUsuario.add(jButtone_mailDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanele_mailDatoGeneralUsuario.add(jscrollPanee_mailDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelurlDatoGeneralUsuario.add(jLabelurlDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelurlDatoGeneralUsuario.add(jButtonurlDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelurlDatoGeneralUsuario.add(jscrollPaneurlDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimientoDatoGeneralUsuario.add(jLabelfecha_nacimientoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimientoDatoGeneralUsuario.add(jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimientoDatoGeneralUsuario.add(jDateChooserfecha_nacimientoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionDatoGeneralUsuario.add(jLabeldireccionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 2;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionDatoGeneralUsuario.add(jButtondireccionDatoGeneralUsuarioBusqueda, this.gridBagConstraintsDatoGeneralUsuario);
	}

	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = 1;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionDatoGeneralUsuario.add(jscrollPanedireccionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelid_usuarioDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelid_paisDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelid_provinciaDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelid_ciudadDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelcedulaDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelapellidosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelnombresDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPaneltelefonoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPaneltelefono_movilDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanele_mailDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelurlDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPanelfecha_nacimientoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
	this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralUsuario.gridy = iYPanelCamposDatoGeneralUsuario;
	this.gridBagConstraintsDatoGeneralUsuario.gridx = iXPanelCamposDatoGeneralUsuario++;
	this.gridBagConstraintsDatoGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralUsuario.add(this.jPaneldireccionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);



	if(iXPanelCamposDatoGeneralUsuario % 2==0) {
		iXPanelCamposDatoGeneralUsuario=0;
		iYPanelCamposDatoGeneralUsuario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesDatoGeneralUsuario= new GridBagLayout();
		this.jPanelAccionesDatoGeneralUsuario.setLayout(gridaBagLayoutAccionesDatoGeneralUsuario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDatoGeneralUsuario= new GridBagLayout();
		this.jPanelAccionesFormularioDatoGeneralUsuario.setLayout(gridaBagLayoutAccionesFormularioDatoGeneralUsuario);
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDatoGeneralUsuario.add(this.jComboBoxTiposAccionesFormularioDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);

			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoGeneralUsuario.add(this.jCheckBoxPostAccionSinCerrarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoGeneralUsuario.add(this.jCheckBoxPostAccionSinMensajeDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccion++;
			
		this.jPanelAccionesDatoGeneralUsuario.add(this.jButtonModificarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);							

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx =iPosXAccion++;
			
		this.jPanelAccionesDatoGeneralUsuario.add(this.jButtonEliminarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
			
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoGeneralUsuario.add(this.jButtonActualizarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);


		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoGeneralUsuario.add(this.jButtonGuardarCambiosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);	
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx =iPosXAccion++;
		
		this.jPanelAccionesDatoGeneralUsuario.add(this.jButtonCancelarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoGeneralUsuario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();						
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;		
			//this.gridBagConstraintsDatoGeneralUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoGeneralUsuario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoGeneralUsuario.gridx =0;
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoGeneralUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDatoGeneralUsuario = new DatoGeneralUsuarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dato General Usuario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Dato General Usuario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato General Usuario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DatoGeneralUsuarioModel datogeneralusuarioModel=new DatoGeneralUsuarioModel(this);
			
			//SI USARA CLASE INTERNA
			//DatoGeneralUsuarioModel.DatoGeneralUsuarioFocusTraversalPolicy datogeneralusuarioFocusTraversalPolicy = datogeneralusuarioModel.new DatoGeneralUsuarioFocusTraversalPolicy(this);
			
			//datogeneralusuarioFocusTraversalPolicy.setdatogeneralusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(datogeneralusuarioModel);
			
			
			this.jContentPaneDetalleDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDatoGeneralUsuario = new GridBagLayout();	
			this.jContentPaneDetalleDatoGeneralUsuario.setLayout(gridaBagLayoutDetalleDatoGeneralUsuario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoGeneralUsuario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
				this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
					
				
				this.jContentPaneDetalleDatoGeneralUsuario.add(jTtoolBarDetalleDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);								
				
}
			
			this.jScrollPanelDatosEdicionDatoGeneralUsuario=   new JScrollPane(jContentPaneDetalleDatoGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDatoGeneralUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	        
			this.jContentPaneDetalleDatoGeneralUsuario.add(jPanelCamposDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);
			
			
			
			
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
						&& datogeneralusuarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDatoGeneralUsuario= new GridBagConstraints();
						this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
						this.jContentPaneDetalleDatoGeneralUsuario.add(this.jTabbedPaneRelacionesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDatoGeneralUsuario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDatoGeneralUsuario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
					this.gridBagConstraintsDatoGeneralUsuario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
					
				
					this.jContentPaneDetalleDatoGeneralUsuario.add(jPanelCamposOcultosDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);
				
					this.jPanelCamposOcultosDatoGeneralUsuario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	        this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDatoGeneralUsuario.add(this.jPanelAccionesFormularioDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);							
			
			
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
	        this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
	        
			
			this.jContentPaneDetalleDatoGeneralUsuario.add(this.jPanelAccionesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDatoGeneralUsuario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDatoGeneralUsuario=   new JScrollPane(this.jPanelCamposDatoGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDatoGeneralUsuario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			
			
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
			
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDatoGeneralUsuario;//jContentPane;
		
		return jScrollPanelDatosEdicionDatoGeneralUsuario;
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
