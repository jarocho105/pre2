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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.facturacion.util.PoliticaFactuConstantesFunciones;
import com.bydan.erp.facturacion.util.PoliticaFactuParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.PoliticaFactuParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.PoliticaFactuBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PoliticaFactuBeanSwingJInternalFrame extends PoliticaFactuJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PoliticaFactuBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PoliticaFactu> politicafactuValidator = new ClassValidator<PoliticaFactu>(PoliticaFactu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PoliticaFactu politicafactu;	
	public PoliticaFactu politicafactuAux;
	public PoliticaFactu politicafactuAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PoliticaFactu politicafactuTotales;
	public Long idPoliticaFactuActual;
	public Long iIdNuevoPoliticaFactu=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboProducto="";

	public List<Producto> productosForeignKey;

	public List<Producto> getproductosForeignKey() {
		return productosForeignKey;
	}

	public void setproductosForeignKey(List<Producto> productosForeignKey) {
		this.productosForeignKey = productosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productoForeignKey;

	public Producto getproductoForeignKey() {
		return productoForeignKey;
	}

	public void setproductoForeignKey(Producto productoForeignKey) {
		this.productoForeignKey = productoForeignKey;
	}

	public String sFinalQueryComboGrupoCliente="";

	public List<GrupoCliente> grupoclientesForeignKey;

	public List<GrupoCliente> getgrupoclientesForeignKey() {
		return grupoclientesForeignKey;
	}

	public void setgrupoclientesForeignKey(List<GrupoCliente> grupoclientesForeignKey) {
		this.grupoclientesForeignKey = grupoclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoCliente grupoclienteForeignKey;

	public GrupoCliente getgrupoclienteForeignKey() {
		return grupoclienteForeignKey;
	}

	public void setgrupoclienteForeignKey(GrupoCliente grupoclienteForeignKey) {
		this.grupoclienteForeignKey = grupoclienteForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
	}
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoPoliticaFactu;
	public Boolean isPermisoNuevoPoliticaFactu;
	public Boolean isPermisoActualizarPoliticaFactu;
	public Boolean isPermisoActualizarOriginalPoliticaFactu;
	public Boolean isPermisoEliminarPoliticaFactu;
	public Boolean isPermisoGuardarCambiosPoliticaFactu;
	public Boolean isPermisoConsultaPoliticaFactu;
	public Boolean isPermisoBusquedaPoliticaFactu;
	public Boolean isPermisoReportePoliticaFactu;
	public Boolean isPermisoPaginacionMedioPoliticaFactu;
	public Boolean isPermisoPaginacionAltoPoliticaFactu;
	public Boolean isPermisoPaginacionTodoPoliticaFactu;
	public Boolean isPermisoCopiarPoliticaFactu;
	public Boolean isPermisoVerFormPoliticaFactu;
	public Boolean isPermisoDuplicarPoliticaFactu;
	public Boolean isPermisoOrdenPoliticaFactu;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public PoliticaFactuParameterReturnGeneral politicafactuReturnGeneral;
	public PoliticaFactuParameterReturnGeneral politicafactuParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPoliticaFactu=false;
	public Boolean esParaAccionDesdeFormularioPoliticaFactu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PoliticaFactuSessionBeanAdditional politicafactuSessionBeanAdditional=null;
	
	public PoliticaFactuSessionBeanAdditional getPoliticaFactuSessionBeanAdditional() {
		return this.politicafactuSessionBeanAdditional;
	}
	
	public void setPoliticaFactuSessionBeanAdditional(PoliticaFactuSessionBeanAdditional politicafactuSessionBeanAdditional) {
		try {
			this.politicafactuSessionBeanAdditional=politicafactuSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PoliticaFactuBeanSwingJInternalFrameAdditional politicafactuBeanSwingJInternalFrameAdditional=null;
	//public class PoliticaFactuBeanSwingJInternalFrame
	
	public PoliticaFactuBeanSwingJInternalFrameAdditional getPoliticaFactuBeanSwingJInternalFrameAdditional() {
		return this.politicafactuBeanSwingJInternalFrameAdditional;
	}
	
	public void setPoliticaFactuBeanSwingJInternalFrameAdditional(PoliticaFactuBeanSwingJInternalFrameAdditional politicafactuBeanSwingJInternalFrameAdditional) {
		try {
			this.politicafactuBeanSwingJInternalFrameAdditional=politicafactuBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PoliticaFactuLogic politicafactuLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PoliticaFactu politicafactuBean;
	public PoliticaFactuConstantesFunciones politicafactuConstantesFunciones;
	//public PoliticaFactuParameterReturnGeneral politicafactuReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ProductoLogic productoLogic;
	public GrupoClienteLogic grupoclienteLogic;
	
	//PARAMETROS
	
	
	//public List<PoliticaFactu> politicafactus;	
	//public List<PoliticaFactu> politicafactusEliminados;
	//public List<PoliticaFactu> politicafactusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPoliticaFactu=false;
	public Boolean isVisibilidadCeldaDuplicarPoliticaFactu=true;
	public Boolean isVisibilidadCeldaCopiarPoliticaFactu=true;
	public Boolean isVisibilidadCeldaVerFormPoliticaFactu=true;
	public Boolean isVisibilidadCeldaOrdenPoliticaFactu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
	public Boolean isVisibilidadCeldaModificarPoliticaFactu=false;
	public Boolean isVisibilidadCeldaActualizarPoliticaFactu=false;
	public Boolean isVisibilidadCeldaEliminarPoliticaFactu=false;
	public Boolean isVisibilidadCeldaCancelarPoliticaFactu=false;
	public Boolean isVisibilidadCeldaGuardarPoliticaFactu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPoliticaFactu=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPoliticaFactu() {
		return this.iIdNuevoPoliticaFactu;
	}

	public void setiIdNuevoPoliticaFactu(Long iIdNuevoPoliticaFactu) {
		this.iIdNuevoPoliticaFactu = iIdNuevoPoliticaFactu;
	}
	
	public Long getidPoliticaFactuActual() {
		return this.idPoliticaFactuActual;
	}

	public void setidPoliticaFactuActual(Long idPoliticaFactuActual) {
		this.idPoliticaFactuActual = idPoliticaFactuActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PoliticaFactu getpoliticafactu() {
		return this.politicafactu;
	}

	public void setpoliticafactu(PoliticaFactu politicafactu) {
		this.politicafactu = politicafactu;
	}
	
	public PoliticaFactu getpoliticafactuAux() {
		return this.politicafactuAux;
	}

	public void setpoliticafactuAux(PoliticaFactu politicafactuAux) {
		this.politicafactuAux = politicafactuAux;
	}				
	
	public PoliticaFactu getpoliticafactuAnterior() {
		return this.politicafactuAnterior;
	}

	public void setpoliticafactuAnterior(PoliticaFactu politicafactuAnterior) {
		this.politicafactuAnterior = politicafactuAnterior;
	}	
	
	public PoliticaFactu getpoliticafactuTotales() {
		return this.politicafactuTotales;
	}

	public void setpoliticafactuTotales(PoliticaFactu politicafactuTotales) {
		this.politicafactuTotales = politicafactuTotales;
	}	
	
	public PoliticaFactu getpoliticafactuBean() {
		return this.politicafactuBean;
	}

	public void setpoliticafactuBean(PoliticaFactu politicafactuBean) {
		this.politicafactuBean = politicafactuBean;
	}	
	
	public PoliticaFactuParameterReturnGeneral getpoliticafactuReturnGeneral() {
		return this.politicafactuReturnGeneral;
	}

	public void setpoliticafactuReturnGeneral(PoliticaFactuParameterReturnGeneral politicafactuReturnGeneral) {
		this.politicafactuReturnGeneral = politicafactuReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_grupo_clienteFK_IdGrupoCliente=-1L;

	public Long getid_grupo_clienteFK_IdGrupoCliente() {
		return this.id_grupo_clienteFK_IdGrupoCliente;
	}

	public void setid_grupo_clienteFK_IdGrupoCliente(Long id_grupo_clienteFK_IdGrupoCliente) {
		this.id_grupo_clienteFK_IdGrupoCliente = id_grupo_clienteFK_IdGrupoCliente;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PoliticaFactuLogic getPoliticaFactuLogic()	{		
		return politicafactuLogic;
	}

	public void setPoliticaFactuLogic(PoliticaFactuLogic politicafactuLogic) {
		this.politicafactuLogic = politicafactuLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoPoliticaFactu() {
		return isEsNuevoPoliticaFactu;
	}

	public void setIsEsNuevoPoliticaFactu(Boolean isEsNuevoPoliticaFactu) {
		this.isEsNuevoPoliticaFactu = isEsNuevoPoliticaFactu;
	}

	public Boolean getEsParaAccionDesdeFormularioPoliticaFactu() {
		return esParaAccionDesdeFormularioPoliticaFactu;
	}
	
	public void setEsParaAccionDesdeFormularioPoliticaFactu(Boolean esParaAccionDesdeFormularioPoliticaFactu) {
		this.esParaAccionDesdeFormularioPoliticaFactu = esParaAccionDesdeFormularioPoliticaFactu;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.politicafactuSessionBean==null) {
				this.politicafactuSessionBean=new PoliticaFactuSessionBean();
			}

			if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(politicafactuSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.politicafactuSessionBean==null) {
				this.politicafactuSessionBean=new PoliticaFactuSessionBean();
			}

			if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(politicafactuSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productosForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.politicafactuSessionBean==null) {
				this.politicafactuSessionBean=new PoliticaFactuSessionBean();
			}

			if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productosForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(politicafactuSessionBean.getlidProductoActual());
					this.productosForeignKey.add(productoLogic.getProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosGrupoClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoClienteLogic grupoclienteLogic=new GrupoClienteLogic();

			//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

			if(this.politicafactuSessionBean==null) {
				this.politicafactuSessionBean=new PoliticaFactuSessionBean();
			}

			if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

					grupoclienteLogic.getTodosGrupoClientesWithConnection(sFinalQuery,new Pagination());

					this.grupoclientesForeignKey=grupoclienteLogic.getGrupoClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getEntityWithConnection(politicafactuSessionBean.getlidGrupoClienteActual());
					this.grupoclientesForeignKey.add(grupoclienteLogic.getGrupoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.politicafactu!=null) {
						this.politicafactu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
						this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPoliticaFactu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
						if(this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPoliticaFactuGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaPoliticaFactuGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPoliticaFactuGenerico!=null && jComboBoxid_empresaPoliticaFactuGenerico.getItemCount()>0) {
					jComboBoxid_empresaPoliticaFactuGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.politicafactu!=null) {
						this.politicafactu.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
						this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPoliticaFactu.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
						if(this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPoliticaFactuGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalPoliticaFactuGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPoliticaFactuGenerico!=null && jComboBoxid_sucursalPoliticaFactuGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPoliticaFactuGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoForeignKey(Long idProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productoTemp!=null) {

					if(this.politicafactu!=null) {
						this.politicafactu.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
						this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoPoliticaFactu.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
						if(this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoPoliticaFactu!=null) {
						jComboBoxid_productoFK_IdProductoPoliticaFactu.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoPoliticaFactu!=null) {
							//jComboBoxid_productoFK_IdProductoPoliticaFactu.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoPoliticaFactu.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoPoliticaFactu.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualProductoForeignKeyDescripcion(Long idProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoPoliticaFactuGenerico)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(productoTemp!=null) {
				jComboBoxid_productoPoliticaFactuGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoPoliticaFactuGenerico!=null && jComboBoxid_productoPoliticaFactuGenerico.getItemCount()>0) {
					jComboBoxid_productoPoliticaFactuGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoClienteForeignKey(Long idGrupoClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoclienteTemp!=null) {

					if(this.politicafactu!=null) {
						this.politicafactu.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
						this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clientePoliticaFactu.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
						if(this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdGrupoCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu!=null) {
						jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu!=null) {
							//jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.getItemCount()>0) {
								jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualGrupoClienteForeignKeyDescripcion(Long idGrupoClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}


			sDescripcion=GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupoclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clientePoliticaFactuGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(grupoclienteTemp!=null) {
				jComboBoxid_grupo_clientePoliticaFactuGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clientePoliticaFactuGenerico!=null && jComboBoxid_grupo_clientePoliticaFactuGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clientePoliticaFactuGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PoliticaFactu politicafactu,JComboBox jComboBoxid_empresaPoliticaFactuGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPoliticaFactuGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPoliticaFactuGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				politicafactu.setid_empresa(empresaAux.getId());
				politicafactu.setempresa_descripcion(PoliticaFactuConstantesFunciones.getEmpresaDescripcion(empresaAux));
				politicafactu.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PoliticaFactu politicafactu,JComboBox jComboBoxid_sucursalPoliticaFactuGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPoliticaFactuGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPoliticaFactuGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				politicafactu.setid_sucursal(sucursalAux.getId());
				politicafactu.setsucursal_descripcion(PoliticaFactuConstantesFunciones.getSucursalDescripcion(sucursalAux));
				politicafactu.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(PoliticaFactu politicafactu,JComboBox jComboBoxid_productoPoliticaFactuGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoPoliticaFactuGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoPoliticaFactuGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				politicafactu.setid_producto(productoAux.getId());
				politicafactu.setproducto_descripcion(PoliticaFactuConstantesFunciones.getProductoDescripcion(productoAux));
				politicafactu.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(PoliticaFactu politicafactu,JComboBox jComboBoxid_grupo_clientePoliticaFactuGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clientePoliticaFactuGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clientePoliticaFactuGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				politicafactu.setid_grupo_cliente(grupoclienteAux.getId());
				politicafactu.setgrupocliente_descripcion(PoliticaFactuConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				politicafactu.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { 
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { 
					}

					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { 
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { 
					}

					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { 
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { 
					}

					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoPoliticaFactu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoPoliticaFactu.addItem(producto);
							}
						}

						if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { 
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { 
					}

					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdGrupoCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.addItem(grupocliente);
							}
						}

						if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoPoliticaFactu.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoPoliticaFactu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameGrupoClienteForeignKey(GrupoCliente grupocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPoliticaFactu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PoliticaFactuConstantesFunciones.refrescarForeignKeysDescripcionesPoliticaFactu(this.politicafactuLogic.getPoliticaFactus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PoliticaFactuConstantesFunciones.refrescarForeignKeysDescripcionesPoliticaFactu(this.politicafactus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(GrupoCliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//politicafactuLogic.setPoliticaFactus(this.politicafactus);
			politicafactuLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public PoliticaFactuParameterReturnGeneral getPoliticaFactuParameterGeneral() {
		return this.politicafactuParameterGeneral;
	}
	
	public void setPoliticaFactuParameterGeneral(PoliticaFactuParameterReturnGeneral politicafactuParameterGeneral) {
		this.politicafactuParameterGeneral = politicafactuParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoPoliticaFactu() {
		return isPermisoTodoPoliticaFactu;
	}

	public void setIsPermisoTodoPoliticaFactu(Boolean isPermisoTodoPoliticaFactu) {
		this.isPermisoTodoPoliticaFactu = isPermisoTodoPoliticaFactu;
	}

	public Boolean getIsPermisoNuevoPoliticaFactu() {
		return isPermisoNuevoPoliticaFactu;
	}

	public void setIsPermisoNuevoPoliticaFactu(Boolean isPermisoNuevoPoliticaFactu) {
		this.isPermisoNuevoPoliticaFactu = isPermisoNuevoPoliticaFactu;
	}

	public Boolean getIsPermisoActualizarPoliticaFactu() {
		return isPermisoActualizarPoliticaFactu;
	}

	public void setIsPermisoActualizarPoliticaFactu(Boolean isPermisoActualizarPoliticaFactu) {
		this.isPermisoActualizarPoliticaFactu = isPermisoActualizarPoliticaFactu;
	}

	public Boolean getIsPermisoEliminarPoliticaFactu() {
		return isPermisoEliminarPoliticaFactu;
	}

	public void setIsPermisoEliminarPoliticaFactu(Boolean isPermisoEliminarPoliticaFactu) {
		this.isPermisoEliminarPoliticaFactu = isPermisoEliminarPoliticaFactu;
	}

	public Boolean getIsPermisoGuardarCambiosPoliticaFactu() {
		return isPermisoGuardarCambiosPoliticaFactu;
	}

	public void setIsPermisoGuardarCambiosPoliticaFactu(Boolean isPermisoGuardarCambiosPoliticaFactu) {
		this.isPermisoGuardarCambiosPoliticaFactu = isPermisoGuardarCambiosPoliticaFactu;
	}
	
	public Boolean getIsPermisoConsultaPoliticaFactu() {
		return isPermisoConsultaPoliticaFactu;
	}

	public void setIsPermisoConsultaPoliticaFactu(Boolean isPermisoConsultaPoliticaFactu) {
		this.isPermisoConsultaPoliticaFactu = isPermisoConsultaPoliticaFactu;
	}

	public Boolean getIsPermisoBusquedaPoliticaFactu() {
		return isPermisoBusquedaPoliticaFactu;
	}

	public void setIsPermisoBusquedaPoliticaFactu(Boolean isPermisoBusquedaPoliticaFactu) {
		this.isPermisoBusquedaPoliticaFactu = isPermisoBusquedaPoliticaFactu;
	}

	public Boolean getIsPermisoReportePoliticaFactu() {
		return isPermisoReportePoliticaFactu;
	}

	public void setIsPermisoReportePoliticaFactu(Boolean isPermisoReportePoliticaFactu) {
		this.isPermisoReportePoliticaFactu = isPermisoReportePoliticaFactu;
	}
	
	public Boolean getIsPermisoPaginacionMedioPoliticaFactu() {
		return isPermisoPaginacionMedioPoliticaFactu;
	}

	public void setIsPermisoPaginacionMedioPoliticaFactu(Boolean isPermisoPaginacionMedioPoliticaFactu) {
		this.isPermisoPaginacionMedioPoliticaFactu = isPermisoPaginacionMedioPoliticaFactu;
	}
	
	public Boolean getIsPermisoPaginacionTodoPoliticaFactu() {
		return isPermisoPaginacionTodoPoliticaFactu;
	}

	public void setIsPermisoPaginacionTodoPoliticaFactu(Boolean isPermisoPaginacionTodoPoliticaFactu) {
		this.isPermisoPaginacionTodoPoliticaFactu = isPermisoPaginacionTodoPoliticaFactu;
	}
	
	public Boolean getIsPermisoPaginacionAltoPoliticaFactu() {
		return isPermisoPaginacionAltoPoliticaFactu;
	}

	public void setIsPermisoPaginacionAltoPoliticaFactu(Boolean isPermisoPaginacionAltoPoliticaFactu) {
		this.isPermisoPaginacionAltoPoliticaFactu = isPermisoPaginacionAltoPoliticaFactu;
	}
	
	public Boolean getIsPermisoCopiarPoliticaFactu() {
		return isPermisoCopiarPoliticaFactu;
	}

	public void setIsPermisoCopiarPoliticaFactu(Boolean isPermisoCopiarPoliticaFactu) {
		this.isPermisoCopiarPoliticaFactu = isPermisoCopiarPoliticaFactu;
	}
	
	public Boolean getIsPermisoVerFormPoliticaFactu() {
		return isPermisoVerFormPoliticaFactu;
	}

	public void setIsPermisoVerFormPoliticaFactu(Boolean isPermisoVerFormPoliticaFactu) {
		this.isPermisoVerFormPoliticaFactu = isPermisoVerFormPoliticaFactu;
	}
	
	public Boolean getIsPermisoDuplicarPoliticaFactu() {
		return isPermisoDuplicarPoliticaFactu;
	}

	public void setIsPermisoDuplicarPoliticaFactu(Boolean isPermisoDuplicarPoliticaFactu) {
		this.isPermisoDuplicarPoliticaFactu = isPermisoDuplicarPoliticaFactu;
	}
	
	public Boolean getIsPermisoOrdenPoliticaFactu() {
		return isPermisoOrdenPoliticaFactu;
	}

	public void setIsPermisoOrdenPoliticaFactu(Boolean isPermisoOrdenPoliticaFactu) {
		this.isPermisoOrdenPoliticaFactu = isPermisoOrdenPoliticaFactu;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoPoliticaFactu() {
		return isVisibilidadCeldaNuevoPoliticaFactu;
	}

	public void setIsVisibilidadCeldaNuevoPoliticaFactu(Boolean isVisibilidadCeldaNuevoPoliticaFactu) {
		this.isVisibilidadCeldaNuevoPoliticaFactu = isVisibilidadCeldaNuevoPoliticaFactu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPoliticaFactu() {
		return isVisibilidadCeldaDuplicarPoliticaFactu;
	}

	public void setIsVisibilidadCeldaDuplicarPoliticaFactu(Boolean isVisibilidadCeldaDuplicarPoliticaFactu) {
		this.isVisibilidadCeldaDuplicarPoliticaFactu = isVisibilidadCeldaDuplicarPoliticaFactu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPoliticaFactu() {
		return isVisibilidadCeldaCopiarPoliticaFactu;
	}

	public void setIsVisibilidadCeldaCopiarPoliticaFactu(Boolean isVisibilidadCeldaCopiarPoliticaFactu) {
		this.isVisibilidadCeldaCopiarPoliticaFactu = isVisibilidadCeldaCopiarPoliticaFactu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPoliticaFactu() {
		return isVisibilidadCeldaVerFormPoliticaFactu;
	}

	public void setIsVisibilidadCeldaVerFormPoliticaFactu(Boolean isVisibilidadCeldaVerFormPoliticaFactu) {
		this.isVisibilidadCeldaVerFormPoliticaFactu = isVisibilidadCeldaVerFormPoliticaFactu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPoliticaFactu() {
		return isVisibilidadCeldaOrdenPoliticaFactu;
	}

	public void setIsVisibilidadCeldaOrdenPoliticaFactu(Boolean isVisibilidadCeldaOrdenPoliticaFactu) {
		this.isVisibilidadCeldaOrdenPoliticaFactu = isVisibilidadCeldaOrdenPoliticaFactu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPoliticaFactu() {
		return isVisibilidadCeldaNuevoRelacionesPoliticaFactu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPoliticaFactu(Boolean isVisibilidadCeldaNuevoRelacionesPoliticaFactu) {
		this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu = isVisibilidadCeldaNuevoRelacionesPoliticaFactu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPoliticaFactu() {
		return isVisibilidadCeldaModificarPoliticaFactu;
	}

	public void setIsVisibilidadCeldaModificarPoliticaFactu(Boolean isVisibilidadCeldaModificarPoliticaFactu) {
		this.isVisibilidadCeldaModificarPoliticaFactu = isVisibilidadCeldaModificarPoliticaFactu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPoliticaFactu() {
		return isVisibilidadCeldaActualizarPoliticaFactu;
	}

	public void setIsVisibilidadCeldaActualizarPoliticaFactu(Boolean isVisibilidadCeldaActualizarPoliticaFactu) {
		this.isVisibilidadCeldaActualizarPoliticaFactu = isVisibilidadCeldaActualizarPoliticaFactu;
	}

	public Boolean getIsVisibilidadCeldaEliminarPoliticaFactu() {
		return isVisibilidadCeldaEliminarPoliticaFactu;
	}

	public void setIsVisibilidadCeldaEliminarPoliticaFactu(Boolean isVisibilidadCeldaEliminarPoliticaFactu) {
		this.isVisibilidadCeldaEliminarPoliticaFactu = isVisibilidadCeldaEliminarPoliticaFactu;
	}

	public Boolean getIsVisibilidadCeldaCancelarPoliticaFactu() {
		return isVisibilidadCeldaCancelarPoliticaFactu;
	}

	public void setIsVisibilidadCeldaCancelarPoliticaFactu(Boolean isVisibilidadCeldaCancelarPoliticaFactu) {
		this.isVisibilidadCeldaCancelarPoliticaFactu = isVisibilidadCeldaCancelarPoliticaFactu;
	}

	public Boolean getIsVisibilidadCeldaGuardarPoliticaFactu() {
		return isVisibilidadCeldaGuardarPoliticaFactu;
	}

	public void setIsVisibilidadCeldaGuardarPoliticaFactu(Boolean isVisibilidadCeldaGuardarPoliticaFactu) {
		this.isVisibilidadCeldaGuardarPoliticaFactu = isVisibilidadCeldaGuardarPoliticaFactu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPoliticaFactu() {
		return isVisibilidadCeldaGuardarCambiosPoliticaFactu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPoliticaFactu(Boolean isVisibilidadCeldaGuardarCambiosPoliticaFactu) {
		this.isVisibilidadCeldaGuardarCambiosPoliticaFactu = isVisibilidadCeldaGuardarCambiosPoliticaFactu;
	}
		
	public PoliticaFactuSessionBean getpoliticafactuSessionBean() {
		return this.politicafactuSessionBean;
	}
	
	public void setpoliticafactuSessionBean(PoliticaFactuSessionBean politicafactuSessionBean) {
		this.politicafactuSessionBean=politicafactuSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdGrupoCliente() {
		return this.isVisibilidadFK_IdGrupoCliente;
	}

	public void setisVisibilidadFK_IdGrupoCliente(Boolean isVisibilidadFK_IdGrupoCliente) {
		this.isVisibilidadFK_IdGrupoCliente=isVisibilidadFK_IdGrupoCliente;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(PoliticaFactu politicafactu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(politicafactu,null);
				this.setActualParaGuardarSucursalForeignKey(politicafactu,null);
				this.setActualParaGuardarProductoForeignKey(politicafactu,null);
				this.setActualParaGuardarGrupoClienteForeignKey(politicafactu,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(PoliticaFactu politicafactu,PoliticaFactu politicafactuAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPoliticaFactu(politicafactu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		politicafactuAux.setId(politicafactu.getId());
		politicafactuAux.setVersionRow(politicafactu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPoliticaFactu();
		
			int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = politicafactuValidator.getInvalidValues(this.politicafactu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			politicafactuLogic.setDatosCliente(datosCliente);
			politicafactuLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				politicafactuAux=new  PoliticaFactu();
				
				politicafactuAux.setIsNew(true);
				politicafactuAux.setIsChanged(true);
				
				politicafactuAux.setPoliticaFactuOriginal(this.politicafactu);
				
				politicafactuAux.setId(this.politicafactu.getId());	
				politicafactuAux.setVersionRow(this.politicafactu.getVersionRow());	
				politicafactuAux.setid_empresa(this.politicafactu.getid_empresa());	
				politicafactuAux.setid_sucursal(this.politicafactu.getid_sucursal());	
				politicafactuAux.setid_producto(this.politicafactu.getid_producto());	
				politicafactuAux.setid_grupo_cliente(this.politicafactu.getid_grupo_cliente());	
				politicafactuAux.setnombre(this.politicafactu.getnombre());	
				politicafactuAux.setfecha_desde(this.politicafactu.getfecha_desde());	
				politicafactuAux.setfecha_hasta(this.politicafactu.getfecha_hasta());	
				politicafactuAux.setporcentaje(this.politicafactu.getporcentaje());	
				politicafactuAux.setvalor(this.politicafactu.getvalor());	
				politicafactuAux.setcon_banco_cliente(this.politicafactu.getcon_banco_cliente());	
				politicafactuAux.setcon_banco_producto(this.politicafactu.getcon_banco_producto());	
				politicafactuAux.setes_activo(this.politicafactu.getes_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.politicafactuSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(politicafactuAux,politicafactuLogic.getPoliticaFactus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicafactuAux,politicafactus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.politicafactuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicafactuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuLogic.savePoliticaFactus();//WithConnection
						//politicafactuLogic.getSetVersionRowPoliticaFactus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.politicafactu,politicafactuAux);
					
					this.refrescarForeignKeysDescripcionesPoliticaFactu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicafactuLogic.savePoliticaFactuRelaciones(politicafactuAux);//WithConnection
								//politicafactuLogic.getSetVersionRowPoliticaFactus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.politicafactu,politicafactuAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones() 
									|| this.politicafactuSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(politicafactuAux,politicafactuLogic.getPoliticaFactus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(politicafactuAux,politicafactus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.politicafactu,politicafactuAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				politicafactuAux=new  PoliticaFactu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.politicafactuSessionBean.getEsGuardarRelacionado() 
					|| (this.politicafactuSessionBean.getEsGuardarRelacionado() && this.politicafactu.getId()>=0)) {
						
					politicafactuAux.setIsNew(false);
				}
				
				politicafactuAux.setIsDeleted(false);
			
				politicafactuAux.setId(this.politicafactu.getId());	
				politicafactuAux.setVersionRow(this.politicafactu.getVersionRow());	
				politicafactuAux.setid_empresa(this.politicafactu.getid_empresa());	
				politicafactuAux.setid_sucursal(this.politicafactu.getid_sucursal());	
				politicafactuAux.setid_producto(this.politicafactu.getid_producto());	
				politicafactuAux.setid_grupo_cliente(this.politicafactu.getid_grupo_cliente());	
				politicafactuAux.setnombre(this.politicafactu.getnombre());	
				politicafactuAux.setfecha_desde(this.politicafactu.getfecha_desde());	
				politicafactuAux.setfecha_hasta(this.politicafactu.getfecha_hasta());	
				politicafactuAux.setporcentaje(this.politicafactu.getporcentaje());	
				politicafactuAux.setvalor(this.politicafactu.getvalor());	
				politicafactuAux.setcon_banco_cliente(this.politicafactu.getcon_banco_cliente());	
				politicafactuAux.setcon_banco_producto(this.politicafactu.getcon_banco_producto());	
				politicafactuAux.setes_activo(this.politicafactu.getes_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(politicafactuAux,politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicafactuAux,politicafactus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.politicafactuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicafactuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuLogic.savePoliticaFactus();//WithConnection
						//politicafactuLogic.getSetVersionRowPoliticaFactus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.politicafactu,politicafactuAux);
					
					this.refrescarForeignKeysDescripcionesPoliticaFactu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicafactuLogic.savePoliticaFactuRelaciones(politicafactuAux);//WithConnection
								//politicafactuLogic.getSetVersionRowPoliticaFactus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.politicafactu,politicafactuAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones() 
									|| this.politicafactuSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(politicafactuAux,politicafactuLogic.getPoliticaFactus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(politicafactuAux,politicafactus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.politicafactu,politicafactuAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				politicafactuAux=new  PoliticaFactu();
				
				politicafactuAux.setIsNew(false);
				politicafactuAux.setIsChanged(false);
				
				politicafactuAux.setIsDeleted(true);
				
				politicafactuAux.setId(this.politicafactu.getId());	
				politicafactuAux.setVersionRow(this.politicafactu.getVersionRow());	
				politicafactuAux.setid_empresa(this.politicafactu.getid_empresa());	
				politicafactuAux.setid_sucursal(this.politicafactu.getid_sucursal());	
				politicafactuAux.setid_producto(this.politicafactu.getid_producto());	
				politicafactuAux.setid_grupo_cliente(this.politicafactu.getid_grupo_cliente());	
				politicafactuAux.setnombre(this.politicafactu.getnombre());	
				politicafactuAux.setfecha_desde(this.politicafactu.getfecha_desde());	
				politicafactuAux.setfecha_hasta(this.politicafactu.getfecha_hasta());	
				politicafactuAux.setporcentaje(this.politicafactu.getporcentaje());	
				politicafactuAux.setvalor(this.politicafactu.getvalor());	
				politicafactuAux.setcon_banco_cliente(this.politicafactu.getcon_banco_cliente());	
				politicafactuAux.setcon_banco_producto(this.politicafactu.getcon_banco_producto());	
				politicafactuAux.setes_activo(this.politicafactu.getes_activo());	
				
				if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.politicafactuAux.getId()>=0) {	
						this.politicafactusEliminados.add(politicafactuAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(politicafactuAux,politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicafactuAux,politicafactus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.politicafactuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicafactuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuLogic.savePoliticaFactus();//WithConnection
						//politicafactuLogic.getSetVersionRowPoliticaFactus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicafactuLogic.savePoliticaFactuRelaciones(politicafactuAux);//WithConnection
								//politicafactuLogic.getSetVersionRowPoliticaFactus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones() 
								|| this.politicafactuSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(politicafactuAux,politicafactuLogic.getPoliticaFactus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(politicafactuAux,politicafactus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getPoliticaFactus().addAll(this.politicafactusEliminados);
					
					politicafactuLogic.savePoliticaFactus();//WithConnection
					//politicafactuLogic.getSetVersionRowPoliticaFactus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPoliticaFactu();
				
				this.politicafactusEliminados= new ArrayList<PoliticaFactu>();		
			}
			
			if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Politica Factu GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.politicafactu=politicafactuAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessPoliticaFactu();
      	}
		
	}	
	
	public void actualizarRelaciones(PoliticaFactu politicafactuLocal) throws Exception {
		
		if(this.politicafactuSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PoliticaFactu politicafactuLocal) throws Exception {	
		if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				politicafactuLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				politicafactuLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				politicafactuLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				politicafactuLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPoliticaFactuActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = politicafactuValidator.getInvalidValues(this.politicafactu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PoliticaFactu politicafactu,List<PoliticaFactu> politicafactus) throws Exception {
		try	{		
			PoliticaFactuConstantesFunciones.actualizarLista(politicafactu,politicafactus,this.politicafactuSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PoliticaFactu politicafactu,List<PoliticaFactu> politicafactus) throws Exception {
		try	{			
			PoliticaFactuConstantesFunciones.actualizarSelectedLista(politicafactu,politicafactus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PoliticaFactu> politicafactusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				politicafactusLocal=this.politicafactuLogic.getPoliticaFactus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				politicafactusLocal=this.politicafactus;
			}
			//ARCHITECTURE
		
			for(PoliticaFactu politicafactuLocal:politicafactusLocal) {
				if(this.permiteMantenimiento(politicafactuLocal) && politicafactuLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+PoliticaFactuConstantesFunciones.getPoliticaFactuLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelid_empresaPoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelid_sucursalPoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelid_productoPoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.IDGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelid_grupo_clientePoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelnombrePoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.FECHADESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelfecha_desdePoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.FECHAHASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelfecha_hastaPoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelporcentajePoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelvalorPoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.CONBANCOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelcon_banco_clientePoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.CONBANCOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelcon_banco_productoPoliticaFactu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaFactuConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabeles_activoPoliticaFactu,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelid_empresaPoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelid_sucursalPoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelid_productoPoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelid_grupo_clientePoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelnombrePoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelfecha_desdePoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelfecha_hastaPoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelporcentajePoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelvalorPoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelcon_banco_clientePoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabelcon_banco_productoPoliticaFactu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaFactu.jLabeles_activoPoliticaFactu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPoliticaFactu--;	
		
		
		this.politicafactuAux=new PoliticaFactu();
		
		this.politicafactuAux.setId(this.iIdNuevoPoliticaFactu);
		this.politicafactuAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.politicafactuLogic.getPoliticaFactus().add(this.politicafactuAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.politicafactus.add(this.politicafactuAux);
		}
		//ARCHITECTURE
		
		this.politicafactu=this.politicafactuAux;
		
		if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPoliticaFactu(this.politicafactu);
			this.setVariablesObjetoActualToFormularioForeignKeyPoliticaFactu(this.politicafactu);
		}
				
		//this.setDefaultControlesPoliticaFactu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPoliticaFactu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPoliticaFactu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaFactu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPoliticaFactu(this.politicafactuBean,this.politicafactu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PoliticaFactuConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
			classes=PoliticaFactuConstantesFunciones.getClassesRelationshipsOfPoliticaFactu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.politicafactuReturnGeneral=politicafactuLogic.procesarEventosPoliticaFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicafactuLogic.getPoliticaFactus(),this.politicafactu,this.politicafactuParameterGeneral,this.isEsNuevoPoliticaFactu,classes);//this.politicafactuLogic.getPoliticaFactu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPoliticaFactu(this.politicafactuReturnGeneral,this.politicafactuBean,false);
		
		if(this.politicafactuReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPoliticaFactu(this.politicafactuReturnGeneral.getPoliticaFactu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPoliticaFactu(this.politicafactuReturnGeneral.getPoliticaFactu());
		}
		
		if(this.politicafactuReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPoliticaFactu(this.politicafactuReturnGeneral.getPoliticaFactu(),classes);//this.politicafactuBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPoliticaFactu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPoliticaFactu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.RecargarFormPoliticaFactu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPoliticaFactu(false);
						
			if(politicafactuSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaFactu();
			}
			
			this.actualizarVisualTableDatosPoliticaFactu();
			
			this.jTableDatosPoliticaFactu.setRowSelectionInterval(this.getIndiceNuevoPoliticaFactu(), this.getIndiceNuevoPoliticaFactu());
			
			this.seleccionarFilaTablaPoliticaFactuActual();
						
			this.actualizarEstadoCeldasBotonesPoliticaFactu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPoliticaFactu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPoliticaFactu.jTextAreanombrePoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarnombrePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_desdePoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarfecha_desdePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_hastaPoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarfecha_hastaPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldporcentajePoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarporcentajePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldvalorPoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarvalorPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarcon_banco_clientePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarcon_banco_productoPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activares_activoPoliticaFactu);	
		//
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarid_empresaPoliticaFactu);//
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarid_sucursalPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarid_productoPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setEnabled(isHabilitar && this.politicafactuConstantesFunciones.activarid_grupo_clientePoliticaFactu);
	};
	
	public void setDefaultControlesPoliticaFactu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPoliticaFactu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.politicafactuSessionBean.setConGuardarRelaciones(true);			
			this.politicafactuSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.setVisible(true);
			
					
		} else {
			//this.politicafactuSessionBean.setConGuardarRelaciones(false);			
			this.politicafactuSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPoliticaFactu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
				if(politicafactuAux.getId().equals(this.iIdNuevoPoliticaFactu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaFactu politicafactuAux:this.politicafactus) {
				if(politicafactuAux.getId().equals(this.iIdNuevoPoliticaFactu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualPoliticaFactu(PoliticaFactu politicafactu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
				if(politicafactuAux.getId().equals(politicafactu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaFactu politicafactuAux:this.politicafactus) {
				if(politicafactuAux.getId().equals(politicafactu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalPoliticaFactu(PoliticaFactu politicafactuOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
				if(politicafactuAux.getPoliticaFactuOriginal().getId().equals(politicafactuOriginal.getId())) {
					existe=true;
					politicafactuOriginal.setId(politicafactuAux.getId());
					politicafactuOriginal.setVersionRow(politicafactuAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaFactu politicafactuAux:this.politicafactus) {
				if(politicafactuAux.getPoliticaFactuOriginal().getId().equals(politicafactuOriginal.getId())) {
					existe=true;
					politicafactuOriginal.setId(politicafactuAux.getId());
					politicafactuOriginal.setVersionRow(politicafactuAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPoliticaFactu(Boolean esParaCancelar) throws Exception {
		politicafactusAux=new ArrayList<PoliticaFactu>();
		politicafactuAux=new PoliticaFactu();
		
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
					if(politicafactuAux.getId()<0) {
						politicafactusAux.add(politicafactuAux);
					}		
				}
				this.iIdNuevoPoliticaFactu=0L;
				this.politicafactuLogic.getPoliticaFactus().removeAll(politicafactusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaFactu politicafactuAux:this.politicafactus) {
					if(politicafactuAux.getId()<0) {
						politicafactusAux.add(politicafactuAux);
					}		
				}
				this.iIdNuevoPoliticaFactu=0L;
				this.politicafactus.removeAll(politicafactusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPoliticaFactu 
					&& this.politicafactuLogic.getPoliticaFactus().size()>0
					) {
					politicafactuAux=this.politicafactuLogic.getPoliticaFactus().get(this.politicafactuLogic.getPoliticaFactus().size() - 1);
				
					if(politicafactuAux.getId()<0) {
						this.politicafactuLogic.getPoliticaFactus().remove(politicafactuAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPoliticaFactu && this.politicafactus.size()>0) {
					politicafactuAux=this.politicafactus.get(this.politicafactus.size() - 1);
				
					if(politicafactuAux.getId()<0) {
						this.politicafactus.remove(politicafactuAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPoliticaFactu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(politicafactu.getId()<0) {
				this.politicafactuLogic.getPoliticaFactus().remove(this.politicafactu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(politicafactu.getId()<0) {
				this.politicafactus.remove(this.politicafactu);
			}
		}			
	}
	
	public void setEstadosInicialesPoliticaFactu(List<PoliticaFactu> politicafactusAux) throws Exception {
		PoliticaFactuConstantesFunciones.setEstadosInicialesPoliticaFactu(politicafactusAux);
	}
	
	public void setEstadosInicialesPoliticaFactu(PoliticaFactu politicafactuAux) throws Exception {
		PoliticaFactuConstantesFunciones.setEstadosInicialesPoliticaFactu(politicafactuAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPoliticaFactuActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPoliticaFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPoliticaFactuActual()) {
				if(!this.isEsNuevoPoliticaFactu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPoliticaFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPoliticaFactu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPoliticaFactuActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Politica Factu ?", "MANTENIMIENTO DE Politica Factu", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPoliticaFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PoliticaFactu politicafactu) throws Exception {
		PoliticaFactuConstantesFunciones.seleccionarAsignar(this.politicafactu,politicafactu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPoliticaFactu=this.isPermisoActualizarOriginalPoliticaFactu;
			
			
			this.seleccionarAsignar(politicafactu);
			
			

			idProductoActual=politicafactu.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PoliticaFactuConstantesFunciones.quitarEspaciosPoliticaFactu(this.politicafactu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPoliticaFactu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.politicafactuSessionBean.setsFuncionBusquedaRapida(this.politicafactuSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarProductoActual() throws Exception {
		try	{
			Producto productoAux=new Producto();

			if(this.idProductoActual != null && this.idProductoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(this.idProductoActual);
					productoAux= productoLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productosForeignKey=new ArrayList<Producto>();
				productosForeignKey.add(productoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPoliticaFactu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPoliticaFactu(esParaCancelar);				
				this.cancelarNuevoPoliticaFactu(esParaCancelar);								
			}
			
			this.politicafactu=new PoliticaFactu();
			
			this.inicializarPoliticaFactu();
			
			this.actualizarEstadoCeldasBotonesPoliticaFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPoliticaFactu() throws Exception {
		try {
			PoliticaFactuConstantesFunciones.inicializarPoliticaFactu(this.politicafactu);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.politicafactuLogic.getPoliticaFactus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePoliticaFactus(String sAccionBusqueda,List<PoliticaFactu> politicafactusParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="PoliticaFactu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PoliticaFactuMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PoliticaFactuMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PoliticaFactu"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Politica Factus");		
		parameters.put("busquedapor", PoliticaFactuConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePoliticaFactu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PoliticaFactuConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PoliticaFactuConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePoliticaFactu=new JRBeanArrayDataSource(PoliticaFactuJInternalFrame.TraerPoliticaFactuBeans(politicafactusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePoliticaFactu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PoliticaFactuConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PoliticaFactuConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PoliticaFactuBean.TraerPoliticaFactuBeans(politicafactusParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReportePoliticaFactus(sAccionBusqueda,sTipoArchivoReporte,politicafactusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPoliticaFactus(sAccionBusqueda,sTipoArchivoReporte,politicafactusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPoliticaFactuActionPerformed(null);
					//this.generarExcelReportePoliticaFactus(sAccionBusqueda,sTipoArchivoReporte,politicafactusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPoliticaFactus(sAccionBusqueda,sTipoArchivoReporte,politicafactusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPoliticaFactus(sAccionBusqueda,sTipoArchivoReporte,politicafactusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPoliticaFactus(sAccionBusqueda,sTipoArchivoReporte,politicafactusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePoliticaFactus(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaFactu> politicafactusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicafactu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaFactus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPoliticaFactu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PoliticaFactu politicafactu : politicafactusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PoliticaFactuConstantesFunciones.generarExcelReporteDataPoliticaFactu("NORMAL",row,workbook,politicafactu,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPoliticaFactu(String sTipo,Row row,Workbook workbook) {
		
		PoliticaFactuConstantesFunciones.generarExcelReporteHeaderPoliticaFactu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPoliticaFactus(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaFactu> politicafactusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicafactu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaFactus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PoliticaFactu politicafactu : politicafactusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PoliticaFactuConstantesFunciones.getPoliticaFactuDescripcion(politicafactu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicafactu.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(politicafactu.getcon_banco_cliente()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(politicafactu.getcon_banco_producto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaFactuConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(politicafactu.getes_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPoliticaFactus(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaFactu> politicafactusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PoliticaFactu> politicafactusRespaldo=null;
		
		classes=PoliticaFactuConstantesFunciones.getClassesRelationshipsOfPoliticaFactu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.politicafactuLogic.setDatosCliente(this.datosCliente);
		this.politicafactuLogic.setDatosDeep(this.datosDeep);
		this.politicafactuLogic.setIsConDeep(true);
		
		politicafactusRespaldo=this.politicafactuLogic.getPoliticaFactus();
		
		this.politicafactuLogic.setPoliticaFactus(politicafactusParaReportes);	
		this.politicafactuLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		politicafactusParaReportes=this.politicafactuLogic.getPoliticaFactus();
		this.politicafactuLogic.setPoliticaFactus(politicafactusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicafactu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaFactus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPoliticaFactu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PoliticaFactu politicafactu : politicafactusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPoliticaFactu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PoliticaFactuConstantesFunciones.generarExcelReporteDataPoliticaFactu("NORMAL",row,workbook,politicafactu,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PoliticaFactuConstantesFunciones.getPoliticaFactuDescripcion(politicafactu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaFactu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPoliticaFactu() throws Exception {		
		this.startProcessPoliticaFactu(true);
	}
	
	public void startProcessPoliticaFactu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPoliticaFactu ,this.jPanelParametrosReportesPoliticaFactu, this.jScrollPanelDatosPoliticaFactu,this.jPanelPaginacionPoliticaFactu, this.jScrollPanelDatosEdicionPoliticaFactu, this.jPanelAccionesPoliticaFactu,this.jPanelAccionesFormularioPoliticaFactu,this.jmenuBarPoliticaFactu,this.jmenuBarDetallePoliticaFactu,this.jTtoolBarPoliticaFactu,this.jTtoolBarDetallePoliticaFactu);		
		
		final JTabbedPane jTabbedPaneBusquedasPoliticaFactu=this.jTabbedPaneBusquedasPoliticaFactu; 
		
		final JPanel jPanelParametrosReportesPoliticaFactu=this.jPanelParametrosReportesPoliticaFactu;
		//final JScrollPane jScrollPanelDatosPoliticaFactu=this.jScrollPanelDatosPoliticaFactu;
		final JTable jTableDatosPoliticaFactu=this.jTableDatosPoliticaFactu;		
		final JPanel jPanelPaginacionPoliticaFactu=this.jPanelPaginacionPoliticaFactu;
		//final JScrollPane jScrollPanelDatosEdicionPoliticaFactu=this.jScrollPanelDatosEdicionPoliticaFactu;
		final JPanel jPanelAccionesPoliticaFactu=this.jPanelAccionesPoliticaFactu;
		
		JPanel jPanelCamposAuxiliarPoliticaFactu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPoliticaFactu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			jPanelCamposAuxiliarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jPanelCamposPoliticaFactu;
			jPanelAccionesFormularioAuxiliarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jPanelAccionesFormularioPoliticaFactu;
		}
		
		final JPanel jPanelCamposPoliticaFactu=jPanelCamposAuxiliarPoliticaFactu;
		final JPanel jPanelAccionesFormularioPoliticaFactu=jPanelAccionesFormularioAuxiliarPoliticaFactu;
		
		
		final JMenuBar jmenuBarPoliticaFactu=this.jmenuBarPoliticaFactu;
		final JToolBar jTtoolBarPoliticaFactu=this.jTtoolBarPoliticaFactu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPoliticaFactu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPoliticaFactu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			jmenuBarDetalleAuxiliarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jmenuBarDetallePoliticaFactu;
			jTtoolBarDetalleAuxiliarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jTtoolBarDetallePoliticaFactu;
		}
		
		final JMenuBar jmenuBarDetallePoliticaFactu=jmenuBarDetalleAuxiliarPoliticaFactu;
		final JToolBar jTtoolBarDetallePoliticaFactu=jTtoolBarDetalleAuxiliarPoliticaFactu;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPoliticaFactu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPoliticaFactu;
			processRunnable.jTableDatos=jTableDatosPoliticaFactu;
			processRunnable.jPanelCampos=jPanelCamposPoliticaFactu;
			processRunnable.jPanelPaginacion=jPanelPaginacionPoliticaFactu;
			processRunnable.jPanelAcciones=jPanelAccionesPoliticaFactu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPoliticaFactu;
			
			
			processRunnable.jmenuBar=jmenuBarPoliticaFactu;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePoliticaFactu;
			processRunnable.jTtoolBar=jTtoolBarPoliticaFactu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePoliticaFactu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPoliticaFactu ,jPanelParametrosReportesPoliticaFactu,jTableDatosPoliticaFactu, /*jScrollPanelDatosPoliticaFactu,*/jPanelCamposPoliticaFactu,jPanelPaginacionPoliticaFactu, /*jScrollPanelDatosEdicionPoliticaFactu,*/ jPanelAccionesPoliticaFactu,jPanelAccionesFormularioPoliticaFactu,jmenuBarPoliticaFactu,jmenuBarDetallePoliticaFactu,jTtoolBarPoliticaFactu,jTtoolBarDetallePoliticaFactu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPoliticaFactu ,jPanelParametrosReportesPoliticaFactu, jScrollPanelDatosPoliticaFactu,jPanelPaginacionPoliticaFactu, jScrollPanelDatosEdicionPoliticaFactu, jPanelAccionesPoliticaFactu,jPanelAccionesFormularioPoliticaFactu,jmenuBarPoliticaFactu,jmenuBarDetallePoliticaFactu,jTtoolBarPoliticaFactu,jTtoolBarDetallePoliticaFactu);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessPoliticaFactu() {// throws Exception 
		this.finishProcessPoliticaFactu(true);
	}
	
	public void finishProcessPoliticaFactu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPoliticaFactu ,this.jPanelParametrosReportesPoliticaFactu, this.jScrollPanelDatosPoliticaFactu,this.jPanelPaginacionPoliticaFactu, this.jScrollPanelDatosEdicionPoliticaFactu, this.jPanelAccionesPoliticaFactu,this.jPanelAccionesFormularioPoliticaFactu,this.jmenuBarPoliticaFactu,this.jmenuBarDetallePoliticaFactu,this.jTtoolBarPoliticaFactu,this.jTtoolBarDetallePoliticaFactu);		
		
		final JTabbedPane jTabbedPaneBusquedasPoliticaFactu=this.jTabbedPaneBusquedasPoliticaFactu; 
		
		final JPanel jPanelParametrosReportesPoliticaFactu=this.jPanelParametrosReportesPoliticaFactu;
		//final JScrollPane jScrollPanelDatosPoliticaFactu=this.jScrollPanelDatosPoliticaFactu;
		final JTable jTableDatosPoliticaFactu=this.jTableDatosPoliticaFactu;		
		final JPanel jPanelPaginacionPoliticaFactu=this.jPanelPaginacionPoliticaFactu;
		//final JScrollPane jScrollPanelDatosEdicionPoliticaFactu=this.jScrollPanelDatosEdicionPoliticaFactu;
		final JPanel jPanelAccionesPoliticaFactu=this.jPanelAccionesPoliticaFactu;
		
		JPanel jPanelCamposAuxiliarPoliticaFactu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPoliticaFactu=new JPanel();
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			jPanelCamposAuxiliarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jPanelCamposPoliticaFactu;
			jPanelAccionesFormularioAuxiliarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jPanelAccionesFormularioPoliticaFactu;
		}
		
		final JPanel jPanelCamposPoliticaFactu=jPanelCamposAuxiliarPoliticaFactu;
		final JPanel jPanelAccionesFormularioPoliticaFactu=jPanelAccionesFormularioAuxiliarPoliticaFactu;
		
		
		final JMenuBar jmenuBarPoliticaFactu=this.jmenuBarPoliticaFactu;		
		final JToolBar jTtoolBarPoliticaFactu=this.jTtoolBarPoliticaFactu;
				
		JMenuBar jmenuBarDetalleAuxiliarPoliticaFactu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPoliticaFactu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			jmenuBarDetalleAuxiliarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jmenuBarDetallePoliticaFactu;
			jTtoolBarDetalleAuxiliarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jTtoolBarDetallePoliticaFactu;		
		}
		
		final JMenuBar jmenuBarDetallePoliticaFactu=jmenuBarDetalleAuxiliarPoliticaFactu;
		final JToolBar jTtoolBarDetallePoliticaFactu=jTtoolBarDetalleAuxiliarPoliticaFactu;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPoliticaFactu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPoliticaFactu;
			processRunnable.jTableDatos=jTableDatosPoliticaFactu;
			processRunnable.jPanelCampos=jPanelCamposPoliticaFactu;
			processRunnable.jPanelPaginacion=jPanelPaginacionPoliticaFactu;
			processRunnable.jPanelAcciones=jPanelAccionesPoliticaFactu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPoliticaFactu;
			
			
			processRunnable.jmenuBar=jmenuBarPoliticaFactu;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePoliticaFactu;
			processRunnable.jTtoolBar=jTtoolBarPoliticaFactu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePoliticaFactu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPoliticaFactu ,jPanelParametrosReportesPoliticaFactu, jTableDatosPoliticaFactu,/*jScrollPanelDatosPoliticaFactu,*/jPanelCamposPoliticaFactu,jPanelPaginacionPoliticaFactu, /*jScrollPanelDatosEdicionPoliticaFactu,*/ jPanelAccionesPoliticaFactu,jPanelAccionesFormularioPoliticaFactu,jmenuBarPoliticaFactu,jmenuBarDetallePoliticaFactu,jTtoolBarPoliticaFactu,jTtoolBarDetallePoliticaFactu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPoliticaFactu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPoliticaFactu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPoliticaFactu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPoliticaFactu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPoliticaFactu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePoliticaFactu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPoliticaFactu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPoliticaFactu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePoliticaFactu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.politicafactuConstantesFunciones.getsFinalQueryPoliticaFactu();
		String  finalQueryPaginacionTodos=this.politicafactuConstantesFunciones.getsFinalQueryPoliticaFactu();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=PoliticaFactuConstantesFunciones.getArrayColumnasGlobalesNoPoliticaFactu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PoliticaFactuConstantesFunciones.getArrayColumnasGlobalesPoliticaFactu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PoliticaFactuConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.politicafactusEliminados= new ArrayList<PoliticaFactu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPoliticaFactu();
		
				///*PoliticaFactuSessionBean*/this.politicafactuSessionBean=new PoliticaFactuSessionBean();
			
			if(this.politicafactuSessionBean==null) {
				this.politicafactuSessionBean=new PoliticaFactuSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=PoliticaFactuConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PoliticaFactuConstantesFunciones.getClassesForeignKeysOfPoliticaFactu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/politicafactu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			politicafactusAux= new ArrayList<PoliticaFactu>();
			
				
			politicafactuLogic.setDatosCliente(this.datosCliente);
			politicafactuLogic.setDatosDeep(this.datosDeep);
			politicafactuLogic.setIsConDeep(true);
			
			
			politicafactuLogic.getPoliticaFactuDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					politicafactuLogic.getTodosPoliticaFactus(finalQueryGlobal,pagination);
					
					//politicafactuLogic.getTodosPoliticaFactusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(politicafactuLogic.getPoliticaFactus()==null|| politicafactuLogic.getPoliticaFactus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicafactusAux= new ArrayList<PoliticaFactu>();
							politicafactusAux.addAll(politicafactuLogic.getPoliticaFactus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactusAux= new ArrayList<PoliticaFactu>();
							politicafactusAux.addAll(politicafactus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicafactuLogic.getTodosPoliticaFactus(finalQueryGlobal+"",this.pagination);												
							
							//politicafactuLogic.getTodosPoliticaFactusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePoliticaFactus("Todos",politicafactuLogic.getPoliticaFactus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicafactuLogic.setPoliticaFactus(new ArrayList<PoliticaFactu>());					
							politicafactuLogic.getPoliticaFactus().addAll(politicafactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactus=new ArrayList<PoliticaFactu>();
							politicafactus.addAll(politicafactusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPoliticaFactu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPoliticaFactu=this.idActual;
				
				} else if(this.idPoliticaFactuActual!=null && this.idPoliticaFactuActual!=0L) {
					idPoliticaFactu=idPoliticaFactuActual;
				}
				
					
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndicePorId(idPoliticaFactu);
				
				this.politicafactus=new ArrayList<PoliticaFactu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					politicafactuLogic.getEntity(idPoliticaFactu);
					
					//politicafactuLogic.getEntityWithConnection(idPoliticaFactu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicafactuLogic.setPoliticaFactus(new ArrayList<PoliticaFactu>());
					politicafactuLogic.getPoliticaFactus().add(politicafactuLogic.getPoliticaFactu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicafactus=new ArrayList<PoliticaFactu>();
					this.politicafactus.add(politicafactu);
				}
				
				if(politicafactuLogic.getPoliticaFactu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicafactuLogic.getPoliticaFactusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicafactuLogic.getPoliticaFactus()==null||politicafactuLogic.getPoliticaFactus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicafactus==null|| politicafactus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactusAux=new ArrayList<PoliticaFactu>();
						politicafactusAux.addAll(politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactusAux=new ArrayList<PoliticaFactu>();
							politicafactusAux.addAll(politicafactus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicafactuLogic.getPoliticaFactusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaFactus("FK_IdEmpresa",politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaFactus("FK_IdEmpresa",politicafactus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuLogic.setPoliticaFactus(new ArrayList<PoliticaFactu>());
						politicafactuLogic.getPoliticaFactus().addAll(politicafactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactus=new ArrayList<PoliticaFactu>();
							politicafactus.addAll(politicafactusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdGrupoCliente")) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicafactuLogic.getPoliticaFactusFK_IdGrupoCliente(finalQueryGlobal,pagination,id_grupo_clienteFK_IdGrupoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicafactuLogic.getPoliticaFactus()==null||politicafactuLogic.getPoliticaFactus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicafactus==null|| politicafactus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactusAux=new ArrayList<PoliticaFactu>();
						politicafactusAux.addAll(politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactusAux=new ArrayList<PoliticaFactu>();
							politicafactusAux.addAll(politicafactus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicafactuLogic.getPoliticaFactusFK_IdGrupoCliente(finalQueryGlobal,pagination,id_grupo_clienteFK_IdGrupoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaFactus("FK_IdGrupoCliente",politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaFactus("FK_IdGrupoCliente",politicafactus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuLogic.setPoliticaFactus(new ArrayList<PoliticaFactu>());
						politicafactuLogic.getPoliticaFactus().addAll(politicafactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactus=new ArrayList<PoliticaFactu>();
							politicafactus.addAll(politicafactusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicafactuLogic.getPoliticaFactusFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicafactuLogic.getPoliticaFactus()==null||politicafactuLogic.getPoliticaFactus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicafactus==null|| politicafactus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactusAux=new ArrayList<PoliticaFactu>();
						politicafactusAux.addAll(politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactusAux=new ArrayList<PoliticaFactu>();
							politicafactusAux.addAll(politicafactus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicafactuLogic.getPoliticaFactusFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaFactus("FK_IdProducto",politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaFactus("FK_IdProducto",politicafactus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuLogic.setPoliticaFactus(new ArrayList<PoliticaFactu>());
						politicafactuLogic.getPoliticaFactus().addAll(politicafactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactus=new ArrayList<PoliticaFactu>();
							politicafactus.addAll(politicafactusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicafactuLogic.getPoliticaFactusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicafactuLogic.getPoliticaFactus()==null||politicafactuLogic.getPoliticaFactus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicafactus==null|| politicafactus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactusAux=new ArrayList<PoliticaFactu>();
						politicafactusAux.addAll(politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactusAux=new ArrayList<PoliticaFactu>();
							politicafactusAux.addAll(politicafactus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicafactuLogic.getPoliticaFactusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaFactuConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaFactus("FK_IdSucursal",politicafactuLogic.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaFactus("FK_IdSucursal",politicafactus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuLogic.setPoliticaFactus(new ArrayList<PoliticaFactu>());
						politicafactuLogic.getPoliticaFactus().addAll(politicafactusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactus=new ArrayList<PoliticaFactu>();
							politicafactus.addAll(politicafactusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPoliticaFactu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPoliticaFactu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=politicafactuLogic.getPoliticaFactus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicafactus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=politicafactuLogic.getPoliticaFactus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicafactus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PoliticaFactu politicafactu) {
		Boolean permite=true;
		
		if(this.politicafactu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PoliticaFactuConstantesFunciones.getOrderByListaPoliticaFactu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PoliticaFactuConstantesFunciones.getOrderByListaPoliticaFactu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaFactu politicafactu:politicafactuLogic.getPoliticaFactus()) {
				if(politicafactu.getsType().equals(Constantes2.S_TOTALES)) {
					politicafactuTotales=politicafactu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaFactu politicafactu:this.politicafactus) {
				if(politicafactu.getsType().equals(Constantes2.S_TOTALES)) {
					politicafactuTotales=politicafactu;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.politicafactuAux=new PoliticaFactu();
			this.politicafactuAux.setsType(Constantes2.S_TOTALES);
			this.politicafactuAux.setIsNew(false);
			this.politicafactuAux.setIsChanged(false);
			this.politicafactuAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PoliticaFactuConstantesFunciones.TotalizarValoresFilaPoliticaFactu(this.politicafactuLogic.getPoliticaFactus(),this.politicafactuAux);
				
				this.politicafactuLogic.getPoliticaFactus().add(this.politicafactuAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PoliticaFactuConstantesFunciones.TotalizarValoresFilaPoliticaFactu(this.politicafactus,this.politicafactuAux);
				
				this.politicafactus.add(this.politicafactuAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		politicafactuTotales=new PoliticaFactu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.politicafactuLogic.getPoliticaFactus().remove(politicafactuTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.politicafactus.remove(politicafactuTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		politicafactuTotales=new PoliticaFactu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaFactu politicafactu:politicafactuLogic.getPoliticaFactus()) {
				if(politicafactu.getsType().equals(Constantes2.S_TOTALES)) {
					politicafactuTotales=politicafactu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PoliticaFactuConstantesFunciones.TotalizarValoresFilaPoliticaFactu(this.politicafactuLogic.getPoliticaFactus(),politicafactuTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaFactu politicafactu:this.politicafactus) {
				if(politicafactu.getsType().equals(Constantes2.S_TOTALES)) {
					politicafactuTotales=politicafactu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PoliticaFactuConstantesFunciones.TotalizarValoresFilaPoliticaFactu(this.politicafactus,politicafactuTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPoliticaFactusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPoliticaFactusFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPoliticaFactusFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPoliticaFactusFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPoliticaFactusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicafactuLogic.getPoliticaFactusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPoliticaFactusFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicafactuLogic.getPoliticaFactusFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPoliticaFactusFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicafactuLogic.getPoliticaFactusFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPoliticaFactusFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicafactuLogic.getPoliticaFactusFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosPoliticaFactu() {
		this.isPermisoTodoPoliticaFactu=false;
		this.isPermisoNuevoPoliticaFactu=false;
		this.isPermisoActualizarPoliticaFactu=false;
		this.isPermisoActualizarOriginalPoliticaFactu=false;
		this.isPermisoEliminarPoliticaFactu=false;
		this.isPermisoGuardarCambiosPoliticaFactu=false;
		this.isPermisoConsultaPoliticaFactu=false;
		this.isPermisoBusquedaPoliticaFactu=false;
		this.isPermisoReportePoliticaFactu=false;		
		this.isPermisoOrdenPoliticaFactu=false;		
		this.isPermisoPaginacionMedioPoliticaFactu=false;		
		this.isPermisoPaginacionAltoPoliticaFactu=false;
		this.isPermisoPaginacionTodoPoliticaFactu=false;
		this.isPermisoCopiarPoliticaFactu=false;		
		this.isPermisoVerFormPoliticaFactu=false;		
		this.isPermisoDuplicarPoliticaFactu=false;		
		this.isPermisoOrdenPoliticaFactu=false;		
	}
	
	public void setPermisosUsuarioPoliticaFactu(Boolean isPermiso) {
		this.isPermisoTodoPoliticaFactu=isPermiso;
		this.isPermisoNuevoPoliticaFactu=isPermiso;
		this.isPermisoActualizarPoliticaFactu=isPermiso;
		this.isPermisoActualizarOriginalPoliticaFactu=isPermiso;
		this.isPermisoEliminarPoliticaFactu=isPermiso;
		this.isPermisoGuardarCambiosPoliticaFactu=isPermiso;
		this.isPermisoConsultaPoliticaFactu=isPermiso;
		this.isPermisoBusquedaPoliticaFactu=isPermiso;
		this.isPermisoReportePoliticaFactu=isPermiso;
		this.isPermisoOrdenPoliticaFactu=isPermiso;		
		this.isPermisoPaginacionMedioPoliticaFactu=isPermiso;		
		this.isPermisoPaginacionAltoPoliticaFactu=isPermiso;		
		this.isPermisoPaginacionTodoPoliticaFactu=isPermiso;		
		this.isPermisoCopiarPoliticaFactu=isPermiso;		
		this.isPermisoVerFormPoliticaFactu=isPermiso;		
		this.isPermisoDuplicarPoliticaFactu=isPermiso;
		this.isPermisoOrdenPoliticaFactu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPoliticaFactu(Boolean isPermiso) {
		//this.isPermisoTodoPoliticaFactu=isPermiso;
		this.isPermisoNuevoPoliticaFactu=isPermiso;
		this.isPermisoActualizarPoliticaFactu=isPermiso;
		this.isPermisoActualizarOriginalPoliticaFactu=isPermiso;
		this.isPermisoEliminarPoliticaFactu=isPermiso;
		this.isPermisoGuardarCambiosPoliticaFactu=isPermiso;
		//this.isPermisoConsultaPoliticaFactu=isPermiso;
		//this.isPermisoBusquedaPoliticaFactu=isPermiso;
		//this.isPermisoReportePoliticaFactu=isPermiso;
		//this.isPermisoOrdenPoliticaFactu=isPermiso;		
		//this.isPermisoPaginacionMedioPoliticaFactu=isPermiso;		
		//this.isPermisoPaginacionAltoPoliticaFactu=isPermiso;		
		//this.isPermisoPaginacionTodoPoliticaFactu=isPermiso;		
		//this.isPermisoCopiarPoliticaFactu=isPermiso;		
		//this.isPermisoDuplicarPoliticaFactu=isPermiso;
		//this.isPermisoOrdenPoliticaFactu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPoliticaFactuClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PoliticaFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPoliticaFactu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPoliticaFactuClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPoliticaFactuClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPoliticaFactuClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPoliticaFactuClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPoliticaFactu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PoliticaFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PoliticaFactuConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPoliticaFactu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPoliticaFactu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPoliticaFactu=this.isPermisoActualizarPoliticaFactu;
			this.isPermisoEliminarPoliticaFactu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPoliticaFactu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPoliticaFactu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPoliticaFactu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPoliticaFactu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePoliticaFactu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPoliticaFactu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPoliticaFactu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPoliticaFactu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPoliticaFactu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPoliticaFactu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPoliticaFactu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPoliticaFactu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPoliticaFactu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPoliticaFactu.setToolTipText(this.jTableDatosPoliticaFactu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPoliticaFactu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPoliticaFactu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PoliticaFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(PoliticaFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioPoliticaFactu() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyPoliticaFactuListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPoliticaFactuListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PoliticaFactuJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPoliticaFactuListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPoliticaFactuListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PoliticaFactuParameterReturnGeneral politicafactuReturnGeneral=new PoliticaFactuParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.politicafactuConstantesFunciones.cargarid_empresaPoliticaFactu)
					 || (this.esRecargarFks && this.politicafactuConstantesFunciones.cargarid_empresaPoliticaFactu)) {

					if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+politicafactuSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.politicafactuConstantesFunciones.cargarid_sucursalPoliticaFactu)
					 || (this.esRecargarFks && this.politicafactuConstantesFunciones.cargarid_sucursalPoliticaFactu)) {

					if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+politicafactuSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.politicafactuConstantesFunciones.cargarid_productoPoliticaFactu)
					 || (this.esRecargarFks && this.politicafactuConstantesFunciones.cargarid_productoPoliticaFactu)) {

					if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+politicafactuSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalGrupoCliente="";

				if(((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0) && this.politicafactuConstantesFunciones.cargarid_grupo_clientePoliticaFactu)
					 || (this.esRecargarFks && this.politicafactuConstantesFunciones.cargarid_grupo_clientePoliticaFactu)) {

					if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrupoCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalGrupoCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalGrupoCliente, "");
						finalQueryGlobalGrupoCliente+=GrupoClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrupoCliente=" WHERE " + ConstantesSql.ID + "="+politicafactuSessionBean.getlidGrupoClienteActual();
					}
				} else {
					finalQueryGlobalGrupoCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				politicafactuReturnGeneral=politicafactuLogic.cargarCombosLoteForeignKeyPoliticaFactu(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalProducto,finalQueryGlobalGrupoCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=politicafactuReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=politicafactuReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=politicafactuReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalGrupoCliente.equals("NONE")) {
				this.grupoclientesForeignKey=politicafactuReturnGeneral.getgrupoclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPoliticaFactu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.politicafactuSessionBean==null) {
				this.politicafactuSessionBean=new PoliticaFactuSessionBean();
			}

			if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				Producto producto=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(producto,Constantes.SMENSAJE_ESCOJA_OPCION);
				producto.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productosForeignKey,producto,true)) {

					this.productosForeignKey.add(0,producto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {

			if(!this.politicafactuSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				GrupoCliente grupocliente=new GrupoCliente();
				GrupoClienteConstantesFunciones.setGrupoClienteDescripcion(grupocliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupocliente.setId(null);

				if(!GrupoClienteConstantesFunciones.ExisteEnLista(this.grupoclientesForeignKey,grupocliente,true)) {

					this.grupoclientesForeignKey.add(0,grupocliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPoliticaFactu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPoliticaFactu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPoliticaFactu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.politicafactu.setfecha_desde(this.parametroGeneralUsuario.getfecha_sistema());
				this.politicafactu.setfecha_hasta(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaFactu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPoliticaFactu(PoliticaFactu politicafactu)throws Exception {	
		try {
			
			this.setActualProductoForeignKey(politicafactu.getid_producto(),false,"Formulario");
			this.setActualGrupoClienteForeignKey(politicafactu.getid_grupo_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPoliticaFactu(PoliticaFactu politicafactu,String sTipoEvento)throws Exception {	
		try {
			
			

				if(politicafactu.getProducto()!=null && !sTipoEvento.equals("id_productoPoliticaFactu")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(politicafactu.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPoliticaFactu()throws Exception {	
		try {
			
			this.setActualProductoForeignKey(this.politicafactuConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualGrupoClienteForeignKey(this.politicafactuConstantesFunciones.getid_grupo_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaFactu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPoliticaFactu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPoliticaFactu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPoliticaFactu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPoliticaFactu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPoliticaFactu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPoliticaFactu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public PoliticaFactuBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PoliticaFactuBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PoliticaFactuBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.politicafactuSessionBean=new PoliticaFactuSessionBean(); 
		this.politicafactuConstantesFunciones=new PoliticaFactuConstantesFunciones(); 
		this.politicafactuBean=new PoliticaFactu();//(this.politicafactuConstantesFunciones); 		
		this.politicafactuReturnGeneral=new PoliticaFactuParameterReturnGeneral(); 
		
		this.politicafactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicafactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PoliticaFactuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PoliticaFactuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PoliticaFactuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPoliticaFactu(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.politicafactuConstantesFunciones=new PoliticaFactuConstantesFunciones(); 
			this.politicafactuBean=new PoliticaFactu();//this.politicafactuConstantesFunciones); 			
			this.politicafactuReturnGeneral=new PoliticaFactuParameterReturnGeneral(); 
		
			PoliticaFactuBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Politica Factu Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.politicafactu=new PoliticaFactu();
			this.politicafactus = new ArrayList<PoliticaFactu>();
			this.politicafactusAux = new ArrayList<PoliticaFactu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic=new PoliticaFactuLogic();
				this.politicafactuLogic.getNewConnexionToDeep("");
			}
			
			//this.politicafactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.politicafactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPoliticaFactu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPoliticaFactu);	
					}
					
					if(this.jInternalFrameImportacionPoliticaFactu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPoliticaFactu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPoliticaFactu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPoliticaFactu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPoliticaFactu);
				this.jInternalFrameDetalleFormPoliticaFactu.setVisible(false);
				this.jInternalFrameDetalleFormPoliticaFactu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPoliticaFactu);
					this.jInternalFrameReporteDinamicoPoliticaFactu.setVisible(false);
					this.jInternalFrameReporteDinamicoPoliticaFactu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPoliticaFactu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPoliticaFactu);
					this.jInternalFrameImportacionPoliticaFactu.setVisible(false);
					this.jInternalFrameImportacionPoliticaFactu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPoliticaFactu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPoliticaFactu);
					this.jInternalFrameOrderByPoliticaFactu.setVisible(false);
					this.jInternalFrameOrderByPoliticaFactu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPoliticaFactuActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PoliticaFactuConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.politicafactuReturnGeneral=new PoliticaFactuParameterReturnGeneral();
			
			this.politicafactuParameterGeneral=new PoliticaFactuParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.politicafactuLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(PoliticaFactuJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PoliticaFactuConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.politicafactuSessionBean.getEsGuardarRelacionado(),this.politicafactuSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PoliticaFactuConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.politicafactuSessionBean.getEsGuardarRelacionado(),this.politicafactuSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoPoliticaFactu=false;
			this.isVisibilidadCeldaDuplicarPoliticaFactu=true;
			this.isVisibilidadCeldaCopiarPoliticaFactu=true;
			this.isVisibilidadCeldaVerFormPoliticaFactu=true;
			this.isVisibilidadCeldaOrdenPoliticaFactu=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
			this.isVisibilidadCeldaModificarPoliticaFactu=false;
			this.isVisibilidadCeldaActualizarPoliticaFactu=false;
			this.isVisibilidadCeldaEliminarPoliticaFactu=false;
			this.isVisibilidadCeldaCancelarPoliticaFactu=false;
			this.isVisibilidadCeldaGuardarPoliticaFactu=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPoliticaFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPoliticaFactu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPoliticaFactu(false);
			
			this.setPermisosUsuarioPoliticaFactu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicafactuSessionBean.getEsGuardarRelacionado() 
				|| (this.politicafactuSessionBean.getEsGuardarRelacionado() && this.politicafactuSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPoliticaFactuClasesRelacionadas();
			}
			
			if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPoliticaFactuClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPoliticaFactu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPoliticaFactu();
			}
			
			if(!this.isPermisoBusquedaPoliticaFactu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPoliticaFactu,this.isPermisoPaginacionMedioPoliticaFactu,this.isPermisoPaginacionTodoPoliticaFactu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PoliticaFactuConstantesFunciones.getTiposSeleccionarPoliticaFactu());
				
				this.tiposColumnasSelect=PoliticaFactuConstantesFunciones.getTiposSeleccionarPoliticaFactu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPoliticaFactu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPoliticaFactu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPoliticaFactu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaFactu() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.productoLogic=new ProductoLogic();
			this.grupoclienteLogic=new GrupoClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				politicafactuImplementable= (PoliticaFactuImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PoliticaFactuConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				politicafactuImplementableHome= (PoliticaFactuImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PoliticaFactuConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.politicafactus= new ArrayList<PoliticaFactu>();
			this.politicafactusEliminados= new ArrayList<PoliticaFactu>();
						
			this.isEsNuevoPoliticaFactu=false;
			this.esParaAccionDesdeFormularioPoliticaFactu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPoliticaFactu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPoliticaFactu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PoliticaFactuBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PoliticaFactuConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPoliticaFactu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPoliticaFactu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPoliticaFactu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPoliticaFactu();
			}
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPoliticaFactu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPoliticaFactu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPoliticaFactu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPoliticaFactu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PoliticaFactu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPoliticaFactu() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPoliticaFactu")) {
				iIndex=this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPoliticaFactu();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyPoliticaFactu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPoliticaFactu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPoliticaFactu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPoliticaFactuListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPoliticaFactu();
		
		this.cargarCombosFrameForeignKeyPoliticaFactu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPoliticaFactu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPoliticaFactu();
		}
	}
	
	

	public void cargarCombosForeignKeyProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoCliente(this.grupoclientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPoliticaFactuActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			
			if(jTableDatosPoliticaFactu.getRowCount()>=1) {
				jTableDatosPoliticaFactu.removeRowSelectionInterval(0, jTableDatosPoliticaFactu.getRowCount()-1);						
			}
			
			this.isEsNuevoPoliticaFactu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPoliticaFactu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPoliticaFactu(true);			
			//this.politicafactu=new PoliticaFactu();
			//this.politicafactu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaFactu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaFactu() ;
			
			if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaFactu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.politicafactu);	
			this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);				
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PoliticaFactu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPoliticaFactuActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPoliticaFactu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPoliticaFactu.getSelectedRows().length;			
			}
			
			politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPoliticaFactu--;			
				//PoliticaFactu politicafactuAux= new PoliticaFactu();			
				//politicafactuAux.setId(this.iIdNuevoPoliticaFactu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PoliticaFactu politicafactuOrigen=new PoliticaFactu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PoliticaFactu politicafactuOrigen : politicafactusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							politicafactuOrigen =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicafactuOrigen =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPoliticaFactu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.politicafactu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPoliticaFactu(politicafactuOrigen,this.politicafactu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.politicafactuLogic.getPoliticaFactus().add(this.politicafactuAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.politicafactus.add(this.politicafactuAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPoliticaFactu(false);
				
				this.jTableDatosPoliticaFactu.setRowSelectionInterval(this.getIndiceNuevoPoliticaFactu(), this.getIndiceNuevoPoliticaFactu());
				
				int iLastRow =  this.jTableDatosPoliticaFactu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPoliticaFactu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPoliticaFactu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaFactu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();									
		
			PoliticaFactu politicafactuOrigen=new PoliticaFactu();
			PoliticaFactu politicafactuDestino=new PoliticaFactu();
				
			politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPoliticaFactu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || politicafactusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPoliticaFactu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuOrigen =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						politicafactuOrigen =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicafactuDestino =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						politicafactuDestino =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				politicafactuOrigen =politicafactusSeleccionados.get(0);
				politicafactuDestino =politicafactusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPoliticaFactu(politicafactuOrigen,politicafactuDestino,true,false);
				
				politicafactuDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(politicafactuDestino,politicafactuLogic.getPoliticaFactus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicafactuDestino,politicafactus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPoliticaFactu(false);
				
				//this.jTableDatosPoliticaFactu.setRowSelectionInterval(this.getIndiceNuevoPoliticaFactu(), this.getIndiceNuevoPoliticaFactu());
				
				int iLastRow =  this.jTableDatosPoliticaFactu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPoliticaFactu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPoliticaFactu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaFactu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPoliticaFactu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPoliticaFactu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPoliticaFactu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPoliticaFactu.setVisible(!isVisible);
			this.jPanelPaginacionPoliticaFactu.setVisible(!isVisible);
			this.jPanelAccionesPoliticaFactu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePoliticaFactu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPoliticaFactu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPoliticaFactu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPoliticaFactu();
			
			this.abrirFrameOrderByPoliticaFactu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPoliticaFactu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePoliticaFactu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPoliticaFactu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPoliticaFactu.isMaximum()) {
					this.jInternalFrameDetalleFormPoliticaFactu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPoliticaFactu.setSize(this.jInternalFrameDetalleFormPoliticaFactu.iWidthFormulario,this.jInternalFrameDetalleFormPoliticaFactu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPoliticaFactu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPoliticaFactu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPoliticaFactu.isMaximum()) {
						this.jInternalFrameDetalleFormPoliticaFactu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPoliticaFactu.jContentPaneDetallePoliticaFactu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPoliticaFactu.jContentPaneDetallePoliticaFactu.getWidth(),PoliticaFactuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPoliticaFactu.jContentPaneDetallePoliticaFactu.getWidth(),PoliticaFactuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPoliticaFactu.jContentPaneDetallePoliticaFactu.getWidth(),PoliticaFactuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPoliticaFactu.setVisible(true);
	        this.jInternalFrameDetalleFormPoliticaFactu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPoliticaFactu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPoliticaFactu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPoliticaFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaFactu,false,this);
				} else {
					this.jInternalFrameOrderByPoliticaFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaFactu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPoliticaFactu);
				this.jInternalFrameOrderByPoliticaFactu.setVisible(false);
				this.jInternalFrameOrderByPoliticaFactu.setSelected(false);
				
				this.jInternalFrameOrderByPoliticaFactu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPoliticaFactu"));
				
				this.inicializarActualizarBindingTablaOrderByPoliticaFactu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPoliticaFactu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPoliticaFactu==null) {
				
				this.jInternalFrameImportacionPoliticaFactu=new ImportacionJInternalFrame(PoliticaFactuConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPoliticaFactu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPoliticaFactu);
				this.jInternalFrameImportacionPoliticaFactu.setVisible(false);
				this.jInternalFrameImportacionPoliticaFactu.setSelected(false);


				this.jInternalFrameImportacionPoliticaFactu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPoliticaFactu"));
				this.jInternalFrameImportacionPoliticaFactu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPoliticaFactu"));
				this.jInternalFrameImportacionPoliticaFactu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPoliticaFactu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPoliticaFactu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPoliticaFactu==null) {
				this.jInternalFrameReporteDinamicoPoliticaFactu=new ReporteDinamicoJInternalFrame(PoliticaFactuConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPoliticaFactu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPoliticaFactu);
				this.jInternalFrameReporteDinamicoPoliticaFactu.setVisible(false);
				this.jInternalFrameReporteDinamicoPoliticaFactu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPoliticaFactu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaFactu"));
				this.jInternalFrameReporteDinamicoPoliticaFactu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaFactu"));
				this.jInternalFrameReporteDinamicoPoliticaFactu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaFactu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaFactu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePoliticaFactu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPoliticaFactu);
			
	       	this.jInternalFrameDetalleFormPoliticaFactu.setVisible(false);
	        this.jInternalFrameDetalleFormPoliticaFactu.setSelected(false);
			
			//this.jInternalFrameDetalleFormPoliticaFactu.dispose();
			//this.jInternalFrameDetalleFormPoliticaFactu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPoliticaFactu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPoliticaFactu.setVisible(true);
	        this.jInternalFrameReporteDinamicoPoliticaFactu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPoliticaFactu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPoliticaFactu.setVisible(true);
	        this.jInternalFrameImportacionPoliticaFactu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPoliticaFactu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPoliticaFactu.setVisible(true);
	        this.jInternalFrameOrderByPoliticaFactu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPoliticaFactu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPoliticaFactu.setVisible(false);
	        this.jInternalFrameOrderByPoliticaFactu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPoliticaFactu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPoliticaFactu.setVisible(false);
	        this.jInternalFrameReporteDinamicoPoliticaFactu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPoliticaFactu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPoliticaFactu.setVisible(false);
	        this.jInternalFrameImportacionPoliticaFactu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPoliticaFactu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPoliticaFactu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPoliticaFactu(true);
			//this.isEsNuevoPoliticaFactu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPoliticaFactu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaFactu(false) ;
			
			if(politicafactuSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaFactu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaFactu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPoliticaFactuActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPoliticaFactu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPoliticaFactu(true);
			//this.isEsNuevoPoliticaFactu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.politicafactu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPoliticaFactu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPoliticaFactu(false) ;
			
			if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaFactu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaFactu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.politicafactuConstantesFunciones.cargarid_productoPoliticaFactu) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPoliticaFactu(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPoliticaFactu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaGrupoCliente(List<GrupoCliente> grupoclientesForeignKey)throws Exception{
		TableColumn tableColumnGrupoCliente=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPoliticaFactu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPoliticaFactu(false);
			
			//if(!this.isEsNuevoPoliticaFactu) {								
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				
			}
			
			if(this.permiteMantenimiento(this.politicafactu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPoliticaFactu=true;
					this.inicializarActualizarBindingTablaPoliticaFactu(false);
					this.isEsNuevoPoliticaFactu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPoliticaFactu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPoliticaFactu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPoliticaFactu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaFactu(false);
				
				this.habilitarDeshabilitarControlesPoliticaFactu(false);
			
												
				
				if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePoliticaFactu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPoliticaFactuActionPerformed(evt,politicafactuSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPoliticaFactu(this.politicafactu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPoliticaFactu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,politicafactuSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.politicafactu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				this.politicafactu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				this.politicafactu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.politicafactu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PoliticaFactuModel) this.jTableDatosPoliticaFactu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPoliticaFactu=true;
				this.inicializarActualizarBindingTablaPoliticaFactu(false);
				this.isEsNuevoPoliticaFactu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPoliticaFactu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaFactu(false);
				
				this.habilitarDeshabilitarControlesPoliticaFactu(false);
				
				
				
				if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePoliticaFactu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPoliticaFactu.getRowCount()>=1) {
				jTableDatosPoliticaFactu.removeRowSelectionInterval(0, jTableDatosPoliticaFactu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPoliticaFactu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPoliticaFactu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaFactu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaFactu(false) ;
			
			this.isEsNuevoPoliticaFactu=false;
			
			if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePoliticaFactu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPoliticaFactu(false);
				
				//SI ES MANUAL
				if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPoliticaFactu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPoliticaFactu--;			
			//PoliticaFactu politicafactuAux= new PoliticaFactu();			
			//politicafactuAux.setId(this.iIdNuevoPoliticaFactu);
			
			if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPoliticaFactu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
			
			this.politicafactu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.politicafactuLogic.getPoliticaFactus().add(this.politicafactuAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.politicafactus.add(this.politicafactuAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPoliticaFactu(false);
			
			this.jTableDatosPoliticaFactu.setRowSelectionInterval(this.getIndiceNuevoPoliticaFactu(), this.getIndiceNuevoPoliticaFactu());
			
			int iLastRow =  this.jTableDatosPoliticaFactu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPoliticaFactu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPoliticaFactu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPoliticaFactu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPoliticaFactu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaFactu(false);
			
			//SI ES MANUAL
			if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaFactu();
			}
			
			//this.abrirFrameTreePoliticaFactu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Politica FactuS ?", "MANTENIMIENTO DE Politica Factu", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPoliticaFactu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPoliticaFactu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.politicafactuReturnGeneral=politicafactuLogic.procesarImportacionPoliticaFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.politicafactuParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPoliticaFactuReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPoliticaFactu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPoliticaFactu.setFileImportacion(this.jInternalFrameImportacionPoliticaFactu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPoliticaFactu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPoliticaFactu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPoliticaFactu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPoliticaFactu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		

		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PoliticaFactuBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PoliticaFactuBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReportePoliticaFactus("Todos",politicafactusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHADESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaDesde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaDesde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaDesde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaDesde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaHasta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaHasta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaHasta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaHasta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nBancoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nBancoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nBancoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nBancoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nBancoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nBancoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nBancoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nBancoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaFactuConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoPoliticaFactu.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					sNombreCampoCategoria="id_grupo_cliente";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHADESDE:
					sNombreCampoCategoria="fecha_desde";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA:
					sNombreCampoCategoria="fecha_hasta";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE:
					sNombreCampoCategoria="con_banco_cliente";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO:
					sNombreCampoCategoria="con_banco_producto";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="es_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					sNombreCampoCategoriaValor="id_grupo_cliente";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHADESDE:
					sNombreCampoCategoriaValor="fecha_desde";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA:
					sNombreCampoCategoriaValor="fecha_hasta";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE:
					sNombreCampoCategoriaValor="con_banco_cliente";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO:
					sNombreCampoCategoriaValor="con_banco_producto";
					break;

				case PoliticaFactuConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="es_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_grupo_cliente");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHADESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_desde");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_hasta");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Banco Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_banco_cliente");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Banco Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_banco_producto");
					break;

				case PoliticaFactuConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_activo");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicafactu";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("PoliticaFactus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getcon_banco_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getcon_banco_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaFactuConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(PoliticaFactu politicafactu:politicafactusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicafactu.getes_activo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelPoliticaFactu(row);				
			//	iRow++;
			//}				
			
			//for(PoliticaFactu politicafactuAux:politicafactusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPoliticaFactu(politicafactuAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaFactu(false);
			
			//SI ES MANUAL
			if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaFactu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaFactu(false);
			
			//SI ES MANUAL
			if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPoliticaFactu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaFactu(false);
			
			//SI ES MANUAL
			if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPoliticaFactu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPoliticaFactu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPoliticaFactu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPoliticaFactu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPoliticaFactu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPoliticaFactu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPoliticaFactu.setMinimumSize(dimensionMinimum);
		this.jTableDatosPoliticaFactu.setMaximumSize(dimensionMaximum);
		this.jTableDatosPoliticaFactu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPoliticaFactu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPoliticaFactu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPoliticaFactu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPoliticaFactu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPoliticaFactu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPoliticaFactu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaFactu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPoliticaFactu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPoliticaFactu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPoliticaFactu();
		
		this.inicializarActualizarBindingBotonesManualPoliticaFactu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPoliticaFactu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaFactu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaFactu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaFactu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPoliticaFactu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPoliticaFactu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePoliticaFactu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxPostAccionNuevoPoliticaFactu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxPostAccionSinCerrarPoliticaFactu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxPostAccionSinMensajePoliticaFactu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPoliticaFactu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPoliticaFactu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePoliticaFactu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
				this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxPostAccionNuevoPoliticaFactu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxPostAccionSinCerrarPoliticaFactu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxPostAccionSinMensajePoliticaFactu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPoliticaFactu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPoliticaFactu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPoliticaFactu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPoliticaFactu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPoliticaFactu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPoliticaFactu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPoliticaFactu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPoliticaFactu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPoliticaFactu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPoliticaFactu(Boolean esInicializar) throws Exception {
		try	{	
			if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaFactu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaFactu() throws Exception {
		try	{
			if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPoliticaFactu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePoliticaFactu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPoliticaFactu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPoliticaFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPoliticaFactu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPoliticaFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPoliticaFactu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPoliticaFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPoliticaFactu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPoliticaFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPoliticaFactu.addItem(reporte);
			}
			
			
			if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPoliticaFactu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPoliticaFactu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPoliticaFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPoliticaFactu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPoliticaFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPoliticaFactu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPoliticaFactu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPoliticaFactu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPoliticaFactu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaFactu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaFactu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
				this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
				this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
				
				if(this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPoliticaFactu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PoliticaFactuConstantesFunciones.getTiposSeleccionarPoliticaFactu(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PoliticaFactuConstantesFunciones.getTiposSeleccionarPoliticaFactu(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PoliticaFactuConstantesFunciones.getTiposSeleccionarPoliticaFactu(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPoliticaFactu.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPoliticaFactu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.getSelectedItem()!=null){this.id_grupo_clienteFK_IdGrupoCliente=((GrupoCliente)this.jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoPoliticaFactu.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoPoliticaFactu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPoliticaFactu(Boolean esInicializar) throws Exception {				
		if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPoliticaFactu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPoliticaFactu() throws Exception {
		this.inicializarActualizarBindingTablaPoliticaFactu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPoliticaFactu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPoliticaFactuOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactuOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPoliticaFactu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=politicafactuLogic.getPoliticaFactus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=politicafactus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPoliticaFactu.setModel(new PoliticaFactuModel(this.politicafactuLogic.getPoliticaFactus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPoliticaFactu.setModel(new PoliticaFactuModel(this.politicafactus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPoliticaFactu!=null && this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPoliticaFactu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO,politicafactuConstantesFunciones.resaltarSeleccionarPoliticaFactu,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO,politicafactuConstantesFunciones.resaltarSeleccionarPoliticaFactu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_ID));

		if(this.politicafactuConstantesFunciones.mostraridPoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.politicafactuConstantesFunciones.resaltaridPoliticaFactu,this.politicafactuConstantesFunciones.activaridPoliticaFactu,iSizeTabla,this,true,"idPoliticaFactu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.politicafactuConstantesFunciones.resaltaridPoliticaFactu,this.politicafactuConstantesFunciones.activaridPoliticaFactu,this,true,"idPoliticaFactu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA));

		if(this.politicafactuConstantesFunciones.mostrarid_empresaPoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.politicafactuConstantesFunciones.resaltarid_empresaPoliticaFactu,this,this.politicafactuConstantesFunciones.activarid_empresaPoliticaFactu,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.politicafactuConstantesFunciones.resaltarid_empresaPoliticaFactu,this,this.politicafactuConstantesFunciones.activarid_empresaPoliticaFactu,false,"id_empresaPoliticaFactu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.politicafactuConstantesFunciones.mostrarid_sucursalPoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.politicafactuConstantesFunciones.resaltarid_sucursalPoliticaFactu,this,this.politicafactuConstantesFunciones.activarid_sucursalPoliticaFactu,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.politicafactuConstantesFunciones.resaltarid_sucursalPoliticaFactu,this,this.politicafactuConstantesFunciones.activarid_sucursalPoliticaFactu,false,"id_sucursalPoliticaFactu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.politicafactuConstantesFunciones.mostrarid_productoPoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.politicafactuConstantesFunciones.resaltarid_productoPoliticaFactu,this,this.politicafactuConstantesFunciones.activarid_productoPoliticaFactu,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.politicafactuConstantesFunciones.resaltarid_productoPoliticaFactu,this,this.politicafactuConstantesFunciones.activarid_productoPoliticaFactu,true,"id_productoPoliticaFactu","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE));

		if(this.politicafactuConstantesFunciones.mostrarid_grupo_clientePoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new GrupoClienteTableCell(this.grupoclientesForeignKey,this.politicafactuConstantesFunciones.resaltarid_grupo_clientePoliticaFactu,this,this.politicafactuConstantesFunciones.activarid_grupo_clientePoliticaFactu,iSizeTabla));
			tableColumn.setCellEditor(new GrupoClienteTableCell(this.grupoclientesForeignKey,this.politicafactuConstantesFunciones.resaltarid_grupo_clientePoliticaFactu,this,this.politicafactuConstantesFunciones.activarid_grupo_clientePoliticaFactu,true,"id_grupo_clientePoliticaFactu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_NOMBRE));

		if(this.politicafactuConstantesFunciones.mostrarnombrePoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.politicafactuConstantesFunciones.resaltarnombrePoliticaFactu,this.politicafactuConstantesFunciones.activarnombrePoliticaFactu,iSizeTabla,this,true,"nombrePoliticaFactu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.politicafactuConstantesFunciones.resaltarnombrePoliticaFactu,this.politicafactuConstantesFunciones.activarnombrePoliticaFactu,this,true,"nombrePoliticaFactu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_FECHADESDE));

		if(this.politicafactuConstantesFunciones.mostrarfecha_desdePoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_FECHADESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.politicafactuConstantesFunciones.resaltarfecha_desdePoliticaFactu,this.politicafactuConstantesFunciones.activarfecha_desdePoliticaFactu,iSizeTabla,this,true,"fecha_desdePoliticaFactu","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.politicafactuConstantesFunciones.resaltarfecha_desdePoliticaFactu,this.politicafactuConstantesFunciones.activarfecha_desdePoliticaFactu,this,true,"fecha_desdePoliticaFactu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA));

		if(this.politicafactuConstantesFunciones.mostrarfecha_hastaPoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.politicafactuConstantesFunciones.resaltarfecha_hastaPoliticaFactu,this.politicafactuConstantesFunciones.activarfecha_hastaPoliticaFactu,iSizeTabla,this,true,"fecha_hastaPoliticaFactu","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.politicafactuConstantesFunciones.resaltarfecha_hastaPoliticaFactu,this.politicafactuConstantesFunciones.activarfecha_hastaPoliticaFactu,this,true,"fecha_hastaPoliticaFactu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE));

		if(this.politicafactuConstantesFunciones.mostrarporcentajePoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.politicafactuConstantesFunciones.resaltarporcentajePoliticaFactu,this.politicafactuConstantesFunciones.activarporcentajePoliticaFactu,iSizeTabla,this,true,"porcentajePoliticaFactu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.politicafactuConstantesFunciones.resaltarporcentajePoliticaFactu,this.politicafactuConstantesFunciones.activarporcentajePoliticaFactu,this,true,"porcentajePoliticaFactu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_VALOR));

		if(this.politicafactuConstantesFunciones.mostrarvalorPoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.politicafactuConstantesFunciones.resaltarvalorPoliticaFactu,this.politicafactuConstantesFunciones.activarvalorPoliticaFactu,iSizeTabla,this,true,"valorPoliticaFactu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.politicafactuConstantesFunciones.resaltarvalorPoliticaFactu,this.politicafactuConstantesFunciones.activarvalorPoliticaFactu,this,true,"valorPoliticaFactu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE));

		if(this.politicafactuConstantesFunciones.mostrarcon_banco_clientePoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.politicafactuConstantesFunciones.resaltarcon_banco_clientePoliticaFactu,this.politicafactuConstantesFunciones.activarcon_banco_clientePoliticaFactu,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.politicafactuConstantesFunciones.resaltarcon_banco_clientePoliticaFactu,this.politicafactuConstantesFunciones.activarcon_banco_clientePoliticaFactu,this,true,"con_banco_clientePoliticaFactu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO));

		if(this.politicafactuConstantesFunciones.mostrarcon_banco_productoPoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.politicafactuConstantesFunciones.resaltarcon_banco_productoPoliticaFactu,this.politicafactuConstantesFunciones.activarcon_banco_productoPoliticaFactu,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.politicafactuConstantesFunciones.resaltarcon_banco_productoPoliticaFactu,this.politicafactuConstantesFunciones.activarcon_banco_productoPoliticaFactu,this,true,"con_banco_productoPoliticaFactu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,PoliticaFactuConstantesFunciones.LABEL_ESACTIVO));

		if(this.politicafactuConstantesFunciones.mostrares_activoPoliticaFactu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaFactuConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.politicafactuConstantesFunciones.resaltares_activoPoliticaFactu,this.politicafactuConstantesFunciones.activares_activoPoliticaFactu,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.politicafactuConstantesFunciones.resaltares_activoPoliticaFactu,this.politicafactuConstantesFunciones.activares_activoPoliticaFactu,this,true,"es_activoPoliticaFactu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PoliticaFactuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.politicafactuSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.politicafactuSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPoliticaFactu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.politicafactuSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.politicafactuSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPoliticaFactu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.politicafactuSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.politicafactuSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPoliticaFactu.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosPoliticaFactu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPoliticaFactu.moveColumn(this.jTableDatosPoliticaFactu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPoliticaFactu.moveColumn(this.jTableDatosPoliticaFactu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPoliticaFactu.moveColumn(this.jTableDatosPoliticaFactu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPoliticaFactu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPoliticaFactu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPoliticaFactu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPoliticaFactu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPoliticaFactu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPoliticaFactu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPoliticaFactu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPoliticaFactu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=politicafactuLogic.getPoliticaFactus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=politicafactus.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosPoliticaFactu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPoliticaFactu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPoliticaFactu();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoPoliticaFactu=false;
					
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
				if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPoliticaFactu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPoliticaFactu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPoliticaFactu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.politicafactu.getsType().equals("DUPLICADO")
				   || this.politicafactu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPoliticaFactu=true;
				
				} else {
					this.isEsNuevoPoliticaFactu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
					if(this.politicafactu.getId()>=0 && !this.politicafactu.getIsNew()) {						
						this.isEsNuevoPoliticaFactu=false;
						
					} else {
						this.isEsNuevoPoliticaFactu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPoliticaFactu(esRelaciones);						
				
				this.seleccionarPoliticaFactu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.politicafactu.getId()<0) {
					this.isEsNuevoPoliticaFactu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPoliticaFactu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPoliticaFactu(evt,rowIndex);
				}	
				
				if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PoliticaFactu: " + this.dDif); 
					}
				}								
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPoliticaFactu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.politicafactu)) {
					if(this.politicafactu.getId()>0) {
						this.politicafactu.setIsDeleted(true);
						
						this.politicafactusEliminados.add(this.politicafactu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.politicafactuLogic.getPoliticaFactus().remove(this.politicafactu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.politicafactus.remove(this.politicafactu);				
					}
					
					
					((PoliticaFactuModel) this.jTableDatosPoliticaFactu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaFactu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPoliticaFactu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPoliticaFactu) {
			
			if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPoliticaFactu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPoliticaFactu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPoliticaFactu(this.politicafactu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.politicafactuConstantesFunciones.cargarid_empresaPoliticaFactu || this.politicafactuConstantesFunciones.event_dependid_empresaPoliticaFactu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.politicafactu.getid_empresa());
									//this.inicializarActualizarBindingPoliticaFactu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(politicafactu.getEmpresa()!=null) {
							this.empresasForeignKey.add(politicafactu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.politicafactu.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.politicafactuConstantesFunciones.cargarid_sucursalPoliticaFactu || this.politicafactuConstantesFunciones.event_dependid_sucursalPoliticaFactu) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.politicafactu.getid_sucursal());
									//this.inicializarActualizarBindingPoliticaFactu(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(politicafactu.getSucursal()!=null) {
							this.sucursalsForeignKey.add(politicafactu.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.politicafactu.getid_sucursal(),false,"Formulario");

					//Producto
					if(!this.politicafactuConstantesFunciones.cargarid_productoPoliticaFactu || this.politicafactuConstantesFunciones.event_dependid_productoPoliticaFactu) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.politicafactu.getid_producto());
									//this.inicializarActualizarBindingPoliticaFactu(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(politicafactu.getProducto()!=null) {
							this.productosForeignKey.add(politicafactu.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.politicafactu.getid_producto(),false,"Formulario");

					//GrupoCliente
					if(!this.politicafactuConstantesFunciones.cargarid_grupo_clientePoliticaFactu || this.politicafactuConstantesFunciones.event_dependid_grupo_clientePoliticaFactu) {
						//this.cargarCombosGrupoClientesForeignKeyLista(" where id="+this.politicafactu.getid_grupo_cliente());
									//this.inicializarActualizarBindingPoliticaFactu(false,false);
						this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

						if(politicafactu.getGrupoCliente()!=null) {
							this.grupoclientesForeignKey.add(politicafactu.getGrupoCliente());
						}

						this.addItemDefectoCombosForeignKeyGrupoCliente();
						this.cargarCombosFrameGrupoClientesForeignKey("Todos");
					}
					this.setActualGrupoClienteForeignKey(this.politicafactu.getid_grupo_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPoliticaFactu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPoliticaFactu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaFactu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPoliticaFactu(PoliticaFactu politicafactu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPoliticaFactu(politicafactu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPoliticaFactu(PoliticaFactu politicafactu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPoliticaFactu(politicafactu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPoliticaFactu(politicafactu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPoliticaFactu(politicafactu);
	}
	
	public void setVariablesObjetoActualToFormularioPoliticaFactu(PoliticaFactu politicafactu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.setText(politicafactu.getId().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextAreanombrePoliticaFactu.setText(politicafactu.getnombre());
			this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_desdePoliticaFactu.setDate(politicafactu.getfecha_desde());
			this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_hastaPoliticaFactu.setDate(politicafactu.getfecha_hasta());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldporcentajePoliticaFactu.setText(politicafactu.getporcentaje().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldvalorPoliticaFactu.setText(politicafactu.getvalor().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.setSelected(politicafactu.getcon_banco_cliente());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.setSelected(politicafactu.getcon_banco_producto());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.setSelected(politicafactu.getes_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PoliticaFactu politicafactuLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,politicafactuLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PoliticaFactu politicafactuLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				politicafactuLocal=this.politicafactu;
			} else {
				politicafactuLocal=this.politicafactuAnterior;
			}
		}
		
		if(this.permiteMantenimiento(politicafactuLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPoliticaFactu(politicafactuLocal,true);
					
					if(politicafactuSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(politicafactuLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(politicafactuLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPoliticaFactu(PoliticaFactu politicafactu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPoliticaFactu(politicafactu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(politicafactu);
	}
	
	public void setVariablesFormularioToObjetoActualPoliticaFactu(PoliticaFactu politicafactu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPoliticaFactu(politicafactu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPoliticaFactu(PoliticaFactu politicafactu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.getText()==null || this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.getText()=="" || this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.getText()=="Id") {
				this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.setText("0");
			}

			if(conColumnasBase) {politicafactu.setId(Long.parseLong(this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelIdPoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			politicafactu.setnombre(this.jInternalFrameDetalleFormPoliticaFactu.jTextAreanombrePoliticaFactu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelnombrePoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			politicafactu.setfecha_desde(this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_desdePoliticaFactu.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_FECHADESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelfecha_desdePoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			politicafactu.setfecha_hasta(this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_hastaPoliticaFactu.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelfecha_hastaPoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			politicafactu.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldporcentajePoliticaFactu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelporcentajePoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			politicafactu.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldvalorPoliticaFactu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelvalorPoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			politicafactu.setcon_banco_cliente(this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelcon_banco_clientePoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			politicafactu.setcon_banco_producto(this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabelcon_banco_productoPoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			politicafactu.setes_activo(this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaFactuConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaFactu.jLabeles_activoPoliticaFactu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPoliticaFactu(PoliticaFactu politicafactuBean,PoliticaFactu politicafactu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && politicafactuBean.getid_producto()!=null && !politicafactuBean.getid_producto().equals(-1L))) {politicafactu.setid_producto(politicafactuBean.getid_producto());}
			if(conDefault || (!conDefault && politicafactuBean.getid_grupo_cliente()!=null && !politicafactuBean.getid_grupo_cliente().equals(-1L))) {politicafactu.setid_grupo_cliente(politicafactuBean.getid_grupo_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPoliticaFactu(PoliticaFactu politicafactuOrigen,PoliticaFactu politicafactu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && politicafactuOrigen.getId()!=null && !politicafactuOrigen.getId().equals(0L))) {politicafactu.setId(politicafactuOrigen.getId());}}
			if(conDefault || (!conDefault && politicafactuOrigen.getid_producto()!=null && !politicafactuOrigen.getid_producto().equals(-1L))) {politicafactu.setid_producto(politicafactuOrigen.getid_producto());}
			if(conDefault || (!conDefault && politicafactuOrigen.getid_grupo_cliente()!=null && !politicafactuOrigen.getid_grupo_cliente().equals(-1L))) {politicafactu.setid_grupo_cliente(politicafactuOrigen.getid_grupo_cliente());}
			if(conDefault || (!conDefault && politicafactuOrigen.getnombre()!=null && !politicafactuOrigen.getnombre().equals(""))) {politicafactu.setnombre(politicafactuOrigen.getnombre());}
			if(conDefault || (!conDefault && politicafactuOrigen.getfecha_desde()!=null && !politicafactuOrigen.getfecha_desde().equals(new Date()))) {politicafactu.setfecha_desde(politicafactuOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && politicafactuOrigen.getfecha_hasta()!=null && !politicafactuOrigen.getfecha_hasta().equals(new Date()))) {politicafactu.setfecha_hasta(politicafactuOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && politicafactuOrigen.getporcentaje()!=null && !politicafactuOrigen.getporcentaje().equals(0.0))) {politicafactu.setporcentaje(politicafactuOrigen.getporcentaje());}
			if(conDefault || (!conDefault && politicafactuOrigen.getvalor()!=null && !politicafactuOrigen.getvalor().equals(0.0))) {politicafactu.setvalor(politicafactuOrigen.getvalor());}
			if(conDefault || (!conDefault && politicafactuOrigen.getcon_banco_cliente()!=null && !politicafactuOrigen.getcon_banco_cliente().equals(false))) {politicafactu.setcon_banco_cliente(politicafactuOrigen.getcon_banco_cliente());}
			if(conDefault || (!conDefault && politicafactuOrigen.getcon_banco_producto()!=null && !politicafactuOrigen.getcon_banco_producto().equals(false))) {politicafactu.setcon_banco_producto(politicafactuOrigen.getcon_banco_producto());}
			if(conDefault || (!conDefault && politicafactuOrigen.getes_activo()!=null && !politicafactuOrigen.getes_activo().equals(false))) {politicafactu.setes_activo(politicafactuOrigen.getes_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPoliticaFactu(PoliticaFactu politicafactu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.setText(politicafactu.getId().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextAreanombrePoliticaFactu.setText(politicafactu.getnombre());
			this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_desdePoliticaFactu.setDate(politicafactu.getfecha_desde());
			this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_hastaPoliticaFactu.setDate(politicafactu.getfecha_hasta());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldporcentajePoliticaFactu.setText(politicafactu.getporcentaje().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldvalorPoliticaFactu.setText(politicafactu.getvalor().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.setSelected(politicafactu.getcon_banco_cliente());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.setSelected(politicafactu.getcon_banco_producto());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.setSelected(politicafactu.getes_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPoliticaFactu(PoliticaFactuBean politicafactuBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.setText(politicafactuBean.getId().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextAreanombrePoliticaFactu.setText(politicafactuBean.getnombre());
			this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_desdePoliticaFactu.setDate(politicafactuBean.getfecha_desde());
			this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_hastaPoliticaFactu.setDate(politicafactuBean.getfecha_hasta());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldporcentajePoliticaFactu.setText(politicafactuBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldvalorPoliticaFactu.setText(politicafactuBean.getvalor().toString());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.setSelected(politicafactuBean.getcon_banco_cliente());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.setSelected(politicafactuBean.getcon_banco_producto());
			this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.setSelected(politicafactuBean.getes_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPoliticaFactu(PoliticaFactuParameterReturnGeneral politicafactuReturnGeneral,PoliticaFactuBean politicafactuBean,Boolean conDefault) throws Exception { 
		try {
			PoliticaFactu politicafactuLocal=new PoliticaFactu();
			
			politicafactuLocal=politicafactuReturnGeneral.getPoliticaFactu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && politicafactuLocal.getId()!=null && !politicafactuLocal.getId().equals(0L))) {politicafactuBean.setId(politicafactuLocal.getId());}}
			if(conDefault || (!conDefault && politicafactuLocal.getid_producto()!=null && !politicafactuLocal.getid_producto().equals(-1L))) {politicafactuBean.setid_producto(politicafactuLocal.getid_producto());}
			if(conDefault || (!conDefault && politicafactuLocal.getid_grupo_cliente()!=null && !politicafactuLocal.getid_grupo_cliente().equals(-1L))) {politicafactuBean.setid_grupo_cliente(politicafactuLocal.getid_grupo_cliente());}
			if(conDefault || (!conDefault && politicafactuLocal.getnombre()!=null && !politicafactuLocal.getnombre().equals(""))) {politicafactuBean.setnombre(politicafactuLocal.getnombre());}
			if(conDefault || (!conDefault && politicafactuLocal.getfecha_desde()!=null && !politicafactuLocal.getfecha_desde().equals(new Date()))) {politicafactuBean.setfecha_desde(politicafactuLocal.getfecha_desde());}
			if(conDefault || (!conDefault && politicafactuLocal.getfecha_hasta()!=null && !politicafactuLocal.getfecha_hasta().equals(new Date()))) {politicafactuBean.setfecha_hasta(politicafactuLocal.getfecha_hasta());}
			if(conDefault || (!conDefault && politicafactuLocal.getporcentaje()!=null && !politicafactuLocal.getporcentaje().equals(0.0))) {politicafactuBean.setporcentaje(politicafactuLocal.getporcentaje());}
			if(conDefault || (!conDefault && politicafactuLocal.getvalor()!=null && !politicafactuLocal.getvalor().equals(0.0))) {politicafactuBean.setvalor(politicafactuLocal.getvalor());}
			if(conDefault || (!conDefault && politicafactuLocal.getcon_banco_cliente()!=null && !politicafactuLocal.getcon_banco_cliente().equals(false))) {politicafactuBean.setcon_banco_cliente(politicafactuLocal.getcon_banco_cliente());}
			if(conDefault || (!conDefault && politicafactuLocal.getcon_banco_producto()!=null && !politicafactuLocal.getcon_banco_producto().equals(false))) {politicafactuBean.setcon_banco_producto(politicafactuLocal.getcon_banco_producto());}
			if(conDefault || (!conDefault && politicafactuLocal.getes_activo()!=null && !politicafactuLocal.getes_activo().equals(false))) {politicafactuBean.setes_activo(politicafactuLocal.getes_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPoliticaFactuGenerico(Long idPoliticaFactuSeleccionado,JComboBox jComboBoxPoliticaFactu,List<PoliticaFactu> politicafactusLocal)throws Exception {
		try {
			PoliticaFactu  politicafactuTemp=null;

			for(PoliticaFactu politicafactuAux:politicafactusLocal) {
				if(politicafactuAux.getId()!=null && politicafactuAux.getId().equals(idPoliticaFactuSeleccionado)) {
					politicafactuTemp=politicafactuAux;
					break;
				}
			}

			jComboBoxPoliticaFactu.setSelectedItem(politicafactuTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPoliticaFactuGenerico(JComboBox jComboBoxPoliticaFactu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPoliticaFactu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPoliticaFactu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPoliticaFactu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPoliticaFactu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicafactu=(PoliticaFactu) politicafactuLogic.getPoliticaFactus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			politicafactu =(PoliticaFactu) politicafactus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!politicafactu.getIsNew() && !politicafactu.getIsChanged() && !politicafactu.getIsDeleted()) {
				sDescripcion=politicafactu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=politicafactu.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!politicafactu.getIsNew() && !politicafactu.getIsChanged() && !politicafactu.getIsDeleted()) {
				sDescripcion=politicafactu.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=politicafactu.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!politicafactu.getIsNew() && !politicafactu.getIsChanged() && !politicafactu.getIsDeleted()) {
				sDescripcion=politicafactu.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=politicafactu.getproducto_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!politicafactu.getIsNew() && !politicafactu.getIsChanged() && !politicafactu.getIsDeleted()) {
				sDescripcion=politicafactu.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=politicafactu.getgrupocliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PoliticaFactu politicafactuRow=new PoliticaFactu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicafactuRow=(PoliticaFactu) politicafactuLogic.getPoliticaFactus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			politicafactuRow=(PoliticaFactu) politicafactus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPoliticaFactu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoPoliticaFactu && this.isPermisoNuevoPoliticaFactu));			
			this.jButtonDuplicarPoliticaFactu.setVisible((this.isVisibilidadCeldaDuplicarPoliticaFactu && this.isPermisoDuplicarPoliticaFactu));			
			this.jButtonCopiarPoliticaFactu.setVisible((this.isVisibilidadCeldaCopiarPoliticaFactu && this.isPermisoCopiarPoliticaFactu));
			this.jButtonVerFormPoliticaFactu.setVisible((this.isVisibilidadCeldaVerFormPoliticaFactu && this.isPermisoVerFormPoliticaFactu));
			
			this.jButtonAbrirOrderByPoliticaFactu.setVisible((this.isVisibilidadCeldaOrdenPoliticaFactu && this.isPermisoOrdenPoliticaFactu));			
			
			this.jButtonNuevoRelacionesPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu && this.isPermisoNuevoPoliticaFactu));			
			this.jButtonNuevoGuardarCambiosPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoPoliticaFactu && this.isPermisoNuevoPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));
			
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarPoliticaFactu.setVisible((this.isVisibilidadCeldaModificarPoliticaFactu && this.isPermisoActualizarPoliticaFactu));	
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarPoliticaFactu.setVisible((this.isVisibilidadCeldaActualizarPoliticaFactu && this.isPermisoActualizarPoliticaFactu));	
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarPoliticaFactu.setVisible((this.isVisibilidadCeldaEliminarPoliticaFactu && this.isPermisoEliminarPoliticaFactu));
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarPoliticaFactu.setVisible(this.isVisibilidadCeldaCancelarPoliticaFactu);							
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosPoliticaFactu.setVisible((this.isVisibilidadCeldaGuardarPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));			
			
			}
						
			this.jButtonGuardarCambiosTablaPoliticaFactu.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoPoliticaFactu && this.isPermisoNuevoPoliticaFactu));						
			this.jButtonDuplicarToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaDuplicarPoliticaFactu && this.isPermisoDuplicarPoliticaFactu));						
			this.jButtonCopiarToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaCopiarPoliticaFactu && this.isPermisoCopiarPoliticaFactu));			
			this.jButtonVerFormToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaVerFormPoliticaFactu && this.isPermisoVerFormPoliticaFactu));			
			this.jButtonAbrirOrderByToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaOrdenPoliticaFactu && this.isPermisoOrdenPoliticaFactu));
			this.jButtonNuevoRelacionesToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu && this.isPermisoNuevoPoliticaFactu));			
			this.jButtonNuevoGuardarCambiosToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoPoliticaFactu && this.isPermisoNuevoPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));			
			
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaModificarPoliticaFactu && this.isPermisoActualizarPoliticaFactu));	
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaActualizarPoliticaFactu  && this.isPermisoActualizarPoliticaFactu));	
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaEliminarPoliticaFactu && this.isPermisoEliminarPoliticaFactu));
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarToolBarPoliticaFactu.setVisible(this.isVisibilidadCeldaCancelarPoliticaFactu);				
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaGuardarPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPoliticaFactu.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoPoliticaFactu && this.isPermisoNuevoPoliticaFactu));			
			this.jMenuItemDuplicarPoliticaFactu.setVisible((this.isVisibilidadCeldaDuplicarPoliticaFactu && this.isPermisoDuplicarPoliticaFactu));			
			this.jMenuItemCopiarPoliticaFactu.setVisible((this.isVisibilidadCeldaCopiarPoliticaFactu && this.isPermisoCopiarPoliticaFactu));			
			this.jMenuItemVerFormPoliticaFactu.setVisible((this.isVisibilidadCeldaVerFormPoliticaFactu && this.isPermisoVerFormPoliticaFactu));			
			this.jMenuItemAbrirOrderByPoliticaFactu.setVisible((this.isVisibilidadCeldaOrdenPoliticaFactu && this.isPermisoOrdenPoliticaFactu));			
			//this.jMenuItemMostrarOcultarPoliticaFactu.setVisible((this.isVisibilidadCeldaOrdenPoliticaFactu && this.isPermisoOrdenPoliticaFactu));
			this.jMenuItemDetalleAbrirOrderByPoliticaFactu.setVisible((this.isVisibilidadCeldaOrdenPoliticaFactu && this.isPermisoOrdenPoliticaFactu));			
			//this.jMenuItemDetalleMostrarOcultarPoliticaFactu.setVisible((this.isVisibilidadCeldaOrdenPoliticaFactu && this.isPermisoOrdenPoliticaFactu));			
			this.jMenuItemNuevoRelacionesPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu && this.isPermisoNuevoPoliticaFactu));			
			this.jMenuItemNuevoGuardarCambiosPoliticaFactu.setVisible((this.isVisibilidadCeldaNuevoPoliticaFactu && this.isPermisoNuevoPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));									
			
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemModificarPoliticaFactu.setVisible((this.isVisibilidadCeldaModificarPoliticaFactu && this.isPermisoActualizarPoliticaFactu));	
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemActualizarPoliticaFactu.setVisible((this.isVisibilidadCeldaActualizarPoliticaFactu && this.isPermisoActualizarPoliticaFactu));	
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemEliminarPoliticaFactu.setVisible((this.isVisibilidadCeldaEliminarPoliticaFactu && this.isPermisoEliminarPoliticaFactu));
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemCancelarPoliticaFactu.setVisible(this.isVisibilidadCeldaCancelarPoliticaFactu);				
			}
			
			this.jMenuItemGuardarCambiosPoliticaFactu.setVisible((this.isVisibilidadCeldaGuardarPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));						
			this.jMenuItemGuardarCambiosTablaPoliticaFactu.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPoliticaFactu=this.jButtonNuevoPoliticaFactu.isVisible();
			this.isVisibilidadCeldaDuplicarPoliticaFactu=this.jButtonDuplicarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaCopiarPoliticaFactu=this.jButtonCopiarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaVerFormPoliticaFactu=this.jButtonVerFormPoliticaFactu.isVisible();
			
			this.isVisibilidadCeldaOrdenPoliticaFactu=this.jButtonAbrirOrderByPoliticaFactu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=this.jButtonNuevoRelacionesPoliticaFactu.isVisible();
			this.isVisibilidadCeldaModificarPoliticaFactu=this.jButtonModificarPoliticaFactu.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			this.isVisibilidadCeldaActualizarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaGuardarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosPoliticaFactu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=this.jButtonGuardarCambiosTablaPoliticaFactu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPoliticaFactu=this.jButtonNuevoToolBarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=this.jButtonNuevoRelacionesToolBarPoliticaFactu.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			this.isVisibilidadCeldaModificarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarToolBarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaActualizarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarToolBarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarToolBarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarToolBarPoliticaFactu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPoliticaFactu=this.jButtonGuardarCambiosToolBarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=this.jButtonGuardarCambiosTablaToolBarPoliticaFactu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPoliticaFactu=this.jMenuItemNuevoPoliticaFactu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=this.jMenuItemNuevoRelacionesPoliticaFactu.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			this.isVisibilidadCeldaModificarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemModificarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaActualizarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemActualizarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemEliminarPoliticaFactu.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaFactu=this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemCancelarPoliticaFactu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPoliticaFactu=this.jMenuItemGuardarCambiosPoliticaFactu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=this.jMenuItemGuardarCambiosTablaPoliticaFactu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPoliticaFactu(Boolean esInicializar) {
		if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {			
			if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
				//if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPoliticaFactu();
			}
			
			this.inicializarActualizarBindingBotonesManualPoliticaFactu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPoliticaFactu() {
		this.jButtonNuevoPoliticaFactu.setVisible(this.isPermisoNuevoPoliticaFactu);			
		this.jButtonDuplicarPoliticaFactu.setVisible(this.isPermisoDuplicarPoliticaFactu);			
		this.jButtonCopiarPoliticaFactu.setVisible(this.isPermisoCopiarPoliticaFactu);			
		this.jButtonVerFormPoliticaFactu.setVisible(this.isPermisoVerFormPoliticaFactu);			
		
		this.jButtonAbrirOrderByPoliticaFactu.setVisible(this.isPermisoOrdenPoliticaFactu);					
		
		this.jButtonNuevoRelacionesPoliticaFactu.setVisible(this.isPermisoNuevoPoliticaFactu);			
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarPoliticaFactu.setVisible(this.isPermisoActualizarPoliticaFactu);	
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarPoliticaFactu.setVisible(this.isPermisoActualizarPoliticaFactu);	
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarPoliticaFactu.setVisible(this.isPermisoEliminarPoliticaFactu);
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarPoliticaFactu.setVisible(this.isVisibilidadCeldaCancelarPoliticaFactu);						
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosPoliticaFactu.setVisible(this.isPermisoGuardarCambiosPoliticaFactu);							
		}
		
		this.jButtonGuardarCambiosTablaPoliticaFactu.setVisible(this.isPermisoActualizarPoliticaFactu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePoliticaFactu() {
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarPoliticaFactu.setVisible(this.isPermisoActualizarPoliticaFactu);	
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarPoliticaFactu.setVisible(this.isPermisoActualizarPoliticaFactu);	
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarPoliticaFactu.setVisible(this.isPermisoEliminarPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarPoliticaFactu.setVisible(this.isVisibilidadCeldaCancelarPoliticaFactu);							
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosPoliticaFactu.setVisible((this.isVisibilidadCeldaGuardarPoliticaFactu && this.isPermisoGuardarCambiosPoliticaFactu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPoliticaFactu() {
		if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPoliticaFactu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPoliticaFactu() {
	}
	
	public void jTableDatosPoliticaFactuListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPoliticaFactu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.politicafactu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPoliticaFactuUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPoliticaFactu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaFactu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaFactu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.politicafactuLogic.getConnexion());

				if(this.politicafactu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.politicafactu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaFactu=(TitledBorder)this.jScrollPanelDatosPoliticaFactu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPoliticaFactu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.politicafactu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPoliticaFactuUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPoliticaFactu(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaFactu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaFactu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.politicafactuLogic.getConnexion());

				if(this.politicafactu.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.politicafactu.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaFactu=(TitledBorder)this.jScrollPanelDatosPoliticaFactu.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPoliticaFactu.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.politicafactu.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoPoliticaFactuActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productoBeanSwingJInternalFrame.sTipoBusqueda="Producto";

			if(!this.sFinalQueryGeneral_producto.equals("")) {
				this.productoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_producto);
				this.productoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProducto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPoliticaFactu=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosPoliticaFactu.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPoliticaFactu=(TitledBorder)this.jScrollPanelDatosPoliticaFactu.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPoliticaFactu.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoPoliticaFactuUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebPoliticaFactu(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaFactu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaFactu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.politicafactuLogic.getConnexion());

				if(this.politicafactu.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.politicafactu.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaFactu=(TitledBorder)this.jScrollPanelDatosPoliticaFactu.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPoliticaFactu.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoPoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.politicafactu.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clientePoliticaFactuUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebPoliticaFactu(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaFactu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaFactu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.politicafactuLogic.getConnexion());

				if(this.politicafactu.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.politicafactu.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaFactu=(TitledBorder)this.jScrollPanelDatosPoliticaFactu.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderPoliticaFactu.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clientePoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.politicafactu.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.politicafactu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdePoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.politicafactu.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaPoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.politicafactu.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajePoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.politicafactu.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.politicafactu.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_banco_clientePoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getcon_banco_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_banco_cliente = "+this.politicafactu.getcon_banco_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_banco_productoPoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getcon_banco_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_banco_producto = "+this.politicafactu.getcon_banco_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_activoPoliticaFactuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.getpoliticafactu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicafactu==null) {
						this.politicafactu = new PoliticaFactu();
					}

					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);
				}

				if(this.politicafactu.getes_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_activo = "+this.politicafactu.getes_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaFactu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaFactu(false,false);

			this.getPoliticaFactusFK_IdEmpresa();

			this.inicializarActualizarBindingPoliticaFactu(false);

			//if(PoliticaFactuBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaFactu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClientePoliticaFactuActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaFactu(false,false);

			this.getPoliticaFactusFK_IdGrupoCliente();

			this.inicializarActualizarBindingPoliticaFactu(false);

			//if(PoliticaFactuBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaFactu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaFactu(false,false);

			this.getPoliticaFactusFK_IdProducto();

			this.inicializarActualizarBindingPoliticaFactu(false);

			//if(PoliticaFactuBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaFactu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPoliticaFactuActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaFactu(false,false);

			this.getPoliticaFactusFK_IdSucursal();

			this.inicializarActualizarBindingPoliticaFactu(false);

			//if(PoliticaFactuBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaFactu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicafactuLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePoliticaFactu() {
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
			this.jInternalFrameDetalleFormPoliticaFactu.setVisible(false);	    			
			this.jInternalFrameDetalleFormPoliticaFactu.dispose();
			this.jInternalFrameDetalleFormPoliticaFactu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
			this.jInternalFrameReporteDinamicoPoliticaFactu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPoliticaFactu.dispose();
			this.jInternalFrameReporteDinamicoPoliticaFactu=null;
		}
		
		if(this.jInternalFrameImportacionPoliticaFactu!=null) {
			this.jInternalFrameImportacionPoliticaFactu.setVisible(false);	    			
			this.jInternalFrameImportacionPoliticaFactu.dispose();
			this.jInternalFrameImportacionPoliticaFactu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPoliticaFactu();
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			
			if(sTipo.equals("NuevoPoliticaFactu")) {
				jButtonNuevoPoliticaFactuActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPoliticaFactu")) {
				jButtonDuplicarPoliticaFactuActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPoliticaFactu")) {
				jButtonCopiarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("VerFormPoliticaFactu")) {
				jButtonVerFormPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPoliticaFactu")) {
				jButtonNuevoPoliticaFactuActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPoliticaFactu")) {
				jButtonDuplicarPoliticaFactuActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPoliticaFactu")) {
				jButtonNuevoPoliticaFactuActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPoliticaFactu")) {
				jButtonDuplicarPoliticaFactuActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPoliticaFactu")) {
				jButtonNuevoPoliticaFactuActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPoliticaFactu")) {
				jButtonNuevoPoliticaFactuActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPoliticaFactu")) {
				jButtonNuevoPoliticaFactuActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPoliticaFactu")) {
				jButtonModificarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPoliticaFactu")) {
				jButtonModificarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPoliticaFactu")) {
				jButtonModificarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPoliticaFactu")) {
				jButtonActualizarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPoliticaFactu")) {
				jButtonActualizarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPoliticaFactu")) {
				jButtonActualizarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("EliminarPoliticaFactu")) {
				jButtonEliminarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPoliticaFactu")) {
				jButtonEliminarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPoliticaFactu")) {
				jButtonEliminarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("CancelarPoliticaFactu")) {
				jButtonCancelarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPoliticaFactu")) {
				jButtonCancelarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPoliticaFactu")) {
				jButtonCancelarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("CerrarPoliticaFactu")) {
				jButtonCerrarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPoliticaFactu")) {
				jButtonCerrarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPoliticaFactu")) {
				jButtonCerrarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPoliticaFactu")) {
				jButtonMostrarOcultarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPoliticaFactu")) {
				jButtonCancelarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPoliticaFactu")) {
				jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPoliticaFactu")) {
				jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPoliticaFactu")) {
				jButtonCopiarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPoliticaFactu")) {
				jButtonVerFormPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPoliticaFactu")) {
				jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPoliticaFactu")) {
				jButtonCopiarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPoliticaFactu")) {
				jButtonVerFormPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPoliticaFactu")) {
				jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPoliticaFactu")) {
				jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPoliticaFactu")) {
				jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPoliticaFactu")) {
				jButtonRecargarInformacionPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPoliticaFactu")) {
				jButtonRecargarInformacionPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPoliticaFactu")) {
				jButtonRecargarInformacionPoliticaFactuActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPoliticaFactu")) {
				jButtonAnterioresPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPoliticaFactu")) {
				jButtonAnterioresPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePoliticaFactu")) {
				jButtonAnterioresPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPoliticaFactu")) {
				jButtonSiguientesPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPoliticaFactu")) {
				jButtonSiguientesPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPoliticaFactu")) {
				jButtonSiguientesPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPoliticaFactu") || sTipo.equals("MenuItemDetalleAbrirOrderByPoliticaFactu")) {
				jButtonAbrirOrderByPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPoliticaFactu") || sTipo.equals("MenuItemDetalleMostrarOcultarPoliticaFactu")) {
				jButtonMostrarOcultarPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPoliticaFactu")) {
				jButtonNuevoGuardarCambiosPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPoliticaFactu")) {
				jButtonNuevoGuardarCambiosPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPoliticaFactu")) {
				jButtonNuevoGuardarCambiosPoliticaFactuActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPoliticaFactu")) {
				jButtonCerrarReporteDinamicoPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPoliticaFactu")) {
				jButtonGenerarReporteDinamicoPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPoliticaFactu")) {
				
				jButtonGenerarExcelReporteDinamicoPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPoliticaFactu")) {
				jButtonCerrarImportacionPoliticaFactuActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPoliticaFactu")) {
				
				jButtonGenerarImportacionPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPoliticaFactu")) {
				
				jButtonAbrirImportacionPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPoliticaFactu")) {
				jComboBoxTiposAccionesPoliticaFactuActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPoliticaFactu")) {
				jComboBoxTiposRelacionesPoliticaFactuActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPoliticaFactu")) {
				jComboBoxTiposAccionesPoliticaFactuActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPoliticaFactu")) {
				
				jComboBoxTiposSeleccionarPoliticaFactuActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPoliticaFactu")) {
				jTextFieldValorCampoGeneralPoliticaFactuActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPoliticaFactu")) {
				jButtonAbrirOrderByPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPoliticaFactu")) {
				jButtonAbrirOrderByPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPoliticaFactu")) {
				jButtonCerrarOrderByPoliticaFactuActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPoliticaFactuBusqueda")) {
				this.jButtonidPoliticaFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPoliticaFactuUpdate")) {
				this.jButtonid_empresaPoliticaFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPoliticaFactuBusqueda")) {
				this.jButtonid_empresaPoliticaFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPoliticaFactuUpdate")) {
				this.jButtonid_sucursalPoliticaFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPoliticaFactuBusqueda")) {
				this.jButtonid_sucursalPoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPoliticaFactu")) {
				this.jButtonid_productoPoliticaFactuActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPoliticaFactuUpdate")) {
				this.jButtonid_productoPoliticaFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPoliticaFactuBusqueda")) {
				this.jButtonid_productoPoliticaFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clientePoliticaFactuUpdate")) {
				this.jButtonid_grupo_clientePoliticaFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clientePoliticaFactuBusqueda")) {
				this.jButtonid_grupo_clientePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePoliticaFactuBusqueda")) {
				this.jButtonnombrePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdePoliticaFactuBusqueda")) {
				this.jButtonfecha_desdePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaPoliticaFactuBusqueda")) {
				this.jButtonfecha_hastaPoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajePoliticaFactuBusqueda")) {
				this.jButtonporcentajePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPoliticaFactuBusqueda")) {
				this.jButtonvalorPoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_banco_clientePoliticaFactuBusqueda")) {
				this.jButtoncon_banco_clientePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_banco_productoPoliticaFactuBusqueda")) {
				this.jButtoncon_banco_productoPoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoPoliticaFactuBusqueda")) {
				this.jButtones_activoPoliticaFactuBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoPoliticaFactu")) {
				this.jButtonid_productoPoliticaFactuActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdGrupoClientePoliticaFactu")) {
				this.jButtonFK_IdGrupoClientePoliticaFactuActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoPoliticaFactu")) {
				this.jButtonFK_IdProductoPoliticaFactuActionPerformed(evt);
			}
			
			;
			
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPoliticaFactu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaFactuActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				


				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PoliticaFactu politicafactuLocal=null;
			
			if(!this.getEsControlTabla()) {
				politicafactuLocal=this.politicafactu;
			} else {
				politicafactuLocal=this.politicafactuAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
							
				
				


				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaFactuActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
								
						
				


				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
								
				
				


				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaFactuActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
							
				
				


				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaFactuActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactuAnterior =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.politicafactuAnterior =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaFactuActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
								
				
				


				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaFactuActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaFactuActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPoliticaFactu")) {
					jCheckBoxSeleccionarTodosPoliticaFactuItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPoliticaFactu")) {
					jCheckBoxSeleccionadosPoliticaFactuItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPoliticaFactu")) {
					
				}
				
				


				
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
												
				
				


				
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaFactuActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicafactuAnterior =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.politicafactuAnterior =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaFactuActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaFactuActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicafactu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicafactu);
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaFactu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaFactu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaFactuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicafactuAnterior =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPoliticaFactu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPoliticaFactuListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPoliticaFactu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.politicafactu =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.politicafactu =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.politicafactu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPoliticaFactu")) {
				
				}
				
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPoliticaFactu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPoliticaFactu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPoliticaFactu")) {
			
			}
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPoliticaFactu();
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			if(sTipo.equals("NuevoPoliticaFactu")) {
				jButtonNuevoPoliticaFactuActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPoliticaFactu")) {
				jButtonDuplicarPoliticaFactuActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPoliticaFactu")) {
				jButtonCopiarPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPoliticaFactu")) {
				jButtonVerFormPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPoliticaFactu")) {
				jButtonNuevoPoliticaFactuActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPoliticaFactu")) {
				jButtonModificarPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPoliticaFactu")) {
				jButtonActualizarPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPoliticaFactu")) {
				jButtonEliminarPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPoliticaFactu")) {
				jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPoliticaFactu")) {
				jButtonCancelarPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPoliticaFactu")) {
				jButtonCerrarPoliticaFactuActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPoliticaFactu")) {
				jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPoliticaFactu")) {
				jButtonNuevoGuardarCambiosPoliticaFactuActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPoliticaFactu")) {
				jButtonAbrirOrderByPoliticaFactuActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPoliticaFactu")) {
				jButtonRecargarInformacionPoliticaFactuActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPoliticaFactu")) {
				jButtonAnterioresPoliticaFactuActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPoliticaFactu")) {
				jButtonSiguientesPoliticaFactuActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPoliticaFactuBusqueda")) {
				this.jButtonidPoliticaFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPoliticaFactuUpdate")) {
				this.jButtonid_empresaPoliticaFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPoliticaFactuBusqueda")) {
				this.jButtonid_empresaPoliticaFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPoliticaFactuUpdate")) {
				this.jButtonid_sucursalPoliticaFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPoliticaFactuBusqueda")) {
				this.jButtonid_sucursalPoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPoliticaFactu")) {
				this.jButtonid_productoPoliticaFactuActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPoliticaFactuUpdate")) {
				this.jButtonid_productoPoliticaFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPoliticaFactuBusqueda")) {
				this.jButtonid_productoPoliticaFactuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clientePoliticaFactuUpdate")) {
				this.jButtonid_grupo_clientePoliticaFactuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clientePoliticaFactuBusqueda")) {
				this.jButtonid_grupo_clientePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePoliticaFactuBusqueda")) {
				this.jButtonnombrePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdePoliticaFactuBusqueda")) {
				this.jButtonfecha_desdePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaPoliticaFactuBusqueda")) {
				this.jButtonfecha_hastaPoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajePoliticaFactuBusqueda")) {
				this.jButtonporcentajePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPoliticaFactuBusqueda")) {
				this.jButtonvalorPoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_banco_clientePoliticaFactuBusqueda")) {
				this.jButtoncon_banco_clientePoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_banco_productoPoliticaFactuBusqueda")) {
				this.jButtoncon_banco_productoPoliticaFactuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoPoliticaFactuBusqueda")) {
				this.jButtones_activoPoliticaFactuBusquedaActionPerformed(evt);
			}
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPoliticaFactu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePoliticaFactu")) {
				closingInternalFramePoliticaFactu();
				
			} else if(sTipo.equals("jButtonCancelarPoliticaFactu")) {
				JInternalFrameBase jInternalFrameDetalleFormPoliticaFactu = (JInternalFrameBase)evt.getSource();
	            	
	            PoliticaFactuBeanSwingJInternalFrame jInternalFrameParent=(PoliticaFactuBeanSwingJInternalFrame)jInternalFrameDetalleFormPoliticaFactu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPoliticaFactuActionPerformed(null);
			}
			
			PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.politicafactu,new Object(),this.politicafactuParameterGeneral,this.politicafactuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPoliticaFactu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPoliticaFactu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPoliticaFactu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.politicafactu)) {
			if(!esControlTabla) {
				if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);			
				}
				
				if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPoliticaFactu(this.politicafactu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.politicafactuReturnGeneral=politicafactuLogic.procesarEventosPoliticaFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicafactuLogic.getPoliticaFactus(),this.politicafactu,this.politicafactuParameterGeneral,this.isEsNuevoPoliticaFactu,classes);//this.politicafactuLogic.getPoliticaFactu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPoliticaFactu(this.politicafactuReturnGeneral,this.politicafactuBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPoliticaFactu(classes,this.politicafactuReturnGeneral,this.politicafactuBean,false);
					}
						
					if(this.politicafactuReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPoliticaFactu(this.politicafactuReturnGeneral.getPoliticaFactu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPoliticaFactu(this.politicafactuReturnGeneral.getPoliticaFactu());	
					}
						
					if(this.politicafactuReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPoliticaFactu(this.politicafactuReturnGeneral.getPoliticaFactu(),classes);//this.politicafactuBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPoliticaFactu(this.politicafactu,classes);//this.politicafactuBean);									
				}
			
				if(PoliticaFactuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPoliticaFactu(this.politicafactu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaFactu(this.politicafactu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.politicafactuAnterior!=null) {
						this.politicafactu=this.politicafactuAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.politicafactuReturnGeneral=politicafactuLogic.procesarEventosPoliticaFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicafactuLogic.getPoliticaFactus(),this.politicafactu,this.politicafactuParameterGeneral,this.isEsNuevoPoliticaFactu,classes);//this.politicafactuLogic.getPoliticaFactu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.politicafactuSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.politicafactuSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.politicafactuReturnGeneral.getPoliticaFactu(),politicafactuLogic.getPoliticaFactus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.politicafactuReturnGeneral.getPoliticaFactu(),this.politicafactus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPoliticaFactu.repaint();
				
				//((AbstractTableModel) this.jTableDatosPoliticaFactu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPoliticaFactu();
			}
		}
	}
	
	public void actualizarVisualTableDatosPoliticaFactu() throws Exception {
		
		PoliticaFactuModel politicafactuModel=(PoliticaFactuModel)this.jTableDatosPoliticaFactu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicafactuModel.politicafactus=this.politicafactuLogic.getPoliticaFactus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			politicafactuModel.politicafactus=this.politicafactus;
		}
		
		
		((PoliticaFactuModel) this.jTableDatosPoliticaFactu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPoliticaFactu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpoliticafactuAnterior(),this.politicafactuLogic.getPoliticaFactus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpoliticafactuAnterior(),this.politicafactus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPoliticaFactu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPoliticaFactu(PoliticaFactu politicafactu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicafactu,new Object(),generalEntityParameterGeneral,this.politicafactuReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PoliticaFactuConstantesFunciones.getClassesRelationshipsOfPoliticaFactu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PoliticaFactuConstantesFunciones.getClassesRelationshipsFromStringsOfPoliticaFactu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPoliticaFactu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PoliticaFactuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicafactu,new Object(),generalEntityParameterGeneral,this.politicafactuReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPoliticaFactu(PoliticaFactuBean politicafactuBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPoliticaFactu(ArrayList<Classe> classes,PoliticaFactuReturnGeneral politicafactuReturnGeneral,PoliticaFactuBean politicafactuBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPoliticaFactu(PoliticaFactu politicafactu,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.politicafactu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPoliticaFactu = new PoliticaFactuDetalleFormJInternalFrame(jDesktopPane,this.politicafactuSessionBean.getConGuardarRelaciones(),this.politicafactuSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.setVisible(false);
		this.jInternalFrameDetalleFormPoliticaFactu.setSelected(false);						
		
		this.jInternalFrameDetalleFormPoliticaFactu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPoliticaFactu.politicafactuLogic=this.politicafactuLogic;
		
		this.cargarCombosFrameForeignKeyPoliticaFactu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePoliticaFactu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePoliticaFactu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPoliticaFactu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPoliticaFactu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPoliticaFactu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPoliticaFactu"));
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarPoliticaFactu.addActionListener(new ButtonActionListener(this,"ModificarPoliticaFactu"));

		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarToolBarPoliticaFactu.addActionListener(new ButtonActionListener(this,"ModificarToolBarPoliticaFactu"));
					
		this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemModificarPoliticaFactu.addActionListener(new ButtonActionListener(this,"MenuItemModificarPoliticaFactu"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarPoliticaFactu.addActionListener (new ButtonActionListener(this,"ActualizarPoliticaFactu"));
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarToolBarPoliticaFactu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPoliticaFactu"));
						
		this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemActualizarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPoliticaFactu"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarPoliticaFactu.addActionListener (new ButtonActionListener(this,"EliminarPoliticaFactu"));
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"EliminarToolBarPoliticaFactu"));
								
		this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemEliminarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPoliticaFactu"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarPoliticaFactu.addActionListener (new ButtonActionListener(this,"CancelarPoliticaFactu"));
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"CancelarToolBarPoliticaFactu"));
					
		this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemCancelarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPoliticaFactu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemDetalleCerrarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPoliticaFactu"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaFactu"));
		
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaFactu"));
		
		
		
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPoliticaFactu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonidPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_empresaPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_empresaPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_sucursalPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_sucursalPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaFactuBusqueda"));
		//jButtonid_productoPoliticaFactu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPoliticaFactuActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactu.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_grupo_clientePoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clientePoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_grupo_clientePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clientePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonnombrePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"nombrePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonfecha_desdePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonfecha_hastaPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonporcentajePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonvalorPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"valorPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtoncon_banco_clientePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"con_banco_clientePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtoncon_banco_productoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"con_banco_productoPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtones_activoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"es_activoPoliticaFactuBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPoliticaFactu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePoliticaFactu"));
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPoliticaFactu"));
		}
		
		this.jTableDatosPoliticaFactu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPoliticaFactu"));
		
		this.jTableDatosPoliticaFactu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPoliticaFactu"));
		
		this.jButtonNuevoPoliticaFactu.addActionListener(new ButtonActionListener(this,"NuevoPoliticaFactu"));
		
		this.jButtonDuplicarPoliticaFactu.addActionListener(new ButtonActionListener(this,"DuplicarPoliticaFactu"));
		
		this.jButtonCopiarPoliticaFactu.addActionListener(new ButtonActionListener(this,"CopiarPoliticaFactu"));
		
		this.jButtonVerFormPoliticaFactu.addActionListener(new ButtonActionListener(this,"VerFormPoliticaFactu"));
		
		
		this.jButtonNuevoToolBarPoliticaFactu.addActionListener(new ButtonActionListener(this,"NuevoToolBarPoliticaFactu"));
			
		this.jButtonDuplicarToolBarPoliticaFactu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPoliticaFactu"));
			
		this.jMenuItemNuevoPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPoliticaFactu"));
			
		this.jMenuItemDuplicarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPoliticaFactu"));		
		
		
		this.jButtonNuevoRelacionesPoliticaFactu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPoliticaFactu"));
		
		
		this.jButtonNuevoRelacionesToolBarPoliticaFactu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPoliticaFactu"));
			
		this.jMenuItemNuevoRelacionesPoliticaFactu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPoliticaFactu"));		
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarPoliticaFactu.addActionListener(new ButtonActionListener(this,"ModificarPoliticaFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonModificarToolBarPoliticaFactu.addActionListener(new ButtonActionListener(this,"ModificarToolBarPoliticaFactu"));
			
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemModificarPoliticaFactu.addActionListener(new ButtonActionListener(this,"MenuItemModificarPoliticaFactu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarPoliticaFactu.addActionListener (new ButtonActionListener(this,"ActualizarPoliticaFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonActualizarToolBarPoliticaFactu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPoliticaFactu"));
				
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemActualizarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPoliticaFactu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarPoliticaFactu.addActionListener (new ButtonActionListener(this,"EliminarPoliticaFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonEliminarToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"EliminarToolBarPoliticaFactu"));
						
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemEliminarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPoliticaFactu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarPoliticaFactu.addActionListener (new ButtonActionListener(this,"CancelarPoliticaFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonCancelarToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"CancelarToolBarPoliticaFactu"));
			
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemCancelarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPoliticaFactu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPoliticaFactu"));		
		
		
		this.jButtonCerrarPoliticaFactu.addActionListener (new ButtonActionListener(this,"CerrarPoliticaFactu"));
		
		
		this.jButtonCerrarToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"CerrarToolBarPoliticaFactu"));
			
		this.jMenuItemCerrarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPoliticaFactu"));
			
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jMenuItemDetalleCerrarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPoliticaFactu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosPoliticaFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosPoliticaFactu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaFactu"));
		}
		
		this.jButtonCopiarToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"CopiarToolBarPoliticaFactu"));
			
		this.jButtonVerFormToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"VerFormToolBarPoliticaFactu"));
		
		this.jMenuItemGuardarCambiosPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPoliticaFactu"));
			
		this.jMenuItemCopiarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPoliticaFactu"));		
		
		this.jMenuItemVerFormPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPoliticaFactu"));		
		
		
		this.jButtonGuardarCambiosTablaPoliticaFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPoliticaFactu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPoliticaFactu"));
			
		this.jMenuItemGuardarCambiosTablaPoliticaFactu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPoliticaFactu"));		
		
		
		
		this.jButtonRecargarInformacionPoliticaFactu.addActionListener (new ButtonActionListener(this,"RecargarInformacionPoliticaFactu"));
					
		this.jButtonRecargarInformacionToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPoliticaFactu"));
		
		this.jMenuItemRecargarInformacionPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPoliticaFactu"));		
		
		
		
		this.jButtonAnterioresPoliticaFactu.addActionListener (new ButtonActionListener(this,"AnterioresPoliticaFactu"));
		
		
		this.jButtonAnterioresToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPoliticaFactu"));
		
		this.jMenuItemAnterioresPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPoliticaFactu"));		
		
		
		this.jButtonSiguientesPoliticaFactu.addActionListener (new ButtonActionListener(this,"SiguientesPoliticaFactu"));
		
		
		this.jButtonSiguientesToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPoliticaFactu"));
			
		this.jMenuItemSiguientesPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPoliticaFactu"));
			
		this.jMenuItemAbrirOrderByPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPoliticaFactu"));
			
		this.jMenuItemMostrarOcultarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPoliticaFactu"));
			
		this.jMenuItemDetalleAbrirOrderByPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPoliticaFactu"));
			
		this.jMenuItemDetalleMostarOcultarPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPoliticaFactu"));		
		
		
		this.jButtonNuevoGuardarCambiosPoliticaFactu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPoliticaFactu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPoliticaFactu"));
			
		this.jMenuItemNuevoGuardarCambiosPoliticaFactu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPoliticaFactu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPoliticaFactu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPoliticaFactu"));

		this.jCheckBoxSeleccionadosPoliticaFactu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPoliticaFactu"));
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPoliticaFactu"));
		}
		
		
		this.jComboBoxTiposRelacionesPoliticaFactu.addActionListener (new ButtonActionListener(this,"TiposRelacionesPoliticaFactu"));
			
		this.jComboBoxTiposAccionesPoliticaFactu.addActionListener (new ButtonActionListener(this,"TiposAccionesPoliticaFactu"));
					
		this.jComboBoxTiposSeleccionarPoliticaFactu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPoliticaFactu"));
			
		this.jTextFieldValorCampoGeneralPoliticaFactu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPoliticaFactu"));		
		
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonidPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_empresaPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_empresaPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_sucursalPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_sucursalPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaFactuBusqueda"));
		//jButtonid_productoPoliticaFactu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPoliticaFactuActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactu.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_grupo_clientePoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clientePoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_grupo_clientePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clientePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonnombrePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"nombrePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonfecha_desdePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonfecha_hastaPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonporcentajePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonvalorPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"valorPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtoncon_banco_clientePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"con_banco_clientePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtoncon_banco_productoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"con_banco_productoPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtones_activoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"es_activoPoliticaFactuBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdGrupoClientePoliticaFactu.addActionListener(new ButtonActionListener(this,"FK_IdGrupoClientePoliticaFactu"));

			this.jButtonFK_IdProductoPoliticaFactu.addActionListener(new ButtonActionListener(this,"FK_IdProductoPoliticaFactu"));

			this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPoliticaFactu!=null) {
				this.jInternalFrameReporteDinamicoPoliticaFactu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaFactu"));
				this.jInternalFrameReporteDinamicoPoliticaFactu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaFactu"));
				this.jInternalFrameReporteDinamicoPoliticaFactu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaFactu"));
			}
			
			//this.jButtonCerrarReporteDinamicoPoliticaFactu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaFactu"));				
			//this.jButtonGenerarReporteDinamicoPoliticaFactu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaFactu"));
			//this.jButtonGenerarExcelReporteDinamicoPoliticaFactu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaFactu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPoliticaFactu!=null) {
				this.jInternalFrameImportacionPoliticaFactu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPoliticaFactu"));
				this.jInternalFrameImportacionPoliticaFactu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPoliticaFactu"));
				this.jInternalFrameImportacionPoliticaFactu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPoliticaFactu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPoliticaFactu.addActionListener (new ButtonActionListener(this,"AbrirOrderByPoliticaFactu"));
			
			this.jButtonAbrirOrderByToolBarPoliticaFactu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPoliticaFactu"));			
			
			if(this.jInternalFrameOrderByPoliticaFactu!=null) {
				this.jInternalFrameOrderByPoliticaFactu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPoliticaFactu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaFactu.jTabbedPaneRelacionesPoliticaFactu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPoliticaFactu"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFramePoliticaFactu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPoliticaFactu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPoliticaFactu = (JInternalFrameBase)event.getSource();
	            	
	            PoliticaFactuBeanSwingJInternalFrame jInternalFrameParent=(PoliticaFactuBeanSwingJInternalFrame)jInternalFrameDetalleFormPoliticaFactu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPoliticaFactuActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPoliticaFactu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPoliticaFactuListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPoliticaFactu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPoliticaFactu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaFactuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaFactuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaFactuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPoliticaFactu";
		inputMap = this.jButtonNuevoPoliticaFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPoliticaFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPoliticaFactuActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaFactuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaFactuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaFactuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPoliticaFactu";
		inputMap = this.jButtonNuevoRelacionesPoliticaFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPoliticaFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPoliticaFactuActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPoliticaFactu";
		inputMap = this.jButtonModificarPoliticaFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPoliticaFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPoliticaFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPoliticaFactu";
		inputMap = this.jButtonActualizarPoliticaFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPoliticaFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPoliticaFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPoliticaFactu";
		inputMap = this.jButtonEliminarPoliticaFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPoliticaFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPoliticaFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPoliticaFactu";
		inputMap = this.jButtonCancelarPoliticaFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPoliticaFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPoliticaFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPoliticaFactu";
		inputMap = this.jButtonCerrarPoliticaFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPoliticaFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPoliticaFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPoliticaFactu";
		inputMap = this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosPoliticaFactu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonGuardarCambiosPoliticaFactu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPoliticaFactuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPoliticaFactu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPoliticaFactuItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPoliticaFactu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPoliticaFactuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPoliticaFactu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPoliticaFactuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPoliticaFactu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPoliticaFactuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonidPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_empresaPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_empresaPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_sucursalPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_sucursalPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaFactuBusqueda"));
		//jButtonid_productoPoliticaFactu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPoliticaFactuActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactu.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_grupo_clientePoliticaFactuUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clientePoliticaFactuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_grupo_clientePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clientePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonnombrePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"nombrePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonfecha_desdePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonfecha_hastaPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonporcentajePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtonvalorPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"valorPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtoncon_banco_clientePoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"con_banco_clientePoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtoncon_banco_productoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"con_banco_productoPoliticaFactuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaFactu.jButtones_activoPoliticaFactuBusqueda.addActionListener(new ButtonActionListener(this,"es_activoPoliticaFactuBusqueda"));
		
		
		this.jButtonFK_IdGrupoClientePoliticaFactu.addActionListener(new ButtonActionListener(this,"FK_IdGrupoClientePoliticaFactu"));

		this.jButtonFK_IdProductoPoliticaFactu.addActionListener(new ButtonActionListener(this,"FK_IdProductoPoliticaFactu"));

		this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu.addActionListener(new ButtonActionListener(this,"id_productoPoliticaFactu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPoliticaFactu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPoliticaFactuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPoliticaFactuActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPoliticaFactu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPoliticaFactu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
					politicafactuAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaFactu politicafactuAux:politicafactus) {
					politicafactuAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPoliticaFactuItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPoliticaFactu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
						politicafactuAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaFactu politicafactuAux:politicafactus) {
						politicafactuAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
					
						if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE)) {
							existe=true;
							politicafactuAux.setcon_banco_cliente(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO)) {
							existe=true;
							politicafactuAux.setcon_banco_producto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							politicafactuAux.setes_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaFactu politicafactuAux:politicafactus) {
						
						if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE)) {
							existe=true;
							politicafactuAux.setcon_banco_cliente(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO)) {
							existe=true;
							politicafactuAux.setcon_banco_producto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							politicafactuAux.setes_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPoliticaFactu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPoliticaFactu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPoliticaFactu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPoliticaFactuItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPoliticaFactu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPoliticaFactu.getSelectedRows();
			
			PoliticaFactu politicafactuLocal=new PoliticaFactu();
			
			//this.seleccionarTodosPoliticaFactu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicafactuLocal =(PoliticaFactu) this.politicafactuLogic.getPoliticaFactus().toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					politicafactuLocal =(PoliticaFactu) this.politicafactus.toArray()[this.jTableDatosPoliticaFactu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				politicafactuLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
						politicafactuAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaFactu politicafactuAux:politicafactus) {
						politicafactuAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPoliticaFactu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPoliticaFactu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPoliticaFactu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPoliticaFactu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPoliticaFactuItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPoliticaFactuParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPoliticaFactuActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPoliticaFactu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPoliticaFactu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PoliticaFactu politicafactuAux:this.politicafactuLogic.getPoliticaFactus()) {
				
						if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							politicafactuAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							politicafactuAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							politicafactuAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							politicafactuAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							politicafactuAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaFactu politicafactuAux:politicafactus) {
					
						if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							politicafactuAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							politicafactuAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							politicafactuAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							politicafactuAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							politicafactuAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPoliticaFactu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPoliticaFactuActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPoliticaFactu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPoliticaFactu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPoliticaFactu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePoliticaFactu) {				
					conSplash=true;//false;										
					
					//this.startProcessPoliticaFactu(conSplash);
				
					this.generarReportePoliticaFactusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPoliticaFactusSeleccionados();
				//this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPoliticaFactusSeleccionados(false);
				//this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPoliticaFactusSeleccionados(true);
				//this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPoliticaFactu();
				
				this.exportarPoliticaFactusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPoliticaFactus();
				//this.importarPoliticaFactus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPoliticaFactu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPoliticaFactusSeleccionados();
				//this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Politica Factu", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPoliticaFactu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPoliticaFactu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPoliticaFactu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.setSelectedIndex(0);					
				}	
			} 			
			else if(PoliticaFactuBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePoliticaFactu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPoliticaFactu(conSplash);
					
						//this.actualizarParametrosGeneralPoliticaFactu();
						
						this.generarReporteProcesoAccionPoliticaFactusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PoliticaFactuBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Politica FactuS SELECCIONADOS?", "MANTENIMIENTO DE Politica Factu", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPoliticaFactu();
				
						this.actualizarParametrosGeneralPoliticaFactu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.politicafactuReturnGeneral=politicafactuLogic.procesarAccionPoliticaFactusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.politicafactuLogic.getPoliticaFactus(),this.politicafactuParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPoliticaFactuReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPoliticaFactu();
					
					PoliticaFactuBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPoliticaFactuReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPoliticaFactu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxTiposAccionesFormularioPoliticaFactu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPoliticaFactu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPoliticaFactuActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPoliticaFactu();
			
			if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		
			PoliticaFactu politicafactu=new PoliticaFactu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPoliticaFactu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPoliticaFactu.getSelectedItem();
			
			
			
			
			politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
			//this.sTipoAccion;
			
			if(politicafactusSeleccionados.size()==1) {
				for(PoliticaFactu politicafactuAux:politicafactusSeleccionados) {
					politicafactu=politicafactuAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPoliticaFactu();
			
      		//this.finishProcessPoliticaFactu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPoliticaFactuReturnGeneral() throws Exception {
		if(this.politicafactuReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.politicafactuReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.politicafactuReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.politicafactuReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.politicafactuReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.politicafactuReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPoliticaFactu(false);
		}
		
		if(this.politicafactuReturnGeneral.getConRetornoLista() || this.politicafactuReturnGeneral.getConRetornoObjeto()) {
			if(this.politicafactuReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.politicafactuLogic.setPoliticaFactus(this.politicafactuReturnGeneral.getPoliticaFactus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.politicafactuReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.politicafactuLogic.setPoliticaFactu(this.politicafactuReturnGeneral.getPoliticaFactu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPoliticaFactu(false);
		}
	}
	
	public void actualizarParametrosGeneralPoliticaFactu() throws Exception {
		
		
	}
	
	public ArrayList<PoliticaFactu> getPoliticaFactusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPoliticaFactu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PoliticaFactu politicafactuAux:politicafactuLogic.getPoliticaFactus()) {
					if(politicafactuAux.getIsSelected()) {
						politicafactusSeleccionados.add(politicafactuAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaFactu politicafactuAux:this.politicafactus) {
					if(politicafactuAux.getIsSelected()) {
						politicafactusSeleccionados.add(politicafactuAux);				
					}
				}
			}
			
			if(politicafactusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						politicafactusSeleccionados.addAll(this.politicafactuLogic.getPoliticaFactus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						politicafactusSeleccionados.addAll(this.politicafactus);				
					}
				}
			}
		} else {
			politicafactusSeleccionados.add(this.politicafactu);
		}
		
		return politicafactusSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReportePoliticaFactusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPoliticaFactusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPoliticaFactusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPoliticaFactusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPoliticaFactusSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Politica Factu",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPoliticaFactusSeleccionados() throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePoliticaFactus("Todos",politicafactusSeleccionados);
		
	}	
	
	public void generarReporteNormalPoliticaFactusSeleccionados() throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePoliticaFactus("Todos",politicafactusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPoliticaFactusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePoliticaFactus("Todos",politicafactusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPoliticaFactusSeleccionados() throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPoliticaFactu();
		
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPoliticaFactu();
		
		
		//this.generarReportePoliticaFactus("Todos",politicafactusSeleccionados ,politicafactuImplementable,politicafactuImplementableHome);
	}
	
	public void mostrarImportacionPoliticaFactus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPoliticaFactu();
		
		this.abrirFrameImportacionPoliticaFactu();		
		
			
		//this.generarReportePoliticaFactus("Todos",politicafactusSeleccionados ,politicafactuImplementable,politicafactuImplementableHome);
	}
	
	public void importarPoliticaFactus() throws Exception {		
	
	}
	
	public void exportarPoliticaFactusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPoliticaFactusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPoliticaFactusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPoliticaFactusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Politica Factu",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPoliticaFactusSeleccionados() throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicafactu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPoliticaFactu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PoliticaFactu politicafactuAux:politicafactusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPoliticaFactu(politicafactuAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//politicafactuAux.setsDetalleGeneralEntityReporte(politicafactuAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPoliticaFactu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaFactuConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPoliticaFactu(PoliticaFactu politicafactu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=politicafactu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getcon_banco_cliente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getcon_banco_producto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicafactu.getes_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPoliticaFactusSeleccionados() throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicafactu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PoliticaFactus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPoliticaFactu(row);				
				iRow++;
			}				
			
			for(PoliticaFactu politicafactuAux:politicafactusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPoliticaFactu(politicafactuAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPoliticaFactusSeleccionados() throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();		
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicafactu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("politicafactus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("politicafactu");
			//elementRoot.appendChild(element);
		
			for(PoliticaFactu politicafactuAux:politicafactusSeleccionados) {
				element = document.createElement("politicafactu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPoliticaFactu(politicafactuAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Factu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPoliticaFactu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaFactuConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPoliticaFactu(PoliticaFactu politicafactu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getcon_banco_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getcon_banco_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(politicafactu.getes_activo());				
	}
	
	public void setFilaDatosExportarXmlPoliticaFactu(PoliticaFactu politicafactu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PoliticaFactuConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(politicafactu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PoliticaFactuConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(politicafactu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PoliticaFactuConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(politicafactu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PoliticaFactuConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(politicafactu.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementproducto_descripcion = document.createElement(PoliticaFactuConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(politicafactu.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(PoliticaFactuConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(politicafactu.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementnombre = document.createElement(PoliticaFactuConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(politicafactu.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_desde = document.createElement(PoliticaFactuConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(politicafactu.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(PoliticaFactuConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(politicafactu.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementporcentaje = document.createElement(PoliticaFactuConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(politicafactu.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(PoliticaFactuConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(politicafactu.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementcon_banco_cliente = document.createElement(PoliticaFactuConstantesFunciones.CONBANCOCLIENTE);
		elementcon_banco_cliente.appendChild(document.createTextNode(politicafactu.getcon_banco_cliente().toString().trim()));
		element.appendChild(elementcon_banco_cliente);

		Element elementcon_banco_producto = document.createElement(PoliticaFactuConstantesFunciones.CONBANCOPRODUCTO);
		elementcon_banco_producto.appendChild(document.createTextNode(politicafactu.getcon_banco_producto().toString().trim()));
		element.appendChild(elementcon_banco_producto);

		Element elementes_activo = document.createElement(PoliticaFactuConstantesFunciones.ESACTIVO);
		elementes_activo.appendChild(document.createTextNode(politicafactu.getes_activo().toString().trim()));
		element.appendChild(elementes_activo);
	}
	
	public void generarReporteGroupGenericoPoliticaFactusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PoliticaFactu> politicafactusSeleccionados=new ArrayList<PoliticaFactu>();
		
		politicafactusSeleccionados=this.getPoliticaFactusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoPoliticaFactu(politicafactusSeleccionados);
		
		this.generarReportePoliticaFactus("Todos",politicafactusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPoliticaFactu(ArrayList<PoliticaFactu> politicafactusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PoliticaFactu politicafactuAux:politicafactusSeleccionados) {
				politicafactuAux.setsDetalleGeneralEntityReporte(politicafactuAux.toString());
			
				if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(politicafactuAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(politicafactuAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(politicafactuAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(politicafactuAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(politicafactuAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(politicafactuAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(politicafactuAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(politicafactuAux.getcon_banco_cliente()));
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(politicafactuAux.getcon_banco_producto()));
				}
				 else if(sTipoSeleccionar.equals(PoliticaFactuConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					politicafactuAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(politicafactuAux.getes_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaFactuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPoliticaFactu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPoliticaFactu=true;
				this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=true;
				this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=true;
			}
			
			this.isVisibilidadCeldaModificarPoliticaFactu=false;
			this.isVisibilidadCeldaActualizarPoliticaFactu=false;
			this.isVisibilidadCeldaEliminarPoliticaFactu=false;
			this.isVisibilidadCeldaCancelarPoliticaFactu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaFactu=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPoliticaFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=false;
			this.isVisibilidadCeldaModificarPoliticaFactu=false;
			this.isVisibilidadCeldaActualizarPoliticaFactu=true;
			this.isVisibilidadCeldaEliminarPoliticaFactu=false;
			this.isVisibilidadCeldaCancelarPoliticaFactu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaFactu=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPoliticaFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=false;
			this.isVisibilidadCeldaModificarPoliticaFactu=false;
			this.isVisibilidadCeldaActualizarPoliticaFactu=true;
			this.isVisibilidadCeldaEliminarPoliticaFactu=true;
			this.isVisibilidadCeldaCancelarPoliticaFactu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaFactu=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPoliticaFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=false;
			this.isVisibilidadCeldaModificarPoliticaFactu=false;
			this.isVisibilidadCeldaActualizarPoliticaFactu=true;
			this.isVisibilidadCeldaEliminarPoliticaFactu=false;
			this.isVisibilidadCeldaCancelarPoliticaFactu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPoliticaFactu=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=true;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=true;
			this.isVisibilidadCeldaModificarPoliticaFactu=false;
			this.isVisibilidadCeldaActualizarPoliticaFactu=false;
			this.isVisibilidadCeldaEliminarPoliticaFactu=false;
			this.isVisibilidadCeldaCancelarPoliticaFactu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaFactu=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPoliticaFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=false;
			this.isVisibilidadCeldaActualizarPoliticaFactu=false;
			this.isVisibilidadCeldaEliminarPoliticaFactu=false;
			this.isVisibilidadCeldaCancelarPoliticaFactu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPoliticaFactu=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=false;
			this.isVisibilidadCeldaModificarPoliticaFactu=true;
			this.isVisibilidadCeldaActualizarPoliticaFactu=false;
			this.isVisibilidadCeldaEliminarPoliticaFactu=false;
			this.isVisibilidadCeldaCancelarPoliticaFactu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaFactu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPoliticaFactu=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=true;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=true;
		} else {
			this.actualizarEstadoPanelsPoliticaFactu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPoliticaFactu=false;
			//this.isVisibilidadCeldaVerFormPoliticaFactu=false;
			this.isVisibilidadCeldaDuplicarPoliticaFactu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!politicafactuSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
		} else {
			this.isVisibilidadCeldaNuevoPoliticaFactu=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaFactu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(politicafactuSessionBean.getEsGuardarRelacionado()) {
			if(!politicafactuSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;												
			}
			
			this.jButtonCerrarPoliticaFactu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPoliticaFactu=false;
		}
		
		if(!this.permiteMantenimiento(this.politicafactu)) {
			this.isVisibilidadCeldaActualizarPoliticaFactu=false;
			this.isVisibilidadCeldaEliminarPoliticaFactu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPoliticaFactu() {
	}
	
	public void actualizarEstadoPanelsPoliticaFactu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPoliticaFactu!=null) {
				this.jScrollPanelDatosEdicionPoliticaFactu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaFactu!=null) {
				this.jScrollPanelDatosPoliticaFactu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaFactu!=null) {
				this.jPanelPaginacionPoliticaFactu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPoliticaFactu!=null) {
				this.jScrollPanelDatosEdicionPoliticaFactu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPoliticaFactu!=null) {
				this.jScrollPanelDatosPoliticaFactu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaFactu!=null) {
				this.jPanelPaginacionPoliticaFactu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPoliticaFactu!=null) {
				this.jScrollPanelDatosEdicionPoliticaFactu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaFactu!=null) {
				this.jScrollPanelDatosPoliticaFactu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaFactu!=null) {
				this.jPanelPaginacionPoliticaFactu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPoliticaFactu!=null) {
				this.jScrollPanelDatosEdicionPoliticaFactu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaFactu!=null) {
				this.jScrollPanelDatosPoliticaFactu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaFactu!=null) {
				this.jPanelPaginacionPoliticaFactu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPoliticaFactu!=null) {
				this.jScrollPanelDatosEdicionPoliticaFactu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaFactu!=null) {
				this.jScrollPanelDatosPoliticaFactu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaFactu!=null) {
				this.jPanelPaginacionPoliticaFactu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPoliticaFactu!=null) {
				this.jScrollPanelDatosEdicionPoliticaFactu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaFactu!=null) {
				this.jScrollPanelDatosPoliticaFactu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaFactu!=null) {
				this.jPanelPaginacionPoliticaFactu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPoliticaFactu!=null) {
				this.jScrollPanelDatosEdicionPoliticaFactu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaFactu!=null) {
				this.jScrollPanelDatosPoliticaFactu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaFactu!=null) {
				this.jPanelPaginacionPoliticaFactu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
					this.jTabbedPaneBusquedasPoliticaFactu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaFactu!=null) {
				this.jTabbedPaneBusquedasPoliticaFactu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPoliticaFactu!=null) {
				this.jPanelParametrosReportesPoliticaFactu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdGrupoCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdGrupoCliente) {this.jTabbedPaneBusquedasPoliticaFactu.remove(jPanelFK_IdGrupoClientePoliticaFactu);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPoliticaFactu.remove(jPanelFK_IdProductoPoliticaFactu);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdGrupoCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdGrupoCliente) {this.jTabbedPaneBusquedasPoliticaFactu.remove(jPanelFK_IdGrupoClientePoliticaFactu);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPoliticaFactu.remove(jPanelFK_IdProductoPoliticaFactu);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdGrupoCliente=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdGrupoCliente) {this.jTabbedPaneBusquedasPoliticaFactu.remove(jPanelFK_IdGrupoClientePoliticaFactu);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPoliticaFactu.remove(jPanelFK_IdProductoPoliticaFactu);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadFK_IdGrupoCliente=isParaGrupoCliente;
			if(!this.isVisibilidadFK_IdGrupoCliente) {this.jTabbedPaneBusquedasPoliticaFactu.remove(jPanelFK_IdGrupoClientePoliticaFactu);}

			this.isVisibilidadFK_IdProducto=isParaGrupoClienteNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPoliticaFactu.remove(jPanelFK_IdProductoPoliticaFactu);}
		}
		
	}
	
	
	
	

	public String registrarSesionPoliticaFactuParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(politicafactuSessionBean==null) {
				politicafactuSessionBean=new PoliticaFactuSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(politicafactuSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.politicafactuFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(PoliticaFactuConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionPoliticaFactu(true);
			//productoSessionBean.setlidPoliticaFactuActual(this.idPoliticaFactuActual);

			politicafactuSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPoliticaFactu(true);
			politicafactuSessionBean.setlIdPoliticaFactuActualForeignKey(this.idPoliticaFactuActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PoliticaFactuSessionBean politicafactuSessionBean=new PoliticaFactuSessionBean();
		
		if(this.politicafactuSessionBean==null) {
			this.politicafactuSessionBean=new PoliticaFactuSessionBean();
		}
		
		this.politicafactuSessionBean.setsUltimaBusquedaPoliticaFactu(this.getsAccionBusqueda());
		this.politicafactuSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.politicafactuSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			politicafactuSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdGrupoCliente")) {
			politicafactuSessionBean.setid_grupo_cliente(this.getid_grupo_clienteFK_IdGrupoCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			politicafactuSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			politicafactuSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PoliticaFactuSessionBean politicafactuSessionBean=new PoliticaFactuSessionBean();
		
		if(this.politicafactuSessionBean==null) {
			this.politicafactuSessionBean=new PoliticaFactuSessionBean();
		}
		
		if(this.politicafactuSessionBean.getsUltimaBusquedaPoliticaFactu()!=null&&!this.politicafactuSessionBean.getsUltimaBusquedaPoliticaFactu().equals("")) {
			this.setsAccionBusqueda(politicafactuSessionBean.getsUltimaBusquedaPoliticaFactu());
			this.setiNumeroPaginacion(politicafactuSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(politicafactuSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(politicafactuSessionBean.getid_empresa());
				politicafactuSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdGrupoCliente")) {
				this.setid_grupo_clienteFK_IdGrupoCliente(politicafactuSessionBean.getid_grupo_cliente());
				politicafactuSessionBean.setid_grupo_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(politicafactuSessionBean.getid_producto());
				politicafactuSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(politicafactuSessionBean.getid_sucursal());
				politicafactuSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.politicafactuSessionBean.setsUltimaBusquedaPoliticaFactu("");
		this.politicafactuSessionBean.setiNumeroPaginacion(PoliticaFactuConstantesFunciones.INUMEROPAGINACION);
		this.politicafactuSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPoliticaFactu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPoliticaFactu() {
		this.updateBorderResaltarBusquedasFormularioPoliticaFactu();
		this.updateVisibilidadBusquedasFormularioPoliticaFactu();
		this.updateHabilitarBusquedasFormularioPoliticaFactu();
	}
	
	public void updateBorderResaltarBusquedasFormularioPoliticaFactu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPoliticaFactu.getComponents().length>0) {
	

		if(this.politicafactuConstantesFunciones.resaltarFK_IdGrupoClientePoliticaFactu!=null) {
			index= this.jTabbedPaneBusquedasPoliticaFactu.indexOfComponent(this.jPanelFK_IdGrupoClientePoliticaFactu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaFactu.getComponent(index);
				jPanel.setBorder(this.politicafactuConstantesFunciones.resaltarFK_IdGrupoClientePoliticaFactu);
			}
		}

		if(this.politicafactuConstantesFunciones.resaltarFK_IdProductoPoliticaFactu!=null) {
			index= this.jTabbedPaneBusquedasPoliticaFactu.indexOfComponent(this.jPanelFK_IdProductoPoliticaFactu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaFactu.getComponent(index);
				jPanel.setBorder(this.politicafactuConstantesFunciones.resaltarFK_IdProductoPoliticaFactu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPoliticaFactu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPoliticaFactu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPoliticaFactu.indexOfComponent(this.jPanelFK_IdGrupoClientePoliticaFactu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaFactu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.politicafactuConstantesFunciones.mostrarFK_IdGrupoClientePoliticaFactu);
			if(!this.politicafactuConstantesFunciones.mostrarFK_IdGrupoClientePoliticaFactu && index>-1) {
				this.jTabbedPaneBusquedasPoliticaFactu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPoliticaFactu.indexOfComponent(this.jPanelFK_IdProductoPoliticaFactu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaFactu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.politicafactuConstantesFunciones.mostrarFK_IdProductoPoliticaFactu);
			if(!this.politicafactuConstantesFunciones.mostrarFK_IdProductoPoliticaFactu && index>-1) {
				this.jTabbedPaneBusquedasPoliticaFactu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPoliticaFactu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPoliticaFactu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPoliticaFactu.indexOfComponent(this.jPanelFK_IdGrupoClientePoliticaFactu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaFactu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.politicafactuConstantesFunciones.activarFK_IdGrupoClientePoliticaFactu);
				this.jTabbedPaneBusquedasPoliticaFactu.setEnabledAt(index,this.politicafactuConstantesFunciones.activarFK_IdGrupoClientePoliticaFactu);
			}

			index= this.jTabbedPaneBusquedasPoliticaFactu.indexOfComponent(this.jPanelFK_IdProductoPoliticaFactu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaFactu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.politicafactuConstantesFunciones.activarFK_IdProductoPoliticaFactu);
				this.jTabbedPaneBusquedasPoliticaFactu.setEnabledAt(index,this.politicafactuConstantesFunciones.activarFK_IdProductoPoliticaFactu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPoliticaFactu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdGrupoCliente")) {
			index= this.jTabbedPaneBusquedasPoliticaFactu.indexOfComponent(this.jPanelFK_IdGrupoClientePoliticaFactu);

			this.jTabbedPaneBusquedasPoliticaFactu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaFactu.getComponent(index);

			this.politicafactuConstantesFunciones.setResaltarFK_IdGrupoClientePoliticaFactu(resaltar);

			jPanel.setBorder(this.politicafactuConstantesFunciones.resaltarFK_IdGrupoClientePoliticaFactu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasPoliticaFactu.indexOfComponent(this.jPanelFK_IdProductoPoliticaFactu);

			this.jTabbedPaneBusquedasPoliticaFactu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaFactu.getComponent(index);

			this.politicafactuConstantesFunciones.setResaltarFK_IdProductoPoliticaFactu(resaltar);

			jPanel.setBorder(this.politicafactuConstantesFunciones.resaltarFK_IdProductoPoliticaFactu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPoliticaFactu.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioPoliticaFactu() throws Exception {

		if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPoliticaFactu();
		this.updateVisibilidadResaltarControlesFormularioPoliticaFactu();
		this.updateHabilitarResaltarControlesFormularioPoliticaFactu();
		
	}
	
	public void updateBorderResaltarControlesFormularioPoliticaFactu() throws Exception {
		if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.politicafactuConstantesFunciones.resaltaridPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltaridPoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarid_empresaPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarid_empresaPoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarid_sucursalPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarid_sucursalPoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarid_productoPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarid_productoPoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarid_grupo_clientePoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarid_grupo_clientePoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarnombrePoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jTextAreanombrePoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarnombrePoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarfecha_desdePoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_desdePoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarfecha_desdePoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarfecha_hastaPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_hastaPoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarfecha_hastaPoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarporcentajePoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldporcentajePoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarporcentajePoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarvalorPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldvalorPoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarvalorPoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarcon_banco_clientePoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.setBorderPainted(true);this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarcon_banco_clientePoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltarcon_banco_productoPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.setBorderPainted(true);this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltarcon_banco_productoPoliticaFactu);}
		if(this.politicafactuConstantesFunciones.resaltares_activoPoliticaFactu!=null && this.jInternalFrameDetalleFormPoliticaFactu!=null) {this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.setBorderPainted(true);this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.setBorder(this.politicafactuConstantesFunciones.resaltares_activoPoliticaFactu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPoliticaFactu() throws Exception {		
		if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
	
		//this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostraridPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelidPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostraridPoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_empresaPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelid_empresaPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_empresaPoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_sucursalPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelid_sucursalPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_sucursalPoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_productoPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelid_productoPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_productoPoliticaFactu);
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_productoPoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_grupo_clientePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelid_grupo_clientePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarid_grupo_clientePoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jTextAreanombrePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarnombrePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelnombrePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarnombrePoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_desdePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarfecha_desdePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelfecha_desdePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarfecha_desdePoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_hastaPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarfecha_hastaPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelfecha_hastaPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarfecha_hastaPoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldporcentajePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarporcentajePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelporcentajePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarporcentajePoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldvalorPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarvalorPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelvalorPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarvalorPoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarcon_banco_clientePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelcon_banco_clientePoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarcon_banco_clientePoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarcon_banco_productoPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPanelcon_banco_productoPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrarcon_banco_productoPoliticaFactu);
		//this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrares_activoPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jPaneles_activoPoliticaFactu.setVisible(this.politicafactuConstantesFunciones.mostrares_activoPoliticaFactu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPoliticaFactu() throws Exception {
		if(this.jInternalFrameDetalleFormPoliticaFactu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPoliticaFactu!=null) {
	
		this.jInternalFrameDetalleFormPoliticaFactu.jLabelidPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activaridPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_empresaPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarid_empresaPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_sucursalPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarid_sucursalPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_productoPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarid_productoPoliticaFactu);
			this.jInternalFrameDetalleFormPoliticaFactu.jButtonid_productoPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarid_productoPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jComboBoxid_grupo_clientePoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarid_grupo_clientePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jTextAreanombrePoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarnombrePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_desdePoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarfecha_desdePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jDateChooserfecha_hastaPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarfecha_hastaPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldporcentajePoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarporcentajePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jTextFieldvalorPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarvalorPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_clientePoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarcon_banco_clientePoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxcon_banco_productoPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activarcon_banco_productoPoliticaFactu);
		this.jInternalFrameDetalleFormPoliticaFactu.jCheckBoxes_activoPoliticaFactu.setEnabled(this.politicafactuConstantesFunciones.activares_activoPoliticaFactu);
		}
	}
	
		
}