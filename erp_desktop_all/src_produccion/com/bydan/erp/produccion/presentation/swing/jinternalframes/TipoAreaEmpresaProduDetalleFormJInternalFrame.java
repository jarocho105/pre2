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

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.produccion.util.TipoAreaEmpresaProduConstantesFunciones;

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
public class TipoAreaEmpresaProduDetalleFormJInternalFrame extends TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoAreaEmpresaProdu;
	
	protected JMenuBar jmenuBarDetalleTipoAreaEmpresaProdu;
	
	protected JMenu jmenuDetalleTipoAreaEmpresaProdu;
	protected JMenu jmenuDetalleArchivoTipoAreaEmpresaProdu;
	protected JMenu jmenuDetalleAccionesTipoAreaEmpresaProdu;
	protected JMenu jmenuDetalleDatosTipoAreaEmpresaProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAreaEmpresaProdu;	
	protected GridBagConstraints gridBagConstraintsTipoAreaEmpresaProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoAreaEmpresaProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean;
	
	

	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProduMaquina=false;
	public ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean;

	public ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;
	public ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProduMaquina=false;
	public ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoAreaEmpresaProduLogic tipoareaempresaproduLogic;
	
	public JScrollPane jScrollPanelDatosTipoAreaEmpresaProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoAreaEmpresaProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoAreaEmpresaProdu;
	
	protected JPanel jPanelCamposTipoAreaEmpresaProdu;    
	protected JPanel jPanelCamposOcultosTipoAreaEmpresaProdu;    	
	protected JPanel jPanelAccionesTipoAreaEmpresaProdu;
	protected JPanel jPanelAccionesFormularioTipoAreaEmpresaProdu;
    
	
	
	protected Integer iXPanelCamposTipoAreaEmpresaProdu=0;
	protected Integer iYPanelCamposTipoAreaEmpresaProdu=0;
	
	protected Integer iXPanelCamposOcultosTipoAreaEmpresaProdu=0;
	protected Integer iYPanelCamposOcultosTipoAreaEmpresaProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoAreaEmpresaProdu;
	public JButton jButtonModificarTipoAreaEmpresaProdu;
	public JButton jButtonActualizarTipoAreaEmpresaProdu;
    public JButton jButtonEliminarTipoAreaEmpresaProdu;
	public JButton jButtonCancelarTipoAreaEmpresaProdu;
    public JButton jButtonGuardarCambiosTipoAreaEmpresaProdu;
	public JButton jButtonGuardarCambiosTablaTipoAreaEmpresaProdu;
	protected JButton jButtonCerrarTipoAreaEmpresaProdu;
	
	
	protected JButton jButtonProcesarInformacionTipoAreaEmpresaProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoAreaEmpresaProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoAreaEmpresaProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoAreaEmpresaProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonModificarToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonActualizarToolBarTipoAreaEmpresaProdu;
    protected JButton jButtonEliminarToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonCancelarToolBarTipoAreaEmpresaProdu;
    protected JButton jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonCerrarToolBarTipoAreaEmpresaProdu;
	
	protected JButton jButtonProcesarInformacionToolBarTipoAreaEmpresaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemModificarTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemActualizarTipoAreaEmpresaProdu;
    protected JMenuItem jMenuItemEliminarTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemCancelarTipoAreaEmpresaProdu;
    protected JMenuItem jMenuItemGuardarCambiosTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemCerrarTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoAreaEmpresaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAreaEmpresaProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAreaEmpresaProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoAreaEmpresaProdu;
	public JLabel jLabelIdTipoAreaEmpresaProdu;
	public JLabel jLabelidTipoAreaEmpresaProdu;
	public JButton jButtonidTipoAreaEmpresaProduBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoAreaEmpresaProdu;
	public JLabel jLabelnombreTipoAreaEmpresaProdu;
	public JTextArea jTextAreanombreTipoAreaEmpresaProdu;
	public JScrollPane jscrollPanenombreTipoAreaEmpresaProdu;
	public JButton jButtonnombreTipoAreaEmpresaProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoAreaEmpresaProdu;
	public JLabel jLabeldescripcionTipoAreaEmpresaProdu;
	public JTextArea jTextAreadescripcionTipoAreaEmpresaProdu;
	public JScrollPane jscrollPanedescripcionTipoAreaEmpresaProdu;
	public JButton jButtondescripcionTipoAreaEmpresaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoAreaEmpresaProdu;
	public JLabel jLabelid_empresaTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoAreaEmpresaProdu;
	public JButton jButtonid_empresaTipoAreaEmpresaProdu= new JButtonMe();
	public JButton jButtonid_empresaTipoAreaEmpresaProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoAreaEmpresaProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoAreaEmpresaProdu;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoAreaEmpresaProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoAreaEmpresaProdu=new JPanel();
				this.jPanelAccionesFormularioTipoAreaEmpresaProdu=new JPanel();
				this.jmenuBarDetalleTipoAreaEmpresaProdu=new JMenuBar();
				this.jTtoolBarDetalleTipoAreaEmpresaProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaEmpresaProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoAreaEmpresaProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaEmpresaProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaEmpresaProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaEmpresaProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoAreaEmpresaProdu() {
		return this.jButtonActualizarToolBarTipoAreaEmpresaProdu;
	}
	
	public JButton getjButtonEliminarToolBarTipoAreaEmpresaProdu() {
		return this.jButtonEliminarToolBarTipoAreaEmpresaProdu;
	}
	
	public JButton getjButtonCancelarToolBarTipoAreaEmpresaProdu() {
		return this.jButtonCancelarToolBarTipoAreaEmpresaProdu;
	}		
	
	public JButton getjButtonProcesarInformacionTipoAreaEmpresaProdu() {
		return this.jButtonProcesarInformacionTipoAreaEmpresaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAreaEmpresaProdu)	{
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu = jButtonProcesarInformacionTipoAreaEmpresaProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAreaEmpresaProdu() {
		return this.jComboBoxTiposAccionesTipoAreaEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposRelacionesTipoAreaEmpresaProdu) {
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu = jComboBoxTiposRelacionesTipoAreaEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposAccionesTipoAreaEmpresaProdu) {
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu = jComboBoxTiposAccionesTipoAreaEmpresaProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu() {
		return this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu) {
		this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu = jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
		
		this.tipoareaempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoareaempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		//this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAreaEmpresaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Area Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoAreaEmpresaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoAreaEmpresaProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoAreaEmpresaProdu=new JButtonMe();
				this.jButtonModificarToolBarTipoAreaEmpresaProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoAreaEmpresaProdu,this.jTtoolBarDetalleTipoAreaEmpresaProdu,
							"actualizar","actualizar","Actualizar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoAreaEmpresaProdu,this.jTtoolBarDetalleTipoAreaEmpresaProdu,
							"eliminar","eliminar","Eliminar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoAreaEmpresaProdu,this.jTtoolBarDetalleTipoAreaEmpresaProdu,
							"cancelar","cancelar","Cancelar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu,this.jTtoolBarDetalleTipoAreaEmpresaProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoAreaEmpresaProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoAreaEmpresaProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoAreaEmpresaProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoAreaEmpresaProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoAreaEmpresaProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAreaEmpresaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAreaEmpresaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAreaEmpresaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoAreaEmpresaProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoAreaEmpresaProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoAreaEmpresaProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoAreaEmpresaProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoAreaEmpresaProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoAreaEmpresaProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoAreaEmpresaProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoAreaEmpresaProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoAreaEmpresaProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoAreaEmpresaProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoAreaEmpresaProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoAreaEmpresaProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAreaEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAreaEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAreaEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoAreaEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoAreaEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoAreaEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoAreaEmpresaProdu.add(this.jMenuItemDetalleCerrarTipoAreaEmpresaProdu);
		
		this.jmenuDetalleAccionesTipoAreaEmpresaProdu.add(this.jMenuItemActualizarTipoAreaEmpresaProdu);
		this.jmenuDetalleAccionesTipoAreaEmpresaProdu.add(this.jMenuItemEliminarTipoAreaEmpresaProdu);
		this.jmenuDetalleAccionesTipoAreaEmpresaProdu.add(this.jMenuItemCancelarTipoAreaEmpresaProdu);		
		
		//this.jmenuDetalleDatosTipoAreaEmpresaProdu.add(this.jMenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu);				
		this.jmenuDetalleDatosTipoAreaEmpresaProdu.add(this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu);				
				
		//this.jmenuDetalleAccionesTipoAreaEmpresaProdu.add(this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoAreaEmpresaProdu.add(this.jmenuDetalleArchivoTipoAreaEmpresaProdu);		
		this.jmenuBarDetalleTipoAreaEmpresaProdu.add(this.jmenuDetalleAccionesTipoAreaEmpresaProdu);		
		this.jmenuBarDetalleTipoAreaEmpresaProdu.add(this.jmenuDetalleDatosTipoAreaEmpresaProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoAreaEmpresaProdu.add(this.jmenuDetalleTipoAreaEmpresaProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoAreaEmpresaProdu);				
	}
	
	
	public void inicializarElementosCamposTipoAreaEmpresaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoAreaEmpresaProdu = new JLabelMe();
		jLabelIdTipoAreaEmpresaProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoAreaEmpresaProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoAreaEmpresaProdu.setToolTipText(TipoAreaEmpresaProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoAreaEmpresaProdu= new GridBagLayout();

		this.jPanelidTipoAreaEmpresaProdu.setLayout(this.gridaBagLayoutTipoAreaEmpresaProdu);

		jLabelidTipoAreaEmpresaProdu = new JLabel();
		jLabelidTipoAreaEmpresaProdu.setText("Id");

		jLabelidTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoAreaEmpresaProdu = new JLabelMe();
		this.jLabelnombreTipoAreaEmpresaProdu.setText(""+TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoAreaEmpresaProdu.setToolTipText("Nombre");
		this.jLabelnombreTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoAreaEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoAreaEmpresaProdu.setToolTipText(TipoAreaEmpresaProduConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoAreaEmpresaProdu = new GridBagLayout();
		this.jPanelnombreTipoAreaEmpresaProdu.setLayout(this.gridaBagLayoutTipoAreaEmpresaProdu);


		jTextAreanombreTipoAreaEmpresaProdu= new JTextAreaMe();
		jTextAreanombreTipoAreaEmpresaProdu.setEnabled(false);
		jTextAreanombreTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAreaEmpresaProdu.setLineWrap(true);
		jTextAreanombreTipoAreaEmpresaProdu.setWrapStyleWord(true);
		jTextAreanombreTipoAreaEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoAreaEmpresaProdu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoAreaEmpresaProdu = new JScrollPane(jTextAreanombreTipoAreaEmpresaProdu);
		jscrollPanenombreTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoAreaEmpresaProduBusqueda= new JButtonMe();
		this.jButtonnombreTipoAreaEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAreaEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAreaEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoAreaEmpresaProduBusqueda.setText("U");
		this.jButtonnombreTipoAreaEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoAreaEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoAreaEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoAreaEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoAreaEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoAreaEmpresaProduBusqueda"));

		if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoAreaEmpresaProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoAreaEmpresaProdu = new JLabelMe();
		this.jLabeldescripcionTipoAreaEmpresaProdu.setText(""+TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoAreaEmpresaProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoAreaEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoAreaEmpresaProdu.setToolTipText(TipoAreaEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoAreaEmpresaProdu = new GridBagLayout();
		this.jPaneldescripcionTipoAreaEmpresaProdu.setLayout(this.gridaBagLayoutTipoAreaEmpresaProdu);


		jTextAreadescripcionTipoAreaEmpresaProdu= new JTextAreaMe();
		jTextAreadescripcionTipoAreaEmpresaProdu.setEnabled(false);
		jTextAreadescripcionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoAreaEmpresaProdu.setLineWrap(true);
		jTextAreadescripcionTipoAreaEmpresaProdu.setWrapStyleWord(true);
		jTextAreadescripcionTipoAreaEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoAreaEmpresaProdu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoAreaEmpresaProdu = new JScrollPane(jTextAreadescripcionTipoAreaEmpresaProdu);
		jscrollPanedescripcionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoAreaEmpresaProduBusqueda= new JButtonMe();
		this.jButtondescripcionTipoAreaEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoAreaEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoAreaEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoAreaEmpresaProduBusqueda.setText("U");
		this.jButtondescripcionTipoAreaEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoAreaEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoAreaEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoAreaEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoAreaEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoAreaEmpresaProduBusqueda"));

		if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoAreaEmpresaProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoAreaEmpresaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoAreaEmpresaProdu = new JLabelMe();
		this.jLabelid_empresaTipoAreaEmpresaProdu.setText(""+TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoAreaEmpresaProdu.setToolTipText("Empresa");
		this.jLabelid_empresaTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoAreaEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoAreaEmpresaProdu.setToolTipText(TipoAreaEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoAreaEmpresaProdu = new GridBagLayout();
		this.jPanelid_empresaTipoAreaEmpresaProdu.setLayout(this.gridaBagLayoutTipoAreaEmpresaProdu);


		jComboBoxid_empresaTipoAreaEmpresaProdu= new JComboBoxMe();
		jComboBoxid_empresaTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoAreaEmpresaProdu.setEnabled(false);

		this.jButtonid_empresaTipoAreaEmpresaProdu= new JButtonMe();
		this.jButtonid_empresaTipoAreaEmpresaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAreaEmpresaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAreaEmpresaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAreaEmpresaProdu.setText("Buscar");
		this.jButtonid_empresaTipoAreaEmpresaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoAreaEmpresaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAreaEmpresaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoAreaEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAreaEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAreaEmpresaProdu"));

		this.jButtonid_empresaTipoAreaEmpresaProduBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoAreaEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAreaEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAreaEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAreaEmpresaProduBusqueda.setText("U");
		this.jButtonid_empresaTipoAreaEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoAreaEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAreaEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoAreaEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAreaEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAreaEmpresaProduBusqueda"));

		if(this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoAreaEmpresaProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoAreaEmpresaProduUpdate= new JButtonMe();
		this.jButtonid_empresaTipoAreaEmpresaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAreaEmpresaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAreaEmpresaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAreaEmpresaProduUpdate.setText("U");
		this.jButtonid_empresaTipoAreaEmpresaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoAreaEmpresaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAreaEmpresaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoAreaEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAreaEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAreaEmpresaProduUpdate"));



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
		//this.jInternalFrameDetalleTipoAreaEmpresaProdu = new TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Area Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAreaEmpresaProdu= new GridBagLayout();
		

		
		String sToolTipTipoAreaEmpresaProdu="";
		sToolTipTipoAreaEmpresaProdu=TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAreaEmpresaProdu+="(Produccion.TipoAreaEmpresaProdu)";
		}
		
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAreaEmpresaProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonModificarTipoAreaEmpresaProdu = new JButtonMe();
        this.jButtonActualizarTipoAreaEmpresaProdu = new JButtonMe();
        this.jButtonEliminarTipoAreaEmpresaProdu = new JButtonMe();
        this.jButtonCancelarTipoAreaEmpresaProdu = new JButtonMe();
        this.jButtonGuardarCambiosTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonCerrarTipoAreaEmpresaProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoAreaEmpresaProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu = new JScrollPane();
				
		
		
		this.jPanelCamposTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Area Empresa";
		
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAreaEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoAreaEmpresaProdu.setName("jPanelCamposTipoAreaEmpresaProdu"); 

		this.jPanelCamposOcultosTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoAreaEmpresaProdu.setName("jPanelCamposOcultosTipoAreaEmpresaProdu"); 

        this.jPanelAccionesTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAreaEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoAreaEmpresaProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoAreaEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoAreaEmpresaProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoAreaEmpresaProdu.setText("Nuevo");
		this.jButtonModificarTipoAreaEmpresaProdu.setText("Editar");
        this.jButtonActualizarTipoAreaEmpresaProdu.setText("Actualizar");
        this.jButtonEliminarTipoAreaEmpresaProdu.setText("Eliminar");
        this.jButtonCancelarTipoAreaEmpresaProdu.setText("Cancelar");
        this.jButtonGuardarCambiosTipoAreaEmpresaProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.setText("Guardar");
		this.jButtonCerrarTipoAreaEmpresaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAreaEmpresaProdu,"nuevo_button","Nuevo",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoAreaEmpresaProdu,"modificar_button","Editar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoAreaEmpresaProdu,"actualizar_button","Actualizar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoAreaEmpresaProdu,"eliminar_button","Eliminar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoAreaEmpresaProdu,"cancelar_button","Cancelar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoAreaEmpresaProdu,"guardarcambios_button","Guardar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu,"guardarcambiostabla_button","Guardar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAreaEmpresaProdu,"cerrar_button","Salir",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoAreaEmpresaProdu.setToolTipText("Nuevo"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoAreaEmpresaProdu.setToolTipText("Editar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoAreaEmpresaProdu.setToolTipText("Actualizar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoAreaEmpresaProdu.setToolTipText("Eliminar)"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoAreaEmpresaProdu.setToolTipText("Cancelar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoAreaEmpresaProdu.setToolTipText("Guardar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.setToolTipText("Guardar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAreaEmpresaProdu.setToolTipText("Salir"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAreaEmpresaProdu";
		inputMap = this.jButtonNuevoTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAreaEmpresaProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoAreaEmpresaProdu";
		inputMap = this.jButtonActualizarTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoAreaEmpresaProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoAreaEmpresaProdu";
		inputMap = this.jButtonEliminarTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoAreaEmpresaProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoAreaEmpresaProdu";
		inputMap = this.jButtonCancelarTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoAreaEmpresaProdu"));
		
		//CERRAR		
		sMapKey = "CerrarTipoAreaEmpresaProdu";
		inputMap = this.jButtonCerrarTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAreaEmpresaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAreaEmpresaProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAreaEmpresaProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoAreaEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoAreaEmpresaProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoAreaEmpresaProdu.setToolTipText("Nuevo TipoAreaEmpresaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoAreaEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoAreaEmpresaProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoAreaEmpresaProdu.setToolTipText("Sin Cerrar Ventana TipoAreaEmpresaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoAreaEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoAreaEmpresaProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoAreaEmpresaProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoAreaEmpresaProdu = new JLabelMe();
		
		this.jLabelAccionesTipoAreaEmpresaProdu.setText("Acciones");		
		this.jLabelAccionesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoAreaEmpresaProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoAreaEmpresaProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoAreaEmpresaProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoAreaEmpresaProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoAreaEmpresaProdu = new GridBagLayout();
		
		this.jPanelCamposTipoAreaEmpresaProdu.setLayout(gridaBagLayoutCamposTipoAreaEmpresaProdu);
		this.jPanelCamposOcultosTipoAreaEmpresaProdu.setLayout(gridaBagLayoutCamposOcultosTipoAreaEmpresaProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoAreaEmpresaProdu.add(jLabelIdTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);



	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoAreaEmpresaProdu.add(jLabelidTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);


	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoAreaEmpresaProdu.add(jLabelid_empresaTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAreaEmpresaProdu.add(jButtonid_empresaTipoAreaEmpresaProduBusqueda, this.gridBagConstraintsTipoAreaEmpresaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 3;
		this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAreaEmpresaProdu.add(jButtonid_empresaTipoAreaEmpresaProduUpdate, this.gridBagConstraintsTipoAreaEmpresaProdu);
	}

	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoAreaEmpresaProdu.add(jComboBoxid_empresaTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);


	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoAreaEmpresaProdu.add(jLabelnombreTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoAreaEmpresaProdu.add(jButtonnombreTipoAreaEmpresaProduBusqueda, this.gridBagConstraintsTipoAreaEmpresaProdu);
	}

	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoAreaEmpresaProdu.add(jscrollPanenombreTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);


	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoAreaEmpresaProdu.add(jLabeldescripcionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoAreaEmpresaProdu.add(jButtondescripcionTipoAreaEmpresaProduBusqueda, this.gridBagConstraintsTipoAreaEmpresaProdu);
	}

	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoAreaEmpresaProdu.add(jscrollPanedescripcionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iYPanelCamposTipoAreaEmpresaProdu;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iXPanelCamposTipoAreaEmpresaProdu++;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAreaEmpresaProdu.add(this.jPanelidTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);



	if(iXPanelCamposTipoAreaEmpresaProdu % 1==0) {
		iXPanelCamposTipoAreaEmpresaProdu=0;
		iYPanelCamposTipoAreaEmpresaProdu++;
	}
	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iYPanelCamposTipoAreaEmpresaProdu;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iXPanelCamposTipoAreaEmpresaProdu++;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAreaEmpresaProdu.add(this.jPanelnombreTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);



	if(iXPanelCamposTipoAreaEmpresaProdu % 1==0) {
		iXPanelCamposTipoAreaEmpresaProdu=0;
		iYPanelCamposTipoAreaEmpresaProdu++;
	}
	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iYPanelCamposTipoAreaEmpresaProdu;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iXPanelCamposTipoAreaEmpresaProdu++;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAreaEmpresaProdu.add(this.jPaneldescripcionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);



	if(iXPanelCamposTipoAreaEmpresaProdu % 1==0) {
		iXPanelCamposTipoAreaEmpresaProdu=0;
		iYPanelCamposTipoAreaEmpresaProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iYPanelCamposOcultosTipoAreaEmpresaProdu;
	this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iXPanelCamposOcultosTipoAreaEmpresaProdu++;
	this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAreaEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoAreaEmpresaProdu.add(this.jPanelid_empresaTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);



	if(iXPanelCamposOcultosTipoAreaEmpresaProdu % 1==0) {
		iXPanelCamposOcultosTipoAreaEmpresaProdu=0;
		iYPanelCamposOcultosTipoAreaEmpresaProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoAreaEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesTipoAreaEmpresaProdu.setLayout(gridaBagLayoutAccionesTipoAreaEmpresaProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoAreaEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesFormularioTipoAreaEmpresaProdu.setLayout(gridaBagLayoutAccionesFormularioTipoAreaEmpresaProdu);
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAreaEmpresaProdu.add(this.jComboBoxTiposAccionesFormularioTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);

		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAreaEmpresaProdu.add(this.jCheckBoxPostAccionNuevoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAreaEmpresaProdu.add(this.jCheckBoxPostAccionSinCerrarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoareaempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAreaEmpresaProdu.add(this.jCheckBoxPostAccionSinMensajeTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoAreaEmpresaProdu.add(this.jButtonModificarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);							

		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoAreaEmpresaProdu.add(this.jButtonEliminarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
			
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAreaEmpresaProdu.add(this.jButtonActualizarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);


		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAreaEmpresaProdu.add(this.jButtonGuardarCambiosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);	
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoAreaEmpresaProdu.add(this.jButtonCancelarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAreaEmpresaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAreaEmpresaProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;		
			//this.gridBagConstraintsTipoAreaEmpresaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAreaEmpresaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoAreaEmpresaProdu = new TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Area Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Area Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Area Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoAreaEmpresaProduModel tipoareaempresaproduModel=new TipoAreaEmpresaProduModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoAreaEmpresaProduModel.TipoAreaEmpresaProduFocusTraversalPolicy tipoareaempresaproduFocusTraversalPolicy = tipoareaempresaproduModel.new TipoAreaEmpresaProduFocusTraversalPolicy(this);
			
			//tipoareaempresaproduFocusTraversalPolicy.settipoareaempresaproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoareaempresaproduModel);
			
			
			this.jContentPaneDetalleTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoAreaEmpresaProdu = new GridBagLayout();	
			this.jContentPaneDetalleTipoAreaEmpresaProdu.setLayout(gridaBagLayoutDetalleTipoAreaEmpresaProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAreaEmpresaProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
					
				
				this.jContentPaneDetalleTipoAreaEmpresaProdu.add(jTtoolBarDetalleTipoAreaEmpresaProdu, gridBagConstraintsTipoAreaEmpresaProdu);								
				
}
			
			this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu=   new JScrollPane(jContentPaneDetalleTipoAreaEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
	        
			this.jContentPaneDetalleTipoAreaEmpresaProdu.add(jPanelCamposTipoAreaEmpresaProdu, gridBagConstraintsTipoAreaEmpresaProdu);
			
			
			
			
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
						&& tipoareaempresaproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(this.puedeCargarPorParteProductoOrdenDetaProduMaquina,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(this.puedeCargarPorParteProductoProduMaquina,false,-1);
					
					if(this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoAreaEmpresaProdu= new GridBagConstraints();
						this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
						this.jContentPaneDetalleTipoAreaEmpresaProdu.add(this.jTabbedPaneRelacionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoAreaEmpresaProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
					this.gridBagConstraintsTipoAreaEmpresaProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
					
				
					this.jContentPaneDetalleTipoAreaEmpresaProdu.add(jPanelCamposOcultosTipoAreaEmpresaProdu, gridBagConstraintsTipoAreaEmpresaProdu);
				
					this.jPanelCamposOcultosTipoAreaEmpresaProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
	        this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoAreaEmpresaProdu.add(this.jPanelAccionesFormularioTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);							
			
			
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
	        this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoAreaEmpresaProdu.add(this.jPanelAccionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoAreaEmpresaProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu=   new JScrollPane(this.jPanelCamposTipoAreaEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoAreaEmpresaProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			
			
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
			
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoAreaEmpresaProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaprodumaquinaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaprodumaquinaBeanSwingJInternalFrame.setproductoordendetaprodumaquinaSessionBean(this.productoordendetaprodumaquinaSessionBean);

				//this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
				//this.jContentPaneDetalleTipoAreaEmpresaProdu.add(this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoAreaEmpresaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.add("Orden Maquinaes",this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setComponentAt(iIndexTab,this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProduMaquina) {
					this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.add("Orden Maquinaes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		this.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);
		this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);

		this.productoprodumaquinaBeanSwingJInternalFrame=null;//new ProductoProduMaquinaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoprodumaquinaBeanSwingJInternalFramePopup=new ProductoProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoprodumaquinaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {

				ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);

				this.productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoprodumaquinaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoprodumaquinaBeanSwingJInternalFrame.setproductoprodumaquinaSessionBean(this.productoprodumaquinaSessionBean);

				//this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
				//this.jContentPaneDetalleTipoAreaEmpresaProdu.add(this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoAreaEmpresaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.add("Producto Maquina Producciones",this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setComponentAt(iIndexTab,this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				this.productoprodumaquinaBeanSwingJInternalFrame=null;//new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProduMaquina) {
					this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.add("Producto Maquina Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(List<TipoAreaEmpresaProdu> tipoareaempresaprodus,TipoAreaEmpresaProdu tipoareaempresaprodu,ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaprodumaquinaBeanSwingJInternalFrame.getProductoOrdenDetaProduMaquinaLogic().setConnexion(this.tipoareaempresaproduLogic.getConnexion());

					productoordendetaprodumaquinaBeanSwingJInternalFrame.settipoareaempresaprodusForeignKey(tipoareaempresaprodus);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.settipoareaempresaproduForeignKey(tipoareaempresaprodu);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setlidTipoAreaEmpresaProduActual(tipoareaempresaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaprodumaquinaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoAreaEmpresaProdu(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu(tipoareaempresaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaprodumaquinaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoAreaEmpresaProduForeignKey(tipoareaempresaprodu,1,false,true,true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaprodumaquinaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoAreaEmpresaProdu");
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoAreaEmpresaProdu");
					productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n",productoordendetaprodumaquinaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaprodumaquinaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("relacionado");
					} else {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("no_relacionado");
					}

					productoordendetaprodumaquinaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProduMaquina().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoProduMaquinaBeanSwingJInternalFrame(List<TipoAreaEmpresaProdu> tipoareaempresaprodus,TipoAreaEmpresaProdu tipoareaempresaprodu,ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoprodumaquinaBeanSwingJInternalFrame.getProductoProduMaquinaLogic().setConnexion(this.tipoareaempresaproduLogic.getConnexion());

					productoprodumaquinaBeanSwingJInternalFrame.settipoareaempresaprodusForeignKey(tipoareaempresaprodus);
					productoprodumaquinaBeanSwingJInternalFrame.settipoareaempresaproduForeignKey(tipoareaempresaprodu);
					productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu(true);
					productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setlidTipoAreaEmpresaProduActual(tipoareaempresaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoprodumaquinaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProduMaquina(productoprodumaquinaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoprodumaquinaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoAreaEmpresaProdu(true);
					productoprodumaquinaBeanSwingJInternalFrame.setid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu(tipoareaempresaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoprodumaquinaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoprodumaquinaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoAreaEmpresaProduForeignKey(tipoareaempresaprodu,1,false,true,true);
					productoprodumaquinaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoprodumaquinaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoAreaEmpresaProdu");
					productoprodumaquinaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoAreaEmpresaProdu");
					productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(true);
					productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProduMaquina("n",productoprodumaquinaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoprodumaquinaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoprodumaquinaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoprodumaquinaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("relacionado");
					} else {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("no_relacionado");
					}

					productoprodumaquinaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProduMaquina().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
