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
import com.bydan.erp.comisiones.util.ComisionMarcaConstantesFunciones;

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
public class ComisionMarcaDetalleFormJInternalFrame extends ComisionMarcaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComisionMarca;
	
	protected JMenuBar jmenuBarDetalleComisionMarca;
	
	protected JMenu jmenuDetalleComisionMarca;
	protected JMenu jmenuDetalleArchivoComisionMarca;
	protected JMenu jmenuDetalleAccionesComisionMarca;
	protected JMenu jmenuDetalleDatosComisionMarca;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionMarca;	
	protected GridBagConstraints gridBagConstraintsComisionMarca;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComisionMarcaBeanSwingJInternalFrameAdditional jInternalFrameDetalleComisionMarca;		
	
	
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

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocomision="";
	
	public ComisionMarcaSessionBean comisionmarcaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public EstadoComisionSessionBean estadocomisionSessionBean;	
	
	public ComisionMarcaLogic comisionmarcaLogic;
	
	public JScrollPane jScrollPanelDatosComisionMarca;
	public JScrollPane jScrollPanelDatosEdicionComisionMarca;
	public JScrollPane jScrollPanelDatosGeneralComisionMarca;
	
	protected JPanel jPanelCamposComisionMarca;    
	protected JPanel jPanelCamposOcultosComisionMarca;    	
	protected JPanel jPanelAccionesComisionMarca;
	protected JPanel jPanelAccionesFormularioComisionMarca;
    
	
	
	protected Integer iXPanelCamposComisionMarca=0;
	protected Integer iYPanelCamposComisionMarca=0;
	
	protected Integer iXPanelCamposOcultosComisionMarca=0;
	protected Integer iYPanelCamposOcultosComisionMarca=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComisionMarca;
	public JButton jButtonModificarComisionMarca;
	public JButton jButtonActualizarComisionMarca;
    public JButton jButtonEliminarComisionMarca;
	public JButton jButtonCancelarComisionMarca;
    public JButton jButtonGuardarCambiosComisionMarca;
	public JButton jButtonGuardarCambiosTablaComisionMarca;
	protected JButton jButtonCerrarComisionMarca;
	
	
	protected JButton jButtonProcesarInformacionComisionMarca;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComisionMarca;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComisionMarca;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComisionMarca;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionMarca;
	protected JButton jButtonModificarToolBarComisionMarca;
	protected JButton jButtonActualizarToolBarComisionMarca;
    protected JButton jButtonEliminarToolBarComisionMarca;
	protected JButton jButtonCancelarToolBarComisionMarca;
    protected JButton jButtonGuardarCambiosToolBarComisionMarca;
	protected JButton jButtonGuardarCambiosTablaToolBarComisionMarca;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionMarca;
	protected JButton jButtonCerrarToolBarComisionMarca;
	
	protected JButton jButtonProcesarInformacionToolBarComisionMarca;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionMarca;
	protected JMenuItem jMenuItemModificarComisionMarca;
	protected JMenuItem jMenuItemActualizarComisionMarca;
    protected JMenuItem jMenuItemEliminarComisionMarca;
	protected JMenuItem jMenuItemCancelarComisionMarca;
    protected JMenuItem jMenuItemGuardarCambiosComisionMarca;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionMarca;
	protected JMenuItem jMenuItemCerrarComisionMarca;
	protected JMenuItem jMenuItemDetalleCerrarComisionMarca;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionMarca;
	
	protected JMenuItem jMenuItemProcesarInformacionComisionMarca;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionMarca;
	protected JMenuItem jMenuItemMostrarOcultarComisionMarca;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionMarca;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionMarca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionMarca;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComisionMarca;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComisionMarca;
	public JLabel jLabelIdComisionMarca;
	public JLabel jLabelidComisionMarca;
	public JButton jButtonidComisionMarcaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeComisionMarca;
	public JLabel jLabelporcentajeComisionMarca;
	public JTextField jTextFieldporcentajeComisionMarca;
	public JButton jButtonporcentajeComisionMarcaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionComisionMarca;
	public JLabel jLabeldescripcionComisionMarca;
	public JTextArea jTextAreadescripcionComisionMarca;
	public JScrollPane jscrollPanedescripcionComisionMarca;
	public JButton jButtondescripcionComisionMarcaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComisionMarca;
	public JLabel jLabelid_empresaComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComisionMarca;
	public JButton jButtonid_empresaComisionMarca= new JButtonMe();
	public JButton jButtonid_empresaComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_empresaComisionMarcaBusqueda= new JButtonMe();

	public JPanel jPanelid_comision_configComisionMarca;
	public JLabel jLabelid_comision_configComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configComisionMarca;
	public JButton jButtonid_comision_configComisionMarca= new JButtonMe();
	public JButton jButtonid_comision_configComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_comision_configComisionMarcaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorComisionMarca;
	public JLabel jLabelid_vendedorComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorComisionMarca;
	public JButton jButtonid_vendedorComisionMarca= new JButtonMe();
	public JButton jButtonid_vendedorComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorComisionMarcaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorComisionMarcaArbol= new JButtonMe();

	public JPanel jPanelid_lineaComisionMarca;
	public JLabel jLabelid_lineaComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaComisionMarca;
	public JButton jButtonid_lineaComisionMarca= new JButtonMe();
	public JButton jButtonid_lineaComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_lineaComisionMarcaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaComisionMarcaArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoComisionMarca;
	public JLabel jLabelid_linea_grupoComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoComisionMarca;
	public JButton jButtonid_linea_grupoComisionMarca= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionMarcaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionMarcaArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaComisionMarca;
	public JLabel jLabelid_linea_categoriaComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaComisionMarca;
	public JButton jButtonid_linea_categoriaComisionMarca= new JButtonMe();
	public JButton jButtonid_linea_categoriaComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaComisionMarcaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaComisionMarcaArbol= new JButtonMe();

	public JPanel jPanelid_linea_marcaComisionMarca;
	public JLabel jLabelid_linea_marcaComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaComisionMarca;
	public JButton jButtonid_linea_marcaComisionMarca= new JButtonMe();
	public JButton jButtonid_linea_marcaComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaComisionMarcaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaComisionMarcaArbol= new JButtonMe();

	public JPanel jPanelid_estado_comisionComisionMarca;
	public JLabel jLabelid_estado_comisionComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_comisionComisionMarca;
	public JButton jButtonid_estado_comisionComisionMarca= new JButtonMe();
	public JButton jButtonid_estado_comisionComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_estado_comisionComisionMarcaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComisionMarca;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComisionMarcaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComisionMarca=new JPanel();
				this.jPanelAccionesFormularioComisionMarca=new JPanel();
				this.jmenuBarDetalleComisionMarca=new JMenuBar();
				this.jTtoolBarDetalleComisionMarca=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionMarcaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComisionMarcaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionMarcaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionMarcaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionMarcaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComisionMarca() {
		return this.jButtonActualizarToolBarComisionMarca;
	}
	
	public JButton getjButtonEliminarToolBarComisionMarca() {
		return this.jButtonEliminarToolBarComisionMarca;
	}
	
	public JButton getjButtonCancelarToolBarComisionMarca() {
		return this.jButtonCancelarToolBarComisionMarca;
	}		
	
	public JButton getjButtonProcesarInformacionComisionMarca() {
		return this.jButtonProcesarInformacionComisionMarca;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionMarca)	{
		this.jButtonProcesarInformacionComisionMarca = jButtonProcesarInformacionComisionMarca;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionMarca() {
		return this.jComboBoxTiposAccionesComisionMarca;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionMarca(
			JComboBox jComboBoxTiposRelacionesComisionMarca) {
		this.jComboBoxTiposRelacionesComisionMarca = jComboBoxTiposRelacionesComisionMarca;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionMarca(
			JComboBox jComboBoxTiposAccionesComisionMarca) {
		this.jComboBoxTiposAccionesComisionMarca = jComboBoxTiposAccionesComisionMarca;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComisionMarca() {
		return this.jComboBoxTiposAccionesFormularioComisionMarca;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComisionMarca(
			JComboBox jComboBoxTiposAccionesFormularioComisionMarca) {
		this.jComboBoxTiposAccionesFormularioComisionMarca = jComboBoxTiposAccionesFormularioComisionMarca;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		
		this.comisionmarcaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionmarcaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionmarcaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionMarcaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Marca MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
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
	
		ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComisionMarca= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComisionMarca=new JButtonMe();
				this.jButtonModificarToolBarComisionMarca=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComisionMarca,this.jTtoolBarDetalleComisionMarca,
							"actualizar","actualizar","Actualizar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComisionMarca,this.jTtoolBarDetalleComisionMarca,
							"eliminar","eliminar","Eliminar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComisionMarca,this.jTtoolBarDetalleComisionMarca,
							"cancelar","cancelar","Cancelar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComisionMarca,this.jTtoolBarDetalleComisionMarca,
							"guardarcambios","guardarcambios","Guardar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComisionMarca=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComisionMarca=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComisionMarca=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComisionMarca=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComisionMarca=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionMarca= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionMarca.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionMarca,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComisionMarca= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComisionMarca.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComisionMarca,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComisionMarca= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComisionMarca.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComisionMarca,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComisionMarca= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComisionMarca.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComisionMarca,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComisionMarca= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComisionMarca.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComisionMarca,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComisionMarca= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionMarca.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionMarca,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionMarca= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionMarca.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionMarca,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComisionMarca= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComisionMarca.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComisionMarca,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionMarca= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionMarca.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionMarca,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionMarca= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionMarca.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionMarca,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComisionMarca.add(this.jMenuItemDetalleCerrarComisionMarca);
		
		this.jmenuDetalleAccionesComisionMarca.add(this.jMenuItemActualizarComisionMarca);
		this.jmenuDetalleAccionesComisionMarca.add(this.jMenuItemEliminarComisionMarca);
		this.jmenuDetalleAccionesComisionMarca.add(this.jMenuItemCancelarComisionMarca);		
		
		//this.jmenuDetalleDatosComisionMarca.add(this.jMenuItemDetalleAbrirOrderByComisionMarca);				
		this.jmenuDetalleDatosComisionMarca.add(this.jMenuItemDetalleMostarOcultarComisionMarca);				
				
		//this.jmenuDetalleAccionesComisionMarca.add(this.jMenuItemGuardarCambiosComisionMarca);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComisionMarca.add(this.jmenuDetalleArchivoComisionMarca);		
		this.jmenuBarDetalleComisionMarca.add(this.jmenuDetalleAccionesComisionMarca);		
		this.jmenuBarDetalleComisionMarca.add(this.jmenuDetalleDatosComisionMarca);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComisionMarca);				
	}
	
	
	public void inicializarElementosCamposComisionMarca() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComisionMarca = new JLabelMe();
		jLabelIdComisionMarca.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComisionMarca = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComisionMarca= new GridBagLayout();

		this.jPanelidComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);

		jLabelidComisionMarca = new JLabel();
		jLabelidComisionMarca.setText("Id");

		jLabelidComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeComisionMarca = new JLabelMe();
		this.jLabelporcentajeComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeComisionMarca.setToolTipText("Porcentaje");
		this.jLabelporcentajeComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelporcentajeComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jTextFieldporcentajeComisionMarca= new JTextFieldMe();
		jTextFieldporcentajeComisionMarca.setEnabled(false);
		jTextFieldporcentajeComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeComisionMarca.setText("0.0");

		this.jButtonporcentajeComisionMarcaBusqueda= new JButtonMe();
		this.jButtonporcentajeComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeComisionMarcaBusqueda.setText("U");
		this.jButtonporcentajeComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeComisionMarcaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionComisionMarca = new JLabelMe();
		this.jLabeldescripcionComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionComisionMarca.setToolTipText("Descripcion");
		this.jLabeldescripcionComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPaneldescripcionComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jTextAreadescripcionComisionMarca= new JTextAreaMe();
		jTextAreadescripcionComisionMarca.setEnabled(false);
		jTextAreadescripcionComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionMarca.setLineWrap(true);
		jTextAreadescripcionComisionMarca.setWrapStyleWord(true);
		jTextAreadescripcionComisionMarca.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionComisionMarca.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionComisionMarca = new JScrollPane(jTextAreadescripcionComisionMarca);
		jscrollPanedescripcionComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionComisionMarcaBusqueda= new JButtonMe();
		this.jButtondescripcionComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionComisionMarcaBusqueda.setText("U");
		this.jButtondescripcionComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionComisionMarcaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComisionMarca() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComisionMarca = new JLabelMe();
		this.jLabelid_empresaComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComisionMarca.setToolTipText("Empresa");
		this.jLabelid_empresaComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelid_empresaComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jComboBoxid_empresaComisionMarca= new JComboBoxMe();
		jComboBoxid_empresaComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComisionMarca.setEnabled(false);

		this.jButtonid_empresaComisionMarca= new JButtonMe();
		this.jButtonid_empresaComisionMarca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionMarca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionMarca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionMarca.setText("Buscar");
		this.jButtonid_empresaComisionMarca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComisionMarca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionMarca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionMarca"));

		this.jButtonid_empresaComisionMarcaBusqueda= new JButtonMe();
		this.jButtonid_empresaComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionMarcaBusqueda.setText("U");
		this.jButtonid_empresaComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComisionMarcaBusqueda.setVisible(false);		}

		this.jButtonid_empresaComisionMarcaUpdate= new JButtonMe();
		this.jButtonid_empresaComisionMarcaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionMarcaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionMarcaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionMarcaUpdate.setText("U");
		this.jButtonid_empresaComisionMarcaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComisionMarcaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionMarcaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionMarcaUpdate"));



					
		this.jLabelid_comision_configComisionMarca = new JLabelMe();
		this.jLabelid_comision_configComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG+" : *");
		this.jLabelid_comision_configComisionMarca.setToolTipText("Configuracion");
		this.jLabelid_comision_configComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_comision_configComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_comision_configComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelid_comision_configComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jComboBoxid_comision_configComisionMarca= new JComboBoxMe();
		jComboBoxid_comision_configComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_comision_configComisionMarca= new JButtonMe();
		this.jButtonid_comision_configComisionMarca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionMarca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionMarca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionMarca.setText("Buscar");
		this.jButtonid_comision_configComisionMarca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_comision_configComisionMarca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionMarca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_comision_configComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionMarca"));

		this.jButtonid_comision_configComisionMarcaBusqueda= new JButtonMe();
		this.jButtonid_comision_configComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionMarcaBusqueda.setText("U");
		this.jButtonid_comision_configComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_comision_configComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_comision_configComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_comision_configComisionMarcaBusqueda.setVisible(false);		}

		this.jButtonid_comision_configComisionMarcaUpdate= new JButtonMe();
		this.jButtonid_comision_configComisionMarcaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionMarcaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionMarcaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionMarcaUpdate.setText("U");
		this.jButtonid_comision_configComisionMarcaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_comision_configComisionMarcaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionMarcaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_comision_configComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionMarcaUpdate"));



					
		this.jLabelid_vendedorComisionMarca = new JLabelMe();
		this.jLabelid_vendedorComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorComisionMarca.setToolTipText("Vendedor");
		this.jLabelid_vendedorComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelid_vendedorComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jComboBoxid_vendedorComisionMarca= new JComboBoxMe();
		jComboBoxid_vendedorComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorComisionMarca= new JButtonMe();
		this.jButtonid_vendedorComisionMarca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionMarca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionMarca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionMarca.setText("Buscar");
		this.jButtonid_vendedorComisionMarca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorComisionMarca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionMarca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionMarca"));

		this.jButtonid_vendedorComisionMarcaBusqueda= new JButtonMe();
		this.jButtonid_vendedorComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionMarcaBusqueda.setText("U");
		this.jButtonid_vendedorComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorComisionMarcaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorComisionMarcaUpdate= new JButtonMe();
		this.jButtonid_vendedorComisionMarcaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionMarcaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionMarcaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionMarcaUpdate.setText("U");
		this.jButtonid_vendedorComisionMarcaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorComisionMarcaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionMarcaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionMarcaUpdate"));


		jButtonid_vendedorComisionMarcaArbol= new JButtonMe();
		jButtonid_vendedorComisionMarcaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionMarcaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionMarcaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionMarcaArbol.setText("Arbol");
		jButtonid_vendedorComisionMarcaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorComisionMarcaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionMarcaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionMarcaArbol"));



					
		this.jLabelid_lineaComisionMarca = new JLabelMe();
		this.jLabelid_lineaComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaComisionMarca.setToolTipText("Linea");
		this.jLabelid_lineaComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelid_lineaComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jComboBoxid_lineaComisionMarca= new JComboBoxMe();
		jComboBoxid_lineaComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaComisionMarca= new JButtonMe();
		this.jButtonid_lineaComisionMarca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionMarca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionMarca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionMarca.setText("Buscar");
		this.jButtonid_lineaComisionMarca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaComisionMarca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionMarca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionMarca"));

		this.jButtonid_lineaComisionMarcaBusqueda= new JButtonMe();
		this.jButtonid_lineaComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaComisionMarcaBusqueda.setText("U");
		this.jButtonid_lineaComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaComisionMarcaBusqueda.setVisible(false);		}

		this.jButtonid_lineaComisionMarcaUpdate= new JButtonMe();
		this.jButtonid_lineaComisionMarcaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionMarcaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionMarcaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaComisionMarcaUpdate.setText("U");
		this.jButtonid_lineaComisionMarcaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaComisionMarcaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionMarcaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionMarcaUpdate"));


		jButtonid_lineaComisionMarcaArbol= new JButtonMe();
		jButtonid_lineaComisionMarcaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionMarcaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionMarcaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionMarcaArbol.setText("Arbol");
		jButtonid_lineaComisionMarcaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaComisionMarcaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionMarcaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionMarcaArbol"));



					
		this.jLabelid_linea_grupoComisionMarca = new JLabelMe();
		this.jLabelid_linea_grupoComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoComisionMarca.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelid_linea_grupoComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jComboBoxid_linea_grupoComisionMarca= new JComboBoxMe();
		jComboBoxid_linea_grupoComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoComisionMarca= new JButtonMe();
		this.jButtonid_linea_grupoComisionMarca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionMarca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionMarca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionMarca.setText("Buscar");
		this.jButtonid_linea_grupoComisionMarca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoComisionMarca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionMarca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionMarca"));

		this.jButtonid_linea_grupoComisionMarcaBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoComisionMarcaBusqueda.setText("U");
		this.jButtonid_linea_grupoComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoComisionMarcaBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoComisionMarcaUpdate= new JButtonMe();
		this.jButtonid_linea_grupoComisionMarcaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionMarcaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionMarcaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoComisionMarcaUpdate.setText("U");
		this.jButtonid_linea_grupoComisionMarcaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoComisionMarcaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionMarcaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionMarcaUpdate"));


		jButtonid_linea_grupoComisionMarcaArbol= new JButtonMe();
		jButtonid_linea_grupoComisionMarcaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionMarcaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionMarcaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionMarcaArbol.setText("Arbol");
		jButtonid_linea_grupoComisionMarcaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoComisionMarcaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionMarcaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionMarcaArbol"));



					
		this.jLabelid_linea_categoriaComisionMarca = new JLabelMe();
		this.jLabelid_linea_categoriaComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaComisionMarca.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelid_linea_categoriaComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jComboBoxid_linea_categoriaComisionMarca= new JComboBoxMe();
		jComboBoxid_linea_categoriaComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaComisionMarca= new JButtonMe();
		this.jButtonid_linea_categoriaComisionMarca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaComisionMarca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaComisionMarca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaComisionMarca.setText("Buscar");
		this.jButtonid_linea_categoriaComisionMarca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaComisionMarca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaComisionMarca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaComisionMarca"));

		this.jButtonid_linea_categoriaComisionMarcaBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaComisionMarcaBusqueda.setText("U");
		this.jButtonid_linea_categoriaComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaComisionMarcaBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaComisionMarcaUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaComisionMarcaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaComisionMarcaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaComisionMarcaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaComisionMarcaUpdate.setText("U");
		this.jButtonid_linea_categoriaComisionMarcaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaComisionMarcaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaComisionMarcaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaComisionMarcaUpdate"));


		jButtonid_linea_categoriaComisionMarcaArbol= new JButtonMe();
		jButtonid_linea_categoriaComisionMarcaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaComisionMarcaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaComisionMarcaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaComisionMarcaArbol.setText("Arbol");
		jButtonid_linea_categoriaComisionMarcaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaComisionMarcaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaComisionMarcaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaComisionMarcaArbol"));



					
		this.jLabelid_linea_marcaComisionMarca = new JLabelMe();
		this.jLabelid_linea_marcaComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaComisionMarca.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelid_linea_marcaComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jComboBoxid_linea_marcaComisionMarca= new JComboBoxMe();
		jComboBoxid_linea_marcaComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaComisionMarca= new JButtonMe();
		this.jButtonid_linea_marcaComisionMarca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaComisionMarca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaComisionMarca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaComisionMarca.setText("Buscar");
		this.jButtonid_linea_marcaComisionMarca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaComisionMarca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaComisionMarca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaComisionMarca"));

		this.jButtonid_linea_marcaComisionMarcaBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaComisionMarcaBusqueda.setText("U");
		this.jButtonid_linea_marcaComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaComisionMarcaBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaComisionMarcaUpdate= new JButtonMe();
		this.jButtonid_linea_marcaComisionMarcaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaComisionMarcaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaComisionMarcaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaComisionMarcaUpdate.setText("U");
		this.jButtonid_linea_marcaComisionMarcaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaComisionMarcaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaComisionMarcaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaComisionMarcaUpdate"));


		jButtonid_linea_marcaComisionMarcaArbol= new JButtonMe();
		jButtonid_linea_marcaComisionMarcaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaComisionMarcaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaComisionMarcaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaComisionMarcaArbol.setText("Arbol");
		jButtonid_linea_marcaComisionMarcaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_marcaComisionMarcaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaComisionMarcaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_marcaComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaComisionMarcaArbol"));



					
		this.jLabelid_estado_comisionComisionMarca = new JLabelMe();
		this.jLabelid_estado_comisionComisionMarca.setText(""+ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION+" : *");
		this.jLabelid_estado_comisionComisionMarca.setToolTipText("Estado");
		this.jLabelid_estado_comisionComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_comisionComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_comisionComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_comisionComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_comisionComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_comisionComisionMarca.setToolTipText(ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION);
		this.gridaBagLayoutComisionMarca = new GridBagLayout();
		this.jPanelid_estado_comisionComisionMarca.setLayout(this.gridaBagLayoutComisionMarca);


		jComboBoxid_estado_comisionComisionMarca= new JComboBoxMe();
		jComboBoxid_estado_comisionComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_comisionComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_comisionComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_comisionComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_comisionComisionMarca= new JButtonMe();
		this.jButtonid_estado_comisionComisionMarca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionMarca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionMarca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionMarca.setText("Buscar");
		this.jButtonid_estado_comisionComisionMarca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_comisionComisionMarca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionMarca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_comisionComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionMarca"));

		this.jButtonid_estado_comisionComisionMarcaBusqueda= new JButtonMe();
		this.jButtonid_estado_comisionComisionMarcaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionMarcaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionMarcaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_comisionComisionMarcaBusqueda.setText("U");
		this.jButtonid_estado_comisionComisionMarcaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_comisionComisionMarcaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionMarcaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_comisionComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionMarcaBusqueda"));

		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_comisionComisionMarcaBusqueda.setVisible(false);		}

		this.jButtonid_estado_comisionComisionMarcaUpdate= new JButtonMe();
		this.jButtonid_estado_comisionComisionMarcaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionMarcaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionMarcaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_comisionComisionMarcaUpdate.setText("U");
		this.jButtonid_estado_comisionComisionMarcaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_comisionComisionMarcaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionMarcaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_comisionComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionMarcaUpdate"));



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
		//this.jInternalFrameDetalleComisionMarca = new ComisionMarcaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comision Marca DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionMarca= new GridBagLayout();
		

		
		String sToolTipComisionMarca="";
		sToolTipComisionMarca=ComisionMarcaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionMarca+="(Comisiones.ComisionMarca)";
		}
		
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionMarca+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComisionMarca = new JButtonMe();
		this.jButtonModificarComisionMarca = new JButtonMe();
        this.jButtonActualizarComisionMarca = new JButtonMe();
        this.jButtonEliminarComisionMarca = new JButtonMe();
        this.jButtonCancelarComisionMarca = new JButtonMe();
        this.jButtonGuardarCambiosComisionMarca = new JButtonMe();
		this.jButtonGuardarCambiosTablaComisionMarca = new JButtonMe();
		this.jButtonCerrarComisionMarca = new JButtonMe();
		
		this.jScrollPanelDatosComisionMarca = new JScrollPane();   
        this.jScrollPanelDatosEdicionComisionMarca = new JScrollPane();
		this.jScrollPanelDatosGeneralComisionMarca = new JScrollPane();
				
		
		
		this.jPanelCamposComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Marca";
		
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Marcas" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionMarca.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComisionMarca.setName("jPanelCamposComisionMarca"); 

		this.jPanelCamposOcultosComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComisionMarca.setName("jPanelCamposOcultosComisionMarca"); 

        this.jPanelAccionesComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionMarca.setToolTipText("Acciones");
        this.jPanelAccionesComisionMarca.setName("Acciones"); 

		this.jPanelAccionesFormularioComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComisionMarca.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComisionMarca.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComisionMarca.setText("Nuevo");
		this.jButtonModificarComisionMarca.setText("Editar");
        this.jButtonActualizarComisionMarca.setText("Actualizar");
        this.jButtonEliminarComisionMarca.setText("Eliminar");
        this.jButtonCancelarComisionMarca.setText("Cancelar");
        this.jButtonGuardarCambiosComisionMarca.setText("Guardar");
		this.jButtonGuardarCambiosTablaComisionMarca.setText("Guardar");
		this.jButtonCerrarComisionMarca.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionMarca,"nuevo_button","Nuevo",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComisionMarca,"modificar_button","Editar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComisionMarca,"actualizar_button","Actualizar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComisionMarca,"eliminar_button","Eliminar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComisionMarca,"cancelar_button","Cancelar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComisionMarca,"guardarcambios_button","Guardar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionMarca,"guardarcambiostabla_button","Guardar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionMarca,"cerrar_button","Salir",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComisionMarca.setToolTipText("Nuevo"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComisionMarca.setToolTipText("Editar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComisionMarca.setToolTipText("Actualizar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComisionMarca.setToolTipText("Eliminar)"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComisionMarca.setToolTipText("Cancelar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComisionMarca.setToolTipText("Guardar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComisionMarca.setToolTipText("Guardar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionMarca.setToolTipText("Salir"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionMarca";
		inputMap = this.jButtonNuevoComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionMarca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionMarca"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComisionMarca";
		inputMap = this.jButtonActualizarComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComisionMarca"));
		
		//ELIMINAR
		sMapKey = "EliminarComisionMarca";
		inputMap = this.jButtonEliminarComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComisionMarca"));
		
		//CANCELAR	
		sMapKey = "CancelarComisionMarca";
		inputMap = this.jButtonCancelarComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComisionMarca"));
		
		//CERRAR		
		sMapKey = "CerrarComisionMarca";
		inputMap = this.jButtonCerrarComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionMarca"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionMarca";
		inputMap = this.jButtonGuardarCambiosTablaComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionMarca"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComisionMarca = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComisionMarca.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComisionMarca.setToolTipText("Nuevo ComisionMarca");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComisionMarca = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComisionMarca.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComisionMarca.setToolTipText("Sin Cerrar Ventana ComisionMarca");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComisionMarca = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComisionMarca.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComisionMarca.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionMarca.setText("Accion");
		this.jComboBoxTiposAccionesComisionMarca.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComisionMarca.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComisionMarca.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComisionMarca = new JLabelMe();
		
		this.jLabelAccionesComisionMarca.setText("Acciones");		
		this.jLabelAccionesComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComisionMarca();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComisionMarca();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComisionMarca=new JTabbedPane();
		this.jTabbedPaneRelacionesComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComisionMarca,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComisionMarca.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionMarca.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionMarca.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComisionMarca.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionMarca.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionMarca.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComisionMarca = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComisionMarca = new GridBagLayout();
		
		this.jPanelCamposComisionMarca.setLayout(gridaBagLayoutCamposComisionMarca);
		this.jPanelCamposOcultosComisionMarca.setLayout(gridaBagLayoutCamposOcultosComisionMarca);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComisionMarca.add(jLabelIdComisionMarca, this.gridBagConstraintsComisionMarca);



	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComisionMarca.add(jLabelidComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComisionMarca.add(jLabelid_empresaComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionMarca.add(jButtonid_empresaComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 3;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionMarca.add(jButtonid_empresaComisionMarcaUpdate, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComisionMarca.add(jComboBoxid_empresaComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_comision_configComisionMarca.add(jLabelid_comision_configComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionMarca.add(jButtonid_comision_configComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 3;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionMarca.add(jButtonid_comision_configComisionMarcaUpdate, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_comision_configComisionMarca.add(jComboBoxid_comision_configComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorComisionMarca.add(jLabelid_vendedorComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 2;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorComisionMarca.add(jButtonid_vendedorComisionMarca, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 3;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorComisionMarca.add(jButtonid_vendedorComisionMarcaArbol, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 4;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionMarca.add(jButtonid_vendedorComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 5;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionMarca.add(jButtonid_vendedorComisionMarcaUpdate, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorComisionMarca.add(jComboBoxid_vendedorComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaComisionMarca.add(jLabelid_lineaComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaComisionMarca.add(jButtonid_lineaComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 3;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaComisionMarca.add(jButtonid_lineaComisionMarcaUpdate, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaComisionMarca.add(jComboBoxid_lineaComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoComisionMarca.add(jLabelid_linea_grupoComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoComisionMarca.add(jButtonid_linea_grupoComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 3;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoComisionMarca.add(jButtonid_linea_grupoComisionMarcaUpdate, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoComisionMarca.add(jComboBoxid_linea_grupoComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaComisionMarca.add(jLabelid_linea_categoriaComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaComisionMarca.add(jButtonid_linea_categoriaComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 3;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaComisionMarca.add(jButtonid_linea_categoriaComisionMarcaUpdate, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaComisionMarca.add(jComboBoxid_linea_categoriaComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaComisionMarca.add(jLabelid_linea_marcaComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaComisionMarca.add(jButtonid_linea_marcaComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 3;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaComisionMarca.add(jButtonid_linea_marcaComisionMarcaUpdate, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaComisionMarca.add(jComboBoxid_linea_marcaComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_comisionComisionMarca.add(jLabelid_estado_comisionComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_comisionComisionMarca.add(jButtonid_estado_comisionComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 3;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_comisionComisionMarca.add(jButtonid_estado_comisionComisionMarcaUpdate, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_comisionComisionMarca.add(jComboBoxid_estado_comisionComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeComisionMarca.add(jLabelporcentajeComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeComisionMarca.add(jButtonporcentajeComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeComisionMarca.add(jTextFieldporcentajeComisionMarca, this.gridBagConstraintsComisionMarca);


	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 0;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionComisionMarca.add(jLabeldescripcionComisionMarca, this.gridBagConstraintsComisionMarca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 2;
		this.gridBagConstraintsComisionMarca.ipadx = 0;
		this.gridBagConstraintsComisionMarca.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionComisionMarca.add(jButtondescripcionComisionMarcaBusqueda, this.gridBagConstraintsComisionMarca);
	}

	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionMarca.gridy = 0;
	this.gridBagConstraintsComisionMarca.gridx = 1;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionComisionMarca.add(jscrollPanedescripcionComisionMarca, this.gridBagConstraintsComisionMarca);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelidComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelid_comision_configComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelid_vendedorComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelid_lineaComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelid_linea_grupoComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelid_linea_categoriaComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelid_linea_marcaComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelid_estado_comisionComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPanelporcentajeComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionMarca.add(this.jPaneldescripcionComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposComisionMarca % 1==0) {
		iXPanelCamposComisionMarca=0;
		iYPanelCamposComisionMarca++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionMarca.gridy = iYPanelCamposOcultosComisionMarca;
	this.gridBagConstraintsComisionMarca.gridx = iXPanelCamposOcultosComisionMarca++;
	this.gridBagConstraintsComisionMarca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionMarca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComisionMarca.add(this.jPanelid_empresaComisionMarca, this.gridBagConstraintsComisionMarca);



	if(iXPanelCamposOcultosComisionMarca % 1==0) {
		iXPanelCamposOcultosComisionMarca=0;
		iYPanelCamposOcultosComisionMarca++;
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
			
		GridBagLayout gridaBagLayoutAccionesComisionMarca= new GridBagLayout();
		this.jPanelAccionesComisionMarca.setLayout(gridaBagLayoutAccionesComisionMarca);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComisionMarca= new GridBagLayout();
		this.jPanelAccionesFormularioComisionMarca.setLayout(gridaBagLayoutAccionesFormularioComisionMarca);
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionMarca.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionMarca.add(this.jComboBoxTiposAccionesFormularioComisionMarca, this.gridBagConstraintsComisionMarca);

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionMarca.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionMarca.add(this.jCheckBoxPostAccionNuevoComisionMarca, this.gridBagConstraintsComisionMarca);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionMarca.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionMarca.add(this.jCheckBoxPostAccionSinCerrarComisionMarca, this.gridBagConstraintsComisionMarca);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionMarca.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionMarca.add(this.jCheckBoxPostAccionSinMensajeComisionMarca, this.gridBagConstraintsComisionMarca);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = iPosXAccion++;
			
		this.jPanelAccionesComisionMarca.add(this.jButtonModificarComisionMarca, this.gridBagConstraintsComisionMarca);							

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx =iPosXAccion++;
			
		this.jPanelAccionesComisionMarca.add(this.jButtonEliminarComisionMarca, this.gridBagConstraintsComisionMarca);
		
			
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = 0;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionMarca.add(this.jButtonActualizarComisionMarca, this.gridBagConstraintsComisionMarca);


		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = 0;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionMarca.add(this.jButtonGuardarCambiosComisionMarca, this.gridBagConstraintsComisionMarca);	
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = 0;		
		this.gridBagConstraintsComisionMarca.gridx =iPosXAccion++;
		
		this.jPanelAccionesComisionMarca.add(this.jButtonCancelarComisionMarca, this.gridBagConstraintsComisionMarca);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionMarca = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionMarca);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();						
			this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionMarca.gridx = 0;		
			//this.gridBagConstraintsComisionMarca.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionMarca.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionMarca.gridx =0;
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionMarca.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionMarca, this.gridBagConstraintsComisionMarca);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComisionMarca = new ComisionMarcaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comision Marca DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comision Marca DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Marca Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComisionMarcaModel comisionmarcaModel=new ComisionMarcaModel(this);
			
			//SI USARA CLASE INTERNA
			//ComisionMarcaModel.ComisionMarcaFocusTraversalPolicy comisionmarcaFocusTraversalPolicy = comisionmarcaModel.new ComisionMarcaFocusTraversalPolicy(this);
			
			//comisionmarcaFocusTraversalPolicy.setcomisionmarcaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comisionmarcaModel);
			
			
			this.jContentPaneDetalleComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComisionMarca = new GridBagLayout();	
			this.jContentPaneDetalleComisionMarca.setLayout(gridaBagLayoutDetalleComisionMarca);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionMarca = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComisionMarca = new GridBagConstraints();
				this.gridBagConstraintsComisionMarca.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComisionMarca.gridx = 0;
					
				
				this.jContentPaneDetalleComisionMarca.add(jTtoolBarDetalleComisionMarca, gridBagConstraintsComisionMarca);								
				
}
			
			this.jScrollPanelDatosEdicionComisionMarca=   new JScrollPane(jContentPaneDetalleComisionMarca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionMarca.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionMarca.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionMarca.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComisionMarca=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionMarca.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionMarca.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionMarca.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComisionMarca.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComisionMarca.gridx = 0;
	        
			this.jContentPaneDetalleComisionMarca.add(jPanelCamposComisionMarca, gridBagConstraintsComisionMarca);
			
			
			
			
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
						&& comisionmarcaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComisionMarca= new GridBagConstraints();
						this.gridBagConstraintsComisionMarca.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComisionMarca.gridx = 0;
						this.jContentPaneDetalleComisionMarca.add(this.jTabbedPaneRelacionesComisionMarca, this.gridBagConstraintsComisionMarca);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComisionMarca.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComisionMarca.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComisionMarca = new GridBagConstraints();
					this.gridBagConstraintsComisionMarca.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComisionMarca.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComisionMarca.gridx = 0;
					
				
					this.jContentPaneDetalleComisionMarca.add(jPanelCamposOcultosComisionMarca, gridBagConstraintsComisionMarca);
				
					this.jPanelCamposOcultosComisionMarca.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComisionMarca.gridx = 0;
	        this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComisionMarca.add(this.jPanelAccionesFormularioComisionMarca, this.gridBagConstraintsComisionMarca);							
			
			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
	        this.gridBagConstraintsComisionMarca.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComisionMarca.gridx = 0;
	        
			
			this.jContentPaneDetalleComisionMarca.add(this.jPanelAccionesComisionMarca, this.gridBagConstraintsComisionMarca);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComisionMarca);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComisionMarca=   new JScrollPane(this.jPanelCamposComisionMarca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionMarca.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionMarca.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionMarca.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComisionMarca.gridx = 0;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComisionMarca.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComisionMarca, this.gridBagConstraintsComisionMarca);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionMarca.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComisionMarca, this.gridBagConstraintsComisionMarca);			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionMarca.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComisionMarca, this.gridBagConstraintsComisionMarca);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionMarca, this.gridBagConstraintsComisionMarca);
			
			
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionMarca, this.gridBagConstraintsComisionMarca);
		
			
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionMarca, this.gridBagConstraintsComisionMarca);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComisionMarca;//jContentPane;
		
		return jScrollPanelDatosEdicionComisionMarca;
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
