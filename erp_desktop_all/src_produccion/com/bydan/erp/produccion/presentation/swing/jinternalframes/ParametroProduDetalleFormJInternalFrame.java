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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ParametroProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ParametroProduDetalleFormJInternalFrame extends ParametroProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroProdu;
	
	protected JMenuBar jmenuBarDetalleParametroProdu;
	
	protected JMenu jmenuDetalleParametroProdu;
	protected JMenu jmenuDetalleArchivoParametroProdu;
	protected JMenu jmenuDetalleAccionesParametroProdu;
	protected JMenu jmenuDetalleDatosParametroProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroProdu;	
	protected GridBagConstraints gridBagConstraintsParametroProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected BodegaBeanSwingJInternalFrame bodegamateriaprimaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegamateriaprima="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TransaccionBeanSwingJInternalFrame transaccionegresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionegreso="";
	
	public ParametroProduSessionBean parametroproduSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public BodegaSessionBean bodegamateriaprimaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TransaccionSessionBean transaccionegresoSessionBean;	
	
	public ParametroProduLogic parametroproduLogic;
	
	public JScrollPane jScrollPanelDatosParametroProdu;
	public JScrollPane jScrollPanelDatosEdicionParametroProdu;
	public JScrollPane jScrollPanelDatosGeneralParametroProdu;
	
	protected JPanel jPanelCamposParametroProdu;    
	protected JPanel jPanelCamposOcultosParametroProdu;    	
	protected JPanel jPanelAccionesParametroProdu;
	protected JPanel jPanelAccionesFormularioParametroProdu;
    
	
	
	protected Integer iXPanelCamposParametroProdu=0;
	protected Integer iYPanelCamposParametroProdu=0;
	
	protected Integer iXPanelCamposOcultosParametroProdu=0;
	protected Integer iYPanelCamposOcultosParametroProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroProdu;
	public JButton jButtonModificarParametroProdu;
	public JButton jButtonActualizarParametroProdu;
    public JButton jButtonEliminarParametroProdu;
	public JButton jButtonCancelarParametroProdu;
    public JButton jButtonGuardarCambiosParametroProdu;
	public JButton jButtonGuardarCambiosTablaParametroProdu;
	protected JButton jButtonCerrarParametroProdu;
	
	
	protected JButton jButtonProcesarInformacionParametroProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroProdu;
	protected JButton jButtonModificarToolBarParametroProdu;
	protected JButton jButtonActualizarToolBarParametroProdu;
    protected JButton jButtonEliminarToolBarParametroProdu;
	protected JButton jButtonCancelarToolBarParametroProdu;
    protected JButton jButtonGuardarCambiosToolBarParametroProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroProdu;
	protected JButton jButtonCerrarToolBarParametroProdu;
	
	protected JButton jButtonProcesarInformacionToolBarParametroProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroProdu;
	protected JMenuItem jMenuItemModificarParametroProdu;
	protected JMenuItem jMenuItemActualizarParametroProdu;
    protected JMenuItem jMenuItemEliminarParametroProdu;
	protected JMenuItem jMenuItemCancelarParametroProdu;
    protected JMenuItem jMenuItemGuardarCambiosParametroProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroProdu;
	protected JMenuItem jMenuItemCerrarParametroProdu;
	protected JMenuItem jMenuItemDetalleCerrarParametroProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroProdu;
	protected JMenuItem jMenuItemMostrarOcultarParametroProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroProdu;
	public JLabel jLabelIdParametroProdu;
	public JLabel jLabelidParametroProdu;
	public JButton jButtonidParametroProduBusqueda= new JButtonMe();

	public JPanel jPanelcon_relacion_porcentajeParametroProdu;
	public JLabel jLabelcon_relacion_porcentajeParametroProdu;
	public JTextField jTextFieldcon_relacion_porcentajeParametroProdu;
	public JButton jButtoncon_relacion_porcentajeParametroProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionParametroProdu;
	public JLabel jLabeldescripcionParametroProdu;
	public JTextArea jTextAreadescripcionParametroProdu;
	public JScrollPane jscrollPanedescripcionParametroProdu;
	public JButton jButtondescripcionParametroProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroProdu;
	public JLabel jLabelid_empresaParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroProdu;
	public JButton jButtonid_empresaParametroProdu= new JButtonMe();
	public JButton jButtonid_empresaParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroProduBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroProdu;
	public JLabel jLabelid_sucursalParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroProdu;
	public JButton jButtonid_sucursalParametroProdu= new JButtonMe();
	public JButton jButtonid_sucursalParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaParametroProdu;
	public JLabel jLabelid_bodegaParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaParametroProdu;
	public JButton jButtonid_bodegaParametroProdu= new JButtonMe();
	public JButton jButtonid_bodegaParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaParametroProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_materia_primaParametroProdu;
	public JLabel jLabelid_bodega_materia_primaParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_materia_primaParametroProdu;
	public JButton jButtonid_bodega_materia_primaParametroProdu= new JButtonMe();
	public JButton jButtonid_bodega_materia_primaParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_bodega_materia_primaParametroProduBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionParametroProdu;
	public JLabel jLabelid_transaccionParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionParametroProdu;
	public JButton jButtonid_transaccionParametroProdu= new JButtonMe();
	public JButton jButtonid_transaccionParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_transaccionParametroProduBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_egresoParametroProdu;
	public JLabel jLabelid_transaccion_egresoParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_egresoParametroProdu;
	public JButton jButtonid_transaccion_egresoParametroProdu= new JButtonMe();
	public JButton jButtonid_transaccion_egresoParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_egresoParametroProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroProdu;
	
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
	
	public ParametroProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroProdu=new JPanel();
				this.jPanelAccionesFormularioParametroProdu=new JPanel();
				this.jmenuBarDetalleParametroProdu=new JMenuBar();
				this.jTtoolBarDetalleParametroProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroProdu() {
		return this.jButtonActualizarToolBarParametroProdu;
	}
	
	public JButton getjButtonEliminarToolBarParametroProdu() {
		return this.jButtonEliminarToolBarParametroProdu;
	}
	
	public JButton getjButtonCancelarToolBarParametroProdu() {
		return this.jButtonCancelarToolBarParametroProdu;
	}		
	
	public JButton getjButtonProcesarInformacionParametroProdu() {
		return this.jButtonProcesarInformacionParametroProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroProdu)	{
		this.jButtonProcesarInformacionParametroProdu = jButtonProcesarInformacionParametroProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroProdu() {
		return this.jComboBoxTiposAccionesParametroProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroProdu(
			JComboBox jComboBoxTiposRelacionesParametroProdu) {
		this.jComboBoxTiposRelacionesParametroProdu = jComboBoxTiposRelacionesParametroProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroProdu(
			JComboBox jComboBoxTiposAccionesParametroProdu) {
		this.jComboBoxTiposAccionesParametroProdu = jComboBoxTiposAccionesParametroProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroProdu() {
		return this.jComboBoxTiposAccionesFormularioParametroProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroProdu(
			JComboBox jComboBoxTiposAccionesFormularioParametroProdu) {
		this.jComboBoxTiposAccionesFormularioParametroProdu = jComboBoxTiposAccionesFormularioParametroProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametroproduSessionBean=new ParametroProduSessionBean();
		
		this.parametroproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroProdu=new JButtonMe();
				this.jButtonModificarToolBarParametroProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroProdu,this.jTtoolBarDetalleParametroProdu,
							"actualizar","actualizar","Actualizar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroProdu,this.jTtoolBarDetalleParametroProdu,
							"eliminar","eliminar","Eliminar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroProdu,this.jTtoolBarDetalleParametroProdu,
							"cancelar","cancelar","Cancelar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroProdu,this.jTtoolBarDetalleParametroProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroProdu.add(this.jMenuItemDetalleCerrarParametroProdu);
		
		this.jmenuDetalleAccionesParametroProdu.add(this.jMenuItemActualizarParametroProdu);
		this.jmenuDetalleAccionesParametroProdu.add(this.jMenuItemEliminarParametroProdu);
		this.jmenuDetalleAccionesParametroProdu.add(this.jMenuItemCancelarParametroProdu);		
		
		//this.jmenuDetalleDatosParametroProdu.add(this.jMenuItemDetalleAbrirOrderByParametroProdu);				
		this.jmenuDetalleDatosParametroProdu.add(this.jMenuItemDetalleMostarOcultarParametroProdu);				
				
		//this.jmenuDetalleAccionesParametroProdu.add(this.jMenuItemGuardarCambiosParametroProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroProdu.add(this.jmenuDetalleArchivoParametroProdu);		
		this.jmenuBarDetalleParametroProdu.add(this.jmenuDetalleAccionesParametroProdu);		
		this.jmenuBarDetalleParametroProdu.add(this.jmenuDetalleDatosParametroProdu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroProdu);				
	}
	
	
	public void inicializarElementosCamposParametroProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroProdu = new JLabelMe();
		jLabelIdParametroProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroProdu= new GridBagLayout();

		this.jPanelidParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);

		jLabelidParametroProdu = new JLabel();
		jLabelidParametroProdu.setText("Id");

		jLabelidParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_relacion_porcentajeParametroProdu = new JLabelMe();
		this.jLabelcon_relacion_porcentajeParametroProdu.setText(""+ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE+" : *");
		this.jLabelcon_relacion_porcentajeParametroProdu.setToolTipText("Con Relacion Porcentaje");
		this.jLabelcon_relacion_porcentajeParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_relacion_porcentajeParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_relacion_porcentajeParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_relacion_porcentajeParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_relacion_porcentajeParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_relacion_porcentajeParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE);
		this.gridaBagLayoutParametroProdu = new GridBagLayout();
		this.jPanelcon_relacion_porcentajeParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);


		jTextFieldcon_relacion_porcentajeParametroProdu= new JTextFieldMe();
		jTextFieldcon_relacion_porcentajeParametroProdu.setEnabled(false);
		jTextFieldcon_relacion_porcentajeParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcon_relacion_porcentajeParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcon_relacion_porcentajeParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcon_relacion_porcentajeParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcon_relacion_porcentajeParametroProdu.setText("0");

		this.jButtoncon_relacion_porcentajeParametroProduBusqueda= new JButtonMe();
		this.jButtoncon_relacion_porcentajeParametroProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_relacion_porcentajeParametroProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_relacion_porcentajeParametroProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_relacion_porcentajeParametroProduBusqueda.setText("U");
		this.jButtoncon_relacion_porcentajeParametroProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_relacion_porcentajeParametroProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_relacion_porcentajeParametroProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcon_relacion_porcentajeParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcon_relacion_porcentajeParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_relacion_porcentajeParametroProduBusqueda"));

		if(this.parametroproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_relacion_porcentajeParametroProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionParametroProdu = new JLabelMe();
		this.jLabeldescripcionParametroProdu.setText(""+ParametroProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionParametroProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutParametroProdu = new GridBagLayout();
		this.jPaneldescripcionParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);


		jTextAreadescripcionParametroProdu= new JTextAreaMe();
		jTextAreadescripcionParametroProdu.setEnabled(false);
		jTextAreadescripcionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroProdu.setLineWrap(true);
		jTextAreadescripcionParametroProdu.setWrapStyleWord(true);
		jTextAreadescripcionParametroProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionParametroProdu.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionParametroProdu = new JScrollPane(jTextAreadescripcionParametroProdu);
		jscrollPanedescripcionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionParametroProduBusqueda= new JButtonMe();
		this.jButtondescripcionParametroProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionParametroProduBusqueda.setText("U");
		this.jButtondescripcionParametroProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionParametroProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionParametroProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionParametroProduBusqueda"));

		if(this.parametroproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionParametroProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroProdu = new JLabelMe();
		this.jLabelid_empresaParametroProdu.setText(""+ParametroProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroProdu.setToolTipText("Empresa");
		this.jLabelid_empresaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroProdu = new GridBagLayout();
		this.jPanelid_empresaParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);


		jComboBoxid_empresaParametroProdu= new JComboBoxMe();
		jComboBoxid_empresaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroProdu.setEnabled(false);

		this.jButtonid_empresaParametroProdu= new JButtonMe();
		this.jButtonid_empresaParametroProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroProdu.setText("Buscar");
		this.jButtonid_empresaParametroProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroProdu"));

		this.jButtonid_empresaParametroProduBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroProduBusqueda.setText("U");
		this.jButtonid_empresaParametroProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroProduBusqueda"));

		if(this.parametroproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroProduUpdate= new JButtonMe();
		this.jButtonid_empresaParametroProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroProduUpdate.setText("U");
		this.jButtonid_empresaParametroProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroProduUpdate"));



					
		this.jLabelid_sucursalParametroProdu = new JLabelMe();
		this.jLabelid_sucursalParametroProdu.setText(""+ParametroProduConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroProdu.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroProdu = new GridBagLayout();
		this.jPanelid_sucursalParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);


		jComboBoxid_sucursalParametroProdu= new JComboBoxMe();
		jComboBoxid_sucursalParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroProdu.setEnabled(false);

		this.jButtonid_sucursalParametroProdu= new JButtonMe();
		this.jButtonid_sucursalParametroProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroProdu.setText("Buscar");
		this.jButtonid_sucursalParametroProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroProdu"));

		this.jButtonid_sucursalParametroProduBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroProduBusqueda.setText("U");
		this.jButtonid_sucursalParametroProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroProduBusqueda"));

		if(this.parametroproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroProduBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroProduUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroProduUpdate.setText("U");
		this.jButtonid_sucursalParametroProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroProduUpdate"));



					
		this.jLabelid_bodegaParametroProdu = new JLabelMe();
		this.jLabelid_bodegaParametroProdu.setText(""+ParametroProduConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaParametroProdu.setToolTipText("Bodega");
		this.jLabelid_bodegaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutParametroProdu = new GridBagLayout();
		this.jPanelid_bodegaParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);


		jComboBoxid_bodegaParametroProdu= new JComboBoxMe();
		jComboBoxid_bodegaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaParametroProdu= new JButtonMe();
		this.jButtonid_bodegaParametroProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroProdu.setText("Buscar");
		this.jButtonid_bodegaParametroProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaParametroProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroProdu"));

		this.jButtonid_bodegaParametroProduBusqueda= new JButtonMe();
		this.jButtonid_bodegaParametroProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroProduBusqueda.setText("U");
		this.jButtonid_bodegaParametroProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaParametroProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroProduBusqueda"));

		if(this.parametroproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaParametroProduBusqueda.setVisible(false);		}

		this.jButtonid_bodegaParametroProduUpdate= new JButtonMe();
		this.jButtonid_bodegaParametroProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroProduUpdate.setText("U");
		this.jButtonid_bodegaParametroProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaParametroProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroProduUpdate"));



					
		this.jLabelid_bodega_materia_primaParametroProdu = new JLabelMe();
		this.jLabelid_bodega_materia_primaParametroProdu.setText(""+ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA+" : *");
		this.jLabelid_bodega_materia_primaParametroProdu.setToolTipText("Bodega Materia Prima");
		this.jLabelid_bodega_materia_primaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_bodega_materia_primaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_bodega_materia_primaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_materia_primaParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_materia_primaParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_materia_primaParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA);
		this.gridaBagLayoutParametroProdu = new GridBagLayout();
		this.jPanelid_bodega_materia_primaParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);


		jComboBoxid_bodega_materia_primaParametroProdu= new JComboBoxMe();
		jComboBoxid_bodega_materia_primaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_materia_primaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_materia_primaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_materia_primaParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_materia_primaParametroProdu= new JButtonMe();
		this.jButtonid_bodega_materia_primaParametroProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_materia_primaParametroProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_materia_primaParametroProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_materia_primaParametroProdu.setText("Buscar");
		this.jButtonid_bodega_materia_primaParametroProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_materia_primaParametroProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_materia_primaParametroProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_materia_primaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_materia_primaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_materia_primaParametroProdu"));

		this.jButtonid_bodega_materia_primaParametroProduBusqueda= new JButtonMe();
		this.jButtonid_bodega_materia_primaParametroProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_materia_primaParametroProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_materia_primaParametroProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_materia_primaParametroProduBusqueda.setText("U");
		this.jButtonid_bodega_materia_primaParametroProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_materia_primaParametroProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_materia_primaParametroProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_materia_primaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_materia_primaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_materia_primaParametroProduBusqueda"));

		if(this.parametroproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_materia_primaParametroProduBusqueda.setVisible(false);		}

		this.jButtonid_bodega_materia_primaParametroProduUpdate= new JButtonMe();
		this.jButtonid_bodega_materia_primaParametroProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_materia_primaParametroProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_materia_primaParametroProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_materia_primaParametroProduUpdate.setText("U");
		this.jButtonid_bodega_materia_primaParametroProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_materia_primaParametroProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_materia_primaParametroProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_materia_primaParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_materia_primaParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_materia_primaParametroProduUpdate"));



					
		this.jLabelid_transaccionParametroProdu = new JLabelMe();
		this.jLabelid_transaccionParametroProdu.setText(""+ParametroProduConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionParametroProdu.setToolTipText("Transaccion");
		this.jLabelid_transaccionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutParametroProdu = new GridBagLayout();
		this.jPanelid_transaccionParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);


		jComboBoxid_transaccionParametroProdu= new JComboBoxMe();
		jComboBoxid_transaccionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionParametroProdu= new JButtonMe();
		this.jButtonid_transaccionParametroProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroProdu.setText("Buscar");
		this.jButtonid_transaccionParametroProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionParametroProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroProdu"));

		this.jButtonid_transaccionParametroProduBusqueda= new JButtonMe();
		this.jButtonid_transaccionParametroProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionParametroProduBusqueda.setText("U");
		this.jButtonid_transaccionParametroProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionParametroProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroProduBusqueda"));

		if(this.parametroproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionParametroProduBusqueda.setVisible(false);		}

		this.jButtonid_transaccionParametroProduUpdate= new JButtonMe();
		this.jButtonid_transaccionParametroProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionParametroProduUpdate.setText("U");
		this.jButtonid_transaccionParametroProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionParametroProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroProduUpdate"));



					
		this.jLabelid_transaccion_egresoParametroProdu = new JLabelMe();
		this.jLabelid_transaccion_egresoParametroProdu.setText(""+ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO+" : *");
		this.jLabelid_transaccion_egresoParametroProdu.setToolTipText("Transaccion Egreso");
		this.jLabelid_transaccion_egresoParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_egresoParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_egresoParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_egresoParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_egresoParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_egresoParametroProdu.setToolTipText(ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO);
		this.gridaBagLayoutParametroProdu = new GridBagLayout();
		this.jPanelid_transaccion_egresoParametroProdu.setLayout(this.gridaBagLayoutParametroProdu);


		jComboBoxid_transaccion_egresoParametroProdu= new JComboBoxMe();
		jComboBoxid_transaccion_egresoParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_egresoParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_egresoParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_egresoParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_egresoParametroProdu= new JButtonMe();
		this.jButtonid_transaccion_egresoParametroProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_egresoParametroProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_egresoParametroProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_egresoParametroProdu.setText("Buscar");
		this.jButtonid_transaccion_egresoParametroProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_egresoParametroProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_egresoParametroProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_egresoParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_egresoParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_egresoParametroProdu"));

		this.jButtonid_transaccion_egresoParametroProduBusqueda= new JButtonMe();
		this.jButtonid_transaccion_egresoParametroProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_egresoParametroProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_egresoParametroProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_egresoParametroProduBusqueda.setText("U");
		this.jButtonid_transaccion_egresoParametroProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_egresoParametroProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_egresoParametroProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_egresoParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_egresoParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_egresoParametroProduBusqueda"));

		if(this.parametroproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_egresoParametroProduBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_egresoParametroProduUpdate= new JButtonMe();
		this.jButtonid_transaccion_egresoParametroProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_egresoParametroProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_egresoParametroProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_egresoParametroProduUpdate.setText("U");
		this.jButtonid_transaccion_egresoParametroProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_egresoParametroProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_egresoParametroProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_egresoParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_egresoParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_egresoParametroProduUpdate"));



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
		//this.jInternalFrameDetalleParametroProdu = new ParametroProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroProdu= new GridBagLayout();
		

		
		String sToolTipParametroProdu="";
		sToolTipParametroProdu=ParametroProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroProdu+="(Produccion.ParametroProdu)";
		}
		
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroProdu = new JButtonMe();
		this.jButtonModificarParametroProdu = new JButtonMe();
        this.jButtonActualizarParametroProdu = new JButtonMe();
        this.jButtonEliminarParametroProdu = new JButtonMe();
        this.jButtonCancelarParametroProdu = new JButtonMe();
        this.jButtonGuardarCambiosParametroProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroProdu = new JButtonMe();
		this.jButtonCerrarParametroProdu = new JButtonMe();
		
		this.jScrollPanelDatosParametroProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroProdu = new JScrollPane();
				
		
		
		this.jPanelCamposParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Produccion";
		
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroProdu.setName("jPanelCamposParametroProdu"); 

		this.jPanelCamposOcultosParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroProdu.setName("jPanelCamposOcultosParametroProdu"); 

        this.jPanelAccionesParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroProdu.setToolTipText("Acciones");
        this.jPanelAccionesParametroProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroProdu.setText("Nuevo");
		this.jButtonModificarParametroProdu.setText("Editar");
        this.jButtonActualizarParametroProdu.setText("Actualizar");
        this.jButtonEliminarParametroProdu.setText("Eliminar");
        this.jButtonCancelarParametroProdu.setText("Cancelar");
        this.jButtonGuardarCambiosParametroProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroProdu.setText("Guardar");
		this.jButtonCerrarParametroProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroProdu,"nuevo_button","Nuevo",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroProdu,"modificar_button","Editar",this.parametroproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroProdu,"actualizar_button","Actualizar",this.parametroproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroProdu,"eliminar_button","Eliminar",this.parametroproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroProdu,"cancelar_button","Cancelar",this.parametroproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroProdu,"guardarcambios_button","Guardar",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroProdu,"guardarcambiostabla_button","Guardar",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroProdu,"cerrar_button","Salir",this.parametroproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroProdu.setToolTipText("Nuevo"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroProdu.setToolTipText("Editar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroProdu.setToolTipText("Actualizar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroProdu.setToolTipText("Eliminar)"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroProdu.setToolTipText("Cancelar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroProdu.setToolTipText("Guardar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroProdu.setToolTipText("Guardar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroProdu.setToolTipText("Salir"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroProdu";
		inputMap = this.jButtonNuevoParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroProdu";
		inputMap = this.jButtonActualizarParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroProdu";
		inputMap = this.jButtonEliminarParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroProdu";
		inputMap = this.jButtonCancelarParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroProdu"));
		
		//CERRAR		
		sMapKey = "CerrarParametroProdu";
		inputMap = this.jButtonCerrarParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroProdu";
		inputMap = this.jButtonGuardarCambiosTablaParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroProdu.setToolTipText("Nuevo ParametroProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroProdu.setToolTipText("Sin Cerrar Ventana ParametroProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroProdu.setText("Accion");
		this.jComboBoxTiposAccionesParametroProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroProdu = new JLabelMe();
		
		this.jLabelAccionesParametroProdu.setText("Acciones");		
		this.jLabelAccionesParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroProdu = new GridBagLayout();
		
		this.jPanelCamposParametroProdu.setLayout(gridaBagLayoutCamposParametroProdu);
		this.jPanelCamposOcultosParametroProdu.setLayout(gridaBagLayoutCamposOcultosParametroProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroProdu.add(jLabelIdParametroProdu, this.gridBagConstraintsParametroProdu);



	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroProdu.add(jLabelidParametroProdu, this.gridBagConstraintsParametroProdu);


	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroProdu.add(jLabelid_empresaParametroProdu, this.gridBagConstraintsParametroProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 2;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroProdu.add(jButtonid_empresaParametroProduBusqueda, this.gridBagConstraintsParametroProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 3;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroProdu.add(jButtonid_empresaParametroProduUpdate, this.gridBagConstraintsParametroProdu);
	}

	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroProdu.add(jComboBoxid_empresaParametroProdu, this.gridBagConstraintsParametroProdu);


	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroProdu.add(jLabelid_sucursalParametroProdu, this.gridBagConstraintsParametroProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 2;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroProdu.add(jButtonid_sucursalParametroProduBusqueda, this.gridBagConstraintsParametroProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 3;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroProdu.add(jButtonid_sucursalParametroProduUpdate, this.gridBagConstraintsParametroProdu);
	}

	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroProdu.add(jComboBoxid_sucursalParametroProdu, this.gridBagConstraintsParametroProdu);


	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaParametroProdu.add(jLabelid_bodegaParametroProdu, this.gridBagConstraintsParametroProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 2;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroProdu.add(jButtonid_bodegaParametroProduBusqueda, this.gridBagConstraintsParametroProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 3;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroProdu.add(jButtonid_bodegaParametroProduUpdate, this.gridBagConstraintsParametroProdu);
	}

	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaParametroProdu.add(jComboBoxid_bodegaParametroProdu, this.gridBagConstraintsParametroProdu);


	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_materia_primaParametroProdu.add(jLabelid_bodega_materia_primaParametroProdu, this.gridBagConstraintsParametroProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 2;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_materia_primaParametroProdu.add(jButtonid_bodega_materia_primaParametroProduBusqueda, this.gridBagConstraintsParametroProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 3;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_materia_primaParametroProdu.add(jButtonid_bodega_materia_primaParametroProduUpdate, this.gridBagConstraintsParametroProdu);
	}

	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_materia_primaParametroProdu.add(jComboBoxid_bodega_materia_primaParametroProdu, this.gridBagConstraintsParametroProdu);


	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionParametroProdu.add(jLabelid_transaccionParametroProdu, this.gridBagConstraintsParametroProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 2;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionParametroProdu.add(jButtonid_transaccionParametroProduBusqueda, this.gridBagConstraintsParametroProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 3;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionParametroProdu.add(jButtonid_transaccionParametroProduUpdate, this.gridBagConstraintsParametroProdu);
	}

	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionParametroProdu.add(jComboBoxid_transaccionParametroProdu, this.gridBagConstraintsParametroProdu);


	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_egresoParametroProdu.add(jLabelid_transaccion_egresoParametroProdu, this.gridBagConstraintsParametroProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 2;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_egresoParametroProdu.add(jButtonid_transaccion_egresoParametroProduBusqueda, this.gridBagConstraintsParametroProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 3;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_egresoParametroProdu.add(jButtonid_transaccion_egresoParametroProduUpdate, this.gridBagConstraintsParametroProdu);
	}

	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_egresoParametroProdu.add(jComboBoxid_transaccion_egresoParametroProdu, this.gridBagConstraintsParametroProdu);


	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_relacion_porcentajeParametroProdu.add(jLabelcon_relacion_porcentajeParametroProdu, this.gridBagConstraintsParametroProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 2;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_relacion_porcentajeParametroProdu.add(jButtoncon_relacion_porcentajeParametroProduBusqueda, this.gridBagConstraintsParametroProdu);
	}

	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_relacion_porcentajeParametroProdu.add(jTextFieldcon_relacion_porcentajeParametroProdu, this.gridBagConstraintsParametroProdu);


	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 0;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionParametroProdu.add(jLabeldescripcionParametroProdu, this.gridBagConstraintsParametroProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 2;
		this.gridBagConstraintsParametroProdu.ipadx = 0;
		this.gridBagConstraintsParametroProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionParametroProdu.add(jButtondescripcionParametroProduBusqueda, this.gridBagConstraintsParametroProdu);
	}

	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProdu.gridy = 0;
	this.gridBagConstraintsParametroProdu.gridx = 1;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionParametroProdu.add(jscrollPanedescripcionParametroProdu, this.gridBagConstraintsParametroProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProdu.add(this.jPanelidParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposParametroProdu % 1==0) {
		iXPanelCamposParametroProdu=0;
		iYPanelCamposParametroProdu++;
	}
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProdu.add(this.jPanelid_bodegaParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposParametroProdu % 1==0) {
		iXPanelCamposParametroProdu=0;
		iYPanelCamposParametroProdu++;
	}
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProdu.add(this.jPanelid_bodega_materia_primaParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposParametroProdu % 1==0) {
		iXPanelCamposParametroProdu=0;
		iYPanelCamposParametroProdu++;
	}
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProdu.add(this.jPanelid_transaccionParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposParametroProdu % 1==0) {
		iXPanelCamposParametroProdu=0;
		iYPanelCamposParametroProdu++;
	}
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProdu.add(this.jPanelid_transaccion_egresoParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposParametroProdu % 1==0) {
		iXPanelCamposParametroProdu=0;
		iYPanelCamposParametroProdu++;
	}
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProdu.add(this.jPanelcon_relacion_porcentajeParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposParametroProdu % 1==0) {
		iXPanelCamposParametroProdu=0;
		iYPanelCamposParametroProdu++;
	}
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProdu.add(this.jPaneldescripcionParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposParametroProdu % 1==0) {
		iXPanelCamposParametroProdu=0;
		iYPanelCamposParametroProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposOcultosParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposOcultosParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroProdu.add(this.jPanelid_empresaParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposOcultosParametroProdu % 1==0) {
		iXPanelCamposOcultosParametroProdu=0;
		iYPanelCamposOcultosParametroProdu++;
	}
	this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProdu.gridy = iYPanelCamposOcultosParametroProdu;
	this.gridBagConstraintsParametroProdu.gridx = iXPanelCamposOcultosParametroProdu++;
	this.gridBagConstraintsParametroProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroProdu.add(this.jPanelid_sucursalParametroProdu, this.gridBagConstraintsParametroProdu);



	if(iXPanelCamposOcultosParametroProdu % 1==0) {
		iXPanelCamposOcultosParametroProdu=0;
		iYPanelCamposOcultosParametroProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroProdu= new GridBagLayout();
		this.jPanelAccionesParametroProdu.setLayout(gridaBagLayoutAccionesParametroProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroProdu= new GridBagLayout();
		this.jPanelAccionesFormularioParametroProdu.setLayout(gridaBagLayoutAccionesFormularioParametroProdu);
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroProdu.add(this.jComboBoxTiposAccionesFormularioParametroProdu, this.gridBagConstraintsParametroProdu);

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroProdu.add(this.jCheckBoxPostAccionNuevoParametroProdu, this.gridBagConstraintsParametroProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametroproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroProdu.add(this.jCheckBoxPostAccionSinCerrarParametroProdu, this.gridBagConstraintsParametroProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametroproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroProdu.add(this.jCheckBoxPostAccionSinMensajeParametroProdu, this.gridBagConstraintsParametroProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroProdu.add(this.jButtonModificarParametroProdu, this.gridBagConstraintsParametroProdu);							

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroProdu.add(this.jButtonEliminarParametroProdu, this.gridBagConstraintsParametroProdu);
		
			
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = 0;		
		this.gridBagConstraintsParametroProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroProdu.add(this.jButtonActualizarParametroProdu, this.gridBagConstraintsParametroProdu);


		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = 0;		
		this.gridBagConstraintsParametroProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroProdu.add(this.jButtonGuardarCambiosParametroProdu, this.gridBagConstraintsParametroProdu);	
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = 0;		
		this.gridBagConstraintsParametroProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroProdu.add(this.jButtonCancelarParametroProdu, this.gridBagConstraintsParametroProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();						
			this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroProdu.gridx = 0;		
			//this.gridBagConstraintsParametroProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroProdu.gridx =0;
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroProdu, this.gridBagConstraintsParametroProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroProdu = new ParametroProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroProduModel parametroproduModel=new ParametroProduModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroProduModel.ParametroProduFocusTraversalPolicy parametroproduFocusTraversalPolicy = parametroproduModel.new ParametroProduFocusTraversalPolicy(this);
			
			//parametroproduFocusTraversalPolicy.setparametroproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametroproduModel);
			
			
			this.jContentPaneDetalleParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroProdu = new GridBagLayout();	
			this.jContentPaneDetalleParametroProdu.setLayout(gridaBagLayoutDetalleParametroProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroProdu = new GridBagConstraints();
				this.gridBagConstraintsParametroProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroProdu.gridx = 0;
					
				
				this.jContentPaneDetalleParametroProdu.add(jTtoolBarDetalleParametroProdu, gridBagConstraintsParametroProdu);								
				
}
			
			this.jScrollPanelDatosEdicionParametroProdu=   new JScrollPane(jContentPaneDetalleParametroProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroProdu.gridx = 0;
	        
			this.jContentPaneDetalleParametroProdu.add(jPanelCamposParametroProdu, gridBagConstraintsParametroProdu);
			
			
			
			
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
						&& parametroproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroProdu= new GridBagConstraints();
						this.gridBagConstraintsParametroProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroProdu.gridx = 0;
						this.jContentPaneDetalleParametroProdu.add(this.jTabbedPaneRelacionesParametroProdu, this.gridBagConstraintsParametroProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroProdu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroProdu = new GridBagConstraints();
					this.gridBagConstraintsParametroProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroProdu.gridx = 0;
					
				
					this.jContentPaneDetalleParametroProdu.add(jPanelCamposOcultosParametroProdu, gridBagConstraintsParametroProdu);
				
					this.jPanelCamposOcultosParametroProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroProdu.gridx = 0;
	        this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroProdu.add(this.jPanelAccionesFormularioParametroProdu, this.gridBagConstraintsParametroProdu);							
			
			
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
	        this.gridBagConstraintsParametroProdu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroProdu.add(this.jPanelAccionesParametroProdu, this.gridBagConstraintsParametroProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroProdu=   new JScrollPane(this.jPanelCamposParametroProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroProdu.gridx = 0;
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroProdu, this.gridBagConstraintsParametroProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroProdu, this.gridBagConstraintsParametroProdu);			
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroProdu, this.gridBagConstraintsParametroProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroProdu, this.gridBagConstraintsParametroProdu);
			
			
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroProdu, this.gridBagConstraintsParametroProdu);
		
			
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroProdu, this.gridBagConstraintsParametroProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroProdu;
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
