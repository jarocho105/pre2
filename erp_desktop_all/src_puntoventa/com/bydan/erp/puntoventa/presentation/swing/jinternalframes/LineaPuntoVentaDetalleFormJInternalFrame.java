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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.LineaPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class LineaPuntoVentaDetalleFormJInternalFrame extends LineaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleLineaPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleLineaPuntoVenta;
	
	protected JMenu jmenuDetalleLineaPuntoVenta;
	protected JMenu jmenuDetalleArchivoLineaPuntoVenta;
	protected JMenu jmenuDetalleAccionesLineaPuntoVenta;
	protected JMenu jmenuDetalleDatosLineaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLineaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsLineaPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected LineaPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleLineaPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public LineaPuntoVentaSessionBean lineapuntoventaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public LineaPuntoVentaLogic lineapuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosLineaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionLineaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralLineaPuntoVenta;
	
	protected JPanel jPanelCamposLineaPuntoVenta;    
	protected JPanel jPanelCamposOcultosLineaPuntoVenta;    	
	protected JPanel jPanelAccionesLineaPuntoVenta;
	protected JPanel jPanelAccionesFormularioLineaPuntoVenta;
    
	
	
	protected Integer iXPanelCamposLineaPuntoVenta=0;
	protected Integer iYPanelCamposLineaPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosLineaPuntoVenta=0;
	protected Integer iYPanelCamposOcultosLineaPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoLineaPuntoVenta;
	public JButton jButtonModificarLineaPuntoVenta;
	public JButton jButtonActualizarLineaPuntoVenta;
    public JButton jButtonEliminarLineaPuntoVenta;
	public JButton jButtonCancelarLineaPuntoVenta;
    public JButton jButtonGuardarCambiosLineaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaLineaPuntoVenta;
	protected JButton jButtonCerrarLineaPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionLineaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoLineaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarLineaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeLineaPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLineaPuntoVenta;
	protected JButton jButtonModificarToolBarLineaPuntoVenta;
	protected JButton jButtonActualizarToolBarLineaPuntoVenta;
    protected JButton jButtonEliminarToolBarLineaPuntoVenta;
	protected JButton jButtonCancelarToolBarLineaPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarLineaPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarLineaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarLineaPuntoVenta;
	protected JButton jButtonCerrarToolBarLineaPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarLineaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLineaPuntoVenta;
	protected JMenuItem jMenuItemModificarLineaPuntoVenta;
	protected JMenuItem jMenuItemActualizarLineaPuntoVenta;
    protected JMenuItem jMenuItemEliminarLineaPuntoVenta;
	protected JMenuItem jMenuItemCancelarLineaPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosLineaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaLineaPuntoVenta;
	protected JMenuItem jMenuItemCerrarLineaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarLineaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarLineaPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionLineaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLineaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarLineaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLineaPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLineaPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioLineaPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidLineaPuntoVenta;
	public JLabel jLabelIdLineaPuntoVenta;
	public JLabel jLabelidLineaPuntoVenta;
	public JButton jButtonidLineaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoLineaPuntoVenta;
	public JLabel jLabelesta_activoLineaPuntoVenta;
	public JCheckBox jCheckBoxesta_activoLineaPuntoVenta;
	public JButton jButtonesta_activoLineaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaLineaPuntoVenta;
	public JLabel jLabelid_empresaLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaLineaPuntoVenta;
	public JButton jButtonid_empresaLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaLineaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalLineaPuntoVenta;
	public JLabel jLabelid_sucursalLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalLineaPuntoVenta;
	public JButton jButtonid_sucursalLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalLineaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaLineaPuntoVenta;
	public JLabel jLabelid_lineaLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaLineaPuntoVenta;
	public JButton jButtonid_lineaLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_lineaLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_lineaLineaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaLineaPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoLineaPuntoVenta;
	public JLabel jLabelid_linea_grupoLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoLineaPuntoVenta;
	public JButton jButtonid_linea_grupoLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_grupoLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoLineaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoLineaPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaLineaPuntoVenta;
	public JLabel jLabelid_linea_categoriaLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaLineaPuntoVenta;
	public JButton jButtonid_linea_categoriaLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_categoriaLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaLineaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaLineaPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_linea_marcaLineaPuntoVenta;
	public JLabel jLabelid_linea_marcaLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaLineaPuntoVenta;
	public JButton jButtonid_linea_marcaLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_marcaLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaLineaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaLineaPuntoVentaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesLineaPuntoVenta;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public LineaPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposLineaPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioLineaPuntoVenta=new JPanel();
				this.jmenuBarDetalleLineaPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleLineaPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public LineaPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarLineaPuntoVenta() {
		return this.jButtonActualizarToolBarLineaPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarLineaPuntoVenta() {
		return this.jButtonEliminarToolBarLineaPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarLineaPuntoVenta() {
		return this.jButtonCancelarToolBarLineaPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionLineaPuntoVenta() {
		return this.jButtonProcesarInformacionLineaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLineaPuntoVenta)	{
		this.jButtonProcesarInformacionLineaPuntoVenta = jButtonProcesarInformacionLineaPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLineaPuntoVenta() {
		return this.jComboBoxTiposAccionesLineaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLineaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesLineaPuntoVenta) {
		this.jComboBoxTiposRelacionesLineaPuntoVenta = jComboBoxTiposRelacionesLineaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLineaPuntoVenta(
			JComboBox jComboBoxTiposAccionesLineaPuntoVenta) {
		this.jComboBoxTiposAccionesLineaPuntoVenta = jComboBoxTiposAccionesLineaPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioLineaPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioLineaPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioLineaPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioLineaPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioLineaPuntoVenta = jComboBoxTiposAccionesFormularioLineaPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
		
		this.lineapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lineapuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LineaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LineaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LineaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Linea Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		LineaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLineaPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarLineaPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarLineaPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarLineaPuntoVenta,this.jTtoolBarDetalleLineaPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarLineaPuntoVenta,this.jTtoolBarDetalleLineaPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarLineaPuntoVenta,this.jTtoolBarDetalleLineaPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarLineaPuntoVenta,this.jTtoolBarDetalleLineaPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleLineaPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleLineaPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoLineaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesLineaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosLineaPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLineaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLineaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLineaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarLineaPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarLineaPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarLineaPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarLineaPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarLineaPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarLineaPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarLineaPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarLineaPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarLineaPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarLineaPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarLineaPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarLineaPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosLineaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLineaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLineaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLineaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLineaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLineaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarLineaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarLineaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarLineaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLineaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLineaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLineaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLineaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLineaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLineaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoLineaPuntoVenta.add(this.jMenuItemDetalleCerrarLineaPuntoVenta);
		
		this.jmenuDetalleAccionesLineaPuntoVenta.add(this.jMenuItemActualizarLineaPuntoVenta);
		this.jmenuDetalleAccionesLineaPuntoVenta.add(this.jMenuItemEliminarLineaPuntoVenta);
		this.jmenuDetalleAccionesLineaPuntoVenta.add(this.jMenuItemCancelarLineaPuntoVenta);		
		
		//this.jmenuDetalleDatosLineaPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByLineaPuntoVenta);				
		this.jmenuDetalleDatosLineaPuntoVenta.add(this.jMenuItemDetalleMostarOcultarLineaPuntoVenta);				
				
		//this.jmenuDetalleAccionesLineaPuntoVenta.add(this.jMenuItemGuardarCambiosLineaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleLineaPuntoVenta.add(this.jmenuDetalleArchivoLineaPuntoVenta);		
		this.jmenuBarDetalleLineaPuntoVenta.add(this.jmenuDetalleAccionesLineaPuntoVenta);		
		this.jmenuBarDetalleLineaPuntoVenta.add(this.jmenuDetalleDatosLineaPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleLineaPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposLineaPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdLineaPuntoVenta = new JLabelMe();
		jLabelIdLineaPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidLineaPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidLineaPuntoVenta.setToolTipText(LineaPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutLineaPuntoVenta= new GridBagLayout();

		this.jPanelidLineaPuntoVenta.setLayout(this.gridaBagLayoutLineaPuntoVenta);

		jLabelidLineaPuntoVenta = new JLabel();
		jLabelidLineaPuntoVenta.setText("Id");

		jLabelidLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelesta_activoLineaPuntoVenta = new JLabelMe();
		this.jLabelesta_activoLineaPuntoVenta.setText(""+LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoLineaPuntoVenta.setToolTipText("Esta Activo");
		this.jLabelesta_activoLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoLineaPuntoVenta.setToolTipText(LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		this.jPanelesta_activoLineaPuntoVenta.setLayout(this.gridaBagLayoutLineaPuntoVenta);


		jCheckBoxesta_activoLineaPuntoVenta= new JCheckBoxMe();
		jCheckBoxesta_activoLineaPuntoVenta.setEnabled(false);

		jCheckBoxesta_activoLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoLineaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonesta_activoLineaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoLineaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoLineaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoLineaPuntoVentaBusqueda.setText("U");
		this.jButtonesta_activoLineaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoLineaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoLineaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoLineaPuntoVentaBusqueda"));

		if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoLineaPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysLineaPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaLineaPuntoVenta = new JLabelMe();
		this.jLabelid_empresaLineaPuntoVenta.setText(""+LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaLineaPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaLineaPuntoVenta.setToolTipText(LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaLineaPuntoVenta.setLayout(this.gridaBagLayoutLineaPuntoVenta);


		jComboBoxid_empresaLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaLineaPuntoVenta.setEnabled(false);

		this.jButtonid_empresaLineaPuntoVenta= new JButtonMe();
		this.jButtonid_empresaLineaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaPuntoVenta.setText("Buscar");
		this.jButtonid_empresaLineaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaLineaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaPuntoVenta"));

		this.jButtonid_empresaLineaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaLineaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLineaPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaLineaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaLineaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaPuntoVentaBusqueda"));

		if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaLineaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaLineaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaLineaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLineaPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaLineaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaLineaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaPuntoVentaUpdate"));



					
		this.jLabelid_sucursalLineaPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalLineaPuntoVenta.setText(""+LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalLineaPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalLineaPuntoVenta.setToolTipText(LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalLineaPuntoVenta.setLayout(this.gridaBagLayoutLineaPuntoVenta);


		jComboBoxid_sucursalLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalLineaPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalLineaPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalLineaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLineaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLineaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLineaPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalLineaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalLineaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLineaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLineaPuntoVenta"));

		this.jButtonid_sucursalLineaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalLineaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLineaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLineaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalLineaPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalLineaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalLineaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLineaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLineaPuntoVentaBusqueda"));

		if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalLineaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalLineaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalLineaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLineaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLineaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalLineaPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalLineaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalLineaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLineaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLineaPuntoVentaUpdate"));



					
		this.jLabelid_lineaLineaPuntoVenta = new JLabelMe();
		this.jLabelid_lineaLineaPuntoVenta.setText(""+LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaLineaPuntoVenta.setToolTipText("Linea");
		this.jLabelid_lineaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaLineaPuntoVenta.setToolTipText(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		this.jPanelid_lineaLineaPuntoVenta.setLayout(this.gridaBagLayoutLineaPuntoVenta);


		jComboBoxid_lineaLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_lineaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaLineaPuntoVenta= new JButtonMe();
		this.jButtonid_lineaLineaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaLineaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaLineaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaLineaPuntoVenta.setText("Buscar");
		this.jButtonid_lineaLineaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaLineaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaLineaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaLineaPuntoVenta"));

		this.jButtonid_lineaLineaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_lineaLineaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaLineaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaLineaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaLineaPuntoVentaBusqueda.setText("U");
		this.jButtonid_lineaLineaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaLineaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaLineaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaLineaPuntoVentaBusqueda"));

		if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaLineaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_lineaLineaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_lineaLineaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaLineaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaLineaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaLineaPuntoVentaUpdate.setText("U");
		this.jButtonid_lineaLineaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaLineaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaLineaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaLineaPuntoVentaUpdate"));


		jButtonid_lineaLineaPuntoVentaArbol= new JButtonMe();
		jButtonid_lineaLineaPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaLineaPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaLineaPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaLineaPuntoVentaArbol.setText("Arbol");
		jButtonid_lineaLineaPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaLineaPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaLineaPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaLineaPuntoVentaArbol"));



					
		this.jLabelid_linea_grupoLineaPuntoVenta = new JLabelMe();
		this.jLabelid_linea_grupoLineaPuntoVenta.setText(""+LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO+" :");
		this.jLabelid_linea_grupoLineaPuntoVenta.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoLineaPuntoVenta.setToolTipText(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		this.jPanelid_linea_grupoLineaPuntoVenta.setLayout(this.gridaBagLayoutLineaPuntoVenta);


		jComboBoxid_linea_grupoLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_grupoLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoLineaPuntoVenta= new JButtonMe();
		this.jButtonid_linea_grupoLineaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoLineaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoLineaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoLineaPuntoVenta.setText("Buscar");
		this.jButtonid_linea_grupoLineaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoLineaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoLineaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoLineaPuntoVenta"));

		this.jButtonid_linea_grupoLineaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoLineaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoLineaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoLineaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoLineaPuntoVentaBusqueda.setText("U");
		this.jButtonid_linea_grupoLineaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoLineaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoLineaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoLineaPuntoVentaBusqueda"));

		if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoLineaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoLineaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_linea_grupoLineaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoLineaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoLineaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoLineaPuntoVentaUpdate.setText("U");
		this.jButtonid_linea_grupoLineaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoLineaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoLineaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoLineaPuntoVentaUpdate"));


		jButtonid_linea_grupoLineaPuntoVentaArbol= new JButtonMe();
		jButtonid_linea_grupoLineaPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoLineaPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoLineaPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoLineaPuntoVentaArbol.setText("Arbol");
		jButtonid_linea_grupoLineaPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoLineaPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoLineaPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoLineaPuntoVentaArbol"));



					
		this.jLabelid_linea_categoriaLineaPuntoVenta = new JLabelMe();
		this.jLabelid_linea_categoriaLineaPuntoVenta.setText(""+LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA+" :");
		this.jLabelid_linea_categoriaLineaPuntoVenta.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaLineaPuntoVenta.setToolTipText(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		this.jPanelid_linea_categoriaLineaPuntoVenta.setLayout(this.gridaBagLayoutLineaPuntoVenta);


		jComboBoxid_linea_categoriaLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_categoriaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaLineaPuntoVenta= new JButtonMe();
		this.jButtonid_linea_categoriaLineaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaLineaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaLineaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaLineaPuntoVenta.setText("Buscar");
		this.jButtonid_linea_categoriaLineaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaLineaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaLineaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaLineaPuntoVenta"));

		this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.setText("U");
		this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaLineaPuntoVentaBusqueda"));

		if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaLineaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaLineaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaLineaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaLineaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaLineaPuntoVentaUpdate.setText("U");
		this.jButtonid_linea_categoriaLineaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaLineaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaLineaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaLineaPuntoVentaUpdate"));


		jButtonid_linea_categoriaLineaPuntoVentaArbol= new JButtonMe();
		jButtonid_linea_categoriaLineaPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaLineaPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaLineaPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaLineaPuntoVentaArbol.setText("Arbol");
		jButtonid_linea_categoriaLineaPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaLineaPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaLineaPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaLineaPuntoVentaArbol"));



					
		this.jLabelid_linea_marcaLineaPuntoVenta = new JLabelMe();
		this.jLabelid_linea_marcaLineaPuntoVenta.setText(""+LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA+" :");
		this.jLabelid_linea_marcaLineaPuntoVenta.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaLineaPuntoVenta.setToolTipText(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		this.jPanelid_linea_marcaLineaPuntoVenta.setLayout(this.gridaBagLayoutLineaPuntoVenta);


		jComboBoxid_linea_marcaLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_marcaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaLineaPuntoVenta= new JButtonMe();
		this.jButtonid_linea_marcaLineaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaLineaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaLineaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaLineaPuntoVenta.setText("Buscar");
		this.jButtonid_linea_marcaLineaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaLineaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaLineaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaLineaPuntoVenta"));

		this.jButtonid_linea_marcaLineaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaLineaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaLineaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaLineaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaLineaPuntoVentaBusqueda.setText("U");
		this.jButtonid_linea_marcaLineaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaLineaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaLineaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaLineaPuntoVentaBusqueda"));

		if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaLineaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaLineaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_linea_marcaLineaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaLineaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaLineaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaLineaPuntoVentaUpdate.setText("U");
		this.jButtonid_linea_marcaLineaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaLineaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaLineaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaLineaPuntoVentaUpdate"));


		jButtonid_linea_marcaLineaPuntoVentaArbol= new JButtonMe();
		jButtonid_linea_marcaLineaPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaLineaPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaLineaPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaLineaPuntoVentaArbol.setText("Arbol");
		jButtonid_linea_marcaLineaPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_marcaLineaPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaLineaPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_marcaLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaLineaPuntoVentaArbol"));



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
		//this.jInternalFrameDetalleLineaPuntoVenta = new LineaPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Linea Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLineaPuntoVenta= new GridBagLayout();
		

		
		String sToolTipLineaPuntoVenta="";
		sToolTipLineaPuntoVenta=LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLineaPuntoVenta+="(PuntoVenta.LineaPuntoVenta)";
		}
		
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipLineaPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoLineaPuntoVenta = new JButtonMe();
		this.jButtonModificarLineaPuntoVenta = new JButtonMe();
        this.jButtonActualizarLineaPuntoVenta = new JButtonMe();
        this.jButtonEliminarLineaPuntoVenta = new JButtonMe();
        this.jButtonCancelarLineaPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosLineaPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaLineaPuntoVenta = new JButtonMe();
		this.jButtonCerrarLineaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosLineaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionLineaPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralLineaPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Linea Punto Venta";
		
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosLineaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposLineaPuntoVenta.setName("jPanelCamposLineaPuntoVenta"); 

		this.jPanelCamposOcultosLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosLineaPuntoVenta.setName("jPanelCamposOcultosLineaPuntoVenta"); 

        this.jPanelAccionesLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLineaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesLineaPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioLineaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioLineaPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoLineaPuntoVenta.setText("Nuevo");
		this.jButtonModificarLineaPuntoVenta.setText("Editar");
        this.jButtonActualizarLineaPuntoVenta.setText("Actualizar");
        this.jButtonEliminarLineaPuntoVenta.setText("Eliminar");
        this.jButtonCancelarLineaPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosLineaPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.setText("Guardar");
		this.jButtonCerrarLineaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLineaPuntoVenta,"nuevo_button","Nuevo",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarLineaPuntoVenta,"modificar_button","Editar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarLineaPuntoVenta,"actualizar_button","Actualizar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarLineaPuntoVenta,"eliminar_button","Eliminar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarLineaPuntoVenta,"cancelar_button","Cancelar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosLineaPuntoVenta,"guardarcambios_button","Guardar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLineaPuntoVenta,"guardarcambiostabla_button","Guardar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLineaPuntoVenta,"cerrar_button","Salir",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoLineaPuntoVenta.setToolTipText("Nuevo"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarLineaPuntoVenta.setToolTipText("Editar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarLineaPuntoVenta.setToolTipText("Actualizar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarLineaPuntoVenta.setToolTipText("Eliminar)"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarLineaPuntoVenta.setToolTipText("Cancelar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosLineaPuntoVenta.setToolTipText("Guardar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.setToolTipText("Guardar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLineaPuntoVenta.setToolTipText("Salir"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLineaPuntoVenta";
		inputMap = this.jButtonNuevoLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLineaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLineaPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarLineaPuntoVenta";
		inputMap = this.jButtonActualizarLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarLineaPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarLineaPuntoVenta";
		inputMap = this.jButtonEliminarLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarLineaPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarLineaPuntoVenta";
		inputMap = this.jButtonCancelarLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarLineaPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarLineaPuntoVenta";
		inputMap = this.jButtonCerrarLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLineaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLineaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLineaPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoLineaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoLineaPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoLineaPuntoVenta.setToolTipText("Nuevo LineaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarLineaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarLineaPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarLineaPuntoVenta.setToolTipText("Sin Cerrar Ventana LineaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeLineaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeLineaPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeLineaPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLineaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesLineaPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesLineaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesLineaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposLineaPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysLineaPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesLineaPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesLineaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposLineaPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosLineaPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposLineaPuntoVenta.setLayout(gridaBagLayoutCamposLineaPuntoVenta);
		this.jPanelCamposOcultosLineaPuntoVenta.setLayout(gridaBagLayoutCamposOcultosLineaPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidLineaPuntoVenta.add(jLabelIdLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 1;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidLineaPuntoVenta.add(jLabelidLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaLineaPuntoVenta.add(jLabelid_empresaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 2;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLineaPuntoVenta.add(jButtonid_empresaLineaPuntoVentaBusqueda, this.gridBagConstraintsLineaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 3;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLineaPuntoVenta.add(jButtonid_empresaLineaPuntoVentaUpdate, this.gridBagConstraintsLineaPuntoVenta);
	}

	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 1;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaLineaPuntoVenta.add(jComboBoxid_empresaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalLineaPuntoVenta.add(jLabelid_sucursalLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 2;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalLineaPuntoVenta.add(jButtonid_sucursalLineaPuntoVentaBusqueda, this.gridBagConstraintsLineaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 3;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalLineaPuntoVenta.add(jButtonid_sucursalLineaPuntoVentaUpdate, this.gridBagConstraintsLineaPuntoVenta);
	}

	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 1;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalLineaPuntoVenta.add(jComboBoxid_sucursalLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaLineaPuntoVenta.add(jLabelid_lineaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 2;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaLineaPuntoVenta.add(jButtonid_lineaLineaPuntoVentaBusqueda, this.gridBagConstraintsLineaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 3;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaLineaPuntoVenta.add(jButtonid_lineaLineaPuntoVentaUpdate, this.gridBagConstraintsLineaPuntoVenta);
	}

	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 1;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaLineaPuntoVenta.add(jComboBoxid_lineaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoLineaPuntoVenta.add(jLabelid_linea_grupoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 2;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoLineaPuntoVenta.add(jButtonid_linea_grupoLineaPuntoVentaBusqueda, this.gridBagConstraintsLineaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 3;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoLineaPuntoVenta.add(jButtonid_linea_grupoLineaPuntoVentaUpdate, this.gridBagConstraintsLineaPuntoVenta);
	}

	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 1;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoLineaPuntoVenta.add(jComboBoxid_linea_grupoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaLineaPuntoVenta.add(jLabelid_linea_categoriaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 2;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaLineaPuntoVenta.add(jButtonid_linea_categoriaLineaPuntoVentaBusqueda, this.gridBagConstraintsLineaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 3;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaLineaPuntoVenta.add(jButtonid_linea_categoriaLineaPuntoVentaUpdate, this.gridBagConstraintsLineaPuntoVenta);
	}

	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 1;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaLineaPuntoVenta.add(jComboBoxid_linea_categoriaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaLineaPuntoVenta.add(jLabelid_linea_marcaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 2;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaLineaPuntoVenta.add(jButtonid_linea_marcaLineaPuntoVentaBusqueda, this.gridBagConstraintsLineaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 3;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaLineaPuntoVenta.add(jButtonid_linea_marcaLineaPuntoVentaUpdate, this.gridBagConstraintsLineaPuntoVenta);
	}

	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 1;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaLineaPuntoVenta.add(jComboBoxid_linea_marcaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoLineaPuntoVenta.add(jLabelesta_activoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 2;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoLineaPuntoVenta.add(jButtonesta_activoLineaPuntoVentaBusqueda, this.gridBagConstraintsLineaPuntoVenta);
	}

	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
	this.gridBagConstraintsLineaPuntoVenta.gridx = 1;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoLineaPuntoVenta.add(jCheckBoxesta_activoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaPuntoVenta.gridy = iYPanelCamposLineaPuntoVenta;
	this.gridBagConstraintsLineaPuntoVenta.gridx = iXPanelCamposLineaPuntoVenta++;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaPuntoVenta.add(this.jPanelidLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(iXPanelCamposLineaPuntoVenta % 1==0) {
		iXPanelCamposLineaPuntoVenta=0;
		iYPanelCamposLineaPuntoVenta++;
	}
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaPuntoVenta.gridy = iYPanelCamposLineaPuntoVenta;
	this.gridBagConstraintsLineaPuntoVenta.gridx = iXPanelCamposLineaPuntoVenta++;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaPuntoVenta.add(this.jPanelid_lineaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(iXPanelCamposLineaPuntoVenta % 1==0) {
		iXPanelCamposLineaPuntoVenta=0;
		iYPanelCamposLineaPuntoVenta++;
	}
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaPuntoVenta.gridy = iYPanelCamposLineaPuntoVenta;
	this.gridBagConstraintsLineaPuntoVenta.gridx = iXPanelCamposLineaPuntoVenta++;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaPuntoVenta.add(this.jPanelid_linea_grupoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(iXPanelCamposLineaPuntoVenta % 1==0) {
		iXPanelCamposLineaPuntoVenta=0;
		iYPanelCamposLineaPuntoVenta++;
	}
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaPuntoVenta.gridy = iYPanelCamposLineaPuntoVenta;
	this.gridBagConstraintsLineaPuntoVenta.gridx = iXPanelCamposLineaPuntoVenta++;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaPuntoVenta.add(this.jPanelid_linea_categoriaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(iXPanelCamposLineaPuntoVenta % 1==0) {
		iXPanelCamposLineaPuntoVenta=0;
		iYPanelCamposLineaPuntoVenta++;
	}
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaPuntoVenta.gridy = iYPanelCamposLineaPuntoVenta;
	this.gridBagConstraintsLineaPuntoVenta.gridx = iXPanelCamposLineaPuntoVenta++;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaPuntoVenta.add(this.jPanelid_linea_marcaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(iXPanelCamposLineaPuntoVenta % 1==0) {
		iXPanelCamposLineaPuntoVenta=0;
		iYPanelCamposLineaPuntoVenta++;
	}
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaPuntoVenta.gridy = iYPanelCamposLineaPuntoVenta;
	this.gridBagConstraintsLineaPuntoVenta.gridx = iXPanelCamposLineaPuntoVenta++;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaPuntoVenta.add(this.jPanelesta_activoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(iXPanelCamposLineaPuntoVenta % 1==0) {
		iXPanelCamposLineaPuntoVenta=0;
		iYPanelCamposLineaPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaPuntoVenta.gridy = iYPanelCamposOcultosLineaPuntoVenta;
	this.gridBagConstraintsLineaPuntoVenta.gridx = iXPanelCamposOcultosLineaPuntoVenta++;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLineaPuntoVenta.add(this.jPanelid_empresaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(iXPanelCamposOcultosLineaPuntoVenta % 1==0) {
		iXPanelCamposOcultosLineaPuntoVenta=0;
		iYPanelCamposOcultosLineaPuntoVenta++;
	}
	this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaPuntoVenta.gridy = iYPanelCamposOcultosLineaPuntoVenta;
	this.gridBagConstraintsLineaPuntoVenta.gridx = iXPanelCamposOcultosLineaPuntoVenta++;
	this.gridBagConstraintsLineaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLineaPuntoVenta.add(this.jPanelid_sucursalLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);



	if(iXPanelCamposOcultosLineaPuntoVenta % 1==0) {
		iXPanelCamposOcultosLineaPuntoVenta=0;
		iYPanelCamposOcultosLineaPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesLineaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesLineaPuntoVenta.setLayout(gridaBagLayoutAccionesLineaPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioLineaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioLineaPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioLineaPuntoVenta);
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLineaPuntoVenta.add(this.jComboBoxTiposAccionesFormularioLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLineaPuntoVenta.add(this.jCheckBoxPostAccionNuevoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLineaPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLineaPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesLineaPuntoVenta.add(this.jButtonModificarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);							

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesLineaPuntoVenta.add(this.jButtonEliminarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
			
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesLineaPuntoVenta.add(this.jButtonActualizarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);


		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesLineaPuntoVenta.add(this.jButtonGuardarCambiosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);	
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsLineaPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesLineaPuntoVenta.add(this.jButtonCancelarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLineaPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsLineaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLineaPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLineaPuntoVenta.gridx =0;
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLineaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleLineaPuntoVenta = new LineaPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Linea Punto Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Linea Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			LineaPuntoVentaModel lineapuntoventaModel=new LineaPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//LineaPuntoVentaModel.LineaPuntoVentaFocusTraversalPolicy lineapuntoventaFocusTraversalPolicy = lineapuntoventaModel.new LineaPuntoVentaFocusTraversalPolicy(this);
			
			//lineapuntoventaFocusTraversalPolicy.setlineapuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(lineapuntoventaModel);
			
			
			this.jContentPaneDetalleLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleLineaPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleLineaPuntoVenta.setLayout(gridaBagLayoutDetalleLineaPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLineaPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleLineaPuntoVenta.add(jTtoolBarDetalleLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionLineaPuntoVenta=   new JScrollPane(jContentPaneDetalleLineaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLineaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralLineaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLineaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleLineaPuntoVenta.add(jPanelCamposLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);
			
			
			
			
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
						&& lineapuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsLineaPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
						this.jContentPaneDetalleLineaPuntoVenta.add(this.jTabbedPaneRelacionesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesLineaPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosLineaPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsLineaPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleLineaPuntoVenta.add(jPanelCamposOcultosLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);
				
					this.jPanelCamposOcultosLineaPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	        this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleLineaPuntoVenta.add(this.jPanelAccionesFormularioLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);							
			
			
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleLineaPuntoVenta.add(this.jPanelAccionesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionLineaPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionLineaPuntoVenta=   new JScrollPane(this.jPanelCamposLineaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLineaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsLineaPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			
			
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
			
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralLineaPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionLineaPuntoVenta;
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
