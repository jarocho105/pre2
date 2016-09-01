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

import com.bydan.erp.facturacion.util.CentroCostoGrupoProductoConstantesFunciones;
import com.bydan.erp.facturacion.util.CentroCostoGrupoProductoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.CentroCostoGrupoProductoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.CentroCostoGrupoProductoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CentroCostoGrupoProductoBeanSwingJInternalFrame extends CentroCostoGrupoProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CentroCostoGrupoProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CentroCostoGrupoProducto> centrocostogrupoproductoValidator = new ClassValidator<CentroCostoGrupoProducto>(CentroCostoGrupoProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CentroCostoGrupoProducto centrocostogrupoproducto;	
	public CentroCostoGrupoProducto centrocostogrupoproductoAux;
	public CentroCostoGrupoProducto centrocostogrupoproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CentroCostoGrupoProducto centrocostogrupoproductoTotales;
	public Long idCentroCostoGrupoProductoActual;
	public Long iIdNuevoCentroCostoGrupoProducto=0L;
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

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
	}

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCentroCostoActual=0L;

	public Long getidCentroCostoActual() {
		return idCentroCostoActual;
	}

	public void setidCentroCostoActual(Long idCentroCostoActual) {
		this.idCentroCostoActual= idCentroCostoActual;
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
	
	public Boolean isPermisoTodoCentroCostoGrupoProducto;
	public Boolean isPermisoNuevoCentroCostoGrupoProducto;
	public Boolean isPermisoActualizarCentroCostoGrupoProducto;
	public Boolean isPermisoActualizarOriginalCentroCostoGrupoProducto;
	public Boolean isPermisoEliminarCentroCostoGrupoProducto;
	public Boolean isPermisoGuardarCambiosCentroCostoGrupoProducto;
	public Boolean isPermisoConsultaCentroCostoGrupoProducto;
	public Boolean isPermisoBusquedaCentroCostoGrupoProducto;
	public Boolean isPermisoReporteCentroCostoGrupoProducto;
	public Boolean isPermisoPaginacionMedioCentroCostoGrupoProducto;
	public Boolean isPermisoPaginacionAltoCentroCostoGrupoProducto;
	public Boolean isPermisoPaginacionTodoCentroCostoGrupoProducto;
	public Boolean isPermisoCopiarCentroCostoGrupoProducto;
	public Boolean isPermisoVerFormCentroCostoGrupoProducto;
	public Boolean isPermisoDuplicarCentroCostoGrupoProducto;
	public Boolean isPermisoOrdenCentroCostoGrupoProducto;
	
	
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
	
	public CentroCostoGrupoProductoParameterReturnGeneral centrocostogrupoproductoReturnGeneral;
	public CentroCostoGrupoProductoParameterReturnGeneral centrocostogrupoproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCentroCostoGrupoProducto=false;
	public Boolean esParaAccionDesdeFormularioCentroCostoGrupoProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CentroCostoGrupoProductoSessionBeanAdditional centrocostogrupoproductoSessionBeanAdditional=null;
	
	public CentroCostoGrupoProductoSessionBeanAdditional getCentroCostoGrupoProductoSessionBeanAdditional() {
		return this.centrocostogrupoproductoSessionBeanAdditional;
	}
	
	public void setCentroCostoGrupoProductoSessionBeanAdditional(CentroCostoGrupoProductoSessionBeanAdditional centrocostogrupoproductoSessionBeanAdditional) {
		try {
			this.centrocostogrupoproductoSessionBeanAdditional=centrocostogrupoproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional centrocostogrupoproductoBeanSwingJInternalFrameAdditional=null;
	//public class CentroCostoGrupoProductoBeanSwingJInternalFrame
	
	public CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional getCentroCostoGrupoProductoBeanSwingJInternalFrameAdditional() {
		return this.centrocostogrupoproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCentroCostoGrupoProductoBeanSwingJInternalFrameAdditional(CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional centrocostogrupoproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.centrocostogrupoproductoBeanSwingJInternalFrameAdditional=centrocostogrupoproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CentroCostoGrupoProductoLogic centrocostogrupoproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CentroCostoGrupoProducto centrocostogrupoproductoBean;
	public CentroCostoGrupoProductoConstantesFunciones centrocostogrupoproductoConstantesFunciones;
	//public CentroCostoGrupoProductoParameterReturnGeneral centrocostogrupoproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public CentroCostoLogic centrocostoLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	
	//PARAMETROS
	
	
	//public List<CentroCostoGrupoProducto> centrocostogrupoproductos;	
	//public List<CentroCostoGrupoProducto> centrocostogrupoproductosEliminados;
	//public List<CentroCostoGrupoProducto> centrocostogrupoproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCentroCostoGrupoProducto=false;
	public Boolean isVisibilidadCeldaDuplicarCentroCostoGrupoProducto=true;
	public Boolean isVisibilidadCeldaCopiarCentroCostoGrupoProducto=true;
	public Boolean isVisibilidadCeldaVerFormCentroCostoGrupoProducto=true;
	public Boolean isVisibilidadCeldaOrdenCentroCostoGrupoProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
	public Boolean isVisibilidadCeldaModificarCentroCostoGrupoProducto=false;
	public Boolean isVisibilidadCeldaActualizarCentroCostoGrupoProducto=false;
	public Boolean isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
	public Boolean isVisibilidadCeldaCancelarCentroCostoGrupoProducto=false;
	public Boolean isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdCentroCostoPorIdLinea=false;
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCentroCostoGrupoProducto() {
		return this.iIdNuevoCentroCostoGrupoProducto;
	}

	public void setiIdNuevoCentroCostoGrupoProducto(Long iIdNuevoCentroCostoGrupoProducto) {
		this.iIdNuevoCentroCostoGrupoProducto = iIdNuevoCentroCostoGrupoProducto;
	}
	
	public Long getidCentroCostoGrupoProductoActual() {
		return this.idCentroCostoGrupoProductoActual;
	}

	public void setidCentroCostoGrupoProductoActual(Long idCentroCostoGrupoProductoActual) {
		this.idCentroCostoGrupoProductoActual = idCentroCostoGrupoProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CentroCostoGrupoProducto getcentrocostogrupoproducto() {
		return this.centrocostogrupoproducto;
	}

	public void setcentrocostogrupoproducto(CentroCostoGrupoProducto centrocostogrupoproducto) {
		this.centrocostogrupoproducto = centrocostogrupoproducto;
	}
	
	public CentroCostoGrupoProducto getcentrocostogrupoproductoAux() {
		return this.centrocostogrupoproductoAux;
	}

	public void setcentrocostogrupoproductoAux(CentroCostoGrupoProducto centrocostogrupoproductoAux) {
		this.centrocostogrupoproductoAux = centrocostogrupoproductoAux;
	}				
	
	public CentroCostoGrupoProducto getcentrocostogrupoproductoAnterior() {
		return this.centrocostogrupoproductoAnterior;
	}

	public void setcentrocostogrupoproductoAnterior(CentroCostoGrupoProducto centrocostogrupoproductoAnterior) {
		this.centrocostogrupoproductoAnterior = centrocostogrupoproductoAnterior;
	}	
	
	public CentroCostoGrupoProducto getcentrocostogrupoproductoTotales() {
		return this.centrocostogrupoproductoTotales;
	}

	public void setcentrocostogrupoproductoTotales(CentroCostoGrupoProducto centrocostogrupoproductoTotales) {
		this.centrocostogrupoproductoTotales = centrocostogrupoproductoTotales;
	}	
	
	public CentroCostoGrupoProducto getcentrocostogrupoproductoBean() {
		return this.centrocostogrupoproductoBean;
	}

	public void setcentrocostogrupoproductoBean(CentroCostoGrupoProducto centrocostogrupoproductoBean) {
		this.centrocostogrupoproductoBean = centrocostogrupoproductoBean;
	}	
	
	public CentroCostoGrupoProductoParameterReturnGeneral getcentrocostogrupoproductoReturnGeneral() {
		return this.centrocostogrupoproductoReturnGeneral;
	}

	public void setcentrocostogrupoproductoReturnGeneral(CentroCostoGrupoProductoParameterReturnGeneral centrocostogrupoproductoReturnGeneral) {
		this.centrocostogrupoproductoReturnGeneral = centrocostogrupoproductoReturnGeneral;
	}	
	
	
	public Long id_centro_costoBusquedaPorIdCentroCostoPorIdLinea=null;

	public Long getid_centro_costoBusquedaPorIdCentroCostoPorIdLinea() {
		return this.id_centro_costoBusquedaPorIdCentroCostoPorIdLinea;
	}

	public void setid_centro_costoBusquedaPorIdCentroCostoPorIdLinea(Long id_centro_costoBusquedaPorIdCentroCostoPorIdLinea) {
		this.id_centro_costoBusquedaPorIdCentroCostoPorIdLinea = id_centro_costoBusquedaPorIdCentroCostoPorIdLinea;
	}

;
	public Long id_lineaBusquedaPorIdCentroCostoPorIdLinea=-1L;

	public Long getid_lineaBusquedaPorIdCentroCostoPorIdLinea() {
		return this.id_lineaBusquedaPorIdCentroCostoPorIdLinea;
	}

	public void setid_lineaBusquedaPorIdCentroCostoPorIdLinea(Long id_lineaBusquedaPorIdCentroCostoPorIdLinea) {
		this.id_lineaBusquedaPorIdCentroCostoPorIdLinea = id_lineaBusquedaPorIdCentroCostoPorIdLinea;
	}

	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
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
	
	
	public CentroCostoGrupoProductoLogic getCentroCostoGrupoProductoLogic()	{		
		return centrocostogrupoproductoLogic;
	}

	public void setCentroCostoGrupoProductoLogic(CentroCostoGrupoProductoLogic centrocostogrupoproductoLogic) {
		this.centrocostogrupoproductoLogic = centrocostogrupoproductoLogic;
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
	
	public Boolean getIsEsNuevoCentroCostoGrupoProducto() {
		return isEsNuevoCentroCostoGrupoProducto;
	}

	public void setIsEsNuevoCentroCostoGrupoProducto(Boolean isEsNuevoCentroCostoGrupoProducto) {
		this.isEsNuevoCentroCostoGrupoProducto = isEsNuevoCentroCostoGrupoProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioCentroCostoGrupoProducto() {
		return esParaAccionDesdeFormularioCentroCostoGrupoProducto;
	}
	
	public void setEsParaAccionDesdeFormularioCentroCostoGrupoProducto(Boolean esParaAccionDesdeFormularioCentroCostoGrupoProducto) {
		this.esParaAccionDesdeFormularioCentroCostoGrupoProducto = esParaAccionDesdeFormularioCentroCostoGrupoProducto;
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

			if(this.centrocostogrupoproductoSessionBean==null) {
				this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			}

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(centrocostogrupoproductoSessionBean.getlidEmpresaActual());
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

			if(this.centrocostogrupoproductoSessionBean==null) {
				this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			}

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(centrocostogrupoproductoSessionBean.getlidSucursalActual());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostogrupoproductoSessionBean==null) {
				this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			}

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(centrocostogrupoproductoSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostogrupoproductoSessionBean==null) {
				this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			}

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(centrocostogrupoproductoSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostogrupoproductoSessionBean==null) {
				this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			}

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(centrocostogrupoproductoSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

					if(this.centrocostogrupoproducto!=null) {
						this.centrocostogrupoproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCentroCostoGrupoProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCentroCostoGrupoProductoGenerico)throws Exception
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
				jComboBoxid_empresaCentroCostoGrupoProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCentroCostoGrupoProductoGenerico!=null && jComboBoxid_empresaCentroCostoGrupoProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCentroCostoGrupoProductoGenerico.setSelectedIndex(0);
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

					if(this.centrocostogrupoproducto!=null) {
						this.centrocostogrupoproducto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCentroCostoGrupoProducto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCentroCostoGrupoProductoGenerico)throws Exception
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
				jComboBoxid_sucursalCentroCostoGrupoProductoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCentroCostoGrupoProductoGenerico!=null && jComboBoxid_sucursalCentroCostoGrupoProductoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCentroCostoGrupoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.centrocostogrupoproducto!=null) {
						this.centrocostogrupoproducto.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoCentroCostoGrupoProducto.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdCentroCostoPorIdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto!=null) {
						jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto!=null) {
							//jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.getItemCount()>0) {
								jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoCentroCostoGrupoProductoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoCentroCostoGrupoProductoGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoCentroCostoGrupoProductoGenerico!=null && jComboBoxid_centro_costoCentroCostoGrupoProductoGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoCentroCostoGrupoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.centrocostogrupoproducto!=null) {
						this.centrocostogrupoproducto.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaCentroCostoGrupoProducto.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdCentroCostoPorIdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto!=null) {
						jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto!=null) {
							//jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.getItemCount()>0) {
								jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto!=null) {
						jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto!=null) {
							//jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.getItemCount()>0) {
								jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaCentroCostoGrupoProductoGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaCentroCostoGrupoProductoGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaCentroCostoGrupoProductoGenerico!=null && jComboBoxid_lineaCentroCostoGrupoProductoGenerico.getItemCount()>0) {
					jComboBoxid_lineaCentroCostoGrupoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.centrocostogrupoproducto!=null) {
						this.centrocostogrupoproducto.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoCentroCostoGrupoProducto.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoCentroCostoGrupoProductoGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoCentroCostoGrupoProductoGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoCentroCostoGrupoProductoGenerico!=null && jComboBoxid_linea_grupoCentroCostoGrupoProductoGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoCentroCostoGrupoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CentroCostoGrupoProducto centrocostogrupoproducto,JComboBox jComboBoxid_empresaCentroCostoGrupoProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCentroCostoGrupoProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCentroCostoGrupoProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				centrocostogrupoproducto.setid_empresa(empresaAux.getId());
				centrocostogrupoproducto.setempresa_descripcion(CentroCostoGrupoProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				centrocostogrupoproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CentroCostoGrupoProducto centrocostogrupoproducto,JComboBox jComboBoxid_sucursalCentroCostoGrupoProductoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCentroCostoGrupoProductoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCentroCostoGrupoProductoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				centrocostogrupoproducto.setid_sucursal(sucursalAux.getId());
				centrocostogrupoproducto.setsucursal_descripcion(CentroCostoGrupoProductoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				centrocostogrupoproducto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(CentroCostoGrupoProducto centrocostogrupoproducto,JComboBox jComboBoxid_centro_costoCentroCostoGrupoProductoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoCentroCostoGrupoProductoGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoCentroCostoGrupoProductoGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				centrocostogrupoproducto.setid_centro_costo(centrocostoAux.getId());
				centrocostogrupoproducto.setcentrocosto_descripcion(CentroCostoGrupoProductoConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				centrocostogrupoproducto.setCentroCosto(centrocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(CentroCostoGrupoProducto centrocostogrupoproducto,JComboBox jComboBoxid_lineaCentroCostoGrupoProductoGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaCentroCostoGrupoProductoGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaCentroCostoGrupoProductoGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				centrocostogrupoproducto.setid_linea(lineaAux.getId());
				centrocostogrupoproducto.setlinea_descripcion(CentroCostoGrupoProductoConstantesFunciones.getLineaDescripcion(lineaAux));
				centrocostogrupoproducto.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(CentroCostoGrupoProducto centrocostogrupoproducto,JComboBox jComboBoxid_linea_grupoCentroCostoGrupoProductoGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoCentroCostoGrupoProductoGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoCentroCostoGrupoProductoGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				centrocostogrupoproducto.setid_linea_grupo(lineaAux.getId());
				centrocostogrupoproducto.setlineagrupo_descripcion(CentroCostoGrupoProductoConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				centrocostogrupoproducto.setLineaGrupo(lineaAux);			}
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

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
					}

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
					}

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
					}

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdCentroCostoPorIdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.addItem(centrocosto);
							}
						}

						if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.addItem(centrocosto);
							}
						}

						if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
					}

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdCentroCostoPorIdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.addItem(linea);
							}
						}

						if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.addItem(linea);
							}
						}

						if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { 
					}

					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCentroCostoGrupoProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CentroCostoGrupoProductoConstantesFunciones.refrescarForeignKeysDescripcionesCentroCostoGrupoProducto(this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CentroCostoGrupoProductoConstantesFunciones.refrescarForeignKeysDescripcionesCentroCostoGrupoProducto(this.centrocostogrupoproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(CentroCosto.class));
		classes.add(new Classe(Linea.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(this.centrocostogrupoproductos);
			centrocostogrupoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CentroCostoGrupoProductoParameterReturnGeneral getCentroCostoGrupoProductoParameterGeneral() {
		return this.centrocostogrupoproductoParameterGeneral;
	}
	
	public void setCentroCostoGrupoProductoParameterGeneral(CentroCostoGrupoProductoParameterReturnGeneral centrocostogrupoproductoParameterGeneral) {
		this.centrocostogrupoproductoParameterGeneral = centrocostogrupoproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCentroCostoGrupoProducto() {
		return isPermisoTodoCentroCostoGrupoProducto;
	}

	public void setIsPermisoTodoCentroCostoGrupoProducto(Boolean isPermisoTodoCentroCostoGrupoProducto) {
		this.isPermisoTodoCentroCostoGrupoProducto = isPermisoTodoCentroCostoGrupoProducto;
	}

	public Boolean getIsPermisoNuevoCentroCostoGrupoProducto() {
		return isPermisoNuevoCentroCostoGrupoProducto;
	}

	public void setIsPermisoNuevoCentroCostoGrupoProducto(Boolean isPermisoNuevoCentroCostoGrupoProducto) {
		this.isPermisoNuevoCentroCostoGrupoProducto = isPermisoNuevoCentroCostoGrupoProducto;
	}

	public Boolean getIsPermisoActualizarCentroCostoGrupoProducto() {
		return isPermisoActualizarCentroCostoGrupoProducto;
	}

	public void setIsPermisoActualizarCentroCostoGrupoProducto(Boolean isPermisoActualizarCentroCostoGrupoProducto) {
		this.isPermisoActualizarCentroCostoGrupoProducto = isPermisoActualizarCentroCostoGrupoProducto;
	}

	public Boolean getIsPermisoEliminarCentroCostoGrupoProducto() {
		return isPermisoEliminarCentroCostoGrupoProducto;
	}

	public void setIsPermisoEliminarCentroCostoGrupoProducto(Boolean isPermisoEliminarCentroCostoGrupoProducto) {
		this.isPermisoEliminarCentroCostoGrupoProducto = isPermisoEliminarCentroCostoGrupoProducto;
	}

	public Boolean getIsPermisoGuardarCambiosCentroCostoGrupoProducto() {
		return isPermisoGuardarCambiosCentroCostoGrupoProducto;
	}

	public void setIsPermisoGuardarCambiosCentroCostoGrupoProducto(Boolean isPermisoGuardarCambiosCentroCostoGrupoProducto) {
		this.isPermisoGuardarCambiosCentroCostoGrupoProducto = isPermisoGuardarCambiosCentroCostoGrupoProducto;
	}
	
	public Boolean getIsPermisoConsultaCentroCostoGrupoProducto() {
		return isPermisoConsultaCentroCostoGrupoProducto;
	}

	public void setIsPermisoConsultaCentroCostoGrupoProducto(Boolean isPermisoConsultaCentroCostoGrupoProducto) {
		this.isPermisoConsultaCentroCostoGrupoProducto = isPermisoConsultaCentroCostoGrupoProducto;
	}

	public Boolean getIsPermisoBusquedaCentroCostoGrupoProducto() {
		return isPermisoBusquedaCentroCostoGrupoProducto;
	}

	public void setIsPermisoBusquedaCentroCostoGrupoProducto(Boolean isPermisoBusquedaCentroCostoGrupoProducto) {
		this.isPermisoBusquedaCentroCostoGrupoProducto = isPermisoBusquedaCentroCostoGrupoProducto;
	}

	public Boolean getIsPermisoReporteCentroCostoGrupoProducto() {
		return isPermisoReporteCentroCostoGrupoProducto;
	}

	public void setIsPermisoReporteCentroCostoGrupoProducto(Boolean isPermisoReporteCentroCostoGrupoProducto) {
		this.isPermisoReporteCentroCostoGrupoProducto = isPermisoReporteCentroCostoGrupoProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioCentroCostoGrupoProducto() {
		return isPermisoPaginacionMedioCentroCostoGrupoProducto;
	}

	public void setIsPermisoPaginacionMedioCentroCostoGrupoProducto(Boolean isPermisoPaginacionMedioCentroCostoGrupoProducto) {
		this.isPermisoPaginacionMedioCentroCostoGrupoProducto = isPermisoPaginacionMedioCentroCostoGrupoProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoCentroCostoGrupoProducto() {
		return isPermisoPaginacionTodoCentroCostoGrupoProducto;
	}

	public void setIsPermisoPaginacionTodoCentroCostoGrupoProducto(Boolean isPermisoPaginacionTodoCentroCostoGrupoProducto) {
		this.isPermisoPaginacionTodoCentroCostoGrupoProducto = isPermisoPaginacionTodoCentroCostoGrupoProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoCentroCostoGrupoProducto() {
		return isPermisoPaginacionAltoCentroCostoGrupoProducto;
	}

	public void setIsPermisoPaginacionAltoCentroCostoGrupoProducto(Boolean isPermisoPaginacionAltoCentroCostoGrupoProducto) {
		this.isPermisoPaginacionAltoCentroCostoGrupoProducto = isPermisoPaginacionAltoCentroCostoGrupoProducto;
	}
	
	public Boolean getIsPermisoCopiarCentroCostoGrupoProducto() {
		return isPermisoCopiarCentroCostoGrupoProducto;
	}

	public void setIsPermisoCopiarCentroCostoGrupoProducto(Boolean isPermisoCopiarCentroCostoGrupoProducto) {
		this.isPermisoCopiarCentroCostoGrupoProducto = isPermisoCopiarCentroCostoGrupoProducto;
	}
	
	public Boolean getIsPermisoVerFormCentroCostoGrupoProducto() {
		return isPermisoVerFormCentroCostoGrupoProducto;
	}

	public void setIsPermisoVerFormCentroCostoGrupoProducto(Boolean isPermisoVerFormCentroCostoGrupoProducto) {
		this.isPermisoVerFormCentroCostoGrupoProducto = isPermisoVerFormCentroCostoGrupoProducto;
	}
	
	public Boolean getIsPermisoDuplicarCentroCostoGrupoProducto() {
		return isPermisoDuplicarCentroCostoGrupoProducto;
	}

	public void setIsPermisoDuplicarCentroCostoGrupoProducto(Boolean isPermisoDuplicarCentroCostoGrupoProducto) {
		this.isPermisoDuplicarCentroCostoGrupoProducto = isPermisoDuplicarCentroCostoGrupoProducto;
	}
	
	public Boolean getIsPermisoOrdenCentroCostoGrupoProducto() {
		return isPermisoOrdenCentroCostoGrupoProducto;
	}

	public void setIsPermisoOrdenCentroCostoGrupoProducto(Boolean isPermisoOrdenCentroCostoGrupoProducto) {
		this.isPermisoOrdenCentroCostoGrupoProducto = isPermisoOrdenCentroCostoGrupoProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCentroCostoGrupoProducto() {
		return isVisibilidadCeldaNuevoCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaNuevoCentroCostoGrupoProducto(Boolean isVisibilidadCeldaNuevoCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto = isVisibilidadCeldaNuevoCentroCostoGrupoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCentroCostoGrupoProducto() {
		return isVisibilidadCeldaDuplicarCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaDuplicarCentroCostoGrupoProducto(Boolean isVisibilidadCeldaDuplicarCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaDuplicarCentroCostoGrupoProducto = isVisibilidadCeldaDuplicarCentroCostoGrupoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCentroCostoGrupoProducto() {
		return isVisibilidadCeldaCopiarCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaCopiarCentroCostoGrupoProducto(Boolean isVisibilidadCeldaCopiarCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaCopiarCentroCostoGrupoProducto = isVisibilidadCeldaCopiarCentroCostoGrupoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCentroCostoGrupoProducto() {
		return isVisibilidadCeldaVerFormCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaVerFormCentroCostoGrupoProducto(Boolean isVisibilidadCeldaVerFormCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaVerFormCentroCostoGrupoProducto = isVisibilidadCeldaVerFormCentroCostoGrupoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCentroCostoGrupoProducto() {
		return isVisibilidadCeldaOrdenCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaOrdenCentroCostoGrupoProducto(Boolean isVisibilidadCeldaOrdenCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto = isVisibilidadCeldaOrdenCentroCostoGrupoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto() {
		return isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto(Boolean isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto = isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCentroCostoGrupoProducto() {
		return isVisibilidadCeldaModificarCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaModificarCentroCostoGrupoProducto(Boolean isVisibilidadCeldaModificarCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaModificarCentroCostoGrupoProducto = isVisibilidadCeldaModificarCentroCostoGrupoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCentroCostoGrupoProducto() {
		return isVisibilidadCeldaActualizarCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaActualizarCentroCostoGrupoProducto(Boolean isVisibilidadCeldaActualizarCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto = isVisibilidadCeldaActualizarCentroCostoGrupoProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarCentroCostoGrupoProducto() {
		return isVisibilidadCeldaEliminarCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaEliminarCentroCostoGrupoProducto(Boolean isVisibilidadCeldaEliminarCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto = isVisibilidadCeldaEliminarCentroCostoGrupoProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarCentroCostoGrupoProducto() {
		return isVisibilidadCeldaCancelarCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaCancelarCentroCostoGrupoProducto(Boolean isVisibilidadCeldaCancelarCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto = isVisibilidadCeldaCancelarCentroCostoGrupoProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarCentroCostoGrupoProducto() {
		return isVisibilidadCeldaGuardarCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaGuardarCentroCostoGrupoProducto(Boolean isVisibilidadCeldaGuardarCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto = isVisibilidadCeldaGuardarCentroCostoGrupoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto() {
		return isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto(Boolean isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto) {
		this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto = isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto;
	}
		
	public CentroCostoGrupoProductoSessionBean getcentrocostogrupoproductoSessionBean() {
		return this.centrocostogrupoproductoSessionBean;
	}
	
	public void setcentrocostogrupoproductoSessionBean(CentroCostoGrupoProductoSessionBean centrocostogrupoproductoSessionBean) {
		this.centrocostogrupoproductoSessionBean=centrocostogrupoproductoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdCentroCostoPorIdLinea() {
		return this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea;
	}

	public void setisVisibilidadBusquedaPorIdCentroCostoPorIdLinea(Boolean isVisibilidadBusquedaPorIdCentroCostoPorIdLinea) {
		this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea=isVisibilidadBusquedaPorIdCentroCostoPorIdLinea;
	}

	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(centrocostogrupoproducto,null);
				this.setActualParaGuardarSucursalForeignKey(centrocostogrupoproducto,null);
				this.setActualParaGuardarCentroCostoForeignKey(centrocostogrupoproducto,null);
				this.setActualParaGuardarLineaForeignKey(centrocostogrupoproducto,null);
				this.setActualParaGuardarLineaGrupoForeignKey(centrocostogrupoproducto,null);
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
	
	public void bugActualizarReferenciaActual(CentroCostoGrupoProducto centrocostogrupoproducto,CentroCostoGrupoProducto centrocostogrupoproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCentroCostoGrupoProducto(centrocostogrupoproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		centrocostogrupoproductoAux.setId(centrocostogrupoproducto.getId());
		centrocostogrupoproductoAux.setVersionRow(centrocostogrupoproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCentroCostoGrupoProducto();
		
			int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = centrocostogrupoproductoValidator.getInvalidValues(this.centrocostogrupoproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			centrocostogrupoproductoLogic.setDatosCliente(datosCliente);
			centrocostogrupoproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				centrocostogrupoproductoAux=new  CentroCostoGrupoProducto();
				
				centrocostogrupoproductoAux.setIsNew(true);
				centrocostogrupoproductoAux.setIsChanged(true);
				
				centrocostogrupoproductoAux.setCentroCostoGrupoProductoOriginal(this.centrocostogrupoproducto);
				
				centrocostogrupoproductoAux.setId(this.centrocostogrupoproducto.getId());	
				centrocostogrupoproductoAux.setVersionRow(this.centrocostogrupoproducto.getVersionRow());	
				centrocostogrupoproductoAux.setid_empresa(this.centrocostogrupoproducto.getid_empresa());	
				centrocostogrupoproductoAux.setid_sucursal(this.centrocostogrupoproducto.getid_sucursal());	
				centrocostogrupoproductoAux.setid_centro_costo(this.centrocostogrupoproducto.getid_centro_costo());	
				centrocostogrupoproductoAux.setid_linea(this.centrocostogrupoproducto.getid_linea());	
				centrocostogrupoproductoAux.setid_linea_grupo(this.centrocostogrupoproducto.getid_linea_grupo());	
				centrocostogrupoproductoAux.setdescripcion(this.centrocostogrupoproducto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoLogic.saveCentroCostoGrupoProductos();//WithConnection
						//centrocostogrupoproductoLogic.getSetVersionRowCentroCostoGrupoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centrocostogrupoproducto,centrocostogrupoproductoAux);
					
					this.refrescarForeignKeysDescripcionesCentroCostoGrupoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostogrupoproductoLogic.saveCentroCostoGrupoProductoRelaciones(centrocostogrupoproductoAux);//WithConnection
								//centrocostogrupoproductoLogic.getSetVersionRowCentroCostoGrupoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.centrocostogrupoproducto,centrocostogrupoproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.centrocostogrupoproducto,centrocostogrupoproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				centrocostogrupoproductoAux=new  CentroCostoGrupoProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() && this.centrocostogrupoproducto.getId()>=0)) {
						
					centrocostogrupoproductoAux.setIsNew(false);
				}
				
				centrocostogrupoproductoAux.setIsDeleted(false);
			
				centrocostogrupoproductoAux.setId(this.centrocostogrupoproducto.getId());	
				centrocostogrupoproductoAux.setVersionRow(this.centrocostogrupoproducto.getVersionRow());	
				centrocostogrupoproductoAux.setid_empresa(this.centrocostogrupoproducto.getid_empresa());	
				centrocostogrupoproductoAux.setid_sucursal(this.centrocostogrupoproducto.getid_sucursal());	
				centrocostogrupoproductoAux.setid_centro_costo(this.centrocostogrupoproducto.getid_centro_costo());	
				centrocostogrupoproductoAux.setid_linea(this.centrocostogrupoproducto.getid_linea());	
				centrocostogrupoproductoAux.setid_linea_grupo(this.centrocostogrupoproducto.getid_linea_grupo());	
				centrocostogrupoproductoAux.setdescripcion(this.centrocostogrupoproducto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoLogic.saveCentroCostoGrupoProductos();//WithConnection
						//centrocostogrupoproductoLogic.getSetVersionRowCentroCostoGrupoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centrocostogrupoproducto,centrocostogrupoproductoAux);
					
					this.refrescarForeignKeysDescripcionesCentroCostoGrupoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostogrupoproductoLogic.saveCentroCostoGrupoProductoRelaciones(centrocostogrupoproductoAux);//WithConnection
								//centrocostogrupoproductoLogic.getSetVersionRowCentroCostoGrupoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.centrocostogrupoproducto,centrocostogrupoproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.centrocostogrupoproducto,centrocostogrupoproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				centrocostogrupoproductoAux=new  CentroCostoGrupoProducto();
				
				centrocostogrupoproductoAux.setIsNew(false);
				centrocostogrupoproductoAux.setIsChanged(false);
				
				centrocostogrupoproductoAux.setIsDeleted(true);
				
				centrocostogrupoproductoAux.setId(this.centrocostogrupoproducto.getId());	
				centrocostogrupoproductoAux.setVersionRow(this.centrocostogrupoproducto.getVersionRow());	
				centrocostogrupoproductoAux.setid_empresa(this.centrocostogrupoproducto.getid_empresa());	
				centrocostogrupoproductoAux.setid_sucursal(this.centrocostogrupoproducto.getid_sucursal());	
				centrocostogrupoproductoAux.setid_centro_costo(this.centrocostogrupoproducto.getid_centro_costo());	
				centrocostogrupoproductoAux.setid_linea(this.centrocostogrupoproducto.getid_linea());	
				centrocostogrupoproductoAux.setid_linea_grupo(this.centrocostogrupoproducto.getid_linea_grupo());	
				centrocostogrupoproductoAux.setdescripcion(this.centrocostogrupoproducto.getdescripcion());	
				
				if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.centrocostogrupoproductoAux.getId()>=0) {	
						this.centrocostogrupoproductosEliminados.add(centrocostogrupoproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoLogic.saveCentroCostoGrupoProductos();//WithConnection
						//centrocostogrupoproductoLogic.getSetVersionRowCentroCostoGrupoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostogrupoproductoLogic.saveCentroCostoGrupoProductoRelaciones(centrocostogrupoproductoAux);//WithConnection
								//centrocostogrupoproductoLogic.getSetVersionRowCentroCostoGrupoProductos();//WithConnection
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
							if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(centrocostogrupoproductoAux,centrocostogrupoproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(this.centrocostogrupoproductosEliminados);
					
					centrocostogrupoproductoLogic.saveCentroCostoGrupoProductos();//WithConnection
					//centrocostogrupoproductoLogic.getSetVersionRowCentroCostoGrupoProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCentroCostoGrupoProducto();
				
				this.centrocostogrupoproductosEliminados= new ArrayList<CentroCostoGrupoProducto>();		
			}
			
			if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Centro Costo Grupo Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.centrocostogrupoproducto=centrocostogrupoproductoAux;
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
      		//this.finishProcessCentroCostoGrupoProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(CentroCostoGrupoProducto centrocostogrupoproductoLocal) throws Exception {
		
		if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CentroCostoGrupoProducto centrocostogrupoproductoLocal) throws Exception {	
		if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				centrocostogrupoproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				centrocostogrupoproductoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				centrocostogrupoproductoLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				centrocostogrupoproductoLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				centrocostogrupoproductoLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCentroCostoGrupoProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = centrocostogrupoproductoValidator.getInvalidValues(this.centrocostogrupoproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CentroCostoGrupoProducto centrocostogrupoproducto,List<CentroCostoGrupoProducto> centrocostogrupoproductos) throws Exception {
		try	{		
			CentroCostoGrupoProductoConstantesFunciones.actualizarLista(centrocostogrupoproducto,centrocostogrupoproductos,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CentroCostoGrupoProducto centrocostogrupoproducto,List<CentroCostoGrupoProducto> centrocostogrupoproductos) throws Exception {
		try	{			
			CentroCostoGrupoProductoConstantesFunciones.actualizarSelectedLista(centrocostogrupoproducto,centrocostogrupoproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CentroCostoGrupoProducto> centrocostogrupoproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				centrocostogrupoproductosLocal=this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				centrocostogrupoproductosLocal=this.centrocostogrupoproductos;
			}
			//ARCHITECTURE
		
			for(CentroCostoGrupoProducto centrocostogrupoproductoLocal:centrocostogrupoproductosLocal) {
				if(this.permiteMantenimiento(centrocostogrupoproductoLocal) && centrocostogrupoproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CentroCostoGrupoProductoConstantesFunciones.getCentroCostoGrupoProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CentroCostoGrupoProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_empresaCentroCostoGrupoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoGrupoProductoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_sucursalCentroCostoGrupoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoGrupoProductoConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_centro_costoCentroCostoGrupoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoGrupoProductoConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_lineaCentroCostoGrupoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoGrupoProductoConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_linea_grupoCentroCostoGrupoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoGrupoProductoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabeldescripcionCentroCostoGrupoProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_empresaCentroCostoGrupoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_sucursalCentroCostoGrupoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_centro_costoCentroCostoGrupoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_lineaCentroCostoGrupoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelid_linea_grupoCentroCostoGrupoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabeldescripcionCentroCostoGrupoProducto,"");
		
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
		this.iIdNuevoCentroCostoGrupoProducto--;	
		
		
		this.centrocostogrupoproductoAux=new CentroCostoGrupoProducto();
		
		this.centrocostogrupoproductoAux.setId(this.iIdNuevoCentroCostoGrupoProducto);
		this.centrocostogrupoproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().add(this.centrocostogrupoproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.centrocostogrupoproductos.add(this.centrocostogrupoproductoAux);
		}
		//ARCHITECTURE
		
		this.centrocostogrupoproducto=this.centrocostogrupoproductoAux;
		
		if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCentroCostoGrupoProducto(this.centrocostogrupoproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoGrupoProducto(this.centrocostogrupoproducto);
		}
				
		//this.setDefaultControlesCentroCostoGrupoProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCentroCostoGrupoProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCentroCostoGrupoProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoGrupoProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproductoBean,this.centrocostogrupoproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
			classes=CentroCostoGrupoProductoConstantesFunciones.getClassesRelationshipsOfCentroCostoGrupoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.centrocostogrupoproductoReturnGeneral=centrocostogrupoproductoLogic.procesarEventosCentroCostoGrupoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this.centrocostogrupoproducto,this.centrocostogrupoproductoParameterGeneral,this.isEsNuevoCentroCostoGrupoProducto,classes);//this.centrocostogrupoproductoLogic.getCentroCostoGrupoProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral,this.centrocostogrupoproductoBean,false);
		
		if(this.centrocostogrupoproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto());
		}
		
		if(this.centrocostogrupoproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto(),classes);//this.centrocostogrupoproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCentroCostoGrupoProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCentroCostoGrupoProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.RecargarFormCentroCostoGrupoProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
						
			if(centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoGrupoProducto();
			}
			
			this.actualizarVisualTableDatosCentroCostoGrupoProducto();
			
			this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(this.getIndiceNuevoCentroCostoGrupoProducto(), this.getIndiceNuevoCentroCostoGrupoProducto());
			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
						
			this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCentroCostoGrupoProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTextAreadescripcionCentroCostoGrupoProducto.setEnabled(isHabilitar && this.centrocostogrupoproductoConstantesFunciones.activardescripcionCentroCostoGrupoProducto);	
		//
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setEnabled(isHabilitar && this.centrocostogrupoproductoConstantesFunciones.activarid_empresaCentroCostoGrupoProducto);//
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setEnabled(isHabilitar && this.centrocostogrupoproductoConstantesFunciones.activarid_sucursalCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setEnabled(isHabilitar && this.centrocostogrupoproductoConstantesFunciones.activarid_centro_costoCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setEnabled(isHabilitar && this.centrocostogrupoproductoConstantesFunciones.activarid_lineaCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setEnabled(isHabilitar && this.centrocostogrupoproductoConstantesFunciones.activarid_linea_grupoCentroCostoGrupoProducto);
	};
	
	public void setDefaultControlesCentroCostoGrupoProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCentroCostoGrupoProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.centrocostogrupoproductoSessionBean.setConGuardarRelaciones(true);			
			this.centrocostogrupoproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.setVisible(true);
			
					
		} else {
			//this.centrocostogrupoproductoSessionBean.setConGuardarRelaciones(false);			
			this.centrocostogrupoproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCentroCostoGrupoProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
				if(centrocostogrupoproductoAux.getId().equals(this.iIdNuevoCentroCostoGrupoProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductos) {
				if(centrocostogrupoproductoAux.getId().equals(this.iIdNuevoCentroCostoGrupoProducto)) {
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
	
	public int getIndiceActualCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
				if(centrocostogrupoproductoAux.getId().equals(centrocostogrupoproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductos) {
				if(centrocostogrupoproductoAux.getId().equals(centrocostogrupoproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
				if(centrocostogrupoproductoAux.getCentroCostoGrupoProductoOriginal().getId().equals(centrocostogrupoproductoOriginal.getId())) {
					existe=true;
					centrocostogrupoproductoOriginal.setId(centrocostogrupoproductoAux.getId());
					centrocostogrupoproductoOriginal.setVersionRow(centrocostogrupoproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductos) {
				if(centrocostogrupoproductoAux.getCentroCostoGrupoProductoOriginal().getId().equals(centrocostogrupoproductoOriginal.getId())) {
					existe=true;
					centrocostogrupoproductoOriginal.setId(centrocostogrupoproductoAux.getId());
					centrocostogrupoproductoOriginal.setVersionRow(centrocostogrupoproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCentroCostoGrupoProducto(Boolean esParaCancelar) throws Exception {
		centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
		centrocostogrupoproductoAux=new CentroCostoGrupoProducto();
		
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
					if(centrocostogrupoproductoAux.getId()<0) {
						centrocostogrupoproductosAux.add(centrocostogrupoproductoAux);
					}		
				}
				this.iIdNuevoCentroCostoGrupoProducto=0L;
				this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().removeAll(centrocostogrupoproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductos) {
					if(centrocostogrupoproductoAux.getId()<0) {
						centrocostogrupoproductosAux.add(centrocostogrupoproductoAux);
					}		
				}
				this.iIdNuevoCentroCostoGrupoProducto=0L;
				this.centrocostogrupoproductos.removeAll(centrocostogrupoproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCentroCostoGrupoProducto 
					&& this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()>0
					) {
					centrocostogrupoproductoAux=this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().get(this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size() - 1);
				
					if(centrocostogrupoproductoAux.getId()<0) {
						this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().remove(centrocostogrupoproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCentroCostoGrupoProducto && this.centrocostogrupoproductos.size()>0) {
					centrocostogrupoproductoAux=this.centrocostogrupoproductos.get(this.centrocostogrupoproductos.size() - 1);
				
					if(centrocostogrupoproductoAux.getId()<0) {
						this.centrocostogrupoproductos.remove(centrocostogrupoproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCentroCostoGrupoProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(centrocostogrupoproducto.getId()<0) {
				this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().remove(this.centrocostogrupoproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(centrocostogrupoproducto.getId()<0) {
				this.centrocostogrupoproductos.remove(this.centrocostogrupoproducto);
			}
		}			
	}
	
	public void setEstadosInicialesCentroCostoGrupoProducto(List<CentroCostoGrupoProducto> centrocostogrupoproductosAux) throws Exception {
		CentroCostoGrupoProductoConstantesFunciones.setEstadosInicialesCentroCostoGrupoProducto(centrocostogrupoproductosAux);
	}
	
	public void setEstadosInicialesCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproductoAux) throws Exception {
		CentroCostoGrupoProductoConstantesFunciones.setEstadosInicialesCentroCostoGrupoProducto(centrocostogrupoproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCentroCostoGrupoProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCentroCostoGrupoProductoActual()) {
				if(!this.isEsNuevoCentroCostoGrupoProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCentroCostoGrupoProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCentroCostoGrupoProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Centro Costo Grupo Producto ?", "MANTENIMIENTO DE Centro Costo Grupo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CentroCostoGrupoProducto centrocostogrupoproducto) throws Exception {
		CentroCostoGrupoProductoConstantesFunciones.seleccionarAsignar(this.centrocostogrupoproducto,centrocostogrupoproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCentroCostoGrupoProducto=this.isPermisoActualizarOriginalCentroCostoGrupoProducto;
			
			
			this.seleccionarAsignar(centrocostogrupoproducto);
			
			

			idCentroCostoActual=centrocostogrupoproducto.getid_centro_costo();
			this.seleccionarCentroCostoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroCostoGrupoProductoConstantesFunciones.quitarEspaciosCentroCostoGrupoProducto(this.centrocostogrupoproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.centrocostogrupoproductoSessionBean.setsFuncionBusquedaRapida(this.centrocostogrupoproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCentroCostoActual() throws Exception {
		try	{
			CentroCosto centrocostoAux=new CentroCosto();

			if(this.idCentroCostoActual != null && this.idCentroCostoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(this.idCentroCostoActual);
					centrocostoAux= centrocostoLogic.getCentroCosto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				centrocostosForeignKey=new ArrayList<CentroCosto>();
				centrocostosForeignKey.add(centrocostoAux);
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
			if(this.isEsNuevoCentroCostoGrupoProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCentroCostoGrupoProducto(esParaCancelar);				
				this.cancelarNuevoCentroCostoGrupoProducto(esParaCancelar);								
			}
			
			this.centrocostogrupoproducto=new CentroCostoGrupoProducto();
			
			this.inicializarCentroCostoGrupoProducto();
			
			this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCentroCostoGrupoProducto() throws Exception {
		try {
			CentroCostoGrupoProductoConstantesFunciones.inicializarCentroCostoGrupoProducto(this.centrocostogrupoproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCentroCostoGrupoProductos(String sAccionBusqueda,List<CentroCostoGrupoProducto> centrocostogrupoproductosParaReportes) throws Exception {
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
					sPathReporteFinal="CentroCostoGrupoProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CentroCostoGrupoProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CentroCostoGrupoProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CentroCostoGrupoProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Centro Costo Grupo Productos");		
		parameters.put("busquedapor", CentroCostoGrupoProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCentroCostoGrupoProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CentroCostoGrupoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CentroCostoGrupoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCentroCostoGrupoProducto=new JRBeanArrayDataSource(CentroCostoGrupoProductoJInternalFrame.TraerCentroCostoGrupoProductoBeans(centrocostogrupoproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCentroCostoGrupoProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CentroCostoGrupoProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CentroCostoGrupoProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CentroCostoGrupoProductoBean.TraerCentroCostoGrupoProductoBeans(centrocostogrupoproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteCentroCostoGrupoProductos(sAccionBusqueda,sTipoArchivoReporte,centrocostogrupoproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCentroCostoGrupoProductos(sAccionBusqueda,sTipoArchivoReporte,centrocostogrupoproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProductoActionPerformed(null);
					//this.generarExcelReporteCentroCostoGrupoProductos(sAccionBusqueda,sTipoArchivoReporte,centrocostogrupoproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCentroCostoGrupoProductos(sAccionBusqueda,sTipoArchivoReporte,centrocostogrupoproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCentroCostoGrupoProductos(sAccionBusqueda,sTipoArchivoReporte,centrocostogrupoproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCentroCostoGrupoProductos(sAccionBusqueda,sTipoArchivoReporte,centrocostogrupoproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCentroCostoGrupoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoGrupoProducto> centrocostogrupoproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostogrupoproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoGrupoProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroCostoGrupoProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CentroCostoGrupoProducto centrocostogrupoproducto : centrocostogrupoproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CentroCostoGrupoProductoConstantesFunciones.generarExcelReporteDataCentroCostoGrupoProducto("NORMAL",row,workbook,centrocostogrupoproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCentroCostoGrupoProducto(String sTipo,Row row,Workbook workbook) {
		
		CentroCostoGrupoProductoConstantesFunciones.generarExcelReporteHeaderCentroCostoGrupoProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCentroCostoGrupoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoGrupoProducto> centrocostogrupoproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostogrupoproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoGrupoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CentroCostoGrupoProducto centrocostogrupoproducto : centrocostogrupoproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.getCentroCostoGrupoProductoDescripcion(centrocostogrupoproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostogrupoproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostogrupoproducto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostogrupoproducto.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostogrupoproducto.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostogrupoproducto.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostogrupoproducto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCentroCostoGrupoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoGrupoProducto> centrocostogrupoproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CentroCostoGrupoProducto> centrocostogrupoproductosRespaldo=null;
		
		classes=CentroCostoGrupoProductoConstantesFunciones.getClassesRelationshipsOfCentroCostoGrupoProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.centrocostogrupoproductoLogic.setDatosCliente(this.datosCliente);
		this.centrocostogrupoproductoLogic.setDatosDeep(this.datosDeep);
		this.centrocostogrupoproductoLogic.setIsConDeep(true);
		
		centrocostogrupoproductosRespaldo=this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos();
		
		this.centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(centrocostogrupoproductosParaReportes);	
		this.centrocostogrupoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		centrocostogrupoproductosParaReportes=this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos();
		this.centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(centrocostogrupoproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostogrupoproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoGrupoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroCostoGrupoProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CentroCostoGrupoProducto centrocostogrupoproducto : centrocostogrupoproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCentroCostoGrupoProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CentroCostoGrupoProductoConstantesFunciones.generarExcelReporteDataCentroCostoGrupoProducto("NORMAL",row,workbook,centrocostogrupoproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.getCentroCostoGrupoProductoDescripcion(centrocostogrupoproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCentroCostoGrupoProducto() throws Exception {		
		this.startProcessCentroCostoGrupoProducto(true);
	}
	
	public void startProcessCentroCostoGrupoProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCentroCostoGrupoProducto ,this.jPanelParametrosReportesCentroCostoGrupoProducto, this.jScrollPanelDatosCentroCostoGrupoProducto,this.jPanelPaginacionCentroCostoGrupoProducto, this.jScrollPanelDatosEdicionCentroCostoGrupoProducto, this.jPanelAccionesCentroCostoGrupoProducto,this.jPanelAccionesFormularioCentroCostoGrupoProducto,this.jmenuBarCentroCostoGrupoProducto,this.jmenuBarDetalleCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,this.jTtoolBarDetalleCentroCostoGrupoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroCostoGrupoProducto=this.jTabbedPaneBusquedasCentroCostoGrupoProducto; 
		
		final JPanel jPanelParametrosReportesCentroCostoGrupoProducto=this.jPanelParametrosReportesCentroCostoGrupoProducto;
		//final JScrollPane jScrollPanelDatosCentroCostoGrupoProducto=this.jScrollPanelDatosCentroCostoGrupoProducto;
		final JTable jTableDatosCentroCostoGrupoProducto=this.jTableDatosCentroCostoGrupoProducto;		
		final JPanel jPanelPaginacionCentroCostoGrupoProducto=this.jPanelPaginacionCentroCostoGrupoProducto;
		//final JScrollPane jScrollPanelDatosEdicionCentroCostoGrupoProducto=this.jScrollPanelDatosEdicionCentroCostoGrupoProducto;
		final JPanel jPanelAccionesCentroCostoGrupoProducto=this.jPanelAccionesCentroCostoGrupoProducto;
		
		JPanel jPanelCamposAuxiliarCentroCostoGrupoProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCentroCostoGrupoProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			jPanelCamposAuxiliarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelCamposCentroCostoGrupoProducto;
			jPanelAccionesFormularioAuxiliarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelAccionesFormularioCentroCostoGrupoProducto;
		}
		
		final JPanel jPanelCamposCentroCostoGrupoProducto=jPanelCamposAuxiliarCentroCostoGrupoProducto;
		final JPanel jPanelAccionesFormularioCentroCostoGrupoProducto=jPanelAccionesFormularioAuxiliarCentroCostoGrupoProducto;
		
		
		final JMenuBar jmenuBarCentroCostoGrupoProducto=this.jmenuBarCentroCostoGrupoProducto;
		final JToolBar jTtoolBarCentroCostoGrupoProducto=this.jTtoolBarCentroCostoGrupoProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCentroCostoGrupoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroCostoGrupoProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			jmenuBarDetalleAuxiliarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jmenuBarDetalleCentroCostoGrupoProducto;
			jTtoolBarDetalleAuxiliarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTtoolBarDetalleCentroCostoGrupoProducto;
		}
		
		final JMenuBar jmenuBarDetalleCentroCostoGrupoProducto=jmenuBarDetalleAuxiliarCentroCostoGrupoProducto;
		final JToolBar jTtoolBarDetalleCentroCostoGrupoProducto=jTtoolBarDetalleAuxiliarCentroCostoGrupoProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroCostoGrupoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroCostoGrupoProducto;
			processRunnable.jTableDatos=jTableDatosCentroCostoGrupoProducto;
			processRunnable.jPanelCampos=jPanelCamposCentroCostoGrupoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroCostoGrupoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesCentroCostoGrupoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroCostoGrupoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarCentroCostoGrupoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroCostoGrupoProducto;
			processRunnable.jTtoolBar=jTtoolBarCentroCostoGrupoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroCostoGrupoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroCostoGrupoProducto ,jPanelParametrosReportesCentroCostoGrupoProducto,jTableDatosCentroCostoGrupoProducto, /*jScrollPanelDatosCentroCostoGrupoProducto,*/jPanelCamposCentroCostoGrupoProducto,jPanelPaginacionCentroCostoGrupoProducto, /*jScrollPanelDatosEdicionCentroCostoGrupoProducto,*/ jPanelAccionesCentroCostoGrupoProducto,jPanelAccionesFormularioCentroCostoGrupoProducto,jmenuBarCentroCostoGrupoProducto,jmenuBarDetalleCentroCostoGrupoProducto,jTtoolBarCentroCostoGrupoProducto,jTtoolBarDetalleCentroCostoGrupoProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroCostoGrupoProducto ,jPanelParametrosReportesCentroCostoGrupoProducto, jScrollPanelDatosCentroCostoGrupoProducto,jPanelPaginacionCentroCostoGrupoProducto, jScrollPanelDatosEdicionCentroCostoGrupoProducto, jPanelAccionesCentroCostoGrupoProducto,jPanelAccionesFormularioCentroCostoGrupoProducto,jmenuBarCentroCostoGrupoProducto,jmenuBarDetalleCentroCostoGrupoProducto,jTtoolBarCentroCostoGrupoProducto,jTtoolBarDetalleCentroCostoGrupoProducto);
						
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
	
	public void finishProcessCentroCostoGrupoProducto() {// throws Exception 
		this.finishProcessCentroCostoGrupoProducto(true);
	}
	
	public void finishProcessCentroCostoGrupoProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCentroCostoGrupoProducto ,this.jPanelParametrosReportesCentroCostoGrupoProducto, this.jScrollPanelDatosCentroCostoGrupoProducto,this.jPanelPaginacionCentroCostoGrupoProducto, this.jScrollPanelDatosEdicionCentroCostoGrupoProducto, this.jPanelAccionesCentroCostoGrupoProducto,this.jPanelAccionesFormularioCentroCostoGrupoProducto,this.jmenuBarCentroCostoGrupoProducto,this.jmenuBarDetalleCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,this.jTtoolBarDetalleCentroCostoGrupoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroCostoGrupoProducto=this.jTabbedPaneBusquedasCentroCostoGrupoProducto; 
		
		final JPanel jPanelParametrosReportesCentroCostoGrupoProducto=this.jPanelParametrosReportesCentroCostoGrupoProducto;
		//final JScrollPane jScrollPanelDatosCentroCostoGrupoProducto=this.jScrollPanelDatosCentroCostoGrupoProducto;
		final JTable jTableDatosCentroCostoGrupoProducto=this.jTableDatosCentroCostoGrupoProducto;		
		final JPanel jPanelPaginacionCentroCostoGrupoProducto=this.jPanelPaginacionCentroCostoGrupoProducto;
		//final JScrollPane jScrollPanelDatosEdicionCentroCostoGrupoProducto=this.jScrollPanelDatosEdicionCentroCostoGrupoProducto;
		final JPanel jPanelAccionesCentroCostoGrupoProducto=this.jPanelAccionesCentroCostoGrupoProducto;
		
		JPanel jPanelCamposAuxiliarCentroCostoGrupoProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCentroCostoGrupoProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			jPanelCamposAuxiliarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelCamposCentroCostoGrupoProducto;
			jPanelAccionesFormularioAuxiliarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelAccionesFormularioCentroCostoGrupoProducto;
		}
		
		final JPanel jPanelCamposCentroCostoGrupoProducto=jPanelCamposAuxiliarCentroCostoGrupoProducto;
		final JPanel jPanelAccionesFormularioCentroCostoGrupoProducto=jPanelAccionesFormularioAuxiliarCentroCostoGrupoProducto;
		
		
		final JMenuBar jmenuBarCentroCostoGrupoProducto=this.jmenuBarCentroCostoGrupoProducto;		
		final JToolBar jTtoolBarCentroCostoGrupoProducto=this.jTtoolBarCentroCostoGrupoProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarCentroCostoGrupoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroCostoGrupoProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			jmenuBarDetalleAuxiliarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jmenuBarDetalleCentroCostoGrupoProducto;
			jTtoolBarDetalleAuxiliarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTtoolBarDetalleCentroCostoGrupoProducto;		
		}
		
		final JMenuBar jmenuBarDetalleCentroCostoGrupoProducto=jmenuBarDetalleAuxiliarCentroCostoGrupoProducto;
		final JToolBar jTtoolBarDetalleCentroCostoGrupoProducto=jTtoolBarDetalleAuxiliarCentroCostoGrupoProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroCostoGrupoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroCostoGrupoProducto;
			processRunnable.jTableDatos=jTableDatosCentroCostoGrupoProducto;
			processRunnable.jPanelCampos=jPanelCamposCentroCostoGrupoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroCostoGrupoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesCentroCostoGrupoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroCostoGrupoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarCentroCostoGrupoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroCostoGrupoProducto;
			processRunnable.jTtoolBar=jTtoolBarCentroCostoGrupoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroCostoGrupoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCentroCostoGrupoProducto ,jPanelParametrosReportesCentroCostoGrupoProducto, jTableDatosCentroCostoGrupoProducto,/*jScrollPanelDatosCentroCostoGrupoProducto,*/jPanelCamposCentroCostoGrupoProducto,jPanelPaginacionCentroCostoGrupoProducto, /*jScrollPanelDatosEdicionCentroCostoGrupoProducto,*/ jPanelAccionesCentroCostoGrupoProducto,jPanelAccionesFormularioCentroCostoGrupoProducto,jmenuBarCentroCostoGrupoProducto,jmenuBarDetalleCentroCostoGrupoProducto,jTtoolBarCentroCostoGrupoProducto,jTtoolBarDetalleCentroCostoGrupoProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCentroCostoGrupoProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCentroCostoGrupoProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCentroCostoGrupoProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCentroCostoGrupoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCentroCostoGrupoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCentroCostoGrupoProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCentroCostoGrupoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCentroCostoGrupoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCentroCostoGrupoProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.centrocostogrupoproductoConstantesFunciones.getsFinalQueryCentroCostoGrupoProducto();
		String  finalQueryPaginacionTodos=this.centrocostogrupoproductoConstantesFunciones.getsFinalQueryCentroCostoGrupoProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CentroCostoGrupoProductoConstantesFunciones.getArrayColumnasGlobalesNoCentroCostoGrupoProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CentroCostoGrupoProductoConstantesFunciones.getArrayColumnasGlobalesCentroCostoGrupoProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CentroCostoGrupoProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.centrocostogrupoproductosEliminados= new ArrayList<CentroCostoGrupoProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCentroCostoGrupoProducto();
		
				///*CentroCostoGrupoProductoSessionBean*/this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			
			if(this.centrocostogrupoproductoSessionBean==null) {
				this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
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
					this.iNumeroPaginacion=CentroCostoGrupoProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CentroCostoGrupoProductoConstantesFunciones.getClassesForeignKeysOfCentroCostoGrupoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/centrocostogrupoproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			centrocostogrupoproductosAux= new ArrayList<CentroCostoGrupoProducto>();
			
				
			centrocostogrupoproductoLogic.setDatosCliente(this.datosCliente);
			centrocostogrupoproductoLogic.setDatosDeep(this.datosDeep);
			centrocostogrupoproductoLogic.setIsConDeep(true);
			
			
			centrocostogrupoproductoLogic.getCentroCostoGrupoProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					centrocostogrupoproductoLogic.getTodosCentroCostoGrupoProductos(finalQueryGlobal,pagination);
					
					//centrocostogrupoproductoLogic.getTodosCentroCostoGrupoProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()==null|| centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostogrupoproductosAux= new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductosAux.addAll(centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductosAux= new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductosAux.addAll(centrocostogrupoproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostogrupoproductoLogic.getTodosCentroCostoGrupoProductos(finalQueryGlobal+"",this.pagination);												
							
							//centrocostogrupoproductoLogic.getTodosCentroCostoGrupoProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCentroCostoGrupoProductos("Todos",centrocostogrupoproductoLogic.getCentroCostoGrupoProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());					
							centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(centrocostogrupoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductos=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductos.addAll(centrocostogrupoproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCentroCostoGrupoProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCentroCostoGrupoProducto=this.idActual;
				
				} else if(this.idCentroCostoGrupoProductoActual!=null && this.idCentroCostoGrupoProductoActual!=0L) {
					idCentroCostoGrupoProducto=idCentroCostoGrupoProductoActual;
				}
				
					
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndicePorId(idCentroCostoGrupoProducto);
				
				this.centrocostogrupoproductos=new ArrayList<CentroCostoGrupoProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					centrocostogrupoproductoLogic.getEntity(idCentroCostoGrupoProducto);
					
					//centrocostogrupoproductoLogic.getEntityWithConnection(idCentroCostoGrupoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
					centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().add(centrocostogrupoproductoLogic.getCentroCostoGrupoProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostogrupoproductos=new ArrayList<CentroCostoGrupoProducto>();
					this.centrocostogrupoproductos.add(centrocostogrupoproducto);
				}
				
				if(centrocostogrupoproductoLogic.getCentroCostoGrupoProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdCentroCostoPorIdLinea")) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdCentroCostoPorIdLinea(id_centro_costoBusquedaPorIdCentroCostoPorIdLinea,id_lineaBusquedaPorIdCentroCostoPorIdLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosBusquedaPorIdCentroCostoPorIdLinea(finalQueryGlobal,pagination,id_centro_costoBusquedaPorIdCentroCostoPorIdLinea,id_lineaBusquedaPorIdCentroCostoPorIdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdCentroCostoPorIdLinea(id_centro_costoBusquedaPorIdCentroCostoPorIdLinea,id_lineaBusquedaPorIdCentroCostoPorIdLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdCentroCostoPorIdLinea(id_centro_costoBusquedaPorIdCentroCostoPorIdLinea,id_lineaBusquedaPorIdCentroCostoPorIdLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()==null||centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostogrupoproductos==null|| centrocostogrupoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
						centrocostogrupoproductosAux.addAll(centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductosAux.addAll(centrocostogrupoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostogrupoproductoLogic.getCentroCostoGrupoProductosBusquedaPorIdCentroCostoPorIdLinea(finalQueryGlobal,pagination,id_centro_costoBusquedaPorIdCentroCostoPorIdLinea,id_lineaBusquedaPorIdCentroCostoPorIdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdCentroCostoPorIdLinea(id_centro_costoBusquedaPorIdCentroCostoPorIdLinea,id_lineaBusquedaPorIdCentroCostoPorIdLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdCentroCostoPorIdLinea(id_centro_costoBusquedaPorIdCentroCostoPorIdLinea,id_lineaBusquedaPorIdCentroCostoPorIdLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoGrupoProductos("BusquedaPorIdCentroCostoPorIdLinea",centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoGrupoProductos("BusquedaPorIdCentroCostoPorIdLinea",centrocostogrupoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
						centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(centrocostogrupoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductos=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductos.addAll(centrocostogrupoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()==null||centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostogrupoproductos==null|| centrocostogrupoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
						centrocostogrupoproductosAux.addAll(centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductosAux.addAll(centrocostogrupoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoGrupoProductos("FK_IdCentroCosto",centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoGrupoProductos("FK_IdCentroCosto",centrocostogrupoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
						centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(centrocostogrupoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductos=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductos.addAll(centrocostogrupoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()==null||centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostogrupoproductos==null|| centrocostogrupoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
						centrocostogrupoproductosAux.addAll(centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductosAux.addAll(centrocostogrupoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoGrupoProductos("FK_IdEmpresa",centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoGrupoProductos("FK_IdEmpresa",centrocostogrupoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
						centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(centrocostogrupoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductos=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductos.addAll(centrocostogrupoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLinea")) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()==null||centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostogrupoproductos==null|| centrocostogrupoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
						centrocostogrupoproductosAux.addAll(centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductosAux.addAll(centrocostogrupoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoGrupoProductos("FK_IdLinea",centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoGrupoProductos("FK_IdLinea",centrocostogrupoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
						centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(centrocostogrupoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductos=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductos.addAll(centrocostogrupoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()==null||centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostogrupoproductos==null|| centrocostogrupoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
						centrocostogrupoproductosAux.addAll(centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductosAux=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductosAux.addAll(centrocostogrupoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoGrupoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoGrupoProductos("FK_IdSucursal",centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoGrupoProductos("FK_IdSucursal",centrocostogrupoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
						centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(centrocostogrupoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductos=new ArrayList<CentroCostoGrupoProducto>();
							centrocostogrupoproductos.addAll(centrocostogrupoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCentroCostoGrupoProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCentroCostoGrupoProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostogrupoproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostogrupoproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CentroCostoGrupoProducto centrocostogrupoproducto) {
		Boolean permite=true;
		
		if(this.centrocostogrupoproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CentroCostoGrupoProductoConstantesFunciones.getOrderByListaCentroCostoGrupoProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CentroCostoGrupoProductoConstantesFunciones.getOrderByListaCentroCostoGrupoProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
				if(centrocostogrupoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostogrupoproductoTotales=centrocostogrupoproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoGrupoProducto centrocostogrupoproducto:this.centrocostogrupoproductos) {
				if(centrocostogrupoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostogrupoproductoTotales=centrocostogrupoproducto;
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
			this.centrocostogrupoproductoAux=new CentroCostoGrupoProducto();
			this.centrocostogrupoproductoAux.setsType(Constantes2.S_TOTALES);
			this.centrocostogrupoproductoAux.setIsNew(false);
			this.centrocostogrupoproductoAux.setIsChanged(false);
			this.centrocostogrupoproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CentroCostoGrupoProductoConstantesFunciones.TotalizarValoresFilaCentroCostoGrupoProducto(this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this.centrocostogrupoproductoAux);
				
				this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().add(this.centrocostogrupoproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CentroCostoGrupoProductoConstantesFunciones.TotalizarValoresFilaCentroCostoGrupoProducto(this.centrocostogrupoproductos,this.centrocostogrupoproductoAux);
				
				this.centrocostogrupoproductos.add(this.centrocostogrupoproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		centrocostogrupoproductoTotales=new CentroCostoGrupoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().remove(centrocostogrupoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centrocostogrupoproductos.remove(centrocostogrupoproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		centrocostogrupoproductoTotales=new CentroCostoGrupoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
				if(centrocostogrupoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostogrupoproductoTotales=centrocostogrupoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroCostoGrupoProductoConstantesFunciones.TotalizarValoresFilaCentroCostoGrupoProducto(this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),centrocostogrupoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoGrupoProducto centrocostogrupoproducto:this.centrocostogrupoproductos) {
				if(centrocostogrupoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostogrupoproductoTotales=centrocostogrupoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroCostoGrupoProductoConstantesFunciones.TotalizarValoresFilaCentroCostoGrupoProducto(this.centrocostogrupoproductos,centrocostogrupoproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCentroCostoGrupoProductosBusquedaPorIdCentroCostoPorIdLinea()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdCentroCostoPorIdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoGrupoProductosFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoGrupoProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoGrupoProductosFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoGrupoProductosFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoGrupoProductosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCentroCostoGrupoProductosBusquedaPorIdCentroCostoPorIdLinea(String sFinalQuery,Long id_centro_costo,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosBusquedaPorIdCentroCostoPorIdLinea(sFinalQuery,this.pagination,id_centro_costo,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoGrupoProductosFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoGrupoProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoGrupoProductosFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoGrupoProductosFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoGrupoProductosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostogrupoproductoLogic.getCentroCostoGrupoProductosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCentroCostoGrupoProducto() {
		this.isPermisoTodoCentroCostoGrupoProducto=false;
		this.isPermisoNuevoCentroCostoGrupoProducto=false;
		this.isPermisoActualizarCentroCostoGrupoProducto=false;
		this.isPermisoActualizarOriginalCentroCostoGrupoProducto=false;
		this.isPermisoEliminarCentroCostoGrupoProducto=false;
		this.isPermisoGuardarCambiosCentroCostoGrupoProducto=false;
		this.isPermisoConsultaCentroCostoGrupoProducto=false;
		this.isPermisoBusquedaCentroCostoGrupoProducto=false;
		this.isPermisoReporteCentroCostoGrupoProducto=false;		
		this.isPermisoOrdenCentroCostoGrupoProducto=false;		
		this.isPermisoPaginacionMedioCentroCostoGrupoProducto=false;		
		this.isPermisoPaginacionAltoCentroCostoGrupoProducto=false;
		this.isPermisoPaginacionTodoCentroCostoGrupoProducto=false;
		this.isPermisoCopiarCentroCostoGrupoProducto=false;		
		this.isPermisoVerFormCentroCostoGrupoProducto=false;		
		this.isPermisoDuplicarCentroCostoGrupoProducto=false;		
		this.isPermisoOrdenCentroCostoGrupoProducto=false;		
	}
	
	public void setPermisosUsuarioCentroCostoGrupoProducto(Boolean isPermiso) {
		this.isPermisoTodoCentroCostoGrupoProducto=isPermiso;
		this.isPermisoNuevoCentroCostoGrupoProducto=isPermiso;
		this.isPermisoActualizarCentroCostoGrupoProducto=isPermiso;
		this.isPermisoActualizarOriginalCentroCostoGrupoProducto=isPermiso;
		this.isPermisoEliminarCentroCostoGrupoProducto=isPermiso;
		this.isPermisoGuardarCambiosCentroCostoGrupoProducto=isPermiso;
		this.isPermisoConsultaCentroCostoGrupoProducto=isPermiso;
		this.isPermisoBusquedaCentroCostoGrupoProducto=isPermiso;
		this.isPermisoReporteCentroCostoGrupoProducto=isPermiso;
		this.isPermisoOrdenCentroCostoGrupoProducto=isPermiso;		
		this.isPermisoPaginacionMedioCentroCostoGrupoProducto=isPermiso;		
		this.isPermisoPaginacionAltoCentroCostoGrupoProducto=isPermiso;		
		this.isPermisoPaginacionTodoCentroCostoGrupoProducto=isPermiso;		
		this.isPermisoCopiarCentroCostoGrupoProducto=isPermiso;		
		this.isPermisoVerFormCentroCostoGrupoProducto=isPermiso;		
		this.isPermisoDuplicarCentroCostoGrupoProducto=isPermiso;
		this.isPermisoOrdenCentroCostoGrupoProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCentroCostoGrupoProducto(Boolean isPermiso) {
		//this.isPermisoTodoCentroCostoGrupoProducto=isPermiso;
		this.isPermisoNuevoCentroCostoGrupoProducto=isPermiso;
		this.isPermisoActualizarCentroCostoGrupoProducto=isPermiso;
		this.isPermisoActualizarOriginalCentroCostoGrupoProducto=isPermiso;
		this.isPermisoEliminarCentroCostoGrupoProducto=isPermiso;
		this.isPermisoGuardarCambiosCentroCostoGrupoProducto=isPermiso;
		//this.isPermisoConsultaCentroCostoGrupoProducto=isPermiso;
		//this.isPermisoBusquedaCentroCostoGrupoProducto=isPermiso;
		//this.isPermisoReporteCentroCostoGrupoProducto=isPermiso;
		//this.isPermisoOrdenCentroCostoGrupoProducto=isPermiso;		
		//this.isPermisoPaginacionMedioCentroCostoGrupoProducto=isPermiso;		
		//this.isPermisoPaginacionAltoCentroCostoGrupoProducto=isPermiso;		
		//this.isPermisoPaginacionTodoCentroCostoGrupoProducto=isPermiso;		
		//this.isPermisoCopiarCentroCostoGrupoProducto=isPermiso;		
		//this.isPermisoDuplicarCentroCostoGrupoProducto=isPermiso;
		//this.isPermisoOrdenCentroCostoGrupoProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCentroCostoGrupoProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CentroCostoGrupoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCentroCostoGrupoProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCentroCostoGrupoProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCentroCostoGrupoProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCentroCostoGrupoProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCentroCostoGrupoProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCentroCostoGrupoProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CentroCostoGrupoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CentroCostoGrupoProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCentroCostoGrupoProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCentroCostoGrupoProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCentroCostoGrupoProducto=this.isPermisoActualizarCentroCostoGrupoProducto;
			this.isPermisoEliminarCentroCostoGrupoProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCentroCostoGrupoProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCentroCostoGrupoProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCentroCostoGrupoProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCentroCostoGrupoProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCentroCostoGrupoProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroCostoGrupoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCentroCostoGrupoProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCentroCostoGrupoProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCentroCostoGrupoProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCentroCostoGrupoProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCentroCostoGrupoProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCentroCostoGrupoProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroCostoGrupoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCentroCostoGrupoProducto.setToolTipText(this.jTableDatosCentroCostoGrupoProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCentroCostoGrupoProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCentroCostoGrupoProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CentroCostoGrupoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CentroCostoGrupoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCentroCostoGrupoProducto() throws Exception {
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
	public void inicializarCombosForeignKeyCentroCostoGrupoProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCentroCostoGrupoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CentroCostoGrupoProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCentroCostoGrupoProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCentroCostoGrupoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CentroCostoGrupoProductoParameterReturnGeneral centrocostogrupoproductoReturnGeneral=new CentroCostoGrupoProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.centrocostogrupoproductoConstantesFunciones.cargarid_empresaCentroCostoGrupoProducto)
					 || (this.esRecargarFks && this.centrocostogrupoproductoConstantesFunciones.cargarid_empresaCentroCostoGrupoProducto)) {

					if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+centrocostogrupoproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.centrocostogrupoproductoConstantesFunciones.cargarid_sucursalCentroCostoGrupoProducto)
					 || (this.esRecargarFks && this.centrocostogrupoproductoConstantesFunciones.cargarid_sucursalCentroCostoGrupoProducto)) {

					if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+centrocostogrupoproductoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.centrocostogrupoproductoConstantesFunciones.cargarid_centro_costoCentroCostoGrupoProducto)
					 || (this.esRecargarFks && this.centrocostogrupoproductoConstantesFunciones.cargarid_centro_costoCentroCostoGrupoProducto)) {

					if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+centrocostogrupoproductoSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.centrocostogrupoproductoConstantesFunciones.cargarid_lineaCentroCostoGrupoProducto)
					 || (this.esRecargarFks && this.centrocostogrupoproductoConstantesFunciones.cargarid_lineaCentroCostoGrupoProducto)) {

					if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+centrocostogrupoproductoSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalLineaGrupo="";

				if(((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0) && this.centrocostogrupoproductoConstantesFunciones.cargarid_linea_grupoCentroCostoGrupoProducto)
					 || (this.esRecargarFks && this.centrocostogrupoproductoConstantesFunciones.cargarid_linea_grupoCentroCostoGrupoProducto)) {

					if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaGrupo, "");
						finalQueryGlobalLineaGrupo+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaGrupo=" WHERE " + ConstantesSql.ID + "="+centrocostogrupoproductoSessionBean.getlidLineaGrupoActual();
					}
				} else {
					finalQueryGlobalLineaGrupo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				centrocostogrupoproductoReturnGeneral=centrocostogrupoproductoLogic.cargarCombosLoteForeignKeyCentroCostoGrupoProducto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCentroCosto,finalQueryGlobalLinea,finalQueryGlobalLineaGrupo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=centrocostogrupoproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=centrocostogrupoproductoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=centrocostogrupoproductoReturnGeneral.getcentrocostosForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=centrocostogrupoproductoReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalLineaGrupo.equals("NONE")) {
				this.lineagruposForeignKey=centrocostogrupoproductoReturnGeneral.getlineagruposForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCentroCostoGrupoProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCentroCosto();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.centrocostogrupoproductoSessionBean==null) {
				this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			}

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.centrocostogrupoproductoSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCentroCostoGrupoProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCentroCostoGrupoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCentroCostoGrupoProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoGrupoProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto)throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(centrocostogrupoproducto.getid_centro_costo(),false,"Formulario");
			this.setActualLineaForeignKey(centrocostogrupoproducto.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(centrocostogrupoproducto.getid_linea_grupo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(centrocostogrupoproducto.getCentroCosto()!=null && !sTipoEvento.equals("id_centro_costoCentroCostoGrupoProducto")) { //sTipoEvento Evita Bucle Infinito

					this.centrocostosForeignKey=new ArrayList<CentroCosto>();
					this.centrocostosForeignKey.add(centrocostogrupoproducto.getCentroCosto());

					this.addItemDefectoCombosForeignKeyCentroCosto();
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCentroCostoGrupoProducto()throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(this.centrocostogrupoproductoConstantesFunciones.getid_centro_costo(),false,"Formulario");
			this.setActualLineaForeignKey(this.centrocostogrupoproductoConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.centrocostogrupoproductoConstantesFunciones.getid_linea_grupo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoGrupoProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCentroCostoGrupoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCentroCostoGrupoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCentroCostoGrupoProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCentroCostoGrupoProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCentroCostoGrupoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCentroCostoGrupoProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CentroCostoGrupoProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CentroCostoGrupoProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CentroCostoGrupoProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean(); 
		this.centrocostogrupoproductoConstantesFunciones=new CentroCostoGrupoProductoConstantesFunciones(); 
		this.centrocostogrupoproductoBean=new CentroCostoGrupoProducto();//(this.centrocostogrupoproductoConstantesFunciones); 		
		this.centrocostogrupoproductoReturnGeneral=new CentroCostoGrupoProductoParameterReturnGeneral(); 
		
		this.centrocostogrupoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CentroCostoGrupoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CentroCostoGrupoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CentroCostoGrupoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCentroCostoGrupoProducto(true);
			
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
			
			this.centrocostogrupoproductoConstantesFunciones=new CentroCostoGrupoProductoConstantesFunciones(); 
			this.centrocostogrupoproductoBean=new CentroCostoGrupoProducto();//this.centrocostogrupoproductoConstantesFunciones); 			
			this.centrocostogrupoproductoReturnGeneral=new CentroCostoGrupoProductoParameterReturnGeneral(); 
		
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Grupo Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.centrocostogrupoproducto=new CentroCostoGrupoProducto();
			this.centrocostogrupoproductos = new ArrayList<CentroCostoGrupoProducto>();
			this.centrocostogrupoproductosAux = new ArrayList<CentroCostoGrupoProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic=new CentroCostoGrupoProductoLogic();
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.centrocostogrupoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCentroCostoGrupoProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto);	
					}
					
					if(this.jInternalFrameImportacionCentroCostoGrupoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroCostoGrupoProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCentroCostoGrupoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCentroCostoGrupoProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroCostoGrupoProducto);
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setVisible(false);
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto);
					this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCentroCostoGrupoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCentroCostoGrupoProducto);
					this.jInternalFrameImportacionCentroCostoGrupoProducto.setVisible(false);
					this.jInternalFrameImportacionCentroCostoGrupoProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCentroCostoGrupoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCentroCostoGrupoProducto);
					this.jInternalFrameOrderByCentroCostoGrupoProducto.setVisible(false);
					this.jInternalFrameOrderByCentroCostoGrupoProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCentroCostoGrupoProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CentroCostoGrupoProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.centrocostogrupoproductoReturnGeneral=new CentroCostoGrupoProductoParameterReturnGeneral();
			
			this.centrocostogrupoproductoParameterGeneral=new CentroCostoGrupoProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.centrocostogrupoproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CentroCostoGrupoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroCostoGrupoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado(),this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroCostoGrupoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado(),this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaDuplicarCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaCopiarCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaVerFormCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=false;
			
			
			this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea=true;
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCentroCostoGrupoProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCentroCostoGrupoProducto(false);
			
			this.setPermisosUsuarioCentroCostoGrupoProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() && this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCentroCostoGrupoProductoClasesRelacionadas();
			}
			
			if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCentroCostoGrupoProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCentroCostoGrupoProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCentroCostoGrupoProducto();
			}
			
			if(!this.isPermisoBusquedaCentroCostoGrupoProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCentroCostoGrupoProducto,this.isPermisoPaginacionMedioCentroCostoGrupoProducto,this.isPermisoPaginacionTodoCentroCostoGrupoProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CentroCostoGrupoProductoConstantesFunciones.getTiposSeleccionarCentroCostoGrupoProducto());
				
				this.tiposColumnasSelect=CentroCostoGrupoProductoConstantesFunciones.getTiposSeleccionarCentroCostoGrupoProducto(true);
				
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
			//if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCentroCostoGrupoProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCentroCostoGrupoProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCentroCostoGrupoProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoGrupoProducto() ;
			
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
			this.centrocostoLogic=new CentroCostoLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				centrocostogrupoproductoImplementable= (CentroCostoGrupoProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroCostoGrupoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				centrocostogrupoproductoImplementableHome= (CentroCostoGrupoProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroCostoGrupoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.centrocostogrupoproductos= new ArrayList<CentroCostoGrupoProducto>();
			this.centrocostogrupoproductosEliminados= new ArrayList<CentroCostoGrupoProducto>();
						
			this.isEsNuevoCentroCostoGrupoProducto=false;
			this.esParaAccionDesdeFormularioCentroCostoGrupoProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCentroCostoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCentroCostoGrupoProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCentroCostoGrupoProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CentroCostoGrupoProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCentroCostoGrupoProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCentroCostoGrupoProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCentroCostoGrupoProducto();
			}
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCentroCostoGrupoProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CentroCostoGrupoProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCentroCostoGrupoProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCentroCostoGrupoProducto")) {
				iIndex=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCentroCostoGrupoProducto();	
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
	
	public void cargarCombosForeignKeyCentroCostoGrupoProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCentroCostoGrupoProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCentroCostoGrupoProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCentroCostoGrupoProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCentroCostoGrupoProducto();
		
		this.cargarCombosFrameForeignKeyCentroCostoGrupoProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCentroCostoGrupoProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCentroCostoGrupoProducto();
		}
	}
	
	

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCentroCostoGrupoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
			
			if(jTableDatosCentroCostoGrupoProducto.getRowCount()>=1) {
				jTableDatosCentroCostoGrupoProducto.removeRowSelectionInterval(0, jTableDatosCentroCostoGrupoProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoCentroCostoGrupoProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCentroCostoGrupoProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCentroCostoGrupoProducto(true);			
			//this.centrocostogrupoproducto=new CentroCostoGrupoProducto();
			//this.centrocostogrupoproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoGrupoProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto() ;
			
			if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoGrupoProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.centrocostogrupoproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);				
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
			if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CentroCostoGrupoProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCentroCostoGrupoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCentroCostoGrupoProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCentroCostoGrupoProducto.getSelectedRows().length;			
			}
			
			centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCentroCostoGrupoProducto--;			
				//CentroCostoGrupoProducto centrocostogrupoproductoAux= new CentroCostoGrupoProducto();			
				//centrocostogrupoproductoAux.setId(this.iIdNuevoCentroCostoGrupoProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CentroCostoGrupoProducto centrocostogrupoproductoOrigen=new CentroCostoGrupoProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CentroCostoGrupoProducto centrocostogrupoproductoOrigen : centrocostogrupoproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							centrocostogrupoproductoOrigen =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostogrupoproductoOrigen =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCentroCostoGrupoProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.centrocostogrupoproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCentroCostoGrupoProducto(centrocostogrupoproductoOrigen,this.centrocostogrupoproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().add(this.centrocostogrupoproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproductos.add(this.centrocostogrupoproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
				
				this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(this.getIndiceNuevoCentroCostoGrupoProducto(), this.getIndiceNuevoCentroCostoGrupoProducto());
				
				int iLastRow =  this.jTableDatosCentroCostoGrupoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroCostoGrupoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroCostoGrupoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();									
		
			CentroCostoGrupoProducto centrocostogrupoproductoOrigen=new CentroCostoGrupoProducto();
			CentroCostoGrupoProducto centrocostogrupoproductoDestino=new CentroCostoGrupoProducto();
				
			centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCentroCostoGrupoProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || centrocostogrupoproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCentroCostoGrupoProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoOrigen =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centrocostogrupoproductoOrigen =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostogrupoproductoDestino =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centrocostogrupoproductoDestino =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				centrocostogrupoproductoOrigen =centrocostogrupoproductosSeleccionados.get(0);
				centrocostogrupoproductoDestino =centrocostogrupoproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCentroCostoGrupoProducto(centrocostogrupoproductoOrigen,centrocostogrupoproductoDestino,true,false);
				
				centrocostogrupoproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centrocostogrupoproductoDestino,centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostogrupoproductoDestino,centrocostogrupoproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
				
				//this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(this.getIndiceNuevoCentroCostoGrupoProducto(), this.getIndiceNuevoCentroCostoGrupoProducto());
				
				int iLastRow =  this.jTableDatosCentroCostoGrupoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroCostoGrupoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroCostoGrupoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCentroCostoGrupoProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(!isVisible);
			this.jPanelPaginacionCentroCostoGrupoProducto.setVisible(!isVisible);
			this.jPanelAccionesCentroCostoGrupoProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCentroCostoGrupoProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCentroCostoGrupoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCentroCostoGrupoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCentroCostoGrupoProducto();
			
			this.abrirFrameOrderByCentroCostoGrupoProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCentroCostoGrupoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCentroCostoGrupoProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroCostoGrupoProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.isMaximum()) {
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setSize(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.iWidthFormulario,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCentroCostoGrupoProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCentroCostoGrupoProducto.isMaximum()) {
						this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jContentPaneDetalleCentroCostoGrupoProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jContentPaneDetalleCentroCostoGrupoProducto.getWidth(),CentroCostoGrupoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jContentPaneDetalleCentroCostoGrupoProducto.getWidth(),CentroCostoGrupoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jContentPaneDetalleCentroCostoGrupoProducto.getWidth(),CentroCostoGrupoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setVisible(true);
	        this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCentroCostoGrupoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCentroCostoGrupoProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCentroCostoGrupoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoGrupoProducto,false,this);
				} else {
					this.jInternalFrameOrderByCentroCostoGrupoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoGrupoProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCentroCostoGrupoProducto);
				this.jInternalFrameOrderByCentroCostoGrupoProducto.setVisible(false);
				this.jInternalFrameOrderByCentroCostoGrupoProducto.setSelected(false);
				
				this.jInternalFrameOrderByCentroCostoGrupoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroCostoGrupoProducto"));
				
				this.inicializarActualizarBindingTablaOrderByCentroCostoGrupoProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCentroCostoGrupoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCentroCostoGrupoProducto==null) {
				
				this.jInternalFrameImportacionCentroCostoGrupoProducto=new ImportacionJInternalFrame(CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroCostoGrupoProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCentroCostoGrupoProducto);
				this.jInternalFrameImportacionCentroCostoGrupoProducto.setVisible(false);
				this.jInternalFrameImportacionCentroCostoGrupoProducto.setSelected(false);


				this.jInternalFrameImportacionCentroCostoGrupoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroCostoGrupoProducto"));
				this.jInternalFrameImportacionCentroCostoGrupoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroCostoGrupoProducto"));
				this.jInternalFrameImportacionCentroCostoGrupoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroCostoGrupoProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCentroCostoGrupoProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto==null) {
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto=new ReporteDinamicoJInternalFrame(CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto);
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoGrupoProducto"));
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoGrupoProducto"));
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoGrupoProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoGrupoProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCentroCostoGrupoProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroCostoGrupoProducto);
			
	       	this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setVisible(false);
	        this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormCentroCostoGrupoProducto.dispose();
			//this.jInternalFrameDetalleFormCentroCostoGrupoProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCentroCostoGrupoProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCentroCostoGrupoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCentroCostoGrupoProducto.setVisible(true);
	        this.jInternalFrameImportacionCentroCostoGrupoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCentroCostoGrupoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setVisible(true);
	        this.jInternalFrameOrderByCentroCostoGrupoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCentroCostoGrupoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setVisible(false);
	        this.jInternalFrameOrderByCentroCostoGrupoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCentroCostoGrupoProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCentroCostoGrupoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCentroCostoGrupoProducto.setVisible(false);
	        this.jInternalFrameImportacionCentroCostoGrupoProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLinea(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="Linea";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLinea(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaGrupo(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaGrupo";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
						TitledBorder titledBorderLineaGrupo=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaGrupo.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaGrupo(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCentroCostoGrupoProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCentroCostoGrupoProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCentroCostoGrupoProducto(true);
			//this.isEsNuevoCentroCostoGrupoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoGrupoProducto(false) ;
			
			if(centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoGrupoProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCentroCostoGrupoProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCentroCostoGrupoProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCentroCostoGrupoProducto(true);
			//this.isEsNuevoCentroCostoGrupoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.centrocostogrupoproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCentroCostoGrupoProducto(false) ;
			
			if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoGrupoProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CentroCosto")) {
				if(!this.centrocostogrupoproductoConstantesFunciones.cargarid_centro_costoCentroCostoGrupoProducto) {
					this.cargarCombosCentroCostosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_centro_costo (id);

				this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_centro_costo (Long id) throws Exception {
		this.setActualCentroCostoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCentroCostoGrupoProducto(false);
			
			//if(!this.isEsNuevoCentroCostoGrupoProducto) {								
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				
			}
			
			if(this.permiteMantenimiento(this.centrocostogrupoproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCentroCostoGrupoProducto=true;
					this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
					this.isEsNuevoCentroCostoGrupoProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCentroCostoGrupoProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCentroCostoGrupoProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroCostoGrupoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto(false);
				
				this.habilitarDeshabilitarControlesCentroCostoGrupoProducto(false);
			
												
				
				if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCentroCostoGrupoProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,centrocostogrupoproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,centrocostogrupoproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.centrocostogrupoproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				this.centrocostogrupoproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				this.centrocostogrupoproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.centrocostogrupoproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CentroCostoGrupoProductoModel) this.jTableDatosCentroCostoGrupoProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCentroCostoGrupoProducto=true;
				this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
				this.isEsNuevoCentroCostoGrupoProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroCostoGrupoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto(false);
				
				this.habilitarDeshabilitarControlesCentroCostoGrupoProducto(false);
				
				
				
				if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCentroCostoGrupoProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCentroCostoGrupoProducto.getRowCount()>=1) {
				jTableDatosCentroCostoGrupoProducto.removeRowSelectionInterval(0, jTableDatosCentroCostoGrupoProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCentroCostoGrupoProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoGrupoProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto(false) ;
			
			this.isEsNuevoCentroCostoGrupoProducto=false;
			
			if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCentroCostoGrupoProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
				
				//SI ES MANUAL
				if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCentroCostoGrupoProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCentroCostoGrupoProducto--;			
			//CentroCostoGrupoProducto centrocostogrupoproductoAux= new CentroCostoGrupoProducto();			
			//centrocostogrupoproductoAux.setId(this.iIdNuevoCentroCostoGrupoProducto);
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCentroCostoGrupoProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
			
			this.centrocostogrupoproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().add(this.centrocostogrupoproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.centrocostogrupoproductos.add(this.centrocostogrupoproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
			
			this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(this.getIndiceNuevoCentroCostoGrupoProducto(), this.getIndiceNuevoCentroCostoGrupoProducto());
			
			int iLastRow =  this.jTableDatosCentroCostoGrupoProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCentroCostoGrupoProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCentroCostoGrupoProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
			
			//SI ES MANUAL
			if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoGrupoProducto();
			}
			
			//this.abrirFrameTreeCentroCostoGrupoProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Centro Costo Grupo ProductoS ?", "MANTENIMIENTO DE Centro Costo Grupo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCentroCostoGrupoProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCentroCostoGrupoProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.centrocostogrupoproductoReturnGeneral=centrocostogrupoproductoLogic.procesarImportacionCentroCostoGrupoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.centrocostogrupoproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCentroCostoGrupoProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCentroCostoGrupoProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCentroCostoGrupoProducto.setFileImportacion(this.jInternalFrameImportacionCentroCostoGrupoProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCentroCostoGrupoProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCentroCostoGrupoProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCentroCostoGrupoProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCentroCostoGrupoProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		

		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CentroCostoGrupoProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CentroCostoGrupoProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteCentroCostoGrupoProductos("Todos",centrocostogrupoproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostogrupoproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CentroCostoGrupoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostogrupoproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostogrupoproducto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostogrupoproducto.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostogrupoproducto.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostogrupoproducto.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostogrupoproducto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelCentroCostoGrupoProducto(row);				
			//	iRow++;
			//}				
			
			//for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCentroCostoGrupoProducto(centrocostogrupoproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
			
			//SI ES MANUAL
			if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoGrupoProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
			
			//SI ES MANUAL
			if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroCostoGrupoProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
			
			//SI ES MANUAL
			if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroCostoGrupoProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCentroCostoGrupoProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCentroCostoGrupoProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCentroCostoGrupoProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCentroCostoGrupoProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCentroCostoGrupoProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCentroCostoGrupoProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosCentroCostoGrupoProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosCentroCostoGrupoProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCentroCostoGrupoProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCentroCostoGrupoProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCentroCostoGrupoProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCentroCostoGrupoProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCentroCostoGrupoProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoGrupoProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCentroCostoGrupoProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCentroCostoGrupoProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCentroCostoGrupoProducto();
		
		this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCentroCostoGrupoProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoGrupoProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoGrupoProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoGrupoProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCentroCostoGrupoProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jCheckBoxPostAccionNuevoCentroCostoGrupoProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jCheckBoxPostAccionSinCerrarCentroCostoGrupoProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jCheckBoxPostAccionSinMensajeCentroCostoGrupoProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCentroCostoGrupoProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jCheckBoxPostAccionNuevoCentroCostoGrupoProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jCheckBoxPostAccionSinCerrarCentroCostoGrupoProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jCheckBoxPostAccionSinMensajeCentroCostoGrupoProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCentroCostoGrupoProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCentroCostoGrupoProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCentroCostoGrupoProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoGrupoProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoGrupoProducto() throws Exception {
		try	{
			if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroCostoGrupoProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroCostoGrupoProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroCostoGrupoProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCentroCostoGrupoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCentroCostoGrupoProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.addItem(reporte);
			}
			
			
			if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCentroCostoGrupoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCentroCostoGrupoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoGrupoProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoGrupoProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCentroCostoGrupoProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.getSelectedItem()!=null){this.id_centro_costoBusquedaPorIdCentroCostoPorIdLinea=((CentroCosto)this.jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.getSelectedItem()!=null){this.id_lineaBusquedaPorIdCentroCostoPorIdLinea=((Linea)this.jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.getSelectedItem()!=null){this.id_lineaFK_IdLinea=((Linea)this.jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCentroCostoGrupoProducto(Boolean esInicializar) throws Exception {				
		if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCentroCostoGrupoProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCentroCostoGrupoProducto() throws Exception {
		this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCentroCostoGrupoProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCentroCostoGrupoProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCentroCostoGrupoProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=centrocostogrupoproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCentroCostoGrupoProducto.setModel(new CentroCostoGrupoProductoModel(this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCentroCostoGrupoProducto.setModel(new CentroCostoGrupoProductoModel(this.centrocostogrupoproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCentroCostoGrupoProducto!=null && this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCentroCostoGrupoProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO,centrocostogrupoproductoConstantesFunciones.resaltarSeleccionarCentroCostoGrupoProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO,centrocostogrupoproductoConstantesFunciones.resaltarSeleccionarCentroCostoGrupoProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_ID));

		if(this.centrocostogrupoproductoConstantesFunciones.mostraridCentroCostoGrupoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoGrupoProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostogrupoproductoConstantesFunciones.resaltaridCentroCostoGrupoProducto,this.centrocostogrupoproductoConstantesFunciones.activaridCentroCostoGrupoProducto,this,true,"idCentroCostoGrupoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostogrupoproductoConstantesFunciones.resaltaridCentroCostoGrupoProducto,this.centrocostogrupoproductoConstantesFunciones.activaridCentroCostoGrupoProducto,this,true,"idCentroCostoGrupoProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.centrocostogrupoproductoConstantesFunciones.mostrarid_empresaCentroCostoGrupoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_empresaCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_empresaCentroCostoGrupoProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_empresaCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_empresaCentroCostoGrupoProducto,false,"id_empresaCentroCostoGrupoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.centrocostogrupoproductoConstantesFunciones.mostrarid_sucursalCentroCostoGrupoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_sucursalCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_sucursalCentroCostoGrupoProducto));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_sucursalCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_sucursalCentroCostoGrupoProducto,false,"id_sucursalCentroCostoGrupoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.centrocostogrupoproductoConstantesFunciones.mostrarid_centro_costoCentroCostoGrupoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_centro_costoCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_centro_costoCentroCostoGrupoProducto));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_centro_costoCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_centro_costoCentroCostoGrupoProducto,true,"id_centro_costoCentroCostoGrupoProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA));

		if(this.centrocostogrupoproductoConstantesFunciones.mostrarid_lineaCentroCostoGrupoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_lineaCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_lineaCentroCostoGrupoProducto));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_lineaCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_lineaCentroCostoGrupoProducto,true,"id_lineaCentroCostoGrupoProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO));

		if(this.centrocostogrupoproductoConstantesFunciones.mostrarid_linea_grupoCentroCostoGrupoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagruposForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_linea_grupoCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_linea_grupoCentroCostoGrupoProducto));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagruposForeignKey,this.centrocostogrupoproductoConstantesFunciones.resaltarid_linea_grupoCentroCostoGrupoProducto,this,this.centrocostogrupoproductoConstantesFunciones.activarid_linea_grupoCentroCostoGrupoProducto,true,"id_linea_grupoCentroCostoGrupoProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.centrocostogrupoproductoConstantesFunciones.mostrardescripcionCentroCostoGrupoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.centrocostogrupoproductoConstantesFunciones.resaltardescripcionCentroCostoGrupoProducto,this.centrocostogrupoproductoConstantesFunciones.activardescripcionCentroCostoGrupoProducto,this,true,"descripcionCentroCostoGrupoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostogrupoproductoConstantesFunciones.resaltardescripcionCentroCostoGrupoProducto,this.centrocostogrupoproductoConstantesFunciones.activardescripcionCentroCostoGrupoProducto,this,true,"descripcionCentroCostoGrupoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoGrupoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroCostoGrupoProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroCostoGrupoProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCentroCostoGrupoProducto.addColumn(tableColumn);
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
			
			this.jTableDatosCentroCostoGrupoProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCentroCostoGrupoProducto.moveColumn(this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCentroCostoGrupoProducto.moveColumn(this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCentroCostoGrupoProducto.moveColumn(this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCentroCostoGrupoProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCentroCostoGrupoProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCentroCostoGrupoProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCentroCostoGrupoProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCentroCostoGrupoProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCentroCostoGrupoProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=centrocostogrupoproductos.size()-1;
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
		//this.jTableDatosCentroCostoGrupoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCentroCostoGrupoProducto();
			
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
				
				//this.isEsNuevoCentroCostoGrupoProducto=false;
					
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
				if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroCostoGrupoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.centrocostogrupoproducto.getsType().equals("DUPLICADO")
				   || this.centrocostogrupoproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCentroCostoGrupoProducto=true;
				
				} else {
					this.isEsNuevoCentroCostoGrupoProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.centrocostogrupoproducto.getId()>=0 && !this.centrocostogrupoproducto.getIsNew()) {						
						this.isEsNuevoCentroCostoGrupoProducto=false;
						
					} else {
						this.isEsNuevoCentroCostoGrupoProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCentroCostoGrupoProducto(esRelaciones);						
				
				this.seleccionarCentroCostoGrupoProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.centrocostogrupoproducto.getId()<0) {
					this.isEsNuevoCentroCostoGrupoProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCentroCostoGrupoProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCentroCostoGrupoProducto(evt,rowIndex);
				}	
				
				if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CentroCostoGrupoProducto: " + this.dDif); 
					}
				}								
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCentroCostoGrupoProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.centrocostogrupoproducto)) {
					if(this.centrocostogrupoproducto.getId()>0) {
						this.centrocostogrupoproducto.setIsDeleted(true);
						
						this.centrocostogrupoproductosEliminados.add(this.centrocostogrupoproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().remove(this.centrocostogrupoproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproductos.remove(this.centrocostogrupoproducto);				
					}
					
					
					((CentroCostoGrupoProductoModel) this.jTableDatosCentroCostoGrupoProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCentroCostoGrupoProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCentroCostoGrupoProducto) {
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroCostoGrupoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.centrocostogrupoproductoConstantesFunciones.cargarid_empresaCentroCostoGrupoProducto || this.centrocostogrupoproductoConstantesFunciones.event_dependid_empresaCentroCostoGrupoProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.centrocostogrupoproducto.getid_empresa());
									//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(centrocostogrupoproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(centrocostogrupoproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.centrocostogrupoproducto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.centrocostogrupoproductoConstantesFunciones.cargarid_sucursalCentroCostoGrupoProducto || this.centrocostogrupoproductoConstantesFunciones.event_dependid_sucursalCentroCostoGrupoProducto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.centrocostogrupoproducto.getid_sucursal());
									//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(centrocostogrupoproducto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(centrocostogrupoproducto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.centrocostogrupoproducto.getid_sucursal(),false,"Formulario");

					//CentroCosto
					if(!this.centrocostogrupoproductoConstantesFunciones.cargarid_centro_costoCentroCostoGrupoProducto || this.centrocostogrupoproductoConstantesFunciones.event_dependid_centro_costoCentroCostoGrupoProducto) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.centrocostogrupoproducto.getid_centro_costo());
									//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(centrocostogrupoproducto.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(centrocostogrupoproducto.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.centrocostogrupoproducto.getid_centro_costo(),false,"Formulario");

					//Linea
					if(!this.centrocostogrupoproductoConstantesFunciones.cargarid_lineaCentroCostoGrupoProducto || this.centrocostogrupoproductoConstantesFunciones.event_dependid_lineaCentroCostoGrupoProducto) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.centrocostogrupoproducto.getid_linea());
									//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(centrocostogrupoproducto.getLinea()!=null) {
							this.lineasForeignKey.add(centrocostogrupoproducto.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.centrocostogrupoproducto.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.centrocostogrupoproductoConstantesFunciones.cargarid_linea_grupoCentroCostoGrupoProducto || this.centrocostogrupoproductoConstantesFunciones.event_dependid_linea_grupoCentroCostoGrupoProducto) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.centrocostogrupoproducto.getid_linea_grupo());
									//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(centrocostogrupoproducto.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(centrocostogrupoproducto.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.centrocostogrupoproducto.getid_linea_grupo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCentroCostoGrupoProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCentroCostoGrupoProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCentroCostoGrupoProducto(centrocostogrupoproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCentroCostoGrupoProducto(centrocostogrupoproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCentroCostoGrupoProducto(centrocostogrupoproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoGrupoProducto(centrocostogrupoproducto);
	}
	
	public void setVariablesObjetoActualToFormularioCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.setText(centrocostogrupoproducto.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTextAreadescripcionCentroCostoGrupoProducto.setText(centrocostogrupoproducto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CentroCostoGrupoProducto centrocostogrupoproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,centrocostogrupoproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CentroCostoGrupoProducto centrocostogrupoproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				centrocostogrupoproductoLocal=this.centrocostogrupoproducto;
			} else {
				centrocostogrupoproductoLocal=this.centrocostogrupoproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(centrocostogrupoproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCentroCostoGrupoProducto(centrocostogrupoproductoLocal,true);
					
					if(centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(centrocostogrupoproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(centrocostogrupoproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(centrocostogrupoproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(centrocostogrupoproducto);
	}
	
	public void setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(centrocostogrupoproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.getText()==null || this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.getText()=="" || this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.setText("0");
			}

			if(conColumnasBase) {centrocostogrupoproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoGrupoProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelIdCentroCostoGrupoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostogrupoproducto.setdescripcion(this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTextAreadescripcionCentroCostoGrupoProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabeldescripcionCentroCostoGrupoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproductoBean,CentroCostoGrupoProducto centrocostogrupoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && centrocostogrupoproductoBean.getid_centro_costo()!=null && !centrocostogrupoproductoBean.getid_centro_costo().equals(null))) {centrocostogrupoproducto.setid_centro_costo(centrocostogrupoproductoBean.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostogrupoproductoBean.getid_linea()!=null && !centrocostogrupoproductoBean.getid_linea().equals(-1L))) {centrocostogrupoproducto.setid_linea(centrocostogrupoproductoBean.getid_linea());}
			if(conDefault || (!conDefault && centrocostogrupoproductoBean.getid_linea_grupo()!=null && !centrocostogrupoproductoBean.getid_linea_grupo().equals(-1L))) {centrocostogrupoproducto.setid_linea_grupo(centrocostogrupoproductoBean.getid_linea_grupo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproductoOrigen,CentroCostoGrupoProducto centrocostogrupoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centrocostogrupoproductoOrigen.getId()!=null && !centrocostogrupoproductoOrigen.getId().equals(0L))) {centrocostogrupoproducto.setId(centrocostogrupoproductoOrigen.getId());}}
			if(conDefault || (!conDefault && centrocostogrupoproductoOrigen.getid_centro_costo()!=null && !centrocostogrupoproductoOrigen.getid_centro_costo().equals(null))) {centrocostogrupoproducto.setid_centro_costo(centrocostogrupoproductoOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostogrupoproductoOrigen.getid_linea()!=null && !centrocostogrupoproductoOrigen.getid_linea().equals(-1L))) {centrocostogrupoproducto.setid_linea(centrocostogrupoproductoOrigen.getid_linea());}
			if(conDefault || (!conDefault && centrocostogrupoproductoOrigen.getid_linea_grupo()!=null && !centrocostogrupoproductoOrigen.getid_linea_grupo().equals(-1L))) {centrocostogrupoproducto.setid_linea_grupo(centrocostogrupoproductoOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && centrocostogrupoproductoOrigen.getdescripcion()!=null && !centrocostogrupoproductoOrigen.getdescripcion().equals(""))) {centrocostogrupoproducto.setdescripcion(centrocostogrupoproductoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.setText(centrocostogrupoproducto.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTextAreadescripcionCentroCostoGrupoProducto.setText(centrocostogrupoproducto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroCostoGrupoProducto(CentroCostoGrupoProductoBean centrocostogrupoproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.setText(centrocostogrupoproductoBean.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTextAreadescripcionCentroCostoGrupoProducto.setText(centrocostogrupoproductoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCentroCostoGrupoProducto(CentroCostoGrupoProductoParameterReturnGeneral centrocostogrupoproductoReturnGeneral,CentroCostoGrupoProductoBean centrocostogrupoproductoBean,Boolean conDefault) throws Exception { 
		try {
			CentroCostoGrupoProducto centrocostogrupoproductoLocal=new CentroCostoGrupoProducto();
			
			centrocostogrupoproductoLocal=centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centrocostogrupoproductoLocal.getId()!=null && !centrocostogrupoproductoLocal.getId().equals(0L))) {centrocostogrupoproductoBean.setId(centrocostogrupoproductoLocal.getId());}}
			if(conDefault || (!conDefault && centrocostogrupoproductoLocal.getid_centro_costo()!=null && !centrocostogrupoproductoLocal.getid_centro_costo().equals(null))) {centrocostogrupoproductoBean.setid_centro_costo(centrocostogrupoproductoLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostogrupoproductoLocal.getid_linea()!=null && !centrocostogrupoproductoLocal.getid_linea().equals(-1L))) {centrocostogrupoproductoBean.setid_linea(centrocostogrupoproductoLocal.getid_linea());}
			if(conDefault || (!conDefault && centrocostogrupoproductoLocal.getid_linea_grupo()!=null && !centrocostogrupoproductoLocal.getid_linea_grupo().equals(-1L))) {centrocostogrupoproductoBean.setid_linea_grupo(centrocostogrupoproductoLocal.getid_linea_grupo());}
			if(conDefault || (!conDefault && centrocostogrupoproductoLocal.getdescripcion()!=null && !centrocostogrupoproductoLocal.getdescripcion().equals(""))) {centrocostogrupoproductoBean.setdescripcion(centrocostogrupoproductoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCentroCostoGrupoProductoGenerico(Long idCentroCostoGrupoProductoSeleccionado,JComboBox jComboBoxCentroCostoGrupoProducto,List<CentroCostoGrupoProducto> centrocostogrupoproductosLocal)throws Exception {
		try {
			CentroCostoGrupoProducto  centrocostogrupoproductoTemp=null;

			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductosLocal) {
				if(centrocostogrupoproductoAux.getId()!=null && centrocostogrupoproductoAux.getId().equals(idCentroCostoGrupoProductoSeleccionado)) {
					centrocostogrupoproductoTemp=centrocostogrupoproductoAux;
					break;
				}
			}

			jComboBoxCentroCostoGrupoProducto.setSelectedItem(centrocostogrupoproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCentroCostoGrupoProductoGenerico(JComboBox jComboBoxCentroCostoGrupoProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroCostoGrupoProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCentroCostoGrupoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroCostoGrupoProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCentroCostoGrupoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCentroCostoGrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCentroCostoGrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostogrupoproducto=(CentroCostoGrupoProducto) centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centrocostogrupoproducto =(CentroCostoGrupoProducto) centrocostogrupoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!centrocostogrupoproducto.getIsNew() && !centrocostogrupoproducto.getIsChanged() && !centrocostogrupoproducto.getIsDeleted()) {
				sDescripcion=centrocostogrupoproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostogrupoproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!centrocostogrupoproducto.getIsNew() && !centrocostogrupoproducto.getIsChanged() && !centrocostogrupoproducto.getIsDeleted()) {
				sDescripcion=centrocostogrupoproducto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostogrupoproducto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!centrocostogrupoproducto.getIsNew() && !centrocostogrupoproducto.getIsChanged() && !centrocostogrupoproducto.getIsDeleted()) {
				sDescripcion=centrocostogrupoproducto.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostogrupoproducto.getcentrocosto_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!centrocostogrupoproducto.getIsNew() && !centrocostogrupoproducto.getIsChanged() && !centrocostogrupoproducto.getIsDeleted()) {
				sDescripcion=centrocostogrupoproducto.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostogrupoproducto.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!centrocostogrupoproducto.getIsNew() && !centrocostogrupoproducto.getIsChanged() && !centrocostogrupoproducto.getIsDeleted()) {
				sDescripcion=centrocostogrupoproducto.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostogrupoproducto.getlineagrupo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CentroCostoGrupoProducto centrocostogrupoproductoRow=new CentroCostoGrupoProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostogrupoproductoRow=(CentroCostoGrupoProducto) centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centrocostogrupoproductoRow=(CentroCostoGrupoProducto) centrocostogrupoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto));			
			this.jButtonDuplicarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoGrupoProducto && this.isPermisoDuplicarCentroCostoGrupoProducto));			
			this.jButtonCopiarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaCopiarCentroCostoGrupoProducto && this.isPermisoCopiarCentroCostoGrupoProducto));
			this.jButtonVerFormCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaVerFormCentroCostoGrupoProducto && this.isPermisoVerFormCentroCostoGrupoProducto));
			
			this.jButtonAbrirOrderByCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto && this.isPermisoOrdenCentroCostoGrupoProducto));			
			
			this.jButtonNuevoRelacionesCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto));			
			this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaModificarCentroCostoGrupoProducto && this.isPermisoActualizarCentroCostoGrupoProducto));	
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto && this.isPermisoActualizarCentroCostoGrupoProducto));	
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto && this.isPermisoEliminarCentroCostoGrupoProducto));
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarCentroCostoGrupoProducto.setVisible(this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto);							
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto));						
			this.jButtonDuplicarToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoGrupoProducto && this.isPermisoDuplicarCentroCostoGrupoProducto));						
			this.jButtonCopiarToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaCopiarCentroCostoGrupoProducto && this.isPermisoCopiarCentroCostoGrupoProducto));			
			this.jButtonVerFormToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaVerFormCentroCostoGrupoProducto && this.isPermisoVerFormCentroCostoGrupoProducto));			
			this.jButtonAbrirOrderByToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto && this.isPermisoOrdenCentroCostoGrupoProducto));
			this.jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto));			
			this.jButtonNuevoGuardarCambiosToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));			
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaModificarCentroCostoGrupoProducto && this.isPermisoActualizarCentroCostoGrupoProducto));	
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto  && this.isPermisoActualizarCentroCostoGrupoProducto));	
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto && this.isPermisoEliminarCentroCostoGrupoProducto));
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarToolBarCentroCostoGrupoProducto.setVisible(this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto);				
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto));			
			this.jMenuItemDuplicarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoGrupoProducto && this.isPermisoDuplicarCentroCostoGrupoProducto));			
			this.jMenuItemCopiarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaCopiarCentroCostoGrupoProducto && this.isPermisoCopiarCentroCostoGrupoProducto));			
			this.jMenuItemVerFormCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaVerFormCentroCostoGrupoProducto && this.isPermisoVerFormCentroCostoGrupoProducto));			
			this.jMenuItemAbrirOrderByCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto && this.isPermisoOrdenCentroCostoGrupoProducto));			
			//this.jMenuItemMostrarOcultarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto && this.isPermisoOrdenCentroCostoGrupoProducto));
			this.jMenuItemDetalleAbrirOrderByCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto && this.isPermisoOrdenCentroCostoGrupoProducto));			
			//this.jMenuItemDetalleMostrarOcultarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto && this.isPermisoOrdenCentroCostoGrupoProducto));			
			this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto));			
			this.jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto && this.isPermisoNuevoCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));									
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemModificarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaModificarCentroCostoGrupoProducto && this.isPermisoActualizarCentroCostoGrupoProducto));	
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemActualizarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto && this.isPermisoActualizarCentroCostoGrupoProducto));	
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemEliminarCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto && this.isPermisoEliminarCentroCostoGrupoProducto));
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemCancelarCentroCostoGrupoProducto.setVisible(this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto);				
			}
			
			this.jMenuItemGuardarCambiosCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));						
			this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=this.jButtonNuevoCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaDuplicarCentroCostoGrupoProducto=this.jButtonDuplicarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaCopiarCentroCostoGrupoProducto=this.jButtonCopiarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaVerFormCentroCostoGrupoProducto=this.jButtonVerFormCentroCostoGrupoProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenCentroCostoGrupoProducto=this.jButtonAbrirOrderByCentroCostoGrupoProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=this.jButtonNuevoRelacionesCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=this.jButtonModificarCentroCostoGrupoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosCentroCostoGrupoProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=this.jButtonNuevoToolBarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=this.jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarToolBarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarToolBarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarToolBarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarToolBarCentroCostoGrupoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=this.jButtonGuardarCambiosToolBarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=this.jButtonGuardarCambiosTablaToolBarCentroCostoGrupoProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=this.jMenuItemNuevoCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemModificarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemActualizarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemEliminarCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemCancelarCentroCostoGrupoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=this.jMenuItemGuardarCambiosCentroCostoGrupoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCentroCostoGrupoProducto(Boolean esInicializar) {
		if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCentroCostoGrupoProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualCentroCostoGrupoProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCentroCostoGrupoProducto() {
		this.jButtonNuevoCentroCostoGrupoProducto.setVisible(this.isPermisoNuevoCentroCostoGrupoProducto);			
		this.jButtonDuplicarCentroCostoGrupoProducto.setVisible(this.isPermisoDuplicarCentroCostoGrupoProducto);			
		this.jButtonCopiarCentroCostoGrupoProducto.setVisible(this.isPermisoCopiarCentroCostoGrupoProducto);			
		this.jButtonVerFormCentroCostoGrupoProducto.setVisible(this.isPermisoVerFormCentroCostoGrupoProducto);			
		
		this.jButtonAbrirOrderByCentroCostoGrupoProducto.setVisible(this.isPermisoOrdenCentroCostoGrupoProducto);					
		
		this.jButtonNuevoRelacionesCentroCostoGrupoProducto.setVisible(this.isPermisoNuevoCentroCostoGrupoProducto);			
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarCentroCostoGrupoProducto.setVisible(this.isPermisoActualizarCentroCostoGrupoProducto);	
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarCentroCostoGrupoProducto.setVisible(this.isPermisoActualizarCentroCostoGrupoProducto);	
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarCentroCostoGrupoProducto.setVisible(this.isPermisoEliminarCentroCostoGrupoProducto);
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarCentroCostoGrupoProducto.setVisible(this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto);						
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosCentroCostoGrupoProducto.setVisible(this.isPermisoGuardarCambiosCentroCostoGrupoProducto);							
		}
		
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.setVisible(this.isPermisoActualizarCentroCostoGrupoProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroCostoGrupoProducto() {
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarCentroCostoGrupoProducto.setVisible(this.isPermisoActualizarCentroCostoGrupoProducto);	
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarCentroCostoGrupoProducto.setVisible(this.isPermisoActualizarCentroCostoGrupoProducto);	
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarCentroCostoGrupoProducto.setVisible(this.isPermisoEliminarCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarCentroCostoGrupoProducto.setVisible(this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto);							
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosCentroCostoGrupoProducto.setVisible((this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto && this.isPermisoGuardarCambiosCentroCostoGrupoProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCentroCostoGrupoProducto() {
		if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCentroCostoGrupoProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCentroCostoGrupoProducto() {
	}
	
	public void jTableDatosCentroCostoGrupoProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCentroCostoGrupoProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCentroCostoGrupoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostogrupoproducto==null) {
						this.centrocostogrupoproducto = new CentroCostoGrupoProducto();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				}

				if(this.centrocostogrupoproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.centrocostogrupoproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCentroCostoGrupoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCentroCostoGrupoProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoGrupoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.centrocostogrupoproductoLogic.getConnexion());

				if(this.centrocostogrupoproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.centrocostogrupoproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCentroCostoGrupoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostogrupoproducto==null) {
						this.centrocostogrupoproducto = new CentroCostoGrupoProducto();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				}

				if(this.centrocostogrupoproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.centrocostogrupoproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCentroCostoGrupoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCentroCostoGrupoProducto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoGrupoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.centrocostogrupoproductoLogic.getConnexion());

				if(this.centrocostogrupoproducto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.centrocostogrupoproducto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCentroCostoGrupoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostogrupoproducto==null) {
						this.centrocostogrupoproducto = new CentroCostoGrupoProducto();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				}

				if(this.centrocostogrupoproducto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.centrocostogrupoproducto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoCentroCostoGrupoProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="CentroCosto";

			if(!this.sFinalQueryGeneral_centrocosto.equals("")) {
				this.centrocostoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_centrocosto);
				this.centrocostoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.centrocostoBeanSwingJInternalFrame.procesarBusqueda(this.centrocostoBeanSwingJInternalFrame.sAccionBusqueda);
				this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingCentroCosto(false);
			}

			if(!this.sFinalQueryComboCentroCosto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCentroCostoGrupoProducto=null;
			TitledBorder titledBordercentrocosto=null;

			if(!this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
				titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Centro Costo");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_centro_costoCentroCostoGrupoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebCentroCostoGrupoProducto(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoGrupoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.centrocostogrupoproductoLogic.getConnexion());

				if(this.centrocostogrupoproducto.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.centrocostogrupoproducto.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoCentroCostoGrupoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostogrupoproducto==null) {
						this.centrocostogrupoproducto = new CentroCostoGrupoProducto();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				}

				if(this.centrocostogrupoproducto.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.centrocostogrupoproducto.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaCentroCostoGrupoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebCentroCostoGrupoProducto(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoGrupoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.centrocostogrupoproductoLogic.getConnexion());

				if(this.centrocostogrupoproducto.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.centrocostogrupoproducto.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaCentroCostoGrupoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostogrupoproducto==null) {
						this.centrocostogrupoproducto = new CentroCostoGrupoProducto();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				}

				if(this.centrocostogrupoproducto.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.centrocostogrupoproducto.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoCentroCostoGrupoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebCentroCostoGrupoProducto(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoGrupoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoGrupoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.centrocostogrupoproductoLogic.getConnexion());

				if(this.centrocostogrupoproducto.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.centrocostogrupoproducto.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)this.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderCentroCostoGrupoProducto.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoCentroCostoGrupoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostogrupoproducto==null) {
						this.centrocostogrupoproducto = new CentroCostoGrupoProducto();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				}

				if(this.centrocostogrupoproducto.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.centrocostogrupoproducto.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCentroCostoGrupoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.getcentrocostogrupoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostogrupoproducto==null) {
						this.centrocostogrupoproducto = new CentroCostoGrupoProducto();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);
				}

				if(this.centrocostogrupoproducto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.centrocostogrupoproducto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);

			this.getCentroCostoGrupoProductosBusquedaPorIdCentroCostoPorIdLinea();

			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);

			//if(CentroCostoGrupoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCentroCostoCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);

			this.getCentroCostoGrupoProductosFK_IdCentroCosto();

			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);

			//if(CentroCostoGrupoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);

			this.getCentroCostoGrupoProductosFK_IdEmpresa();

			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);

			//if(CentroCostoGrupoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);

			this.getCentroCostoGrupoProductosFK_IdLinea();

			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);

			//if(CentroCostoGrupoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);

			this.getCentroCostoGrupoProductosFK_IdLineaGrupo();

			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);

			//if(CentroCostoGrupoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCentroCostoGrupoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);

			this.getCentroCostoGrupoProductosFK_IdSucursal();

			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);

			//if(CentroCostoGrupoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostogrupoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCentroCostoGrupoProducto() {
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.dispose();
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
			this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.dispose();
			this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto=null;
		}
		
		if(this.jInternalFrameImportacionCentroCostoGrupoProducto!=null) {
			this.jInternalFrameImportacionCentroCostoGrupoProducto.setVisible(false);	    			
			this.jInternalFrameImportacionCentroCostoGrupoProducto.dispose();
			this.jInternalFrameImportacionCentroCostoGrupoProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCentroCostoGrupoProducto();
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCentroCostoGrupoProducto")) {
				jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCentroCostoGrupoProducto")) {
				jButtonDuplicarCentroCostoGrupoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCentroCostoGrupoProducto")) {
				jButtonCopiarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCentroCostoGrupoProducto")) {
				jButtonVerFormCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCentroCostoGrupoProducto")) {
				jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCentroCostoGrupoProducto")) {
				jButtonDuplicarCentroCostoGrupoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCentroCostoGrupoProducto")) {
				jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCentroCostoGrupoProducto")) {
				jButtonDuplicarCentroCostoGrupoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCentroCostoGrupoProducto")) {
				jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCentroCostoGrupoProducto")) {
				jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCentroCostoGrupoProducto")) {
				jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCentroCostoGrupoProducto")) {
				jButtonModificarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCentroCostoGrupoProducto")) {
				jButtonModificarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCentroCostoGrupoProducto")) {
				jButtonModificarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCentroCostoGrupoProducto")) {
				jButtonActualizarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCentroCostoGrupoProducto")) {
				jButtonActualizarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCentroCostoGrupoProducto")) {
				jButtonActualizarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCentroCostoGrupoProducto")) {
				jButtonEliminarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCentroCostoGrupoProducto")) {
				jButtonEliminarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCentroCostoGrupoProducto")) {
				jButtonEliminarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCentroCostoGrupoProducto")) {
				jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCentroCostoGrupoProducto")) {
				jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCentroCostoGrupoProducto")) {
				jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCentroCostoGrupoProducto")) {
				jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCentroCostoGrupoProducto")) {
				jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCentroCostoGrupoProducto")) {
				jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCentroCostoGrupoProducto")) {
				jButtonMostrarOcultarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCentroCostoGrupoProducto")) {
				jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCentroCostoGrupoProducto")) {
				jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCentroCostoGrupoProducto")) {
				jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCentroCostoGrupoProducto")) {
				jButtonCopiarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCentroCostoGrupoProducto")) {
				jButtonVerFormCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCentroCostoGrupoProducto")) {
				jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCentroCostoGrupoProducto")) {
				jButtonCopiarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCentroCostoGrupoProducto")) {
				jButtonVerFormCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCentroCostoGrupoProducto")) {
				jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCentroCostoGrupoProducto")) {
				jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCentroCostoGrupoProducto")) {
				jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCentroCostoGrupoProducto")) {
				jButtonRecargarInformacionCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCentroCostoGrupoProducto")) {
				jButtonRecargarInformacionCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCentroCostoGrupoProducto")) {
				jButtonRecargarInformacionCentroCostoGrupoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCentroCostoGrupoProducto")) {
				jButtonAnterioresCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCentroCostoGrupoProducto")) {
				jButtonAnterioresCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCentroCostoGrupoProducto")) {
				jButtonAnterioresCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCentroCostoGrupoProducto")) {
				jButtonSiguientesCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCentroCostoGrupoProducto")) {
				jButtonSiguientesCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCentroCostoGrupoProducto")) {
				jButtonSiguientesCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCentroCostoGrupoProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByCentroCostoGrupoProducto")) {
				jButtonAbrirOrderByCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCentroCostoGrupoProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarCentroCostoGrupoProducto")) {
				jButtonMostrarOcultarCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCentroCostoGrupoProducto")) {
				jButtonNuevoGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCentroCostoGrupoProducto")) {
				jButtonNuevoGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCentroCostoGrupoProducto")) {
				jButtonNuevoGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCentroCostoGrupoProducto")) {
				jButtonCerrarReporteDinamicoCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCentroCostoGrupoProducto")) {
				jButtonGenerarReporteDinamicoCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCentroCostoGrupoProducto")) {
				
				jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCentroCostoGrupoProducto")) {
				jButtonCerrarImportacionCentroCostoGrupoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCentroCostoGrupoProducto")) {
				
				jButtonGenerarImportacionCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCentroCostoGrupoProducto")) {
				
				jButtonAbrirImportacionCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCentroCostoGrupoProducto")) {
				jComboBoxTiposAccionesCentroCostoGrupoProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCentroCostoGrupoProducto")) {
				jComboBoxTiposRelacionesCentroCostoGrupoProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCentroCostoGrupoProducto")) {
				jComboBoxTiposAccionesCentroCostoGrupoProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCentroCostoGrupoProducto")) {
				
				jComboBoxTiposSeleccionarCentroCostoGrupoProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCentroCostoGrupoProducto")) {
				jTextFieldValorCampoGeneralCentroCostoGrupoProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCentroCostoGrupoProducto")) {
				jButtonAbrirOrderByCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCentroCostoGrupoProducto")) {
				jButtonAbrirOrderByCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCentroCostoGrupoProducto")) {
				jButtonCerrarOrderByCentroCostoGrupoProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroCostoGrupoProductoBusqueda")) {
				this.jButtonidCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_empresaCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_empresaCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_sucursalCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_sucursalCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProducto")) {
				this.jButtonid_centro_costoCentroCostoGrupoProductoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProductoArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_centro_costoCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_centro_costoCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_lineaCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_lineaCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_linea_grupoCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCentroCostoGrupoProductoBusqueda")) {
				this.jButtondescripcionCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProducto")) {
				this.jButtonid_centro_costoCentroCostoGrupoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProducto")) {
				this.jButtonid_centro_costoCentroCostoGrupoProductoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto")) {
				this.jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCentroCostoCentroCostoGrupoProducto")) {
				this.jButtonFK_IdCentroCostoCentroCostoGrupoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaCentroCostoGrupoProducto")) {
				this.jButtonFK_IdLineaCentroCostoGrupoProductoActionPerformed(evt);
			}
			
			;
			
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCentroCostoGrupoProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				


				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CentroCostoGrupoProducto centrocostogrupoproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				centrocostogrupoproductoLocal=this.centrocostogrupoproducto;
			} else {
				centrocostogrupoproductoLocal=this.centrocostogrupoproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
							
				
				


				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
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
			
			


			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
								
						
				


				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
								
				
				


				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
							
				
				


				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
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
			
			


			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
								
				
				


				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCentroCostoGrupoProducto")) {
					jCheckBoxSeleccionarTodosCentroCostoGrupoProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCentroCostoGrupoProducto")) {
					jCheckBoxSeleccionadosCentroCostoGrupoProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCentroCostoGrupoProducto")) {
					
				}
				
				


				
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
												
				
				


				
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
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
			
			


			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostogrupoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostogrupoproducto);
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
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
				
				


				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoGrupoProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoGrupoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoGrupoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostogrupoproductoAnterior =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCentroCostoGrupoProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCentroCostoGrupoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCentroCostoGrupoProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.centrocostogrupoproducto =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.centrocostogrupoproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCentroCostoGrupoProducto")) {
				
				}
				
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCentroCostoGrupoProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCentroCostoGrupoProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCentroCostoGrupoProducto")) {
			
			}
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCentroCostoGrupoProducto();
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
			if(sTipo.equals("NuevoCentroCostoGrupoProducto")) {
				jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCentroCostoGrupoProducto")) {
				jButtonDuplicarCentroCostoGrupoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCentroCostoGrupoProducto")) {
				jButtonCopiarCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCentroCostoGrupoProducto")) {
				jButtonVerFormCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCentroCostoGrupoProducto")) {
				jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCentroCostoGrupoProducto")) {
				jButtonModificarCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCentroCostoGrupoProducto")) {
				jButtonActualizarCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCentroCostoGrupoProducto")) {
				jButtonEliminarCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCentroCostoGrupoProducto")) {
				jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCentroCostoGrupoProducto")) {
				jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCentroCostoGrupoProducto")) {
				jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCentroCostoGrupoProducto")) {
				jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCentroCostoGrupoProducto")) {
				jButtonNuevoGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCentroCostoGrupoProducto")) {
				jButtonAbrirOrderByCentroCostoGrupoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCentroCostoGrupoProducto")) {
				jButtonRecargarInformacionCentroCostoGrupoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCentroCostoGrupoProducto")) {
				jButtonAnterioresCentroCostoGrupoProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCentroCostoGrupoProducto")) {
				jButtonSiguientesCentroCostoGrupoProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroCostoGrupoProductoBusqueda")) {
				this.jButtonidCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_empresaCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_empresaCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_sucursalCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_sucursalCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProducto")) {
				this.jButtonid_centro_costoCentroCostoGrupoProductoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProductoArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_centro_costoCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_centro_costoCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_lineaCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_lineaCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoCentroCostoGrupoProductoUpdate")) {
				this.jButtonid_linea_grupoCentroCostoGrupoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoCentroCostoGrupoProductoBusqueda")) {
				this.jButtonid_linea_grupoCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCentroCostoGrupoProductoBusqueda")) {
				this.jButtondescripcionCentroCostoGrupoProductoBusquedaActionPerformed(evt);
			}
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCentroCostoGrupoProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCentroCostoGrupoProducto")) {
				closingInternalFrameCentroCostoGrupoProducto();
				
			} else if(sTipo.equals("jButtonCancelarCentroCostoGrupoProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormCentroCostoGrupoProducto = (JInternalFrameBase)evt.getSource();
	            	
	            CentroCostoGrupoProductoBeanSwingJInternalFrame jInternalFrameParent=(CentroCostoGrupoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroCostoGrupoProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCentroCostoGrupoProductoActionPerformed(null);
			}
			
			CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centrocostogrupoproducto,new Object(),this.centrocostogrupoproductoParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCentroCostoGrupoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCentroCostoGrupoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCentroCostoGrupoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.centrocostogrupoproducto)) {
			if(!esControlTabla) {
				if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);			
				}
				
				if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centrocostogrupoproductoReturnGeneral=centrocostogrupoproductoLogic.procesarEventosCentroCostoGrupoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this.centrocostogrupoproducto,this.centrocostogrupoproductoParameterGeneral,this.isEsNuevoCentroCostoGrupoProducto,classes);//this.centrocostogrupoproductoLogic.getCentroCostoGrupoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral,this.centrocostogrupoproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCentroCostoGrupoProducto(classes,this.centrocostogrupoproductoReturnGeneral,this.centrocostogrupoproductoBean,false);
					}
						
					if(this.centrocostogrupoproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto());	
					}
						
					if(this.centrocostogrupoproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto(),classes);//this.centrocostogrupoproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCentroCostoGrupoProducto(this.centrocostogrupoproducto,classes);//this.centrocostogrupoproductoBean);									
				}
			
				if(CentroCostoGrupoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCentroCostoGrupoProducto(this.centrocostogrupoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoGrupoProducto(this.centrocostogrupoproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.centrocostogrupoproductoAnterior!=null) {
						this.centrocostogrupoproducto=this.centrocostogrupoproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centrocostogrupoproductoReturnGeneral=centrocostogrupoproductoLogic.procesarEventosCentroCostoGrupoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this.centrocostogrupoproducto,this.centrocostogrupoproductoParameterGeneral,this.isEsNuevoCentroCostoGrupoProducto,classes);//this.centrocostogrupoproductoLogic.getCentroCostoGrupoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centrocostogrupoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto(),centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto(),this.centrocostogrupoproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCentroCostoGrupoProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosCentroCostoGrupoProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCentroCostoGrupoProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosCentroCostoGrupoProducto() throws Exception {
		
		CentroCostoGrupoProductoModel centrocostogrupoproductoModel=(CentroCostoGrupoProductoModel)this.jTableDatosCentroCostoGrupoProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostogrupoproductoModel.centrocostogrupoproductos=this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			centrocostogrupoproductoModel.centrocostogrupoproductos=this.centrocostogrupoproductos;
		}
		
		
		((CentroCostoGrupoProductoModel) this.jTableDatosCentroCostoGrupoProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCentroCostoGrupoProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcentrocostogrupoproductoAnterior(),this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcentrocostogrupoproductoAnterior(),this.centrocostogrupoproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCentroCostoGrupoProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
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
										
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostogrupoproducto,new Object(),generalEntityParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CentroCostoGrupoProductoConstantesFunciones.getClassesRelationshipsOfCentroCostoGrupoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CentroCostoGrupoProductoConstantesFunciones.getClassesRelationshipsFromStringsOfCentroCostoGrupoProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCentroCostoGrupoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostogrupoproducto,new Object(),generalEntityParameterGeneral,this.centrocostogrupoproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCentroCostoGrupoProducto(CentroCostoGrupoProductoBean centrocostogrupoproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCentroCostoGrupoProducto(ArrayList<Classe> classes,CentroCostoGrupoProductoReturnGeneral centrocostogrupoproductoReturnGeneral,CentroCostoGrupoProductoBean centrocostogrupoproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.centrocostogrupoproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto = new CentroCostoGrupoProductoDetalleFormJInternalFrame(jDesktopPane,this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones(),this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setVisible(false);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.centrocostogrupoproductoLogic=this.centrocostogrupoproductoLogic;
		
		this.cargarCombosFrameForeignKeyCentroCostoGrupoProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroCostoGrupoProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroCostoGrupoProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCentroCostoGrupoProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCentroCostoGrupoProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroCostoGrupoProducto"));
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"ModificarCentroCostoGrupoProducto"));

		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarToolBarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroCostoGrupoProducto"));
					
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemModificarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroCostoGrupoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"ActualizarCentroCostoGrupoProducto"));
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarToolBarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroCostoGrupoProducto"));
						
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemActualizarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroCostoGrupoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"EliminarCentroCostoGrupoProducto"));
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroCostoGrupoProducto"));
								
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemEliminarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroCostoGrupoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"CancelarCentroCostoGrupoProducto"));
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroCostoGrupoProducto"));
					
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemCancelarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroCostoGrupoProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemDetalleCerrarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroCostoGrupoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoGrupoProducto"));
		
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoGrupoProducto"));
		
		
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroCostoGrupoProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonidCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_empresaCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_empresaCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_sucursalCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoGrupoProductoBusqueda"));
		//jButtonid_centro_costoCentroCostoGrupoProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoGrupoProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProducto"));
		//jButtonid_centro_costoCentroCostoGrupoProductoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_lineaCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_lineaCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_lineaCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoCentroCostoGrupoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtondescripcionCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCentroCostoGrupoProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroCostoGrupoProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCentroCostoGrupoProducto"));
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroCostoGrupoProducto"));
		}
		
		this.jTableDatosCentroCostoGrupoProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCentroCostoGrupoProducto"));
		
		this.jTableDatosCentroCostoGrupoProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCentroCostoGrupoProducto"));
		
		this.jButtonNuevoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"NuevoCentroCostoGrupoProducto"));
		
		this.jButtonDuplicarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"DuplicarCentroCostoGrupoProducto"));
		
		this.jButtonCopiarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"CopiarCentroCostoGrupoProducto"));
		
		this.jButtonVerFormCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"VerFormCentroCostoGrupoProducto"));
		
		
		this.jButtonNuevoToolBarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarCentroCostoGrupoProducto"));
			
		this.jButtonDuplicarToolBarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCentroCostoGrupoProducto"));
			
		this.jMenuItemNuevoCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCentroCostoGrupoProducto"));
			
		this.jMenuItemDuplicarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCentroCostoGrupoProducto"));		
		
		
		this.jButtonNuevoRelacionesCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCentroCostoGrupoProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCentroCostoGrupoProducto"));
			
		this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCentroCostoGrupoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"ModificarCentroCostoGrupoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonModificarToolBarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroCostoGrupoProducto"));
			
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemModificarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroCostoGrupoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"ActualizarCentroCostoGrupoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonActualizarToolBarCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroCostoGrupoProducto"));
				
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemActualizarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroCostoGrupoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"EliminarCentroCostoGrupoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonEliminarToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroCostoGrupoProducto"));
						
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemEliminarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroCostoGrupoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"CancelarCentroCostoGrupoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonCancelarToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroCostoGrupoProducto"));
			
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemCancelarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroCostoGrupoProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCentroCostoGrupoProducto"));		
		
		
		this.jButtonCerrarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"CerrarCentroCostoGrupoProducto"));
		
		
		this.jButtonCerrarToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarCentroCostoGrupoProducto"));
			
		this.jMenuItemCerrarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCentroCostoGrupoProducto"));
			
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jMenuItemDetalleCerrarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroCostoGrupoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosCentroCostoGrupoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoGrupoProducto"));
		}
		
		this.jButtonCopiarToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarCentroCostoGrupoProducto"));
			
		this.jButtonVerFormToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarCentroCostoGrupoProducto"));
		
		this.jMenuItemGuardarCambiosCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCentroCostoGrupoProducto"));
			
		this.jMenuItemCopiarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCentroCostoGrupoProducto"));		
		
		this.jMenuItemVerFormCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCentroCostoGrupoProducto"));		
		
		
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroCostoGrupoProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCentroCostoGrupoProducto"));
			
		this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroCostoGrupoProducto"));		
		
		
		
		this.jButtonRecargarInformacionCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionCentroCostoGrupoProducto"));
					
		this.jButtonRecargarInformacionToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCentroCostoGrupoProducto"));
		
		this.jMenuItemRecargarInformacionCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCentroCostoGrupoProducto"));		
		
		
		
		this.jButtonAnterioresCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"AnterioresCentroCostoGrupoProducto"));
		
		
		this.jButtonAnterioresToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCentroCostoGrupoProducto"));
		
		this.jMenuItemAnterioresCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCentroCostoGrupoProducto"));		
		
		
		this.jButtonSiguientesCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"SiguientesCentroCostoGrupoProducto"));
		
		
		this.jButtonSiguientesToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCentroCostoGrupoProducto"));
			
		this.jMenuItemSiguientesCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCentroCostoGrupoProducto"));
			
		this.jMenuItemAbrirOrderByCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCentroCostoGrupoProducto"));
			
		this.jMenuItemMostrarOcultarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCentroCostoGrupoProducto"));
			
		this.jMenuItemDetalleAbrirOrderByCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCentroCostoGrupoProducto"));
			
		this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCentroCostoGrupoProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCentroCostoGrupoProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCentroCostoGrupoProducto"));
			
		this.jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCentroCostoGrupoProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCentroCostoGrupoProducto"));

		this.jCheckBoxSeleccionadosCentroCostoGrupoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCentroCostoGrupoProducto"));
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroCostoGrupoProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesCentroCostoGrupoProducto"));
			
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesCentroCostoGrupoProducto"));
					
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCentroCostoGrupoProducto"));
			
		this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCentroCostoGrupoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonidCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_empresaCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_empresaCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_sucursalCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoGrupoProductoBusqueda"));
		//jButtonid_centro_costoCentroCostoGrupoProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoGrupoProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProducto"));
		//jButtonid_centro_costoCentroCostoGrupoProductoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_lineaCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_lineaCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_lineaCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoCentroCostoGrupoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtondescripcionCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCentroCostoGrupoProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto"));

			this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProducto"));

			this.jButtonFK_IdCentroCostoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoCentroCostoGrupoProducto"));

			this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProducto"));

			this.jButtonFK_IdLineaCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"FK_IdLineaCentroCostoGrupoProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoGrupoProducto"));
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoGrupoProducto"));
				this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoGrupoProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoGrupoProducto"));				
			//this.jButtonGenerarReporteDinamicoCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoGrupoProducto"));
			//this.jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoGrupoProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCentroCostoGrupoProducto!=null) {
				this.jInternalFrameImportacionCentroCostoGrupoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroCostoGrupoProducto"));
				this.jInternalFrameImportacionCentroCostoGrupoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroCostoGrupoProducto"));
				this.jInternalFrameImportacionCentroCostoGrupoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroCostoGrupoProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByCentroCostoGrupoProducto"));
			
			this.jButtonAbrirOrderByToolBarCentroCostoGrupoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCentroCostoGrupoProducto"));			
			
			if(this.jInternalFrameOrderByCentroCostoGrupoProducto!=null) {
				this.jInternalFrameOrderByCentroCostoGrupoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroCostoGrupoProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTabbedPaneRelacionesCentroCostoGrupoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroCostoGrupoProducto"));
		
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
            		closingInternalFrameCentroCostoGrupoProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCentroCostoGrupoProducto = (JInternalFrameBase)event.getSource();
	            	
	            CentroCostoGrupoProductoBeanSwingJInternalFrame jInternalFrameParent=(CentroCostoGrupoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroCostoGrupoProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCentroCostoGrupoProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCentroCostoGrupoProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCentroCostoGrupoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCentroCostoGrupoProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCentroCostoGrupoProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCentroCostoGrupoProducto";
		inputMap = this.jButtonNuevoCentroCostoGrupoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCentroCostoGrupoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCentroCostoGrupoProducto";
		inputMap = this.jButtonNuevoRelacionesCentroCostoGrupoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCentroCostoGrupoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroCostoGrupoProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCentroCostoGrupoProducto";
		inputMap = this.jButtonModificarCentroCostoGrupoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCentroCostoGrupoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCentroCostoGrupoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCentroCostoGrupoProducto";
		inputMap = this.jButtonActualizarCentroCostoGrupoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCentroCostoGrupoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCentroCostoGrupoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCentroCostoGrupoProducto";
		inputMap = this.jButtonEliminarCentroCostoGrupoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCentroCostoGrupoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCentroCostoGrupoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCentroCostoGrupoProducto";
		inputMap = this.jButtonCancelarCentroCostoGrupoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCentroCostoGrupoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCentroCostoGrupoProducto";
		inputMap = this.jButtonCerrarCentroCostoGrupoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCentroCostoGrupoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCentroCostoGrupoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCentroCostoGrupoProducto";
		inputMap = this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosCentroCostoGrupoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonGuardarCambiosCentroCostoGrupoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCentroCostoGrupoProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCentroCostoGrupoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCentroCostoGrupoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCentroCostoGrupoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonidCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_empresaCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_empresaCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_sucursalCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_sucursalCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoGrupoProductoBusqueda"));
		//jButtonid_centro_costoCentroCostoGrupoProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoGrupoProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProducto"));
		//jButtonid_centro_costoCentroCostoGrupoProductoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_lineaCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_lineaCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_lineaCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaCentroCostoGrupoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_linea_grupoCentroCostoGrupoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoCentroCostoGrupoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_linea_grupoCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoCentroCostoGrupoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtondescripcionCentroCostoGrupoProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCentroCostoGrupoProductoBusqueda"));
		
		
		this.jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto"));

		this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProducto"));

		this.jButtonFK_IdCentroCostoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoCentroCostoGrupoProducto"));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoGrupoProducto"));

		this.jButtonFK_IdLineaCentroCostoGrupoProducto.addActionListener(new ButtonActionListener(this,"FK_IdLineaCentroCostoGrupoProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCentroCostoGrupoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCentroCostoGrupoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCentroCostoGrupoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCentroCostoGrupoProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
					centrocostogrupoproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductos) {
					centrocostogrupoproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCentroCostoGrupoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
						centrocostogrupoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductos) {
						centrocostogrupoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroCostoGrupoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroCostoGrupoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCentroCostoGrupoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCentroCostoGrupoProducto.getSelectedRows();
			
			CentroCostoGrupoProducto centrocostogrupoproductoLocal=new CentroCostoGrupoProducto();
			
			//this.seleccionarTodosCentroCostoGrupoProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostogrupoproductoLocal =(CentroCostoGrupoProducto) this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					centrocostogrupoproductoLocal =(CentroCostoGrupoProducto) this.centrocostogrupoproductos.toArray()[this.jTableDatosCentroCostoGrupoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				centrocostogrupoproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
						centrocostogrupoproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductos) {
						centrocostogrupoproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroCostoGrupoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroCostoGrupoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoGrupoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCentroCostoGrupoProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCentroCostoGrupoProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCentroCostoGrupoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
				
						if(sTipoSeleccionar.equals(CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							centrocostogrupoproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductos) {
					
						if(sTipoSeleccionar.equals(CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							centrocostogrupoproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCentroCostoGrupoProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCentroCostoGrupoProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCentroCostoGrupoProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCentroCostoGrupoProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessCentroCostoGrupoProducto(conSplash);
				
					this.generarReporteCentroCostoGrupoProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCentroCostoGrupoProductosSeleccionados();
				//this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroCostoGrupoProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroCostoGrupoProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroCostoGrupoProducto();
				
				this.exportarCentroCostoGrupoProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCentroCostoGrupoProductos();
				//this.importarCentroCostoGrupoProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroCostoGrupoProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCentroCostoGrupoProductosSeleccionados();
				//this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Centro Costo Grupo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCentroCostoGrupoProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCentroCostoGrupoProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCentroCostoGrupoProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(CentroCostoGrupoProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCentroCostoGrupoProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCentroCostoGrupoProducto(conSplash);
					
						//this.actualizarParametrosGeneralCentroCostoGrupoProducto();
						
						this.generarReporteProcesoAccionCentroCostoGrupoProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Centro Costo Grupo ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Centro Costo Grupo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCentroCostoGrupoProducto();
				
						this.actualizarParametrosGeneralCentroCostoGrupoProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.centrocostogrupoproductoReturnGeneral=centrocostogrupoproductoLogic.procesarAccionCentroCostoGrupoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this.centrocostogrupoproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCentroCostoGrupoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCentroCostoGrupoProducto();
					
					CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCentroCostoGrupoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxTiposAccionesFormularioCentroCostoGrupoProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCentroCostoGrupoProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCentroCostoGrupoProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCentroCostoGrupoProducto();
			
			if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		
			CentroCostoGrupoProducto centrocostogrupoproducto=new CentroCostoGrupoProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.getSelectedItem();
			
			
			
			
			centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(centrocostogrupoproductosSeleccionados.size()==1) {
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductosSeleccionados) {
					centrocostogrupoproducto=centrocostogrupoproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCentroCostoGrupoProducto();
			
      		//this.finishProcessCentroCostoGrupoProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCentroCostoGrupoProductoReturnGeneral() throws Exception {
		if(this.centrocostogrupoproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.centrocostogrupoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.centrocostogrupoproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.centrocostogrupoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.centrocostogrupoproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.centrocostogrupoproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
		}
		
		if(this.centrocostogrupoproductoReturnGeneral.getConRetornoLista() || this.centrocostogrupoproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.centrocostogrupoproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.centrocostogrupoproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centrocostogrupoproductoLogic.setCentroCostoGrupoProducto(this.centrocostogrupoproductoReturnGeneral.getCentroCostoGrupoProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCentroCostoGrupoProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralCentroCostoGrupoProducto() throws Exception {
		
		
	}
	
	public ArrayList<CentroCostoGrupoProducto> getCentroCostoGrupoProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCentroCostoGrupoProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductoLogic.getCentroCostoGrupoProductos()) {
					if(centrocostogrupoproductoAux.getIsSelected()) {
						centrocostogrupoproductosSeleccionados.add(centrocostogrupoproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoGrupoProducto centrocostogrupoproductoAux:this.centrocostogrupoproductos) {
					if(centrocostogrupoproductoAux.getIsSelected()) {
						centrocostogrupoproductosSeleccionados.add(centrocostogrupoproductoAux);				
					}
				}
			}
			
			if(centrocostogrupoproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						centrocostogrupoproductosSeleccionados.addAll(this.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						centrocostogrupoproductosSeleccionados.addAll(this.centrocostogrupoproductos);				
					}
				}
			}
		} else {
			centrocostogrupoproductosSeleccionados.add(this.centrocostogrupoproducto);
		}
		
		return centrocostogrupoproductosSeleccionados;
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
	
	public void generarReporteCentroCostoGrupoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCentroCostoGrupoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCentroCostoGrupoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroCostoGrupoProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroCostoGrupoProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Centro Costo Grupo Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCentroCostoGrupoProductosSeleccionados() throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCentroCostoGrupoProductos("Todos",centrocostogrupoproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalCentroCostoGrupoProductosSeleccionados() throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCentroCostoGrupoProductos("Todos",centrocostogrupoproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCentroCostoGrupoProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCentroCostoGrupoProductos("Todos",centrocostogrupoproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCentroCostoGrupoProductosSeleccionados() throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCentroCostoGrupoProducto();
		
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCentroCostoGrupoProducto();
		
		
		//this.generarReporteCentroCostoGrupoProductos("Todos",centrocostogrupoproductosSeleccionados ,centrocostogrupoproductoImplementable,centrocostogrupoproductoImplementableHome);
	}
	
	public void mostrarImportacionCentroCostoGrupoProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCentroCostoGrupoProducto();
		
		this.abrirFrameImportacionCentroCostoGrupoProducto();		
		
			
		//this.generarReporteCentroCostoGrupoProductos("Todos",centrocostogrupoproductosSeleccionados ,centrocostogrupoproductoImplementable,centrocostogrupoproductoImplementableHome);
	}
	
	public void importarCentroCostoGrupoProductos() throws Exception {		
	
	}
	
	public void exportarCentroCostoGrupoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCentroCostoGrupoProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCentroCostoGrupoProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCentroCostoGrupoProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Centro Costo Grupo Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCentroCostoGrupoProductosSeleccionados() throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostogrupoproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCentroCostoGrupoProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCentroCostoGrupoProducto(centrocostogrupoproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//centrocostogrupoproductoAux.setsDetalleGeneralEntityReporte(centrocostogrupoproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCentroCostoGrupoProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CentroCostoGrupoProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoGrupoProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=centrocostogrupoproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostogrupoproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostogrupoproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostogrupoproducto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostogrupoproducto.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostogrupoproducto.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostogrupoproducto.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostogrupoproducto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCentroCostoGrupoProductosSeleccionados() throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostogrupoproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CentroCostoGrupoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCentroCostoGrupoProducto(row);				
				iRow++;
			}				
			
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCentroCostoGrupoProducto(centrocostogrupoproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCentroCostoGrupoProductosSeleccionados() throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();		
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostogrupoproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("centrocostogrupoproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("centrocostogrupoproducto");
			//elementRoot.appendChild(element);
		
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductosSeleccionados) {
				element = document.createElement("centrocostogrupoproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCentroCostoGrupoProducto(centrocostogrupoproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Grupo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCentroCostoGrupoProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostogrupoproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostogrupoproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostogrupoproducto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostogrupoproducto.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostogrupoproducto.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostogrupoproducto.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostogrupoproducto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlCentroCostoGrupoProducto(CentroCostoGrupoProducto centrocostogrupoproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CentroCostoGrupoProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(centrocostogrupoproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CentroCostoGrupoProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(centrocostogrupoproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CentroCostoGrupoProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(centrocostogrupoproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CentroCostoGrupoProductoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(centrocostogrupoproducto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(CentroCostoGrupoProductoConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(centrocostogrupoproducto.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementlinea_descripcion = document.createElement(CentroCostoGrupoProductoConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(centrocostogrupoproducto.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(CentroCostoGrupoProductoConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(centrocostogrupoproducto.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementdescripcion = document.createElement(CentroCostoGrupoProductoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(centrocostogrupoproducto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoCentroCostoGrupoProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados=new ArrayList<CentroCostoGrupoProducto>();
		
		centrocostogrupoproductosSeleccionados=this.getCentroCostoGrupoProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCentroCostoGrupoProducto(centrocostogrupoproductosSeleccionados);
		
		this.generarReporteCentroCostoGrupoProductos("Todos",centrocostogrupoproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCentroCostoGrupoProducto(ArrayList<CentroCostoGrupoProducto> centrocostogrupoproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CentroCostoGrupoProducto centrocostogrupoproductoAux:centrocostogrupoproductosSeleccionados) {
				centrocostogrupoproductoAux.setsDetalleGeneralEntityReporte(centrocostogrupoproductoAux.toString());
			
				if(sTipoSeleccionar.equals(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					centrocostogrupoproductoAux.setsDescripcionGeneralEntityReporte1(centrocostogrupoproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					centrocostogrupoproductoAux.setsDescripcionGeneralEntityReporte1(centrocostogrupoproductoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					centrocostogrupoproductoAux.setsDescripcionGeneralEntityReporte1(centrocostogrupoproductoAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					centrocostogrupoproductoAux.setsDescripcionGeneralEntityReporte1(centrocostogrupoproductoAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoGrupoProductoConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					centrocostogrupoproductoAux.setsDescripcionGeneralEntityReporte1(centrocostogrupoproductoAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoGrupoProductoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					centrocostogrupoproductoAux.setsDescripcionGeneralEntityReporte1(centrocostogrupoproductoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoGrupoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCentroCostoGrupoProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=true;
				this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=true;
			}
			
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaModificarCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaCancelarCentroCostoGrupoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoGrupoProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=true;
		} else {
			this.actualizarEstadoPanelsCentroCostoGrupoProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCentroCostoGrupoProducto=false;
			//this.isVisibilidadCeldaVerFormCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaDuplicarCentroCostoGrupoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoGrupoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!centrocostogrupoproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;												
			}
			
			this.jButtonCerrarCentroCostoGrupoProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoGrupoProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.centrocostogrupoproducto)) {
			this.isVisibilidadCeldaActualizarCentroCostoGrupoProducto=false;
			this.isVisibilidadCeldaEliminarCentroCostoGrupoProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCentroCostoGrupoProducto() {
	}
	
	public void actualizarEstadoPanelsCentroCostoGrupoProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosCentroCostoGrupoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoGrupoProducto!=null) {
				this.jPanelPaginacionCentroCostoGrupoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosCentroCostoGrupoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoGrupoProducto!=null) {
				this.jPanelPaginacionCentroCostoGrupoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosCentroCostoGrupoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoGrupoProducto!=null) {
				this.jPanelPaginacionCentroCostoGrupoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosCentroCostoGrupoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoGrupoProducto!=null) {
				this.jPanelPaginacionCentroCostoGrupoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosCentroCostoGrupoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoGrupoProducto!=null) {
				this.jPanelPaginacionCentroCostoGrupoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosCentroCostoGrupoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoGrupoProducto!=null) {
				this.jPanelPaginacionCentroCostoGrupoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosEdicionCentroCostoGrupoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoGrupoProducto!=null) {
				this.jScrollPanelDatosCentroCostoGrupoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoGrupoProducto!=null) {
				this.jPanelPaginacionCentroCostoGrupoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
					this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto!=null) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCentroCostoGrupoProducto!=null) {
				this.jPanelParametrosReportesCentroCostoGrupoProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdCentroCostoCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdLineaCentroCostoGrupoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdCentroCosto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdCentroCostoCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdLinea=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdLineaCentroCostoGrupoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea=isParaCentroCosto;
			if(!this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdCentroCostoCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdLinea=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdLineaCentroCostoGrupoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea=isParaLinea;
			if(!this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdCentroCosto=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdCentroCostoCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdLinea=isParaLinea;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdLineaCentroCostoGrupoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea=isParaLineaGrupoNegation;
			if(!this.isVisibilidadBusquedaPorIdCentroCostoPorIdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdCentroCosto=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdCentroCostoCentroCostoGrupoProducto);}

			this.isVisibilidadFK_IdLinea=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(jPanelFK_IdLineaCentroCostoGrupoProducto);}
		}
		
	}
	
	
	
	

	public String registrarSesionCentroCostoGrupoProductoParaBusquedaCentroCostos() throws Exception {
		Boolean isPaginaPopupCentroCosto=false;

		try {

			if(centrocostogrupoproductoSessionBean==null) {
				centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			}

			if(centrocostoSessionBean==null) {
				centrocostoSessionBean=new CentroCostoSessionBean();
			}

			centrocostoSessionBean.setsPathNavegacionActual(centrocostogrupoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
			centrocostoSessionBean.setisPermiteRecargarInformacion(false);
			centrocostoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCentroCosto=centrocostoSessionBean.getisPaginaPopup();
			centrocostoSessionBean.setisPaginaPopup(false);
			centrocostoSessionBean.setEstaModoBusqueda(true);
			centrocostoSessionBean.setsFuncionBusquedaRapida("window.opener.centrocostogrupoproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_centro_costo(TO_REPLACE);");
			centrocostoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCentroCosto(true);
			centrocostoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCosto(CentroCostoGrupoProductoConstantesFunciones.SNOMBREOPCION);
			//centrocostoSessionBean.setisBusquedaDesdeForeignKeySesionCentroCostoGrupoProducto(true);
			//centrocostoSessionBean.setlidCentroCostoGrupoProductoActual(this.idCentroCostoGrupoProductoActual);

			centrocostogrupoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCentroCostoGrupoProducto(true);
			centrocostogrupoproductoSessionBean.setlIdCentroCostoGrupoProductoActualForeignKey(this.idCentroCostoGrupoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CentroCostoGrupoProductoSessionBean centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
		
		if(this.centrocostogrupoproductoSessionBean==null) {
			this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
		}
		
		this.centrocostogrupoproductoSessionBean.setsUltimaBusquedaCentroCostoGrupoProducto(this.getsAccionBusqueda());
		this.centrocostogrupoproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.centrocostogrupoproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdCentroCostoPorIdLinea")) {
			centrocostogrupoproductoSessionBean.setid_centro_costo(this.getid_centro_costoBusquedaPorIdCentroCostoPorIdLinea());	
			centrocostogrupoproductoSessionBean.setid_linea(this.getid_lineaBusquedaPorIdCentroCostoPorIdLinea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			centrocostogrupoproductoSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			centrocostogrupoproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
			centrocostogrupoproductoSessionBean.setid_linea(this.getid_lineaFK_IdLinea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			centrocostogrupoproductoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CentroCostoGrupoProductoSessionBean centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
		
		if(this.centrocostogrupoproductoSessionBean==null) {
			this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
		}
		
		if(this.centrocostogrupoproductoSessionBean.getsUltimaBusquedaCentroCostoGrupoProducto()!=null&&!this.centrocostogrupoproductoSessionBean.getsUltimaBusquedaCentroCostoGrupoProducto().equals("")) {
			this.setsAccionBusqueda(centrocostogrupoproductoSessionBean.getsUltimaBusquedaCentroCostoGrupoProducto());
			this.setiNumeroPaginacion(centrocostogrupoproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(centrocostogrupoproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdCentroCostoPorIdLinea")) {
				this.setid_centro_costoBusquedaPorIdCentroCostoPorIdLinea(centrocostogrupoproductoSessionBean.getid_centro_costo());
				centrocostogrupoproductoSessionBean.setid_centro_costo(null);
				this.setid_lineaBusquedaPorIdCentroCostoPorIdLinea(centrocostogrupoproductoSessionBean.getid_linea());
				centrocostogrupoproductoSessionBean.setid_linea(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(centrocostogrupoproductoSessionBean.getid_centro_costo());
				centrocostogrupoproductoSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(centrocostogrupoproductoSessionBean.getid_empresa());
				centrocostogrupoproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
				this.setid_lineaFK_IdLinea(centrocostogrupoproductoSessionBean.getid_linea());
				centrocostogrupoproductoSessionBean.setid_linea(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(centrocostogrupoproductoSessionBean.getid_sucursal());
				centrocostogrupoproductoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.centrocostogrupoproductoSessionBean.setsUltimaBusquedaCentroCostoGrupoProducto("");
		this.centrocostogrupoproductoSessionBean.setiNumeroPaginacion(CentroCostoGrupoProductoConstantesFunciones.INUMEROPAGINACION);
		this.centrocostogrupoproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCentroCostoGrupoProducto() {
		this.updateBorderResaltarBusquedasFormularioCentroCostoGrupoProducto();
		this.updateVisibilidadBusquedasFormularioCentroCostoGrupoProducto();
		this.updateHabilitarBusquedasFormularioCentroCostoGrupoProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioCentroCostoGrupoProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponents().length>0) {
	

		if(this.centrocostogrupoproductoConstantesFunciones.resaltarBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto!=null) {
			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
				jPanel.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
			}
		}

		if(this.centrocostogrupoproductoConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoGrupoProducto!=null) {
			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoGrupoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
				jPanel.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoGrupoProducto);
			}
		}

		if(this.centrocostogrupoproductoConstantesFunciones.resaltarFK_IdLineaCentroCostoGrupoProducto!=null) {
			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelFK_IdLineaCentroCostoGrupoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
				jPanel.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarFK_IdLineaCentroCostoGrupoProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCentroCostoGrupoProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
			if(!this.centrocostogrupoproductoConstantesFunciones.mostrarBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto && index>-1) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoGrupoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarFK_IdCentroCostoCentroCostoGrupoProducto);
			if(!this.centrocostogrupoproductoConstantesFunciones.mostrarFK_IdCentroCostoCentroCostoGrupoProducto && index>-1) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelFK_IdLineaCentroCostoGrupoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarFK_IdLineaCentroCostoGrupoProducto);
			if(!this.centrocostogrupoproductoConstantesFunciones.mostrarFK_IdLineaCentroCostoGrupoProducto && index>-1) {
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCentroCostoGrupoProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setEnabledAt(index,this.centrocostogrupoproductoConstantesFunciones.activarBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
			}

			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoGrupoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarFK_IdCentroCostoCentroCostoGrupoProducto);
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setEnabledAt(index,this.centrocostogrupoproductoConstantesFunciones.activarFK_IdCentroCostoCentroCostoGrupoProducto);
			}

			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelFK_IdLineaCentroCostoGrupoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarFK_IdLineaCentroCostoGrupoProducto);
				this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setEnabledAt(index,this.centrocostogrupoproductoConstantesFunciones.activarFK_IdLineaCentroCostoGrupoProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCentroCostoGrupoProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdCentroCostoPorIdLinea")) {
			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);

			this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);

			this.centrocostogrupoproductoConstantesFunciones.setResaltarBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto(resaltar);

			jPanel.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoGrupoProducto);

			this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);

			this.centrocostogrupoproductoConstantesFunciones.setResaltarFK_IdCentroCostoCentroCostoGrupoProducto(resaltar);

			jPanel.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoGrupoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLinea")) {
			index= this.jTabbedPaneBusquedasCentroCostoGrupoProducto.indexOfComponent(this.jPanelFK_IdLineaCentroCostoGrupoProducto);

			this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoGrupoProducto.getComponent(index);

			this.centrocostogrupoproductoConstantesFunciones.setResaltarFK_IdLineaCentroCostoGrupoProducto(resaltar);

			jPanel.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarFK_IdLineaCentroCostoGrupoProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCentroCostoGrupoProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCentroCostoGrupoProducto() throws Exception {

		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCentroCostoGrupoProducto();
		this.updateVisibilidadResaltarControlesFormularioCentroCostoGrupoProducto();
		this.updateHabilitarResaltarControlesFormularioCentroCostoGrupoProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioCentroCostoGrupoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.centrocostogrupoproductoConstantesFunciones.resaltaridCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltaridCentroCostoGrupoProducto);}
		if(this.centrocostogrupoproductoConstantesFunciones.resaltarid_empresaCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarid_empresaCentroCostoGrupoProducto);}
		if(this.centrocostogrupoproductoConstantesFunciones.resaltarid_sucursalCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarid_sucursalCentroCostoGrupoProducto);}
		if(this.centrocostogrupoproductoConstantesFunciones.resaltarid_centro_costoCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarid_centro_costoCentroCostoGrupoProducto);}
		if(this.centrocostogrupoproductoConstantesFunciones.resaltarid_lineaCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarid_lineaCentroCostoGrupoProducto);}
		if(this.centrocostogrupoproductoConstantesFunciones.resaltarid_linea_grupoCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltarid_linea_grupoCentroCostoGrupoProducto);}
		if(this.centrocostogrupoproductoConstantesFunciones.resaltardescripcionCentroCostoGrupoProducto!=null && this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTextAreadescripcionCentroCostoGrupoProducto.setBorder(this.centrocostogrupoproductoConstantesFunciones.resaltardescripcionCentroCostoGrupoProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCentroCostoGrupoProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
	
		//this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostraridCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelidCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostraridCentroCostoGrupoProducto);
		//this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_empresaCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelid_empresaCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_empresaCentroCostoGrupoProducto);
		//this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_sucursalCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelid_sucursalCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_sucursalCentroCostoGrupoProducto);
		//this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_centro_costoCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelid_centro_costoCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_centro_costoCentroCostoGrupoProducto);
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_centro_costoCentroCostoGrupoProducto);
		//this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_lineaCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelid_lineaCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_lineaCentroCostoGrupoProducto);
		//this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_linea_grupoCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPanelid_linea_grupoCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrarid_linea_grupoCentroCostoGrupoProducto);
		//this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTextAreadescripcionCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrardescripcionCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jPaneldescripcionCentroCostoGrupoProducto.setVisible(this.centrocostogrupoproductoConstantesFunciones.mostrardescripcionCentroCostoGrupoProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCentroCostoGrupoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoGrupoProducto!=null) {
	
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jLabelidCentroCostoGrupoProducto.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activaridCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_empresaCentroCostoGrupoProducto.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarid_empresaCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_sucursalCentroCostoGrupoProducto.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarid_sucursalCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_centro_costoCentroCostoGrupoProducto.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarid_centro_costoCentroCostoGrupoProducto);
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jButtonid_centro_costoCentroCostoGrupoProducto.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarid_centro_costoCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_lineaCentroCostoGrupoProducto.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarid_lineaCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jComboBoxid_linea_grupoCentroCostoGrupoProducto.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activarid_linea_grupoCentroCostoGrupoProducto);
		this.jInternalFrameDetalleFormCentroCostoGrupoProducto.jTextAreadescripcionCentroCostoGrupoProducto.setEnabled(this.centrocostogrupoproductoConstantesFunciones.activardescripcionCentroCostoGrupoProducto);
		}
	}
	
		
}