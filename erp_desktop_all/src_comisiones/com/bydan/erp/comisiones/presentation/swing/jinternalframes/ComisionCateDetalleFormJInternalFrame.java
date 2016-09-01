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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionCateConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionCateDetalleFormJInternalFrame extends ComisionCateBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComisionCate;
	
	protected JMenuBar jmenuBarDetalleComisionCate;
	
	protected JMenu jmenuDetalleComisionCate;
	protected JMenu jmenuDetalleArchivoComisionCate;
	protected JMenu jmenuDetalleAccionesComisionCate;
	protected JMenu jmenuDetalleDatosComisionCate;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionCate;	
	protected GridBagConstraints gridBagConstraintsComisionCate;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComisionCateBeanSwingJInternalFrameAdditional jInternalFrameDetalleComisionCate;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_comisionconfig="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocomision="";
	
	public ComisionCateSessionBean comisioncateSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public EstadoComisionSessionBean estadocomisionSessionBean;	
	
	public ComisionCateLogic comisioncateLogic;
	
	public JScrollPane jScrollPanelDatosComisionCate;
	public JScrollPane jScrollPanelDatosEdicionComisionCate;
	public JScrollPane jScrollPanelDatosGeneralComisionCate;
	
	protected JPanel jPanelCamposComisionCate;    
	protected JPanel jPanelCamposOcultosComisionCate;    	
	protected JPanel jPanelAccionesComisionCate;
	protected JPanel jPanelAccionesFormularioComisionCate;
    
	
	
	protected Integer iXPanelCamposComisionCate=0;
	protected Integer iYPanelCamposComisionCate=0;
	
	protected Integer iXPanelCamposOcultosComisionCate=0;
	protected Integer iYPanelCamposOcultosComisionCate=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComisionCate;
	public JButton jButtonModificarComisionCate;
	public JButton jButtonActualizarComisionCate;
    public JButton jButtonEliminarComisionCate;
	public JButton jButtonCancelarComisionCate;
    public JButton jButtonGuardarCambiosComisionCate;
	public JButton jButtonGuardarCambiosTablaComisionCate;
	protected JButton jButtonCerrarComisionCate;
	
	
	protected JButton jButtonProcesarInformacionComisionCate;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComisionCate;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComisionCate;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComisionCate;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionCate;
	protected JButton jButtonModificarToolBarComisionCate;
	protected JButton jButtonActualizarToolBarComisionCate;
    protected JButton jButtonEliminarToolBarComisionCate;
	protected JButton jButtonCancelarToolBarComisionCate;
    protected JButton jButtonGuardarCambiosToolBarComisionCate;
	protected JButton jButtonGuardarCambiosTablaToolBarComisionCate;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionCate;
	protected JButton jButtonCerrarToolBarComisionCate;
	
	protected JButton jButtonProcesarInformacionToolBarComisionCate;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionCate;
	protected JMenuItem jMenuItemModificarComisionCate;
	protected JMenuItem jMenuItemActualizarComisionCate;
    protected JMenuItem jMenuItemEliminarComisionCate;
	protected JMenuItem jMenuItemCancelarComisionCate;
    protected JMenuItem jMenuItemGuardarCambiosComisionCate;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionCate;
	protected JMenuItem jMenuItemCerrarComisionCate;
	protected JMenuItem jMenuItemDetalleCerrarComisionCate;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionCate;
	
	protected JMenuItem jMenuItemProcesarInformacionComisionCate;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionCate;
	protected JMenuItem jMenuItemMostrarOcultarComisionCate;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionCate;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionCate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionCate;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComisionCate;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComisionCate;
	public JLabel jLabelIdComisionCate;
	public JLabel jLabelidComisionCate;
	public JButton jButtonidComisionCateBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeComisionCate;
	public JLabel jLabelporcentajeComisionCate;
	public JTextField jTextFieldporcentajeComisionCate;
	public JButton jButtonporcentajeComisionCateBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionComisionCate;
	public JLabel jLabeldescripcionComisionCate;
	public JTextArea jTextAreadescripcionComisionCate;
	public JScrollPane jscrollPanedescripcionComisionCate;
	public JButton jButtondescripcionComisionCateBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComisionCate;
	public JLabel jLabelid_empresaComisionCate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComisionCate;
	public JButton jButtonid_empresaComisionCate= new JButtonMe();
	public JButton jButtonid_empresaComisionCateUpdate= new JButtonMe();
	public JButton jButtonid_empresaComisionCateBusqueda= new JButtonMe();

	public JPanel jPanelid_comision_configComisionCate;
	public JLabel jLabelid_comision_configComisionCate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configComisionCate;
	public JButton jButtonid_comision_configComisionCate= new JButtonMe();
	public JButton jButtonid_comision_configComisionCateUpdate= new JButtonMe();
	public JButton jButtonid_comision_configComisionCateBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorComisionCate;
	public JLabel jLabelid_vendedorComisionCate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorComisionCate;
	public JButton jButtonid_vendedorComisionCate= new JButtonMe();
	public JButton jButtonid_vendedorComisionCateUpdate= new JButtonMe();
	public JButton jButtonid_vendedorComisionCateBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorComisionCateArbol= new JButtonMe();

	public JPanel jPanelid_lineaComisionCate;
	public JLabel jLabelid_lineaComisionCate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaComisionCate;
	public JButton jButtonid_lineaComisionCate= new JButtonMe();
	public JButton jButtonid_lineaComisionCateUpdate= new JButtonMe();
	public JButton jButtonid_lineaComisionCateBusqueda= new JButtonMe();
	public JButton jButtonid_lineaComisionCateArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoComisionCate;
	public JLabel jLabelid_linea_grupoComisionCate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoComisionCate;
	public JButton jButtonid_linea_grupoComisionCate= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionCateUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionCateBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionCateArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaComisionCate;
	public JLabel jLabelid_linea_categoriaComisionCate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaComisionCate;
	public JButton jButtonid_linea_categoriaComisionCate= new JButtonMe();
	public JButton jButtonid_linea_categoriaComisionCateUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaComisionCateBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaComisionCateArbol= new JButtonMe();

	public JPanel jPanelid_estado_comisionComisionCate;
	public JLabel jLabelid_estado_comisionComisionCate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_comisionComisionCate;
	public JButton jButtonid_estado_comisionComisionCate= new JButtonMe();
	public JButton jButtonid_estado_comisionComisionCateUpdate= new JButtonMe();
	public JButton jButtonid_estado_comisionComisionCateBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComisionCate;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComisionCateDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComisionCate=new JPanel();
				this.jPanelAccionesFormularioComisionCate=new JPanel();
				this.jmenuBarDetalleComisionCate=new JMenuBar();
				this.jTtoolBarDetalleComisionCate=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionCateDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComisionCateDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionCateDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionCateDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionCateDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComisionCate() {
		return this.jButtonActualizarToolBarComisionCate;
	}
	
	public JButton getjButtonEliminarToolBarComisionCate() {
		return this.jButtonEliminarToolBarComisionCate;
	}
	
	public JButton getjButtonCancelarToolBarComisionCate() {
		return this.jButtonCancelarToolBarComisionCate;
	}		
	
	public JButton getjButtonProcesarInformacionComisionCate() {
		return this.jButtonProcesarInformacionComisionCate;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionCate)	{
		this.jButtonProcesarInformacionComisionCate = jButtonProcesarInformacionComisionCate;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionCate() {
		return this.jComboBoxTiposAccionesComisionCate;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionCate(
			JComboBox jComboBoxTiposRelacionesComisionCate) {
		this.jComboBoxTiposRelacionesComisionCate = jComboBoxTiposRelacionesComisionCate;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionCate(
			JComboBox jComboBoxTiposAccionesComisionCate) {
		this.jComboBoxTiposAccionesComisionCate = jComboBoxTiposAccionesComisionCate;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComisionCate() {
		return this.jComboBoxTiposAccionesFormularioComisionCate;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComisionCate(
			JComboBox jComboBoxTiposAccionesFormularioComisionCate) {
		this.jComboBoxTiposAccionesFormularioComisionCate = jComboBoxTiposAccionesFormularioComisionCate;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comisioncateSessionBean=new ComisionCateSessionBean();
		
		this.comisioncateSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisioncateSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisioncateSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionCateJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Cate MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
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
	
		ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComisionCate= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComisionCate=new JButtonMe();
				this.jButtonModificarToolBarComisionCate=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComisionCate,this.jTtoolBarDetalleComisionCate,
							"actualizar","actualizar","Actualizar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComisionCate,this.jTtoolBarDetalleComisionCate,
							"eliminar","eliminar","Eliminar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComisionCate,this.jTtoolBarDetalleComisionCate,
							"cancelar","cancelar","Cancelar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComisionCate,this.jTtoolBarDetalleComisionCate,
							"guardarcambios","guardarcambios","Guardar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComisionCate=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComisionCate=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComisionCate=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComisionCate=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComisionCate=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionCate= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionCate.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionCate,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComisionCate= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComisionCate.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComisionCate,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComisionCate= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComisionCate.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComisionCate,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComisionCate= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComisionCate.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComisionCate,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComisionCate= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComisionCate.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComisionCate,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComisionCate= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionCate.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionCate,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionCate= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionCate.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionCate,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComisionCate= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComisionCate.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComisionCate,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionCate= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionCate.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionCate,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionCate= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionCate.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionCate,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComisionCate.add(this.jMenuItemDetalleCerrarComisionCate);
		
		this.jmenuDetalleAccionesComisionCate.add(this.jMenuItemActualizarComisionCate);
		this.jmenuDetalleAccionesComisionCate.add(this.jMenuItemEliminarComisionCate);
		this.jmenuDetalleAccionesComisionCate.add(this.jMenuItemCancelarComisionCate);		
		
		//this.jmenuDetalleDatosComisionCate.add(this.jMenuItemDetalleAbrirOrderByComisionCate);				
		this.jmenuDetalleDatosComisionCate.add(this.jMenuItemDetalleMostarOcultarComisionCate);				
				
		//this.jmenuDetalleAccionesComisionCate.add(this.jMenuItemGuardarCambiosComisionCate);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComisionCate.add(this.jmenuDetalleArchivoComisionCate);		
		this.jmenuBarDetalleComisionCate.add(this.jmenuDetalleAccionesComisionCate);		
		this.jmenuBarDetalleComisionCate.add(this.jmenuDetalleDatosComisionCate);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComisionCate);				
	}
	
	
	public void inicializarElementosCamposComisionCate() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComisionCate = new JLabelMe();
		jLabelIdComisionCate.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComisionCate = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComisionCate= new GridBagLayout();

		this.jPanelidComisionCate.setLayout(this.gridaBagLayoutComisionCate);

		jLabelidComisionCate = new JLabel();
		jLabelidComisionCate.setText("Id");

		jLabelidComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeComisionCate = new JLabelMe();
		this.jLabelporcentajeComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeComisionCate.setToolTipText("Porcentaje");
		this.jLabelporcentajeComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPanelporcentajeComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jTextFieldporcentajeComisionCate= new JTextFieldMe();
		jTextFieldporcentajeComisionCate.setEnabled(false);
		jTextFieldporcentajeComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeComisionCate.setText("0.0");

		this.jButtonporcentajeComisionCateBusqueda= new JButtonMe();
		this.jButtonporcentajeComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeComisionCateBusqueda.setText("U");
		this.jButtonporcentajeComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeComisionCateBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionComisionCate = new JLabelMe();
		this.jLabeldescripcionComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionComisionCate.setToolTipText("Descripcion");
		this.jLabeldescripcionComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPaneldescripcionComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jTextAreadescripcionComisionCate= new JTextAreaMe();
		jTextAreadescripcionComisionCate.setEnabled(false);
		jTextAreadescripcionComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionCate.setLineWrap(true);
		jTextAreadescripcionComisionCate.setWrapStyleWord(true);
		jTextAreadescripcionComisionCate.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionComisionCate.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionComisionCate = new JScrollPane(jTextAreadescripcionComisionCate);
		jscrollPanedescripcionComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionComisionCateBusqueda= new JButtonMe();
		this.jButtondescripcionComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionComisionCateBusqueda.setText("U");
		this.jButtondescripcionComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionComisionCateBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComisionCate() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComisionCate = new JLabelMe();
		this.jLabelid_empresaComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComisionCate.setToolTipText("Empresa");
		this.jLabelid_empresaComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPanelid_empresaComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jComboBoxid_empresaComisionCate= new JComboBoxMe();
		jComboBoxid_empresaComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComisionCate.setEnabled(false);

		this.jButtonid_empresaComisionCate= new JButtonMe();
		this.jButtonid_empresaComisionCate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionCate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionCate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionCate.setText("Buscar");
		this.jButtonid_empresaComisionCate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComisionCate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionCate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionCate"));

		this.jButtonid_empresaComisionCateBusqueda= new JButtonMe();
		this.jButtonid_empresaComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionCateBusqueda.setText("U");
		this.jButtonid_empresaComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComisionCateBusqueda.setVisible(false);		}

		this.jButtonid_empresaComisionCateUpdate= new JButtonMe();
		this.jButtonid_empresaComisionCateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionCateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionCateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionCateUpdate.setText("U");
		this.jButtonid_empresaComisionCateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComisionCateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionCateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionCateUpdate"));



					
		this.jLabelid_comision_configComisionCate = new JLabelMe();
		this.jLabelid_comision_configComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG+" : *");
		this.jLabelid_comision_configComisionCate.setToolTipText("Configuracion");
		this.jLabelid_comision_configComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_comision_configComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_comision_configComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPanelid_comision_configComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jComboBoxid_comision_configComisionCate= new JComboBoxMe();
		jComboBoxid_comision_configComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_comision_configComisionCate= new JButtonMe();
		this.jButtonid_comision_configComisionCate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionCate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionCate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionCate.setText("Buscar");
		this.jButtonid_comision_configComisionCate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_comision_configComisionCate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionCate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_comision_configComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionCate"));

		this.jButtonid_comision_configComisionCateBusqueda= new JButtonMe();
		this.jButtonid_comision_configComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionCateBusqueda.setText("U");
		this.jButtonid_comision_configComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_comision_configComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_comision_configComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_comision_configComisionCateBusqueda.setVisible(false);		}

		this.jButtonid_comision_configComisionCateUpdate= new JButtonMe();
		this.jButtonid_comision_configComisionCateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionCateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionCateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionCateUpdate.setText("U");
		this.jButtonid_comision_configComisionCateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_comision_configComisionCateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionCateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_comision_configComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionCateUpdate"));



					
		this.jLabelid_vendedorComisionCate = new JLabelMe();
		this.jLabelid_vendedorComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorComisionCate.setToolTipText("Vendedor");
		this.jLabelid_vendedorComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPanelid_vendedorComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jComboBoxid_vendedorComisionCate= new JComboBoxMe();
		jComboBoxid_vendedorComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorComisionCate= new JButtonMe();
		this.jButtonid_vendedorComisionCate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionCate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionCate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionCate.setText("Buscar");
		this.jButtonid_vendedorComisionCate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorComisionCate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionCate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionCate"));

		this.jButtonid_vendedorComisionCateBusqueda= new JButtonMe();
		this.jButtonid_vendedorComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionCateBusqueda.setText("U");
		this.jButtonid_vendedorComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorComisionCateBusqueda.setVisible(false);		}

		this.jButtonid_vendedorComisionCateUpdate= new JButtonMe();
		this.jButtonid_vendedorComisionCateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionCateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionCateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionCateUpdate.setText("U");
		this.jButtonid_vendedorComisionCateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorComisionCateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionCateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionCateUpdate"));


		jButtonid_vendedorComisionCateArbol= new JButtonMe();
		jButtonid_vendedorComisionCateArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionCateArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionCateArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionCateArbol.setText("Arbol");
		jButtonid_vendedorComisionCateArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorComisionCateArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionCateArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionCateArbol"));



					
		this.jLabelid_lineaComisionCate = new JLabelMe();
		this.jLabelid_lineaComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaComisionCate.setToolTipText("Linea");
		this.jLabelid_lineaComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPanelid_lineaComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jComboBoxid_lineaComisionCate= new JComboBoxMe();
		jComboBoxid_lineaComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaComisionCate= new JButtonMe();
		this.jButtonid_lineaComisionCate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionCate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionCate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionCate.setText("Buscar");
		this.jButtonid_lineaComisionCate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaComisionCate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionCate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionCate"));

		this.jButtonid_lineaComisionCateBusqueda= new JButtonMe();
		this.jButtonid_lineaComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaComisionCateBusqueda.setText("U");
		this.jButtonid_lineaComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaComisionCateBusqueda.setVisible(false);		}

		this.jButtonid_lineaComisionCateUpdate= new JButtonMe();
		this.jButtonid_lineaComisionCateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionCateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionCateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaComisionCateUpdate.setText("U");
		this.jButtonid_lineaComisionCateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaComisionCateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionCateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionCateUpdate"));


		jButtonid_lineaComisionCateArbol= new JButtonMe();
		jButtonid_lineaComisionCateArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionCateArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionCateArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionCateArbol.setText("Arbol");
		jButtonid_lineaComisionCateArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaComisionCateArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionCateArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionCateArbol"));



					
		this.jLabelid_linea_grupoComisionCate = new JLabelMe();
		this.jLabelid_linea_grupoComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoComisionCate.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPanelid_linea_grupoComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jComboBoxid_linea_grupoComisionCate= new JComboBoxMe();
		jComboBoxid_linea_grupoComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoComisionCate= new JButtonMe();
		this.jButtonid_linea_grupoComisionCate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionCate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionCate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionCate.setText("Buscar");
		this.jButtonid_linea_grupoComisionCate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoComisionCate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionCate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionCate"));

		this.jButtonid_linea_grupoComisionCateBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoComisionCateBusqueda.setText("U");
		this.jButtonid_linea_grupoComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoComisionCateBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoComisionCateUpdate= new JButtonMe();
		this.jButtonid_linea_grupoComisionCateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionCateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionCateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoComisionCateUpdate.setText("U");
		this.jButtonid_linea_grupoComisionCateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoComisionCateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionCateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionCateUpdate"));


		jButtonid_linea_grupoComisionCateArbol= new JButtonMe();
		jButtonid_linea_grupoComisionCateArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionCateArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionCateArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionCateArbol.setText("Arbol");
		jButtonid_linea_grupoComisionCateArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoComisionCateArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionCateArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionCateArbol"));



					
		this.jLabelid_linea_categoriaComisionCate = new JLabelMe();
		this.jLabelid_linea_categoriaComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaComisionCate.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPanelid_linea_categoriaComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jComboBoxid_linea_categoriaComisionCate= new JComboBoxMe();
		jComboBoxid_linea_categoriaComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaComisionCate= new JButtonMe();
		this.jButtonid_linea_categoriaComisionCate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaComisionCate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaComisionCate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaComisionCate.setText("Buscar");
		this.jButtonid_linea_categoriaComisionCate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaComisionCate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaComisionCate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaComisionCate"));

		this.jButtonid_linea_categoriaComisionCateBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaComisionCateBusqueda.setText("U");
		this.jButtonid_linea_categoriaComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaComisionCateBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaComisionCateUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaComisionCateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaComisionCateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaComisionCateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaComisionCateUpdate.setText("U");
		this.jButtonid_linea_categoriaComisionCateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaComisionCateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaComisionCateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaComisionCateUpdate"));


		jButtonid_linea_categoriaComisionCateArbol= new JButtonMe();
		jButtonid_linea_categoriaComisionCateArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaComisionCateArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaComisionCateArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaComisionCateArbol.setText("Arbol");
		jButtonid_linea_categoriaComisionCateArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaComisionCateArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaComisionCateArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaComisionCateArbol"));



					
		this.jLabelid_estado_comisionComisionCate = new JLabelMe();
		this.jLabelid_estado_comisionComisionCate.setText(""+ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION+" : *");
		this.jLabelid_estado_comisionComisionCate.setToolTipText("Estado");
		this.jLabelid_estado_comisionComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_comisionComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_comisionComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_comisionComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_comisionComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_comisionComisionCate.setToolTipText(ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION);
		this.gridaBagLayoutComisionCate = new GridBagLayout();
		this.jPanelid_estado_comisionComisionCate.setLayout(this.gridaBagLayoutComisionCate);


		jComboBoxid_estado_comisionComisionCate= new JComboBoxMe();
		jComboBoxid_estado_comisionComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_comisionComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_comisionComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_comisionComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_comisionComisionCate= new JButtonMe();
		this.jButtonid_estado_comisionComisionCate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionCate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionCate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionCate.setText("Buscar");
		this.jButtonid_estado_comisionComisionCate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_comisionComisionCate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionCate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_comisionComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionCate"));

		this.jButtonid_estado_comisionComisionCateBusqueda= new JButtonMe();
		this.jButtonid_estado_comisionComisionCateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionCateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionCateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_comisionComisionCateBusqueda.setText("U");
		this.jButtonid_estado_comisionComisionCateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_comisionComisionCateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionCateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_comisionComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionCateBusqueda"));

		if(this.comisioncateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_comisionComisionCateBusqueda.setVisible(false);		}

		this.jButtonid_estado_comisionComisionCateUpdate= new JButtonMe();
		this.jButtonid_estado_comisionComisionCateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionCateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionCateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_comisionComisionCateUpdate.setText("U");
		this.jButtonid_estado_comisionComisionCateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_comisionComisionCateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionCateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_comisionComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionCateUpdate"));



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
		//this.jInternalFrameDetalleComisionCate = new ComisionCateBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comision Cate DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionCate= new GridBagLayout();
		

		
		String sToolTipComisionCate="";
		sToolTipComisionCate=ComisionCateConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionCate+="(Comisiones.ComisionCate)";
		}
		
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionCate+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComisionCate = new JButtonMe();
		this.jButtonModificarComisionCate = new JButtonMe();
        this.jButtonActualizarComisionCate = new JButtonMe();
        this.jButtonEliminarComisionCate = new JButtonMe();
        this.jButtonCancelarComisionCate = new JButtonMe();
        this.jButtonGuardarCambiosComisionCate = new JButtonMe();
		this.jButtonGuardarCambiosTablaComisionCate = new JButtonMe();
		this.jButtonCerrarComisionCate = new JButtonMe();
		
		this.jScrollPanelDatosComisionCate = new JScrollPane();   
        this.jScrollPanelDatosEdicionComisionCate = new JScrollPane();
		this.jScrollPanelDatosGeneralComisionCate = new JScrollPane();
				
		
		
		this.jPanelCamposComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Cate";
		
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Cates" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionCate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComisionCate.setName("jPanelCamposComisionCate"); 

		this.jPanelCamposOcultosComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComisionCate.setName("jPanelCamposOcultosComisionCate"); 

        this.jPanelAccionesComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionCate.setToolTipText("Acciones");
        this.jPanelAccionesComisionCate.setName("Acciones"); 

		this.jPanelAccionesFormularioComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComisionCate.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComisionCate.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComisionCate.setText("Nuevo");
		this.jButtonModificarComisionCate.setText("Editar");
        this.jButtonActualizarComisionCate.setText("Actualizar");
        this.jButtonEliminarComisionCate.setText("Eliminar");
        this.jButtonCancelarComisionCate.setText("Cancelar");
        this.jButtonGuardarCambiosComisionCate.setText("Guardar");
		this.jButtonGuardarCambiosTablaComisionCate.setText("Guardar");
		this.jButtonCerrarComisionCate.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionCate,"nuevo_button","Nuevo",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComisionCate,"modificar_button","Editar",this.comisioncateSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComisionCate,"actualizar_button","Actualizar",this.comisioncateSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComisionCate,"eliminar_button","Eliminar",this.comisioncateSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComisionCate,"cancelar_button","Cancelar",this.comisioncateSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComisionCate,"guardarcambios_button","Guardar",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionCate,"guardarcambiostabla_button","Guardar",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionCate,"cerrar_button","Salir",this.comisioncateSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComisionCate.setToolTipText("Nuevo"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComisionCate.setToolTipText("Editar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComisionCate.setToolTipText("Actualizar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComisionCate.setToolTipText("Eliminar)"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComisionCate.setToolTipText("Cancelar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComisionCate.setToolTipText("Guardar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComisionCate.setToolTipText("Guardar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionCate.setToolTipText("Salir"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionCate";
		inputMap = this.jButtonNuevoComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionCate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionCate"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComisionCate";
		inputMap = this.jButtonActualizarComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComisionCate"));
		
		//ELIMINAR
		sMapKey = "EliminarComisionCate";
		inputMap = this.jButtonEliminarComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComisionCate"));
		
		//CANCELAR	
		sMapKey = "CancelarComisionCate";
		inputMap = this.jButtonCancelarComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComisionCate"));
		
		//CERRAR		
		sMapKey = "CerrarComisionCate";
		inputMap = this.jButtonCerrarComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionCate"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionCate";
		inputMap = this.jButtonGuardarCambiosTablaComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionCate"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComisionCate = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComisionCate.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComisionCate.setToolTipText("Nuevo ComisionCate");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComisionCate = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComisionCate.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComisionCate.setToolTipText("Sin Cerrar Ventana ComisionCate");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComisionCate = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComisionCate.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComisionCate.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionCate.setText("Accion");
		this.jComboBoxTiposAccionesComisionCate.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComisionCate.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComisionCate.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComisionCate = new JLabelMe();
		
		this.jLabelAccionesComisionCate.setText("Acciones");		
		this.jLabelAccionesComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComisionCate();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComisionCate();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComisionCate=new JTabbedPane();
		this.jTabbedPaneRelacionesComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComisionCate,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComisionCate.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionCate.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionCate.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComisionCate.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionCate.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionCate.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComisionCate = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComisionCate = new GridBagLayout();
		
		this.jPanelCamposComisionCate.setLayout(gridaBagLayoutCamposComisionCate);
		this.jPanelCamposOcultosComisionCate.setLayout(gridaBagLayoutCamposOcultosComisionCate);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComisionCate.add(jLabelIdComisionCate, this.gridBagConstraintsComisionCate);



	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComisionCate.add(jLabelidComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComisionCate.add(jLabelid_empresaComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 2;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionCate.add(jButtonid_empresaComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 3;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionCate.add(jButtonid_empresaComisionCateUpdate, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComisionCate.add(jComboBoxid_empresaComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_comision_configComisionCate.add(jLabelid_comision_configComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 2;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionCate.add(jButtonid_comision_configComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 3;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionCate.add(jButtonid_comision_configComisionCateUpdate, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_comision_configComisionCate.add(jComboBoxid_comision_configComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorComisionCate.add(jLabelid_vendedorComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 2;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorComisionCate.add(jButtonid_vendedorComisionCate, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 3;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorComisionCate.add(jButtonid_vendedorComisionCateArbol, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 4;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionCate.add(jButtonid_vendedorComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 5;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionCate.add(jButtonid_vendedorComisionCateUpdate, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorComisionCate.add(jComboBoxid_vendedorComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaComisionCate.add(jLabelid_lineaComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 2;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaComisionCate.add(jButtonid_lineaComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 3;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaComisionCate.add(jButtonid_lineaComisionCateUpdate, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaComisionCate.add(jComboBoxid_lineaComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoComisionCate.add(jLabelid_linea_grupoComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 2;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoComisionCate.add(jButtonid_linea_grupoComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 3;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoComisionCate.add(jButtonid_linea_grupoComisionCateUpdate, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoComisionCate.add(jComboBoxid_linea_grupoComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaComisionCate.add(jLabelid_linea_categoriaComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 2;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaComisionCate.add(jButtonid_linea_categoriaComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 3;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaComisionCate.add(jButtonid_linea_categoriaComisionCateUpdate, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaComisionCate.add(jComboBoxid_linea_categoriaComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_comisionComisionCate.add(jLabelid_estado_comisionComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 2;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_comisionComisionCate.add(jButtonid_estado_comisionComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 3;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_comisionComisionCate.add(jButtonid_estado_comisionComisionCateUpdate, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_comisionComisionCate.add(jComboBoxid_estado_comisionComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeComisionCate.add(jLabelporcentajeComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 2;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeComisionCate.add(jButtonporcentajeComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeComisionCate.add(jTextFieldporcentajeComisionCate, this.gridBagConstraintsComisionCate);


	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 0;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionComisionCate.add(jLabeldescripcionComisionCate, this.gridBagConstraintsComisionCate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 2;
		this.gridBagConstraintsComisionCate.ipadx = 0;
		this.gridBagConstraintsComisionCate.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionComisionCate.add(jButtondescripcionComisionCateBusqueda, this.gridBagConstraintsComisionCate);
	}

	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionCate.gridy = 0;
	this.gridBagConstraintsComisionCate.gridx = 1;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionComisionCate.add(jscrollPanedescripcionComisionCate, this.gridBagConstraintsComisionCate);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPanelidComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPanelid_comision_configComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPanelid_vendedorComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPanelid_lineaComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPanelid_linea_grupoComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPanelid_linea_categoriaComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPanelid_estado_comisionComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPanelporcentajeComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionCate.add(this.jPaneldescripcionComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposComisionCate % 1==0) {
		iXPanelCamposComisionCate=0;
		iYPanelCamposComisionCate++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComisionCate = new GridBagConstraints();
	this.gridBagConstraintsComisionCate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionCate.gridy = iYPanelCamposOcultosComisionCate;
	this.gridBagConstraintsComisionCate.gridx = iXPanelCamposOcultosComisionCate++;
	this.gridBagConstraintsComisionCate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionCate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComisionCate.add(this.jPanelid_empresaComisionCate, this.gridBagConstraintsComisionCate);



	if(iXPanelCamposOcultosComisionCate % 1==0) {
		iXPanelCamposOcultosComisionCate=0;
		iYPanelCamposOcultosComisionCate++;
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
			
		GridBagLayout gridaBagLayoutAccionesComisionCate= new GridBagLayout();
		this.jPanelAccionesComisionCate.setLayout(gridaBagLayoutAccionesComisionCate);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComisionCate= new GridBagLayout();
		this.jPanelAccionesFormularioComisionCate.setLayout(gridaBagLayoutAccionesFormularioComisionCate);
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionCate.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionCate.add(this.jComboBoxTiposAccionesFormularioComisionCate, this.gridBagConstraintsComisionCate);

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionCate.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionCate.add(this.jCheckBoxPostAccionNuevoComisionCate, this.gridBagConstraintsComisionCate);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.comisioncateSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionCate.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionCate.add(this.jCheckBoxPostAccionSinCerrarComisionCate, this.gridBagConstraintsComisionCate);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.comisioncateSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionCate.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionCate.add(this.jCheckBoxPostAccionSinMensajeComisionCate, this.gridBagConstraintsComisionCate);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = iPosXAccion++;
			
		this.jPanelAccionesComisionCate.add(this.jButtonModificarComisionCate, this.gridBagConstraintsComisionCate);							

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx =iPosXAccion++;
			
		this.jPanelAccionesComisionCate.add(this.jButtonEliminarComisionCate, this.gridBagConstraintsComisionCate);
		
			
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = 0;		
		this.gridBagConstraintsComisionCate.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionCate.add(this.jButtonActualizarComisionCate, this.gridBagConstraintsComisionCate);


		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = 0;		
		this.gridBagConstraintsComisionCate.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionCate.add(this.jButtonGuardarCambiosComisionCate, this.gridBagConstraintsComisionCate);	
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = 0;		
		this.gridBagConstraintsComisionCate.gridx =iPosXAccion++;
		
		this.jPanelAccionesComisionCate.add(this.jButtonCancelarComisionCate, this.gridBagConstraintsComisionCate);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionCate = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionCate);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionCate = new GridBagConstraints();						
			this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionCate.gridx = 0;		
			//this.gridBagConstraintsComisionCate.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionCate.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionCate.gridx =0;
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionCate.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionCate, this.gridBagConstraintsComisionCate);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComisionCateJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComisionCate = new ComisionCateBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comision Cate DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comision Cate DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Cate Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComisionCateModel comisioncateModel=new ComisionCateModel(this);
			
			//SI USARA CLASE INTERNA
			//ComisionCateModel.ComisionCateFocusTraversalPolicy comisioncateFocusTraversalPolicy = comisioncateModel.new ComisionCateFocusTraversalPolicy(this);
			
			//comisioncateFocusTraversalPolicy.setcomisioncateJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comisioncateModel);
			
			
			this.jContentPaneDetalleComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComisionCate = new GridBagLayout();	
			this.jContentPaneDetalleComisionCate.setLayout(gridaBagLayoutDetalleComisionCate);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionCate = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComisionCate = new GridBagConstraints();
				this.gridBagConstraintsComisionCate.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComisionCate.gridx = 0;
					
				
				this.jContentPaneDetalleComisionCate.add(jTtoolBarDetalleComisionCate, gridBagConstraintsComisionCate);								
				
}
			
			this.jScrollPanelDatosEdicionComisionCate=   new JScrollPane(jContentPaneDetalleComisionCate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionCate.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionCate.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionCate.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComisionCate=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionCate.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionCate.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionCate.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComisionCate.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComisionCate.gridx = 0;
	        
			this.jContentPaneDetalleComisionCate.add(jPanelCamposComisionCate, gridBagConstraintsComisionCate);
			
			
			
			
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
						&& comisioncateSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComisionCate= new GridBagConstraints();
						this.gridBagConstraintsComisionCate.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComisionCate.gridx = 0;
						this.jContentPaneDetalleComisionCate.add(this.jTabbedPaneRelacionesComisionCate, this.gridBagConstraintsComisionCate);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComisionCate.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComisionCate.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComisionCate = new GridBagConstraints();
					this.gridBagConstraintsComisionCate.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComisionCate.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComisionCate.gridx = 0;
					
				
					this.jContentPaneDetalleComisionCate.add(jPanelCamposOcultosComisionCate, gridBagConstraintsComisionCate);
				
					this.jPanelCamposOcultosComisionCate.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComisionCate.gridx = 0;
	        this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComisionCate.add(this.jPanelAccionesFormularioComisionCate, this.gridBagConstraintsComisionCate);							
			
			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
	        this.gridBagConstraintsComisionCate.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComisionCate.gridx = 0;
	        
			
			this.jContentPaneDetalleComisionCate.add(this.jPanelAccionesComisionCate, this.gridBagConstraintsComisionCate);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComisionCate);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComisionCate=   new JScrollPane(this.jPanelCamposComisionCate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionCate.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionCate.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionCate.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComisionCate.gridx = 0;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComisionCate.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComisionCate, this.gridBagConstraintsComisionCate);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionCate.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComisionCate, this.gridBagConstraintsComisionCate);			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionCate.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComisionCate, this.gridBagConstraintsComisionCate);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionCate, this.gridBagConstraintsComisionCate);
			
			
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionCate, this.gridBagConstraintsComisionCate);
		
			
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionCate, this.gridBagConstraintsComisionCate);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComisionCate;//jContentPane;
		
		return jScrollPanelDatosEdicionComisionCate;
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
