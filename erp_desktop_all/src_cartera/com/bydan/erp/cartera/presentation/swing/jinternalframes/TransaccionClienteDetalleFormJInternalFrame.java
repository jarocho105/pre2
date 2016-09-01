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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TransaccionClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TransaccionClienteDetalleFormJInternalFrame extends TransaccionClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransaccionCliente;
	
	protected JMenuBar jmenuBarDetalleTransaccionCliente;
	
	protected JMenu jmenuDetalleTransaccionCliente;
	protected JMenu jmenuDetalleArchivoTransaccionCliente;
	protected JMenu jmenuDetalleAccionesTransaccionCliente;
	protected JMenu jmenuDetalleDatosTransaccionCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionCliente;	
	protected GridBagConstraints gridBagConstraintsTransaccionCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransaccionClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransaccionCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccion1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion1="";

	protected TransaccionBeanSwingJInternalFrame transaccion2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion2="";

	protected TransaccionBeanSwingJInternalFrame transaccion3BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion3="";

	protected TransaccionBeanSwingJInternalFrame transaccion4BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion4="";

	protected TransaccionBeanSwingJInternalFrame transaccion5BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion5="";
	
	public TransaccionClienteSessionBean transaccionclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccion1SessionBean;
	public TransaccionSessionBean transaccion2SessionBean;
	public TransaccionSessionBean transaccion3SessionBean;
	public TransaccionSessionBean transaccion4SessionBean;
	public TransaccionSessionBean transaccion5SessionBean;	
	
	public TransaccionClienteLogic transaccionclienteLogic;
	
	public JScrollPane jScrollPanelDatosTransaccionCliente;
	public JScrollPane jScrollPanelDatosEdicionTransaccionCliente;
	public JScrollPane jScrollPanelDatosGeneralTransaccionCliente;
	
	protected JPanel jPanelCamposTransaccionCliente;    
	protected JPanel jPanelCamposOcultosTransaccionCliente;    	
	protected JPanel jPanelAccionesTransaccionCliente;
	protected JPanel jPanelAccionesFormularioTransaccionCliente;
    
	
	
	protected Integer iXPanelCamposTransaccionCliente=0;
	protected Integer iYPanelCamposTransaccionCliente=0;
	
	protected Integer iXPanelCamposOcultosTransaccionCliente=0;
	protected Integer iYPanelCamposOcultosTransaccionCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransaccionCliente;
	public JButton jButtonModificarTransaccionCliente;
	public JButton jButtonActualizarTransaccionCliente;
    public JButton jButtonEliminarTransaccionCliente;
	public JButton jButtonCancelarTransaccionCliente;
    public JButton jButtonGuardarCambiosTransaccionCliente;
	public JButton jButtonGuardarCambiosTablaTransaccionCliente;
	protected JButton jButtonCerrarTransaccionCliente;
	
	
	protected JButton jButtonProcesarInformacionTransaccionCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransaccionCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransaccionCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransaccionCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionCliente;
	protected JButton jButtonModificarToolBarTransaccionCliente;
	protected JButton jButtonActualizarToolBarTransaccionCliente;
    protected JButton jButtonEliminarToolBarTransaccionCliente;
	protected JButton jButtonCancelarToolBarTransaccionCliente;
    protected JButton jButtonGuardarCambiosToolBarTransaccionCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarTransaccionCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionCliente;
	protected JButton jButtonCerrarToolBarTransaccionCliente;
	
	protected JButton jButtonProcesarInformacionToolBarTransaccionCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionCliente;
	protected JMenuItem jMenuItemModificarTransaccionCliente;
	protected JMenuItem jMenuItemActualizarTransaccionCliente;
    protected JMenuItem jMenuItemEliminarTransaccionCliente;
	protected JMenuItem jMenuItemCancelarTransaccionCliente;
    protected JMenuItem jMenuItemGuardarCambiosTransaccionCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionCliente;
	protected JMenuItem jMenuItemCerrarTransaccionCliente;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionTransaccionCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionCliente;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransaccionCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransaccionCliente;
	public JLabel jLabelIdTransaccionCliente;
	public JLabel jLabelidTransaccionCliente;
	public JButton jButtonidTransaccionClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTransaccionCliente;
	public JLabel jLabelnombreTransaccionCliente;
	public JTextArea jTextAreanombreTransaccionCliente;
	public JScrollPane jscrollPanenombreTransaccionCliente;
	public JButton jButtonnombreTransaccionClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransaccionCliente;
	public JLabel jLabelid_empresaTransaccionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransaccionCliente;
	public JButton jButtonid_empresaTransaccionCliente= new JButtonMe();
	public JButton jButtonid_empresaTransaccionClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransaccionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloTransaccionCliente;
	public JLabel jLabelid_moduloTransaccionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTransaccionCliente;
	public JButton jButtonid_moduloTransaccionCliente= new JButtonMe();
	public JButton jButtonid_moduloTransaccionClienteUpdate= new JButtonMe();
	public JButton jButtonid_moduloTransaccionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion1TransaccionCliente;
	public JLabel jLabelid_transaccion1TransaccionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion1TransaccionCliente;
	public JButton jButtonid_transaccion1TransaccionCliente= new JButtonMe();
	public JButton jButtonid_transaccion1TransaccionClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion1TransaccionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion2TransaccionCliente;
	public JLabel jLabelid_transaccion2TransaccionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion2TransaccionCliente;
	public JButton jButtonid_transaccion2TransaccionCliente= new JButtonMe();
	public JButton jButtonid_transaccion2TransaccionClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion2TransaccionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion3TransaccionCliente;
	public JLabel jLabelid_transaccion3TransaccionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion3TransaccionCliente;
	public JButton jButtonid_transaccion3TransaccionCliente= new JButtonMe();
	public JButton jButtonid_transaccion3TransaccionClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion3TransaccionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion4TransaccionCliente;
	public JLabel jLabelid_transaccion4TransaccionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion4TransaccionCliente;
	public JButton jButtonid_transaccion4TransaccionCliente= new JButtonMe();
	public JButton jButtonid_transaccion4TransaccionClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion4TransaccionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion5TransaccionCliente;
	public JLabel jLabelid_transaccion5TransaccionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion5TransaccionCliente;
	public JButton jButtonid_transaccion5TransaccionCliente= new JButtonMe();
	public JButton jButtonid_transaccion5TransaccionClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccion5TransaccionClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransaccionCliente;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransaccionClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransaccionCliente=new JPanel();
				this.jPanelAccionesFormularioTransaccionCliente=new JPanel();
				this.jmenuBarDetalleTransaccionCliente=new JMenuBar();
				this.jTtoolBarDetalleTransaccionCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransaccionClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransaccionCliente() {
		return this.jButtonActualizarToolBarTransaccionCliente;
	}
	
	public JButton getjButtonEliminarToolBarTransaccionCliente() {
		return this.jButtonEliminarToolBarTransaccionCliente;
	}
	
	public JButton getjButtonCancelarToolBarTransaccionCliente() {
		return this.jButtonCancelarToolBarTransaccionCliente;
	}		
	
	public JButton getjButtonProcesarInformacionTransaccionCliente() {
		return this.jButtonProcesarInformacionTransaccionCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionCliente)	{
		this.jButtonProcesarInformacionTransaccionCliente = jButtonProcesarInformacionTransaccionCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionCliente() {
		return this.jComboBoxTiposAccionesTransaccionCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionCliente(
			JComboBox jComboBoxTiposRelacionesTransaccionCliente) {
		this.jComboBoxTiposRelacionesTransaccionCliente = jComboBoxTiposRelacionesTransaccionCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionCliente(
			JComboBox jComboBoxTiposAccionesTransaccionCliente) {
		this.jComboBoxTiposAccionesTransaccionCliente = jComboBoxTiposAccionesTransaccionCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransaccionCliente() {
		return this.jComboBoxTiposAccionesFormularioTransaccionCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransaccionCliente(
			JComboBox jComboBoxTiposAccionesFormularioTransaccionCliente) {
		this.jComboBoxTiposAccionesFormularioTransaccionCliente = jComboBoxTiposAccionesFormularioTransaccionCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
		
		this.transaccionclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccionclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccionclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Analisis Transaccion Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		TransaccionClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransaccionCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransaccionCliente=new JButtonMe();
				this.jButtonModificarToolBarTransaccionCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransaccionCliente,this.jTtoolBarDetalleTransaccionCliente,
							"actualizar","actualizar","Actualizar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransaccionCliente,this.jTtoolBarDetalleTransaccionCliente,
							"eliminar","eliminar","Eliminar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransaccionCliente,this.jTtoolBarDetalleTransaccionCliente,
							"cancelar","cancelar","Cancelar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransaccionCliente,this.jTtoolBarDetalleTransaccionCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransaccionCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransaccionCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransaccionCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransaccionCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransaccionCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransaccionCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransaccionCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransaccionCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransaccionCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransaccionCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransaccionCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransaccionCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransaccionCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransaccionCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransaccionCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransaccionCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransaccionCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransaccionCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransaccionCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransaccionCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransaccionCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransaccionCliente.add(this.jMenuItemDetalleCerrarTransaccionCliente);
		
		this.jmenuDetalleAccionesTransaccionCliente.add(this.jMenuItemActualizarTransaccionCliente);
		this.jmenuDetalleAccionesTransaccionCliente.add(this.jMenuItemEliminarTransaccionCliente);
		this.jmenuDetalleAccionesTransaccionCliente.add(this.jMenuItemCancelarTransaccionCliente);		
		
		//this.jmenuDetalleDatosTransaccionCliente.add(this.jMenuItemDetalleAbrirOrderByTransaccionCliente);				
		this.jmenuDetalleDatosTransaccionCliente.add(this.jMenuItemDetalleMostarOcultarTransaccionCliente);				
				
		//this.jmenuDetalleAccionesTransaccionCliente.add(this.jMenuItemGuardarCambiosTransaccionCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransaccionCliente.add(this.jmenuDetalleArchivoTransaccionCliente);		
		this.jmenuBarDetalleTransaccionCliente.add(this.jmenuDetalleAccionesTransaccionCliente);		
		this.jmenuBarDetalleTransaccionCliente.add(this.jmenuDetalleDatosTransaccionCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransaccionCliente);				
	}
	
	
	public void inicializarElementosCamposTransaccionCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransaccionCliente = new JLabelMe();
		jLabelIdTransaccionCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransaccionCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransaccionCliente= new GridBagLayout();

		this.jPanelidTransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);

		jLabelidTransaccionCliente = new JLabel();
		jLabelidTransaccionCliente.setText("Id");

		jLabelidTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTransaccionCliente = new JLabelMe();
		this.jLabelnombreTransaccionCliente.setText(""+TransaccionClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTransaccionCliente.setToolTipText("Nombre");
		this.jLabelnombreTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTransaccionCliente = new GridBagLayout();
		this.jPanelnombreTransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);


		jTextAreanombreTransaccionCliente= new JTextAreaMe();
		jTextAreanombreTransaccionCliente.setEnabled(false);
		jTextAreanombreTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccionCliente.setLineWrap(true);
		jTextAreanombreTransaccionCliente.setWrapStyleWord(true);
		jTextAreanombreTransaccionCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTransaccionCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTransaccionCliente = new JScrollPane(jTextAreanombreTransaccionCliente);
		jscrollPanenombreTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTransaccionClienteBusqueda= new JButtonMe();
		this.jButtonnombreTransaccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransaccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransaccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTransaccionClienteBusqueda.setText("U");
		this.jButtonnombreTransaccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTransaccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTransaccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTransaccionClienteBusqueda"));

		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTransaccionClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransaccionCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransaccionCliente = new JLabelMe();
		this.jLabelid_empresaTransaccionCliente.setText(""+TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransaccionCliente.setToolTipText("Empresa");
		this.jLabelid_empresaTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransaccionCliente = new GridBagLayout();
		this.jPanelid_empresaTransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);


		jComboBoxid_empresaTransaccionCliente= new JComboBoxMe();
		jComboBoxid_empresaTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransaccionCliente.setEnabled(false);

		this.jButtonid_empresaTransaccionCliente= new JButtonMe();
		this.jButtonid_empresaTransaccionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionCliente.setText("Buscar");
		this.jButtonid_empresaTransaccionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransaccionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionCliente"));

		this.jButtonid_empresaTransaccionClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaTransaccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionClienteBusqueda.setText("U");
		this.jButtonid_empresaTransaccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransaccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionClienteBusqueda"));

		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransaccionClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransaccionClienteUpdate= new JButtonMe();
		this.jButtonid_empresaTransaccionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionClienteUpdate.setText("U");
		this.jButtonid_empresaTransaccionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransaccionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionClienteUpdate"));



					
		this.jLabelid_moduloTransaccionCliente = new JLabelMe();
		this.jLabelid_moduloTransaccionCliente.setText(""+TransaccionClienteConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTransaccionCliente.setToolTipText("Modulo");
		this.jLabelid_moduloTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTransaccionCliente = new GridBagLayout();
		this.jPanelid_moduloTransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);


		jComboBoxid_moduloTransaccionCliente= new JComboBoxMe();
		jComboBoxid_moduloTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloTransaccionCliente.setEnabled(false);

		this.jButtonid_moduloTransaccionCliente= new JButtonMe();
		this.jButtonid_moduloTransaccionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccionCliente.setText("Buscar");
		this.jButtonid_moduloTransaccionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTransaccionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccionCliente"));

		this.jButtonid_moduloTransaccionClienteBusqueda= new JButtonMe();
		this.jButtonid_moduloTransaccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTransaccionClienteBusqueda.setText("U");
		this.jButtonid_moduloTransaccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTransaccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccionClienteBusqueda"));

		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTransaccionClienteBusqueda.setVisible(false);		}

		this.jButtonid_moduloTransaccionClienteUpdate= new JButtonMe();
		this.jButtonid_moduloTransaccionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTransaccionClienteUpdate.setText("U");
		this.jButtonid_moduloTransaccionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTransaccionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccionClienteUpdate"));



					
		this.jLabelid_transaccion1TransaccionCliente = new JLabelMe();
		this.jLabelid_transaccion1TransaccionCliente.setText(""+TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1+" : *");
		this.jLabelid_transaccion1TransaccionCliente.setToolTipText("Transaccion1");
		this.jLabelid_transaccion1TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion1TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion1TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion1TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion1TransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion1TransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION1);
		this.gridaBagLayoutTransaccionCliente = new GridBagLayout();
		this.jPanelid_transaccion1TransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);


		jComboBoxid_transaccion1TransaccionCliente= new JComboBoxMe();
		jComboBoxid_transaccion1TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion1TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion1TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion1TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion1TransaccionCliente= new JButtonMe();
		this.jButtonid_transaccion1TransaccionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion1TransaccionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion1TransaccionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion1TransaccionCliente.setText("Buscar");
		this.jButtonid_transaccion1TransaccionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion1TransaccionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion1TransaccionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion1TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion1TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion1TransaccionCliente"));

		this.jButtonid_transaccion1TransaccionClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion1TransaccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion1TransaccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion1TransaccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion1TransaccionClienteBusqueda.setText("U");
		this.jButtonid_transaccion1TransaccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion1TransaccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion1TransaccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion1TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion1TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion1TransaccionClienteBusqueda"));

		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion1TransaccionClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion1TransaccionClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion1TransaccionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion1TransaccionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion1TransaccionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion1TransaccionClienteUpdate.setText("U");
		this.jButtonid_transaccion1TransaccionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion1TransaccionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion1TransaccionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion1TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion1TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion1TransaccionClienteUpdate"));



					
		this.jLabelid_transaccion2TransaccionCliente = new JLabelMe();
		this.jLabelid_transaccion2TransaccionCliente.setText(""+TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2+" :");
		this.jLabelid_transaccion2TransaccionCliente.setToolTipText("Transaccion2");
		this.jLabelid_transaccion2TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion2TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion2TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion2TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion2TransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion2TransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION2);
		this.gridaBagLayoutTransaccionCliente = new GridBagLayout();
		this.jPanelid_transaccion2TransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);


		jComboBoxid_transaccion2TransaccionCliente= new JComboBoxMe();
		jComboBoxid_transaccion2TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion2TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion2TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion2TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion2TransaccionCliente= new JButtonMe();
		this.jButtonid_transaccion2TransaccionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion2TransaccionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion2TransaccionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion2TransaccionCliente.setText("Buscar");
		this.jButtonid_transaccion2TransaccionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion2TransaccionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion2TransaccionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion2TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion2TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion2TransaccionCliente"));

		this.jButtonid_transaccion2TransaccionClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion2TransaccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion2TransaccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion2TransaccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion2TransaccionClienteBusqueda.setText("U");
		this.jButtonid_transaccion2TransaccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion2TransaccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion2TransaccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion2TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion2TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion2TransaccionClienteBusqueda"));

		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion2TransaccionClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion2TransaccionClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion2TransaccionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion2TransaccionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion2TransaccionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion2TransaccionClienteUpdate.setText("U");
		this.jButtonid_transaccion2TransaccionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion2TransaccionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion2TransaccionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion2TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion2TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion2TransaccionClienteUpdate"));



					
		this.jLabelid_transaccion3TransaccionCliente = new JLabelMe();
		this.jLabelid_transaccion3TransaccionCliente.setText(""+TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3+" :");
		this.jLabelid_transaccion3TransaccionCliente.setToolTipText("Transaccion3");
		this.jLabelid_transaccion3TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion3TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion3TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion3TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion3TransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion3TransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION3);
		this.gridaBagLayoutTransaccionCliente = new GridBagLayout();
		this.jPanelid_transaccion3TransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);


		jComboBoxid_transaccion3TransaccionCliente= new JComboBoxMe();
		jComboBoxid_transaccion3TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion3TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion3TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion3TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion3TransaccionCliente= new JButtonMe();
		this.jButtonid_transaccion3TransaccionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion3TransaccionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion3TransaccionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion3TransaccionCliente.setText("Buscar");
		this.jButtonid_transaccion3TransaccionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion3TransaccionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion3TransaccionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion3TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion3TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion3TransaccionCliente"));

		this.jButtonid_transaccion3TransaccionClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion3TransaccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion3TransaccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion3TransaccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion3TransaccionClienteBusqueda.setText("U");
		this.jButtonid_transaccion3TransaccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion3TransaccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion3TransaccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion3TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion3TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion3TransaccionClienteBusqueda"));

		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion3TransaccionClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion3TransaccionClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion3TransaccionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion3TransaccionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion3TransaccionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion3TransaccionClienteUpdate.setText("U");
		this.jButtonid_transaccion3TransaccionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion3TransaccionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion3TransaccionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion3TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion3TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion3TransaccionClienteUpdate"));



					
		this.jLabelid_transaccion4TransaccionCliente = new JLabelMe();
		this.jLabelid_transaccion4TransaccionCliente.setText(""+TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4+" :");
		this.jLabelid_transaccion4TransaccionCliente.setToolTipText("Transaccion4");
		this.jLabelid_transaccion4TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion4TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion4TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion4TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion4TransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion4TransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION4);
		this.gridaBagLayoutTransaccionCliente = new GridBagLayout();
		this.jPanelid_transaccion4TransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);


		jComboBoxid_transaccion4TransaccionCliente= new JComboBoxMe();
		jComboBoxid_transaccion4TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion4TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion4TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion4TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion4TransaccionCliente= new JButtonMe();
		this.jButtonid_transaccion4TransaccionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion4TransaccionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion4TransaccionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion4TransaccionCliente.setText("Buscar");
		this.jButtonid_transaccion4TransaccionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion4TransaccionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion4TransaccionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion4TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion4TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion4TransaccionCliente"));

		this.jButtonid_transaccion4TransaccionClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion4TransaccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion4TransaccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion4TransaccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion4TransaccionClienteBusqueda.setText("U");
		this.jButtonid_transaccion4TransaccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion4TransaccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion4TransaccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion4TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion4TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion4TransaccionClienteBusqueda"));

		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion4TransaccionClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion4TransaccionClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion4TransaccionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion4TransaccionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion4TransaccionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion4TransaccionClienteUpdate.setText("U");
		this.jButtonid_transaccion4TransaccionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion4TransaccionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion4TransaccionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion4TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion4TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion4TransaccionClienteUpdate"));



					
		this.jLabelid_transaccion5TransaccionCliente = new JLabelMe();
		this.jLabelid_transaccion5TransaccionCliente.setText(""+TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5+" :");
		this.jLabelid_transaccion5TransaccionCliente.setToolTipText("Transaccion5");
		this.jLabelid_transaccion5TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion5TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion5TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion5TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion5TransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion5TransaccionCliente.setToolTipText(TransaccionClienteConstantesFunciones.LABEL_IDTRANSACCION5);
		this.gridaBagLayoutTransaccionCliente = new GridBagLayout();
		this.jPanelid_transaccion5TransaccionCliente.setLayout(this.gridaBagLayoutTransaccionCliente);


		jComboBoxid_transaccion5TransaccionCliente= new JComboBoxMe();
		jComboBoxid_transaccion5TransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion5TransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion5TransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion5TransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion5TransaccionCliente= new JButtonMe();
		this.jButtonid_transaccion5TransaccionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion5TransaccionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion5TransaccionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion5TransaccionCliente.setText("Buscar");
		this.jButtonid_transaccion5TransaccionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion5TransaccionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion5TransaccionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion5TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion5TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion5TransaccionCliente"));

		this.jButtonid_transaccion5TransaccionClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccion5TransaccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion5TransaccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion5TransaccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion5TransaccionClienteBusqueda.setText("U");
		this.jButtonid_transaccion5TransaccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion5TransaccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion5TransaccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion5TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion5TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion5TransaccionClienteBusqueda"));

		if(this.transaccionclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion5TransaccionClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccion5TransaccionClienteUpdate= new JButtonMe();
		this.jButtonid_transaccion5TransaccionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion5TransaccionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion5TransaccionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion5TransaccionClienteUpdate.setText("U");
		this.jButtonid_transaccion5TransaccionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion5TransaccionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion5TransaccionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion5TransaccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion5TransaccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion5TransaccionClienteUpdate"));



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
		//this.jInternalFrameDetalleTransaccionCliente = new TransaccionClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Analisis Transaccion Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionCliente= new GridBagLayout();
		

		
		String sToolTipTransaccionCliente="";
		sToolTipTransaccionCliente=TransaccionClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionCliente+="(Cartera.TransaccionCliente)";
		}
		
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransaccionCliente = new JButtonMe();
		this.jButtonModificarTransaccionCliente = new JButtonMe();
        this.jButtonActualizarTransaccionCliente = new JButtonMe();
        this.jButtonEliminarTransaccionCliente = new JButtonMe();
        this.jButtonCancelarTransaccionCliente = new JButtonMe();
        this.jButtonGuardarCambiosTransaccionCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransaccionCliente = new JButtonMe();
		this.jButtonCerrarTransaccionCliente = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransaccionCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralTransaccionCliente = new JScrollPane();
				
		
		
		this.jPanelCamposTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Analisis Transaccion Cliente";
		
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransaccionCliente.setName("jPanelCamposTransaccionCliente"); 

		this.jPanelCamposOcultosTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransaccionCliente.setName("jPanelCamposOcultosTransaccionCliente"); 

        this.jPanelAccionesTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionCliente.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransaccionCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransaccionCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransaccionCliente.setText("Nuevo");
		this.jButtonModificarTransaccionCliente.setText("Editar");
        this.jButtonActualizarTransaccionCliente.setText("Actualizar");
        this.jButtonEliminarTransaccionCliente.setText("Eliminar");
        this.jButtonCancelarTransaccionCliente.setText("Cancelar");
        this.jButtonGuardarCambiosTransaccionCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransaccionCliente.setText("Guardar");
		this.jButtonCerrarTransaccionCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionCliente,"nuevo_button","Nuevo",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransaccionCliente,"modificar_button","Editar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransaccionCliente,"actualizar_button","Actualizar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransaccionCliente,"eliminar_button","Eliminar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransaccionCliente,"cancelar_button","Cancelar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransaccionCliente,"guardarcambios_button","Guardar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionCliente,"guardarcambiostabla_button","Guardar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionCliente,"cerrar_button","Salir",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransaccionCliente.setToolTipText("Nuevo"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransaccionCliente.setToolTipText("Editar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransaccionCliente.setToolTipText("Actualizar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransaccionCliente.setToolTipText("Eliminar)"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransaccionCliente.setToolTipText("Cancelar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransaccionCliente.setToolTipText("Guardar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransaccionCliente.setToolTipText("Guardar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionCliente.setToolTipText("Salir"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionCliente";
		inputMap = this.jButtonNuevoTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransaccionCliente";
		inputMap = this.jButtonActualizarTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransaccionCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarTransaccionCliente";
		inputMap = this.jButtonEliminarTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransaccionCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarTransaccionCliente";
		inputMap = this.jButtonCancelarTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransaccionCliente"));
		
		//CERRAR		
		sMapKey = "CerrarTransaccionCliente";
		inputMap = this.jButtonCerrarTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionCliente";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransaccionCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransaccionCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransaccionCliente.setToolTipText("Nuevo TransaccionCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransaccionCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransaccionCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransaccionCliente.setToolTipText("Sin Cerrar Ventana TransaccionCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransaccionCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransaccionCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransaccionCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionCliente.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransaccionCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransaccionCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransaccionCliente = new JLabelMe();
		
		this.jLabelAccionesTransaccionCliente.setText("Acciones");		
		this.jLabelAccionesTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransaccionCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransaccionCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransaccionCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransaccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransaccionCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransaccionCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransaccionCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransaccionCliente = new GridBagLayout();
		
		this.jPanelCamposTransaccionCliente.setLayout(gridaBagLayoutCamposTransaccionCliente);
		this.jPanelCamposOcultosTransaccionCliente.setLayout(gridaBagLayoutCamposOcultosTransaccionCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransaccionCliente.add(jLabelIdTransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransaccionCliente.add(jLabelidTransaccionCliente, this.gridBagConstraintsTransaccionCliente);


	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransaccionCliente.add(jLabelid_empresaTransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 2;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccionCliente.add(jButtonid_empresaTransaccionClienteBusqueda, this.gridBagConstraintsTransaccionCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 3;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccionCliente.add(jButtonid_empresaTransaccionClienteUpdate, this.gridBagConstraintsTransaccionCliente);
	}

	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransaccionCliente.add(jComboBoxid_empresaTransaccionCliente, this.gridBagConstraintsTransaccionCliente);


	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTransaccionCliente.add(jLabelid_moduloTransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 2;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTransaccionCliente.add(jButtonid_moduloTransaccionClienteBusqueda, this.gridBagConstraintsTransaccionCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 3;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTransaccionCliente.add(jButtonid_moduloTransaccionClienteUpdate, this.gridBagConstraintsTransaccionCliente);
	}

	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTransaccionCliente.add(jComboBoxid_moduloTransaccionCliente, this.gridBagConstraintsTransaccionCliente);


	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTransaccionCliente.add(jLabelnombreTransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 2;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTransaccionCliente.add(jButtonnombreTransaccionClienteBusqueda, this.gridBagConstraintsTransaccionCliente);
	}

	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTransaccionCliente.add(jscrollPanenombreTransaccionCliente, this.gridBagConstraintsTransaccionCliente);


	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion1TransaccionCliente.add(jLabelid_transaccion1TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 2;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion1TransaccionCliente.add(jButtonid_transaccion1TransaccionClienteBusqueda, this.gridBagConstraintsTransaccionCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 3;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion1TransaccionCliente.add(jButtonid_transaccion1TransaccionClienteUpdate, this.gridBagConstraintsTransaccionCliente);
	}

	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion1TransaccionCliente.add(jComboBoxid_transaccion1TransaccionCliente, this.gridBagConstraintsTransaccionCliente);


	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion2TransaccionCliente.add(jLabelid_transaccion2TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 2;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion2TransaccionCliente.add(jButtonid_transaccion2TransaccionClienteBusqueda, this.gridBagConstraintsTransaccionCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 3;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion2TransaccionCliente.add(jButtonid_transaccion2TransaccionClienteUpdate, this.gridBagConstraintsTransaccionCliente);
	}

	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion2TransaccionCliente.add(jComboBoxid_transaccion2TransaccionCliente, this.gridBagConstraintsTransaccionCliente);


	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion3TransaccionCliente.add(jLabelid_transaccion3TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 2;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion3TransaccionCliente.add(jButtonid_transaccion3TransaccionClienteBusqueda, this.gridBagConstraintsTransaccionCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 3;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion3TransaccionCliente.add(jButtonid_transaccion3TransaccionClienteUpdate, this.gridBagConstraintsTransaccionCliente);
	}

	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion3TransaccionCliente.add(jComboBoxid_transaccion3TransaccionCliente, this.gridBagConstraintsTransaccionCliente);


	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion4TransaccionCliente.add(jLabelid_transaccion4TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 2;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion4TransaccionCliente.add(jButtonid_transaccion4TransaccionClienteBusqueda, this.gridBagConstraintsTransaccionCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 3;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion4TransaccionCliente.add(jButtonid_transaccion4TransaccionClienteUpdate, this.gridBagConstraintsTransaccionCliente);
	}

	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion4TransaccionCliente.add(jComboBoxid_transaccion4TransaccionCliente, this.gridBagConstraintsTransaccionCliente);


	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 0;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion5TransaccionCliente.add(jLabelid_transaccion5TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 2;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion5TransaccionCliente.add(jButtonid_transaccion5TransaccionClienteBusqueda, this.gridBagConstraintsTransaccionCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 3;
		this.gridBagConstraintsTransaccionCliente.ipadx = 0;
		this.gridBagConstraintsTransaccionCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion5TransaccionCliente.add(jButtonid_transaccion5TransaccionClienteUpdate, this.gridBagConstraintsTransaccionCliente);
	}

	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionCliente.gridy = 0;
	this.gridBagConstraintsTransaccionCliente.gridx = 1;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion5TransaccionCliente.add(jComboBoxid_transaccion5TransaccionCliente, this.gridBagConstraintsTransaccionCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionCliente.add(this.jPanelidTransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposTransaccionCliente % 1==0) {
		iXPanelCamposTransaccionCliente=0;
		iYPanelCamposTransaccionCliente++;
	}
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionCliente.add(this.jPanelnombreTransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposTransaccionCliente % 1==0) {
		iXPanelCamposTransaccionCliente=0;
		iYPanelCamposTransaccionCliente++;
	}
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionCliente.add(this.jPanelid_transaccion1TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposTransaccionCliente % 1==0) {
		iXPanelCamposTransaccionCliente=0;
		iYPanelCamposTransaccionCliente++;
	}
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionCliente.add(this.jPanelid_transaccion2TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposTransaccionCliente % 1==0) {
		iXPanelCamposTransaccionCliente=0;
		iYPanelCamposTransaccionCliente++;
	}
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionCliente.add(this.jPanelid_transaccion3TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposTransaccionCliente % 1==0) {
		iXPanelCamposTransaccionCliente=0;
		iYPanelCamposTransaccionCliente++;
	}
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionCliente.add(this.jPanelid_transaccion4TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposTransaccionCliente % 1==0) {
		iXPanelCamposTransaccionCliente=0;
		iYPanelCamposTransaccionCliente++;
	}
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionCliente.add(this.jPanelid_transaccion5TransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposTransaccionCliente % 1==0) {
		iXPanelCamposTransaccionCliente=0;
		iYPanelCamposTransaccionCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposOcultosTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposOcultosTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionCliente.add(this.jPanelid_empresaTransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposOcultosTransaccionCliente % 1==0) {
		iXPanelCamposOcultosTransaccionCliente=0;
		iYPanelCamposOcultosTransaccionCliente++;
	}
	this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionCliente.gridy = iYPanelCamposOcultosTransaccionCliente;
	this.gridBagConstraintsTransaccionCliente.gridx = iXPanelCamposOcultosTransaccionCliente++;
	this.gridBagConstraintsTransaccionCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionCliente.add(this.jPanelid_moduloTransaccionCliente, this.gridBagConstraintsTransaccionCliente);



	if(iXPanelCamposOcultosTransaccionCliente % 1==0) {
		iXPanelCamposOcultosTransaccionCliente=0;
		iYPanelCamposOcultosTransaccionCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransaccionCliente= new GridBagLayout();
		this.jPanelAccionesTransaccionCliente.setLayout(gridaBagLayoutAccionesTransaccionCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransaccionCliente= new GridBagLayout();
		this.jPanelAccionesFormularioTransaccionCliente.setLayout(gridaBagLayoutAccionesFormularioTransaccionCliente);
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionCliente.add(this.jComboBoxTiposAccionesFormularioTransaccionCliente, this.gridBagConstraintsTransaccionCliente);

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionCliente.add(this.jCheckBoxPostAccionNuevoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccionCliente.add(this.jCheckBoxPostAccionSinCerrarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.transaccionclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccionCliente.add(this.jCheckBoxPostAccionSinMensajeTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransaccionCliente.add(this.jButtonModificarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);							

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransaccionCliente.add(this.jButtonEliminarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
			
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = 0;		
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionCliente.add(this.jButtonActualizarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);


		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = 0;		
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionCliente.add(this.jButtonGuardarCambiosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);	
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = 0;		
		this.gridBagConstraintsTransaccionCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransaccionCliente.add(this.jButtonCancelarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionCliente.gridx = 0;		
			//this.gridBagConstraintsTransaccionCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionCliente.gridx =0;
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransaccionCliente = new TransaccionClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Analisis Transaccion Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Analisis Transaccion Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Analisis Transaccion Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransaccionClienteModel transaccionclienteModel=new TransaccionClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//TransaccionClienteModel.TransaccionClienteFocusTraversalPolicy transaccionclienteFocusTraversalPolicy = transaccionclienteModel.new TransaccionClienteFocusTraversalPolicy(this);
			
			//transaccionclienteFocusTraversalPolicy.settransaccionclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transaccionclienteModel);
			
			
			this.jContentPaneDetalleTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransaccionCliente = new GridBagLayout();	
			this.jContentPaneDetalleTransaccionCliente.setLayout(gridaBagLayoutDetalleTransaccionCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
				this.gridBagConstraintsTransaccionCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransaccionCliente.gridx = 0;
					
				
				this.jContentPaneDetalleTransaccionCliente.add(jTtoolBarDetalleTransaccionCliente, gridBagConstraintsTransaccionCliente);								
				
}
			
			this.jScrollPanelDatosEdicionTransaccionCliente=   new JScrollPane(jContentPaneDetalleTransaccionCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransaccionCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransaccionCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransaccionCliente.gridx = 0;
	        
			this.jContentPaneDetalleTransaccionCliente.add(jPanelCamposTransaccionCliente, gridBagConstraintsTransaccionCliente);
			
			
			
			
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
						&& transaccionclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.transaccionclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransaccionCliente= new GridBagConstraints();
						this.gridBagConstraintsTransaccionCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransaccionCliente.gridx = 0;
						this.jContentPaneDetalleTransaccionCliente.add(this.jTabbedPaneRelacionesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransaccionCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransaccionCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
					this.gridBagConstraintsTransaccionCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransaccionCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransaccionCliente.gridx = 0;
					
				
					this.jContentPaneDetalleTransaccionCliente.add(jPanelCamposOcultosTransaccionCliente, gridBagConstraintsTransaccionCliente);
				
					this.jPanelCamposOcultosTransaccionCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransaccionCliente.gridx = 0;
	        this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransaccionCliente.add(this.jPanelAccionesFormularioTransaccionCliente, this.gridBagConstraintsTransaccionCliente);							
			
			
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
	        this.gridBagConstraintsTransaccionCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransaccionCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleTransaccionCliente.add(this.jPanelAccionesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransaccionCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransaccionCliente=   new JScrollPane(this.jPanelCamposTransaccionCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionCliente.gridx = 0;
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransaccionCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			
			
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
			
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransaccionCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionTransaccionCliente;
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
