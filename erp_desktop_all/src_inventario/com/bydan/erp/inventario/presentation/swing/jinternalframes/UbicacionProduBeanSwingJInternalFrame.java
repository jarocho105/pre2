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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.UbicacionProduConstantesFunciones;
import com.bydan.erp.inventario.util.UbicacionProduParameterReturnGeneral;
//import com.bydan.erp.inventario.util.UbicacionProduParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.UbicacionProduBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class UbicacionProduBeanSwingJInternalFrame extends UbicacionProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UbicacionProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<UbicacionProdu> ubicacionproduValidator = new ClassValidator<UbicacionProdu>(UbicacionProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public UbicacionProdu ubicacionprodu;	
	public UbicacionProdu ubicacionproduAux;
	public UbicacionProdu ubicacionproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public UbicacionProdu ubicacionproduTotales;
	public Long idUbicacionProduActual;
	public Long iIdNuevoUbicacionProdu=0L;
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

	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
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

	public String sFinalQueryComboUbicacionBode="";

	public List<UbicacionBode> ubicacionbodesForeignKey;

	public List<UbicacionBode> getubicacionbodesForeignKey() {
		return ubicacionbodesForeignKey;
	}

	public void setubicacionbodesForeignKey(List<UbicacionBode> ubicacionbodesForeignKey) {
		this.ubicacionbodesForeignKey = ubicacionbodesForeignKey;
	}

	//OBJETO FK ACTUAL
	public UbicacionBode ubicacionbodeForeignKey;

	public UbicacionBode getubicacionbodeForeignKey() {
		return ubicacionbodeForeignKey;
	}

	public void setubicacionbodeForeignKey(UbicacionBode ubicacionbodeForeignKey) {
		this.ubicacionbodeForeignKey = ubicacionbodeForeignKey;
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
	
	public Boolean isPermisoTodoUbicacionProdu;
	public Boolean isPermisoNuevoUbicacionProdu;
	public Boolean isPermisoActualizarUbicacionProdu;
	public Boolean isPermisoActualizarOriginalUbicacionProdu;
	public Boolean isPermisoEliminarUbicacionProdu;
	public Boolean isPermisoGuardarCambiosUbicacionProdu;
	public Boolean isPermisoConsultaUbicacionProdu;
	public Boolean isPermisoBusquedaUbicacionProdu;
	public Boolean isPermisoReporteUbicacionProdu;
	public Boolean isPermisoPaginacionMedioUbicacionProdu;
	public Boolean isPermisoPaginacionAltoUbicacionProdu;
	public Boolean isPermisoPaginacionTodoUbicacionProdu;
	public Boolean isPermisoCopiarUbicacionProdu;
	public Boolean isPermisoVerFormUbicacionProdu;
	public Boolean isPermisoDuplicarUbicacionProdu;
	public Boolean isPermisoOrdenUbicacionProdu;
	
	
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
	
	public UbicacionProduParameterReturnGeneral ubicacionproduReturnGeneral;
	public UbicacionProduParameterReturnGeneral ubicacionproduParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUbicacionProdu=false;
	public Boolean esParaAccionDesdeFormularioUbicacionProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UbicacionProduSessionBeanAdditional ubicacionproduSessionBeanAdditional=null;
	
	public UbicacionProduSessionBeanAdditional getUbicacionProduSessionBeanAdditional() {
		return this.ubicacionproduSessionBeanAdditional;
	}
	
	public void setUbicacionProduSessionBeanAdditional(UbicacionProduSessionBeanAdditional ubicacionproduSessionBeanAdditional) {
		try {
			this.ubicacionproduSessionBeanAdditional=ubicacionproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UbicacionProduBeanSwingJInternalFrameAdditional ubicacionproduBeanSwingJInternalFrameAdditional=null;
	//public class UbicacionProduBeanSwingJInternalFrame
	
	public UbicacionProduBeanSwingJInternalFrameAdditional getUbicacionProduBeanSwingJInternalFrameAdditional() {
		return this.ubicacionproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setUbicacionProduBeanSwingJInternalFrameAdditional(UbicacionProduBeanSwingJInternalFrameAdditional ubicacionproduBeanSwingJInternalFrameAdditional) {
		try {
			this.ubicacionproduBeanSwingJInternalFrameAdditional=ubicacionproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UbicacionProduLogic ubicacionproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public UbicacionProdu ubicacionproduBean;
	public UbicacionProduConstantesFunciones ubicacionproduConstantesFunciones;
	//public UbicacionProduParameterReturnGeneral ubicacionproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UbicacionBodeLogic ubicacionbodeLogic;
	
	//PARAMETROS
	
	
	//public List<UbicacionProdu> ubicacionprodus;	
	//public List<UbicacionProdu> ubicacionprodusEliminados;
	//public List<UbicacionProdu> ubicacionprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUbicacionProdu=false;
	public Boolean isVisibilidadCeldaDuplicarUbicacionProdu=true;
	public Boolean isVisibilidadCeldaCopiarUbicacionProdu=true;
	public Boolean isVisibilidadCeldaVerFormUbicacionProdu=true;
	public Boolean isVisibilidadCeldaOrdenUbicacionProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
	public Boolean isVisibilidadCeldaModificarUbicacionProdu=false;
	public Boolean isVisibilidadCeldaActualizarUbicacionProdu=false;
	public Boolean isVisibilidadCeldaEliminarUbicacionProdu=false;
	public Boolean isVisibilidadCeldaCancelarUbicacionProdu=false;
	public Boolean isVisibilidadCeldaGuardarUbicacionProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUbicacionProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUbicacionBode=false;
	
	public Long getiIdNuevoUbicacionProdu() {
		return this.iIdNuevoUbicacionProdu;
	}

	public void setiIdNuevoUbicacionProdu(Long iIdNuevoUbicacionProdu) {
		this.iIdNuevoUbicacionProdu = iIdNuevoUbicacionProdu;
	}
	
	public Long getidUbicacionProduActual() {
		return this.idUbicacionProduActual;
	}

	public void setidUbicacionProduActual(Long idUbicacionProduActual) {
		this.idUbicacionProduActual = idUbicacionProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public UbicacionProdu getubicacionprodu() {
		return this.ubicacionprodu;
	}

	public void setubicacionprodu(UbicacionProdu ubicacionprodu) {
		this.ubicacionprodu = ubicacionprodu;
	}
	
	public UbicacionProdu getubicacionproduAux() {
		return this.ubicacionproduAux;
	}

	public void setubicacionproduAux(UbicacionProdu ubicacionproduAux) {
		this.ubicacionproduAux = ubicacionproduAux;
	}				
	
	public UbicacionProdu getubicacionproduAnterior() {
		return this.ubicacionproduAnterior;
	}

	public void setubicacionproduAnterior(UbicacionProdu ubicacionproduAnterior) {
		this.ubicacionproduAnterior = ubicacionproduAnterior;
	}	
	
	public UbicacionProdu getubicacionproduTotales() {
		return this.ubicacionproduTotales;
	}

	public void setubicacionproduTotales(UbicacionProdu ubicacionproduTotales) {
		this.ubicacionproduTotales = ubicacionproduTotales;
	}	
	
	public UbicacionProdu getubicacionproduBean() {
		return this.ubicacionproduBean;
	}

	public void setubicacionproduBean(UbicacionProdu ubicacionproduBean) {
		this.ubicacionproduBean = ubicacionproduBean;
	}	
	
	public UbicacionProduParameterReturnGeneral getubicacionproduReturnGeneral() {
		return this.ubicacionproduReturnGeneral;
	}

	public void setubicacionproduReturnGeneral(UbicacionProduParameterReturnGeneral ubicacionproduReturnGeneral) {
		this.ubicacionproduReturnGeneral = ubicacionproduReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
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

	public Long id_ubicacion_bodeFK_IdUbicacionBode=-1L;

	public Long getid_ubicacion_bodeFK_IdUbicacionBode() {
		return this.id_ubicacion_bodeFK_IdUbicacionBode;
	}

	public void setid_ubicacion_bodeFK_IdUbicacionBode(Long id_ubicacion_bodeFK_IdUbicacionBode) {
		this.id_ubicacion_bodeFK_IdUbicacionBode = id_ubicacion_bodeFK_IdUbicacionBode;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public UbicacionProduLogic getUbicacionProduLogic()	{		
		return ubicacionproduLogic;
	}

	public void setUbicacionProduLogic(UbicacionProduLogic ubicacionproduLogic) {
		this.ubicacionproduLogic = ubicacionproduLogic;
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
	
	public Boolean getIsEsNuevoUbicacionProdu() {
		return isEsNuevoUbicacionProdu;
	}

	public void setIsEsNuevoUbicacionProdu(Boolean isEsNuevoUbicacionProdu) {
		this.isEsNuevoUbicacionProdu = isEsNuevoUbicacionProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioUbicacionProdu() {
		return esParaAccionDesdeFormularioUbicacionProdu;
	}
	
	public void setEsParaAccionDesdeFormularioUbicacionProdu(Boolean esParaAccionDesdeFormularioUbicacionProdu) {
		this.esParaAccionDesdeFormularioUbicacionProdu = esParaAccionDesdeFormularioUbicacionProdu;
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

			if(this.ubicacionproduSessionBean==null) {
				this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
			}

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ubicacionproduSessionBean.getlidEmpresaActual());
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

			if(this.ubicacionproduSessionBean==null) {
				this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
			}

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ubicacionproduSessionBean.getlidSucursalActual());
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

	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.ubicacionproduSessionBean==null) {
				this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
			}

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(ubicacionproduSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

			if(this.ubicacionproduSessionBean==null) {
				this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
			}

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(ubicacionproduSessionBean.getlidProductoActual());
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

	public void cargarCombosUbicacionBodesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ubicacionbodesForeignKey=new ArrayList<UbicacionBode>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UbicacionBodeLogic ubicacionbodeLogic=new UbicacionBodeLogic();

			//ubicacionbodeLogic.getUbicacionBodeDataAccess().setIsForForeingKeyData(true);

			if(this.ubicacionproduSessionBean==null) {
				this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
			}

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionUbicacionBode()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ubicacionbodeLogic.getUbicacionBodeDataAccess().setIsForForeingKeyData(true);

					ubicacionbodeLogic.getTodosUbicacionBodesWithConnection(sFinalQuery,new Pagination());

					this.ubicacionbodesForeignKey=ubicacionbodeLogic.getUbicacionBodes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUbicacionBode(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionbodeLogic.getEntityWithConnection(ubicacionproduSessionBean.getlidUbicacionBodeActual());
					this.ubicacionbodesForeignKey.add(ubicacionbodeLogic.getUbicacionBode());
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

					if(this.ubicacionprodu!=null) {
						this.ubicacionprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaUbicacionProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaUbicacionProduGenerico)throws Exception
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
				jComboBoxid_empresaUbicacionProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaUbicacionProduGenerico!=null && jComboBoxid_empresaUbicacionProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaUbicacionProduGenerico.setSelectedIndex(0);
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

					if(this.ubicacionprodu!=null) {
						this.ubicacionprodu.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalUbicacionProdu.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalUbicacionProduGenerico)throws Exception
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
				jComboBoxid_sucursalUbicacionProduGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalUbicacionProduGenerico!=null && jComboBoxid_sucursalUbicacionProduGenerico.getItemCount()>0) {
					jComboBoxid_sucursalUbicacionProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.ubicacionprodu!=null) {
						this.ubicacionprodu.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaUbicacionProdu.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaUbicacionProdu!=null) {
						jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaUbicacionProdu!=null) {
							//jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaUbicacionProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaUbicacionProduGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaUbicacionProduGenerico!=null && jComboBoxid_bodegaUbicacionProduGenerico.getItemCount()>0) {
					jComboBoxid_bodegaUbicacionProduGenerico.setSelectedIndex(0);
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

					if(this.ubicacionprodu!=null) {
						this.ubicacionprodu.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoUbicacionProdu.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoUbicacionProduGenerico)throws Exception
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
				jComboBoxid_productoUbicacionProduGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoUbicacionProduGenerico!=null && jComboBoxid_productoUbicacionProduGenerico.getItemCount()>0) {
					jComboBoxid_productoUbicacionProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUbicacionBodeForeignKey(Long idUbicacionBodeSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			UbicacionBode  ubicacionbodeTemp=null;

			for(UbicacionBode ubicacionbodeAux:ubicacionbodesForeignKey) {
				if(ubicacionbodeAux.getId()!=null && ubicacionbodeAux.getId().equals(idUbicacionBodeSeleccionado)) {
					ubicacionbodeTemp=ubicacionbodeAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ubicacionbodeTemp!=null) {

					if(this.ubicacionprodu!=null) {
						this.ubicacionprodu.setUbicacionBode(ubicacionbodeTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setSelectedItem(ubicacionbodeTemp);
					}
				} else {
					//jComboBoxid_ubicacion_bodeUbicacionProdu.setSelectedItem(ubicacionbodeTemp);
					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
						if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUbicacionBode") || sFormularioTipoBusqueda.equals("Todos")){
					if(ubicacionbodeTemp!=null && jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu!=null) {
						jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setSelectedItem(ubicacionbodeTemp);
					} else {
						if(jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu!=null) {
							//jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setSelectedItem(ubicacionbodeTemp);
							if(jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.getItemCount()>0) {
								jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setSelectedIndex(0);
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

	public String getActualUbicacionBodeForeignKeyDescripcion(Long idUbicacionBodeSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			UbicacionBode  ubicacionbodeTemp=null;

			for(UbicacionBode ubicacionbodeAux:ubicacionbodesForeignKey) {
				if(ubicacionbodeAux.getId()!=null && ubicacionbodeAux.getId().equals(idUbicacionBodeSeleccionado)) {
					ubicacionbodeTemp=ubicacionbodeAux;
					break;
				}
			}


			sDescripcion=UbicacionBodeConstantesFunciones.getUbicacionBodeDescripcion(ubicacionbodeTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUbicacionBodeForeignKeyGenerico(Long idUbicacionBodeSeleccionado,JComboBox jComboBoxid_ubicacion_bodeUbicacionProduGenerico)throws Exception
	{
		try
		{
			UbicacionBode  ubicacionbodeTemp=null;

			for(UbicacionBode ubicacionbodeAux:ubicacionbodesForeignKey) {
				if(ubicacionbodeAux.getId()!=null && ubicacionbodeAux.getId().equals(idUbicacionBodeSeleccionado)) {
					ubicacionbodeTemp=ubicacionbodeAux;
					break;
				}
			}

			if(ubicacionbodeTemp!=null) {
				jComboBoxid_ubicacion_bodeUbicacionProduGenerico.setSelectedItem(ubicacionbodeTemp);
			} else {
				if(jComboBoxid_ubicacion_bodeUbicacionProduGenerico!=null && jComboBoxid_ubicacion_bodeUbicacionProduGenerico.getItemCount()>0) {
					jComboBoxid_ubicacion_bodeUbicacionProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(UbicacionProdu ubicacionprodu,JComboBox jComboBoxid_empresaUbicacionProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaUbicacionProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaUbicacionProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ubicacionprodu.setid_empresa(empresaAux.getId());
				ubicacionprodu.setempresa_descripcion(UbicacionProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ubicacionprodu.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(UbicacionProdu ubicacionprodu,JComboBox jComboBoxid_sucursalUbicacionProduGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalUbicacionProduGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalUbicacionProduGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ubicacionprodu.setid_sucursal(sucursalAux.getId());
				ubicacionprodu.setsucursal_descripcion(UbicacionProduConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ubicacionprodu.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(UbicacionProdu ubicacionprodu,JComboBox jComboBoxid_bodegaUbicacionProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaUbicacionProduGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaUbicacionProduGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				ubicacionprodu.setid_bodega(bodegaAux.getId());
				ubicacionprodu.setbodega_descripcion(UbicacionProduConstantesFunciones.getBodegaDescripcion(bodegaAux));
				ubicacionprodu.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(UbicacionProdu ubicacionprodu,JComboBox jComboBoxid_productoUbicacionProduGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoUbicacionProduGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoUbicacionProduGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				ubicacionprodu.setid_producto(productoAux.getId());
				ubicacionprodu.setproducto_descripcion(UbicacionProduConstantesFunciones.getProductoDescripcion(productoAux));
				ubicacionprodu.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUbicacionBodeForeignKey(UbicacionProdu ubicacionprodu,JComboBox jComboBoxid_ubicacion_bodeUbicacionProduGenerico)throws Exception
	{
		try
		{
			UbicacionBode  ubicacionbodeAux=new UbicacionBode();

			if(jComboBoxid_ubicacion_bodeUbicacionProduGenerico==null) {
				ubicacionbodeAux=(UbicacionBode)this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.getSelectedItem();
			} else {
				ubicacionbodeAux=(UbicacionBode)jComboBoxid_ubicacion_bodeUbicacionProduGenerico.getSelectedItem();
			}

			if(ubicacionbodeAux!=null && ubicacionbodeAux.getId()!=null) {
				ubicacionprodu.setid_ubicacion_bode(ubicacionbodeAux.getId());
				ubicacionprodu.setubicacionbode_descripcion(UbicacionProduConstantesFunciones.getUbicacionBodeDescripcion(ubicacionbodeAux));
				ubicacionprodu.setUbicacionBode(ubicacionbodeAux);			}
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

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
					}

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
					}

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
					}

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.addItem(bodega);
							}
						}

						if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
					}

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUbicacionBodesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUbicacionBode=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.removeAllItems();

							for(UbicacionBode ubicacionbode:this.ubicacionbodesForeignKey) {
								this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.addItem(ubicacionbode);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { 
					}

					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUbicacionBode") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.removeAllItems();

							for(UbicacionBode ubicacionbode:this.ubicacionbodesForeignKey) {
								this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.addItem(ubicacionbode);
							}
						}

						if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUbicacionBodeForeignKey(UbicacionBode ubicacionbode,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setSelectedItem(ubicacionbode);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setSelectedItem(ubicacionbode);
						} else {
							this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesUbicacionProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UbicacionProduConstantesFunciones.refrescarForeignKeysDescripcionesUbicacionProdu(this.ubicacionproduLogic.getUbicacionProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UbicacionProduConstantesFunciones.refrescarForeignKeysDescripcionesUbicacionProdu(this.ubicacionprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(UbicacionBode.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//ubicacionproduLogic.setUbicacionProdus(this.ubicacionprodus);
			ubicacionproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public UbicacionProduParameterReturnGeneral getUbicacionProduParameterGeneral() {
		return this.ubicacionproduParameterGeneral;
	}
	
	public void setUbicacionProduParameterGeneral(UbicacionProduParameterReturnGeneral ubicacionproduParameterGeneral) {
		this.ubicacionproduParameterGeneral = ubicacionproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUbicacionProdu() {
		return isPermisoTodoUbicacionProdu;
	}

	public void setIsPermisoTodoUbicacionProdu(Boolean isPermisoTodoUbicacionProdu) {
		this.isPermisoTodoUbicacionProdu = isPermisoTodoUbicacionProdu;
	}

	public Boolean getIsPermisoNuevoUbicacionProdu() {
		return isPermisoNuevoUbicacionProdu;
	}

	public void setIsPermisoNuevoUbicacionProdu(Boolean isPermisoNuevoUbicacionProdu) {
		this.isPermisoNuevoUbicacionProdu = isPermisoNuevoUbicacionProdu;
	}

	public Boolean getIsPermisoActualizarUbicacionProdu() {
		return isPermisoActualizarUbicacionProdu;
	}

	public void setIsPermisoActualizarUbicacionProdu(Boolean isPermisoActualizarUbicacionProdu) {
		this.isPermisoActualizarUbicacionProdu = isPermisoActualizarUbicacionProdu;
	}

	public Boolean getIsPermisoEliminarUbicacionProdu() {
		return isPermisoEliminarUbicacionProdu;
	}

	public void setIsPermisoEliminarUbicacionProdu(Boolean isPermisoEliminarUbicacionProdu) {
		this.isPermisoEliminarUbicacionProdu = isPermisoEliminarUbicacionProdu;
	}

	public Boolean getIsPermisoGuardarCambiosUbicacionProdu() {
		return isPermisoGuardarCambiosUbicacionProdu;
	}

	public void setIsPermisoGuardarCambiosUbicacionProdu(Boolean isPermisoGuardarCambiosUbicacionProdu) {
		this.isPermisoGuardarCambiosUbicacionProdu = isPermisoGuardarCambiosUbicacionProdu;
	}
	
	public Boolean getIsPermisoConsultaUbicacionProdu() {
		return isPermisoConsultaUbicacionProdu;
	}

	public void setIsPermisoConsultaUbicacionProdu(Boolean isPermisoConsultaUbicacionProdu) {
		this.isPermisoConsultaUbicacionProdu = isPermisoConsultaUbicacionProdu;
	}

	public Boolean getIsPermisoBusquedaUbicacionProdu() {
		return isPermisoBusquedaUbicacionProdu;
	}

	public void setIsPermisoBusquedaUbicacionProdu(Boolean isPermisoBusquedaUbicacionProdu) {
		this.isPermisoBusquedaUbicacionProdu = isPermisoBusquedaUbicacionProdu;
	}

	public Boolean getIsPermisoReporteUbicacionProdu() {
		return isPermisoReporteUbicacionProdu;
	}

	public void setIsPermisoReporteUbicacionProdu(Boolean isPermisoReporteUbicacionProdu) {
		this.isPermisoReporteUbicacionProdu = isPermisoReporteUbicacionProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioUbicacionProdu() {
		return isPermisoPaginacionMedioUbicacionProdu;
	}

	public void setIsPermisoPaginacionMedioUbicacionProdu(Boolean isPermisoPaginacionMedioUbicacionProdu) {
		this.isPermisoPaginacionMedioUbicacionProdu = isPermisoPaginacionMedioUbicacionProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoUbicacionProdu() {
		return isPermisoPaginacionTodoUbicacionProdu;
	}

	public void setIsPermisoPaginacionTodoUbicacionProdu(Boolean isPermisoPaginacionTodoUbicacionProdu) {
		this.isPermisoPaginacionTodoUbicacionProdu = isPermisoPaginacionTodoUbicacionProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoUbicacionProdu() {
		return isPermisoPaginacionAltoUbicacionProdu;
	}

	public void setIsPermisoPaginacionAltoUbicacionProdu(Boolean isPermisoPaginacionAltoUbicacionProdu) {
		this.isPermisoPaginacionAltoUbicacionProdu = isPermisoPaginacionAltoUbicacionProdu;
	}
	
	public Boolean getIsPermisoCopiarUbicacionProdu() {
		return isPermisoCopiarUbicacionProdu;
	}

	public void setIsPermisoCopiarUbicacionProdu(Boolean isPermisoCopiarUbicacionProdu) {
		this.isPermisoCopiarUbicacionProdu = isPermisoCopiarUbicacionProdu;
	}
	
	public Boolean getIsPermisoVerFormUbicacionProdu() {
		return isPermisoVerFormUbicacionProdu;
	}

	public void setIsPermisoVerFormUbicacionProdu(Boolean isPermisoVerFormUbicacionProdu) {
		this.isPermisoVerFormUbicacionProdu = isPermisoVerFormUbicacionProdu;
	}
	
	public Boolean getIsPermisoDuplicarUbicacionProdu() {
		return isPermisoDuplicarUbicacionProdu;
	}

	public void setIsPermisoDuplicarUbicacionProdu(Boolean isPermisoDuplicarUbicacionProdu) {
		this.isPermisoDuplicarUbicacionProdu = isPermisoDuplicarUbicacionProdu;
	}
	
	public Boolean getIsPermisoOrdenUbicacionProdu() {
		return isPermisoOrdenUbicacionProdu;
	}

	public void setIsPermisoOrdenUbicacionProdu(Boolean isPermisoOrdenUbicacionProdu) {
		this.isPermisoOrdenUbicacionProdu = isPermisoOrdenUbicacionProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUbicacionProdu() {
		return isVisibilidadCeldaNuevoUbicacionProdu;
	}

	public void setIsVisibilidadCeldaNuevoUbicacionProdu(Boolean isVisibilidadCeldaNuevoUbicacionProdu) {
		this.isVisibilidadCeldaNuevoUbicacionProdu = isVisibilidadCeldaNuevoUbicacionProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUbicacionProdu() {
		return isVisibilidadCeldaDuplicarUbicacionProdu;
	}

	public void setIsVisibilidadCeldaDuplicarUbicacionProdu(Boolean isVisibilidadCeldaDuplicarUbicacionProdu) {
		this.isVisibilidadCeldaDuplicarUbicacionProdu = isVisibilidadCeldaDuplicarUbicacionProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUbicacionProdu() {
		return isVisibilidadCeldaCopiarUbicacionProdu;
	}

	public void setIsVisibilidadCeldaCopiarUbicacionProdu(Boolean isVisibilidadCeldaCopiarUbicacionProdu) {
		this.isVisibilidadCeldaCopiarUbicacionProdu = isVisibilidadCeldaCopiarUbicacionProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUbicacionProdu() {
		return isVisibilidadCeldaVerFormUbicacionProdu;
	}

	public void setIsVisibilidadCeldaVerFormUbicacionProdu(Boolean isVisibilidadCeldaVerFormUbicacionProdu) {
		this.isVisibilidadCeldaVerFormUbicacionProdu = isVisibilidadCeldaVerFormUbicacionProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUbicacionProdu() {
		return isVisibilidadCeldaOrdenUbicacionProdu;
	}

	public void setIsVisibilidadCeldaOrdenUbicacionProdu(Boolean isVisibilidadCeldaOrdenUbicacionProdu) {
		this.isVisibilidadCeldaOrdenUbicacionProdu = isVisibilidadCeldaOrdenUbicacionProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUbicacionProdu() {
		return isVisibilidadCeldaNuevoRelacionesUbicacionProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUbicacionProdu(Boolean isVisibilidadCeldaNuevoRelacionesUbicacionProdu) {
		this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu = isVisibilidadCeldaNuevoRelacionesUbicacionProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUbicacionProdu() {
		return isVisibilidadCeldaModificarUbicacionProdu;
	}

	public void setIsVisibilidadCeldaModificarUbicacionProdu(Boolean isVisibilidadCeldaModificarUbicacionProdu) {
		this.isVisibilidadCeldaModificarUbicacionProdu = isVisibilidadCeldaModificarUbicacionProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUbicacionProdu() {
		return isVisibilidadCeldaActualizarUbicacionProdu;
	}

	public void setIsVisibilidadCeldaActualizarUbicacionProdu(Boolean isVisibilidadCeldaActualizarUbicacionProdu) {
		this.isVisibilidadCeldaActualizarUbicacionProdu = isVisibilidadCeldaActualizarUbicacionProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarUbicacionProdu() {
		return isVisibilidadCeldaEliminarUbicacionProdu;
	}

	public void setIsVisibilidadCeldaEliminarUbicacionProdu(Boolean isVisibilidadCeldaEliminarUbicacionProdu) {
		this.isVisibilidadCeldaEliminarUbicacionProdu = isVisibilidadCeldaEliminarUbicacionProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarUbicacionProdu() {
		return isVisibilidadCeldaCancelarUbicacionProdu;
	}

	public void setIsVisibilidadCeldaCancelarUbicacionProdu(Boolean isVisibilidadCeldaCancelarUbicacionProdu) {
		this.isVisibilidadCeldaCancelarUbicacionProdu = isVisibilidadCeldaCancelarUbicacionProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarUbicacionProdu() {
		return isVisibilidadCeldaGuardarUbicacionProdu;
	}

	public void setIsVisibilidadCeldaGuardarUbicacionProdu(Boolean isVisibilidadCeldaGuardarUbicacionProdu) {
		this.isVisibilidadCeldaGuardarUbicacionProdu = isVisibilidadCeldaGuardarUbicacionProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUbicacionProdu() {
		return isVisibilidadCeldaGuardarCambiosUbicacionProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUbicacionProdu(Boolean isVisibilidadCeldaGuardarCambiosUbicacionProdu) {
		this.isVisibilidadCeldaGuardarCambiosUbicacionProdu = isVisibilidadCeldaGuardarCambiosUbicacionProdu;
	}
		
	public UbicacionProduSessionBean getubicacionproduSessionBean() {
		return this.ubicacionproduSessionBean;
	}
	
	public void setubicacionproduSessionBean(UbicacionProduSessionBean ubicacionproduSessionBean) {
		this.ubicacionproduSessionBean=ubicacionproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
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

	public Boolean getisVisibilidadFK_IdUbicacionBode() {
		return this.isVisibilidadFK_IdUbicacionBode;
	}

	public void setisVisibilidadFK_IdUbicacionBode(Boolean isVisibilidadFK_IdUbicacionBode) {
		this.isVisibilidadFK_IdUbicacionBode=isVisibilidadFK_IdUbicacionBode;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(UbicacionProdu ubicacionprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ubicacionprodu,null);
				this.setActualParaGuardarSucursalForeignKey(ubicacionprodu,null);
				this.setActualParaGuardarBodegaForeignKey(ubicacionprodu,null);
				this.setActualParaGuardarProductoForeignKey(ubicacionprodu,null);
				this.setActualParaGuardarUbicacionBodeForeignKey(ubicacionprodu,null);
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
	
	public void bugActualizarReferenciaActual(UbicacionProdu ubicacionprodu,UbicacionProdu ubicacionproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUbicacionProdu(ubicacionprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ubicacionproduAux.setId(ubicacionprodu.getId());
		ubicacionproduAux.setVersionRow(ubicacionprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUbicacionProdu();
		
			int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = ubicacionproduValidator.getInvalidValues(this.ubicacionprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			ubicacionproduLogic.setDatosCliente(datosCliente);
			ubicacionproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				ubicacionproduAux=new  UbicacionProdu();
				
				ubicacionproduAux.setIsNew(true);
				ubicacionproduAux.setIsChanged(true);
				
				ubicacionproduAux.setUbicacionProduOriginal(this.ubicacionprodu);
				
				ubicacionproduAux.setId(this.ubicacionprodu.getId());	
				ubicacionproduAux.setVersionRow(this.ubicacionprodu.getVersionRow());	
				ubicacionproduAux.setid_empresa(this.ubicacionprodu.getid_empresa());	
				ubicacionproduAux.setid_sucursal(this.ubicacionprodu.getid_sucursal());	
				ubicacionproduAux.setid_bodega(this.ubicacionprodu.getid_bodega());	
				ubicacionproduAux.setid_producto(this.ubicacionprodu.getid_producto());	
				ubicacionproduAux.setid_ubicacion_bode(this.ubicacionprodu.getid_ubicacion_bode());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ubicacionproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(ubicacionproduAux,ubicacionproduLogic.getUbicacionProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ubicacionproduAux,ubicacionprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ubicacionproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduLogic.saveUbicacionProdus();//WithConnection
						//ubicacionproduLogic.getSetVersionRowUbicacionProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ubicacionprodu,ubicacionproduAux);
					
					this.refrescarForeignKeysDescripcionesUbicacionProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ubicacionproduLogic.saveUbicacionProduRelaciones(ubicacionproduAux);//WithConnection
								//ubicacionproduLogic.getSetVersionRowUbicacionProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ubicacionprodu,ubicacionproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.ubicacionproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(ubicacionproduAux,ubicacionproduLogic.getUbicacionProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(ubicacionproduAux,ubicacionprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ubicacionprodu,ubicacionproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				ubicacionproduAux=new  UbicacionProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado() 
					|| (this.ubicacionproduSessionBean.getEsGuardarRelacionado() && this.ubicacionprodu.getId()>=0)) {
						
					ubicacionproduAux.setIsNew(false);
				}
				
				ubicacionproduAux.setIsDeleted(false);
			
				ubicacionproduAux.setId(this.ubicacionprodu.getId());	
				ubicacionproduAux.setVersionRow(this.ubicacionprodu.getVersionRow());	
				ubicacionproduAux.setid_empresa(this.ubicacionprodu.getid_empresa());	
				ubicacionproduAux.setid_sucursal(this.ubicacionprodu.getid_sucursal());	
				ubicacionproduAux.setid_bodega(this.ubicacionprodu.getid_bodega());	
				ubicacionproduAux.setid_producto(this.ubicacionprodu.getid_producto());	
				ubicacionproduAux.setid_ubicacion_bode(this.ubicacionprodu.getid_ubicacion_bode());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ubicacionproduAux,ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ubicacionproduAux,ubicacionprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ubicacionproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduLogic.saveUbicacionProdus();//WithConnection
						//ubicacionproduLogic.getSetVersionRowUbicacionProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ubicacionprodu,ubicacionproduAux);
					
					this.refrescarForeignKeysDescripcionesUbicacionProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ubicacionproduLogic.saveUbicacionProduRelaciones(ubicacionproduAux);//WithConnection
								//ubicacionproduLogic.getSetVersionRowUbicacionProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ubicacionprodu,ubicacionproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.ubicacionproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(ubicacionproduAux,ubicacionproduLogic.getUbicacionProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(ubicacionproduAux,ubicacionprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ubicacionprodu,ubicacionproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				ubicacionproduAux=new  UbicacionProdu();
				
				ubicacionproduAux.setIsNew(false);
				ubicacionproduAux.setIsChanged(false);
				
				ubicacionproduAux.setIsDeleted(true);
				
				ubicacionproduAux.setId(this.ubicacionprodu.getId());	
				ubicacionproduAux.setVersionRow(this.ubicacionprodu.getVersionRow());	
				ubicacionproduAux.setid_empresa(this.ubicacionprodu.getid_empresa());	
				ubicacionproduAux.setid_sucursal(this.ubicacionprodu.getid_sucursal());	
				ubicacionproduAux.setid_bodega(this.ubicacionprodu.getid_bodega());	
				ubicacionproduAux.setid_producto(this.ubicacionprodu.getid_producto());	
				ubicacionproduAux.setid_ubicacion_bode(this.ubicacionprodu.getid_ubicacion_bode());	
				
				if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.ubicacionproduAux.getId()>=0) {	
						this.ubicacionprodusEliminados.add(ubicacionproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(ubicacionproduAux,ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ubicacionproduAux,ubicacionprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ubicacionproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduLogic.saveUbicacionProdus();//WithConnection
						//ubicacionproduLogic.getSetVersionRowUbicacionProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ubicacionproduLogic.saveUbicacionProduRelaciones(ubicacionproduAux);//WithConnection
								//ubicacionproduLogic.getSetVersionRowUbicacionProdus();//WithConnection
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
							if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.ubicacionproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(ubicacionproduAux,ubicacionproduLogic.getUbicacionProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(ubicacionproduAux,ubicacionprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.getUbicacionProdus().addAll(this.ubicacionprodusEliminados);
					
					ubicacionproduLogic.saveUbicacionProdus();//WithConnection
					//ubicacionproduLogic.getSetVersionRowUbicacionProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUbicacionProdu();
				
				this.ubicacionprodusEliminados= new ArrayList<UbicacionProdu>();		
			}
			
			if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Ubicacion Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.ubicacionprodu=ubicacionproduAux;
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
      		//this.finishProcessUbicacionProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(UbicacionProdu ubicacionproduLocal) throws Exception {
		
		if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(UbicacionProdu ubicacionproduLocal) throws Exception {	
		if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ubicacionproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ubicacionproduLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				ubicacionproduLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				ubicacionproduLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UbicacionBodeDetalleFormJInternalFrame.class)) {
				UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrameLocal=(UbicacionBodeBeanSwingJInternalFrame) ((UbicacionBodeDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ubicacionbodeBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUbicacionBode(ubicacionbodeBeanSwingJInternalFrameLocal.getubicacionbode(),true);
				ubicacionbodeBeanSwingJInternalFrameLocal.actualizarLista(ubicacionbodeBeanSwingJInternalFrameLocal.ubicacionbode,this.ubicacionbodesForeignKey);

				ubicacionbodeBeanSwingJInternalFrameLocal.actualizarRelaciones(ubicacionbodeBeanSwingJInternalFrameLocal.ubicacionbode);

				ubicacionproduLocal.setUbicacionBode(ubicacionbodeBeanSwingJInternalFrameLocal.ubicacionbode);

				this.addItemDefectoCombosForeignKeyUbicacionBode();
				this.cargarCombosFrameUbicacionBodesForeignKey("Formulario");
				this.setActualUbicacionBodeForeignKey(ubicacionbodeBeanSwingJInternalFrameLocal.ubicacionbode.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUbicacionProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ubicacionproduValidator.getInvalidValues(this.ubicacionprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(UbicacionProdu ubicacionprodu,List<UbicacionProdu> ubicacionprodus) throws Exception {
		try	{		
			UbicacionProduConstantesFunciones.actualizarLista(ubicacionprodu,ubicacionprodus,this.ubicacionproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(UbicacionProdu ubicacionprodu,List<UbicacionProdu> ubicacionprodus) throws Exception {
		try	{			
			UbicacionProduConstantesFunciones.actualizarSelectedLista(ubicacionprodu,ubicacionprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<UbicacionProdu> ubicacionprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ubicacionprodusLocal=this.ubicacionproduLogic.getUbicacionProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ubicacionprodusLocal=this.ubicacionprodus;
			}
			//ARCHITECTURE
		
			for(UbicacionProdu ubicacionproduLocal:ubicacionprodusLocal) {
				if(this.permiteMantenimiento(ubicacionproduLocal) && ubicacionproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UbicacionProduConstantesFunciones.getUbicacionProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UbicacionProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_empresaUbicacionProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionProduConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_sucursalUbicacionProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionProduConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_bodegaUbicacionProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionProduConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_productoUbicacionProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionProduConstantesFunciones.IDUBICACIONBODE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_ubicacion_bodeUbicacionProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_empresaUbicacionProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_sucursalUbicacionProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_bodegaUbicacionProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_productoUbicacionProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionProdu.jLabelid_ubicacion_bodeUbicacionProdu,"");
		
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
		this.iIdNuevoUbicacionProdu--;	
		
		
		this.ubicacionproduAux=new UbicacionProdu();
		
		this.ubicacionproduAux.setId(this.iIdNuevoUbicacionProdu);
		this.ubicacionproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ubicacionproduLogic.getUbicacionProdus().add(this.ubicacionproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ubicacionprodus.add(this.ubicacionproduAux);
		}
		//ARCHITECTURE
		
		this.ubicacionprodu=this.ubicacionproduAux;
		
		if(UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUbicacionProdu(this.ubicacionprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyUbicacionProdu(this.ubicacionprodu);
		}
				
		//this.setDefaultControlesUbicacionProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUbicacionProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUbicacionProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUbicacionProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUbicacionProdu(this.ubicacionproduBean,this.ubicacionprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UbicacionProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
			classes=UbicacionProduConstantesFunciones.getClassesRelationshipsOfUbicacionProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.ubicacionproduReturnGeneral=ubicacionproduLogic.procesarEventosUbicacionProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ubicacionproduLogic.getUbicacionProdus(),this.ubicacionprodu,this.ubicacionproduParameterGeneral,this.isEsNuevoUbicacionProdu,classes);//this.ubicacionproduLogic.getUbicacionProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUbicacionProdu(this.ubicacionproduReturnGeneral,this.ubicacionproduBean,false);
		
		if(this.ubicacionproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUbicacionProdu(this.ubicacionproduReturnGeneral.getUbicacionProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUbicacionProdu(this.ubicacionproduReturnGeneral.getUbicacionProdu());
		}
		
		if(this.ubicacionproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUbicacionProdu(this.ubicacionproduReturnGeneral.getUbicacionProdu(),classes);//this.ubicacionproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUbicacionProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUbicacionProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UbicacionProduBeanSwingJInternalFrameAdditional.RecargarFormUbicacionProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUbicacionProdu(false);
						
			if(ubicacionproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUbicacionProdu();
			}
			
			this.actualizarVisualTableDatosUbicacionProdu();
			
			this.jTableDatosUbicacionProdu.setRowSelectionInterval(this.getIndiceNuevoUbicacionProdu(), this.getIndiceNuevoUbicacionProdu());
			
			this.seleccionarFilaTablaUbicacionProduActual();
						
			this.actualizarEstadoCeldasBotonesUbicacionProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUbicacionProdu(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setEnabled(isHabilitar && this.ubicacionproduConstantesFunciones.activarid_empresaUbicacionProdu);//
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setEnabled(isHabilitar && this.ubicacionproduConstantesFunciones.activarid_sucursalUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setEnabled(isHabilitar && this.ubicacionproduConstantesFunciones.activarid_bodegaUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setEnabled(isHabilitar && this.ubicacionproduConstantesFunciones.activarid_productoUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setEnabled(isHabilitar && this.ubicacionproduConstantesFunciones.activarid_ubicacion_bodeUbicacionProdu);
	};
	
	public void setDefaultControlesUbicacionProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUbicacionProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ubicacionproduSessionBean.setConGuardarRelaciones(true);			
			this.ubicacionproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.setVisible(true);
			
					
		} else {
			//this.ubicacionproduSessionBean.setConGuardarRelaciones(false);			
			this.ubicacionproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoUbicacionProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
				if(ubicacionproduAux.getId().equals(this.iIdNuevoUbicacionProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionProdu ubicacionproduAux:this.ubicacionprodus) {
				if(ubicacionproduAux.getId().equals(this.iIdNuevoUbicacionProdu)) {
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
	
	public int getIndiceActualUbicacionProdu(UbicacionProdu ubicacionprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
				if(ubicacionproduAux.getId().equals(ubicacionprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionProdu ubicacionproduAux:this.ubicacionprodus) {
				if(ubicacionproduAux.getId().equals(ubicacionprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUbicacionProdu(UbicacionProdu ubicacionproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
				if(ubicacionproduAux.getUbicacionProduOriginal().getId().equals(ubicacionproduOriginal.getId())) {
					existe=true;
					ubicacionproduOriginal.setId(ubicacionproduAux.getId());
					ubicacionproduOriginal.setVersionRow(ubicacionproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionProdu ubicacionproduAux:this.ubicacionprodus) {
				if(ubicacionproduAux.getUbicacionProduOriginal().getId().equals(ubicacionproduOriginal.getId())) {
					existe=true;
					ubicacionproduOriginal.setId(ubicacionproduAux.getId());
					ubicacionproduOriginal.setVersionRow(ubicacionproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUbicacionProdu(Boolean esParaCancelar) throws Exception {
		ubicacionprodusAux=new ArrayList<UbicacionProdu>();
		ubicacionproduAux=new UbicacionProdu();
		
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
					if(ubicacionproduAux.getId()<0) {
						ubicacionprodusAux.add(ubicacionproduAux);
					}		
				}
				this.iIdNuevoUbicacionProdu=0L;
				this.ubicacionproduLogic.getUbicacionProdus().removeAll(ubicacionprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UbicacionProdu ubicacionproduAux:this.ubicacionprodus) {
					if(ubicacionproduAux.getId()<0) {
						ubicacionprodusAux.add(ubicacionproduAux);
					}		
				}
				this.iIdNuevoUbicacionProdu=0L;
				this.ubicacionprodus.removeAll(ubicacionprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUbicacionProdu 
					&& this.ubicacionproduLogic.getUbicacionProdus().size()>0
					) {
					ubicacionproduAux=this.ubicacionproduLogic.getUbicacionProdus().get(this.ubicacionproduLogic.getUbicacionProdus().size() - 1);
				
					if(ubicacionproduAux.getId()<0) {
						this.ubicacionproduLogic.getUbicacionProdus().remove(ubicacionproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUbicacionProdu && this.ubicacionprodus.size()>0) {
					ubicacionproduAux=this.ubicacionprodus.get(this.ubicacionprodus.size() - 1);
				
					if(ubicacionproduAux.getId()<0) {
						this.ubicacionprodus.remove(ubicacionproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUbicacionProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ubicacionprodu.getId()<0) {
				this.ubicacionproduLogic.getUbicacionProdus().remove(this.ubicacionprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ubicacionprodu.getId()<0) {
				this.ubicacionprodus.remove(this.ubicacionprodu);
			}
		}			
	}
	
	public void setEstadosInicialesUbicacionProdu(List<UbicacionProdu> ubicacionprodusAux) throws Exception {
		UbicacionProduConstantesFunciones.setEstadosInicialesUbicacionProdu(ubicacionprodusAux);
	}
	
	public void setEstadosInicialesUbicacionProdu(UbicacionProdu ubicacionproduAux) throws Exception {
		UbicacionProduConstantesFunciones.setEstadosInicialesUbicacionProdu(ubicacionproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUbicacionProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUbicacionProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUbicacionProduActual()) {
				if(!this.isEsNuevoUbicacionProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUbicacionProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUbicacionProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUbicacionProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ubicacion Producto ?", "MANTENIMIENTO DE Ubicacion Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUbicacionProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(UbicacionProdu ubicacionprodu) throws Exception {
		UbicacionProduConstantesFunciones.seleccionarAsignar(this.ubicacionprodu,ubicacionprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUbicacionProdu=this.isPermisoActualizarOriginalUbicacionProdu;
			
			
			this.seleccionarAsignar(ubicacionprodu);
			
			

			idProductoActual=ubicacionprodu.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UbicacionProduConstantesFunciones.quitarEspaciosUbicacionProdu(this.ubicacionprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUbicacionProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ubicacionproduSessionBean.setsFuncionBusquedaRapida(this.ubicacionproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoUbicacionProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUbicacionProdu(esParaCancelar);				
				this.cancelarNuevoUbicacionProdu(esParaCancelar);								
			}
			
			this.ubicacionprodu=new UbicacionProdu();
			
			this.inicializarUbicacionProdu();
			
			this.actualizarEstadoCeldasBotonesUbicacionProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUbicacionProdu() throws Exception {
		try {
			UbicacionProduConstantesFunciones.inicializarUbicacionProdu(this.ubicacionprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ubicacionproduLogic.getUbicacionProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUbicacionProdus(String sAccionBusqueda,List<UbicacionProdu> ubicacionprodusParaReportes) throws Exception {
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
					sPathReporteFinal="UbicacionProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UbicacionProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UbicacionProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="UbicacionProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ubicacion Productos");		
		parameters.put("busquedapor", UbicacionProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUbicacionProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UbicacionProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UbicacionProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUbicacionProdu=new JRBeanArrayDataSource(UbicacionProduJInternalFrame.TraerUbicacionProduBeans(ubicacionprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUbicacionProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UbicacionProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UbicacionProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UbicacionProduBean.TraerUbicacionProduBeans(ubicacionprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteUbicacionProdus(sAccionBusqueda,sTipoArchivoReporte,ubicacionprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUbicacionProdus(sAccionBusqueda,sTipoArchivoReporte,ubicacionprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUbicacionProduActionPerformed(null);
					//this.generarExcelReporteUbicacionProdus(sAccionBusqueda,sTipoArchivoReporte,ubicacionprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUbicacionProdus(sAccionBusqueda,sTipoArchivoReporte,ubicacionprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUbicacionProdus(sAccionBusqueda,sTipoArchivoReporte,ubicacionprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUbicacionProdus(sAccionBusqueda,sTipoArchivoReporte,ubicacionprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUbicacionProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<UbicacionProdu> ubicacionprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UbicacionProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUbicacionProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(UbicacionProdu ubicacionprodu : ubicacionprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UbicacionProduConstantesFunciones.generarExcelReporteDataUbicacionProdu("NORMAL",row,workbook,ubicacionprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUbicacionProdu(String sTipo,Row row,Workbook workbook) {
		
		UbicacionProduConstantesFunciones.generarExcelReporteHeaderUbicacionProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUbicacionProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<UbicacionProdu> ubicacionprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UbicacionProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(UbicacionProdu ubicacionprodu : ubicacionprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UbicacionProduConstantesFunciones.getUbicacionProduDescripcion(ubicacionprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionprodu.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionProduConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionprodu.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionprodu.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionprodu.getubicacionbode_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUbicacionProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<UbicacionProdu> ubicacionprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<UbicacionProdu> ubicacionprodusRespaldo=null;
		
		classes=UbicacionProduConstantesFunciones.getClassesRelationshipsOfUbicacionProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ubicacionproduLogic.setDatosCliente(this.datosCliente);
		this.ubicacionproduLogic.setDatosDeep(this.datosDeep);
		this.ubicacionproduLogic.setIsConDeep(true);
		
		ubicacionprodusRespaldo=this.ubicacionproduLogic.getUbicacionProdus();
		
		this.ubicacionproduLogic.setUbicacionProdus(ubicacionprodusParaReportes);	
		this.ubicacionproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ubicacionprodusParaReportes=this.ubicacionproduLogic.getUbicacionProdus();
		this.ubicacionproduLogic.setUbicacionProdus(ubicacionprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UbicacionProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUbicacionProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(UbicacionProdu ubicacionprodu : ubicacionprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUbicacionProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UbicacionProduConstantesFunciones.generarExcelReporteDataUbicacionProdu("NORMAL",row,workbook,ubicacionprodu,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(UbicacionProduConstantesFunciones.getUbicacionProduDescripcion(ubicacionprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUbicacionProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUbicacionProdu() throws Exception {		
		this.startProcessUbicacionProdu(true);
	}
	
	public void startProcessUbicacionProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUbicacionProdu ,this.jPanelParametrosReportesUbicacionProdu, this.jScrollPanelDatosUbicacionProdu,this.jPanelPaginacionUbicacionProdu, this.jScrollPanelDatosEdicionUbicacionProdu, this.jPanelAccionesUbicacionProdu,this.jPanelAccionesFormularioUbicacionProdu,this.jmenuBarUbicacionProdu,this.jmenuBarDetalleUbicacionProdu,this.jTtoolBarUbicacionProdu,this.jTtoolBarDetalleUbicacionProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasUbicacionProdu=this.jTabbedPaneBusquedasUbicacionProdu; 
		
		final JPanel jPanelParametrosReportesUbicacionProdu=this.jPanelParametrosReportesUbicacionProdu;
		//final JScrollPane jScrollPanelDatosUbicacionProdu=this.jScrollPanelDatosUbicacionProdu;
		final JTable jTableDatosUbicacionProdu=this.jTableDatosUbicacionProdu;		
		final JPanel jPanelPaginacionUbicacionProdu=this.jPanelPaginacionUbicacionProdu;
		//final JScrollPane jScrollPanelDatosEdicionUbicacionProdu=this.jScrollPanelDatosEdicionUbicacionProdu;
		final JPanel jPanelAccionesUbicacionProdu=this.jPanelAccionesUbicacionProdu;
		
		JPanel jPanelCamposAuxiliarUbicacionProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUbicacionProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			jPanelCamposAuxiliarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jPanelCamposUbicacionProdu;
			jPanelAccionesFormularioAuxiliarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jPanelAccionesFormularioUbicacionProdu;
		}
		
		final JPanel jPanelCamposUbicacionProdu=jPanelCamposAuxiliarUbicacionProdu;
		final JPanel jPanelAccionesFormularioUbicacionProdu=jPanelAccionesFormularioAuxiliarUbicacionProdu;
		
		
		final JMenuBar jmenuBarUbicacionProdu=this.jmenuBarUbicacionProdu;
		final JToolBar jTtoolBarUbicacionProdu=this.jTtoolBarUbicacionProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUbicacionProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUbicacionProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			jmenuBarDetalleAuxiliarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jmenuBarDetalleUbicacionProdu;
			jTtoolBarDetalleAuxiliarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jTtoolBarDetalleUbicacionProdu;
		}
		
		final JMenuBar jmenuBarDetalleUbicacionProdu=jmenuBarDetalleAuxiliarUbicacionProdu;
		final JToolBar jTtoolBarDetalleUbicacionProdu=jTtoolBarDetalleAuxiliarUbicacionProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUbicacionProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUbicacionProdu;
			processRunnable.jTableDatos=jTableDatosUbicacionProdu;
			processRunnable.jPanelCampos=jPanelCamposUbicacionProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionUbicacionProdu;
			processRunnable.jPanelAcciones=jPanelAccionesUbicacionProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUbicacionProdu;
			
			
			processRunnable.jmenuBar=jmenuBarUbicacionProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUbicacionProdu;
			processRunnable.jTtoolBar=jTtoolBarUbicacionProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUbicacionProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUbicacionProdu ,jPanelParametrosReportesUbicacionProdu,jTableDatosUbicacionProdu, /*jScrollPanelDatosUbicacionProdu,*/jPanelCamposUbicacionProdu,jPanelPaginacionUbicacionProdu, /*jScrollPanelDatosEdicionUbicacionProdu,*/ jPanelAccionesUbicacionProdu,jPanelAccionesFormularioUbicacionProdu,jmenuBarUbicacionProdu,jmenuBarDetalleUbicacionProdu,jTtoolBarUbicacionProdu,jTtoolBarDetalleUbicacionProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUbicacionProdu ,jPanelParametrosReportesUbicacionProdu, jScrollPanelDatosUbicacionProdu,jPanelPaginacionUbicacionProdu, jScrollPanelDatosEdicionUbicacionProdu, jPanelAccionesUbicacionProdu,jPanelAccionesFormularioUbicacionProdu,jmenuBarUbicacionProdu,jmenuBarDetalleUbicacionProdu,jTtoolBarUbicacionProdu,jTtoolBarDetalleUbicacionProdu);
						
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
	
	public void finishProcessUbicacionProdu() {// throws Exception 
		this.finishProcessUbicacionProdu(true);
	}
	
	public void finishProcessUbicacionProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUbicacionProdu ,this.jPanelParametrosReportesUbicacionProdu, this.jScrollPanelDatosUbicacionProdu,this.jPanelPaginacionUbicacionProdu, this.jScrollPanelDatosEdicionUbicacionProdu, this.jPanelAccionesUbicacionProdu,this.jPanelAccionesFormularioUbicacionProdu,this.jmenuBarUbicacionProdu,this.jmenuBarDetalleUbicacionProdu,this.jTtoolBarUbicacionProdu,this.jTtoolBarDetalleUbicacionProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasUbicacionProdu=this.jTabbedPaneBusquedasUbicacionProdu; 
		
		final JPanel jPanelParametrosReportesUbicacionProdu=this.jPanelParametrosReportesUbicacionProdu;
		//final JScrollPane jScrollPanelDatosUbicacionProdu=this.jScrollPanelDatosUbicacionProdu;
		final JTable jTableDatosUbicacionProdu=this.jTableDatosUbicacionProdu;		
		final JPanel jPanelPaginacionUbicacionProdu=this.jPanelPaginacionUbicacionProdu;
		//final JScrollPane jScrollPanelDatosEdicionUbicacionProdu=this.jScrollPanelDatosEdicionUbicacionProdu;
		final JPanel jPanelAccionesUbicacionProdu=this.jPanelAccionesUbicacionProdu;
		
		JPanel jPanelCamposAuxiliarUbicacionProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUbicacionProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			jPanelCamposAuxiliarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jPanelCamposUbicacionProdu;
			jPanelAccionesFormularioAuxiliarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jPanelAccionesFormularioUbicacionProdu;
		}
		
		final JPanel jPanelCamposUbicacionProdu=jPanelCamposAuxiliarUbicacionProdu;
		final JPanel jPanelAccionesFormularioUbicacionProdu=jPanelAccionesFormularioAuxiliarUbicacionProdu;
		
		
		final JMenuBar jmenuBarUbicacionProdu=this.jmenuBarUbicacionProdu;		
		final JToolBar jTtoolBarUbicacionProdu=this.jTtoolBarUbicacionProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarUbicacionProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUbicacionProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			jmenuBarDetalleAuxiliarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jmenuBarDetalleUbicacionProdu;
			jTtoolBarDetalleAuxiliarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jTtoolBarDetalleUbicacionProdu;		
		}
		
		final JMenuBar jmenuBarDetalleUbicacionProdu=jmenuBarDetalleAuxiliarUbicacionProdu;
		final JToolBar jTtoolBarDetalleUbicacionProdu=jTtoolBarDetalleAuxiliarUbicacionProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUbicacionProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUbicacionProdu;
			processRunnable.jTableDatos=jTableDatosUbicacionProdu;
			processRunnable.jPanelCampos=jPanelCamposUbicacionProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionUbicacionProdu;
			processRunnable.jPanelAcciones=jPanelAccionesUbicacionProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUbicacionProdu;
			
			
			processRunnable.jmenuBar=jmenuBarUbicacionProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUbicacionProdu;
			processRunnable.jTtoolBar=jTtoolBarUbicacionProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUbicacionProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUbicacionProdu ,jPanelParametrosReportesUbicacionProdu, jTableDatosUbicacionProdu,/*jScrollPanelDatosUbicacionProdu,*/jPanelCamposUbicacionProdu,jPanelPaginacionUbicacionProdu, /*jScrollPanelDatosEdicionUbicacionProdu,*/ jPanelAccionesUbicacionProdu,jPanelAccionesFormularioUbicacionProdu,jmenuBarUbicacionProdu,jmenuBarDetalleUbicacionProdu,jTtoolBarUbicacionProdu,jTtoolBarDetalleUbicacionProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUbicacionProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUbicacionProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUbicacionProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUbicacionProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUbicacionProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUbicacionProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUbicacionProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUbicacionProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUbicacionProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ubicacionproduConstantesFunciones.getsFinalQueryUbicacionProdu();
		String  finalQueryPaginacionTodos=this.ubicacionproduConstantesFunciones.getsFinalQueryUbicacionProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UbicacionProduConstantesFunciones.getArrayColumnasGlobalesNoUbicacionProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UbicacionProduConstantesFunciones.getArrayColumnasGlobalesUbicacionProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UbicacionProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ubicacionprodusEliminados= new ArrayList<UbicacionProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUbicacionProdu();
		
				///*UbicacionProduSessionBean*/this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
			
			if(this.ubicacionproduSessionBean==null) {
				this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
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
					this.iNumeroPaginacion=UbicacionProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UbicacionProduConstantesFunciones.getClassesForeignKeysOfUbicacionProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ubicacionprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ubicacionprodusAux= new ArrayList<UbicacionProdu>();
			
				
			ubicacionproduLogic.setDatosCliente(this.datosCliente);
			ubicacionproduLogic.setDatosDeep(this.datosDeep);
			ubicacionproduLogic.setIsConDeep(true);
			
			
			ubicacionproduLogic.getUbicacionProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					ubicacionproduLogic.getTodosUbicacionProdus(finalQueryGlobal,pagination);
					
					//ubicacionproduLogic.getTodosUbicacionProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(ubicacionproduLogic.getUbicacionProdus()==null|| ubicacionproduLogic.getUbicacionProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ubicacionprodusAux= new ArrayList<UbicacionProdu>();
							ubicacionprodusAux.addAll(ubicacionproduLogic.getUbicacionProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodusAux= new ArrayList<UbicacionProdu>();
							ubicacionprodusAux.addAll(ubicacionprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ubicacionproduLogic.getTodosUbicacionProdus(finalQueryGlobal+"",this.pagination);												
							
							//ubicacionproduLogic.getTodosUbicacionProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUbicacionProdus("Todos",ubicacionproduLogic.getUbicacionProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());					
							ubicacionproduLogic.getUbicacionProdus().addAll(ubicacionprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodus=new ArrayList<UbicacionProdu>();
							ubicacionprodus.addAll(ubicacionprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUbicacionProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUbicacionProdu=this.idActual;
				
				} else if(this.idUbicacionProduActual!=null && this.idUbicacionProduActual!=0L) {
					idUbicacionProdu=idUbicacionProduActual;
				}
				
					
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndicePorId(idUbicacionProdu);
				
				this.ubicacionprodus=new ArrayList<UbicacionProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					ubicacionproduLogic.getEntity(idUbicacionProdu);
					
					//ubicacionproduLogic.getEntityWithConnection(idUbicacionProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());
					ubicacionproduLogic.getUbicacionProdus().add(ubicacionproduLogic.getUbicacionProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionprodus=new ArrayList<UbicacionProdu>();
					this.ubicacionprodus.add(ubicacionprodu);
				}
				
				if(ubicacionproduLogic.getUbicacionProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ubicacionproduLogic.getUbicacionProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ubicacionproduLogic.getUbicacionProdus()==null||ubicacionproduLogic.getUbicacionProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ubicacionprodus==null|| ubicacionprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionprodusAux=new ArrayList<UbicacionProdu>();
						ubicacionprodusAux.addAll(ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodusAux=new ArrayList<UbicacionProdu>();
							ubicacionprodusAux.addAll(ubicacionprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ubicacionproduLogic.getUbicacionProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUbicacionProdus("FK_IdBodega",ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUbicacionProdus("FK_IdBodega",ubicacionprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());
						ubicacionproduLogic.getUbicacionProdus().addAll(ubicacionprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodus=new ArrayList<UbicacionProdu>();
							ubicacionprodus.addAll(ubicacionprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ubicacionproduLogic.getUbicacionProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ubicacionproduLogic.getUbicacionProdus()==null||ubicacionproduLogic.getUbicacionProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ubicacionprodus==null|| ubicacionprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionprodusAux=new ArrayList<UbicacionProdu>();
						ubicacionprodusAux.addAll(ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodusAux=new ArrayList<UbicacionProdu>();
							ubicacionprodusAux.addAll(ubicacionprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ubicacionproduLogic.getUbicacionProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUbicacionProdus("FK_IdEmpresa",ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUbicacionProdus("FK_IdEmpresa",ubicacionprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());
						ubicacionproduLogic.getUbicacionProdus().addAll(ubicacionprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodus=new ArrayList<UbicacionProdu>();
							ubicacionprodus.addAll(ubicacionprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ubicacionproduLogic.getUbicacionProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ubicacionproduLogic.getUbicacionProdus()==null||ubicacionproduLogic.getUbicacionProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ubicacionprodus==null|| ubicacionprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionprodusAux=new ArrayList<UbicacionProdu>();
						ubicacionprodusAux.addAll(ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodusAux=new ArrayList<UbicacionProdu>();
							ubicacionprodusAux.addAll(ubicacionprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ubicacionproduLogic.getUbicacionProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUbicacionProdus("FK_IdSucursal",ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUbicacionProdus("FK_IdSucursal",ubicacionprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());
						ubicacionproduLogic.getUbicacionProdus().addAll(ubicacionprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodus=new ArrayList<UbicacionProdu>();
							ubicacionprodus.addAll(ubicacionprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUbicacionBode")) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ubicacionproduLogic.getUbicacionProdusFK_IdUbicacionBode(finalQueryGlobal,pagination,id_ubicacion_bodeFK_IdUbicacionBode);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ubicacionproduLogic.getUbicacionProdus()==null||ubicacionproduLogic.getUbicacionProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ubicacionprodus==null|| ubicacionprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionprodusAux=new ArrayList<UbicacionProdu>();
						ubicacionprodusAux.addAll(ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodusAux=new ArrayList<UbicacionProdu>();
							ubicacionprodusAux.addAll(ubicacionprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ubicacionproduLogic.getUbicacionProdusFK_IdUbicacionBode(finalQueryGlobal,pagination,id_ubicacion_bodeFK_IdUbicacionBode);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionProduConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUbicacionProdus("FK_IdUbicacionBode",ubicacionproduLogic.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUbicacionProdus("FK_IdUbicacionBode",ubicacionprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());
						ubicacionproduLogic.getUbicacionProdus().addAll(ubicacionprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionprodus=new ArrayList<UbicacionProdu>();
							ubicacionprodus.addAll(ubicacionprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUbicacionProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUbicacionProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ubicacionproduLogic.getUbicacionProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ubicacionprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ubicacionproduLogic.getUbicacionProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ubicacionprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(UbicacionProdu ubicacionprodu) {
		Boolean permite=true;
		
		if(this.ubicacionprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UbicacionProduConstantesFunciones.getOrderByListaUbicacionProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UbicacionProduConstantesFunciones.getOrderByListaUbicacionProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionProdu ubicacionprodu:ubicacionproduLogic.getUbicacionProdus()) {
				if(ubicacionprodu.getsType().equals(Constantes2.S_TOTALES)) {
					ubicacionproduTotales=ubicacionprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionProdu ubicacionprodu:this.ubicacionprodus) {
				if(ubicacionprodu.getsType().equals(Constantes2.S_TOTALES)) {
					ubicacionproduTotales=ubicacionprodu;
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
			this.ubicacionproduAux=new UbicacionProdu();
			this.ubicacionproduAux.setsType(Constantes2.S_TOTALES);
			this.ubicacionproduAux.setIsNew(false);
			this.ubicacionproduAux.setIsChanged(false);
			this.ubicacionproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UbicacionProduConstantesFunciones.TotalizarValoresFilaUbicacionProdu(this.ubicacionproduLogic.getUbicacionProdus(),this.ubicacionproduAux);
				
				this.ubicacionproduLogic.getUbicacionProdus().add(this.ubicacionproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UbicacionProduConstantesFunciones.TotalizarValoresFilaUbicacionProdu(this.ubicacionprodus,this.ubicacionproduAux);
				
				this.ubicacionprodus.add(this.ubicacionproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ubicacionproduTotales=new UbicacionProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ubicacionproduLogic.getUbicacionProdus().remove(ubicacionproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ubicacionprodus.remove(ubicacionproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ubicacionproduTotales=new UbicacionProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionProdu ubicacionprodu:ubicacionproduLogic.getUbicacionProdus()) {
				if(ubicacionprodu.getsType().equals(Constantes2.S_TOTALES)) {
					ubicacionproduTotales=ubicacionprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UbicacionProduConstantesFunciones.TotalizarValoresFilaUbicacionProdu(this.ubicacionproduLogic.getUbicacionProdus(),ubicacionproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionProdu ubicacionprodu:this.ubicacionprodus) {
				if(ubicacionprodu.getsType().equals(Constantes2.S_TOTALES)) {
					ubicacionproduTotales=ubicacionprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UbicacionProduConstantesFunciones.TotalizarValoresFilaUbicacionProdu(this.ubicacionprodus,ubicacionproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUbicacionProdusFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUbicacionProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUbicacionProdusFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUbicacionProdusFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUbicacionProdusFK_IdUbicacionBode()throws Exception {
		try {
			sAccionBusqueda="FK_IdUbicacionBode";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUbicacionProdusFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionproduLogic.getUbicacionProdusFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUbicacionProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionproduLogic.getUbicacionProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUbicacionProdusFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionproduLogic.getUbicacionProdusFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUbicacionProdusFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionproduLogic.getUbicacionProdusFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUbicacionProdusFK_IdUbicacionBode(String sFinalQuery,Long id_ubicacion_bode)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionproduLogic.getUbicacionProdusFK_IdUbicacionBode(sFinalQuery,this.pagination,id_ubicacion_bode);
				
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
	
	public void inicializarPermisosUbicacionProdu() {
		this.isPermisoTodoUbicacionProdu=false;
		this.isPermisoNuevoUbicacionProdu=false;
		this.isPermisoActualizarUbicacionProdu=false;
		this.isPermisoActualizarOriginalUbicacionProdu=false;
		this.isPermisoEliminarUbicacionProdu=false;
		this.isPermisoGuardarCambiosUbicacionProdu=false;
		this.isPermisoConsultaUbicacionProdu=false;
		this.isPermisoBusquedaUbicacionProdu=false;
		this.isPermisoReporteUbicacionProdu=false;		
		this.isPermisoOrdenUbicacionProdu=false;		
		this.isPermisoPaginacionMedioUbicacionProdu=false;		
		this.isPermisoPaginacionAltoUbicacionProdu=false;
		this.isPermisoPaginacionTodoUbicacionProdu=false;
		this.isPermisoCopiarUbicacionProdu=false;		
		this.isPermisoVerFormUbicacionProdu=false;		
		this.isPermisoDuplicarUbicacionProdu=false;		
		this.isPermisoOrdenUbicacionProdu=false;		
	}
	
	public void setPermisosUsuarioUbicacionProdu(Boolean isPermiso) {
		this.isPermisoTodoUbicacionProdu=isPermiso;
		this.isPermisoNuevoUbicacionProdu=isPermiso;
		this.isPermisoActualizarUbicacionProdu=isPermiso;
		this.isPermisoActualizarOriginalUbicacionProdu=isPermiso;
		this.isPermisoEliminarUbicacionProdu=isPermiso;
		this.isPermisoGuardarCambiosUbicacionProdu=isPermiso;
		this.isPermisoConsultaUbicacionProdu=isPermiso;
		this.isPermisoBusquedaUbicacionProdu=isPermiso;
		this.isPermisoReporteUbicacionProdu=isPermiso;
		this.isPermisoOrdenUbicacionProdu=isPermiso;		
		this.isPermisoPaginacionMedioUbicacionProdu=isPermiso;		
		this.isPermisoPaginacionAltoUbicacionProdu=isPermiso;		
		this.isPermisoPaginacionTodoUbicacionProdu=isPermiso;		
		this.isPermisoCopiarUbicacionProdu=isPermiso;		
		this.isPermisoVerFormUbicacionProdu=isPermiso;		
		this.isPermisoDuplicarUbicacionProdu=isPermiso;
		this.isPermisoOrdenUbicacionProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUbicacionProdu(Boolean isPermiso) {
		//this.isPermisoTodoUbicacionProdu=isPermiso;
		this.isPermisoNuevoUbicacionProdu=isPermiso;
		this.isPermisoActualizarUbicacionProdu=isPermiso;
		this.isPermisoActualizarOriginalUbicacionProdu=isPermiso;
		this.isPermisoEliminarUbicacionProdu=isPermiso;
		this.isPermisoGuardarCambiosUbicacionProdu=isPermiso;
		//this.isPermisoConsultaUbicacionProdu=isPermiso;
		//this.isPermisoBusquedaUbicacionProdu=isPermiso;
		//this.isPermisoReporteUbicacionProdu=isPermiso;
		//this.isPermisoOrdenUbicacionProdu=isPermiso;		
		//this.isPermisoPaginacionMedioUbicacionProdu=isPermiso;		
		//this.isPermisoPaginacionAltoUbicacionProdu=isPermiso;		
		//this.isPermisoPaginacionTodoUbicacionProdu=isPermiso;		
		//this.isPermisoCopiarUbicacionProdu=isPermiso;		
		//this.isPermisoDuplicarUbicacionProdu=isPermiso;
		//this.isPermisoOrdenUbicacionProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUbicacionProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(UbicacionProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebUbicacionProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUbicacionProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioUbicacionProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUbicacionProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUbicacionProduClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioUbicacionProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UbicacionProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UbicacionProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUbicacionProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUbicacionProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUbicacionProdu=this.isPermisoActualizarUbicacionProdu;
			this.isPermisoEliminarUbicacionProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUbicacionProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUbicacionProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUbicacionProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUbicacionProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUbicacionProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUbicacionProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUbicacionProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUbicacionProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUbicacionProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUbicacionProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUbicacionProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUbicacionProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUbicacionProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUbicacionProdu.setToolTipText(this.jTableDatosUbicacionProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUbicacionProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUbicacionProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UbicacionProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UbicacionProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUbicacionProdu() throws Exception {
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
	public void inicializarCombosForeignKeyUbicacionProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.ubicacionbodesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUbicacionProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UbicacionProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUbicacionProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUbicacionBodeListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyUbicacionBodeListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ubicacionbodesForeignKey==null||this.ubicacionbodesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UbicacionBodeConstantesFunciones.getArrayColumnasGlobalesUbicacionBode(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UbicacionBodeConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UbicacionBodeConstantesFunciones.SFINALQUERY;

				this.cargarCombosUbicacionBodesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyUbicacionProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UbicacionProduParameterReturnGeneral ubicacionproduReturnGeneral=new UbicacionProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.ubicacionproduConstantesFunciones.cargarid_empresaUbicacionProdu)
					 || (this.esRecargarFks && this.ubicacionproduConstantesFunciones.cargarid_empresaUbicacionProdu)) {

					if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+ubicacionproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.ubicacionproduConstantesFunciones.cargarid_sucursalUbicacionProdu)
					 || (this.esRecargarFks && this.ubicacionproduConstantesFunciones.cargarid_sucursalUbicacionProdu)) {

					if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+ubicacionproduSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.ubicacionproduConstantesFunciones.cargarid_bodegaUbicacionProdu)
					 || (this.esRecargarFks && this.ubicacionproduConstantesFunciones.cargarid_bodegaUbicacionProdu)) {

					if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+ubicacionproduSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.ubicacionproduConstantesFunciones.cargarid_productoUbicacionProdu)
					 || (this.esRecargarFks && this.ubicacionproduConstantesFunciones.cargarid_productoUbicacionProdu)) {

					if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+ubicacionproduSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUbicacionBode="";

				if(((this.ubicacionbodesForeignKey==null||this.ubicacionbodesForeignKey.size()<=0) && this.ubicacionproduConstantesFunciones.cargarid_ubicacion_bodeUbicacionProdu)
					 || (this.esRecargarFks && this.ubicacionproduConstantesFunciones.cargarid_ubicacion_bodeUbicacionProdu)) {

					if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionUbicacionBode()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UbicacionBodeConstantesFunciones.getArrayColumnasGlobalesUbicacionBode(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUbicacionBode=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UbicacionBodeConstantesFunciones.TABLENAME);

						finalQueryGlobalUbicacionBode=Funciones.GetFinalQueryAppend(finalQueryGlobalUbicacionBode, "");
						finalQueryGlobalUbicacionBode+=UbicacionBodeConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUbicacionBodesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUbicacionBode=" WHERE " + ConstantesSql.ID + "="+ubicacionproduSessionBean.getlidUbicacionBodeActual();
					}
				} else {
					finalQueryGlobalUbicacionBode="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				ubicacionproduReturnGeneral=ubicacionproduLogic.cargarCombosLoteForeignKeyUbicacionProdu(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUbicacionBode);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=ubicacionproduReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=ubicacionproduReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=ubicacionproduReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=ubicacionproduReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUbicacionBode.equals("NONE")) {
				this.ubicacionbodesForeignKey=ubicacionproduReturnGeneral.getubicacionbodesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUbicacionProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUbicacionBode();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ubicacionproduSessionBean==null) {
				this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
			}

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyUbicacionBode()throws Exception {
		try {

			if(!this.ubicacionproduSessionBean.getisBusquedaDesdeForeignKeySesionUbicacionBode()) {
				UbicacionBode ubicacionbode=new UbicacionBode();
				UbicacionBodeConstantesFunciones.setUbicacionBodeDescripcion(ubicacionbode,Constantes.SMENSAJE_ESCOJA_OPCION);
				ubicacionbode.setId(null);

				if(!UbicacionBodeConstantesFunciones.ExisteEnLista(this.ubicacionbodesForeignKey,ubicacionbode,true)) {

					this.ubicacionbodesForeignKey.add(0,ubicacionbode);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyUbicacionProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUbicacionProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUbicacionProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUbicacionProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUbicacionProdu(UbicacionProdu ubicacionprodu)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(ubicacionprodu.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(ubicacionprodu.getid_producto(),false,"Formulario");
			this.setActualUbicacionBodeForeignKey(ubicacionprodu.getid_ubicacion_bode(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUbicacionProdu(UbicacionProdu ubicacionprodu,String sTipoEvento)throws Exception {	
		try {
			
			

				if(ubicacionprodu.getProducto()!=null && !sTipoEvento.equals("id_productoUbicacionProdu")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(ubicacionprodu.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUbicacionProdu()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.ubicacionproduConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.ubicacionproduConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUbicacionBodeForeignKey(this.ubicacionproduConstantesFunciones.getid_ubicacion_bode(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUbicacionProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUbicacionProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUbicacionProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUbicacionProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUbicacionProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUbicacionBodesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUbicacionProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUbicacionBodesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUbicacionProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public UbicacionProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UbicacionProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UbicacionProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ubicacionproduSessionBean=new UbicacionProduSessionBean(); 
		this.ubicacionproduConstantesFunciones=new UbicacionProduConstantesFunciones(); 
		this.ubicacionproduBean=new UbicacionProdu();//(this.ubicacionproduConstantesFunciones); 		
		this.ubicacionproduReturnGeneral=new UbicacionProduParameterReturnGeneral(); 
		
		this.ubicacionproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ubicacionproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UbicacionProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UbicacionProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UbicacionProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUbicacionProdu(true);
			
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
			
			this.ubicacionproduConstantesFunciones=new UbicacionProduConstantesFunciones(); 
			this.ubicacionproduBean=new UbicacionProdu();//this.ubicacionproduConstantesFunciones); 			
			this.ubicacionproduReturnGeneral=new UbicacionProduParameterReturnGeneral(); 
		
			UbicacionProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ubicacion Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.ubicacionprodu=new UbicacionProdu();
			this.ubicacionprodus = new ArrayList<UbicacionProdu>();
			this.ubicacionprodusAux = new ArrayList<UbicacionProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic=new UbicacionProduLogic();
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}
			
			//this.ubicacionproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ubicacionproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUbicacionProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUbicacionProdu);	
					}
					
					if(this.jInternalFrameImportacionUbicacionProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUbicacionProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUbicacionProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUbicacionProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUbicacionProdu);
				this.jInternalFrameDetalleFormUbicacionProdu.setVisible(false);
				this.jInternalFrameDetalleFormUbicacionProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUbicacionProdu);
					this.jInternalFrameReporteDinamicoUbicacionProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoUbicacionProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUbicacionProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUbicacionProdu);
					this.jInternalFrameImportacionUbicacionProdu.setVisible(false);
					this.jInternalFrameImportacionUbicacionProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUbicacionProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUbicacionProdu);
					this.jInternalFrameOrderByUbicacionProdu.setVisible(false);
					this.jInternalFrameOrderByUbicacionProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUbicacionProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UbicacionProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ubicacionproduReturnGeneral=new UbicacionProduParameterReturnGeneral();
			
			this.ubicacionproduParameterGeneral=new UbicacionProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ubicacionproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UbicacionProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UbicacionProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ubicacionproduSessionBean.getEsGuardarRelacionado(),this.ubicacionproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UbicacionProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ubicacionproduSessionBean.getEsGuardarRelacionado(),this.ubicacionproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUbicacionProdu=false;
			this.isVisibilidadCeldaDuplicarUbicacionProdu=true;
			this.isVisibilidadCeldaCopiarUbicacionProdu=true;
			this.isVisibilidadCeldaVerFormUbicacionProdu=true;
			this.isVisibilidadCeldaOrdenUbicacionProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
			this.isVisibilidadCeldaModificarUbicacionProdu=false;
			this.isVisibilidadCeldaActualizarUbicacionProdu=false;
			this.isVisibilidadCeldaEliminarUbicacionProdu=false;
			this.isVisibilidadCeldaCancelarUbicacionProdu=false;
			this.isVisibilidadCeldaGuardarUbicacionProdu=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUbicacionBode=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUbicacionProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUbicacionProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUbicacionProdu(false);
			
			this.setPermisosUsuarioUbicacionProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado() 
				|| (this.ubicacionproduSessionBean.getEsGuardarRelacionado() && this.ubicacionproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUbicacionProduClasesRelacionadas();
			}
			
			if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUbicacionProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUbicacionProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUbicacionProdu();
			}
			
			if(!this.isPermisoBusquedaUbicacionProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUbicacionProdu,this.isPermisoPaginacionMedioUbicacionProdu,this.isPermisoPaginacionTodoUbicacionProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UbicacionProduConstantesFunciones.getTiposSeleccionarUbicacionProdu());
				
				this.tiposColumnasSelect=UbicacionProduConstantesFunciones.getTiposSeleccionarUbicacionProdu(true);
				
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
			//if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUbicacionProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioUbicacionProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioUbicacionProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUbicacionProdu() ;
			
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
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.ubicacionbodeLogic=new UbicacionBodeLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ubicacionproduImplementable= (UbicacionProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UbicacionProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ubicacionproduImplementableHome= (UbicacionProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UbicacionProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ubicacionprodus= new ArrayList<UbicacionProdu>();
			this.ubicacionprodusEliminados= new ArrayList<UbicacionProdu>();
						
			this.isEsNuevoUbicacionProdu=false;
			this.esParaAccionDesdeFormularioUbicacionProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.ubicacionbodesForeignKey=new ArrayList<UbicacionBode>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUbicacionProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUbicacionProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UbicacionProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UbicacionProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUbicacionProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUbicacionProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUbicacionProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUbicacionProdu();
			}
			
			UbicacionProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUbicacionProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUbicacionProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUbicacionProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUbicacionProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga UbicacionProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUbicacionProdu() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUbicacionProdu")) {
				iIndex=this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUbicacionProdu();	
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
	
	public void cargarCombosForeignKeyUbicacionProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUbicacionProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUbicacionProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUbicacionProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUbicacionProdu();
		
		this.cargarCombosFrameForeignKeyUbicacionProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUbicacionProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUbicacionProdu();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
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

	public void cargarCombosForeignKeyUbicacionBode(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUbicacionBodeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUbicacionBode();
				this.cargarCombosFrameUbicacionBodesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUbicacionBode(this.ubicacionbodesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoUbicacionProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
			
			if(jTableDatosUbicacionProdu.getRowCount()>=1) {
				jTableDatosUbicacionProdu.removeRowSelectionInterval(0, jTableDatosUbicacionProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoUbicacionProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUbicacionProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUbicacionProdu(true);			
			//this.ubicacionprodu=new UbicacionProdu();
			//this.ubicacionprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUbicacionProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUbicacionProdu() ;
			
			if(UbicacionProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUbicacionProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ubicacionprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);				
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
			if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar UbicacionProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUbicacionProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUbicacionProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUbicacionProdu.getSelectedRows().length;			
			}
			
			ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUbicacionProdu--;			
				//UbicacionProdu ubicacionproduAux= new UbicacionProdu();			
				//ubicacionproduAux.setId(this.iIdNuevoUbicacionProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//UbicacionProdu ubicacionproduOrigen=new UbicacionProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(UbicacionProdu ubicacionproduOrigen : ubicacionprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ubicacionproduOrigen =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionproduOrigen =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUbicacionProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ubicacionprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUbicacionProdu(ubicacionproduOrigen,this.ubicacionprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ubicacionproduLogic.getUbicacionProdus().add(this.ubicacionproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ubicacionprodus.add(this.ubicacionproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUbicacionProdu(false);
				
				this.jTableDatosUbicacionProdu.setRowSelectionInterval(this.getIndiceNuevoUbicacionProdu(), this.getIndiceNuevoUbicacionProdu());
				
				int iLastRow =  this.jTableDatosUbicacionProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUbicacionProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUbicacionProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUbicacionProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();									
		
			UbicacionProdu ubicacionproduOrigen=new UbicacionProdu();
			UbicacionProdu ubicacionproduDestino=new UbicacionProdu();
				
			ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUbicacionProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ubicacionprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUbicacionProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduOrigen =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ubicacionproduOrigen =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionproduDestino =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ubicacionproduDestino =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ubicacionproduOrigen =ubicacionprodusSeleccionados.get(0);
				ubicacionproduDestino =ubicacionprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUbicacionProdu(ubicacionproduOrigen,ubicacionproduDestino,true,false);
				
				ubicacionproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ubicacionproduDestino,ubicacionproduLogic.getUbicacionProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ubicacionproduDestino,ubicacionprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUbicacionProdu(false);
				
				//this.jTableDatosUbicacionProdu.setRowSelectionInterval(this.getIndiceNuevoUbicacionProdu(), this.getIndiceNuevoUbicacionProdu());
				
				int iLastRow =  this.jTableDatosUbicacionProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUbicacionProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUbicacionProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUbicacionProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUbicacionProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUbicacionProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUbicacionProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUbicacionProdu.setVisible(!isVisible);
			this.jPanelPaginacionUbicacionProdu.setVisible(!isVisible);
			this.jPanelAccionesUbicacionProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUbicacionProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUbicacionProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUbicacionProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUbicacionProdu();
			
			this.abrirFrameOrderByUbicacionProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUbicacionProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUbicacionProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUbicacionProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUbicacionProdu.isMaximum()) {
					this.jInternalFrameDetalleFormUbicacionProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUbicacionProdu.setSize(this.jInternalFrameDetalleFormUbicacionProdu.iWidthFormulario,this.jInternalFrameDetalleFormUbicacionProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUbicacionProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUbicacionProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUbicacionProdu.isMaximum()) {
						this.jInternalFrameDetalleFormUbicacionProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUbicacionProdu.jContentPaneDetalleUbicacionProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUbicacionProdu.jContentPaneDetalleUbicacionProdu.getWidth(),UbicacionProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUbicacionProdu.jContentPaneDetalleUbicacionProdu.getWidth(),UbicacionProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUbicacionProdu.jContentPaneDetalleUbicacionProdu.getWidth(),UbicacionProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUbicacionProdu.setVisible(true);
	        this.jInternalFrameDetalleFormUbicacionProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUbicacionProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUbicacionProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUbicacionProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUbicacionProdu,false,this);
				} else {
					this.jInternalFrameOrderByUbicacionProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUbicacionProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUbicacionProdu);
				this.jInternalFrameOrderByUbicacionProdu.setVisible(false);
				this.jInternalFrameOrderByUbicacionProdu.setSelected(false);
				
				this.jInternalFrameOrderByUbicacionProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUbicacionProdu"));
				
				this.inicializarActualizarBindingTablaOrderByUbicacionProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUbicacionProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUbicacionProdu==null) {
				
				this.jInternalFrameImportacionUbicacionProdu=new ImportacionJInternalFrame(UbicacionProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUbicacionProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUbicacionProdu);
				this.jInternalFrameImportacionUbicacionProdu.setVisible(false);
				this.jInternalFrameImportacionUbicacionProdu.setSelected(false);


				this.jInternalFrameImportacionUbicacionProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUbicacionProdu"));
				this.jInternalFrameImportacionUbicacionProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUbicacionProdu"));
				this.jInternalFrameImportacionUbicacionProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUbicacionProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUbicacionProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUbicacionProdu==null) {
				this.jInternalFrameReporteDinamicoUbicacionProdu=new ReporteDinamicoJInternalFrame(UbicacionProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUbicacionProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUbicacionProdu);
				this.jInternalFrameReporteDinamicoUbicacionProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoUbicacionProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUbicacionProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUbicacionProdu"));
				this.jInternalFrameReporteDinamicoUbicacionProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUbicacionProdu"));
				this.jInternalFrameReporteDinamicoUbicacionProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUbicacionProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUbicacionProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleUbicacionProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUbicacionProdu);
			
	       	this.jInternalFrameDetalleFormUbicacionProdu.setVisible(false);
	        this.jInternalFrameDetalleFormUbicacionProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormUbicacionProdu.dispose();
			//this.jInternalFrameDetalleFormUbicacionProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUbicacionProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUbicacionProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoUbicacionProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUbicacionProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUbicacionProdu.setVisible(true);
	        this.jInternalFrameImportacionUbicacionProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUbicacionProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUbicacionProdu.setVisible(true);
	        this.jInternalFrameOrderByUbicacionProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUbicacionProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUbicacionProdu.setVisible(false);
	        this.jInternalFrameOrderByUbicacionProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUbicacionProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUbicacionProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoUbicacionProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUbicacionProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUbicacionProdu.setVisible(false);
	        this.jInternalFrameImportacionUbicacionProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeUbicacionBode(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeUbicacionBode);
						UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame=new UbicacionBodeBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						ubicacionbodeBeanSwingJInternalFrame.setJInternalFrameParent(this);
						ubicacionbodeBeanSwingJInternalFrame.jInternalFrameTreeUbicacionBode.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							ubicacionbodeBeanSwingJInternalFrame.jInternalFrameTreeUbicacionBode.sTipoBusqueda="UbicacionBode";
						}

						ubicacionbodeBeanSwingJInternalFrame.getTodosUbicacionBodeArbol();
						ubicacionbodeBeanSwingJInternalFrame.jInternalFrameTreeUbicacionBode.setUbicacionBodes(ubicacionbodeBeanSwingJInternalFrame.ubicacionbodesArbol);
						ubicacionbodeBeanSwingJInternalFrame.jInternalFrameTreeUbicacionBode.CargarTreeUbicacionBode();
						ubicacionbodeBeanSwingJInternalFrame.jInternalFrameTreeUbicacionBode.setVisible(true);
						ubicacionbodeBeanSwingJInternalFrame.jInternalFrameTreeUbicacionBode.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						ubicacionbodeBeanSwingJInternalFrame.jInternalFrameTreeUbicacionBode.jInternalFrameParent=this;
						TitledBorder titledBorderUbicacionProdu=(TitledBorder)this.jScrollPanelDatosUbicacionProdu.getBorder();
						TitledBorder titledBorderUbicacionBode=(TitledBorder)ubicacionbodeBeanSwingJInternalFrame.jScrollPanelDatosUbicacionBode.getBorder();

						titledBorderUbicacionBode.setTitle(titledBorderUbicacionProdu.getTitle() + " -> Ubicacion Bode");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,ubicacionbodeBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(ubicacionbodeBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeUbicacionBode(UbicacionBodeBeanSwingJInternalFrame jInternalFrameTreeUbicacionBode) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeUbicacionBode);
						jInternalFrameTreeUbicacionBode.setVisible(false);
						jInternalFrameTreeUbicacionBode.setSelected(false);
						//jInternalFrameTreeUbicacionBode.dispose();
						//jInternalFrameTreeUbicacionBode=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUbicacionProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUbicacionProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUbicacionProdu(true);
			//this.isEsNuevoUbicacionProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUbicacionProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUbicacionProdu(false) ;
			
			if(ubicacionproduSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(UbicacionProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUbicacionProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUbicacionProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUbicacionProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUbicacionProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUbicacionProdu(true);
			//this.isEsNuevoUbicacionProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ubicacionprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUbicacionProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUbicacionProdu(false) ;
			
			if(UbicacionProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUbicacionProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUbicacionProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.ubicacionproduConstantesFunciones.cargarid_productoUbicacionProdu) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingUbicacionProdu(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUbicacionProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUbicacionProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUbicacionBode(List<UbicacionBode> ubicacionbodesForeignKey)throws Exception{
		TableColumn tableColumnUbicacionBode=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE));
		TableCellEditor tableCellEditorUbicacionBode =tableColumnUbicacionBode.getCellEditor();

		UbicacionBodeTableCell ubicacionbodeTableCellFk=(UbicacionBodeTableCell)tableCellEditorUbicacionBode;

		if(ubicacionbodeTableCellFk!=null) {
			ubicacionbodeTableCellFk.setubicacionbodesForeignKey(ubicacionbodesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUbicacionProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ubicacionbodeTableCellFk.setRowActual(intSelectedRow);
			//ubicacionbodeTableCellFk.setubicacionbodesForeignKeyActual(ubicacionbodesForeignKey);
		//}


		if(ubicacionbodeTableCellFk!=null) {
			ubicacionbodeTableCellFk.RecargarUbicacionBodesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUbicacionProdu(false);
			
			//if(!this.isEsNuevoUbicacionProdu) {								
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
				
			}
			
			if(this.permiteMantenimiento(this.ubicacionprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUbicacionProdu=true;
					this.inicializarActualizarBindingTablaUbicacionProdu(false);
					this.isEsNuevoUbicacionProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUbicacionProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUbicacionProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUbicacionProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUbicacionProdu(false);
				
				this.habilitarDeshabilitarControlesUbicacionProdu(false);
			
												
				
				if(UbicacionProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUbicacionProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUbicacionProduActionPerformed(evt,ubicacionproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUbicacionProdu(this.ubicacionprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUbicacionProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ubicacionproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ubicacionprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUbicacionProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				this.ubicacionprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				this.ubicacionprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ubicacionprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UbicacionProduModel) this.jTableDatosUbicacionProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUbicacionProdu=true;
				this.inicializarActualizarBindingTablaUbicacionProdu(false);
				this.isEsNuevoUbicacionProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUbicacionProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUbicacionProdu(false);
				
				this.habilitarDeshabilitarControlesUbicacionProdu(false);
				
				
				
				if(UbicacionProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUbicacionProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUbicacionProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUbicacionProdu.getRowCount()>=1) {
				jTableDatosUbicacionProdu.removeRowSelectionInterval(0, jTableDatosUbicacionProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUbicacionProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUbicacionProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUbicacionProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUbicacionProdu(false) ;
			
			this.isEsNuevoUbicacionProdu=false;
			
			if(UbicacionProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUbicacionProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUbicacionProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUbicacionProdu(false);
				
				//SI ES MANUAL
				if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUbicacionProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUbicacionProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUbicacionProdu--;			
			//UbicacionProdu ubicacionproduAux= new UbicacionProdu();			
			//ubicacionproduAux.setId(this.iIdNuevoUbicacionProdu);
			
			if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUbicacionProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
			
			this.ubicacionprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ubicacionproduLogic.getUbicacionProdus().add(this.ubicacionproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ubicacionprodus.add(this.ubicacionproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUbicacionProdu(false);
			
			this.jTableDatosUbicacionProdu.setRowSelectionInterval(this.getIndiceNuevoUbicacionProdu(), this.getIndiceNuevoUbicacionProdu());
			
			int iLastRow =  this.jTableDatosUbicacionProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUbicacionProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUbicacionProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUbicacionProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUbicacionProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUbicacionProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUbicacionProdu(false);
			
			//SI ES MANUAL
			if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUbicacionProdu();
			}
			
			//this.abrirFrameTreeUbicacionProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUbicacionProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Ubicacion ProductoS ?", "MANTENIMIENTO DE Ubicacion Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUbicacionProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUbicacionProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.ubicacionproduReturnGeneral=ubicacionproduLogic.procesarImportacionUbicacionProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.ubicacionproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUbicacionProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUbicacionProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUbicacionProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUbicacionProdu.setFileImportacion(this.jInternalFrameImportacionUbicacionProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUbicacionProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUbicacionProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUbicacionProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUbicacionProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUbicacionProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		

		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UbicacionProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UbicacionProduBaseDesign.jrxml";
			
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
			
			this.generarReporteUbicacionProdus("Todos",ubicacionprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UbicacionProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionProduConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_UbicacionBode_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_UbicacionBode_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_UbicacionBode_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_UbicacionBode_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoUbicacionProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UbicacionProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE:
					sNombreCampoCategoria="id_ubicacion_bode";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UbicacionProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE:
					sNombreCampoCategoriaValor="id_ubicacion_bode";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UbicacionProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ubicacion Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ubicacion_bode");
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
	
	public void jButtonGenerarExcelReporteDinamicoUbicacionProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("UbicacionProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UbicacionProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(UbicacionProdu ubicacionprodu:ubicacionprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(UbicacionProdu ubicacionprodu:ubicacionprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionprodu.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(UbicacionProdu ubicacionprodu:ubicacionprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionprodu.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(UbicacionProdu ubicacionprodu:ubicacionprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionprodu.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE);
					iRow++;

					for(UbicacionProdu ubicacionprodu:ubicacionprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionprodu.getubicacionbode_descripcion());
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
			//	this.getFilaCabeceraExportarExcelUbicacionProdu(row);				
			//	iRow++;
			//}				
			
			//for(UbicacionProdu ubicacionproduAux:ubicacionprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUbicacionProdu(ubicacionproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUbicacionProdu(false);
			
			//SI ES MANUAL
			if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUbicacionProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUbicacionProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUbicacionProdu(false);
			
			//SI ES MANUAL
			if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUbicacionProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUbicacionProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUbicacionProdu(false);
			
			//SI ES MANUAL
			if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUbicacionProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUbicacionProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUbicacionProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUbicacionProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUbicacionProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUbicacionProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUbicacionProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosUbicacionProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosUbicacionProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUbicacionProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUbicacionProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUbicacionProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUbicacionProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUbicacionProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUbicacionProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUbicacionProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUbicacionProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUbicacionProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUbicacionProdu();
		
		this.inicializarActualizarBindingBotonesManualUbicacionProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUbicacionProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUbicacionProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUbicacionProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUbicacionProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUbicacionProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUbicacionProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUbicacionProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUbicacionProdu.jCheckBoxPostAccionNuevoUbicacionProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUbicacionProdu.jCheckBoxPostAccionSinCerrarUbicacionProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUbicacionProdu.jCheckBoxPostAccionSinMensajeUbicacionProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUbicacionProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUbicacionProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUbicacionProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
				this.jInternalFrameDetalleFormUbicacionProdu.jCheckBoxPostAccionNuevoUbicacionProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUbicacionProdu.jCheckBoxPostAccionSinCerrarUbicacionProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUbicacionProdu.jCheckBoxPostAccionSinMensajeUbicacionProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUbicacionProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUbicacionProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUbicacionProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUbicacionProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUbicacionProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUbicacionProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUbicacionProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUbicacionProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUbicacionProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUbicacionProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUbicacionProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUbicacionProdu() throws Exception {
		try	{
			if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUbicacionProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUbicacionProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUbicacionProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUbicacionProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUbicacionProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUbicacionProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUbicacionProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUbicacionProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUbicacionProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUbicacionProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUbicacionProdu.addItem(reporte);
			}
			
			
			if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUbicacionProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUbicacionProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUbicacionProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUbicacionProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUbicacionProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUbicacionProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUbicacionProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUbicacionProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUbicacionProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUbicacionProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUbicacionProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
				this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
				this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUbicacionProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUbicacionProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUbicacionProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUbicacionProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUbicacionProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUbicacionProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.getSelectedItem()!=null){this.id_ubicacion_bodeFK_IdUbicacionBode=((UbicacionBode)this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUbicacionProdu(Boolean esInicializar) throws Exception {				
		if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUbicacionProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUbicacionProdu() throws Exception {
		this.inicializarActualizarBindingTablaUbicacionProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUbicacionProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUbicacionProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUbicacionProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ubicacionproduLogic.getUbicacionProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ubicacionprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUbicacionProdu.setModel(new UbicacionProduModel(this.ubicacionproduLogic.getUbicacionProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUbicacionProdu.setModel(new UbicacionProduModel(this.ubicacionprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUbicacionProdu!=null && this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUbicacionProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO,ubicacionproduConstantesFunciones.resaltarSeleccionarUbicacionProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO,ubicacionproduConstantesFunciones.resaltarSeleccionarUbicacionProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_ID));

		if(this.ubicacionproduConstantesFunciones.mostraridUbicacionProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ubicacionproduConstantesFunciones.resaltaridUbicacionProdu,this.ubicacionproduConstantesFunciones.activaridUbicacionProdu,this,true,"idUbicacionProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ubicacionproduConstantesFunciones.resaltaridUbicacionProdu,this.ubicacionproduConstantesFunciones.activaridUbicacionProdu,this,true,"idUbicacionProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.ubicacionproduConstantesFunciones.mostrarid_empresaUbicacionProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_empresaUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_empresaUbicacionProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_empresaUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_empresaUbicacionProdu,false,"id_empresaUbicacionProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.ubicacionproduConstantesFunciones.mostrarid_sucursalUbicacionProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_sucursalUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_sucursalUbicacionProdu));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_sucursalUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_sucursalUbicacionProdu,false,"id_sucursalUbicacionProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_IDBODEGA));

		if(this.ubicacionproduConstantesFunciones.mostrarid_bodegaUbicacionProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionProduConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_bodegaUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_bodegaUbicacionProdu));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_bodegaUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_bodegaUbicacionProdu,true,"id_bodegaUbicacionProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.ubicacionproduConstantesFunciones.mostrarid_productoUbicacionProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_productoUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_productoUbicacionProdu));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_productoUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_productoUbicacionProdu,true,"id_productoUbicacionProdu","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE));

		if(this.ubicacionproduConstantesFunciones.mostrarid_ubicacion_bodeUbicacionProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UbicacionBodeTableCell(this.ubicacionbodesForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_ubicacion_bodeUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_ubicacion_bodeUbicacionProdu));
			tableColumn.setCellEditor(new UbicacionBodeTableCell(this.ubicacionbodesForeignKey,this.ubicacionproduConstantesFunciones.resaltarid_ubicacion_bodeUbicacionProdu,this,this.ubicacionproduConstantesFunciones.activarid_ubicacion_bodeUbicacionProdu,true,"id_ubicacion_bodeUbicacionProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UbicacionProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ubicacionproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ubicacionproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUbicacionProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ubicacionproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ubicacionproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUbicacionProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ubicacionproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ubicacionproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUbicacionProdu.addColumn(tableColumn);
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
			
			this.jTableDatosUbicacionProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUbicacionProdu.moveColumn(this.jTableDatosUbicacionProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUbicacionProdu.moveColumn(this.jTableDatosUbicacionProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUbicacionProdu.moveColumn(this.jTableDatosUbicacionProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUbicacionProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUbicacionProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUbicacionProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUbicacionProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUbicacionProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUbicacionProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUbicacionProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUbicacionProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=ubicacionproduLogic.getUbicacionProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ubicacionprodus.size()-1;
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
		//this.jTableDatosUbicacionProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUbicacionProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUbicacionProdu();
			
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
				
				//this.isEsNuevoUbicacionProdu=false;
					
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
				if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUbicacionProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUbicacionProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUbicacionProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ubicacionprodu.getsType().equals("DUPLICADO")
				   || this.ubicacionprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUbicacionProdu=true;
				
				} else {
					this.isEsNuevoUbicacionProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
					if(this.ubicacionprodu.getId()>=0 && !this.ubicacionprodu.getIsNew()) {						
						this.isEsNuevoUbicacionProdu=false;
						
					} else {
						this.isEsNuevoUbicacionProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUbicacionProdu(esRelaciones);						
				
				this.seleccionarUbicacionProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ubicacionprodu.getId()<0) {
					this.isEsNuevoUbicacionProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUbicacionProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUbicacionProdu(evt,rowIndex);
				}	
				
				if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion UbicacionProdu: " + this.dDif); 
					}
				}								
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUbicacionProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ubicacionprodu)) {
					if(this.ubicacionprodu.getId()>0) {
						this.ubicacionprodu.setIsDeleted(true);
						
						this.ubicacionprodusEliminados.add(this.ubicacionprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ubicacionproduLogic.getUbicacionProdus().remove(this.ubicacionprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ubicacionprodus.remove(this.ubicacionprodu);				
					}
					
					
					((UbicacionProduModel) this.jTableDatosUbicacionProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUbicacionProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUbicacionProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUbicacionProdu) {
			
			if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUbicacionProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUbicacionProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUbicacionProdu(this.ubicacionprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.ubicacionproduConstantesFunciones.cargarid_empresaUbicacionProdu || this.ubicacionproduConstantesFunciones.event_dependid_empresaUbicacionProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.ubicacionprodu.getid_empresa());
									//this.inicializarActualizarBindingUbicacionProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(ubicacionprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(ubicacionprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.ubicacionprodu.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.ubicacionproduConstantesFunciones.cargarid_sucursalUbicacionProdu || this.ubicacionproduConstantesFunciones.event_dependid_sucursalUbicacionProdu) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.ubicacionprodu.getid_sucursal());
									//this.inicializarActualizarBindingUbicacionProdu(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(ubicacionprodu.getSucursal()!=null) {
							this.sucursalsForeignKey.add(ubicacionprodu.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.ubicacionprodu.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.ubicacionproduConstantesFunciones.cargarid_bodegaUbicacionProdu || this.ubicacionproduConstantesFunciones.event_dependid_bodegaUbicacionProdu) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.ubicacionprodu.getid_bodega());
									//this.inicializarActualizarBindingUbicacionProdu(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(ubicacionprodu.getBodega()!=null) {
							this.bodegasForeignKey.add(ubicacionprodu.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.ubicacionprodu.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.ubicacionproduConstantesFunciones.cargarid_productoUbicacionProdu || this.ubicacionproduConstantesFunciones.event_dependid_productoUbicacionProdu) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.ubicacionprodu.getid_producto());
									//this.inicializarActualizarBindingUbicacionProdu(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(ubicacionprodu.getProducto()!=null) {
							this.productosForeignKey.add(ubicacionprodu.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.ubicacionprodu.getid_producto(),false,"Formulario");

					//UbicacionBode
					if(!this.ubicacionproduConstantesFunciones.cargarid_ubicacion_bodeUbicacionProdu || this.ubicacionproduConstantesFunciones.event_dependid_ubicacion_bodeUbicacionProdu) {
						//this.cargarCombosUbicacionBodesForeignKeyLista(" where id="+this.ubicacionprodu.getid_ubicacion_bode());
									//this.inicializarActualizarBindingUbicacionProdu(false,false);
						this.ubicacionbodesForeignKey=new ArrayList<UbicacionBode>();

						if(ubicacionprodu.getUbicacionBode()!=null) {
							this.ubicacionbodesForeignKey.add(ubicacionprodu.getUbicacionBode());
						}

						this.addItemDefectoCombosForeignKeyUbicacionBode();
						this.cargarCombosFrameUbicacionBodesForeignKey("Todos");
					}
					this.setActualUbicacionBodeForeignKey(this.ubicacionprodu.getid_ubicacion_bode(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUbicacionProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUbicacionProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUbicacionProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUbicacionProdu(UbicacionProdu ubicacionprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUbicacionProdu(ubicacionprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUbicacionProdu(UbicacionProdu ubicacionprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUbicacionProdu(ubicacionprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUbicacionProdu(ubicacionprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUbicacionProdu(ubicacionprodu);
	}
	
	public void setVariablesObjetoActualToFormularioUbicacionProdu(UbicacionProdu ubicacionprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.setText(ubicacionprodu.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,UbicacionProdu ubicacionproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ubicacionproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,UbicacionProdu ubicacionproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ubicacionproduLocal=this.ubicacionprodu;
			} else {
				ubicacionproduLocal=this.ubicacionproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ubicacionproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUbicacionProdu(ubicacionproduLocal,true);
					
					if(ubicacionproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ubicacionproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ubicacionproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUbicacionProdu(UbicacionProdu ubicacionprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUbicacionProdu(ubicacionprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(ubicacionprodu);
	}
	
	public void setVariablesFormularioToObjetoActualUbicacionProdu(UbicacionProdu ubicacionprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUbicacionProdu(ubicacionprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUbicacionProdu(UbicacionProdu ubicacionprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.getText()==null || this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.getText()=="" || this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.setText("0");
			}

			if(conColumnasBase) {ubicacionprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UbicacionProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionProdu.jLabelIdUbicacionProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUbicacionProdu(UbicacionProdu ubicacionproduBean,UbicacionProdu ubicacionprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && ubicacionproduBean.getid_bodega()!=null && !ubicacionproduBean.getid_bodega().equals(-1L))) {ubicacionprodu.setid_bodega(ubicacionproduBean.getid_bodega());}
			if(conDefault || (!conDefault && ubicacionproduBean.getid_producto()!=null && !ubicacionproduBean.getid_producto().equals(-1L))) {ubicacionprodu.setid_producto(ubicacionproduBean.getid_producto());}
			if(conDefault || (!conDefault && ubicacionproduBean.getid_ubicacion_bode()!=null && !ubicacionproduBean.getid_ubicacion_bode().equals(-1L))) {ubicacionprodu.setid_ubicacion_bode(ubicacionproduBean.getid_ubicacion_bode());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUbicacionProdu(UbicacionProdu ubicacionproduOrigen,UbicacionProdu ubicacionprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ubicacionproduOrigen.getId()!=null && !ubicacionproduOrigen.getId().equals(0L))) {ubicacionprodu.setId(ubicacionproduOrigen.getId());}}
			if(conDefault || (!conDefault && ubicacionproduOrigen.getid_bodega()!=null && !ubicacionproduOrigen.getid_bodega().equals(-1L))) {ubicacionprodu.setid_bodega(ubicacionproduOrigen.getid_bodega());}
			if(conDefault || (!conDefault && ubicacionproduOrigen.getid_producto()!=null && !ubicacionproduOrigen.getid_producto().equals(-1L))) {ubicacionprodu.setid_producto(ubicacionproduOrigen.getid_producto());}
			if(conDefault || (!conDefault && ubicacionproduOrigen.getid_ubicacion_bode()!=null && !ubicacionproduOrigen.getid_ubicacion_bode().equals(-1L))) {ubicacionprodu.setid_ubicacion_bode(ubicacionproduOrigen.getid_ubicacion_bode());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUbicacionProdu(UbicacionProdu ubicacionprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.setText(ubicacionprodu.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUbicacionProdu(UbicacionProduBean ubicacionproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.setText(ubicacionproduBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUbicacionProdu(UbicacionProduParameterReturnGeneral ubicacionproduReturnGeneral,UbicacionProduBean ubicacionproduBean,Boolean conDefault) throws Exception { 
		try {
			UbicacionProdu ubicacionproduLocal=new UbicacionProdu();
			
			ubicacionproduLocal=ubicacionproduReturnGeneral.getUbicacionProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ubicacionproduLocal.getId()!=null && !ubicacionproduLocal.getId().equals(0L))) {ubicacionproduBean.setId(ubicacionproduLocal.getId());}}
			if(conDefault || (!conDefault && ubicacionproduLocal.getid_bodega()!=null && !ubicacionproduLocal.getid_bodega().equals(-1L))) {ubicacionproduBean.setid_bodega(ubicacionproduLocal.getid_bodega());}
			if(conDefault || (!conDefault && ubicacionproduLocal.getid_producto()!=null && !ubicacionproduLocal.getid_producto().equals(-1L))) {ubicacionproduBean.setid_producto(ubicacionproduLocal.getid_producto());}
			if(conDefault || (!conDefault && ubicacionproduLocal.getid_ubicacion_bode()!=null && !ubicacionproduLocal.getid_ubicacion_bode().equals(-1L))) {ubicacionproduBean.setid_ubicacion_bode(ubicacionproduLocal.getid_ubicacion_bode());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUbicacionProduGenerico(Long idUbicacionProduSeleccionado,JComboBox jComboBoxUbicacionProdu,List<UbicacionProdu> ubicacionprodusLocal)throws Exception {
		try {
			UbicacionProdu  ubicacionproduTemp=null;

			for(UbicacionProdu ubicacionproduAux:ubicacionprodusLocal) {
				if(ubicacionproduAux.getId()!=null && ubicacionproduAux.getId().equals(idUbicacionProduSeleccionado)) {
					ubicacionproduTemp=ubicacionproduAux;
					break;
				}
			}

			jComboBoxUbicacionProdu.setSelectedItem(ubicacionproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUbicacionProduGenerico(JComboBox jComboBoxUbicacionProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUbicacionProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUbicacionProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUbicacionProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUbicacionProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUbicacionProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUbicacionProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ubicacionprodu=(UbicacionProdu) ubicacionproduLogic.getUbicacionProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ubicacionprodu =(UbicacionProdu) ubicacionprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ubicacionprodu.getIsNew() && !ubicacionprodu.getIsChanged() && !ubicacionprodu.getIsDeleted()) {
				sDescripcion=ubicacionprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionprodu.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ubicacionprodu.getIsNew() && !ubicacionprodu.getIsChanged() && !ubicacionprodu.getIsDeleted()) {
				sDescripcion=ubicacionprodu.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionprodu.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!ubicacionprodu.getIsNew() && !ubicacionprodu.getIsChanged() && !ubicacionprodu.getIsDeleted()) {
				sDescripcion=ubicacionprodu.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionprodu.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!ubicacionprodu.getIsNew() && !ubicacionprodu.getIsChanged() && !ubicacionprodu.getIsDeleted()) {
				sDescripcion=ubicacionprodu.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionprodu.getproducto_descripcion();
			}
		}

		if(sTipo.equals("UbicacionBode")) {
			//sDescripcion=this.getActualUbicacionBodeForeignKeyDescripcion((Long)value);
			if(!ubicacionprodu.getIsNew() && !ubicacionprodu.getIsChanged() && !ubicacionprodu.getIsDeleted()) {
				sDescripcion=ubicacionprodu.getubicacionbode_descripcion();
			} else {
				//sDescripcion=this.getActualUbicacionBodeForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionprodu.getubicacionbode_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		UbicacionProdu ubicacionproduRow=new UbicacionProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ubicacionproduRow=(UbicacionProdu) ubicacionproduLogic.getUbicacionProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ubicacionproduRow=(UbicacionProdu) ubicacionprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUbicacionProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoUbicacionProdu && this.isPermisoNuevoUbicacionProdu));			
			this.jButtonDuplicarUbicacionProdu.setVisible((this.isVisibilidadCeldaDuplicarUbicacionProdu && this.isPermisoDuplicarUbicacionProdu));			
			this.jButtonCopiarUbicacionProdu.setVisible((this.isVisibilidadCeldaCopiarUbicacionProdu && this.isPermisoCopiarUbicacionProdu));
			this.jButtonVerFormUbicacionProdu.setVisible((this.isVisibilidadCeldaVerFormUbicacionProdu && this.isPermisoVerFormUbicacionProdu));
			
			this.jButtonAbrirOrderByUbicacionProdu.setVisible((this.isVisibilidadCeldaOrdenUbicacionProdu && this.isPermisoOrdenUbicacionProdu));			
			
			this.jButtonNuevoRelacionesUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu && this.isPermisoNuevoUbicacionProdu));			
			this.jButtonNuevoGuardarCambiosUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoUbicacionProdu && this.isPermisoNuevoUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));
			
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarUbicacionProdu.setVisible((this.isVisibilidadCeldaModificarUbicacionProdu && this.isPermisoActualizarUbicacionProdu));	
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarUbicacionProdu.setVisible((this.isVisibilidadCeldaActualizarUbicacionProdu && this.isPermisoActualizarUbicacionProdu));	
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarUbicacionProdu.setVisible((this.isVisibilidadCeldaEliminarUbicacionProdu && this.isPermisoEliminarUbicacionProdu));
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarUbicacionProdu.setVisible(this.isVisibilidadCeldaCancelarUbicacionProdu);							
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosUbicacionProdu.setVisible((this.isVisibilidadCeldaGuardarUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaUbicacionProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoUbicacionProdu && this.isPermisoNuevoUbicacionProdu));						
			this.jButtonDuplicarToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaDuplicarUbicacionProdu && this.isPermisoDuplicarUbicacionProdu));						
			this.jButtonCopiarToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaCopiarUbicacionProdu && this.isPermisoCopiarUbicacionProdu));			
			this.jButtonVerFormToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaVerFormUbicacionProdu && this.isPermisoVerFormUbicacionProdu));			
			this.jButtonAbrirOrderByToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaOrdenUbicacionProdu && this.isPermisoOrdenUbicacionProdu));
			this.jButtonNuevoRelacionesToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu && this.isPermisoNuevoUbicacionProdu));			
			this.jButtonNuevoGuardarCambiosToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoUbicacionProdu && this.isPermisoNuevoUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));			
			
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaModificarUbicacionProdu && this.isPermisoActualizarUbicacionProdu));	
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaActualizarUbicacionProdu  && this.isPermisoActualizarUbicacionProdu));	
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaEliminarUbicacionProdu && this.isPermisoEliminarUbicacionProdu));
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarToolBarUbicacionProdu.setVisible(this.isVisibilidadCeldaCancelarUbicacionProdu);				
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaGuardarUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUbicacionProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoUbicacionProdu && this.isPermisoNuevoUbicacionProdu));			
			this.jMenuItemDuplicarUbicacionProdu.setVisible((this.isVisibilidadCeldaDuplicarUbicacionProdu && this.isPermisoDuplicarUbicacionProdu));			
			this.jMenuItemCopiarUbicacionProdu.setVisible((this.isVisibilidadCeldaCopiarUbicacionProdu && this.isPermisoCopiarUbicacionProdu));			
			this.jMenuItemVerFormUbicacionProdu.setVisible((this.isVisibilidadCeldaVerFormUbicacionProdu && this.isPermisoVerFormUbicacionProdu));			
			this.jMenuItemAbrirOrderByUbicacionProdu.setVisible((this.isVisibilidadCeldaOrdenUbicacionProdu && this.isPermisoOrdenUbicacionProdu));			
			//this.jMenuItemMostrarOcultarUbicacionProdu.setVisible((this.isVisibilidadCeldaOrdenUbicacionProdu && this.isPermisoOrdenUbicacionProdu));
			this.jMenuItemDetalleAbrirOrderByUbicacionProdu.setVisible((this.isVisibilidadCeldaOrdenUbicacionProdu && this.isPermisoOrdenUbicacionProdu));			
			//this.jMenuItemDetalleMostrarOcultarUbicacionProdu.setVisible((this.isVisibilidadCeldaOrdenUbicacionProdu && this.isPermisoOrdenUbicacionProdu));			
			this.jMenuItemNuevoRelacionesUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu && this.isPermisoNuevoUbicacionProdu));			
			this.jMenuItemNuevoGuardarCambiosUbicacionProdu.setVisible((this.isVisibilidadCeldaNuevoUbicacionProdu && this.isPermisoNuevoUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));									
			
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemModificarUbicacionProdu.setVisible((this.isVisibilidadCeldaModificarUbicacionProdu && this.isPermisoActualizarUbicacionProdu));	
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemActualizarUbicacionProdu.setVisible((this.isVisibilidadCeldaActualizarUbicacionProdu && this.isPermisoActualizarUbicacionProdu));	
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemEliminarUbicacionProdu.setVisible((this.isVisibilidadCeldaEliminarUbicacionProdu && this.isPermisoEliminarUbicacionProdu));
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemCancelarUbicacionProdu.setVisible(this.isVisibilidadCeldaCancelarUbicacionProdu);				
			}
			
			this.jMenuItemGuardarCambiosUbicacionProdu.setVisible((this.isVisibilidadCeldaGuardarUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));						
			this.jMenuItemGuardarCambiosTablaUbicacionProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUbicacionProdu=this.jButtonNuevoUbicacionProdu.isVisible();
			this.isVisibilidadCeldaDuplicarUbicacionProdu=this.jButtonDuplicarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaCopiarUbicacionProdu=this.jButtonCopiarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaVerFormUbicacionProdu=this.jButtonVerFormUbicacionProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenUbicacionProdu=this.jButtonAbrirOrderByUbicacionProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=this.jButtonNuevoRelacionesUbicacionProdu.isVisible();
			this.isVisibilidadCeldaModificarUbicacionProdu=this.jButtonModificarUbicacionProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			this.isVisibilidadCeldaActualizarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaEliminarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaCancelarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaGuardarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosUbicacionProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=this.jButtonGuardarCambiosTablaUbicacionProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUbicacionProdu=this.jButtonNuevoToolBarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=this.jButtonNuevoRelacionesToolBarUbicacionProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			this.isVisibilidadCeldaModificarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarToolBarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaActualizarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarToolBarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaEliminarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarToolBarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaCancelarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarToolBarUbicacionProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUbicacionProdu=this.jButtonGuardarCambiosToolBarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=this.jButtonGuardarCambiosTablaToolBarUbicacionProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUbicacionProdu=this.jMenuItemNuevoUbicacionProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=this.jMenuItemNuevoRelacionesUbicacionProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			this.isVisibilidadCeldaModificarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemModificarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaActualizarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemActualizarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaEliminarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemEliminarUbicacionProdu.isVisible();
			this.isVisibilidadCeldaCancelarUbicacionProdu=this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemCancelarUbicacionProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUbicacionProdu=this.jMenuItemGuardarCambiosUbicacionProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=this.jMenuItemGuardarCambiosTablaUbicacionProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUbicacionProdu(Boolean esInicializar) {
		if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
				//if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUbicacionProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualUbicacionProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUbicacionProdu() {
		this.jButtonNuevoUbicacionProdu.setVisible(this.isPermisoNuevoUbicacionProdu);			
		this.jButtonDuplicarUbicacionProdu.setVisible(this.isPermisoDuplicarUbicacionProdu);			
		this.jButtonCopiarUbicacionProdu.setVisible(this.isPermisoCopiarUbicacionProdu);			
		this.jButtonVerFormUbicacionProdu.setVisible(this.isPermisoVerFormUbicacionProdu);			
		
		this.jButtonAbrirOrderByUbicacionProdu.setVisible(this.isPermisoOrdenUbicacionProdu);					
		
		this.jButtonNuevoRelacionesUbicacionProdu.setVisible(this.isPermisoNuevoUbicacionProdu);			
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarUbicacionProdu.setVisible(this.isPermisoActualizarUbicacionProdu);	
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarUbicacionProdu.setVisible(this.isPermisoActualizarUbicacionProdu);	
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarUbicacionProdu.setVisible(this.isPermisoEliminarUbicacionProdu);
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarUbicacionProdu.setVisible(this.isVisibilidadCeldaCancelarUbicacionProdu);						
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosUbicacionProdu.setVisible(this.isPermisoGuardarCambiosUbicacionProdu);							
		}
		
		this.jButtonGuardarCambiosTablaUbicacionProdu.setVisible(this.isPermisoActualizarUbicacionProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUbicacionProdu() {
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarUbicacionProdu.setVisible(this.isPermisoActualizarUbicacionProdu);	
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarUbicacionProdu.setVisible(this.isPermisoActualizarUbicacionProdu);	
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarUbicacionProdu.setVisible(this.isPermisoEliminarUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarUbicacionProdu.setVisible(this.isVisibilidadCeldaCancelarUbicacionProdu);							
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosUbicacionProdu.setVisible((this.isVisibilidadCeldaGuardarUbicacionProdu && this.isPermisoGuardarCambiosUbicacionProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUbicacionProdu() {
		if(UbicacionProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUbicacionProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUbicacionProdu() {
	}
	
	public void jTableDatosUbicacionProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUbicacionProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUbicacionProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionprodu==null) {
						this.ubicacionprodu = new UbicacionProdu();
					}

					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
				}

				if(this.ubicacionprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ubicacionprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaUbicacionProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebUbicacionProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ubicacionproduLogic.getConnexion());

				if(this.ubicacionprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ubicacionprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionProdu=(TitledBorder)this.jScrollPanelDatosUbicacionProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderUbicacionProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaUbicacionProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionprodu==null) {
						this.ubicacionprodu = new UbicacionProdu();
					}

					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
				}

				if(this.ubicacionprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ubicacionprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalUbicacionProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebUbicacionProdu(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ubicacionproduLogic.getConnexion());

				if(this.ubicacionprodu.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ubicacionprodu.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionProdu=(TitledBorder)this.jScrollPanelDatosUbicacionProdu.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderUbicacionProdu.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalUbicacionProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionprodu==null) {
						this.ubicacionprodu = new UbicacionProdu();
					}

					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
				}

				if(this.ubicacionprodu.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ubicacionprodu.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaUbicacionProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebUbicacionProdu(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.ubicacionproduLogic.getConnexion());

				if(this.ubicacionprodu.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.ubicacionprodu.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionProdu=(TitledBorder)this.jScrollPanelDatosUbicacionProdu.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderUbicacionProdu.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaUbicacionProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionprodu==null) {
						this.ubicacionprodu = new UbicacionProdu();
					}

					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
				}

				if(this.ubicacionprodu.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.ubicacionprodu.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoUbicacionProduActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderUbicacionProdu=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosUbicacionProdu.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderUbicacionProdu=(TitledBorder)this.jScrollPanelDatosUbicacionProdu.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderUbicacionProdu.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoUbicacionProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebUbicacionProdu(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.ubicacionproduLogic.getConnexion());

				if(this.ubicacionprodu.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.ubicacionprodu.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionProdu=(TitledBorder)this.jScrollPanelDatosUbicacionProdu.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderUbicacionProdu.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoUbicacionProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionprodu==null) {
						this.ubicacionprodu = new UbicacionProdu();
					}

					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
				}

				if(this.ubicacionprodu.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.ubicacionprodu.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ubicacion_bodeUbicacionProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoubicacionbode=true;

			idTienePermisoubicacionbode=this.tienePermisosUsuarioEnPaginaWebUbicacionProdu(UbicacionBodeConstantesFunciones.CLASSNAME);

			if(idTienePermisoubicacionbode) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);

				this.ubicacionbodeBeanSwingJInternalFrame=new UbicacionBodeBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ubicacionbodeBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ubicacionbodeBeanSwingJInternalFrame.getUbicacionBodeLogic().setConnexion(this.ubicacionproduLogic.getConnexion());

				if(this.ubicacionprodu.getid_ubicacion_bode()!=null) {
					this.ubicacionbodeBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ubicacionbodeBeanSwingJInternalFrame.setIdActual(this.ubicacionprodu.getid_ubicacion_bode());
					this.ubicacionbodeBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ubicacionbodeBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ubicacionbodeBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionBode();
				}

				JInternalFrameBase jinternalFrame =this.ubicacionbodeBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionProdu=(TitledBorder)this.jScrollPanelDatosUbicacionProdu.getBorder();
				TitledBorder titledBorderubicacionbode=(TitledBorder)this.ubicacionbodeBeanSwingJInternalFrame.jScrollPanelDatosUbicacionBode.getBorder();

				titledBorderubicacionbode.setTitle(titledBorderUbicacionProdu.getTitle() + " -> Ubicacion Bode");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ubicacion_bodeUbicacionProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.getubicacionprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionprodu==null) {
						this.ubicacionprodu = new UbicacionProdu();
					}

					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);
				}

				if(this.ubicacionprodu.getid_ubicacion_bode()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ubicacion_bode = "+this.ubicacionprodu.getid_ubicacion_bode().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaUbicacionProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionProdu(false,false);

			this.getUbicacionProdusFK_IdBodega();

			this.inicializarActualizarBindingUbicacionProdu(false);

			//if(UbicacionProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaUbicacionProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionProdu(false,false);

			this.getUbicacionProdusFK_IdEmpresa();

			this.inicializarActualizarBindingUbicacionProdu(false);

			//if(UbicacionProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoUbicacionProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionProdu(false,false);

			this.getUbicacionProdusFK_IdProducto();

			this.inicializarActualizarBindingUbicacionProdu(false);

			//if(UbicacionProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalUbicacionProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionProdu(false,false);

			this.getUbicacionProdusFK_IdSucursal();

			this.inicializarActualizarBindingUbicacionProdu(false);

			//if(UbicacionProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUbicacionBodeUbicacionProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionProdu(false,false);

			this.getUbicacionProdusFK_IdUbicacionBode();

			this.inicializarActualizarBindingUbicacionProdu(false);

			//if(UbicacionProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUbicacionProdu() {
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
			this.jInternalFrameDetalleFormUbicacionProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormUbicacionProdu.dispose();
			this.jInternalFrameDetalleFormUbicacionProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
			this.jInternalFrameReporteDinamicoUbicacionProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUbicacionProdu.dispose();
			this.jInternalFrameReporteDinamicoUbicacionProdu=null;
		}
		
		if(this.jInternalFrameImportacionUbicacionProdu!=null) {
			this.jInternalFrameImportacionUbicacionProdu.setVisible(false);	    			
			this.jInternalFrameImportacionUbicacionProdu.dispose();
			this.jInternalFrameImportacionUbicacionProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUbicacionProdu();
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoUbicacionProdu")) {
				jButtonNuevoUbicacionProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUbicacionProdu")) {
				jButtonDuplicarUbicacionProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUbicacionProdu")) {
				jButtonCopiarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormUbicacionProdu")) {
				jButtonVerFormUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUbicacionProdu")) {
				jButtonNuevoUbicacionProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUbicacionProdu")) {
				jButtonDuplicarUbicacionProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUbicacionProdu")) {
				jButtonNuevoUbicacionProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUbicacionProdu")) {
				jButtonDuplicarUbicacionProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUbicacionProdu")) {
				jButtonNuevoUbicacionProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUbicacionProdu")) {
				jButtonNuevoUbicacionProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUbicacionProdu")) {
				jButtonNuevoUbicacionProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUbicacionProdu")) {
				jButtonModificarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUbicacionProdu")) {
				jButtonModificarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUbicacionProdu")) {
				jButtonModificarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUbicacionProdu")) {
				jButtonActualizarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUbicacionProdu")) {
				jButtonActualizarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUbicacionProdu")) {
				jButtonActualizarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarUbicacionProdu")) {
				jButtonEliminarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUbicacionProdu")) {
				jButtonEliminarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUbicacionProdu")) {
				jButtonEliminarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarUbicacionProdu")) {
				jButtonCancelarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUbicacionProdu")) {
				jButtonCancelarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUbicacionProdu")) {
				jButtonCancelarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarUbicacionProdu")) {
				jButtonCerrarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUbicacionProdu")) {
				jButtonCerrarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUbicacionProdu")) {
				jButtonCerrarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUbicacionProdu")) {
				jButtonMostrarOcultarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUbicacionProdu")) {
				jButtonCancelarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUbicacionProdu")) {
				jButtonGuardarCambiosUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUbicacionProdu")) {
				jButtonGuardarCambiosUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUbicacionProdu")) {
				jButtonCopiarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUbicacionProdu")) {
				jButtonVerFormUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUbicacionProdu")) {
				jButtonGuardarCambiosUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUbicacionProdu")) {
				jButtonCopiarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUbicacionProdu")) {
				jButtonVerFormUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUbicacionProdu")) {
				jButtonGuardarCambiosUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUbicacionProdu")) {
				jButtonGuardarCambiosUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUbicacionProdu")) {
				jButtonGuardarCambiosUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUbicacionProdu")) {
				jButtonRecargarInformacionUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUbicacionProdu")) {
				jButtonRecargarInformacionUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUbicacionProdu")) {
				jButtonRecargarInformacionUbicacionProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUbicacionProdu")) {
				jButtonAnterioresUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUbicacionProdu")) {
				jButtonAnterioresUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUbicacionProdu")) {
				jButtonAnterioresUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUbicacionProdu")) {
				jButtonSiguientesUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUbicacionProdu")) {
				jButtonSiguientesUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUbicacionProdu")) {
				jButtonSiguientesUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUbicacionProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByUbicacionProdu")) {
				jButtonAbrirOrderByUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUbicacionProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarUbicacionProdu")) {
				jButtonMostrarOcultarUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUbicacionProdu")) {
				jButtonNuevoGuardarCambiosUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUbicacionProdu")) {
				jButtonNuevoGuardarCambiosUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUbicacionProdu")) {
				jButtonNuevoGuardarCambiosUbicacionProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUbicacionProdu")) {
				jButtonCerrarReporteDinamicoUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUbicacionProdu")) {
				jButtonGenerarReporteDinamicoUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUbicacionProdu")) {
				
				jButtonGenerarExcelReporteDinamicoUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUbicacionProdu")) {
				jButtonCerrarImportacionUbicacionProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUbicacionProdu")) {
				
				jButtonGenerarImportacionUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUbicacionProdu")) {
				
				jButtonAbrirImportacionUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUbicacionProdu")) {
				jComboBoxTiposAccionesUbicacionProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUbicacionProdu")) {
				jComboBoxTiposRelacionesUbicacionProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUbicacionProdu")) {
				jComboBoxTiposAccionesUbicacionProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUbicacionProdu")) {
				
				jComboBoxTiposSeleccionarUbicacionProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUbicacionProdu")) {
				jTextFieldValorCampoGeneralUbicacionProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUbicacionProdu")) {
				jButtonAbrirOrderByUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUbicacionProdu")) {
				jButtonAbrirOrderByUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUbicacionProdu")) {
				jButtonCerrarOrderByUbicacionProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUbicacionProduBusqueda")) {
				this.jButtonidUbicacionProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUbicacionProduUpdate")) {
				this.jButtonid_empresaUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUbicacionProduBusqueda")) {
				this.jButtonid_empresaUbicacionProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUbicacionProduUpdate")) {
				this.jButtonid_sucursalUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUbicacionProduBusqueda")) {
				this.jButtonid_sucursalUbicacionProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaUbicacionProduUpdate")) {
				this.jButtonid_bodegaUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaUbicacionProduBusqueda")) {
				this.jButtonid_bodegaUbicacionProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoUbicacionProdu")) {
				this.jButtonid_productoUbicacionProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoUbicacionProduUpdate")) {
				this.jButtonid_productoUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoUbicacionProduBusqueda")) {
				this.jButtonid_productoUbicacionProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ubicacion_bodeUbicacionProduUpdate")) {
				this.jButtonid_ubicacion_bodeUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ubicacion_bodeUbicacionProduBusqueda")) {
				this.jButtonid_ubicacion_bodeUbicacionProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBodegaUbicacionProdu")) {
				this.jButtonFK_IdBodegaUbicacionProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUbicacionBodeUbicacionProdu")) {
				this.jButtonFK_IdUbicacionBodeUbicacionProduActionPerformed(evt);
			}
			
			;
			
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUbicacionProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				


				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			UbicacionProdu ubicacionproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				ubicacionproduLocal=this.ubicacionprodu;
			} else {
				ubicacionproduLocal=this.ubicacionproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
							
				
				


				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
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
			
			


			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
								
						
				


				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
								
				
				


				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
							
				
				


				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
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
			
			


			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
								
				
				


				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUbicacionProdu")) {
					jCheckBoxSeleccionarTodosUbicacionProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUbicacionProdu")) {
					jCheckBoxSeleccionadosUbicacionProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUbicacionProdu")) {
					
				}
				
				


				
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
												
				
				


				
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
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
			
			


			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionprodu);
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
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
				
				


				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionproduAnterior =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUbicacionProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUbicacionProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUbicacionProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ubicacionprodu =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ubicacionprodu =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ubicacionprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUbicacionProdu")) {
				
				}
				
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUbicacionProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUbicacionProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUbicacionProdu")) {
			
			}
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUbicacionProdu();
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
			if(sTipo.equals("NuevoUbicacionProdu")) {
				jButtonNuevoUbicacionProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUbicacionProdu")) {
				jButtonDuplicarUbicacionProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUbicacionProdu")) {
				jButtonCopiarUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUbicacionProdu")) {
				jButtonVerFormUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUbicacionProdu")) {
				jButtonNuevoUbicacionProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUbicacionProdu")) {
				jButtonModificarUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUbicacionProdu")) {
				jButtonActualizarUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUbicacionProdu")) {
				jButtonEliminarUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUbicacionProdu")) {
				jButtonGuardarCambiosUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUbicacionProdu")) {
				jButtonCancelarUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUbicacionProdu")) {
				jButtonCerrarUbicacionProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUbicacionProdu")) {
				jButtonGuardarCambiosUbicacionProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUbicacionProdu")) {
				jButtonNuevoGuardarCambiosUbicacionProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUbicacionProdu")) {
				jButtonAbrirOrderByUbicacionProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUbicacionProdu")) {
				jButtonRecargarInformacionUbicacionProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUbicacionProdu")) {
				jButtonAnterioresUbicacionProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUbicacionProdu")) {
				jButtonSiguientesUbicacionProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUbicacionProduBusqueda")) {
				this.jButtonidUbicacionProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUbicacionProduUpdate")) {
				this.jButtonid_empresaUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUbicacionProduBusqueda")) {
				this.jButtonid_empresaUbicacionProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUbicacionProduUpdate")) {
				this.jButtonid_sucursalUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUbicacionProduBusqueda")) {
				this.jButtonid_sucursalUbicacionProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaUbicacionProduUpdate")) {
				this.jButtonid_bodegaUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaUbicacionProduBusqueda")) {
				this.jButtonid_bodegaUbicacionProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoUbicacionProdu")) {
				this.jButtonid_productoUbicacionProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoUbicacionProduUpdate")) {
				this.jButtonid_productoUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoUbicacionProduBusqueda")) {
				this.jButtonid_productoUbicacionProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ubicacion_bodeUbicacionProduUpdate")) {
				this.jButtonid_ubicacion_bodeUbicacionProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ubicacion_bodeUbicacionProduBusqueda")) {
				this.jButtonid_ubicacion_bodeUbicacionProduBusquedaActionPerformed(evt);
			}
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUbicacionProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUbicacionProdu")) {
				closingInternalFrameUbicacionProdu();
				
			} else if(sTipo.equals("jButtonCancelarUbicacionProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormUbicacionProdu = (JInternalFrameBase)evt.getSource();
	            	
	            UbicacionProduBeanSwingJInternalFrame jInternalFrameParent=(UbicacionProduBeanSwingJInternalFrame)jInternalFrameDetalleFormUbicacionProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUbicacionProduActionPerformed(null);
			}
			
			UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ubicacionprodu,new Object(),this.ubicacionproduParameterGeneral,this.ubicacionproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUbicacionProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUbicacionProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUbicacionProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ubicacionprodu)) {
			if(!esControlTabla) {
				if(UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);			
				}
				
				if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUbicacionProdu(this.ubicacionprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ubicacionproduReturnGeneral=ubicacionproduLogic.procesarEventosUbicacionProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ubicacionproduLogic.getUbicacionProdus(),this.ubicacionprodu,this.ubicacionproduParameterGeneral,this.isEsNuevoUbicacionProdu,classes);//this.ubicacionproduLogic.getUbicacionProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUbicacionProdu(this.ubicacionproduReturnGeneral,this.ubicacionproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUbicacionProdu(classes,this.ubicacionproduReturnGeneral,this.ubicacionproduBean,false);
					}
						
					if(this.ubicacionproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUbicacionProdu(this.ubicacionproduReturnGeneral.getUbicacionProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUbicacionProdu(this.ubicacionproduReturnGeneral.getUbicacionProdu());	
					}
						
					if(this.ubicacionproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUbicacionProdu(this.ubicacionproduReturnGeneral.getUbicacionProdu(),classes);//this.ubicacionproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUbicacionProdu(this.ubicacionprodu,classes);//this.ubicacionproduBean);									
				}
			
				if(UbicacionProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUbicacionProdu(this.ubicacionprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionProdu(this.ubicacionprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ubicacionproduAnterior!=null) {
						this.ubicacionprodu=this.ubicacionproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ubicacionproduReturnGeneral=ubicacionproduLogic.procesarEventosUbicacionProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ubicacionproduLogic.getUbicacionProdus(),this.ubicacionprodu,this.ubicacionproduParameterGeneral,this.isEsNuevoUbicacionProdu,classes);//this.ubicacionproduLogic.getUbicacionProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ubicacionproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ubicacionproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ubicacionproduReturnGeneral.getUbicacionProdu(),ubicacionproduLogic.getUbicacionProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ubicacionproduReturnGeneral.getUbicacionProdu(),this.ubicacionprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUbicacionProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosUbicacionProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUbicacionProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosUbicacionProdu() throws Exception {
		
		UbicacionProduModel ubicacionproduModel=(UbicacionProduModel)this.jTableDatosUbicacionProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ubicacionproduModel.ubicacionprodus=this.ubicacionproduLogic.getUbicacionProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ubicacionproduModel.ubicacionprodus=this.ubicacionprodus;
		}
		
		
		((UbicacionProduModel) this.jTableDatosUbicacionProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUbicacionProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getubicacionproduAnterior(),this.ubicacionproduLogic.getUbicacionProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getubicacionproduAnterior(),this.ubicacionprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUbicacionProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUbicacionProdu(UbicacionProdu ubicacionprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
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
										
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ubicacionprodu,new Object(),generalEntityParameterGeneral,this.ubicacionproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ubicacionproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UbicacionProduConstantesFunciones.getClassesRelationshipsOfUbicacionProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UbicacionProduConstantesFunciones.getClassesRelationshipsFromStringsOfUbicacionProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUbicacionProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UbicacionProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ubicacionprodu,new Object(),generalEntityParameterGeneral,this.ubicacionproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUbicacionProdu(UbicacionProduBean ubicacionproduBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUbicacionProdu(ArrayList<Classe> classes,UbicacionProduReturnGeneral ubicacionproduReturnGeneral,UbicacionProduBean ubicacionproduBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUbicacionProdu(UbicacionProdu ubicacionprodu,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ubicacionprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUbicacionProdu = new UbicacionProduDetalleFormJInternalFrame(jDesktopPane,this.ubicacionproduSessionBean.getConGuardarRelaciones(),this.ubicacionproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.setVisible(false);
		this.jInternalFrameDetalleFormUbicacionProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormUbicacionProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUbicacionProdu.ubicacionproduLogic=this.ubicacionproduLogic;
		
		this.cargarCombosFrameForeignKeyUbicacionProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUbicacionProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUbicacionProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUbicacionProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUbicacionProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUbicacionProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUbicacionProdu"));
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarUbicacionProdu.addActionListener(new ButtonActionListener(this,"ModificarUbicacionProdu"));

		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarToolBarUbicacionProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarUbicacionProdu"));
					
		this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemModificarUbicacionProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarUbicacionProdu"));		
		
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarUbicacionProdu.addActionListener (new ButtonActionListener(this,"ActualizarUbicacionProdu"));
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarToolBarUbicacionProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUbicacionProdu"));
						
		this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemActualizarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUbicacionProdu"));		
		
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarUbicacionProdu.addActionListener (new ButtonActionListener(this,"EliminarUbicacionProdu"));
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarUbicacionProdu"));
								
		this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemEliminarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUbicacionProdu"));		
		
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarUbicacionProdu.addActionListener (new ButtonActionListener(this,"CancelarUbicacionProdu"));
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarUbicacionProdu"));
					
		this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemCancelarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUbicacionProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemDetalleCerrarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUbicacionProdu"));		
		
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUbicacionProdu"));
		
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUbicacionProdu"));
		
		
		
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUbicacionProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonidUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"idUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_empresaUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_empresaUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_sucursalUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_sucursalUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_bodegaUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_bodegaUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionProduBusqueda"));
		//jButtonid_productoUbicacionProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoUbicacionProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProdu.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_ubicacion_bodeUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_ubicacion_bodeUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUbicacionProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUbicacionProdu"));
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUbicacionProdu"));
		}
		
		this.jTableDatosUbicacionProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUbicacionProdu"));
		
		this.jTableDatosUbicacionProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUbicacionProdu"));
		
		this.jButtonNuevoUbicacionProdu.addActionListener(new ButtonActionListener(this,"NuevoUbicacionProdu"));
		
		this.jButtonDuplicarUbicacionProdu.addActionListener(new ButtonActionListener(this,"DuplicarUbicacionProdu"));
		
		this.jButtonCopiarUbicacionProdu.addActionListener(new ButtonActionListener(this,"CopiarUbicacionProdu"));
		
		this.jButtonVerFormUbicacionProdu.addActionListener(new ButtonActionListener(this,"VerFormUbicacionProdu"));
		
		
		this.jButtonNuevoToolBarUbicacionProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarUbicacionProdu"));
			
		this.jButtonDuplicarToolBarUbicacionProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUbicacionProdu"));
			
		this.jMenuItemNuevoUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUbicacionProdu"));
			
		this.jMenuItemDuplicarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUbicacionProdu"));		
		
		
		this.jButtonNuevoRelacionesUbicacionProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUbicacionProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarUbicacionProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUbicacionProdu"));
			
		this.jMenuItemNuevoRelacionesUbicacionProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUbicacionProdu"));		
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarUbicacionProdu.addActionListener(new ButtonActionListener(this,"ModificarUbicacionProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonModificarToolBarUbicacionProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarUbicacionProdu"));
			
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemModificarUbicacionProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarUbicacionProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarUbicacionProdu.addActionListener (new ButtonActionListener(this,"ActualizarUbicacionProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonActualizarToolBarUbicacionProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUbicacionProdu"));
				
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemActualizarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUbicacionProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarUbicacionProdu.addActionListener (new ButtonActionListener(this,"EliminarUbicacionProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonEliminarToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarUbicacionProdu"));
						
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemEliminarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUbicacionProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarUbicacionProdu.addActionListener (new ButtonActionListener(this,"CancelarUbicacionProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonCancelarToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarUbicacionProdu"));
			
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemCancelarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUbicacionProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUbicacionProdu"));		
		
		
		this.jButtonCerrarUbicacionProdu.addActionListener (new ButtonActionListener(this,"CerrarUbicacionProdu"));
		
		
		this.jButtonCerrarToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarUbicacionProdu"));
			
		this.jMenuItemCerrarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUbicacionProdu"));
			
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jMenuItemDetalleCerrarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUbicacionProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosUbicacionProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosUbicacionProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUbicacionProdu"));
		}
		
		this.jButtonCopiarToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarUbicacionProdu"));
			
		this.jButtonVerFormToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarUbicacionProdu"));
		
		this.jMenuItemGuardarCambiosUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUbicacionProdu"));
			
		this.jMenuItemCopiarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUbicacionProdu"));		
		
		this.jMenuItemVerFormUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUbicacionProdu"));		
		
		
		this.jButtonGuardarCambiosTablaUbicacionProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUbicacionProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUbicacionProdu"));
			
		this.jMenuItemGuardarCambiosTablaUbicacionProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUbicacionProdu"));		
		
		
		
		this.jButtonRecargarInformacionUbicacionProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionUbicacionProdu"));
					
		this.jButtonRecargarInformacionToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUbicacionProdu"));
		
		this.jMenuItemRecargarInformacionUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUbicacionProdu"));		
		
		
		
		this.jButtonAnterioresUbicacionProdu.addActionListener (new ButtonActionListener(this,"AnterioresUbicacionProdu"));
		
		
		this.jButtonAnterioresToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUbicacionProdu"));
		
		this.jMenuItemAnterioresUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUbicacionProdu"));		
		
		
		this.jButtonSiguientesUbicacionProdu.addActionListener (new ButtonActionListener(this,"SiguientesUbicacionProdu"));
		
		
		this.jButtonSiguientesToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUbicacionProdu"));
			
		this.jMenuItemSiguientesUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUbicacionProdu"));
			
		this.jMenuItemAbrirOrderByUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUbicacionProdu"));
			
		this.jMenuItemMostrarOcultarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUbicacionProdu"));
			
		this.jMenuItemDetalleAbrirOrderByUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUbicacionProdu"));
			
		this.jMenuItemDetalleMostarOcultarUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUbicacionProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosUbicacionProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUbicacionProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUbicacionProdu"));
			
		this.jMenuItemNuevoGuardarCambiosUbicacionProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUbicacionProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUbicacionProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUbicacionProdu"));

		this.jCheckBoxSeleccionadosUbicacionProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUbicacionProdu"));
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUbicacionProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesUbicacionProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesUbicacionProdu"));
			
		this.jComboBoxTiposAccionesUbicacionProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesUbicacionProdu"));
					
		this.jComboBoxTiposSeleccionarUbicacionProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUbicacionProdu"));
			
		this.jTextFieldValorCampoGeneralUbicacionProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUbicacionProdu"));		
		
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonidUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"idUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_empresaUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_empresaUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_sucursalUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_sucursalUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_bodegaUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_bodegaUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionProduBusqueda"));
		//jButtonid_productoUbicacionProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoUbicacionProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProdu.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_ubicacion_bodeUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_ubicacion_bodeUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaUbicacionProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaUbicacionProdu"));

			this.jButtonFK_IdUbicacionBodeUbicacionProdu.addActionListener(new ButtonActionListener(this,"FK_IdUbicacionBodeUbicacionProdu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUbicacionProdu!=null) {
				this.jInternalFrameReporteDinamicoUbicacionProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUbicacionProdu"));
				this.jInternalFrameReporteDinamicoUbicacionProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUbicacionProdu"));
				this.jInternalFrameReporteDinamicoUbicacionProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUbicacionProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoUbicacionProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUbicacionProdu"));				
			//this.jButtonGenerarReporteDinamicoUbicacionProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUbicacionProdu"));
			//this.jButtonGenerarExcelReporteDinamicoUbicacionProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUbicacionProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUbicacionProdu!=null) {
				this.jInternalFrameImportacionUbicacionProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUbicacionProdu"));
				this.jInternalFrameImportacionUbicacionProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUbicacionProdu"));
				this.jInternalFrameImportacionUbicacionProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUbicacionProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUbicacionProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByUbicacionProdu"));
			
			this.jButtonAbrirOrderByToolBarUbicacionProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUbicacionProdu"));			
			
			if(this.jInternalFrameOrderByUbicacionProdu!=null) {
				this.jInternalFrameOrderByUbicacionProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUbicacionProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionProdu.jTabbedPaneRelacionesUbicacionProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUbicacionProdu"));
		
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
            		closingInternalFrameUbicacionProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUbicacionProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUbicacionProdu = (JInternalFrameBase)event.getSource();
	            	
	            UbicacionProduBeanSwingJInternalFrame jInternalFrameParent=(UbicacionProduBeanSwingJInternalFrame)jInternalFrameDetalleFormUbicacionProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUbicacionProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUbicacionProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUbicacionProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUbicacionProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUbicacionProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUbicacionProdu";
		inputMap = this.jButtonNuevoUbicacionProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUbicacionProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUbicacionProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUbicacionProdu";
		inputMap = this.jButtonNuevoRelacionesUbicacionProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUbicacionProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUbicacionProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUbicacionProdu";
		inputMap = this.jButtonModificarUbicacionProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUbicacionProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUbicacionProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUbicacionProdu";
		inputMap = this.jButtonActualizarUbicacionProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUbicacionProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUbicacionProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUbicacionProdu";
		inputMap = this.jButtonEliminarUbicacionProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUbicacionProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUbicacionProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUbicacionProdu";
		inputMap = this.jButtonCancelarUbicacionProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUbicacionProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUbicacionProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUbicacionProdu";
		inputMap = this.jButtonCerrarUbicacionProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUbicacionProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUbicacionProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUbicacionProdu";
		inputMap = this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosUbicacionProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonGuardarCambiosUbicacionProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUbicacionProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUbicacionProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUbicacionProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUbicacionProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUbicacionProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUbicacionProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUbicacionProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUbicacionProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUbicacionProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonidUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"idUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_empresaUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_empresaUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_sucursalUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_sucursalUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_bodegaUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_bodegaUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionProduBusqueda"));
		//jButtonid_productoUbicacionProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoUbicacionProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProdu.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoUbicacionProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_ubicacion_bodeUbicacionProduUpdate.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_ubicacion_bodeUbicacionProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionProduBusqueda"));
		
		
		this.jButtonFK_IdBodegaUbicacionProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaUbicacionProdu"));

		this.jButtonFK_IdUbicacionBodeUbicacionProdu.addActionListener(new ButtonActionListener(this,"FK_IdUbicacionBodeUbicacionProdu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUbicacionProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUbicacionProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUbicacionProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUbicacionProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUbicacionProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
					ubicacionproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UbicacionProdu ubicacionproduAux:ubicacionprodus) {
					ubicacionproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUbicacionProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUbicacionProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
						ubicacionproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UbicacionProdu ubicacionproduAux:ubicacionprodus) {
						ubicacionproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UbicacionProdu ubicacionproduAux:ubicacionprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUbicacionProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUbicacionProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUbicacionProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUbicacionProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUbicacionProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUbicacionProdu.getSelectedRows();
			
			UbicacionProdu ubicacionproduLocal=new UbicacionProdu();
			
			//this.seleccionarTodosUbicacionProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionproduLocal =(UbicacionProdu) this.ubicacionproduLogic.getUbicacionProdus().toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ubicacionproduLocal =(UbicacionProdu) this.ubicacionprodus.toArray()[this.jTableDatosUbicacionProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ubicacionproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
						ubicacionproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UbicacionProdu ubicacionproduAux:ubicacionprodus) {
						ubicacionproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUbicacionProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUbicacionProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUbicacionProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUbicacionProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUbicacionProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUbicacionProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUbicacionProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUbicacionProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUbicacionProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UbicacionProdu ubicacionproduAux:this.ubicacionproduLogic.getUbicacionProdus()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UbicacionProdu ubicacionproduAux:ubicacionprodus) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUbicacionProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUbicacionProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUbicacionProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUbicacionProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUbicacionProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUbicacionProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessUbicacionProdu(conSplash);
				
					this.generarReporteUbicacionProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUbicacionProdusSeleccionados();
				//this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUbicacionProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUbicacionProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUbicacionProdu();
				
				this.exportarUbicacionProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUbicacionProdus();
				//this.importarUbicacionProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUbicacionProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUbicacionProdusSeleccionados();
				//this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ubicacion Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUbicacionProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUbicacionProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUbicacionProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(UbicacionProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUbicacionProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUbicacionProdu(conSplash);
					
						//this.actualizarParametrosGeneralUbicacionProdu();
						
						this.generarReporteProcesoAccionUbicacionProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UbicacionProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ubicacion ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Ubicacion Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUbicacionProdu();
				
						this.actualizarParametrosGeneralUbicacionProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ubicacionproduReturnGeneral=ubicacionproduLogic.procesarAccionUbicacionProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ubicacionproduLogic.getUbicacionProdus(),this.ubicacionproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUbicacionProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUbicacionProdu();
					
					UbicacionProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUbicacionProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUbicacionProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxTiposAccionesFormularioUbicacionProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUbicacionProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUbicacionProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUbicacionProdu();
			
			if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		
			UbicacionProdu ubicacionprodu=new UbicacionProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUbicacionProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUbicacionProdu.getSelectedItem();
			
			
			
			
			ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(ubicacionprodusSeleccionados.size()==1) {
				for(UbicacionProdu ubicacionproduAux:ubicacionprodusSeleccionados) {
					ubicacionprodu=ubicacionproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUbicacionProdu();
			
      		//this.finishProcessUbicacionProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUbicacionProduReturnGeneral() throws Exception {
		if(this.ubicacionproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ubicacionproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ubicacionproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ubicacionproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ubicacionproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ubicacionproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUbicacionProdu(false);
		}
		
		if(this.ubicacionproduReturnGeneral.getConRetornoLista() || this.ubicacionproduReturnGeneral.getConRetornoObjeto()) {
			if(this.ubicacionproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ubicacionproduLogic.setUbicacionProdus(this.ubicacionproduReturnGeneral.getUbicacionProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.ubicacionproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ubicacionproduLogic.setUbicacionProdu(this.ubicacionproduReturnGeneral.getUbicacionProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUbicacionProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralUbicacionProdu() throws Exception {
		
		
	}
	
	public ArrayList<UbicacionProdu> getUbicacionProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUbicacionProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(UbicacionProdu ubicacionproduAux:ubicacionproduLogic.getUbicacionProdus()) {
					if(ubicacionproduAux.getIsSelected()) {
						ubicacionprodusSeleccionados.add(ubicacionproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UbicacionProdu ubicacionproduAux:this.ubicacionprodus) {
					if(ubicacionproduAux.getIsSelected()) {
						ubicacionprodusSeleccionados.add(ubicacionproduAux);				
					}
				}
			}
			
			if(ubicacionprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ubicacionprodusSeleccionados.addAll(this.ubicacionproduLogic.getUbicacionProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ubicacionprodusSeleccionados.addAll(this.ubicacionprodus);				
					}
				}
			}
		} else {
			ubicacionprodusSeleccionados.add(this.ubicacionprodu);
		}
		
		return ubicacionprodusSeleccionados;
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
	
	public void generarReporteUbicacionProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUbicacionProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUbicacionProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUbicacionProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUbicacionProdusSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ubicacion Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUbicacionProdusSeleccionados() throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUbicacionProdus("Todos",ubicacionprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalUbicacionProdusSeleccionados() throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUbicacionProdus("Todos",ubicacionprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUbicacionProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUbicacionProdus("Todos",ubicacionprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUbicacionProdusSeleccionados() throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUbicacionProdu();
		
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUbicacionProdu();
		
		
		//this.generarReporteUbicacionProdus("Todos",ubicacionprodusSeleccionados ,ubicacionproduImplementable,ubicacionproduImplementableHome);
	}
	
	public void mostrarImportacionUbicacionProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUbicacionProdu();
		
		this.abrirFrameImportacionUbicacionProdu();		
		
			
		//this.generarReporteUbicacionProdus("Todos",ubicacionprodusSeleccionados ,ubicacionproduImplementable,ubicacionproduImplementableHome);
	}
	
	public void importarUbicacionProdus() throws Exception {		
	
	}
	
	public void exportarUbicacionProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUbicacionProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUbicacionProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUbicacionProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ubicacion Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUbicacionProdusSeleccionados() throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUbicacionProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(UbicacionProdu ubicacionproduAux:ubicacionprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUbicacionProdu(ubicacionproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ubicacionproduAux.setsDetalleGeneralEntityReporte(ubicacionproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUbicacionProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UbicacionProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionProduConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUbicacionProdu(UbicacionProdu ubicacionprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ubicacionprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionprodu.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionprodu.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionprodu.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionprodu.getubicacionbode_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUbicacionProdusSeleccionados() throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("UbicacionProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUbicacionProdu(row);				
				iRow++;
			}				
			
			for(UbicacionProdu ubicacionproduAux:ubicacionprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUbicacionProdu(ubicacionproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUbicacionProdusSeleccionados() throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();		
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ubicacionprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ubicacionprodu");
			//elementRoot.appendChild(element);
		
			for(UbicacionProdu ubicacionproduAux:ubicacionprodusSeleccionados) {
				element = document.createElement("ubicacionprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUbicacionProdu(ubicacionproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUbicacionProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUbicacionProdu(UbicacionProdu ubicacionprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionprodu.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionprodu.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionprodu.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionprodu.getubicacionbode_descripcion());				
	}
	
	public void setFilaDatosExportarXmlUbicacionProdu(UbicacionProdu ubicacionprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UbicacionProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ubicacionprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UbicacionProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ubicacionprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(UbicacionProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ubicacionprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(UbicacionProduConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ubicacionprodu.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(UbicacionProduConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(ubicacionprodu.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(UbicacionProduConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(ubicacionprodu.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementubicacionbode_descripcion = document.createElement(UbicacionProduConstantesFunciones.IDUBICACIONBODE);
		elementubicacionbode_descripcion.appendChild(document.createTextNode(ubicacionprodu.getubicacionbode_descripcion()));
		element.appendChild(elementubicacionbode_descripcion);
	}
	
	public void generarReporteGroupGenericoUbicacionProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<UbicacionProdu> ubicacionprodusSeleccionados=new ArrayList<UbicacionProdu>();
		
		ubicacionprodusSeleccionados=this.getUbicacionProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUbicacionProdu(ubicacionprodusSeleccionados);
		
		this.generarReporteUbicacionProdus("Todos",ubicacionprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUbicacionProdu(ArrayList<UbicacionProdu> ubicacionprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(UbicacionProdu ubicacionproduAux:ubicacionprodusSeleccionados) {
				ubicacionproduAux.setsDetalleGeneralEntityReporte(ubicacionproduAux.toString());
			
				if(sTipoSeleccionar.equals(UbicacionProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ubicacionproduAux.setsDescripcionGeneralEntityReporte1(ubicacionproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UbicacionProduConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ubicacionproduAux.setsDescripcionGeneralEntityReporte1(ubicacionproduAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UbicacionProduConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					ubicacionproduAux.setsDescripcionGeneralEntityReporte1(ubicacionproduAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UbicacionProduConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					ubicacionproduAux.setsDescripcionGeneralEntityReporte1(ubicacionproduAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UbicacionProduConstantesFunciones.LABEL_IDUBICACIONBODE)) {
					existe=true;
					ubicacionproduAux.setsDescripcionGeneralEntityReporte1(ubicacionproduAux.getubicacionbode_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUbicacionProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUbicacionProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=true;
				this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=true;
			}
			
			this.isVisibilidadCeldaModificarUbicacionProdu=false;
			this.isVisibilidadCeldaActualizarUbicacionProdu=false;
			this.isVisibilidadCeldaEliminarUbicacionProdu=false;
			this.isVisibilidadCeldaCancelarUbicacionProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUbicacionProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=false;
			this.isVisibilidadCeldaModificarUbicacionProdu=false;
			this.isVisibilidadCeldaActualizarUbicacionProdu=true;
			this.isVisibilidadCeldaEliminarUbicacionProdu=false;
			this.isVisibilidadCeldaCancelarUbicacionProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUbicacionProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=false;
			this.isVisibilidadCeldaModificarUbicacionProdu=false;
			this.isVisibilidadCeldaActualizarUbicacionProdu=true;
			this.isVisibilidadCeldaEliminarUbicacionProdu=true;
			this.isVisibilidadCeldaCancelarUbicacionProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUbicacionProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=false;
			this.isVisibilidadCeldaModificarUbicacionProdu=false;
			this.isVisibilidadCeldaActualizarUbicacionProdu=true;
			this.isVisibilidadCeldaEliminarUbicacionProdu=false;
			this.isVisibilidadCeldaCancelarUbicacionProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUbicacionProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=true;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=true;
			this.isVisibilidadCeldaModificarUbicacionProdu=false;
			this.isVisibilidadCeldaActualizarUbicacionProdu=false;
			this.isVisibilidadCeldaEliminarUbicacionProdu=false;
			this.isVisibilidadCeldaCancelarUbicacionProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUbicacionProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=false;
			this.isVisibilidadCeldaActualizarUbicacionProdu=false;
			this.isVisibilidadCeldaEliminarUbicacionProdu=false;
			this.isVisibilidadCeldaCancelarUbicacionProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUbicacionProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=false;
			this.isVisibilidadCeldaModificarUbicacionProdu=true;
			this.isVisibilidadCeldaActualizarUbicacionProdu=false;
			this.isVisibilidadCeldaEliminarUbicacionProdu=false;
			this.isVisibilidadCeldaCancelarUbicacionProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UbicacionProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUbicacionProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=true;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=true;
		} else {
			this.actualizarEstadoPanelsUbicacionProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUbicacionProdu=false;
			//this.isVisibilidadCeldaVerFormUbicacionProdu=false;
			this.isVisibilidadCeldaDuplicarUbicacionProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ubicacionproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoUbicacionProdu=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			if(!ubicacionproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;												
			}
			
			this.jButtonCerrarUbicacionProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUbicacionProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.ubicacionprodu)) {
			this.isVisibilidadCeldaActualizarUbicacionProdu=false;
			this.isVisibilidadCeldaEliminarUbicacionProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUbicacionProdu() {
	}
	
	public void actualizarEstadoPanelsUbicacionProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUbicacionProdu!=null) {
				this.jScrollPanelDatosEdicionUbicacionProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionProdu!=null) {
				this.jScrollPanelDatosUbicacionProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionUbicacionProdu!=null) {
				this.jPanelPaginacionUbicacionProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUbicacionProdu!=null) {
				this.jScrollPanelDatosEdicionUbicacionProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUbicacionProdu!=null) {
				this.jScrollPanelDatosUbicacionProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionUbicacionProdu!=null) {
				this.jPanelPaginacionUbicacionProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUbicacionProdu!=null) {
				this.jScrollPanelDatosEdicionUbicacionProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionProdu!=null) {
				this.jScrollPanelDatosUbicacionProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionUbicacionProdu!=null) {
				this.jPanelPaginacionUbicacionProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUbicacionProdu!=null) {
				this.jScrollPanelDatosEdicionUbicacionProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionProdu!=null) {
				this.jScrollPanelDatosUbicacionProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionUbicacionProdu!=null) {
				this.jPanelPaginacionUbicacionProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUbicacionProdu!=null) {
				this.jScrollPanelDatosEdicionUbicacionProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionProdu!=null) {
				this.jScrollPanelDatosUbicacionProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionUbicacionProdu!=null) {
				this.jPanelPaginacionUbicacionProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUbicacionProdu!=null) {
				this.jScrollPanelDatosEdicionUbicacionProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionProdu!=null) {
				this.jScrollPanelDatosUbicacionProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionUbicacionProdu!=null) {
				this.jPanelPaginacionUbicacionProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUbicacionProdu!=null) {
				this.jScrollPanelDatosEdicionUbicacionProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionProdu!=null) {
				this.jScrollPanelDatosUbicacionProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionUbicacionProdu!=null) {
				this.jPanelPaginacionUbicacionProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
					this.jTabbedPaneBusquedasUbicacionProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionProdu!=null) {
				this.jTabbedPaneBusquedasUbicacionProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUbicacionProdu!=null) {
				this.jPanelParametrosReportesUbicacionProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdBodegaUbicacionProdu);}

			this.isVisibilidadFK_IdUbicacionBode=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdUbicacionBodeUbicacionProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdBodegaUbicacionProdu);}

			this.isVisibilidadFK_IdUbicacionBode=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdUbicacionBodeUbicacionProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdBodegaUbicacionProdu);}

			this.isVisibilidadFK_IdUbicacionBode=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdUbicacionBodeUbicacionProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdBodegaUbicacionProdu);}

			this.isVisibilidadFK_IdUbicacionBode=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdUbicacionBodeUbicacionProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaUbicacionBode(Boolean isParaUbicacionBode){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUbicacionBodeNegation=!isParaUbicacionBode;

			this.isVisibilidadFK_IdBodega=isParaUbicacionBodeNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdBodegaUbicacionProdu);}

			this.isVisibilidadFK_IdUbicacionBode=isParaUbicacionBode;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionProdu.remove(jPanelFK_IdUbicacionBodeUbicacionProdu);}
		}
		
	}
	
	
	
	

	public String registrarSesionUbicacionProduParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(ubicacionproduSessionBean==null) {
				ubicacionproduSessionBean=new UbicacionProduSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(ubicacionproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.ubicacionproduFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(UbicacionProduConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionUbicacionProdu(true);
			//productoSessionBean.setlidUbicacionProduActual(this.idUbicacionProduActual);

			ubicacionproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUbicacionProdu(true);
			ubicacionproduSessionBean.setlIdUbicacionProduActualForeignKey(this.idUbicacionProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UbicacionProduSessionBean ubicacionproduSessionBean=new UbicacionProduSessionBean();
		
		if(this.ubicacionproduSessionBean==null) {
			this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
		}
		
		this.ubicacionproduSessionBean.setsUltimaBusquedaUbicacionProdu(this.getsAccionBusqueda());
		this.ubicacionproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.ubicacionproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			ubicacionproduSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			ubicacionproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			ubicacionproduSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUbicacionBode")) {
			ubicacionproduSessionBean.setid_ubicacion_bode(this.getid_ubicacion_bodeFK_IdUbicacionBode());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UbicacionProduSessionBean ubicacionproduSessionBean=new UbicacionProduSessionBean();
		
		if(this.ubicacionproduSessionBean==null) {
			this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
		}
		
		if(this.ubicacionproduSessionBean.getsUltimaBusquedaUbicacionProdu()!=null&&!this.ubicacionproduSessionBean.getsUltimaBusquedaUbicacionProdu().equals("")) {
			this.setsAccionBusqueda(ubicacionproduSessionBean.getsUltimaBusquedaUbicacionProdu());
			this.setiNumeroPaginacion(ubicacionproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(ubicacionproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(ubicacionproduSessionBean.getid_bodega());
				ubicacionproduSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(ubicacionproduSessionBean.getid_empresa());
				ubicacionproduSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(ubicacionproduSessionBean.getid_sucursal());
				ubicacionproduSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUbicacionBode")) {
				this.setid_ubicacion_bodeFK_IdUbicacionBode(ubicacionproduSessionBean.getid_ubicacion_bode());
				ubicacionproduSessionBean.setid_ubicacion_bode(-1L);
			}
		}
		
		this.ubicacionproduSessionBean.setsUltimaBusquedaUbicacionProdu("");
		this.ubicacionproduSessionBean.setiNumeroPaginacion(UbicacionProduConstantesFunciones.INUMEROPAGINACION);
		this.ubicacionproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUbicacionProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUbicacionProdu() {
		this.updateBorderResaltarBusquedasFormularioUbicacionProdu();
		this.updateVisibilidadBusquedasFormularioUbicacionProdu();
		this.updateHabilitarBusquedasFormularioUbicacionProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioUbicacionProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUbicacionProdu.getComponents().length>0) {
	

		if(this.ubicacionproduConstantesFunciones.resaltarFK_IdBodegaUbicacionProdu!=null) {
			index= this.jTabbedPaneBusquedasUbicacionProdu.indexOfComponent(this.jPanelFK_IdBodegaUbicacionProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionProdu.getComponent(index);
				jPanel.setBorder(this.ubicacionproduConstantesFunciones.resaltarFK_IdBodegaUbicacionProdu);
			}
		}

		if(this.ubicacionproduConstantesFunciones.resaltarFK_IdUbicacionBodeUbicacionProdu!=null) {
			index= this.jTabbedPaneBusquedasUbicacionProdu.indexOfComponent(this.jPanelFK_IdUbicacionBodeUbicacionProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionProdu.getComponent(index);
				jPanel.setBorder(this.ubicacionproduConstantesFunciones.resaltarFK_IdUbicacionBodeUbicacionProdu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUbicacionProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUbicacionProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUbicacionProdu.indexOfComponent(this.jPanelFK_IdBodegaUbicacionProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ubicacionproduConstantesFunciones.mostrarFK_IdBodegaUbicacionProdu);
			if(!this.ubicacionproduConstantesFunciones.mostrarFK_IdBodegaUbicacionProdu && index>-1) {
				this.jTabbedPaneBusquedasUbicacionProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasUbicacionProdu.indexOfComponent(this.jPanelFK_IdUbicacionBodeUbicacionProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ubicacionproduConstantesFunciones.mostrarFK_IdUbicacionBodeUbicacionProdu);
			if(!this.ubicacionproduConstantesFunciones.mostrarFK_IdUbicacionBodeUbicacionProdu && index>-1) {
				this.jTabbedPaneBusquedasUbicacionProdu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUbicacionProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUbicacionProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUbicacionProdu.indexOfComponent(this.jPanelFK_IdBodegaUbicacionProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ubicacionproduConstantesFunciones.activarFK_IdBodegaUbicacionProdu);
				this.jTabbedPaneBusquedasUbicacionProdu.setEnabledAt(index,this.ubicacionproduConstantesFunciones.activarFK_IdBodegaUbicacionProdu);
			}

			index= this.jTabbedPaneBusquedasUbicacionProdu.indexOfComponent(this.jPanelFK_IdUbicacionBodeUbicacionProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ubicacionproduConstantesFunciones.activarFK_IdUbicacionBodeUbicacionProdu);
				this.jTabbedPaneBusquedasUbicacionProdu.setEnabledAt(index,this.ubicacionproduConstantesFunciones.activarFK_IdUbicacionBodeUbicacionProdu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUbicacionProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasUbicacionProdu.indexOfComponent(this.jPanelFK_IdBodegaUbicacionProdu);

			this.jTabbedPaneBusquedasUbicacionProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionProdu.getComponent(index);

			this.ubicacionproduConstantesFunciones.setResaltarFK_IdBodegaUbicacionProdu(resaltar);

			jPanel.setBorder(this.ubicacionproduConstantesFunciones.resaltarFK_IdBodegaUbicacionProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUbicacionBode")) {
			index= this.jTabbedPaneBusquedasUbicacionProdu.indexOfComponent(this.jPanelFK_IdUbicacionBodeUbicacionProdu);

			this.jTabbedPaneBusquedasUbicacionProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionProdu.getComponent(index);

			this.ubicacionproduConstantesFunciones.setResaltarFK_IdUbicacionBodeUbicacionProdu(resaltar);

			jPanel.setBorder(this.ubicacionproduConstantesFunciones.resaltarFK_IdUbicacionBodeUbicacionProdu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUbicacionProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUbicacionProdu() throws Exception {

		if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUbicacionProdu();
		this.updateVisibilidadResaltarControlesFormularioUbicacionProdu();
		this.updateHabilitarResaltarControlesFormularioUbicacionProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioUbicacionProdu() throws Exception {
		if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ubicacionproduConstantesFunciones.resaltaridUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu!=null) {this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.setBorder(this.ubicacionproduConstantesFunciones.resaltaridUbicacionProdu);}
		if(this.ubicacionproduConstantesFunciones.resaltarid_empresaUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu!=null) {this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setBorder(this.ubicacionproduConstantesFunciones.resaltarid_empresaUbicacionProdu);}
		if(this.ubicacionproduConstantesFunciones.resaltarid_sucursalUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu!=null) {this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setBorder(this.ubicacionproduConstantesFunciones.resaltarid_sucursalUbicacionProdu);}
		if(this.ubicacionproduConstantesFunciones.resaltarid_bodegaUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu!=null) {this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setBorder(this.ubicacionproduConstantesFunciones.resaltarid_bodegaUbicacionProdu);}
		if(this.ubicacionproduConstantesFunciones.resaltarid_productoUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu!=null) {this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setBorder(this.ubicacionproduConstantesFunciones.resaltarid_productoUbicacionProdu);}
		if(this.ubicacionproduConstantesFunciones.resaltarid_ubicacion_bodeUbicacionProdu!=null && this.jInternalFrameDetalleFormUbicacionProdu!=null) {this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setBorder(this.ubicacionproduConstantesFunciones.resaltarid_ubicacion_bodeUbicacionProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUbicacionProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
	
		//this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostraridUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jPanelidUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostraridUbicacionProdu);
		//this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_empresaUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jPanelid_empresaUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_empresaUbicacionProdu);
		//this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_sucursalUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jPanelid_sucursalUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_sucursalUbicacionProdu);
		//this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_bodegaUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jPanelid_bodegaUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_bodegaUbicacionProdu);
		//this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_productoUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jPanelid_productoUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_productoUbicacionProdu);
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_productoUbicacionProdu);
		//this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_ubicacion_bodeUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jPanelid_ubicacion_bodeUbicacionProdu.setVisible(this.ubicacionproduConstantesFunciones.mostrarid_ubicacion_bodeUbicacionProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUbicacionProdu() throws Exception {
		if(this.jInternalFrameDetalleFormUbicacionProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUbicacionProdu!=null) {
	
		this.jInternalFrameDetalleFormUbicacionProdu.jLabelidUbicacionProdu.setEnabled(this.ubicacionproduConstantesFunciones.activaridUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_empresaUbicacionProdu.setEnabled(this.ubicacionproduConstantesFunciones.activarid_empresaUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_sucursalUbicacionProdu.setEnabled(this.ubicacionproduConstantesFunciones.activarid_sucursalUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_bodegaUbicacionProdu.setEnabled(this.ubicacionproduConstantesFunciones.activarid_bodegaUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_productoUbicacionProdu.setEnabled(this.ubicacionproduConstantesFunciones.activarid_productoUbicacionProdu);
			this.jInternalFrameDetalleFormUbicacionProdu.jButtonid_productoUbicacionProdu.setEnabled(this.ubicacionproduConstantesFunciones.activarid_productoUbicacionProdu);
		this.jInternalFrameDetalleFormUbicacionProdu.jComboBoxid_ubicacion_bodeUbicacionProdu.setEnabled(this.ubicacionproduConstantesFunciones.activarid_ubicacion_bodeUbicacionProdu);
		}
	}
	
		
}