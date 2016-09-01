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
import com.bydan.erp.activosfijos.util.IndiceCorreccionActivoFijoConstantesFunciones;

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
public class IndiceCorreccionActivoFijoDetalleFormJInternalFrame extends IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleIndiceCorreccionActivoFijo;
	
	protected JMenuBar jmenuBarDetalleIndiceCorreccionActivoFijo;
	
	protected JMenu jmenuDetalleIndiceCorreccionActivoFijo;
	protected JMenu jmenuDetalleArchivoIndiceCorreccionActivoFijo;
	protected JMenu jmenuDetalleAccionesIndiceCorreccionActivoFijo;
	protected JMenu jmenuDetalleDatosIndiceCorreccionActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIndiceCorreccionActivoFijo;	
	protected GridBagConstraints gridBagConstraintsIndiceCorreccionActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleIndiceCorreccionActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public IndiceCorreccionActivoFijoSessionBean indicecorreccionactivofijoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public IndiceCorreccionActivoFijoLogic indicecorreccionactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosIndiceCorreccionActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionIndiceCorreccionActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralIndiceCorreccionActivoFijo;
	
	protected JPanel jPanelCamposIndiceCorreccionActivoFijo;    
	protected JPanel jPanelCamposOcultosIndiceCorreccionActivoFijo;    	
	protected JPanel jPanelAccionesIndiceCorreccionActivoFijo;
	protected JPanel jPanelAccionesFormularioIndiceCorreccionActivoFijo;
    
	
	
	protected Integer iXPanelCamposIndiceCorreccionActivoFijo=0;
	protected Integer iYPanelCamposIndiceCorreccionActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosIndiceCorreccionActivoFijo=0;
	protected Integer iYPanelCamposOcultosIndiceCorreccionActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoIndiceCorreccionActivoFijo;
	public JButton jButtonModificarIndiceCorreccionActivoFijo;
	public JButton jButtonActualizarIndiceCorreccionActivoFijo;
    public JButton jButtonEliminarIndiceCorreccionActivoFijo;
	public JButton jButtonCancelarIndiceCorreccionActivoFijo;
    public JButton jButtonGuardarCambiosIndiceCorreccionActivoFijo;
	public JButton jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo;
	protected JButton jButtonCerrarIndiceCorreccionActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionIndiceCorreccionActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoIndiceCorreccionActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarIndiceCorreccionActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeIndiceCorreccionActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonModificarToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonActualizarToolBarIndiceCorreccionActivoFijo;
    protected JButton jButtonEliminarToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonCancelarToolBarIndiceCorreccionActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonCerrarToolBarIndiceCorreccionActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarIndiceCorreccionActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemModificarIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemActualizarIndiceCorreccionActivoFijo;
    protected JMenuItem jMenuItemEliminarIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemCancelarIndiceCorreccionActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemCerrarIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarIndiceCorreccionActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIndiceCorreccionActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIndiceCorreccionActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidIndiceCorreccionActivoFijo;
	public JLabel jLabelIdIndiceCorreccionActivoFijo;
	public JLabel jLabelidIndiceCorreccionActivoFijo;
	public JButton jButtonidIndiceCorreccionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelanioIndiceCorreccionActivoFijo;
	public JLabel jLabelanioIndiceCorreccionActivoFijo;
	public JTextField jTextFieldanioIndiceCorreccionActivoFijo;
	public JButton jButtonanioIndiceCorreccionActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelvalorIndiceCorreccionActivoFijo;
	public JLabel jLabelvalorIndiceCorreccionActivoFijo;
	public JTextField jTextFieldvalorIndiceCorreccionActivoFijo;
	public JButton jButtonvalorIndiceCorreccionActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaIndiceCorreccionActivoFijo;
	public JLabel jLabelid_empresaIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaIndiceCorreccionActivoFijo;
	public JButton jButtonid_empresaIndiceCorreccionActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaIndiceCorreccionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaIndiceCorreccionActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesIndiceCorreccionActivoFijo;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public IndiceCorreccionActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposIndiceCorreccionActivoFijo=new JPanel();
				this.jPanelAccionesFormularioIndiceCorreccionActivoFijo=new JPanel();
				this.jmenuBarDetalleIndiceCorreccionActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleIndiceCorreccionActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IndiceCorreccionActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public IndiceCorreccionActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IndiceCorreccionActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IndiceCorreccionActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IndiceCorreccionActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarIndiceCorreccionActivoFijo() {
		return this.jButtonActualizarToolBarIndiceCorreccionActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarIndiceCorreccionActivoFijo() {
		return this.jButtonEliminarToolBarIndiceCorreccionActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarIndiceCorreccionActivoFijo() {
		return this.jButtonCancelarToolBarIndiceCorreccionActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionIndiceCorreccionActivoFijo() {
		return this.jButtonProcesarInformacionIndiceCorreccionActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIndiceCorreccionActivoFijo)	{
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo = jButtonProcesarInformacionIndiceCorreccionActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIndiceCorreccionActivoFijo() {
		return this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposRelacionesIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo = jComboBoxTiposRelacionesIndiceCorreccionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposAccionesIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo = jComboBoxTiposAccionesIndiceCorreccionActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo = jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
		
		this.indicecorreccionactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.indicecorreccionactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IndiceCorreccionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IndiceCorreccionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IndiceCorreccionActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Indice Correccion Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		IndiceCorreccionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleIndiceCorreccionActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarIndiceCorreccionActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarIndiceCorreccionActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarIndiceCorreccionActivoFijo,this.jTtoolBarDetalleIndiceCorreccionActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarIndiceCorreccionActivoFijo,this.jTtoolBarDetalleIndiceCorreccionActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarIndiceCorreccionActivoFijo,this.jTtoolBarDetalleIndiceCorreccionActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo,this.jTtoolBarDetalleIndiceCorreccionActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleIndiceCorreccionActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleIndiceCorreccionActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoIndiceCorreccionActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesIndiceCorreccionActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosIndiceCorreccionActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIndiceCorreccionActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIndiceCorreccionActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIndiceCorreccionActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarIndiceCorreccionActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarIndiceCorreccionActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarIndiceCorreccionActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarIndiceCorreccionActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarIndiceCorreccionActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarIndiceCorreccionActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarIndiceCorreccionActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarIndiceCorreccionActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarIndiceCorreccionActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarIndiceCorreccionActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarIndiceCorreccionActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarIndiceCorreccionActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIndiceCorreccionActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIndiceCorreccionActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIndiceCorreccionActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarIndiceCorreccionActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarIndiceCorreccionActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarIndiceCorreccionActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoIndiceCorreccionActivoFijo.add(this.jMenuItemDetalleCerrarIndiceCorreccionActivoFijo);
		
		this.jmenuDetalleAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemActualizarIndiceCorreccionActivoFijo);
		this.jmenuDetalleAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemEliminarIndiceCorreccionActivoFijo);
		this.jmenuDetalleAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemCancelarIndiceCorreccionActivoFijo);		
		
		//this.jmenuDetalleDatosIndiceCorreccionActivoFijo.add(this.jMenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo);				
		this.jmenuDetalleDatosIndiceCorreccionActivoFijo.add(this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo);				
				
		//this.jmenuDetalleAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleIndiceCorreccionActivoFijo.add(this.jmenuDetalleArchivoIndiceCorreccionActivoFijo);		
		this.jmenuBarDetalleIndiceCorreccionActivoFijo.add(this.jmenuDetalleAccionesIndiceCorreccionActivoFijo);		
		this.jmenuBarDetalleIndiceCorreccionActivoFijo.add(this.jmenuDetalleDatosIndiceCorreccionActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleIndiceCorreccionActivoFijo);				
	}
	
	
	public void inicializarElementosCamposIndiceCorreccionActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdIndiceCorreccionActivoFijo = new JLabelMe();
		jLabelIdIndiceCorreccionActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidIndiceCorreccionActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidIndiceCorreccionActivoFijo.setToolTipText(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutIndiceCorreccionActivoFijo= new GridBagLayout();

		this.jPanelidIndiceCorreccionActivoFijo.setLayout(this.gridaBagLayoutIndiceCorreccionActivoFijo);

		jLabelidIndiceCorreccionActivoFijo = new JLabel();
		jLabelidIndiceCorreccionActivoFijo.setText("Id");

		jLabelidIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelanioIndiceCorreccionActivoFijo = new JLabelMe();
		this.jLabelanioIndiceCorreccionActivoFijo.setText(""+IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO+" : *");
		this.jLabelanioIndiceCorreccionActivoFijo.setToolTipText("Anio");
		this.jLabelanioIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanioIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanioIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanioIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanioIndiceCorreccionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanioIndiceCorreccionActivoFijo.setToolTipText(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO);
		this.gridaBagLayoutIndiceCorreccionActivoFijo = new GridBagLayout();
		this.jPanelanioIndiceCorreccionActivoFijo.setLayout(this.gridaBagLayoutIndiceCorreccionActivoFijo);


		jTextFieldanioIndiceCorreccionActivoFijo= new JTextFieldMe();
		jTextFieldanioIndiceCorreccionActivoFijo.setEnabled(false);
		jTextFieldanioIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanioIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanioIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanioIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanioIndiceCorreccionActivoFijo.setText("0");

		this.jButtonanioIndiceCorreccionActivoFijoBusqueda= new JButtonMe();
		this.jButtonanioIndiceCorreccionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanioIndiceCorreccionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanioIndiceCorreccionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanioIndiceCorreccionActivoFijoBusqueda.setText("U");
		this.jButtonanioIndiceCorreccionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanioIndiceCorreccionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanioIndiceCorreccionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanioIndiceCorreccionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanioIndiceCorreccionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anioIndiceCorreccionActivoFijoBusqueda"));

		if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanioIndiceCorreccionActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelvalorIndiceCorreccionActivoFijo = new JLabelMe();
		this.jLabelvalorIndiceCorreccionActivoFijo.setText(""+IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorIndiceCorreccionActivoFijo.setToolTipText("Valor");
		this.jLabelvalorIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorIndiceCorreccionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorIndiceCorreccionActivoFijo.setToolTipText(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutIndiceCorreccionActivoFijo = new GridBagLayout();
		this.jPanelvalorIndiceCorreccionActivoFijo.setLayout(this.gridaBagLayoutIndiceCorreccionActivoFijo);


		jTextFieldvalorIndiceCorreccionActivoFijo= new JTextFieldMe();
		jTextFieldvalorIndiceCorreccionActivoFijo.setEnabled(false);
		jTextFieldvalorIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorIndiceCorreccionActivoFijo.setText("0.0");

		this.jButtonvalorIndiceCorreccionActivoFijoBusqueda= new JButtonMe();
		this.jButtonvalorIndiceCorreccionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorIndiceCorreccionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorIndiceCorreccionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorIndiceCorreccionActivoFijoBusqueda.setText("U");
		this.jButtonvalorIndiceCorreccionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorIndiceCorreccionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorIndiceCorreccionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorIndiceCorreccionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorIndiceCorreccionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorIndiceCorreccionActivoFijoBusqueda"));

		if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorIndiceCorreccionActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysIndiceCorreccionActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaIndiceCorreccionActivoFijo = new JLabelMe();
		this.jLabelid_empresaIndiceCorreccionActivoFijo.setText(""+IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaIndiceCorreccionActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaIndiceCorreccionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaIndiceCorreccionActivoFijo.setToolTipText(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutIndiceCorreccionActivoFijo = new GridBagLayout();
		this.jPanelid_empresaIndiceCorreccionActivoFijo.setLayout(this.gridaBagLayoutIndiceCorreccionActivoFijo);


		jComboBoxid_empresaIndiceCorreccionActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaIndiceCorreccionActivoFijo.setEnabled(false);

		this.jButtonid_empresaIndiceCorreccionActivoFijo= new JButtonMe();
		this.jButtonid_empresaIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIndiceCorreccionActivoFijo.setText("Buscar");
		this.jButtonid_empresaIndiceCorreccionActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaIndiceCorreccionActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIndiceCorreccionActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaIndiceCorreccionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIndiceCorreccionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIndiceCorreccionActivoFijo"));

		this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaIndiceCorreccionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIndiceCorreccionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIndiceCorreccionActivoFijoBusqueda"));

		if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaIndiceCorreccionActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.setText("U");
		this.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIndiceCorreccionActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaIndiceCorreccionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIndiceCorreccionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIndiceCorreccionActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleIndiceCorreccionActivoFijo = new IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Indice Correccion Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIndiceCorreccionActivoFijo= new GridBagLayout();
		

		
		String sToolTipIndiceCorreccionActivoFijo="";
		sToolTipIndiceCorreccionActivoFijo=IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIndiceCorreccionActivoFijo+="(ActivosFijos.IndiceCorreccionActivoFijo)";
		}
		
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipIndiceCorreccionActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonModificarIndiceCorreccionActivoFijo = new JButtonMe();
        this.jButtonActualizarIndiceCorreccionActivoFijo = new JButtonMe();
        this.jButtonEliminarIndiceCorreccionActivoFijo = new JButtonMe();
        this.jButtonCancelarIndiceCorreccionActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonCerrarIndiceCorreccionActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosIndiceCorreccionActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Indice Correccion Activo Fijo";
		
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Indice Correccion Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosIndiceCorreccionActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposIndiceCorreccionActivoFijo.setName("jPanelCamposIndiceCorreccionActivoFijo"); 

		this.jPanelCamposOcultosIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosIndiceCorreccionActivoFijo.setName("jPanelCamposOcultosIndiceCorreccionActivoFijo"); 

        this.jPanelAccionesIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIndiceCorreccionActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesIndiceCorreccionActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioIndiceCorreccionActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioIndiceCorreccionActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoIndiceCorreccionActivoFijo.setText("Nuevo");
		this.jButtonModificarIndiceCorreccionActivoFijo.setText("Editar");
        this.jButtonActualizarIndiceCorreccionActivoFijo.setText("Actualizar");
        this.jButtonEliminarIndiceCorreccionActivoFijo.setText("Eliminar");
        this.jButtonCancelarIndiceCorreccionActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosIndiceCorreccionActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.setText("Guardar");
		this.jButtonCerrarIndiceCorreccionActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIndiceCorreccionActivoFijo,"nuevo_button","Nuevo",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarIndiceCorreccionActivoFijo,"modificar_button","Editar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarIndiceCorreccionActivoFijo,"actualizar_button","Actualizar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarIndiceCorreccionActivoFijo,"eliminar_button","Eliminar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarIndiceCorreccionActivoFijo,"cancelar_button","Cancelar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosIndiceCorreccionActivoFijo,"guardarcambios_button","Guardar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo,"guardarcambiostabla_button","Guardar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIndiceCorreccionActivoFijo,"cerrar_button","Salir",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoIndiceCorreccionActivoFijo.setToolTipText("Nuevo"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarIndiceCorreccionActivoFijo.setToolTipText("Editar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarIndiceCorreccionActivoFijo.setToolTipText("Actualizar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarIndiceCorreccionActivoFijo.setToolTipText("Eliminar)"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarIndiceCorreccionActivoFijo.setToolTipText("Cancelar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosIndiceCorreccionActivoFijo.setToolTipText("Guardar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.setToolTipText("Guardar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIndiceCorreccionActivoFijo.setToolTipText("Salir"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIndiceCorreccionActivoFijo";
		inputMap = this.jButtonNuevoIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIndiceCorreccionActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonActualizarIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarIndiceCorreccionActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonEliminarIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarIndiceCorreccionActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonCancelarIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarIndiceCorreccionActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonCerrarIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIndiceCorreccionActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIndiceCorreccionActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIndiceCorreccionActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoIndiceCorreccionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoIndiceCorreccionActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoIndiceCorreccionActivoFijo.setToolTipText("Nuevo IndiceCorreccionActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarIndiceCorreccionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarIndiceCorreccionActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarIndiceCorreccionActivoFijo.setToolTipText("Sin Cerrar Ventana IndiceCorreccionActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeIndiceCorreccionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeIndiceCorreccionActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeIndiceCorreccionActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesIndiceCorreccionActivoFijo = new JLabelMe();
		
		this.jLabelAccionesIndiceCorreccionActivoFijo.setText("Acciones");		
		this.jLabelAccionesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposIndiceCorreccionActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysIndiceCorreccionActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesIndiceCorreccionActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposIndiceCorreccionActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosIndiceCorreccionActivoFijo = new GridBagLayout();
		
		this.jPanelCamposIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutCamposIndiceCorreccionActivoFijo);
		this.jPanelCamposOcultosIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutCamposOcultosIndiceCorreccionActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidIndiceCorreccionActivoFijo.add(jLabelIdIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);



	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 1;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidIndiceCorreccionActivoFijo.add(jLabelidIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);


	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaIndiceCorreccionActivoFijo.add(jLabelid_empresaIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 2;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaIndiceCorreccionActivoFijo.add(jButtonid_empresaIndiceCorreccionActivoFijoBusqueda, this.gridBagConstraintsIndiceCorreccionActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 3;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaIndiceCorreccionActivoFijo.add(jButtonid_empresaIndiceCorreccionActivoFijoUpdate, this.gridBagConstraintsIndiceCorreccionActivoFijo);
	}

	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 1;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaIndiceCorreccionActivoFijo.add(jComboBoxid_empresaIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);


	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanioIndiceCorreccionActivoFijo.add(jLabelanioIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 2;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelanioIndiceCorreccionActivoFijo.add(jButtonanioIndiceCorreccionActivoFijoBusqueda, this.gridBagConstraintsIndiceCorreccionActivoFijo);
	}

	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 1;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanioIndiceCorreccionActivoFijo.add(jTextFieldanioIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);


	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorIndiceCorreccionActivoFijo.add(jLabelvalorIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 2;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorIndiceCorreccionActivoFijo.add(jButtonvalorIndiceCorreccionActivoFijoBusqueda, this.gridBagConstraintsIndiceCorreccionActivoFijo);
	}

	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 1;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorIndiceCorreccionActivoFijo.add(jTextFieldvalorIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iYPanelCamposIndiceCorreccionActivoFijo;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iXPanelCamposIndiceCorreccionActivoFijo++;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIndiceCorreccionActivoFijo.add(this.jPanelidIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);



	if(iXPanelCamposIndiceCorreccionActivoFijo % 1==0) {
		iXPanelCamposIndiceCorreccionActivoFijo=0;
		iYPanelCamposIndiceCorreccionActivoFijo++;
	}
	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iYPanelCamposIndiceCorreccionActivoFijo;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iXPanelCamposIndiceCorreccionActivoFijo++;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIndiceCorreccionActivoFijo.add(this.jPanelanioIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);



	if(iXPanelCamposIndiceCorreccionActivoFijo % 1==0) {
		iXPanelCamposIndiceCorreccionActivoFijo=0;
		iYPanelCamposIndiceCorreccionActivoFijo++;
	}
	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iYPanelCamposIndiceCorreccionActivoFijo;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iXPanelCamposIndiceCorreccionActivoFijo++;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIndiceCorreccionActivoFijo.add(this.jPanelvalorIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);



	if(iXPanelCamposIndiceCorreccionActivoFijo % 1==0) {
		iXPanelCamposIndiceCorreccionActivoFijo=0;
		iYPanelCamposIndiceCorreccionActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iYPanelCamposOcultosIndiceCorreccionActivoFijo;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iXPanelCamposOcultosIndiceCorreccionActivoFijo++;
	this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIndiceCorreccionActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosIndiceCorreccionActivoFijo.add(this.jPanelid_empresaIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);



	if(iXPanelCamposOcultosIndiceCorreccionActivoFijo % 1==0) {
		iXPanelCamposOcultosIndiceCorreccionActivoFijo=0;
		iYPanelCamposOcultosIndiceCorreccionActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesIndiceCorreccionActivoFijo= new GridBagLayout();
		this.jPanelAccionesIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutAccionesIndiceCorreccionActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioIndiceCorreccionActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutAccionesFormularioIndiceCorreccionActivoFijo);
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioIndiceCorreccionActivoFijo.add(this.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioIndiceCorreccionActivoFijo.add(this.jCheckBoxPostAccionNuevoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioIndiceCorreccionActivoFijo.add(this.jCheckBoxPostAccionSinCerrarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioIndiceCorreccionActivoFijo.add(this.jCheckBoxPostAccionSinMensajeIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesIndiceCorreccionActivoFijo.add(this.jButtonModificarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);							

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesIndiceCorreccionActivoFijo.add(this.jButtonEliminarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
			
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesIndiceCorreccionActivoFijo.add(this.jButtonActualizarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);


		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesIndiceCorreccionActivoFijo.add(this.jButtonGuardarCambiosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);	
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesIndiceCorreccionActivoFijo.add(this.jButtonCancelarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIndiceCorreccionActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIndiceCorreccionActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;		
			//this.gridBagConstraintsIndiceCorreccionActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleIndiceCorreccionActivoFijo = new IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Indice Correccion Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Indice Correccion Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Indice Correccion Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			IndiceCorreccionActivoFijoModel indicecorreccionactivofijoModel=new IndiceCorreccionActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//IndiceCorreccionActivoFijoModel.IndiceCorreccionActivoFijoFocusTraversalPolicy indicecorreccionactivofijoFocusTraversalPolicy = indicecorreccionactivofijoModel.new IndiceCorreccionActivoFijoFocusTraversalPolicy(this);
			
			//indicecorreccionactivofijoFocusTraversalPolicy.setindicecorreccionactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(indicecorreccionactivofijoModel);
			
			
			this.jContentPaneDetalleIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleIndiceCorreccionActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutDetalleIndiceCorreccionActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIndiceCorreccionActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleIndiceCorreccionActivoFijo.add(jTtoolBarDetalleIndiceCorreccionActivoFijo, gridBagConstraintsIndiceCorreccionActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo=   new JScrollPane(jContentPaneDetalleIndiceCorreccionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleIndiceCorreccionActivoFijo.add(jPanelCamposIndiceCorreccionActivoFijo, gridBagConstraintsIndiceCorreccionActivoFijo);
			
			
			
			
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
						&& indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsIndiceCorreccionActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
						this.jContentPaneDetalleIndiceCorreccionActivoFijo.add(this.jTabbedPaneRelacionesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosIndiceCorreccionActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsIndiceCorreccionActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleIndiceCorreccionActivoFijo.add(jPanelCamposOcultosIndiceCorreccionActivoFijo, gridBagConstraintsIndiceCorreccionActivoFijo);
				
					this.jPanelCamposOcultosIndiceCorreccionActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
	        this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleIndiceCorreccionActivoFijo.add(this.jPanelAccionesFormularioIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);							
			
			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleIndiceCorreccionActivoFijo.add(this.jPanelAccionesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionIndiceCorreccionActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo=   new JScrollPane(this.jPanelCamposIndiceCorreccionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			
			
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
			
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionIndiceCorreccionActivoFijo;
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
