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

import com.bydan.erp.inventario.util.CostoConstantesFunciones;
import com.bydan.erp.inventario.util.CostoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.CostoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.CostoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CostoBeanSwingJInternalFrame extends CostoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CostoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Costo> costoValidator = new ClassValidator<Costo>(Costo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Costo costo;	
	public Costo costoAux;
	public Costo costoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Costo costoTotales;
	public Long idCostoActual;
	public Long iIdNuevoCosto=0L;
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

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboDetalleMovimientoInventario="";

	public List<DetalleMovimientoInventario> detallemovimientoinventariosForeignKey;

	public List<DetalleMovimientoInventario> getdetallemovimientoinventariosForeignKey() {
		return detallemovimientoinventariosForeignKey;
	}

	public void setdetallemovimientoinventariosForeignKey(List<DetalleMovimientoInventario> detallemovimientoinventariosForeignKey) {
		this.detallemovimientoinventariosForeignKey = detallemovimientoinventariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleMovimientoInventario detallemovimientoinventarioForeignKey;

	public DetalleMovimientoInventario getdetallemovimientoinventarioForeignKey() {
		return detallemovimientoinventarioForeignKey;
	}

	public void setdetallemovimientoinventarioForeignKey(DetalleMovimientoInventario detallemovimientoinventarioForeignKey) {
		this.detallemovimientoinventarioForeignKey = detallemovimientoinventarioForeignKey;
	}

	public String sFinalQueryComboTipoCosto="";

	public List<TipoCosto> tipocostosForeignKey;

	public List<TipoCosto> gettipocostosForeignKey() {
		return tipocostosForeignKey;
	}

	public void settipocostosForeignKey(List<TipoCosto> tipocostosForeignKey) {
		this.tipocostosForeignKey = tipocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCosto tipocostoForeignKey;

	public TipoCosto gettipocostoForeignKey() {
		return tipocostoForeignKey;
	}

	public void settipocostoForeignKey(TipoCosto tipocostoForeignKey) {
		this.tipocostoForeignKey = tipocostoForeignKey;
	}

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoCosto;
	public Boolean isPermisoNuevoCosto;
	public Boolean isPermisoActualizarCosto;
	public Boolean isPermisoActualizarOriginalCosto;
	public Boolean isPermisoEliminarCosto;
	public Boolean isPermisoGuardarCambiosCosto;
	public Boolean isPermisoConsultaCosto;
	public Boolean isPermisoBusquedaCosto;
	public Boolean isPermisoReporteCosto;
	public Boolean isPermisoPaginacionMedioCosto;
	public Boolean isPermisoPaginacionAltoCosto;
	public Boolean isPermisoPaginacionTodoCosto;
	public Boolean isPermisoCopiarCosto;
	public Boolean isPermisoVerFormCosto;
	public Boolean isPermisoDuplicarCosto;
	public Boolean isPermisoOrdenCosto;
	
	
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
	
	public CostoParameterReturnGeneral costoReturnGeneral;
	public CostoParameterReturnGeneral costoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCosto=false;
	public Boolean esParaAccionDesdeFormularioCosto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CostoSessionBeanAdditional costoSessionBeanAdditional=null;
	
	public CostoSessionBeanAdditional getCostoSessionBeanAdditional() {
		return this.costoSessionBeanAdditional;
	}
	
	public void setCostoSessionBeanAdditional(CostoSessionBeanAdditional costoSessionBeanAdditional) {
		try {
			this.costoSessionBeanAdditional=costoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CostoBeanSwingJInternalFrameAdditional costoBeanSwingJInternalFrameAdditional=null;
	//public class CostoBeanSwingJInternalFrame
	
	public CostoBeanSwingJInternalFrameAdditional getCostoBeanSwingJInternalFrameAdditional() {
		return this.costoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCostoBeanSwingJInternalFrameAdditional(CostoBeanSwingJInternalFrameAdditional costoBeanSwingJInternalFrameAdditional) {
		try {
			this.costoBeanSwingJInternalFrameAdditional=costoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CostoLogic costoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Costo costoBean;
	public CostoConstantesFunciones costoConstantesFunciones;
	//public CostoParameterReturnGeneral costoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public PeriodoLogic periodoLogic;
	public EjercicioLogic ejercicioLogic;
	public DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic;
	public TipoCostoLogic tipocostoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<Costo> costos;	
	//public List<Costo> costosEliminados;
	//public List<Costo> costosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCosto=false;
	public Boolean isVisibilidadCeldaDuplicarCosto=true;
	public Boolean isVisibilidadCeldaCopiarCosto=true;
	public Boolean isVisibilidadCeldaVerFormCosto=true;
	public Boolean isVisibilidadCeldaOrdenCosto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCosto=false;
	public Boolean isVisibilidadCeldaModificarCosto=false;
	public Boolean isVisibilidadCeldaActualizarCosto=false;
	public Boolean isVisibilidadCeldaEliminarCosto=false;
	public Boolean isVisibilidadCeldaCancelarCosto=false;
	public Boolean isVisibilidadCeldaGuardarCosto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCosto=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdDetalleMovimientoInventario=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoCosto=false;
	
	public Long getiIdNuevoCosto() {
		return this.iIdNuevoCosto;
	}

	public void setiIdNuevoCosto(Long iIdNuevoCosto) {
		this.iIdNuevoCosto = iIdNuevoCosto;
	}
	
	public Long getidCostoActual() {
		return this.idCostoActual;
	}

	public void setidCostoActual(Long idCostoActual) {
		this.idCostoActual = idCostoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Costo getcosto() {
		return this.costo;
	}

	public void setcosto(Costo costo) {
		this.costo = costo;
	}
	
	public Costo getcostoAux() {
		return this.costoAux;
	}

	public void setcostoAux(Costo costoAux) {
		this.costoAux = costoAux;
	}				
	
	public Costo getcostoAnterior() {
		return this.costoAnterior;
	}

	public void setcostoAnterior(Costo costoAnterior) {
		this.costoAnterior = costoAnterior;
	}	
	
	public Costo getcostoTotales() {
		return this.costoTotales;
	}

	public void setcostoTotales(Costo costoTotales) {
		this.costoTotales = costoTotales;
	}	
	
	public Costo getcostoBean() {
		return this.costoBean;
	}

	public void setcostoBean(Costo costoBean) {
		this.costoBean = costoBean;
	}	
	
	public CostoParameterReturnGeneral getcostoReturnGeneral() {
		return this.costoReturnGeneral;
	}

	public void setcostoReturnGeneral(CostoParameterReturnGeneral costoReturnGeneral) {
		this.costoReturnGeneral = costoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario=-1L;

	public Long getid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario() {
		return this.id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario;
	}

	public void setid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario(Long id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario) {
		this.id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario = id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
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

	public Long id_tipo_costoFK_IdTipoCosto=-1L;

	public Long getid_tipo_costoFK_IdTipoCosto() {
		return this.id_tipo_costoFK_IdTipoCosto;
	}

	public void setid_tipo_costoFK_IdTipoCosto(Long id_tipo_costoFK_IdTipoCosto) {
		this.id_tipo_costoFK_IdTipoCosto = id_tipo_costoFK_IdTipoCosto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CostoLogic getCostoLogic()	{		
		return costoLogic;
	}

	public void setCostoLogic(CostoLogic costoLogic) {
		this.costoLogic = costoLogic;
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
	
	public Boolean getIsEsNuevoCosto() {
		return isEsNuevoCosto;
	}

	public void setIsEsNuevoCosto(Boolean isEsNuevoCosto) {
		this.isEsNuevoCosto = isEsNuevoCosto;
	}

	public Boolean getEsParaAccionDesdeFormularioCosto() {
		return esParaAccionDesdeFormularioCosto;
	}
	
	public void setEsParaAccionDesdeFormularioCosto(Boolean esParaAccionDesdeFormularioCosto) {
		this.esParaAccionDesdeFormularioCosto = esParaAccionDesdeFormularioCosto;
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

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(costoSessionBean.getlidEmpresaActual());
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

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(costoSessionBean.getlidSucursalActual());
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

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(costoSessionBean.getlidBodegaActual());
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

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(costoSessionBean.getlidProductoActual());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(costoSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(costoSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosDetalleMovimientoInventariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detallemovimientoinventariosForeignKey=new ArrayList<DetalleMovimientoInventario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic=new DetalleMovimientoInventarioLogic();

			//detallemovimientoinventarioLogic.getDetalleMovimientoInventarioDataAccess().setIsForForeingKeyData(true);

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallemovimientoinventarioLogic.getDetalleMovimientoInventarioDataAccess().setIsForForeingKeyData(true);

					detallemovimientoinventarioLogic.getTodosDetalleMovimientoInventariosWithConnection(sFinalQuery,new Pagination());

					this.detallemovimientoinventariosForeignKey=detallemovimientoinventarioLogic.getDetalleMovimientoInventarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleMovimientoInventario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemovimientoinventarioLogic.getEntityWithConnection(costoSessionBean.getlidDetalleMovimientoInventarioActual());
					this.detallemovimientoinventariosForeignKey.add(detallemovimientoinventarioLogic.getDetalleMovimientoInventario());
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

	public void cargarCombosTipoCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocostosForeignKey=new ArrayList<TipoCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCostoLogic tipocostoLogic=new TipoCostoLogic();

			//tipocostoLogic.getTipoCostoDataAccess().setIsForForeingKeyData(true);

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocostoLogic.getTipoCostoDataAccess().setIsForForeingKeyData(true);

					tipocostoLogic.getTodosTipoCostosWithConnection(sFinalQuery,new Pagination());

					this.tipocostosForeignKey=tipocostoLogic.getTipoCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocostoLogic.getEntityWithConnection(costoSessionBean.getlidTipoCostoActual());
					this.tipocostosForeignKey.add(tipocostoLogic.getTipoCosto());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(costoSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(costoSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.costo!=null) {
						this.costo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCosto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCostoGenerico)throws Exception
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
				jComboBoxid_empresaCostoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCostoGenerico!=null && jComboBoxid_empresaCostoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCostoGenerico.setSelectedIndex(0);
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

					if(this.costo!=null) {
						this.costo.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCosto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCostoGenerico)throws Exception
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
				jComboBoxid_sucursalCostoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCostoGenerico!=null && jComboBoxid_sucursalCostoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCostoGenerico.setSelectedIndex(0);
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

					if(this.costo!=null) {
						this.costo.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaCosto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaCosto!=null) {
						jComboBoxid_bodegaFK_IdBodegaCosto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaCosto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaCosto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaCosto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaCosto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaCostoGenerico)throws Exception
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
				jComboBoxid_bodegaCostoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaCostoGenerico!=null && jComboBoxid_bodegaCostoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaCostoGenerico.setSelectedIndex(0);
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

					if(this.costo!=null) {
						this.costo.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoCosto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoCosto!=null) {
						jComboBoxid_productoFK_IdProductoCosto.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoCosto!=null) {
							//jComboBoxid_productoFK_IdProductoCosto.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoCosto.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoCosto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoCostoGenerico)throws Exception
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
				jComboBoxid_productoCostoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoCostoGenerico!=null && jComboBoxid_productoCostoGenerico.getItemCount()>0) {
					jComboBoxid_productoCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.costo!=null) {
						this.costo.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoCosto.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoCostoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoCostoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoCostoGenerico!=null && jComboBoxid_periodoCostoGenerico.getItemCount()>0) {
					jComboBoxid_periodoCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.costo!=null) {
						this.costo.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioCosto.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioCostoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioCostoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioCostoGenerico!=null && jComboBoxid_ejercicioCostoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleMovimientoInventarioForeignKey(Long idDetalleMovimientoInventarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleMovimientoInventario  detallemovimientoinventarioTemp=null;

			for(DetalleMovimientoInventario detallemovimientoinventarioAux:detallemovimientoinventariosForeignKey) {
				if(detallemovimientoinventarioAux.getId()!=null && detallemovimientoinventarioAux.getId().equals(idDetalleMovimientoInventarioSeleccionado)) {
					detallemovimientoinventarioTemp=detallemovimientoinventarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detallemovimientoinventarioTemp!=null) {

					if(this.costo!=null) {
						this.costo.setDetalleMovimientoInventario(detallemovimientoinventarioTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setSelectedItem(detallemovimientoinventarioTemp);
					}
				} else {
					//jComboBoxid_detalle_movimiento_inventarioCosto.setSelectedItem(detallemovimientoinventarioTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleMovimientoInventario") || sFormularioTipoBusqueda.equals("Todos")){
					if(detallemovimientoinventarioTemp!=null && jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto!=null) {
						jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setSelectedItem(detallemovimientoinventarioTemp);
					} else {
						if(jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto!=null) {
							//jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setSelectedItem(detallemovimientoinventarioTemp);
							if(jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.getItemCount()>0) {
								jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setSelectedIndex(0);
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

	public String getActualDetalleMovimientoInventarioForeignKeyDescripcion(Long idDetalleMovimientoInventarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleMovimientoInventario  detallemovimientoinventarioTemp=null;

			for(DetalleMovimientoInventario detallemovimientoinventarioAux:detallemovimientoinventariosForeignKey) {
				if(detallemovimientoinventarioAux.getId()!=null && detallemovimientoinventarioAux.getId().equals(idDetalleMovimientoInventarioSeleccionado)) {
					detallemovimientoinventarioTemp=detallemovimientoinventarioAux;
					break;
				}
			}


			sDescripcion=DetalleMovimientoInventarioConstantesFunciones.getDetalleMovimientoInventarioDescripcion(detallemovimientoinventarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleMovimientoInventarioForeignKeyGenerico(Long idDetalleMovimientoInventarioSeleccionado,JComboBox jComboBoxid_detalle_movimiento_inventarioCostoGenerico)throws Exception
	{
		try
		{
			DetalleMovimientoInventario  detallemovimientoinventarioTemp=null;

			for(DetalleMovimientoInventario detallemovimientoinventarioAux:detallemovimientoinventariosForeignKey) {
				if(detallemovimientoinventarioAux.getId()!=null && detallemovimientoinventarioAux.getId().equals(idDetalleMovimientoInventarioSeleccionado)) {
					detallemovimientoinventarioTemp=detallemovimientoinventarioAux;
					break;
				}
			}

			if(detallemovimientoinventarioTemp!=null) {
				jComboBoxid_detalle_movimiento_inventarioCostoGenerico.setSelectedItem(detallemovimientoinventarioTemp);
			} else {
				if(jComboBoxid_detalle_movimiento_inventarioCostoGenerico!=null && jComboBoxid_detalle_movimiento_inventarioCostoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_movimiento_inventarioCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCostoForeignKey(Long idTipoCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCosto  tipocostoTemp=null;

			for(TipoCosto tipocostoAux:tipocostosForeignKey) {
				if(tipocostoAux.getId()!=null && tipocostoAux.getId().equals(idTipoCostoSeleccionado)) {
					tipocostoTemp=tipocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocostoTemp!=null) {

					if(this.costo!=null) {
						this.costo.setTipoCosto(tipocostoTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setSelectedItem(tipocostoTemp);
					}
				} else {
					//jComboBoxid_tipo_costoCosto.setSelectedItem(tipocostoTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocostoTemp!=null && jComboBoxid_tipo_costoFK_IdTipoCostoCosto!=null) {
						jComboBoxid_tipo_costoFK_IdTipoCostoCosto.setSelectedItem(tipocostoTemp);
					} else {
						if(jComboBoxid_tipo_costoFK_IdTipoCostoCosto!=null) {
							//jComboBoxid_tipo_costoFK_IdTipoCostoCosto.setSelectedItem(tipocostoTemp);
							if(jComboBoxid_tipo_costoFK_IdTipoCostoCosto.getItemCount()>0) {
								jComboBoxid_tipo_costoFK_IdTipoCostoCosto.setSelectedIndex(0);
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

	public String getActualTipoCostoForeignKeyDescripcion(Long idTipoCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCosto  tipocostoTemp=null;

			for(TipoCosto tipocostoAux:tipocostosForeignKey) {
				if(tipocostoAux.getId()!=null && tipocostoAux.getId().equals(idTipoCostoSeleccionado)) {
					tipocostoTemp=tipocostoAux;
					break;
				}
			}


			sDescripcion=TipoCostoConstantesFunciones.getTipoCostoDescripcion(tipocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCostoForeignKeyGenerico(Long idTipoCostoSeleccionado,JComboBox jComboBoxid_tipo_costoCostoGenerico)throws Exception
	{
		try
		{
			TipoCosto  tipocostoTemp=null;

			for(TipoCosto tipocostoAux:tipocostosForeignKey) {
				if(tipocostoAux.getId()!=null && tipocostoAux.getId().equals(idTipoCostoSeleccionado)) {
					tipocostoTemp=tipocostoAux;
					break;
				}
			}

			if(tipocostoTemp!=null) {
				jComboBoxid_tipo_costoCostoGenerico.setSelectedItem(tipocostoTemp);
			} else {
				if(jComboBoxid_tipo_costoCostoGenerico!=null && jComboBoxid_tipo_costoCostoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_costoCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.costo!=null) {
						this.costo.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioCosto.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioCostoGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioCostoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioCostoGenerico!=null && jComboBoxid_anioCostoGenerico.getItemCount()>0) {
					jComboBoxid_anioCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.costo!=null) {
						this.costo.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormCosto!=null) {
						this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesCosto.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormCosto!=null) {
						if(this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesCostoGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesCostoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesCostoGenerico!=null && jComboBoxid_mesCostoGenerico.getItemCount()>0) {
					jComboBoxid_mesCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Costo costo,JComboBox jComboBoxid_empresaCostoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCostoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCostoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				costo.setid_empresa(empresaAux.getId());
				costo.setempresa_descripcion(CostoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				costo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Costo costo,JComboBox jComboBoxid_sucursalCostoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCostoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCostoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				costo.setid_sucursal(sucursalAux.getId());
				costo.setsucursal_descripcion(CostoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				costo.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(Costo costo,JComboBox jComboBoxid_bodegaCostoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaCostoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaCostoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				costo.setid_bodega(bodegaAux.getId());
				costo.setbodega_descripcion(CostoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				costo.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(Costo costo,JComboBox jComboBoxid_productoCostoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoCostoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoCostoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				costo.setid_producto(productoAux.getId());
				costo.setproducto_descripcion(CostoConstantesFunciones.getProductoDescripcion(productoAux));
				costo.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(Costo costo,JComboBox jComboBoxid_periodoCostoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoCostoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoCostoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				costo.setid_periodo(periodoAux.getId());
				costo.setperiodo_descripcion(CostoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				costo.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(Costo costo,JComboBox jComboBoxid_ejercicioCostoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioCostoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioCostoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				costo.setid_ejercicio(ejercicioAux.getId());
				costo.setejercicio_descripcion(CostoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				costo.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleMovimientoInventarioForeignKey(Costo costo,JComboBox jComboBoxid_detalle_movimiento_inventarioCostoGenerico)throws Exception
	{
		try
		{
			DetalleMovimientoInventario  detallemovimientoinventarioAux=new DetalleMovimientoInventario();

			if(jComboBoxid_detalle_movimiento_inventarioCostoGenerico==null) {
				detallemovimientoinventarioAux=(DetalleMovimientoInventario)this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.getSelectedItem();
			} else {
				detallemovimientoinventarioAux=(DetalleMovimientoInventario)jComboBoxid_detalle_movimiento_inventarioCostoGenerico.getSelectedItem();
			}

			if(detallemovimientoinventarioAux!=null && detallemovimientoinventarioAux.getId()!=null) {
				costo.setid_detalle_movimiento_inventario(detallemovimientoinventarioAux.getId());
				costo.setdetallemovimientoinventario_descripcion(CostoConstantesFunciones.getDetalleMovimientoInventarioDescripcion(detallemovimientoinventarioAux));
				costo.setDetalleMovimientoInventario(detallemovimientoinventarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCostoForeignKey(Costo costo,JComboBox jComboBoxid_tipo_costoCostoGenerico)throws Exception
	{
		try
		{
			TipoCosto  tipocostoAux=new TipoCosto();

			if(jComboBoxid_tipo_costoCostoGenerico==null) {
				tipocostoAux=(TipoCosto)this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.getSelectedItem();
			} else {
				tipocostoAux=(TipoCosto)jComboBoxid_tipo_costoCostoGenerico.getSelectedItem();
			}

			if(tipocostoAux!=null && tipocostoAux.getId()!=null) {
				costo.setid_tipo_costo(tipocostoAux.getId());
				costo.settipocosto_descripcion(CostoConstantesFunciones.getTipoCostoDescripcion(tipocostoAux));
				costo.setTipoCosto(tipocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(Costo costo,JComboBox jComboBoxid_anioCostoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioCostoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioCostoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				costo.setid_anio(anioAux.getId());
				costo.setanio_descripcion(CostoConstantesFunciones.getAnioDescripcion(anioAux));
				costo.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(Costo costo,JComboBox jComboBoxid_mesCostoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesCostoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesCostoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				costo.setid_mes(mesAux.getId());
				costo.setmes_descripcion(CostoConstantesFunciones.getMesDescripcion(mesAux));
				costo.setMes(mesAux);			}
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

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaCosto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaCosto.addItem(bodega);
							}
						}

						if(!CostoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoCosto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoCosto.addItem(producto);
							}
						}

						if(!CostoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleMovimientoInventariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleMovimientoInventario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.removeAllItems();

							for(DetalleMovimientoInventario detallemovimientoinventario:this.detallemovimientoinventariosForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.addItem(detallemovimientoinventario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleMovimientoInventario") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.removeAllItems();

							for(DetalleMovimientoInventario detallemovimientoinventario:this.detallemovimientoinventariosForeignKey) {
								this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.addItem(detallemovimientoinventario);
							}
						}

						if(!CostoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.removeAllItems();

							for(TipoCosto tipocosto:this.tipocostosForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.addItem(tipocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_costoFK_IdTipoCostoCosto.removeAllItems();

							for(TipoCosto tipocosto:this.tipocostosForeignKey) {
								this.jComboBoxid_tipo_costoFK_IdTipoCostoCosto.addItem(tipocosto);
							}
						}

						if(!CostoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) { 
							this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCosto!=null) { 
					}

					if(!CostoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaCosto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaCosto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoCosto.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoCosto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleMovimientoInventarioForeignKey(DetalleMovimientoInventario detallemovimientoinventario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setSelectedItem(detallemovimientoinventario);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setSelectedItem(detallemovimientoinventario);
						} else {
							this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCostoForeignKey(TipoCosto tipocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setSelectedItem(tipocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_costoFK_IdTipoCostoCosto.setSelectedItem(tipocosto);
						} else {
							this.jComboBoxid_tipo_costoFK_IdTipoCostoCosto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormCosto!=null) {
							this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCosto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CostoConstantesFunciones.refrescarForeignKeysDescripcionesCosto(this.costoLogic.getCostos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CostoConstantesFunciones.refrescarForeignKeysDescripcionesCosto(this.costos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(DetalleMovimientoInventario.class));
		classes.add(new Classe(TipoCosto.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//costoLogic.setCostos(this.costos);
			costoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CostoParameterReturnGeneral getCostoParameterGeneral() {
		return this.costoParameterGeneral;
	}
	
	public void setCostoParameterGeneral(CostoParameterReturnGeneral costoParameterGeneral) {
		this.costoParameterGeneral = costoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCosto() {
		return isPermisoTodoCosto;
	}

	public void setIsPermisoTodoCosto(Boolean isPermisoTodoCosto) {
		this.isPermisoTodoCosto = isPermisoTodoCosto;
	}

	public Boolean getIsPermisoNuevoCosto() {
		return isPermisoNuevoCosto;
	}

	public void setIsPermisoNuevoCosto(Boolean isPermisoNuevoCosto) {
		this.isPermisoNuevoCosto = isPermisoNuevoCosto;
	}

	public Boolean getIsPermisoActualizarCosto() {
		return isPermisoActualizarCosto;
	}

	public void setIsPermisoActualizarCosto(Boolean isPermisoActualizarCosto) {
		this.isPermisoActualizarCosto = isPermisoActualizarCosto;
	}

	public Boolean getIsPermisoEliminarCosto() {
		return isPermisoEliminarCosto;
	}

	public void setIsPermisoEliminarCosto(Boolean isPermisoEliminarCosto) {
		this.isPermisoEliminarCosto = isPermisoEliminarCosto;
	}

	public Boolean getIsPermisoGuardarCambiosCosto() {
		return isPermisoGuardarCambiosCosto;
	}

	public void setIsPermisoGuardarCambiosCosto(Boolean isPermisoGuardarCambiosCosto) {
		this.isPermisoGuardarCambiosCosto = isPermisoGuardarCambiosCosto;
	}
	
	public Boolean getIsPermisoConsultaCosto() {
		return isPermisoConsultaCosto;
	}

	public void setIsPermisoConsultaCosto(Boolean isPermisoConsultaCosto) {
		this.isPermisoConsultaCosto = isPermisoConsultaCosto;
	}

	public Boolean getIsPermisoBusquedaCosto() {
		return isPermisoBusquedaCosto;
	}

	public void setIsPermisoBusquedaCosto(Boolean isPermisoBusquedaCosto) {
		this.isPermisoBusquedaCosto = isPermisoBusquedaCosto;
	}

	public Boolean getIsPermisoReporteCosto() {
		return isPermisoReporteCosto;
	}

	public void setIsPermisoReporteCosto(Boolean isPermisoReporteCosto) {
		this.isPermisoReporteCosto = isPermisoReporteCosto;
	}
	
	public Boolean getIsPermisoPaginacionMedioCosto() {
		return isPermisoPaginacionMedioCosto;
	}

	public void setIsPermisoPaginacionMedioCosto(Boolean isPermisoPaginacionMedioCosto) {
		this.isPermisoPaginacionMedioCosto = isPermisoPaginacionMedioCosto;
	}
	
	public Boolean getIsPermisoPaginacionTodoCosto() {
		return isPermisoPaginacionTodoCosto;
	}

	public void setIsPermisoPaginacionTodoCosto(Boolean isPermisoPaginacionTodoCosto) {
		this.isPermisoPaginacionTodoCosto = isPermisoPaginacionTodoCosto;
	}
	
	public Boolean getIsPermisoPaginacionAltoCosto() {
		return isPermisoPaginacionAltoCosto;
	}

	public void setIsPermisoPaginacionAltoCosto(Boolean isPermisoPaginacionAltoCosto) {
		this.isPermisoPaginacionAltoCosto = isPermisoPaginacionAltoCosto;
	}
	
	public Boolean getIsPermisoCopiarCosto() {
		return isPermisoCopiarCosto;
	}

	public void setIsPermisoCopiarCosto(Boolean isPermisoCopiarCosto) {
		this.isPermisoCopiarCosto = isPermisoCopiarCosto;
	}
	
	public Boolean getIsPermisoVerFormCosto() {
		return isPermisoVerFormCosto;
	}

	public void setIsPermisoVerFormCosto(Boolean isPermisoVerFormCosto) {
		this.isPermisoVerFormCosto = isPermisoVerFormCosto;
	}
	
	public Boolean getIsPermisoDuplicarCosto() {
		return isPermisoDuplicarCosto;
	}

	public void setIsPermisoDuplicarCosto(Boolean isPermisoDuplicarCosto) {
		this.isPermisoDuplicarCosto = isPermisoDuplicarCosto;
	}
	
	public Boolean getIsPermisoOrdenCosto() {
		return isPermisoOrdenCosto;
	}

	public void setIsPermisoOrdenCosto(Boolean isPermisoOrdenCosto) {
		this.isPermisoOrdenCosto = isPermisoOrdenCosto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCosto() {
		return isVisibilidadCeldaNuevoCosto;
	}

	public void setIsVisibilidadCeldaNuevoCosto(Boolean isVisibilidadCeldaNuevoCosto) {
		this.isVisibilidadCeldaNuevoCosto = isVisibilidadCeldaNuevoCosto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCosto() {
		return isVisibilidadCeldaDuplicarCosto;
	}

	public void setIsVisibilidadCeldaDuplicarCosto(Boolean isVisibilidadCeldaDuplicarCosto) {
		this.isVisibilidadCeldaDuplicarCosto = isVisibilidadCeldaDuplicarCosto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCosto() {
		return isVisibilidadCeldaCopiarCosto;
	}

	public void setIsVisibilidadCeldaCopiarCosto(Boolean isVisibilidadCeldaCopiarCosto) {
		this.isVisibilidadCeldaCopiarCosto = isVisibilidadCeldaCopiarCosto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCosto() {
		return isVisibilidadCeldaVerFormCosto;
	}

	public void setIsVisibilidadCeldaVerFormCosto(Boolean isVisibilidadCeldaVerFormCosto) {
		this.isVisibilidadCeldaVerFormCosto = isVisibilidadCeldaVerFormCosto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCosto() {
		return isVisibilidadCeldaOrdenCosto;
	}

	public void setIsVisibilidadCeldaOrdenCosto(Boolean isVisibilidadCeldaOrdenCosto) {
		this.isVisibilidadCeldaOrdenCosto = isVisibilidadCeldaOrdenCosto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCosto() {
		return isVisibilidadCeldaNuevoRelacionesCosto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCosto(Boolean isVisibilidadCeldaNuevoRelacionesCosto) {
		this.isVisibilidadCeldaNuevoRelacionesCosto = isVisibilidadCeldaNuevoRelacionesCosto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCosto() {
		return isVisibilidadCeldaModificarCosto;
	}

	public void setIsVisibilidadCeldaModificarCosto(Boolean isVisibilidadCeldaModificarCosto) {
		this.isVisibilidadCeldaModificarCosto = isVisibilidadCeldaModificarCosto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCosto() {
		return isVisibilidadCeldaActualizarCosto;
	}

	public void setIsVisibilidadCeldaActualizarCosto(Boolean isVisibilidadCeldaActualizarCosto) {
		this.isVisibilidadCeldaActualizarCosto = isVisibilidadCeldaActualizarCosto;
	}

	public Boolean getIsVisibilidadCeldaEliminarCosto() {
		return isVisibilidadCeldaEliminarCosto;
	}

	public void setIsVisibilidadCeldaEliminarCosto(Boolean isVisibilidadCeldaEliminarCosto) {
		this.isVisibilidadCeldaEliminarCosto = isVisibilidadCeldaEliminarCosto;
	}

	public Boolean getIsVisibilidadCeldaCancelarCosto() {
		return isVisibilidadCeldaCancelarCosto;
	}

	public void setIsVisibilidadCeldaCancelarCosto(Boolean isVisibilidadCeldaCancelarCosto) {
		this.isVisibilidadCeldaCancelarCosto = isVisibilidadCeldaCancelarCosto;
	}

	public Boolean getIsVisibilidadCeldaGuardarCosto() {
		return isVisibilidadCeldaGuardarCosto;
	}

	public void setIsVisibilidadCeldaGuardarCosto(Boolean isVisibilidadCeldaGuardarCosto) {
		this.isVisibilidadCeldaGuardarCosto = isVisibilidadCeldaGuardarCosto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCosto() {
		return isVisibilidadCeldaGuardarCambiosCosto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCosto(Boolean isVisibilidadCeldaGuardarCambiosCosto) {
		this.isVisibilidadCeldaGuardarCambiosCosto = isVisibilidadCeldaGuardarCambiosCosto;
	}
		
	public CostoSessionBean getcostoSessionBean() {
		return this.costoSessionBean;
	}
	
	public void setcostoSessionBean(CostoSessionBean costoSessionBean) {
		this.costoSessionBean=costoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdDetalleMovimientoInventario() {
		return this.isVisibilidadFK_IdDetalleMovimientoInventario;
	}

	public void setisVisibilidadFK_IdDetalleMovimientoInventario(Boolean isVisibilidadFK_IdDetalleMovimientoInventario) {
		this.isVisibilidadFK_IdDetalleMovimientoInventario=isVisibilidadFK_IdDetalleMovimientoInventario;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
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

	public Boolean getisVisibilidadFK_IdTipoCosto() {
		return this.isVisibilidadFK_IdTipoCosto;
	}

	public void setisVisibilidadFK_IdTipoCosto(Boolean isVisibilidadFK_IdTipoCosto) {
		this.isVisibilidadFK_IdTipoCosto=isVisibilidadFK_IdTipoCosto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCosto(Costo costo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(costo,null);
				this.setActualParaGuardarSucursalForeignKey(costo,null);
				this.setActualParaGuardarBodegaForeignKey(costo,null);
				this.setActualParaGuardarProductoForeignKey(costo,null);
				this.setActualParaGuardarPeriodoForeignKey(costo,null);
				this.setActualParaGuardarEjercicioForeignKey(costo,null);
				this.setActualParaGuardarDetalleMovimientoInventarioForeignKey(costo,null);
				this.setActualParaGuardarTipoCostoForeignKey(costo,null);
				this.setActualParaGuardarAnioForeignKey(costo,null);
				this.setActualParaGuardarMesForeignKey(costo,null);
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
	
	public void bugActualizarReferenciaActual(Costo costo,Costo costoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCosto(costo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		costoAux.setId(costo.getId());
		costoAux.setVersionRow(costo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCosto();
		
			int intSelectedRow = this.jTableDatosCosto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = costoValidator.getInvalidValues(this.costo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			costoLogic.setDatosCliente(datosCliente);
			costoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				costoAux=new  Costo();
				
				costoAux.setIsNew(true);
				costoAux.setIsChanged(true);
				
				costoAux.setCostoOriginal(this.costo);
				
				costoAux.setId(this.costo.getId());	
				costoAux.setVersionRow(this.costo.getVersionRow());	
				costoAux.setid_empresa(this.costo.getid_empresa());	
				costoAux.setid_sucursal(this.costo.getid_sucursal());	
				costoAux.setid_bodega(this.costo.getid_bodega());	
				costoAux.setid_producto(this.costo.getid_producto());	
				costoAux.setid_periodo(this.costo.getid_periodo());	
				costoAux.setid_ejercicio(this.costo.getid_ejercicio());	
				costoAux.setid_detalle_movimiento_inventario(this.costo.getid_detalle_movimiento_inventario());	
				costoAux.setid_tipo_costo(this.costo.getid_tipo_costo());	
				costoAux.setnumero_comprobante(this.costo.getnumero_comprobante());	
				costoAux.setfecha(this.costo.getfecha());	
				costoAux.setcantidad(this.costo.getcantidad());	
				costoAux.setvalor_unitario(this.costo.getvalor_unitario());	
				costoAux.setvalor_total(this.costo.getvalor_total());	
				costoAux.setid_anio(this.costo.getid_anio());	
				costoAux.setid_mes(this.costo.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.costoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.costoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(costoAux,costoLogic.getCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(costoAux,costos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.costoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.costoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.saveCostos();//WithConnection
						//costoLogic.getSetVersionRowCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.costo,costoAux);
					
					this.refrescarForeignKeysDescripcionesCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.costoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.costoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								costoLogic.saveCostoRelaciones(costoAux);//WithConnection
								//costoLogic.getSetVersionRowCostos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.costo,costoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.costoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.costoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(costoAux,costoLogic.getCostos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(costoAux,costos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.costo,costoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				costoAux=new  Costo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.costoSessionBean.getEsGuardarRelacionado() 
					|| (this.costoSessionBean.getEsGuardarRelacionado() && this.costo.getId()>=0)) {
						
					costoAux.setIsNew(false);
				}
				
				costoAux.setIsDeleted(false);
			
				costoAux.setId(this.costo.getId());	
				costoAux.setVersionRow(this.costo.getVersionRow());	
				costoAux.setid_empresa(this.costo.getid_empresa());	
				costoAux.setid_sucursal(this.costo.getid_sucursal());	
				costoAux.setid_bodega(this.costo.getid_bodega());	
				costoAux.setid_producto(this.costo.getid_producto());	
				costoAux.setid_periodo(this.costo.getid_periodo());	
				costoAux.setid_ejercicio(this.costo.getid_ejercicio());	
				costoAux.setid_detalle_movimiento_inventario(this.costo.getid_detalle_movimiento_inventario());	
				costoAux.setid_tipo_costo(this.costo.getid_tipo_costo());	
				costoAux.setnumero_comprobante(this.costo.getnumero_comprobante());	
				costoAux.setfecha(this.costo.getfecha());	
				costoAux.setcantidad(this.costo.getcantidad());	
				costoAux.setvalor_unitario(this.costo.getvalor_unitario());	
				costoAux.setvalor_total(this.costo.getvalor_total());	
				costoAux.setid_anio(this.costo.getid_anio());	
				costoAux.setid_mes(this.costo.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(costoAux,costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(costoAux,costos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.costoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.costoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.saveCostos();//WithConnection
						//costoLogic.getSetVersionRowCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.costo,costoAux);
					
					this.refrescarForeignKeysDescripcionesCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.costoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.costoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								costoLogic.saveCostoRelaciones(costoAux);//WithConnection
								//costoLogic.getSetVersionRowCostos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.costo,costoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.costoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.costoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(costoAux,costoLogic.getCostos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(costoAux,costos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.costo,costoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				costoAux=new  Costo();
				
				costoAux.setIsNew(false);
				costoAux.setIsChanged(false);
				
				costoAux.setIsDeleted(true);
				
				costoAux.setId(this.costo.getId());	
				costoAux.setVersionRow(this.costo.getVersionRow());	
				costoAux.setid_empresa(this.costo.getid_empresa());	
				costoAux.setid_sucursal(this.costo.getid_sucursal());	
				costoAux.setid_bodega(this.costo.getid_bodega());	
				costoAux.setid_producto(this.costo.getid_producto());	
				costoAux.setid_periodo(this.costo.getid_periodo());	
				costoAux.setid_ejercicio(this.costo.getid_ejercicio());	
				costoAux.setid_detalle_movimiento_inventario(this.costo.getid_detalle_movimiento_inventario());	
				costoAux.setid_tipo_costo(this.costo.getid_tipo_costo());	
				costoAux.setnumero_comprobante(this.costo.getnumero_comprobante());	
				costoAux.setfecha(this.costo.getfecha());	
				costoAux.setcantidad(this.costo.getcantidad());	
				costoAux.setvalor_unitario(this.costo.getvalor_unitario());	
				costoAux.setvalor_total(this.costo.getvalor_total());	
				costoAux.setid_anio(this.costo.getid_anio());	
				costoAux.setid_mes(this.costo.getid_mes());	
				
				if(this.costoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.costoAux.getId()>=0) {	
						this.costosEliminados.add(costoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(costoAux,costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(costoAux,costos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.costoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.costoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.saveCostos();//WithConnection
						//costoLogic.getSetVersionRowCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.costoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.costoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								costoLogic.saveCostoRelaciones(costoAux);//WithConnection
								//costoLogic.getSetVersionRowCostos();//WithConnection
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
							if(this.costoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.costoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(costoAux,costoLogic.getCostos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(costoAux,costos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getCostos().addAll(this.costosEliminados);
					
					costoLogic.saveCostos();//WithConnection
					//costoLogic.getSetVersionRowCostos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCosto();
				
				this.costosEliminados= new ArrayList<Costo>();		
			}
			
			if(this.costoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Costo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.costo=costoAux;
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
      		//this.finishProcessCosto();
      	}
		
	}	
	
	public void actualizarRelaciones(Costo costoLocal) throws Exception {
		
		if(this.costoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Costo costoLocal) throws Exception {	
		if(this.costoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				costoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				costoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				costoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				costoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				costoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				costoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleMovimientoInventarioDetalleFormJInternalFrame.class)) {
				DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrameLocal=(DetalleMovimientoInventarioBeanSwingJInternalFrame) ((DetalleMovimientoInventarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detallemovimientoinventarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleMovimientoInventario(detallemovimientoinventarioBeanSwingJInternalFrameLocal.getdetallemovimientoinventario(),true);
				detallemovimientoinventarioBeanSwingJInternalFrameLocal.actualizarLista(detallemovimientoinventarioBeanSwingJInternalFrameLocal.detallemovimientoinventario,this.detallemovimientoinventariosForeignKey);

				detallemovimientoinventarioBeanSwingJInternalFrameLocal.actualizarRelaciones(detallemovimientoinventarioBeanSwingJInternalFrameLocal.detallemovimientoinventario);

				costoLocal.setDetalleMovimientoInventario(detallemovimientoinventarioBeanSwingJInternalFrameLocal.detallemovimientoinventario);

				this.addItemDefectoCombosForeignKeyDetalleMovimientoInventario();
				this.cargarCombosFrameDetalleMovimientoInventariosForeignKey("Formulario");
				this.setActualDetalleMovimientoInventarioForeignKey(detallemovimientoinventarioBeanSwingJInternalFrameLocal.detallemovimientoinventario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCostoDetalleFormJInternalFrame.class)) {
				TipoCostoBeanSwingJInternalFrame tipocostoBeanSwingJInternalFrameLocal=(TipoCostoBeanSwingJInternalFrame) ((TipoCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCosto(tipocostoBeanSwingJInternalFrameLocal.gettipocosto(),true);
				tipocostoBeanSwingJInternalFrameLocal.actualizarLista(tipocostoBeanSwingJInternalFrameLocal.tipocosto,this.tipocostosForeignKey);

				tipocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocostoBeanSwingJInternalFrameLocal.tipocosto);

				costoLocal.setTipoCosto(tipocostoBeanSwingJInternalFrameLocal.tipocosto);

				this.addItemDefectoCombosForeignKeyTipoCosto();
				this.cargarCombosFrameTipoCostosForeignKey("Formulario");
				this.setActualTipoCostoForeignKey(tipocostoBeanSwingJInternalFrameLocal.tipocosto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				costoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				costoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCostoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCosto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = costoValidator.getInvalidValues(this.costo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Costo costo,List<Costo> costos) throws Exception {
		try	{		
			CostoConstantesFunciones.actualizarLista(costo,costos,this.costoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Costo costo,List<Costo> costos) throws Exception {
		try	{			
			CostoConstantesFunciones.actualizarSelectedLista(costo,costos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Costo> costosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				costosLocal=this.costoLogic.getCostos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				costosLocal=this.costos;
			}
			//ARCHITECTURE
		
			for(Costo costoLocal:costosLocal) {
				if(this.permiteMantenimiento(costoLocal) && costoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CostoConstantesFunciones.getCostoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_empresaCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_sucursalCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_bodegaCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_productoCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_periodoCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_ejercicioCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDDETALLEMOVIMIENTOINVENTARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_detalle_movimiento_inventarioCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDTIPOCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_tipo_costoCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelnumero_comprobanteCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelfechaCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelcantidadCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.VALORUNITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelvalor_unitarioCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.VALORTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelvalor_totalCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_anioCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelid_mesCosto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCosto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_empresaCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_sucursalCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_bodegaCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_productoCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_periodoCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_ejercicioCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_detalle_movimiento_inventarioCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_tipo_costoCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelnumero_comprobanteCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelfechaCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelcantidadCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelvalor_unitarioCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelvalor_totalCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_anioCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCosto.jLabelid_mesCosto,"");
		
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
		this.iIdNuevoCosto--;	
		
		
		this.costoAux=new Costo();
		
		this.costoAux.setId(this.iIdNuevoCosto);
		this.costoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.costoLogic.getCostos().add(this.costoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.costos.add(this.costoAux);
		}
		//ARCHITECTURE
		
		this.costo=this.costoAux;
		
		if(CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCosto(this.costo);
			this.setVariablesObjetoActualToFormularioForeignKeyCosto(this.costo);
		}
				
		//this.setDefaultControlesCosto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCosto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCosto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCosto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCosto(this.costoBean,this.costo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CostoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.costoSessionBean.getConGuardarRelaciones()) {
			classes=CostoConstantesFunciones.getClassesRelationshipsOfCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.costoReturnGeneral=costoLogic.procesarEventosCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.costoLogic.getCostos(),this.costo,this.costoParameterGeneral,this.isEsNuevoCosto,classes);//this.costoLogic.getCosto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCosto(this.costoReturnGeneral,this.costoBean,false);
		
		if(this.costoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCosto(this.costoReturnGeneral.getCosto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCosto(this.costoReturnGeneral.getCosto());
		}
		
		if(this.costoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCosto(this.costoReturnGeneral.getCosto(),classes);//this.costoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCosto(this.costo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCosto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCosto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CostoBeanSwingJInternalFrameAdditional.RecargarFormCosto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCosto(false);
						
			if(costoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCosto();
			}
			
			this.actualizarVisualTableDatosCosto();
			
			this.jTableDatosCosto.setRowSelectionInterval(this.getIndiceNuevoCosto(), this.getIndiceNuevoCosto());
			
			this.seleccionarFilaTablaCostoActual();
						
			this.actualizarEstadoCeldasBotonesCosto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCosto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCosto.jTextFieldnumero_comprobanteCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarnumero_comprobanteCosto);
		this.jInternalFrameDetalleFormCosto.jDateChooserfechaCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarfechaCosto);
		this.jInternalFrameDetalleFormCosto.jTextFieldcantidadCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarcantidadCosto);
		this.jInternalFrameDetalleFormCosto.jTextFieldvalor_unitarioCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarvalor_unitarioCosto);
		this.jInternalFrameDetalleFormCosto.jTextFieldvalor_totalCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarvalor_totalCosto);	
		//
		this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_empresaCosto);//
		this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_sucursalCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_bodegaCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_productoCosto);//
		this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_periodoCosto);//
		this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_ejercicioCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_detalle_movimiento_inventarioCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_tipo_costoCosto);//
		this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_anioCosto);//
		this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setEnabled(isHabilitar && this.costoConstantesFunciones.activarid_mesCosto);
	};
	
	public void setDefaultControlesCosto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCosto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.costoSessionBean.setConGuardarRelaciones(true);			
			this.costoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.setVisible(true);
			
					
		} else {
			//this.costoSessionBean.setConGuardarRelaciones(false);			
			this.costoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCosto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Costo costoAux:this.costoLogic.getCostos()) {
				if(costoAux.getId().equals(this.iIdNuevoCosto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Costo costoAux:this.costos) {
				if(costoAux.getId().equals(this.iIdNuevoCosto)) {
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
	
	public int getIndiceActualCosto(Costo costo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Costo costoAux:this.costoLogic.getCostos()) {
				if(costoAux.getId().equals(costo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Costo costoAux:this.costos) {
				if(costoAux.getId().equals(costo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCosto(Costo costoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Costo costoAux:this.costoLogic.getCostos()) {
				if(costoAux.getCostoOriginal().getId().equals(costoOriginal.getId())) {
					existe=true;
					costoOriginal.setId(costoAux.getId());
					costoOriginal.setVersionRow(costoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Costo costoAux:this.costos) {
				if(costoAux.getCostoOriginal().getId().equals(costoOriginal.getId())) {
					existe=true;
					costoOriginal.setId(costoAux.getId());
					costoOriginal.setVersionRow(costoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCosto(Boolean esParaCancelar) throws Exception {
		costosAux=new ArrayList<Costo>();
		costoAux=new Costo();
		
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Costo costoAux:this.costoLogic.getCostos()) {
					if(costoAux.getId()<0) {
						costosAux.add(costoAux);
					}		
				}
				this.iIdNuevoCosto=0L;
				this.costoLogic.getCostos().removeAll(costosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Costo costoAux:this.costos) {
					if(costoAux.getId()<0) {
						costosAux.add(costoAux);
					}		
				}
				this.iIdNuevoCosto=0L;
				this.costos.removeAll(costosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCosto 
					&& this.costoLogic.getCostos().size()>0
					) {
					costoAux=this.costoLogic.getCostos().get(this.costoLogic.getCostos().size() - 1);
				
					if(costoAux.getId()<0) {
						this.costoLogic.getCostos().remove(costoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCosto && this.costos.size()>0) {
					costoAux=this.costos.get(this.costos.size() - 1);
				
					if(costoAux.getId()<0) {
						this.costos.remove(costoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCosto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(costo.getId()<0) {
				this.costoLogic.getCostos().remove(this.costo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(costo.getId()<0) {
				this.costos.remove(this.costo);
			}
		}			
	}
	
	public void setEstadosInicialesCosto(List<Costo> costosAux) throws Exception {
		CostoConstantesFunciones.setEstadosInicialesCosto(costosAux);
	}
	
	public void setEstadosInicialesCosto(Costo costoAux) throws Exception {
		CostoConstantesFunciones.setEstadosInicialesCosto(costoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCostoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCostoActual()) {
				if(!this.isEsNuevoCosto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCosto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCostoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Costo ?", "MANTENIMIENTO DE Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Costo costo) throws Exception {
		CostoConstantesFunciones.seleccionarAsignar(this.costo,costo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCosto=this.isPermisoActualizarOriginalCosto;
			
			
			this.seleccionarAsignar(costo);
			
			

			idProductoActual=costo.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CostoConstantesFunciones.quitarEspaciosCosto(this.costo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.costoSessionBean.setsFuncionBusquedaRapida(this.costoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoCosto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCosto(esParaCancelar);				
				this.cancelarNuevoCosto(esParaCancelar);								
			}
			
			this.costo=new Costo();
			
			this.inicializarCosto();
			
			this.actualizarEstadoCeldasBotonesCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCosto() throws Exception {
		try {
			CostoConstantesFunciones.inicializarCosto(this.costo);
			
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
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.costoLogic.getCostos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCostos(String sAccionBusqueda,List<Costo> costosParaReportes) throws Exception {
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
					sPathReporteFinal="Costo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CostoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CostoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Costo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Costos");		
		parameters.put("busquedapor", CostoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCosto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CostoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CostoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCosto=new JRBeanArrayDataSource(CostoJInternalFrame.TraerCostoBeans(costosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCosto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CostoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CostoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CostoBean.TraerCostoBeans(costosParaReportes).toArray()));
							
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
				this.generarExcelReporteCostos(sAccionBusqueda,sTipoArchivoReporte,costosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCostos(sAccionBusqueda,sTipoArchivoReporte,costosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCostoActionPerformed(null);
					//this.generarExcelReporteCostos(sAccionBusqueda,sTipoArchivoReporte,costosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCostos(sAccionBusqueda,sTipoArchivoReporte,costosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCostos(sAccionBusqueda,sTipoArchivoReporte,costosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCostos(sAccionBusqueda,sTipoArchivoReporte,costosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<Costo> costosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Costos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCosto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Costo costo : costosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CostoConstantesFunciones.generarExcelReporteDataCosto("NORMAL",row,workbook,costo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCosto(String sTipo,Row row,Workbook workbook) {
		
		CostoConstantesFunciones.generarExcelReporteHeaderCosto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<Costo> costosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Costos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Costo costo : costosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CostoConstantesFunciones.getCostoDescripcion(costo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getdetallemovimientoinventario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDTIPOCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDTIPOCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.gettipocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_VALORUNITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_VALORUNITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getvalor_unitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_VALORTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_VALORTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getvalor_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costo.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<Costo> costosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Costo> costosRespaldo=null;
		
		classes=CostoConstantesFunciones.getClassesRelationshipsOfCosto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.costoLogic.setDatosCliente(this.datosCliente);
		this.costoLogic.setDatosDeep(this.datosDeep);
		this.costoLogic.setIsConDeep(true);
		
		costosRespaldo=this.costoLogic.getCostos();
		
		this.costoLogic.setCostos(costosParaReportes);	
		this.costoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		costosParaReportes=this.costoLogic.getCostos();
		this.costoLogic.setCostos(costosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Costos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCosto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Costo costo : costosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCosto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CostoConstantesFunciones.generarExcelReporteDataCosto("NORMAL",row,workbook,costo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CostoConstantesFunciones.getCostoDescripcion(costo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCosto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCosto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCosto() throws Exception {		
		this.startProcessCosto(true);
	}
	
	public void startProcessCosto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCosto ,this.jPanelParametrosReportesCosto, this.jScrollPanelDatosCosto,this.jPanelPaginacionCosto, this.jScrollPanelDatosEdicionCosto, this.jPanelAccionesCosto,this.jPanelAccionesFormularioCosto,this.jmenuBarCosto,this.jmenuBarDetalleCosto,this.jTtoolBarCosto,this.jTtoolBarDetalleCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasCosto=this.jTabbedPaneBusquedasCosto; 
		
		final JPanel jPanelParametrosReportesCosto=this.jPanelParametrosReportesCosto;
		//final JScrollPane jScrollPanelDatosCosto=this.jScrollPanelDatosCosto;
		final JTable jTableDatosCosto=this.jTableDatosCosto;		
		final JPanel jPanelPaginacionCosto=this.jPanelPaginacionCosto;
		//final JScrollPane jScrollPanelDatosEdicionCosto=this.jScrollPanelDatosEdicionCosto;
		final JPanel jPanelAccionesCosto=this.jPanelAccionesCosto;
		
		JPanel jPanelCamposAuxiliarCosto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCosto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCosto!=null) {
			jPanelCamposAuxiliarCosto=this.jInternalFrameDetalleFormCosto.jPanelCamposCosto;
			jPanelAccionesFormularioAuxiliarCosto=this.jInternalFrameDetalleFormCosto.jPanelAccionesFormularioCosto;
		}
		
		final JPanel jPanelCamposCosto=jPanelCamposAuxiliarCosto;
		final JPanel jPanelAccionesFormularioCosto=jPanelAccionesFormularioAuxiliarCosto;
		
		
		final JMenuBar jmenuBarCosto=this.jmenuBarCosto;
		final JToolBar jTtoolBarCosto=this.jTtoolBarCosto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCosto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCosto!=null) {
			jmenuBarDetalleAuxiliarCosto=this.jInternalFrameDetalleFormCosto.jmenuBarDetalleCosto;
			jTtoolBarDetalleAuxiliarCosto=this.jInternalFrameDetalleFormCosto.jTtoolBarDetalleCosto;
		}
		
		final JMenuBar jmenuBarDetalleCosto=jmenuBarDetalleAuxiliarCosto;
		final JToolBar jTtoolBarDetalleCosto=jTtoolBarDetalleAuxiliarCosto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCosto;
			processRunnable.jTableDatos=jTableDatosCosto;
			processRunnable.jPanelCampos=jPanelCamposCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionCosto;
			processRunnable.jPanelAcciones=jPanelAccionesCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCosto;
			
			
			processRunnable.jmenuBar=jmenuBarCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCosto;
			processRunnable.jTtoolBar=jTtoolBarCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCosto ,jPanelParametrosReportesCosto,jTableDatosCosto, /*jScrollPanelDatosCosto,*/jPanelCamposCosto,jPanelPaginacionCosto, /*jScrollPanelDatosEdicionCosto,*/ jPanelAccionesCosto,jPanelAccionesFormularioCosto,jmenuBarCosto,jmenuBarDetalleCosto,jTtoolBarCosto,jTtoolBarDetalleCosto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCosto ,jPanelParametrosReportesCosto, jScrollPanelDatosCosto,jPanelPaginacionCosto, jScrollPanelDatosEdicionCosto, jPanelAccionesCosto,jPanelAccionesFormularioCosto,jmenuBarCosto,jmenuBarDetalleCosto,jTtoolBarCosto,jTtoolBarDetalleCosto);
						
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
	
	public void finishProcessCosto() {// throws Exception 
		this.finishProcessCosto(true);
	}
	
	public void finishProcessCosto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCosto ,this.jPanelParametrosReportesCosto, this.jScrollPanelDatosCosto,this.jPanelPaginacionCosto, this.jScrollPanelDatosEdicionCosto, this.jPanelAccionesCosto,this.jPanelAccionesFormularioCosto,this.jmenuBarCosto,this.jmenuBarDetalleCosto,this.jTtoolBarCosto,this.jTtoolBarDetalleCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasCosto=this.jTabbedPaneBusquedasCosto; 
		
		final JPanel jPanelParametrosReportesCosto=this.jPanelParametrosReportesCosto;
		//final JScrollPane jScrollPanelDatosCosto=this.jScrollPanelDatosCosto;
		final JTable jTableDatosCosto=this.jTableDatosCosto;		
		final JPanel jPanelPaginacionCosto=this.jPanelPaginacionCosto;
		//final JScrollPane jScrollPanelDatosEdicionCosto=this.jScrollPanelDatosEdicionCosto;
		final JPanel jPanelAccionesCosto=this.jPanelAccionesCosto;
		
		JPanel jPanelCamposAuxiliarCosto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCosto=new JPanel();
		
		if(this.jInternalFrameDetalleFormCosto!=null) {
			jPanelCamposAuxiliarCosto=this.jInternalFrameDetalleFormCosto.jPanelCamposCosto;
			jPanelAccionesFormularioAuxiliarCosto=this.jInternalFrameDetalleFormCosto.jPanelAccionesFormularioCosto;
		}
		
		final JPanel jPanelCamposCosto=jPanelCamposAuxiliarCosto;
		final JPanel jPanelAccionesFormularioCosto=jPanelAccionesFormularioAuxiliarCosto;
		
		
		final JMenuBar jmenuBarCosto=this.jmenuBarCosto;		
		final JToolBar jTtoolBarCosto=this.jTtoolBarCosto;
				
		JMenuBar jmenuBarDetalleAuxiliarCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCosto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCosto!=null) {
			jmenuBarDetalleAuxiliarCosto=this.jInternalFrameDetalleFormCosto.jmenuBarDetalleCosto;
			jTtoolBarDetalleAuxiliarCosto=this.jInternalFrameDetalleFormCosto.jTtoolBarDetalleCosto;		
		}
		
		final JMenuBar jmenuBarDetalleCosto=jmenuBarDetalleAuxiliarCosto;
		final JToolBar jTtoolBarDetalleCosto=jTtoolBarDetalleAuxiliarCosto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCosto;
			processRunnable.jTableDatos=jTableDatosCosto;
			processRunnable.jPanelCampos=jPanelCamposCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionCosto;
			processRunnable.jPanelAcciones=jPanelAccionesCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCosto;
			
			
			processRunnable.jmenuBar=jmenuBarCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCosto;
			processRunnable.jTtoolBar=jTtoolBarCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCosto ,jPanelParametrosReportesCosto, jTableDatosCosto,/*jScrollPanelDatosCosto,*/jPanelCamposCosto,jPanelPaginacionCosto, /*jScrollPanelDatosEdicionCosto,*/ jPanelAccionesCosto,jPanelAccionesFormularioCosto,jmenuBarCosto,jmenuBarDetalleCosto,jTtoolBarCosto,jTtoolBarDetalleCosto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCosto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCosto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCosto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCosto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCosto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.costoConstantesFunciones.getsFinalQueryCosto();
		String  finalQueryPaginacionTodos=this.costoConstantesFunciones.getsFinalQueryCosto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CostoConstantesFunciones.getArrayColumnasGlobalesNoCosto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CostoConstantesFunciones.getArrayColumnasGlobalesCosto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CostoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.costosEliminados= new ArrayList<Costo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCosto();
		
				///*CostoSessionBean*/this.costoSessionBean=new CostoSessionBean();
			
			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
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
					this.iNumeroPaginacion=CostoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CostoConstantesFunciones.getClassesForeignKeysOfCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/costo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			costosAux= new ArrayList<Costo>();
			
				
			costoLogic.setDatosCliente(this.datosCliente);
			costoLogic.setDatosDeep(this.datosDeep);
			costoLogic.setIsConDeep(true);
			
			
			costoLogic.getCostoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					costoLogic.getTodosCostos(finalQueryGlobal,pagination);
					
					//costoLogic.getTodosCostosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(costoLogic.getCostos()==null|| costoLogic.getCostos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							costosAux= new ArrayList<Costo>();
							costosAux.addAll(costoLogic.getCostos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux= new ArrayList<Costo>();
							costosAux.addAll(costos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							costoLogic.getTodosCostos(finalQueryGlobal+"",this.pagination);												
							
							//costoLogic.getTodosCostosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCostos("Todos",costoLogic.getCostos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							costoLogic.setCostos(new ArrayList<Costo>());					
							costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCosto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCosto=this.idActual;
				
				} else if(this.idCostoActual!=null && this.idCostoActual!=0L) {
					idCosto=idCostoActual;
				}
				
					
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndicePorId(idCosto);
				
				this.costos=new ArrayList<Costo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					costoLogic.getEntity(idCosto);
					
					//costoLogic.getEntityWithConnection(idCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.setCostos(new ArrayList<Costo>());
					costoLogic.getCostos().add(costoLogic.getCosto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costos=new ArrayList<Costo>();
					this.costos.add(costo);
				}
				
				if(costoLogic.getCosto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costoLogic.getCostosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costoLogic.getCostos()==null||costoLogic.getCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costos==null|| costos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costosAux=new ArrayList<Costo>();
						costosAux.addAll(costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux=new ArrayList<Costo>();
							costosAux.addAll(costos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costoLogic.getCostosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostos("FK_IdBodega",costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostos("FK_IdBodega",costos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.setCostos(new ArrayList<Costo>());
						costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleMovimientoInventario")) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costoLogic.getCostosFK_IdDetalleMovimientoInventario(finalQueryGlobal,pagination,id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costoLogic.getCostos()==null||costoLogic.getCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costos==null|| costos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costosAux=new ArrayList<Costo>();
						costosAux.addAll(costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux=new ArrayList<Costo>();
							costosAux.addAll(costos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costoLogic.getCostosFK_IdDetalleMovimientoInventario(finalQueryGlobal,pagination,id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostos("FK_IdDetalleMovimientoInventario",costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostos("FK_IdDetalleMovimientoInventario",costos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.setCostos(new ArrayList<Costo>());
						costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costoLogic.getCostosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costoLogic.getCostos()==null||costoLogic.getCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costos==null|| costos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costosAux=new ArrayList<Costo>();
						costosAux.addAll(costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux=new ArrayList<Costo>();
							costosAux.addAll(costos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costoLogic.getCostosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostos("FK_IdEjercicio",costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostos("FK_IdEjercicio",costos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.setCostos(new ArrayList<Costo>());
						costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costoLogic.getCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costoLogic.getCostos()==null||costoLogic.getCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costos==null|| costos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costosAux=new ArrayList<Costo>();
						costosAux.addAll(costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux=new ArrayList<Costo>();
							costosAux.addAll(costos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costoLogic.getCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostos("FK_IdEmpresa",costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostos("FK_IdEmpresa",costos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.setCostos(new ArrayList<Costo>());
						costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costoLogic.getCostosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costoLogic.getCostos()==null||costoLogic.getCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costos==null|| costos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costosAux=new ArrayList<Costo>();
						costosAux.addAll(costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux=new ArrayList<Costo>();
							costosAux.addAll(costos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costoLogic.getCostosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostos("FK_IdPeriodo",costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostos("FK_IdPeriodo",costos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.setCostos(new ArrayList<Costo>());
						costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costoLogic.getCostosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costoLogic.getCostos()==null||costoLogic.getCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costos==null|| costos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costosAux=new ArrayList<Costo>();
						costosAux.addAll(costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux=new ArrayList<Costo>();
							costosAux.addAll(costos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costoLogic.getCostosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostos("FK_IdProducto",costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostos("FK_IdProducto",costos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.setCostos(new ArrayList<Costo>());
						costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costoLogic.getCostosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costoLogic.getCostos()==null||costoLogic.getCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costos==null|| costos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costosAux=new ArrayList<Costo>();
						costosAux.addAll(costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux=new ArrayList<Costo>();
							costosAux.addAll(costos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costoLogic.getCostosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostos("FK_IdSucursal",costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostos("FK_IdSucursal",costos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.setCostos(new ArrayList<Costo>());
						costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCosto")) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdTipoCosto(id_tipo_costoFK_IdTipoCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costoLogic.getCostosFK_IdTipoCosto(finalQueryGlobal,pagination,id_tipo_costoFK_IdTipoCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdTipoCosto(id_tipo_costoFK_IdTipoCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdTipoCosto(id_tipo_costoFK_IdTipoCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costoLogic.getCostos()==null||costoLogic.getCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costos==null|| costos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costosAux=new ArrayList<Costo>();
						costosAux.addAll(costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costosAux=new ArrayList<Costo>();
							costosAux.addAll(costos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costoLogic.getCostosFK_IdTipoCosto(finalQueryGlobal,pagination,id_tipo_costoFK_IdTipoCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdTipoCosto(id_tipo_costoFK_IdTipoCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoConstantesFunciones.getDetalleIndiceFK_IdTipoCosto(id_tipo_costoFK_IdTipoCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostos("FK_IdTipoCosto",costoLogic.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostos("FK_IdTipoCosto",costos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costoLogic.setCostos(new ArrayList<Costo>());
						costoLogic.getCostos().addAll(costosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costos=new ArrayList<Costo>();
							costos.addAll(costosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCosto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCosto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=costoLogic.getCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=costos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=costoLogic.getCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=costos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Costo costo) {
		Boolean permite=true;
		
		if(this.costo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CostoConstantesFunciones.getOrderByListaCosto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CostoConstantesFunciones.getOrderByListaCosto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Costo costo:costoLogic.getCostos()) {
				if(costo.getsType().equals(Constantes2.S_TOTALES)) {
					costoTotales=costo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Costo costo:this.costos) {
				if(costo.getsType().equals(Constantes2.S_TOTALES)) {
					costoTotales=costo;
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
			this.costoAux=new Costo();
			this.costoAux.setsType(Constantes2.S_TOTALES);
			this.costoAux.setIsNew(false);
			this.costoAux.setIsChanged(false);
			this.costoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CostoConstantesFunciones.TotalizarValoresFilaCosto(this.costoLogic.getCostos(),this.costoAux);
				
				this.costoLogic.getCostos().add(this.costoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CostoConstantesFunciones.TotalizarValoresFilaCosto(this.costos,this.costoAux);
				
				this.costos.add(this.costoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		costoTotales=new Costo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.costoLogic.getCostos().remove(costoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.costos.remove(costoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		costoTotales=new Costo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Costo costo:costoLogic.getCostos()) {
				if(costo.getsType().equals(Constantes2.S_TOTALES)) {
					costoTotales=costo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CostoConstantesFunciones.TotalizarValoresFilaCosto(this.costoLogic.getCostos(),costoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Costo costo:this.costos) {
				if(costo.getsType().equals(Constantes2.S_TOTALES)) {
					costoTotales=costo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CostoConstantesFunciones.TotalizarValoresFilaCosto(this.costos,costoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCostosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdDetalleMovimientoInventario()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleMovimientoInventario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostosFK_IdTipoCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCostosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdDetalleMovimientoInventario(String sFinalQuery,Long id_detalle_movimiento_inventario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdDetalleMovimientoInventario(sFinalQuery,this.pagination,id_detalle_movimiento_inventario);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostosFK_IdTipoCosto(String sFinalQuery,Long id_tipo_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLogic.getCostosFK_IdTipoCosto(sFinalQuery,this.pagination,id_tipo_costo);
				
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
	
	public void inicializarPermisosCosto() {
		this.isPermisoTodoCosto=false;
		this.isPermisoNuevoCosto=false;
		this.isPermisoActualizarCosto=false;
		this.isPermisoActualizarOriginalCosto=false;
		this.isPermisoEliminarCosto=false;
		this.isPermisoGuardarCambiosCosto=false;
		this.isPermisoConsultaCosto=false;
		this.isPermisoBusquedaCosto=false;
		this.isPermisoReporteCosto=false;		
		this.isPermisoOrdenCosto=false;		
		this.isPermisoPaginacionMedioCosto=false;		
		this.isPermisoPaginacionAltoCosto=false;
		this.isPermisoPaginacionTodoCosto=false;
		this.isPermisoCopiarCosto=false;		
		this.isPermisoVerFormCosto=false;		
		this.isPermisoDuplicarCosto=false;		
		this.isPermisoOrdenCosto=false;		
	}
	
	public void setPermisosUsuarioCosto(Boolean isPermiso) {
		this.isPermisoTodoCosto=isPermiso;
		this.isPermisoNuevoCosto=isPermiso;
		this.isPermisoActualizarCosto=isPermiso;
		this.isPermisoActualizarOriginalCosto=isPermiso;
		this.isPermisoEliminarCosto=isPermiso;
		this.isPermisoGuardarCambiosCosto=isPermiso;
		this.isPermisoConsultaCosto=isPermiso;
		this.isPermisoBusquedaCosto=isPermiso;
		this.isPermisoReporteCosto=isPermiso;
		this.isPermisoOrdenCosto=isPermiso;		
		this.isPermisoPaginacionMedioCosto=isPermiso;		
		this.isPermisoPaginacionAltoCosto=isPermiso;		
		this.isPermisoPaginacionTodoCosto=isPermiso;		
		this.isPermisoCopiarCosto=isPermiso;		
		this.isPermisoVerFormCosto=isPermiso;		
		this.isPermisoDuplicarCosto=isPermiso;
		this.isPermisoOrdenCosto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCosto(Boolean isPermiso) {
		//this.isPermisoTodoCosto=isPermiso;
		this.isPermisoNuevoCosto=isPermiso;
		this.isPermisoActualizarCosto=isPermiso;
		this.isPermisoActualizarOriginalCosto=isPermiso;
		this.isPermisoEliminarCosto=isPermiso;
		this.isPermisoGuardarCambiosCosto=isPermiso;
		//this.isPermisoConsultaCosto=isPermiso;
		//this.isPermisoBusquedaCosto=isPermiso;
		//this.isPermisoReporteCosto=isPermiso;
		//this.isPermisoOrdenCosto=isPermiso;		
		//this.isPermisoPaginacionMedioCosto=isPermiso;		
		//this.isPermisoPaginacionAltoCosto=isPermiso;		
		//this.isPermisoPaginacionTodoCosto=isPermiso;		
		//this.isPermisoCopiarCosto=isPermiso;		
		//this.isPermisoDuplicarCosto=isPermiso;
		//this.isPermisoOrdenCosto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCostoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCosto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCostoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCostoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCostoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCostoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCosto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CostoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.costoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CostoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCosto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCosto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCosto=this.isPermisoActualizarCosto;
			this.isPermisoEliminarCosto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCosto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCosto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCosto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCosto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCosto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCosto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCosto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCosto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCosto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCosto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCosto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.costoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCosto.setToolTipText(this.jTableDatosCosto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCosto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCosto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCosto() throws Exception {
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
	public void inicializarCombosForeignKeyCostoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.detallemovimientoinventariosForeignKey=new ArrayList();
				this.tipocostosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CostoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCostoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleMovimientoInventarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDetalleMovimientoInventarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detallemovimientoinventariosForeignKey==null||this.detallemovimientoinventariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesDetalleMovimientoInventario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleMovimientoInventarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleMovimientoInventarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleMovimientoInventariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocostosForeignKey==null||this.tipocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCostoConstantesFunciones.getArrayColumnasGlobalesTipoCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CostoParameterReturnGeneral costoReturnGeneral=new CostoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_empresaCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_empresaCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_sucursalCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_sucursalCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_bodegaCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_bodegaCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_productoCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_productoCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_periodoCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_periodoCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_ejercicioCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_ejercicioCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalDetalleMovimientoInventario="";

				if(((this.detallemovimientoinventariosForeignKey==null||this.detallemovimientoinventariosForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_detalle_movimiento_inventarioCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_detalle_movimiento_inventarioCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesDetalleMovimientoInventario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleMovimientoInventario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleMovimientoInventarioConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleMovimientoInventario=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleMovimientoInventario, "");
						finalQueryGlobalDetalleMovimientoInventario+=DetalleMovimientoInventarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleMovimientoInventariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleMovimientoInventario=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidDetalleMovimientoInventarioActual();
					}
				} else {
					finalQueryGlobalDetalleMovimientoInventario="NONE";
				}


				String finalQueryGlobalTipoCosto="";

				if(((this.tipocostosForeignKey==null||this.tipocostosForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_tipo_costoCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_tipo_costoCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCostoConstantesFunciones.getArrayColumnasGlobalesTipoCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCosto, "");
						finalQueryGlobalTipoCosto+=TipoCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCosto=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidTipoCostoActual();
					}
				} else {
					finalQueryGlobalTipoCosto="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_anioCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_anioCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.costoConstantesFunciones.cargarid_mesCosto)
					 || (this.esRecargarFks && this.costoConstantesFunciones.cargarid_mesCosto)) {

					if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+costoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				costoReturnGeneral=costoLogic.cargarCombosLoteForeignKeyCosto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalPeriodo,finalQueryGlobalEjercicio,finalQueryGlobalDetalleMovimientoInventario,finalQueryGlobalTipoCosto,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=costoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=costoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=costoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=costoReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=costoReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=costoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalDetalleMovimientoInventario.equals("NONE")) {
				this.detallemovimientoinventariosForeignKey=costoReturnGeneral.getdetallemovimientoinventariosForeignKey();
			}

			if(!finalQueryGlobalTipoCosto.equals("NONE")) {
				this.tipocostosForeignKey=costoReturnGeneral.gettipocostosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=costoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=costoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCosto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyDetalleMovimientoInventario();
			this.addItemDefectoCombosForeignKeyTipoCosto();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.costoSessionBean==null) {
				this.costoSessionBean=new CostoSessionBean();
			}

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDetalleMovimientoInventario()throws Exception {
		try {

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario()) {
				DetalleMovimientoInventario detallemovimientoinventario=new DetalleMovimientoInventario();
				DetalleMovimientoInventarioConstantesFunciones.setDetalleMovimientoInventarioDescripcion(detallemovimientoinventario,Constantes.SMENSAJE_ESCOJA_OPCION);
				detallemovimientoinventario.setId(null);

				if(!DetalleMovimientoInventarioConstantesFunciones.ExisteEnLista(this.detallemovimientoinventariosForeignKey,detallemovimientoinventario,true)) {

					this.detallemovimientoinventariosForeignKey.add(0,detallemovimientoinventario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoCosto()throws Exception {
		try {

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCosto()) {
				TipoCosto tipocosto=new TipoCosto();
				TipoCostoConstantesFunciones.setTipoCostoDescripcion(tipocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocosto.setId(null);

				if(!TipoCostoConstantesFunciones.ExisteEnLista(this.tipocostosForeignKey,tipocosto,true)) {

					this.tipocostosForeignKey.add(0,tipocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.costoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCosto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCosto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
			
			
				this.costo.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCosto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCosto(Costo costo)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(costo.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(costo.getid_producto(),false,"Formulario");
			this.setActualDetalleMovimientoInventarioForeignKey(costo.getid_detalle_movimiento_inventario(),false,"Formulario");
			this.setActualTipoCostoForeignKey(costo.getid_tipo_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCosto(Costo costo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(costo.getProducto()!=null && !sTipoEvento.equals("id_productoCosto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(costo.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCosto()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.costoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.costoConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualDetalleMovimientoInventarioForeignKey(this.costoConstantesFunciones.getid_detalle_movimiento_inventario(),false,"Formulario");
			this.setActualTipoCostoForeignKey(this.costoConstantesFunciones.getid_tipo_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCosto()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormCosto!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormCosto!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCosto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCosto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameDetalleMovimientoInventariosForeignKey("Todos");
			this.cargarCombosFrameTipoCostosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleMovimientoInventariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCostosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCosto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto!=null && this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




















	
	

	public CostoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CostoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CostoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.costoSessionBean=new CostoSessionBean(); 
		this.costoConstantesFunciones=new CostoConstantesFunciones(); 
		this.costoBean=new Costo();//(this.costoConstantesFunciones); 		
		this.costoReturnGeneral=new CostoParameterReturnGeneral(); 
		
		this.costoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.costoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCosto(true);
			
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
			
			this.costoConstantesFunciones=new CostoConstantesFunciones(); 
			this.costoBean=new Costo();//this.costoConstantesFunciones); 			
			this.costoReturnGeneral=new CostoParameterReturnGeneral(); 
		
			CostoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Costo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.costo=new Costo();
			this.costos = new ArrayList<Costo>();
			this.costosAux = new ArrayList<Costo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic=new CostoLogic();
				this.costoLogic.getNewConnexionToDeep("");
			}
			
			//this.costoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.costoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCosto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCosto);	
					}
					
					if(this.jInternalFrameImportacionCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCosto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCosto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCosto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCosto);
				this.jInternalFrameDetalleFormCosto.setVisible(false);
				this.jInternalFrameDetalleFormCosto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCosto);
					this.jInternalFrameReporteDinamicoCosto.setVisible(false);
					this.jInternalFrameReporteDinamicoCosto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCosto);
					this.jInternalFrameImportacionCosto.setVisible(false);
					this.jInternalFrameImportacionCosto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCosto);
					this.jInternalFrameOrderByCosto.setVisible(false);
					this.jInternalFrameOrderByCosto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCostoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CostoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.costoReturnGeneral=new CostoParameterReturnGeneral();
			
			this.costoParameterGeneral=new CostoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.costoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.costoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CostoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.costoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.costoSessionBean.getEsGuardarRelacionado(),this.costoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.costoSessionBean.getEsGuardarRelacionado(),this.costoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCosto=false;
			this.isVisibilidadCeldaDuplicarCosto=true;
			this.isVisibilidadCeldaCopiarCosto=true;
			this.isVisibilidadCeldaVerFormCosto=true;
			this.isVisibilidadCeldaOrdenCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesCosto=false;
			this.isVisibilidadCeldaModificarCosto=false;
			this.isVisibilidadCeldaActualizarCosto=false;
			this.isVisibilidadCeldaEliminarCosto=false;
			this.isVisibilidadCeldaCancelarCosto=false;
			this.isVisibilidadCeldaGuardarCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCosto=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdDetalleMovimientoInventario=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoCosto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCosto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCosto(false);
			
			this.setPermisosUsuarioCosto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.costoSessionBean.getEsGuardarRelacionado() 
				|| (this.costoSessionBean.getEsGuardarRelacionado() && this.costoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCostoClasesRelacionadas();
			}
			
			if(this.costoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCostoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCosto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCosto();
			}
			
			if(!this.isPermisoBusquedaCosto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCosto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.costoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCosto,this.isPermisoPaginacionMedioCosto,this.isPermisoPaginacionTodoCosto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CostoConstantesFunciones.getTiposSeleccionarCosto());
				
				this.tiposColumnasSelect=CostoConstantesFunciones.getTiposSeleccionarCosto(true);
				
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
			//if(!this.costoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCosto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCosto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCosto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCosto() ;
			
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
			this.periodoLogic=new PeriodoLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.detallemovimientoinventarioLogic=new DetalleMovimientoInventarioLogic();
			this.tipocostoLogic=new TipoCostoLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				costoImplementable= (CostoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				costoImplementableHome= (CostoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.costos= new ArrayList<Costo>();
			this.costosEliminados= new ArrayList<Costo>();
						
			this.isEsNuevoCosto=false;
			this.esParaAccionDesdeFormularioCosto=false;
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
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.detallemovimientoinventariosForeignKey=new ArrayList<DetalleMovimientoInventario>() ;
			this.tipocostosForeignKey=new ArrayList<TipoCosto>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCosto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCosto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.costoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CostoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CostoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCosto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCosto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCosto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCosto();
			}
			
			CostoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCosto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCosto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCosto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCosto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Costo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCosto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCosto")) {
				iIndex=this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCosto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCosto();	
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
	
	public void cargarCombosForeignKeyCosto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCosto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCostoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCosto();
		
		this.cargarCombosFrameForeignKeyCosto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCosto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCosto();
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

	public void cargarCombosForeignKeyDetalleMovimientoInventario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleMovimientoInventarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleMovimientoInventario();
				this.cargarCombosFrameDetalleMovimientoInventariosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleMovimientoInventario(this.detallemovimientoinventariosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCosto();
				this.cargarCombosFrameTipoCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCosto(this.tipocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.costoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
			
			if(jTableDatosCosto.getRowCount()>=1) {
				jTableDatosCosto.removeRowSelectionInterval(0, jTableDatosCosto.getRowCount()-1);						
			}
			
			this.isEsNuevoCosto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCosto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCosto(true);			
			//this.costo=new Costo();
			//this.costo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCosto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCosto() ;
			
			if(CostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCosto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.costo);	
			this.actualizarInformacion("INFO_PADRE",false,this.costo);				
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
			if(this.costoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Costo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCosto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCosto.getSelectedRows().length;			
			}
			
			costosSeleccionados=this.getCostosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCosto--;			
				//Costo costoAux= new Costo();			
				//costoAux.setId(this.iIdNuevoCosto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Costo costoOrigen=new Costo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Costo costoOrigen : costosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCosto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							costoOrigen =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costoOrigen =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCosto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.costo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCosto(costoOrigen,this.costo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.costoLogic.getCostos().add(this.costoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.costos.add(this.costoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCosto(false);
				
				this.jTableDatosCosto.setRowSelectionInterval(this.getIndiceNuevoCosto(), this.getIndiceNuevoCosto());
				
				int iLastRow =  this.jTableDatosCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCosto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();									
		
			Costo costoOrigen=new Costo();
			Costo costoDestino=new Costo();
				
			costosSeleccionados=this.getCostosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCosto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || costosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCosto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costoOrigen =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						costoOrigen =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costoDestino =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						costoDestino =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				costoOrigen =costosSeleccionados.get(0);
				costoDestino =costosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCosto(costoOrigen,costoDestino,true,false);
				
				costoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(costoDestino,costoLogic.getCostos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(costoDestino,costos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCosto(false);
				
				//this.jTableDatosCosto.setRowSelectionInterval(this.getIndiceNuevoCosto(), this.getIndiceNuevoCosto());
				
				int iLastRow =  this.jTableDatosCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCosto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCosto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCosto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCosto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCosto.setVisible(!isVisible);
			this.jPanelPaginacionCosto.setVisible(!isVisible);
			this.jPanelAccionesCosto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCosto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCosto();
			
			this.abrirFrameOrderByCosto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCosto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCosto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCosto.isMaximum()) {
					this.jInternalFrameDetalleFormCosto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCosto.setSize(this.jInternalFrameDetalleFormCosto.iWidthFormulario,this.jInternalFrameDetalleFormCosto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCosto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCosto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCosto.isMaximum()) {
						this.jInternalFrameDetalleFormCosto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCosto.jContentPaneDetalleCosto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCosto.jContentPaneDetalleCosto.getWidth(),CostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCosto.jContentPaneDetalleCosto.getWidth(),CostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCosto.jContentPaneDetalleCosto.getWidth(),CostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCosto.setVisible(true);
	        this.jInternalFrameDetalleFormCosto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCosto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCosto,false,this);
				} else {
					this.jInternalFrameOrderByCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCosto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCosto);
				this.jInternalFrameOrderByCosto.setVisible(false);
				this.jInternalFrameOrderByCosto.setSelected(false);
				
				this.jInternalFrameOrderByCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCosto"));
				
				this.inicializarActualizarBindingTablaOrderByCosto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCosto==null) {
				
				this.jInternalFrameImportacionCosto=new ImportacionJInternalFrame(CostoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCosto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCosto);
				this.jInternalFrameImportacionCosto.setVisible(false);
				this.jInternalFrameImportacionCosto.setSelected(false);


				this.jInternalFrameImportacionCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCosto"));
				this.jInternalFrameImportacionCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCosto"));
				this.jInternalFrameImportacionCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCosto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCosto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCosto==null) {
				this.jInternalFrameReporteDinamicoCosto=new ReporteDinamicoJInternalFrame(CostoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCosto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCosto);
				this.jInternalFrameReporteDinamicoCosto.setVisible(false);
				this.jInternalFrameReporteDinamicoCosto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCosto"));
				this.jInternalFrameReporteDinamicoCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCosto"));
				this.jInternalFrameReporteDinamicoCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCosto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCosto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCosto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCosto);
			
	       	this.jInternalFrameDetalleFormCosto.setVisible(false);
	        this.jInternalFrameDetalleFormCosto.setSelected(false);
			
			//this.jInternalFrameDetalleFormCosto.dispose();
			//this.jInternalFrameDetalleFormCosto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCosto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCosto.setVisible(true);
	        this.jInternalFrameReporteDinamicoCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCosto.setVisible(true);
	        this.jInternalFrameImportacionCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCosto.setVisible(true);
	        this.jInternalFrameOrderByCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCosto.setVisible(false);
	        this.jInternalFrameOrderByCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCosto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCosto.setVisible(false);
	        this.jInternalFrameReporteDinamicoCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCosto.setVisible(false);
	        this.jInternalFrameImportacionCosto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCosto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCosto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCosto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCosto(true);
			//this.isEsNuevoCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCosto(false) ;
			
			if(costoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCosto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCostoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCosto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCosto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCosto(true);
			//this.isEsNuevoCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.costo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCosto(false) ;
			
			if(CostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCosto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.costoConstantesFunciones.cargarid_productoCosto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCosto(false,false);
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
		TableColumn tableColumnBodega=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCosto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaDetalleMovimientoInventario(List<DetalleMovimientoInventario> detallemovimientoinventariosForeignKey)throws Exception{
		TableColumn tableColumnDetalleMovimientoInventario=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO));
		TableCellEditor tableCellEditorDetalleMovimientoInventario =tableColumnDetalleMovimientoInventario.getCellEditor();

		DetalleMovimientoInventarioTableCell detallemovimientoinventarioTableCellFk=(DetalleMovimientoInventarioTableCell)tableCellEditorDetalleMovimientoInventario;

		if(detallemovimientoinventarioTableCellFk!=null) {
			detallemovimientoinventarioTableCellFk.setdetallemovimientoinventariosForeignKey(detallemovimientoinventariosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detallemovimientoinventarioTableCellFk.setRowActual(intSelectedRow);
			//detallemovimientoinventarioTableCellFk.setdetallemovimientoinventariosForeignKeyActual(detallemovimientoinventariosForeignKey);
		//}


		if(detallemovimientoinventarioTableCellFk!=null) {
			detallemovimientoinventarioTableCellFk.RecargarDetalleMovimientoInventariosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCosto(List<TipoCosto> tipocostosForeignKey)throws Exception{
		TableColumn tableColumnTipoCosto=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDTIPOCOSTO));
		TableCellEditor tableCellEditorTipoCosto =tableColumnTipoCosto.getCellEditor();

		TipoCostoTableCell tipocostoTableCellFk=(TipoCostoTableCell)tableCellEditorTipoCosto;

		if(tipocostoTableCellFk!=null) {
			tipocostoTableCellFk.settipocostosForeignKey(tipocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocostoTableCellFk.setRowActual(intSelectedRow);
			//tipocostoTableCellFk.settipocostosForeignKeyActual(tipocostosForeignKey);
		//}


		if(tipocostoTableCellFk!=null) {
			tipocostoTableCellFk.RecargarTipoCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCosto(false);
			
			//if(!this.isEsNuevoCosto) {								
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				
			}
			
			if(this.permiteMantenimiento(this.costo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.costoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCosto=true;
					this.inicializarActualizarBindingTablaCosto(false);
					this.isEsNuevoCosto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCosto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCosto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCosto(false);
				
				this.habilitarDeshabilitarControlesCosto(false);
			
												
				
				if(CostoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCosto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCostoActionPerformed(evt,costoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCosto(this.costo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCosto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,costoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.costo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCosto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				this.costo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				this.costo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.costo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.costoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CostoModel) this.jTableDatosCosto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCosto=true;
				this.inicializarActualizarBindingTablaCosto(false);
				this.isEsNuevoCosto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCosto(false);
				
				this.habilitarDeshabilitarControlesCosto(false);
				
				
				
				if(CostoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCosto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCostoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCosto.getRowCount()>=1) {
				jTableDatosCosto.removeRowSelectionInterval(0, jTableDatosCosto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCosto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCosto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCosto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCosto(false) ;
			
			this.isEsNuevoCosto=false;
			
			if(CostoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCosto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCosto(false);
				
				//SI ES MANUAL
				if(CostoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCosto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCosto--;			
			//Costo costoAux= new Costo();			
			//costoAux.setId(this.iIdNuevoCosto);
			
			if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCosto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
			
			this.costo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.costoLogic.getCostos().add(this.costoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.costos.add(this.costoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCosto(false);
			
			this.jTableDatosCosto.setRowSelectionInterval(this.getIndiceNuevoCosto(), this.getIndiceNuevoCosto());
			
			int iLastRow =  this.jTableDatosCosto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCosto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCosto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCosto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCosto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCosto(false);
			
			//SI ES MANUAL
			if(CostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCosto();
			}
			
			//this.abrirFrameTreeCosto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CostoS ?", "MANTENIMIENTO DE Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCosto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCosto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.costoReturnGeneral=costoLogic.procesarImportacionCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.costoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCostoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCosto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCosto.setFileImportacion(this.jInternalFrameImportacionCosto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCosto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCosto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCosto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCosto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCostoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		

		costosSeleccionados=this.getCostosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CostoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CostoBaseDesign.jrxml";
			
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
			
			this.generarReporteCostos("Todos",costosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CostoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleMovimientoInventario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleMovimientoInventario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleMovimientoInventario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleMovimientoInventario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDTIPOCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_VALORUNITARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorUnitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorUnitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorUnitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorUnitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_VALORTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCosto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCosto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CostoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CostoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case CostoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case CostoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case CostoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					sNombreCampoCategoria="id_detalle_movimiento_inventario";
					break;

				case CostoConstantesFunciones.LABEL_IDTIPOCOSTO:
					sNombreCampoCategoria="id_tipo_costo";
					break;

				case CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case CostoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case CostoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case CostoConstantesFunciones.LABEL_VALORUNITARIO:
					sNombreCampoCategoria="valor_unitario";
					break;

				case CostoConstantesFunciones.LABEL_VALORTOTAL:
					sNombreCampoCategoria="valor_total";
					break;

				case CostoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case CostoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCosto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CostoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CostoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case CostoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case CostoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case CostoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					sNombreCampoCategoriaValor="id_detalle_movimiento_inventario";
					break;

				case CostoConstantesFunciones.LABEL_IDTIPOCOSTO:
					sNombreCampoCategoriaValor="id_tipo_costo";
					break;

				case CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case CostoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case CostoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case CostoConstantesFunciones.LABEL_VALORUNITARIO:
					sNombreCampoCategoriaValor="valor_unitario";
					break;

				case CostoConstantesFunciones.LABEL_VALORTOTAL:
					sNombreCampoCategoriaValor="valor_total";
					break;

				case CostoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case CostoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCosto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCosto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CostoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CostoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CostoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case CostoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case CostoConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case CostoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Movimiento Inventario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_movimiento_inventario");
					break;

				case CostoConstantesFunciones.LABEL_IDTIPOCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_costo");
					break;

				case CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case CostoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case CostoConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case CostoConstantesFunciones.LABEL_VALORUNITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Unitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_unitario");
					break;

				case CostoConstantesFunciones.LABEL_VALORTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_total");
					break;

				case CostoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case CostoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoCostoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Costos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CostoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getdetallemovimientoinventario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDTIPOCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDTIPOCOSTO);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.gettipocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_VALORUNITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_VALORUNITARIO);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getvalor_unitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_VALORTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_VALORTOTAL);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getvalor_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(Costo costo:costosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costo.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelCosto(row);				
			//	iRow++;
			//}				
			
			//for(Costo costoAux:costosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCosto(costoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
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
				this.costoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCosto(false);
			
			//SI ES MANUAL
			if(CostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCosto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCosto(false);
			
			//SI ES MANUAL
			if(CostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCosto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCosto(false);
			
			//SI ES MANUAL
			if(CostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCosto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCosto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCosto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCosto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCosto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCosto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCosto.setMinimumSize(dimensionMinimum);
		this.jTableDatosCosto.setMaximumSize(dimensionMaximum);
		this.jTableDatosCosto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCosto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCosto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCosto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCosto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCosto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCosto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCosto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCosto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CostoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CostoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCosto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCosto();
		
		this.inicializarActualizarBindingBotonesManualCosto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCosto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCosto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCosto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCosto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCosto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCosto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCosto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCosto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCosto.jCheckBoxPostAccionNuevoCosto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCosto.jCheckBoxPostAccionSinCerrarCosto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCosto.jCheckBoxPostAccionSinMensajeCosto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCosto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCosto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCosto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCosto!=null) {
				this.jInternalFrameDetalleFormCosto.jCheckBoxPostAccionNuevoCosto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCosto.jCheckBoxPostAccionSinCerrarCosto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCosto.jCheckBoxPostAccionSinMensajeCosto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCosto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCosto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCosto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCosto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCosto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCosto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCosto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCosto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCosto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCosto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCosto(Boolean esInicializar) throws Exception {
		try	{	
			if(CostoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCosto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCosto() throws Exception {
		try	{
			if(CostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCosto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCosto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCosto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCosto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCosto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCosto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCosto.addItem(reporte);
			}
			
			
			if(!this.costoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCosto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCosto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCosto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCosto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCosto!=null) {
				this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCosto!=null) {
				this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCosto!=null) {
				
				if(this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCosto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCosto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCosto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCosto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCosto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCosto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CostoConstantesFunciones.getTiposSeleccionarCosto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCosto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCosto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCosto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CostoConstantesFunciones.getTiposSeleccionarCosto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCosto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCosto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCosto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CostoConstantesFunciones.getTiposSeleccionarCosto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCosto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCosto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCosto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaCosto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaCosto.getSelectedItem()).getId();}
		if(this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.getSelectedItem()!=null){this.id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario=((DetalleMovimientoInventario)this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioCosto.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoCosto.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoCosto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_costoFK_IdTipoCostoCosto.getSelectedItem()!=null){this.id_tipo_costoFK_IdTipoCosto=((TipoCosto)this.jComboBoxid_tipo_costoFK_IdTipoCostoCosto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCosto(Boolean esInicializar) throws Exception {				
		if(CostoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCosto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCosto() throws Exception {
		this.inicializarActualizarBindingTablaCosto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCosto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCosto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCosto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCostoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCosto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCosto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCosto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=costoLogic.getCostos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=costos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCosto.setModel(new CostoModel(this.costoLogic.getCostos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCosto.setModel(new CostoModel(this.costos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCosto!=null && this.jInternalFrameOrderByCosto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCosto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CostoConstantesFunciones.SCLASSWEBTITULO,costoConstantesFunciones.resaltarSeleccionarCosto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CostoConstantesFunciones.SCLASSWEBTITULO,costoConstantesFunciones.resaltarSeleccionarCosto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_ID));

		if(this.costoConstantesFunciones.mostraridCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.costoConstantesFunciones.resaltaridCosto,this.costoConstantesFunciones.activaridCosto,iSizeTabla,this,true,"idCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.costoConstantesFunciones.resaltaridCosto,this.costoConstantesFunciones.activaridCosto,this,true,"idCosto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.costoConstantesFunciones.mostrarid_empresaCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.costoConstantesFunciones.resaltarid_empresaCosto,this,this.costoConstantesFunciones.activarid_empresaCosto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.costoConstantesFunciones.resaltarid_empresaCosto,this,this.costoConstantesFunciones.activarid_empresaCosto,false,"id_empresaCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.costoConstantesFunciones.mostrarid_sucursalCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.costoConstantesFunciones.resaltarid_sucursalCosto,this,this.costoConstantesFunciones.activarid_sucursalCosto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.costoConstantesFunciones.resaltarid_sucursalCosto,this,this.costoConstantesFunciones.activarid_sucursalCosto,false,"id_sucursalCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDBODEGA));

		if(this.costoConstantesFunciones.mostrarid_bodegaCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.costoConstantesFunciones.resaltarid_bodegaCosto,this,this.costoConstantesFunciones.activarid_bodegaCosto,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.costoConstantesFunciones.resaltarid_bodegaCosto,this,this.costoConstantesFunciones.activarid_bodegaCosto,true,"id_bodegaCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.costoConstantesFunciones.mostrarid_productoCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.costoConstantesFunciones.resaltarid_productoCosto,this,this.costoConstantesFunciones.activarid_productoCosto,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.costoConstantesFunciones.resaltarid_productoCosto,this,this.costoConstantesFunciones.activarid_productoCosto,true,"id_productoCosto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDPERIODO));

		if(this.costoConstantesFunciones.mostrarid_periodoCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.costoConstantesFunciones.resaltarid_periodoCosto,this,this.costoConstantesFunciones.activarid_periodoCosto,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.costoConstantesFunciones.resaltarid_periodoCosto,this,this.costoConstantesFunciones.activarid_periodoCosto,false,"id_periodoCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.costoConstantesFunciones.mostrarid_ejercicioCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.costoConstantesFunciones.resaltarid_ejercicioCosto,this,this.costoConstantesFunciones.activarid_ejercicioCosto,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.costoConstantesFunciones.resaltarid_ejercicioCosto,this,this.costoConstantesFunciones.activarid_ejercicioCosto,false,"id_ejercicioCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO));

		if(this.costoConstantesFunciones.mostrarid_detalle_movimiento_inventarioCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleMovimientoInventarioTableCell(this.detallemovimientoinventariosForeignKey,this.costoConstantesFunciones.resaltarid_detalle_movimiento_inventarioCosto,this,this.costoConstantesFunciones.activarid_detalle_movimiento_inventarioCosto,iSizeTabla));
			tableColumn.setCellEditor(new DetalleMovimientoInventarioTableCell(this.detallemovimientoinventariosForeignKey,this.costoConstantesFunciones.resaltarid_detalle_movimiento_inventarioCosto,this,this.costoConstantesFunciones.activarid_detalle_movimiento_inventarioCosto,true,"id_detalle_movimiento_inventarioCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDTIPOCOSTO));

		if(this.costoConstantesFunciones.mostrarid_tipo_costoCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDTIPOCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCostoTableCell(this.tipocostosForeignKey,this.costoConstantesFunciones.resaltarid_tipo_costoCosto,this,this.costoConstantesFunciones.activarid_tipo_costoCosto,iSizeTabla));
			tableColumn.setCellEditor(new TipoCostoTableCell(this.tipocostosForeignKey,this.costoConstantesFunciones.resaltarid_tipo_costoCosto,this,this.costoConstantesFunciones.activarid_tipo_costoCosto,true,"id_tipo_costoCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.costoConstantesFunciones.mostrarnumero_comprobanteCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.costoConstantesFunciones.resaltarnumero_comprobanteCosto,this.costoConstantesFunciones.activarnumero_comprobanteCosto,iSizeTabla,this,true,"numero_comprobanteCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.costoConstantesFunciones.resaltarnumero_comprobanteCosto,this.costoConstantesFunciones.activarnumero_comprobanteCosto,this,true,"numero_comprobanteCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_FECHA));

		if(this.costoConstantesFunciones.mostrarfechaCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.costoConstantesFunciones.resaltarfechaCosto,this.costoConstantesFunciones.activarfechaCosto,iSizeTabla,this,true,"fechaCosto","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.costoConstantesFunciones.resaltarfechaCosto,this.costoConstantesFunciones.activarfechaCosto,this,true,"fechaCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_CANTIDAD));

		if(this.costoConstantesFunciones.mostrarcantidadCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.costoConstantesFunciones.resaltarcantidadCosto,this.costoConstantesFunciones.activarcantidadCosto,iSizeTabla,this,true,"cantidadCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.costoConstantesFunciones.resaltarcantidadCosto,this.costoConstantesFunciones.activarcantidadCosto,this,true,"cantidadCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_VALORUNITARIO));

		if(this.costoConstantesFunciones.mostrarvalor_unitarioCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_VALORUNITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.costoConstantesFunciones.resaltarvalor_unitarioCosto,this.costoConstantesFunciones.activarvalor_unitarioCosto,iSizeTabla,this,true,"valor_unitarioCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.costoConstantesFunciones.resaltarvalor_unitarioCosto,this.costoConstantesFunciones.activarvalor_unitarioCosto,this,true,"valor_unitarioCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_VALORTOTAL));

		if(this.costoConstantesFunciones.mostrarvalor_totalCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_VALORTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.costoConstantesFunciones.resaltarvalor_totalCosto,this.costoConstantesFunciones.activarvalor_totalCosto,iSizeTabla,this,true,"valor_totalCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.costoConstantesFunciones.resaltarvalor_totalCosto,this.costoConstantesFunciones.activarvalor_totalCosto,this,true,"valor_totalCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDANIO));

		if(this.costoConstantesFunciones.mostrarid_anioCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.costoConstantesFunciones.resaltarid_anioCosto,this,this.costoConstantesFunciones.activarid_anioCosto,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.costoConstantesFunciones.resaltarid_anioCosto,this,this.costoConstantesFunciones.activarid_anioCosto,true,"id_anioCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCosto,CostoConstantesFunciones.LABEL_IDMES));

		if(this.costoConstantesFunciones.mostrarid_mesCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.costoConstantesFunciones.resaltarid_mesCosto,this,this.costoConstantesFunciones.activarid_mesCosto,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.costoConstantesFunciones.resaltarid_mesCosto,this,this.costoConstantesFunciones.activarid_mesCosto,true,"id_mesCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.costoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.costoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.costoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCosto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.costoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.costoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCosto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCosto && this.isPermisoGuardarCambiosCosto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.costoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.costoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCosto.addColumn(tableColumn);
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
			
			this.jTableDatosCosto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCosto && this.isPermisoGuardarCambiosCosto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCosto && this.isPermisoGuardarCambiosCosto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCosto.moveColumn(this.jTableDatosCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCosto.moveColumn(this.jTableDatosCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCosto.moveColumn(this.jTableDatosCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCosto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCosto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCosto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCosto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCosto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCosto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCosto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCosto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=costoLogic.getCostos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=costos.size()-1;
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
		//this.jTableDatosCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCosto();
			
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
				
				//this.isEsNuevoCosto=false;
					
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
				if(this.costoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCosto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCosto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.costo.getsType().equals("DUPLICADO")
				   || this.costo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCosto=true;
				
				} else {
					this.isEsNuevoCosto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.costoSessionBean.getEsGuardarRelacionado()) {
					if(this.costo.getId()>=0 && !this.costo.getIsNew()) {						
						this.isEsNuevoCosto=false;
						
					} else {
						this.isEsNuevoCosto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCosto(esRelaciones);						
				
				this.seleccionarCosto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.costo.getId()<0) {
					this.isEsNuevoCosto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCosto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCosto(evt,rowIndex);
				}	
				
				if(this.costoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Costo: " + this.dDif); 
					}
				}								
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCosto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.costo)) {
					if(this.costo.getId()>0) {
						this.costo.setIsDeleted(true);
						
						this.costosEliminados.add(this.costo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.costoLogic.getCostos().remove(this.costo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.costos.remove(this.costo);				
					}
					
					
					((CostoModel) this.jTableDatosCosto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCosto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCosto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCosto) {
			
			if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCosto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCosto(this.costo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.costoConstantesFunciones.cargarid_empresaCosto || this.costoConstantesFunciones.event_dependid_empresaCosto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.costo.getid_empresa());
									//this.inicializarActualizarBindingCosto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(costo.getEmpresa()!=null) {
							this.empresasForeignKey.add(costo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.costo.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.costoConstantesFunciones.cargarid_sucursalCosto || this.costoConstantesFunciones.event_dependid_sucursalCosto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.costo.getid_sucursal());
									//this.inicializarActualizarBindingCosto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(costo.getSucursal()!=null) {
							this.sucursalsForeignKey.add(costo.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.costo.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.costoConstantesFunciones.cargarid_bodegaCosto || this.costoConstantesFunciones.event_dependid_bodegaCosto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.costo.getid_bodega());
									//this.inicializarActualizarBindingCosto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(costo.getBodega()!=null) {
							this.bodegasForeignKey.add(costo.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.costo.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.costoConstantesFunciones.cargarid_productoCosto || this.costoConstantesFunciones.event_dependid_productoCosto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.costo.getid_producto());
									//this.inicializarActualizarBindingCosto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(costo.getProducto()!=null) {
							this.productosForeignKey.add(costo.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.costo.getid_producto(),false,"Formulario");

					//Periodo
					if(!this.costoConstantesFunciones.cargarid_periodoCosto || this.costoConstantesFunciones.event_dependid_periodoCosto) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.costo.getid_periodo());
									//this.inicializarActualizarBindingCosto(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(costo.getPeriodo()!=null) {
							this.periodosForeignKey.add(costo.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.costo.getid_periodo(),false,"Formulario");

					//Ejercicio
					if(!this.costoConstantesFunciones.cargarid_ejercicioCosto || this.costoConstantesFunciones.event_dependid_ejercicioCosto) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.costo.getid_ejercicio());
									//this.inicializarActualizarBindingCosto(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(costo.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(costo.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.costo.getid_ejercicio(),false,"Formulario");

					//DetalleMovimientoInventario
					if(!this.costoConstantesFunciones.cargarid_detalle_movimiento_inventarioCosto || this.costoConstantesFunciones.event_dependid_detalle_movimiento_inventarioCosto) {
						//this.cargarCombosDetalleMovimientoInventariosForeignKeyLista(" where id="+this.costo.getid_detalle_movimiento_inventario());
									//this.inicializarActualizarBindingCosto(false,false);
						this.detallemovimientoinventariosForeignKey=new ArrayList<DetalleMovimientoInventario>();

						if(costo.getDetalleMovimientoInventario()!=null) {
							this.detallemovimientoinventariosForeignKey.add(costo.getDetalleMovimientoInventario());
						}

						this.addItemDefectoCombosForeignKeyDetalleMovimientoInventario();
						this.cargarCombosFrameDetalleMovimientoInventariosForeignKey("Todos");
					}
					this.setActualDetalleMovimientoInventarioForeignKey(this.costo.getid_detalle_movimiento_inventario(),false,"Formulario");

					//TipoCosto
					if(!this.costoConstantesFunciones.cargarid_tipo_costoCosto || this.costoConstantesFunciones.event_dependid_tipo_costoCosto) {
						//this.cargarCombosTipoCostosForeignKeyLista(" where id="+this.costo.getid_tipo_costo());
									//this.inicializarActualizarBindingCosto(false,false);
						this.tipocostosForeignKey=new ArrayList<TipoCosto>();

						if(costo.getTipoCosto()!=null) {
							this.tipocostosForeignKey.add(costo.getTipoCosto());
						}

						this.addItemDefectoCombosForeignKeyTipoCosto();
						this.cargarCombosFrameTipoCostosForeignKey("Todos");
					}
					this.setActualTipoCostoForeignKey(this.costo.getid_tipo_costo(),false,"Formulario");

					//Anio
					if(!this.costoConstantesFunciones.cargarid_anioCosto || this.costoConstantesFunciones.event_dependid_anioCosto) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.costo.getid_anio());
									//this.inicializarActualizarBindingCosto(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(costo.getAnio()!=null) {
							this.aniosForeignKey.add(costo.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.costo.getid_anio(),false,"Formulario");

					//Mes
					if(!this.costoConstantesFunciones.cargarid_mesCosto || this.costoConstantesFunciones.event_dependid_mesCosto) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.costo.getid_mes());
									//this.inicializarActualizarBindingCosto(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(costo.getMes()!=null) {
							this.messForeignKey.add(costo.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.costo.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCosto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCosto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCosto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCosto(Costo costo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCosto(costo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCosto(Costo costo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCosto(costo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCosto(costo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCosto(costo);
	}
	
	public void setVariablesObjetoActualToFormularioCosto(Costo costo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCosto.jLabelidCosto.setText(costo.getId().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldnumero_comprobanteCosto.setText(costo.getnumero_comprobante().toString());
			this.jInternalFrameDetalleFormCosto.jDateChooserfechaCosto.setDate(costo.getfecha());
			this.jInternalFrameDetalleFormCosto.jTextFieldcantidadCosto.setText(costo.getcantidad().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldvalor_unitarioCosto.setText(costo.getvalor_unitario().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldvalor_totalCosto.setText(costo.getvalor_total().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Costo costoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,costoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Costo costoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				costoLocal=this.costo;
			} else {
				costoLocal=this.costoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(costoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCosto(costoLocal,true);
					
					if(costoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(costoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.costoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(costoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCosto(Costo costo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCosto(costo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCosto(costo);
	}
	
	public void setVariablesFormularioToObjetoActualCosto(Costo costo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCosto(costo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCosto(Costo costo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCosto.jLabelidCosto.getText()==null || this.jInternalFrameDetalleFormCosto.jLabelidCosto.getText()=="" || this.jInternalFrameDetalleFormCosto.jLabelidCosto.getText()=="Id") {
				this.jInternalFrameDetalleFormCosto.jLabelidCosto.setText("0");
			}

			if(conColumnasBase) {costo.setId(Long.parseLong(this.jInternalFrameDetalleFormCosto.jLabelidCosto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelIdCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costo.setnumero_comprobante(Long.parseLong(this.jInternalFrameDetalleFormCosto.jTextFieldnumero_comprobanteCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelnumero_comprobanteCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costo.setfecha(this.jInternalFrameDetalleFormCosto.jDateChooserfechaCosto.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelfechaCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costo.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormCosto.jTextFieldcantidadCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelcantidadCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costo.setvalor_unitario(Double.parseDouble(this.jInternalFrameDetalleFormCosto.jTextFieldvalor_unitarioCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoConstantesFunciones.LABEL_VALORUNITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelvalor_unitarioCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costo.setvalor_total(Double.parseDouble(this.jInternalFrameDetalleFormCosto.jTextFieldvalor_totalCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoConstantesFunciones.LABEL_VALORTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCosto.jLabelvalor_totalCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCosto(Costo costoBean,Costo costo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCosto(Costo costoOrigen,Costo costo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && costoOrigen.getId()!=null && !costoOrigen.getId().equals(0L))) {costo.setId(costoOrigen.getId());}}
			if(conDefault || (!conDefault && costoOrigen.getnumero_comprobante()!=null && !costoOrigen.getnumero_comprobante().equals(0L))) {costo.setnumero_comprobante(costoOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && costoOrigen.getfecha()!=null && !costoOrigen.getfecha().equals(new Date()))) {costo.setfecha(costoOrigen.getfecha());}
			if(conDefault || (!conDefault && costoOrigen.getcantidad()!=null && !costoOrigen.getcantidad().equals(0))) {costo.setcantidad(costoOrigen.getcantidad());}
			if(conDefault || (!conDefault && costoOrigen.getvalor_unitario()!=null && !costoOrigen.getvalor_unitario().equals(0.0))) {costo.setvalor_unitario(costoOrigen.getvalor_unitario());}
			if(conDefault || (!conDefault && costoOrigen.getvalor_total()!=null && !costoOrigen.getvalor_total().equals(0.0))) {costo.setvalor_total(costoOrigen.getvalor_total());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCosto(Costo costo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCosto.jLabelidCosto.setText(costo.getId().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldnumero_comprobanteCosto.setText(costo.getnumero_comprobante().toString());
			this.jInternalFrameDetalleFormCosto.jDateChooserfechaCosto.setDate(costo.getfecha());
			this.jInternalFrameDetalleFormCosto.jTextFieldcantidadCosto.setText(costo.getcantidad().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldvalor_unitarioCosto.setText(costo.getvalor_unitario().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldvalor_totalCosto.setText(costo.getvalor_total().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCosto(CostoBean costoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCosto.jLabelidCosto.setText(costoBean.getId().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldnumero_comprobanteCosto.setText(costoBean.getnumero_comprobante().toString());
			this.jInternalFrameDetalleFormCosto.jDateChooserfechaCosto.setDate(costoBean.getfecha());
			this.jInternalFrameDetalleFormCosto.jTextFieldcantidadCosto.setText(costoBean.getcantidad().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldvalor_unitarioCosto.setText(costoBean.getvalor_unitario().toString());
			this.jInternalFrameDetalleFormCosto.jTextFieldvalor_totalCosto.setText(costoBean.getvalor_total().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCosto(CostoParameterReturnGeneral costoReturnGeneral,CostoBean costoBean,Boolean conDefault) throws Exception { 
		try {
			Costo costoLocal=new Costo();
			
			costoLocal=costoReturnGeneral.getCosto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && costoLocal.getId()!=null && !costoLocal.getId().equals(0L))) {costoBean.setId(costoLocal.getId());}}
			if(conDefault || (!conDefault && costoLocal.getnumero_comprobante()!=null && !costoLocal.getnumero_comprobante().equals(0L))) {costoBean.setnumero_comprobante(costoLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && costoLocal.getfecha()!=null && !costoLocal.getfecha().equals(new Date()))) {costoBean.setfecha(costoLocal.getfecha());}
			if(conDefault || (!conDefault && costoLocal.getcantidad()!=null && !costoLocal.getcantidad().equals(0))) {costoBean.setcantidad(costoLocal.getcantidad());}
			if(conDefault || (!conDefault && costoLocal.getvalor_unitario()!=null && !costoLocal.getvalor_unitario().equals(0.0))) {costoBean.setvalor_unitario(costoLocal.getvalor_unitario());}
			if(conDefault || (!conDefault && costoLocal.getvalor_total()!=null && !costoLocal.getvalor_total().equals(0.0))) {costoBean.setvalor_total(costoLocal.getvalor_total());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCostoGenerico(Long idCostoSeleccionado,JComboBox jComboBoxCosto,List<Costo> costosLocal)throws Exception {
		try {
			Costo  costoTemp=null;

			for(Costo costoAux:costosLocal) {
				if(costoAux.getId()!=null && costoAux.getId().equals(idCostoSeleccionado)) {
					costoTemp=costoAux;
					break;
				}
			}

			jComboBoxCosto.setSelectedItem(costoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCostoGenerico(JComboBox jComboBoxCosto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCosto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCosto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			costo=(Costo) costoLogic.getCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			costo =(Costo) costos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("DetalleMovimientoInventario")) {
			//sDescripcion=this.getActualDetalleMovimientoInventarioForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getdetallemovimientoinventario_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleMovimientoInventarioForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getdetallemovimientoinventario_descripcion();
			}
		}

		if(sTipo.equals("TipoCosto")) {
			//sDescripcion=this.getActualTipoCostoForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.gettipocosto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCostoForeignKeyDescripcion((Long)value);
				sDescripcion=costo.gettipocosto_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!costo.getIsNew() && !costo.getIsChanged() && !costo.getIsDeleted()) {
				sDescripcion=costo.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=costo.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Costo costoRow=new Costo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			costoRow=(Costo) costoLogic.getCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			costoRow=(Costo) costos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCosto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCosto.setVisible((this.isVisibilidadCeldaNuevoCosto && this.isPermisoNuevoCosto));			
			this.jButtonDuplicarCosto.setVisible((this.isVisibilidadCeldaDuplicarCosto && this.isPermisoDuplicarCosto));			
			this.jButtonCopiarCosto.setVisible((this.isVisibilidadCeldaCopiarCosto && this.isPermisoCopiarCosto));
			this.jButtonVerFormCosto.setVisible((this.isVisibilidadCeldaVerFormCosto && this.isPermisoVerFormCosto));
			
			this.jButtonAbrirOrderByCosto.setVisible((this.isVisibilidadCeldaOrdenCosto && this.isPermisoOrdenCosto));			
			
			this.jButtonNuevoRelacionesCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCosto && this.isPermisoNuevoCosto));			
			this.jButtonNuevoGuardarCambiosCosto.setVisible((this.isVisibilidadCeldaNuevoCosto && this.isPermisoNuevoCosto && this.isPermisoGuardarCambiosCosto));
			
			if(this.jInternalFrameDetalleFormCosto!=null) {
			this.jInternalFrameDetalleFormCosto.jButtonModificarCosto.setVisible((this.isVisibilidadCeldaModificarCosto && this.isPermisoActualizarCosto));	
			this.jInternalFrameDetalleFormCosto.jButtonActualizarCosto.setVisible((this.isVisibilidadCeldaActualizarCosto && this.isPermisoActualizarCosto));	
			this.jInternalFrameDetalleFormCosto.jButtonEliminarCosto.setVisible((this.isVisibilidadCeldaEliminarCosto && this.isPermisoEliminarCosto));
			this.jInternalFrameDetalleFormCosto.jButtonCancelarCosto.setVisible(this.isVisibilidadCeldaCancelarCosto);							
			this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosCosto.setVisible((this.isVisibilidadCeldaGuardarCosto && this.isPermisoGuardarCambiosCosto));			
			
			}
						
			this.jButtonGuardarCambiosTablaCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosCosto && this.isPermisoGuardarCambiosCosto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCosto.setVisible((this.isVisibilidadCeldaNuevoCosto && this.isPermisoNuevoCosto));						
			this.jButtonDuplicarToolBarCosto.setVisible((this.isVisibilidadCeldaDuplicarCosto && this.isPermisoDuplicarCosto));						
			this.jButtonCopiarToolBarCosto.setVisible((this.isVisibilidadCeldaCopiarCosto && this.isPermisoCopiarCosto));			
			this.jButtonVerFormToolBarCosto.setVisible((this.isVisibilidadCeldaVerFormCosto && this.isPermisoVerFormCosto));			
			this.jButtonAbrirOrderByToolBarCosto.setVisible((this.isVisibilidadCeldaOrdenCosto && this.isPermisoOrdenCosto));
			this.jButtonNuevoRelacionesToolBarCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCosto && this.isPermisoNuevoCosto));			
			this.jButtonNuevoGuardarCambiosToolBarCosto.setVisible((this.isVisibilidadCeldaNuevoCosto && this.isPermisoNuevoCosto && this.isPermisoGuardarCambiosCosto));			
			
			if(this.jInternalFrameDetalleFormCosto!=null) {
			this.jInternalFrameDetalleFormCosto.jButtonModificarToolBarCosto.setVisible((this.isVisibilidadCeldaModificarCosto && this.isPermisoActualizarCosto));	
			this.jInternalFrameDetalleFormCosto.jButtonActualizarToolBarCosto.setVisible((this.isVisibilidadCeldaActualizarCosto  && this.isPermisoActualizarCosto));	
			this.jInternalFrameDetalleFormCosto.jButtonEliminarToolBarCosto.setVisible((this.isVisibilidadCeldaEliminarCosto && this.isPermisoEliminarCosto));
			this.jInternalFrameDetalleFormCosto.jButtonCancelarToolBarCosto.setVisible(this.isVisibilidadCeldaCancelarCosto);				
			this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosToolBarCosto.setVisible((this.isVisibilidadCeldaGuardarCosto && this.isPermisoGuardarCambiosCosto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosCosto && this.isPermisoGuardarCambiosCosto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCosto.setVisible((this.isVisibilidadCeldaNuevoCosto && this.isPermisoNuevoCosto));			
			this.jMenuItemDuplicarCosto.setVisible((this.isVisibilidadCeldaDuplicarCosto && this.isPermisoDuplicarCosto));			
			this.jMenuItemCopiarCosto.setVisible((this.isVisibilidadCeldaCopiarCosto && this.isPermisoCopiarCosto));			
			this.jMenuItemVerFormCosto.setVisible((this.isVisibilidadCeldaVerFormCosto && this.isPermisoVerFormCosto));			
			this.jMenuItemAbrirOrderByCosto.setVisible((this.isVisibilidadCeldaOrdenCosto && this.isPermisoOrdenCosto));			
			//this.jMenuItemMostrarOcultarCosto.setVisible((this.isVisibilidadCeldaOrdenCosto && this.isPermisoOrdenCosto));
			this.jMenuItemDetalleAbrirOrderByCosto.setVisible((this.isVisibilidadCeldaOrdenCosto && this.isPermisoOrdenCosto));			
			//this.jMenuItemDetalleMostrarOcultarCosto.setVisible((this.isVisibilidadCeldaOrdenCosto && this.isPermisoOrdenCosto));			
			this.jMenuItemNuevoRelacionesCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCosto && this.isPermisoNuevoCosto));			
			this.jMenuItemNuevoGuardarCambiosCosto.setVisible((this.isVisibilidadCeldaNuevoCosto && this.isPermisoNuevoCosto && this.isPermisoGuardarCambiosCosto));									
			
			if(this.jInternalFrameDetalleFormCosto!=null) {
			this.jInternalFrameDetalleFormCosto.jMenuItemModificarCosto.setVisible((this.isVisibilidadCeldaModificarCosto && this.isPermisoActualizarCosto));	
			this.jInternalFrameDetalleFormCosto.jMenuItemActualizarCosto.setVisible((this.isVisibilidadCeldaActualizarCosto && this.isPermisoActualizarCosto));	
			this.jInternalFrameDetalleFormCosto.jMenuItemEliminarCosto.setVisible((this.isVisibilidadCeldaEliminarCosto && this.isPermisoEliminarCosto));
			this.jInternalFrameDetalleFormCosto.jMenuItemCancelarCosto.setVisible(this.isVisibilidadCeldaCancelarCosto);				
			}
			
			this.jMenuItemGuardarCambiosCosto.setVisible((this.isVisibilidadCeldaGuardarCosto && this.isPermisoGuardarCambiosCosto));						
			this.jMenuItemGuardarCambiosTablaCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosCosto && this.isPermisoGuardarCambiosCosto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCosto=this.jButtonNuevoCosto.isVisible();
			this.isVisibilidadCeldaDuplicarCosto=this.jButtonDuplicarCosto.isVisible();
			this.isVisibilidadCeldaCopiarCosto=this.jButtonCopiarCosto.isVisible();
			this.isVisibilidadCeldaVerFormCosto=this.jButtonVerFormCosto.isVisible();
			
			this.isVisibilidadCeldaOrdenCosto=this.jButtonAbrirOrderByCosto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCosto=this.jButtonNuevoRelacionesCosto.isVisible();
			this.isVisibilidadCeldaModificarCosto=this.jButtonModificarCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormCosto!=null) {
			this.isVisibilidadCeldaActualizarCosto=this.jInternalFrameDetalleFormCosto.jButtonActualizarCosto.isVisible();
			this.isVisibilidadCeldaEliminarCosto=this.jInternalFrameDetalleFormCosto.jButtonEliminarCosto.isVisible();
			this.isVisibilidadCeldaCancelarCosto=this.jInternalFrameDetalleFormCosto.jButtonCancelarCosto.isVisible();
			this.isVisibilidadCeldaGuardarCosto=this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosCosto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCosto=this.jButtonGuardarCambiosTablaCosto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCosto=this.jButtonNuevoToolBarCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCosto=this.jButtonNuevoRelacionesToolBarCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormCosto!=null) {
			this.isVisibilidadCeldaModificarCosto=this.jInternalFrameDetalleFormCosto.jButtonModificarToolBarCosto.isVisible();
			this.isVisibilidadCeldaActualizarCosto=this.jInternalFrameDetalleFormCosto.jButtonActualizarToolBarCosto.isVisible();
			this.isVisibilidadCeldaEliminarCosto=this.jInternalFrameDetalleFormCosto.jButtonEliminarToolBarCosto.isVisible();
			this.isVisibilidadCeldaCancelarCosto=this.jInternalFrameDetalleFormCosto.jButtonCancelarToolBarCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCosto=this.jButtonGuardarCambiosToolBarCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCosto=this.jButtonGuardarCambiosTablaToolBarCosto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCosto=this.jMenuItemNuevoCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCosto=this.jMenuItemNuevoRelacionesCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormCosto!=null) {
			this.isVisibilidadCeldaModificarCosto=this.jInternalFrameDetalleFormCosto.jMenuItemModificarCosto.isVisible();
			this.isVisibilidadCeldaActualizarCosto=this.jInternalFrameDetalleFormCosto.jMenuItemActualizarCosto.isVisible();
			this.isVisibilidadCeldaEliminarCosto=this.jInternalFrameDetalleFormCosto.jMenuItemEliminarCosto.isVisible();
			this.isVisibilidadCeldaCancelarCosto=this.jInternalFrameDetalleFormCosto.jMenuItemCancelarCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCosto=this.jMenuItemGuardarCambiosCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCosto=this.jMenuItemGuardarCambiosTablaCosto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCosto(Boolean esInicializar) {
		if(CostoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.costoSessionBean.getConGuardarRelaciones()) {
				//if(this.costoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCosto();
			}
			
			this.inicializarActualizarBindingBotonesManualCosto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCosto() {
		this.jButtonNuevoCosto.setVisible(this.isPermisoNuevoCosto);			
		this.jButtonDuplicarCosto.setVisible(this.isPermisoDuplicarCosto);			
		this.jButtonCopiarCosto.setVisible(this.isPermisoCopiarCosto);			
		this.jButtonVerFormCosto.setVisible(this.isPermisoVerFormCosto);			
		
		this.jButtonAbrirOrderByCosto.setVisible(this.isPermisoOrdenCosto);					
		
		this.jButtonNuevoRelacionesCosto.setVisible(this.isPermisoNuevoCosto);			
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonModificarCosto.setVisible(this.isPermisoActualizarCosto);	
			this.jInternalFrameDetalleFormCosto.jButtonActualizarCosto.setVisible(this.isPermisoActualizarCosto);	
			this.jInternalFrameDetalleFormCosto.jButtonEliminarCosto.setVisible(this.isPermisoEliminarCosto);
			this.jInternalFrameDetalleFormCosto.jButtonCancelarCosto.setVisible(this.isVisibilidadCeldaCancelarCosto);						
			this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosCosto.setVisible(this.isPermisoGuardarCambiosCosto);							
		}
		
		this.jButtonGuardarCambiosTablaCosto.setVisible(this.isPermisoActualizarCosto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCosto() {
		this.jInternalFrameDetalleFormCosto.jButtonModificarCosto.setVisible(this.isPermisoActualizarCosto);	
		this.jInternalFrameDetalleFormCosto.jButtonActualizarCosto.setVisible(this.isPermisoActualizarCosto);	
		this.jInternalFrameDetalleFormCosto.jButtonEliminarCosto.setVisible(this.isPermisoEliminarCosto);
		this.jInternalFrameDetalleFormCosto.jButtonCancelarCosto.setVisible(this.isVisibilidadCeldaCancelarCosto);							
		this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosCosto.setVisible((this.isVisibilidadCeldaGuardarCosto && this.isPermisoGuardarCambiosCosto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCosto() {
		if(CostoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCosto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCosto() {
	}
	
	public void jTableDatosCostoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCosto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.costo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCosto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.costo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCosto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.costo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCosto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.costo.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCosto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.costo.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebCosto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.costo.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderCosto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.costo.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoCostoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCosto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosCosto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderCosto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebCosto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.costo.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderCosto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.costo.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebCosto(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.costo.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderCosto.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.costo.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebCosto(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.costo.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderCosto.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.costo.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_movimiento_inventarioCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetallemovimientoinventario=true;

			idTienePermisodetallemovimientoinventario=this.tienePermisosUsuarioEnPaginaWebCosto(DetalleMovimientoInventarioConstantesFunciones.CLASSNAME);

			if(idTienePermisodetallemovimientoinventario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detallemovimientoinventarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleMovimientoInventarioLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_detalle_movimiento_inventario()!=null) {
					this.detallemovimientoinventarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detallemovimientoinventarioBeanSwingJInternalFrame.setIdActual(this.costo.getid_detalle_movimiento_inventario());
					this.detallemovimientoinventarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detallemovimientoinventarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario();
				}

				JInternalFrameBase jinternalFrame =this.detallemovimientoinventarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBorderdetallemovimientoinventario=(TitledBorder)this.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.getBorder();

				titledBorderdetallemovimientoinventario.setTitle(titledBorderCosto.getTitle() + " -> Detalle Movimiento Inventario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_movimiento_inventarioCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_detalle_movimiento_inventario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_movimiento_inventario = "+this.costo.getid_detalle_movimiento_inventario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_costoCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocosto=true;

			idTienePermisotipocosto=this.tienePermisosUsuarioEnPaginaWebCosto(TipoCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.tipocostoBeanSwingJInternalFrame=new TipoCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocostoBeanSwingJInternalFrame.getTipoCostoLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_tipo_costo()!=null) {
					this.tipocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocostoBeanSwingJInternalFrame.setIdActual(this.costo.getid_tipo_costo());
					this.tipocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCosto();
				}

				JInternalFrameBase jinternalFrame =this.tipocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBordertipocosto=(TitledBorder)this.tipocostoBeanSwingJInternalFrame.jScrollPanelDatosTipoCosto.getBorder();

				titledBordertipocosto.setTitle(titledBorderCosto.getTitle() + " -> Tipo Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_costoCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_tipo_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_costo = "+this.costo.getid_tipo_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante = "+this.costo.getnumero_comprobante().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.costo.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.costo.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_unitarioCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getvalor_unitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_unitario = "+this.costo.getvalor_unitario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_totalCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getvalor_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_total = "+this.costo.getvalor_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebCosto(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.costo.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderCosto.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.costo.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebCosto(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.costoLogic.getConnexion());

				if(this.costo.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.costo.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCosto=(TitledBorder)this.jScrollPanelDatosCosto.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderCosto.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCosto(this.getcosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costo==null) {
						this.costo = new Costo();
					}

					this.setVariablesFormularioToObjetoActualCosto(this.costo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);
				}

				if(this.costo.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.costo.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdAnio();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdBodega();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleMovimientoInventarioCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdDetalleMovimientoInventario();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdEjercicio();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdEmpresa();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdMes();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdPeriodo();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdProducto();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdSucursal();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCostoCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCosto(false,false);

			this.getCostosFK_IdTipoCosto();

			this.inicializarActualizarBindingCosto(false);

			//if(CostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCosto() {
		if(this.jInternalFrameDetalleFormCosto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCosto!=null) {
			this.jInternalFrameDetalleFormCosto.setVisible(false);	    			
			this.jInternalFrameDetalleFormCosto.dispose();
			this.jInternalFrameDetalleFormCosto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCosto!=null) {
			this.jInternalFrameReporteDinamicoCosto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCosto.dispose();
			this.jInternalFrameReporteDinamicoCosto=null;
		}
		
		if(this.jInternalFrameImportacionCosto!=null) {
			this.jInternalFrameImportacionCosto.setVisible(false);	    			
			this.jInternalFrameImportacionCosto.dispose();
			this.jInternalFrameImportacionCosto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCosto();
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCosto")) {
				jButtonNuevoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCosto")) {
				jButtonDuplicarCostoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCosto")) {
				jButtonCopiarCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCosto")) {
				jButtonVerFormCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCosto")) {
				jButtonNuevoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCosto")) {
				jButtonDuplicarCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCosto")) {
				jButtonNuevoCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCosto")) {
				jButtonDuplicarCostoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCosto")) {
				jButtonNuevoCostoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCosto")) {
				jButtonNuevoCostoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCosto")) {
				jButtonNuevoCostoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCosto")) {
				jButtonModificarCostoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCosto")) {
				jButtonModificarCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCosto")) {
				jButtonModificarCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCosto")) {
				jButtonActualizarCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCosto")) {
				jButtonActualizarCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCosto")) {
				jButtonActualizarCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCosto")) {
				jButtonEliminarCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCosto")) {
				jButtonEliminarCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCosto")) {
				jButtonEliminarCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCosto")) {
				jButtonCancelarCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCosto")) {
				jButtonCancelarCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCosto")) {
				jButtonCancelarCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCosto")) {
				jButtonCerrarCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCosto")) {
				jButtonCerrarCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCosto")) {
				jButtonCerrarCostoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCosto")) {
				jButtonMostrarOcultarCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCosto")) {
				jButtonCancelarCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCosto")) {
				jButtonGuardarCambiosCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCosto")) {
				jButtonGuardarCambiosCostoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCosto")) {
				jButtonCopiarCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCosto")) {
				jButtonVerFormCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCosto")) {
				jButtonGuardarCambiosCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCosto")) {
				jButtonCopiarCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCosto")) {
				jButtonVerFormCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCosto")) {
				jButtonGuardarCambiosCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCosto")) {
				jButtonGuardarCambiosCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCosto")) {
				jButtonGuardarCambiosCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCosto")) {
				jButtonRecargarInformacionCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCosto")) {
				jButtonRecargarInformacionCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCosto")) {
				jButtonRecargarInformacionCostoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCosto")) {
				jButtonAnterioresCostoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCosto")) {
				jButtonAnterioresCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCosto")) {
				jButtonAnterioresCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCosto")) {
				jButtonSiguientesCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCosto")) {
				jButtonSiguientesCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCosto")) {
				jButtonSiguientesCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCosto") || sTipo.equals("MenuItemDetalleAbrirOrderByCosto")) {
				jButtonAbrirOrderByCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCosto") || sTipo.equals("MenuItemDetalleMostrarOcultarCosto")) {
				jButtonMostrarOcultarCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCosto")) {
				jButtonNuevoGuardarCambiosCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCosto")) {
				jButtonNuevoGuardarCambiosCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCosto")) {
				jButtonNuevoGuardarCambiosCostoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCosto")) {
				jButtonCerrarReporteDinamicoCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCosto")) {
				jButtonGenerarReporteDinamicoCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCosto")) {
				
				jButtonGenerarExcelReporteDinamicoCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCosto")) {
				jButtonCerrarImportacionCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCosto")) {
				
				jButtonGenerarImportacionCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCosto")) {
				
				jButtonAbrirImportacionCostoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCosto")) {
				jComboBoxTiposAccionesCostoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCosto")) {
				jComboBoxTiposRelacionesCostoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCosto")) {
				jComboBoxTiposAccionesCostoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCosto")) {
				
				jComboBoxTiposSeleccionarCostoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCosto")) {
				jTextFieldValorCampoGeneralCostoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCosto")) {
				jButtonAbrirOrderByCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCosto")) {
				jButtonAbrirOrderByCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCosto")) {
				jButtonCerrarOrderByCostoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCostoBusqueda")) {
				this.jButtonidCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCostoUpdate")) {
				this.jButtonid_empresaCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCostoBusqueda")) {
				this.jButtonid_empresaCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCostoUpdate")) {
				this.jButtonid_sucursalCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCostoBusqueda")) {
				this.jButtonid_sucursalCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaCostoUpdate")) {
				this.jButtonid_bodegaCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaCostoBusqueda")) {
				this.jButtonid_bodegaCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoCosto")) {
				this.jButtonid_productoCostoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoCostoUpdate")) {
				this.jButtonid_productoCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoCostoBusqueda")) {
				this.jButtonid_productoCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoCostoUpdate")) {
				this.jButtonid_periodoCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoCostoBusqueda")) {
				this.jButtonid_periodoCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCostoUpdate")) {
				this.jButtonid_ejercicioCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCostoBusqueda")) {
				this.jButtonid_ejercicioCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_movimiento_inventarioCostoUpdate")) {
				this.jButtonid_detalle_movimiento_inventarioCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_movimiento_inventarioCostoBusqueda")) {
				this.jButtonid_detalle_movimiento_inventarioCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_costoCostoUpdate")) {
				this.jButtonid_tipo_costoCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_costoCostoBusqueda")) {
				this.jButtonid_tipo_costoCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCostoBusqueda")) {
				this.jButtonnumero_comprobanteCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCostoBusqueda")) {
				this.jButtonfechaCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadCostoBusqueda")) {
				this.jButtoncantidadCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_unitarioCostoBusqueda")) {
				this.jButtonvalor_unitarioCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_totalCostoBusqueda")) {
				this.jButtonvalor_totalCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioCostoUpdate")) {
				this.jButtonid_anioCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioCostoBusqueda")) {
				this.jButtonid_anioCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesCostoUpdate")) {
				this.jButtonid_mesCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesCostoBusqueda")) {
				this.jButtonid_mesCostoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoCosto")) {
				this.jButtonid_productoCostoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaCosto")) {
				this.jButtonFK_IdBodegaCostoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleMovimientoInventarioCosto")) {
				this.jButtonFK_IdDetalleMovimientoInventarioCostoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoCosto")) {
				this.jButtonFK_IdProductoCostoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCostoCosto")) {
				this.jButtonFK_IdTipoCostoCostoActionPerformed(evt);
			}
			
			;
			
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCosto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				


				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Costo costoLocal=null;
			
			if(!this.getEsControlTabla()) {
				costoLocal=this.costo;
			} else {
				costoLocal=this.costoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
							
				
				


				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoAnterior =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costoAnterior =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
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
			
			


			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
								
						
				


				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
								
				
				


				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoAnterior =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costoAnterior =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoAnterior =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costoAnterior =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
							
				
				


				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costoAnterior =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.costoAnterior =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
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
			
			


			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
								
				
				


				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoAnterior =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costoAnterior =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCosto")) {
					jCheckBoxSeleccionarTodosCostoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCosto")) {
					jCheckBoxSeleccionadosCostoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCosto")) {
					
				}
				
				


				
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
												
				
				


				
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costoAnterior =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.costoAnterior =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
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
			
			


			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costo);
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
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
				
				


				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Costo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Costo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costoAnterior =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costoAnterior =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCosto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCosto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.costo =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.costo =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.costo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCosto")) {
				
				}
				
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCosto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCosto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCosto")) {
			
			}
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCosto();
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
			if(sTipo.equals("NuevoCosto")) {
				jButtonNuevoCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCosto")) {
				jButtonDuplicarCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCosto")) {
				jButtonCopiarCostoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCosto")) {
				jButtonVerFormCostoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCosto")) {
				jButtonNuevoCostoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCosto")) {
				jButtonModificarCostoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCosto")) {
				jButtonActualizarCostoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCosto")) {
				jButtonEliminarCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCosto")) {
				jButtonGuardarCambiosCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCosto")) {
				jButtonCancelarCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCosto")) {
				jButtonCerrarCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCosto")) {
				jButtonGuardarCambiosCostoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCosto")) {
				jButtonNuevoGuardarCambiosCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCosto")) {
				jButtonAbrirOrderByCostoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCosto")) {
				jButtonRecargarInformacionCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCosto")) {
				jButtonAnterioresCostoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCosto")) {
				jButtonSiguientesCostoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCostoBusqueda")) {
				this.jButtonidCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCostoUpdate")) {
				this.jButtonid_empresaCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCostoBusqueda")) {
				this.jButtonid_empresaCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCostoUpdate")) {
				this.jButtonid_sucursalCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCostoBusqueda")) {
				this.jButtonid_sucursalCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaCostoUpdate")) {
				this.jButtonid_bodegaCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaCostoBusqueda")) {
				this.jButtonid_bodegaCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoCosto")) {
				this.jButtonid_productoCostoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoCostoUpdate")) {
				this.jButtonid_productoCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoCostoBusqueda")) {
				this.jButtonid_productoCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoCostoUpdate")) {
				this.jButtonid_periodoCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoCostoBusqueda")) {
				this.jButtonid_periodoCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCostoUpdate")) {
				this.jButtonid_ejercicioCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCostoBusqueda")) {
				this.jButtonid_ejercicioCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_movimiento_inventarioCostoUpdate")) {
				this.jButtonid_detalle_movimiento_inventarioCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_movimiento_inventarioCostoBusqueda")) {
				this.jButtonid_detalle_movimiento_inventarioCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_costoCostoUpdate")) {
				this.jButtonid_tipo_costoCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_costoCostoBusqueda")) {
				this.jButtonid_tipo_costoCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCostoBusqueda")) {
				this.jButtonnumero_comprobanteCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCostoBusqueda")) {
				this.jButtonfechaCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadCostoBusqueda")) {
				this.jButtoncantidadCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_unitarioCostoBusqueda")) {
				this.jButtonvalor_unitarioCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_totalCostoBusqueda")) {
				this.jButtonvalor_totalCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioCostoUpdate")) {
				this.jButtonid_anioCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioCostoBusqueda")) {
				this.jButtonid_anioCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesCostoUpdate")) {
				this.jButtonid_mesCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesCostoBusqueda")) {
				this.jButtonid_mesCostoBusquedaActionPerformed(evt);
			}
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCosto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCosto")) {
				closingInternalFrameCosto();
				
			} else if(sTipo.equals("jButtonCancelarCosto")) {
				JInternalFrameBase jInternalFrameDetalleFormCosto = (JInternalFrameBase)evt.getSource();
	            	
	            CostoBeanSwingJInternalFrame jInternalFrameParent=(CostoBeanSwingJInternalFrame)jInternalFrameDetalleFormCosto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCostoActionPerformed(null);
			}
			
			CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.costo,new Object(),this.costoParameterGeneral,this.costoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.costo)) {
			if(!esControlTabla) {
				if(CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCosto(this.costo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);			
				}
				
				if(this.costoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCosto(this.costo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.costoReturnGeneral=costoLogic.procesarEventosCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.costoLogic.getCostos(),this.costo,this.costoParameterGeneral,this.isEsNuevoCosto,classes);//this.costoLogic.getCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCosto(this.costoReturnGeneral,this.costoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.costoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCosto(classes,this.costoReturnGeneral,this.costoBean,false);
					}
						
					if(this.costoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCosto(this.costoReturnGeneral.getCosto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCosto(this.costoReturnGeneral.getCosto());	
					}
						
					if(this.costoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCosto(this.costoReturnGeneral.getCosto(),classes);//this.costoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCosto(this.costo,classes);//this.costoBean);									
				}
			
				if(CostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCosto(this.costo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCosto(this.costo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.costoAnterior!=null) {
						this.costo=this.costoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.costoReturnGeneral=costoLogic.procesarEventosCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.costoLogic.getCostos(),this.costo,this.costoParameterGeneral,this.isEsNuevoCosto,classes);//this.costoLogic.getCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.costoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.costoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.costoReturnGeneral.getCosto(),costoLogic.getCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.costoReturnGeneral.getCosto(),this.costos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCosto.repaint();
				
				//((AbstractTableModel) this.jTableDatosCosto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCosto();
			}
		}
	}
	
	public void actualizarVisualTableDatosCosto() throws Exception {
		
		CostoModel costoModel=(CostoModel)this.jTableDatosCosto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			costoModel.costos=this.costoLogic.getCostos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			costoModel.costos=this.costos;
		}
		
		
		((CostoModel) this.jTableDatosCosto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCosto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcostoAnterior(),this.costoLogic.getCostos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcostoAnterior(),this.costos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCosto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCosto(Costo costo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
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
										
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.costo,new Object(),generalEntityParameterGeneral,this.costoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.costoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CostoConstantesFunciones.getClassesRelationshipsOfCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CostoConstantesFunciones.getClassesRelationshipsFromStringsOfCosto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.costo,new Object(),generalEntityParameterGeneral,this.costoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCosto(CostoBean costoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCosto(ArrayList<Classe> classes,CostoReturnGeneral costoReturnGeneral,CostoBean costoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCosto(Costo costo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.costo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCosto = new CostoDetalleFormJInternalFrame(jDesktopPane,this.costoSessionBean.getConGuardarRelaciones(),this.costoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCosto);
		this.jInternalFrameDetalleFormCosto.setVisible(false);
		this.jInternalFrameDetalleFormCosto.setSelected(false);						
		
		this.jInternalFrameDetalleFormCosto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCosto.costoLogic=this.costoLogic;
		
		this.cargarCombosFrameForeignKeyCosto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCosto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCosto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCosto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCosto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCosto"));
		
		this.jInternalFrameDetalleFormCosto.jButtonModificarCosto.addActionListener(new ButtonActionListener(this,"ModificarCosto"));

		
		this.jInternalFrameDetalleFormCosto.jButtonModificarToolBarCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarCosto"));
					
		this.jInternalFrameDetalleFormCosto.jMenuItemModificarCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarCosto"));		
		
		
		
		this.jInternalFrameDetalleFormCosto.jButtonActualizarCosto.addActionListener (new ButtonActionListener(this,"ActualizarCosto"));
		
		
		this.jInternalFrameDetalleFormCosto.jButtonActualizarToolBarCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCosto"));
						
		this.jInternalFrameDetalleFormCosto.jMenuItemActualizarCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCosto"));		
		
		
		
		this.jInternalFrameDetalleFormCosto.jButtonEliminarCosto.addActionListener (new ButtonActionListener(this,"EliminarCosto"));
		
		
		this.jInternalFrameDetalleFormCosto.jButtonEliminarToolBarCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarCosto"));
								
		this.jInternalFrameDetalleFormCosto.jMenuItemEliminarCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCosto"));		
		
		
		
		this.jInternalFrameDetalleFormCosto.jButtonCancelarCosto.addActionListener (new ButtonActionListener(this,"CancelarCosto"));
		
		
		this.jInternalFrameDetalleFormCosto.jButtonCancelarToolBarCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarCosto"));
					
		this.jInternalFrameDetalleFormCosto.jMenuItemCancelarCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCosto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCosto.jMenuItemDetalleCerrarCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCosto"));		
		
		
		
		this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosToolBarCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCosto"));
		
		
		
		this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosToolBarCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCosto"));
		
		
		
		this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCosto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonidCostoBusqueda.addActionListener(new ButtonActionListener(this,"idCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_empresaCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_empresaCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_sucursalCostoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_sucursalCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_bodegaCostoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_bodegaCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaCostoBusqueda"));
		//jButtonid_productoCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCosto.addActionListener(new ButtonActionListener(this,"id_productoCosto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_productoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_periodoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_periodoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_ejercicioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_ejercicioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_detalle_movimiento_inventarioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_detalle_movimiento_inventarioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_tipo_costoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_costoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_tipo_costoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_costoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonnumero_comprobanteCostoBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonfechaCostoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtoncantidadCostoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonvalor_unitarioCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_unitarioCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonvalor_totalCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_anioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_anioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_anioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_mesCostoUpdate.addActionListener(new ButtonActionListener(this,"id_mesCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_mesCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesCostoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCosto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCosto"));
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCosto"));
		}
		
		this.jTableDatosCosto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCosto"));
		
		this.jTableDatosCosto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCosto"));
		
		this.jButtonNuevoCosto.addActionListener(new ButtonActionListener(this,"NuevoCosto"));
		
		this.jButtonDuplicarCosto.addActionListener(new ButtonActionListener(this,"DuplicarCosto"));
		
		this.jButtonCopiarCosto.addActionListener(new ButtonActionListener(this,"CopiarCosto"));
		
		this.jButtonVerFormCosto.addActionListener(new ButtonActionListener(this,"VerFormCosto"));
		
		
		this.jButtonNuevoToolBarCosto.addActionListener(new ButtonActionListener(this,"NuevoToolBarCosto"));
			
		this.jButtonDuplicarToolBarCosto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCosto"));
			
		this.jMenuItemNuevoCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCosto"));
			
		this.jMenuItemDuplicarCosto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCosto"));		
		
		
		this.jButtonNuevoRelacionesCosto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCosto"));
		
		
		this.jButtonNuevoRelacionesToolBarCosto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCosto"));
			
		this.jMenuItemNuevoRelacionesCosto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCosto"));		
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonModificarCosto.addActionListener(new ButtonActionListener(this,"ModificarCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonModificarToolBarCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarCosto"));
			
			this.jInternalFrameDetalleFormCosto.jMenuItemModificarCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCosto.jButtonActualizarCosto.addActionListener (new ButtonActionListener(this,"ActualizarCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonActualizarToolBarCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCosto"));
				
			this.jInternalFrameDetalleFormCosto.jMenuItemActualizarCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonEliminarCosto.addActionListener (new ButtonActionListener(this,"EliminarCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonEliminarToolBarCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarCosto"));
						
			this.jInternalFrameDetalleFormCosto.jMenuItemEliminarCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonCancelarCosto.addActionListener (new ButtonActionListener(this,"CancelarCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonCancelarToolBarCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarCosto"));
			
			this.jInternalFrameDetalleFormCosto.jMenuItemCancelarCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCosto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCosto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCosto"));		
		
		
		this.jButtonCerrarCosto.addActionListener (new ButtonActionListener(this,"CerrarCosto"));
		
		
		this.jButtonCerrarToolBarCosto.addActionListener (new ButtonActionListener(this,"CerrarToolBarCosto"));
			
		this.jMenuItemCerrarCosto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCosto"));
			
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jMenuItemDetalleCerrarCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosToolBarCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCosto"));
		}
		
		this.jButtonCopiarToolBarCosto.addActionListener (new ButtonActionListener(this,"CopiarToolBarCosto"));
			
		this.jButtonVerFormToolBarCosto.addActionListener (new ButtonActionListener(this,"VerFormToolBarCosto"));
		
		this.jMenuItemGuardarCambiosCosto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCosto"));
			
		this.jMenuItemCopiarCosto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCosto"));		
		
		this.jMenuItemVerFormCosto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCosto"));		
		
		
		this.jButtonGuardarCambiosTablaCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCosto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCosto"));
			
		this.jMenuItemGuardarCambiosTablaCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCosto"));		
		
		
		
		this.jButtonRecargarInformacionCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionCosto"));
					
		this.jButtonRecargarInformacionToolBarCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCosto"));
		
		this.jMenuItemRecargarInformacionCosto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCosto"));		
		
		
		
		this.jButtonAnterioresCosto.addActionListener (new ButtonActionListener(this,"AnterioresCosto"));
		
		
		this.jButtonAnterioresToolBarCosto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCosto"));
		
		this.jMenuItemAnterioresCosto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCosto"));		
		
		
		this.jButtonSiguientesCosto.addActionListener (new ButtonActionListener(this,"SiguientesCosto"));
		
		
		this.jButtonSiguientesToolBarCosto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCosto"));
			
		this.jMenuItemSiguientesCosto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCosto"));
			
		this.jMenuItemAbrirOrderByCosto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCosto"));
			
		this.jMenuItemMostrarOcultarCosto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCosto"));
			
		this.jMenuItemDetalleAbrirOrderByCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCosto"));
			
		this.jMenuItemDetalleMostarOcultarCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCosto"));		
		
		
		this.jButtonNuevoGuardarCambiosCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCosto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCosto"));
			
		this.jMenuItemNuevoGuardarCambiosCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCosto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCosto"));

		this.jCheckBoxSeleccionadosCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCosto"));
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCosto"));
		}
		
		
		this.jComboBoxTiposRelacionesCosto.addActionListener (new ButtonActionListener(this,"TiposRelacionesCosto"));
			
		this.jComboBoxTiposAccionesCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesCosto"));
					
		this.jComboBoxTiposSeleccionarCosto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCosto"));
			
		this.jTextFieldValorCampoGeneralCosto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCosto"));		
		
		
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonidCostoBusqueda.addActionListener(new ButtonActionListener(this,"idCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_empresaCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_empresaCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_sucursalCostoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_sucursalCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_bodegaCostoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_bodegaCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaCostoBusqueda"));
		//jButtonid_productoCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCosto.addActionListener(new ButtonActionListener(this,"id_productoCosto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_productoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_periodoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_periodoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_ejercicioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_ejercicioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_detalle_movimiento_inventarioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_detalle_movimiento_inventarioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_tipo_costoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_costoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_tipo_costoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_costoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonnumero_comprobanteCostoBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonfechaCostoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtoncantidadCostoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonvalor_unitarioCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_unitarioCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonvalor_totalCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_anioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_anioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_anioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_mesCostoUpdate.addActionListener(new ButtonActionListener(this,"id_mesCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_mesCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesCostoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaCosto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaCosto"));

			this.jButtonFK_IdDetalleMovimientoInventarioCosto.addActionListener(new ButtonActionListener(this,"FK_IdDetalleMovimientoInventarioCosto"));

			this.jButtonFK_IdProductoCosto.addActionListener(new ButtonActionListener(this,"FK_IdProductoCosto"));

			this.jButtonBuscarFK_IdProductoid_productoCosto.addActionListener(new ButtonActionListener(this,"id_productoCosto"));

			this.jButtonFK_IdTipoCostoCosto.addActionListener(new ButtonActionListener(this,"FK_IdTipoCostoCosto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCosto!=null) {
				this.jInternalFrameReporteDinamicoCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCosto"));
				this.jInternalFrameReporteDinamicoCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCosto"));
				this.jInternalFrameReporteDinamicoCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCosto"));
			}
			
			//this.jButtonCerrarReporteDinamicoCosto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCosto"));				
			//this.jButtonGenerarReporteDinamicoCosto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCosto"));
			//this.jButtonGenerarExcelReporteDinamicoCosto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCosto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCosto!=null) {
				this.jInternalFrameImportacionCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCosto"));
				this.jInternalFrameImportacionCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCosto"));
				this.jInternalFrameImportacionCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCosto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByCosto"));
			
			this.jButtonAbrirOrderByToolBarCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCosto"));			
			
			if(this.jInternalFrameOrderByCosto!=null) {
				this.jInternalFrameOrderByCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCosto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCosto.jTabbedPaneRelacionesCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCosto"));
		
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
            		closingInternalFrameCosto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCosto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCosto = (JInternalFrameBase)event.getSource();
	            	
	            CostoBeanSwingJInternalFrame jInternalFrameParent=(CostoBeanSwingJInternalFrame)jInternalFrameDetalleFormCosto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCostoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCosto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCosto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCosto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCosto";
		inputMap = this.jButtonNuevoCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCostoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCosto";
		inputMap = this.jButtonNuevoRelacionesCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCostoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCosto";
		inputMap = this.jButtonModificarCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCosto";
		inputMap = this.jButtonActualizarCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCosto";
		inputMap = this.jButtonEliminarCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCosto";
		inputMap = this.jButtonCancelarCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCosto";
		inputMap = this.jButtonCerrarCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCosto";
		inputMap = this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCosto.jButtonGuardarCambiosCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCosto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCostoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonidCostoBusqueda.addActionListener(new ButtonActionListener(this,"idCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_empresaCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_empresaCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_sucursalCostoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_sucursalCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_bodegaCostoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_bodegaCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaCostoBusqueda"));
		//jButtonid_productoCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCosto.addActionListener(new ButtonActionListener(this,"id_productoCosto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_productoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_productoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_periodoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_periodoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_ejercicioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_ejercicioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_detalle_movimiento_inventarioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_detalle_movimiento_inventarioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_tipo_costoCostoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_costoCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_tipo_costoCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_costoCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonnumero_comprobanteCostoBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonfechaCostoBusqueda.addActionListener(new ButtonActionListener(this,"fechaCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtoncantidadCostoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonvalor_unitarioCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_unitarioCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonvalor_totalCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_anioCostoUpdate.addActionListener(new ButtonActionListener(this,"id_anioCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_anioCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCosto.jButtonid_mesCostoUpdate.addActionListener(new ButtonActionListener(this,"id_mesCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCosto.jButtonid_mesCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesCostoBusqueda"));
		
		
		this.jButtonFK_IdBodegaCosto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaCosto"));

		this.jButtonFK_IdDetalleMovimientoInventarioCosto.addActionListener(new ButtonActionListener(this,"FK_IdDetalleMovimientoInventarioCosto"));

		this.jButtonFK_IdProductoCosto.addActionListener(new ButtonActionListener(this,"FK_IdProductoCosto"));

		this.jButtonBuscarFK_IdProductoid_productoCosto.addActionListener(new ButtonActionListener(this,"id_productoCosto"));

		this.jButtonFK_IdTipoCostoCosto.addActionListener(new ButtonActionListener(this,"FK_IdTipoCostoCosto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCostoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCosto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCosto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Costo costoAux:this.costoLogic.getCostos()) {
					costoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Costo costoAux:costos) {
					costoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Costo costoAux:this.costoLogic.getCostos()) {
						costoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Costo costoAux:costos) {
						costoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Costo costoAux:this.costoLogic.getCostos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Costo costoAux:costos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCosto.getSelectedRows();
			
			Costo costoLocal=new Costo();
			
			//this.seleccionarTodosCosto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costoLocal =(Costo) this.costoLogic.getCostos().toArray()[this.jTableDatosCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					costoLocal =(Costo) this.costos.toArray()[this.jTableDatosCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				costoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Costo costoAux:this.costoLogic.getCostos()) {
						costoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Costo costoAux:costos) {
						costoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCosto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCostoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCostoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCostoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCosto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCosto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Costo costoAux:this.costoLogic.getCostos()) {
				
						if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							costoAux.setnumero_comprobante(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							costoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							costoAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_VALORUNITARIO)) {
							existe=true;
							costoAux.setvalor_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_VALORTOTAL)) {
							existe=true;
							costoAux.setvalor_total(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Costo costoAux:costos) {
					
						if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							costoAux.setnumero_comprobante(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							costoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							costoAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_VALORUNITARIO)) {
							existe=true;
							costoAux.setvalor_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_VALORTOTAL)) {
							existe=true;
							costoAux.setvalor_total(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCostoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCosto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCosto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCosto) {				
					conSplash=true;//false;										
					
					//this.startProcessCosto(conSplash);
				
					this.generarReporteCostosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCostosSeleccionados();
				//this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCostosSeleccionados(false);
				//this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCostosSeleccionados(true);
				//this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCosto();
				
				this.exportarCostosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCostos();
				//this.importarCostos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCosto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCostosSeleccionados();
				//this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCosto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCosto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCosto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.setSelectedIndex(0);					
				}	
			} 			
			else if(CostoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCosto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCosto(conSplash);
					
						//this.actualizarParametrosGeneralCosto();
						
						this.generarReporteProcesoAccionCostosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CostoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CostoS SELECCIONADOS?", "MANTENIMIENTO DE Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCosto();
				
						this.actualizarParametrosGeneralCosto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.costoReturnGeneral=costoLogic.procesarAccionCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.costoLogic.getCostos(),this.costoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCosto();
					
					CostoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCosto.jComboBoxTiposAccionesFormularioCosto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCosto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCostoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCosto();
			
			if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		
			Costo costo=new Costo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCosto.getSelectedItem();
			
			
			
			
			costosSeleccionados=this.getCostosSeleccionados(true);
			//this.sTipoAccion;
			
			if(costosSeleccionados.size()==1) {
				for(Costo costoAux:costosSeleccionados) {
					costo=costoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCosto();
			
      		//this.finishProcessCosto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCostoReturnGeneral() throws Exception {
		if(this.costoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.costoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.costoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.costoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.costoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.costoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCosto(false);
		}
		
		if(this.costoReturnGeneral.getConRetornoLista() || this.costoReturnGeneral.getConRetornoObjeto()) {
			if(this.costoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.costoLogic.setCostos(this.costoReturnGeneral.getCostos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.costoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.costoLogic.setCosto(this.costoReturnGeneral.getCosto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCosto(false);
		}
	}
	
	public void actualizarParametrosGeneralCosto() throws Exception {
		
		
	}
	
	public ArrayList<Costo> getCostosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCosto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Costo costoAux:costoLogic.getCostos()) {
					if(costoAux.getIsSelected()) {
						costosSeleccionados.add(costoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Costo costoAux:this.costos) {
					if(costoAux.getIsSelected()) {
						costosSeleccionados.add(costoAux);				
					}
				}
			}
			
			if(costosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						costosSeleccionados.addAll(this.costoLogic.getCostos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						costosSeleccionados.addAll(this.costos);				
					}
				}
			}
		} else {
			costosSeleccionados.add(this.costo);
		}
		
		return costosSeleccionados;
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
	
	public void generarReporteCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCostosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCostosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCostosSeleccionados() throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCostos("Todos",costosSeleccionados);
		
	}	
	
	public void generarReporteNormalCostosSeleccionados() throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCostos("Todos",costosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCostosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCostos("Todos",costosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCostosSeleccionados() throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCosto();
		
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCosto();
		
		
		//this.generarReporteCostos("Todos",costosSeleccionados ,costoImplementable,costoImplementableHome);
	}
	
	public void mostrarImportacionCostos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCosto();
		
		this.abrirFrameImportacionCosto();		
		
			
		//this.generarReporteCostos("Todos",costosSeleccionados ,costoImplementable,costoImplementableHome);
	}
	
	public void importarCostos() throws Exception {		
	
	}
	
	public void exportarCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCostosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCostosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCostosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCostosSeleccionados() throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCosto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Costo costoAux:costosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCosto(costoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//costoAux.setsDetalleGeneralEntityReporte(costoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCosto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CostoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDTIPOCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_VALORUNITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_VALORTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCosto(Costo costo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=costo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getdetallemovimientoinventario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.gettipocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getnumero_comprobante().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getvalor_unitario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getvalor_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costo.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCostosSeleccionados() throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Costos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCosto(row);				
				iRow++;
			}				
			
			for(Costo costoAux:costosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCosto(costoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCostosSeleccionados() throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();		
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("costos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("costo");
			//elementRoot.appendChild(element);
		
			for(Costo costoAux:costosSeleccionados) {
				element = document.createElement("costo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCosto(costoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCosto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDTIPOCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_VALORUNITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_VALORTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCosto(Costo costo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getdetallemovimientoinventario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.gettipocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getvalor_unitario());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getvalor_total());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costo.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlCosto(Costo costo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CostoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(costo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CostoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(costo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CostoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(costo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CostoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(costo.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(CostoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(costo.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(CostoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(costo.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementperiodo_descripcion = document.createElement(CostoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(costo.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementejercicio_descripcion = document.createElement(CostoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(costo.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementdetallemovimientoinventario_descripcion = document.createElement(CostoConstantesFunciones.IDDETALLEMOVIMIENTOINVENTARIO);
		elementdetallemovimientoinventario_descripcion.appendChild(document.createTextNode(costo.getdetallemovimientoinventario_descripcion()));
		element.appendChild(elementdetallemovimientoinventario_descripcion);

		Element elementtipocosto_descripcion = document.createElement(CostoConstantesFunciones.IDTIPOCOSTO);
		elementtipocosto_descripcion.appendChild(document.createTextNode(costo.gettipocosto_descripcion()));
		element.appendChild(elementtipocosto_descripcion);

		Element elementnumero_comprobante = document.createElement(CostoConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(costo.getnumero_comprobante().toString().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementfecha = document.createElement(CostoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(costo.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementcantidad = document.createElement(CostoConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(costo.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementvalor_unitario = document.createElement(CostoConstantesFunciones.VALORUNITARIO);
		elementvalor_unitario.appendChild(document.createTextNode(costo.getvalor_unitario().toString().trim()));
		element.appendChild(elementvalor_unitario);

		Element elementvalor_total = document.createElement(CostoConstantesFunciones.VALORTOTAL);
		elementvalor_total.appendChild(document.createTextNode(costo.getvalor_total().toString().trim()));
		element.appendChild(elementvalor_total);

		Element elementanio_descripcion = document.createElement(CostoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(costo.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(CostoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(costo.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoCostosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Costo> costosSeleccionados=new ArrayList<Costo>();
		
		costosSeleccionados=this.getCostosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCosto(costosSeleccionados);
		
		this.generarReporteCostos("Todos",costosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCosto(ArrayList<Costo> costosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Costo costoAux:costosSeleccionados) {
				costoAux.setsDetalleGeneralEntityReporte(costoAux.toString());
			
				if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getdetallemovimientoinventario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDTIPOCOSTO)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.gettipocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getnumero_comprobante().toString());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(costoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					costoAux.setsDescripcionGeneralEntityReporte1(costoAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCosto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCosto=true;
				this.isVisibilidadCeldaNuevoRelacionesCosto=true;
				this.isVisibilidadCeldaGuardarCambiosCosto=true;
			}
			
			this.isVisibilidadCeldaModificarCosto=false;
			this.isVisibilidadCeldaActualizarCosto=false;
			this.isVisibilidadCeldaEliminarCosto=false;
			this.isVisibilidadCeldaCancelarCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarCosto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCosto=false;
			this.isVisibilidadCeldaModificarCosto=false;
			this.isVisibilidadCeldaActualizarCosto=true;
			this.isVisibilidadCeldaEliminarCosto=false;
			this.isVisibilidadCeldaCancelarCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarCosto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCosto=false;
			this.isVisibilidadCeldaModificarCosto=false;
			this.isVisibilidadCeldaActualizarCosto=true;
			this.isVisibilidadCeldaEliminarCosto=true;
			this.isVisibilidadCeldaCancelarCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarCosto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCosto=false;
			this.isVisibilidadCeldaModificarCosto=false;
			this.isVisibilidadCeldaActualizarCosto=true;
			this.isVisibilidadCeldaEliminarCosto=false;
			this.isVisibilidadCeldaCancelarCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarCosto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesCosto=true;
			this.isVisibilidadCeldaGuardarCambiosCosto=true;
			this.isVisibilidadCeldaModificarCosto=false;
			this.isVisibilidadCeldaActualizarCosto=false;
			this.isVisibilidadCeldaEliminarCosto=false;
			this.isVisibilidadCeldaCancelarCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarCosto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCosto=false;
			this.isVisibilidadCeldaActualizarCosto=false;
			this.isVisibilidadCeldaEliminarCosto=false;
			this.isVisibilidadCeldaCancelarCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarCosto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCosto=false;
			this.isVisibilidadCeldaModificarCosto=true;
			this.isVisibilidadCeldaActualizarCosto=false;
			this.isVisibilidadCeldaEliminarCosto=false;
			this.isVisibilidadCeldaCancelarCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarCosto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CostoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesCosto=true;
			this.isVisibilidadCeldaGuardarCambiosCosto=true;
		} else {
			this.actualizarEstadoPanelsCosto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCosto=false;
			//this.isVisibilidadCeldaVerFormCosto=false;
			this.isVisibilidadCeldaDuplicarCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!costoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCosto=false;
		} else {
			this.isVisibilidadCeldaNuevoCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(costoSessionBean.getEsGuardarRelacionado()) {
			if(!costoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCosto=false;												
			}
			
			this.jButtonCerrarCosto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCosto=false;
		}
		
		if(!this.permiteMantenimiento(this.costo)) {
			this.isVisibilidadCeldaActualizarCosto=false;
			this.isVisibilidadCeldaEliminarCosto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCosto() {
	}
	
	public void actualizarEstadoPanelsCosto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCosto!=null) {
				this.jScrollPanelDatosEdicionCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCosto!=null) {
				this.jTabbedPaneBusquedasCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCosto!=null) {
				this.jScrollPanelDatosCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCosto!=null) {
				this.jPanelPaginacionCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCosto!=null) {
				this.jScrollPanelDatosEdicionCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCosto!=null) {
				this.jTabbedPaneBusquedasCosto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCosto!=null) {
				this.jScrollPanelDatosCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCosto!=null) {
				this.jPanelPaginacionCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCosto!=null) {
				this.jScrollPanelDatosEdicionCosto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCosto!=null) {
				this.jTabbedPaneBusquedasCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCosto!=null) {
				this.jScrollPanelDatosCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCosto!=null) {
				this.jPanelPaginacionCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCosto!=null) {
				this.jScrollPanelDatosEdicionCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCosto!=null) {
				this.jTabbedPaneBusquedasCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCosto!=null) {
				this.jScrollPanelDatosCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCosto!=null) {
				this.jPanelPaginacionCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCosto!=null) {
				this.jScrollPanelDatosEdicionCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCosto!=null) {
				this.jTabbedPaneBusquedasCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCosto!=null) {
				this.jScrollPanelDatosCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCosto!=null) {
				this.jPanelPaginacionCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCosto!=null) {
				this.jScrollPanelDatosEdicionCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCosto!=null) {
				this.jTabbedPaneBusquedasCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCosto!=null) {
				this.jScrollPanelDatosCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCosto!=null) {
				this.jPanelPaginacionCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCosto!=null) {
				this.jScrollPanelDatosEdicionCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCosto!=null) {
				this.jTabbedPaneBusquedasCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCosto!=null) {
				this.jScrollPanelDatosCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCosto!=null) {
				this.jPanelPaginacionCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.costoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCosto!=null) {
					this.jTabbedPaneBusquedasCosto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.costoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCosto!=null) {
				this.jTabbedPaneBusquedasCosto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCosto!=null) {
				this.jPanelParametrosReportesCosto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdBodega=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdBodega=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleMovimientoInventario(Boolean isParaDetalleMovimientoInventario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleMovimientoInventarioNegation=!isParaDetalleMovimientoInventario;

			this.isVisibilidadFK_IdBodega=isParaDetalleMovimientoInventarioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaDetalleMovimientoInventario;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaDetalleMovimientoInventarioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaDetalleMovimientoInventarioNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCosto(Boolean isParaTipoCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCostoNegation=!isParaTipoCosto;

			this.isVisibilidadFK_IdBodega=isParaTipoCostoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaTipoCostoNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaTipoCostoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaTipoCosto;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdBodega=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdBodega=isParaMesNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdBodegaCosto);}

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaMesNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdDetalleMovimientoInventarioCosto);}

			this.isVisibilidadFK_IdProducto=isParaMesNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdProductoCosto);}

			this.isVisibilidadFK_IdTipoCosto=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoCosto) {this.jTabbedPaneBusquedasCosto.remove(jPanelFK_IdTipoCostoCosto);}
		}
		
	}
	
	
	
	

	public String registrarSesionCostoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(costoSessionBean==null) {
				costoSessionBean=new CostoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(costoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.costoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(CostoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionCosto(true);
			//productoSessionBean.setlidCostoActual(this.idCostoActual);

			costoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCosto(true);
			costoSessionBean.setlIdCostoActualForeignKey(this.idCostoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CostoSessionBean costoSessionBean=new CostoSessionBean();
		
		if(this.costoSessionBean==null) {
			this.costoSessionBean=new CostoSessionBean();
		}
		
		this.costoSessionBean.setsUltimaBusquedaCosto(this.getsAccionBusqueda());
		this.costoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.costoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			costoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleMovimientoInventario")) {
			costoSessionBean.setid_detalle_movimiento_inventario(this.getid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			costoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			costoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			costoSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			costoSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			costoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCosto")) {
			costoSessionBean.setid_tipo_costo(this.getid_tipo_costoFK_IdTipoCosto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CostoSessionBean costoSessionBean=new CostoSessionBean();
		
		if(this.costoSessionBean==null) {
			this.costoSessionBean=new CostoSessionBean();
		}
		
		if(this.costoSessionBean.getsUltimaBusquedaCosto()!=null&&!this.costoSessionBean.getsUltimaBusquedaCosto().equals("")) {
			this.setsAccionBusqueda(costoSessionBean.getsUltimaBusquedaCosto());
			this.setiNumeroPaginacion(costoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(costoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(costoSessionBean.getid_bodega());
				costoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleMovimientoInventario")) {
				this.setid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario(costoSessionBean.getid_detalle_movimiento_inventario());
				costoSessionBean.setid_detalle_movimiento_inventario(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(costoSessionBean.getid_ejercicio());
				costoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(costoSessionBean.getid_empresa());
				costoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(costoSessionBean.getid_periodo());
				costoSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(costoSessionBean.getid_producto());
				costoSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(costoSessionBean.getid_sucursal());
				costoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCosto")) {
				this.setid_tipo_costoFK_IdTipoCosto(costoSessionBean.getid_tipo_costo());
				costoSessionBean.setid_tipo_costo(-1L);
			}
		}
		
		this.costoSessionBean.setsUltimaBusquedaCosto("");
		this.costoSessionBean.setiNumeroPaginacion(CostoConstantesFunciones.INUMEROPAGINACION);
		this.costoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCosto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCosto() {
		this.updateBorderResaltarBusquedasFormularioCosto();
		this.updateVisibilidadBusquedasFormularioCosto();
		this.updateHabilitarBusquedasFormularioCosto();
	}
	
	public void updateBorderResaltarBusquedasFormularioCosto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCosto.getComponents().length>0) {
	

		if(this.costoConstantesFunciones.resaltarFK_IdBodegaCosto!=null) {
			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdBodegaCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
				jPanel.setBorder(this.costoConstantesFunciones.resaltarFK_IdBodegaCosto);
			}
		}

		if(this.costoConstantesFunciones.resaltarFK_IdDetalleMovimientoInventarioCosto!=null) {
			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdDetalleMovimientoInventarioCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
				jPanel.setBorder(this.costoConstantesFunciones.resaltarFK_IdDetalleMovimientoInventarioCosto);
			}
		}

		if(this.costoConstantesFunciones.resaltarFK_IdProductoCosto!=null) {
			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdProductoCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
				jPanel.setBorder(this.costoConstantesFunciones.resaltarFK_IdProductoCosto);
			}
		}

		if(this.costoConstantesFunciones.resaltarFK_IdTipoCostoCosto!=null) {
			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdTipoCostoCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
				jPanel.setBorder(this.costoConstantesFunciones.resaltarFK_IdTipoCostoCosto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCosto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCosto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdBodegaCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.costoConstantesFunciones.mostrarFK_IdBodegaCosto);
			if(!this.costoConstantesFunciones.mostrarFK_IdBodegaCosto && index>-1) {
				this.jTabbedPaneBusquedasCosto.remove(index);
			}

			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdDetalleMovimientoInventarioCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.costoConstantesFunciones.mostrarFK_IdDetalleMovimientoInventarioCosto);
			if(!this.costoConstantesFunciones.mostrarFK_IdDetalleMovimientoInventarioCosto && index>-1) {
				this.jTabbedPaneBusquedasCosto.remove(index);
			}

			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdProductoCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.costoConstantesFunciones.mostrarFK_IdProductoCosto);
			if(!this.costoConstantesFunciones.mostrarFK_IdProductoCosto && index>-1) {
				this.jTabbedPaneBusquedasCosto.remove(index);
			}

			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdTipoCostoCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.costoConstantesFunciones.mostrarFK_IdTipoCostoCosto);
			if(!this.costoConstantesFunciones.mostrarFK_IdTipoCostoCosto && index>-1) {
				this.jTabbedPaneBusquedasCosto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCosto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCosto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdBodegaCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.costoConstantesFunciones.activarFK_IdBodegaCosto);
				this.jTabbedPaneBusquedasCosto.setEnabledAt(index,this.costoConstantesFunciones.activarFK_IdBodegaCosto);
			}

			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdDetalleMovimientoInventarioCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.costoConstantesFunciones.activarFK_IdDetalleMovimientoInventarioCosto);
				this.jTabbedPaneBusquedasCosto.setEnabledAt(index,this.costoConstantesFunciones.activarFK_IdDetalleMovimientoInventarioCosto);
			}

			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdProductoCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.costoConstantesFunciones.activarFK_IdProductoCosto);
				this.jTabbedPaneBusquedasCosto.setEnabledAt(index,this.costoConstantesFunciones.activarFK_IdProductoCosto);
			}

			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdTipoCostoCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.costoConstantesFunciones.activarFK_IdTipoCostoCosto);
				this.jTabbedPaneBusquedasCosto.setEnabledAt(index,this.costoConstantesFunciones.activarFK_IdTipoCostoCosto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCosto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdBodegaCosto);

			this.jTabbedPaneBusquedasCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);

			this.costoConstantesFunciones.setResaltarFK_IdBodegaCosto(resaltar);

			jPanel.setBorder(this.costoConstantesFunciones.resaltarFK_IdBodegaCosto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleMovimientoInventario")) {
			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdDetalleMovimientoInventarioCosto);

			this.jTabbedPaneBusquedasCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);

			this.costoConstantesFunciones.setResaltarFK_IdDetalleMovimientoInventarioCosto(resaltar);

			jPanel.setBorder(this.costoConstantesFunciones.resaltarFK_IdDetalleMovimientoInventarioCosto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdProductoCosto);

			this.jTabbedPaneBusquedasCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);

			this.costoConstantesFunciones.setResaltarFK_IdProductoCosto(resaltar);

			jPanel.setBorder(this.costoConstantesFunciones.resaltarFK_IdProductoCosto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCosto")) {
			index= this.jTabbedPaneBusquedasCosto.indexOfComponent(this.jPanelFK_IdTipoCostoCosto);

			this.jTabbedPaneBusquedasCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCosto.getComponent(index);

			this.costoConstantesFunciones.setResaltarFK_IdTipoCostoCosto(resaltar);

			jPanel.setBorder(this.costoConstantesFunciones.resaltarFK_IdTipoCostoCosto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCosto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCosto() throws Exception {

		if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCosto();
		this.updateVisibilidadResaltarControlesFormularioCosto();
		this.updateHabilitarResaltarControlesFormularioCosto();
		
	}
	
	public void updateBorderResaltarControlesFormularioCosto() throws Exception {
		if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.costoConstantesFunciones.resaltaridCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jLabelidCosto.setBorder(this.costoConstantesFunciones.resaltaridCosto);}
		if(this.costoConstantesFunciones.resaltarid_empresaCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setBorder(this.costoConstantesFunciones.resaltarid_empresaCosto);}
		if(this.costoConstantesFunciones.resaltarid_sucursalCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setBorder(this.costoConstantesFunciones.resaltarid_sucursalCosto);}
		if(this.costoConstantesFunciones.resaltarid_bodegaCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setBorder(this.costoConstantesFunciones.resaltarid_bodegaCosto);}
		if(this.costoConstantesFunciones.resaltarid_productoCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setBorder(this.costoConstantesFunciones.resaltarid_productoCosto);}
		if(this.costoConstantesFunciones.resaltarid_periodoCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setBorder(this.costoConstantesFunciones.resaltarid_periodoCosto);}
		if(this.costoConstantesFunciones.resaltarid_ejercicioCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setBorder(this.costoConstantesFunciones.resaltarid_ejercicioCosto);}
		if(this.costoConstantesFunciones.resaltarid_detalle_movimiento_inventarioCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setBorder(this.costoConstantesFunciones.resaltarid_detalle_movimiento_inventarioCosto);}
		if(this.costoConstantesFunciones.resaltarid_tipo_costoCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setBorder(this.costoConstantesFunciones.resaltarid_tipo_costoCosto);}
		if(this.costoConstantesFunciones.resaltarnumero_comprobanteCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jTextFieldnumero_comprobanteCosto.setBorder(this.costoConstantesFunciones.resaltarnumero_comprobanteCosto);}
		if(this.costoConstantesFunciones.resaltarfechaCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jDateChooserfechaCosto.setBorder(this.costoConstantesFunciones.resaltarfechaCosto);}
		if(this.costoConstantesFunciones.resaltarcantidadCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jTextFieldcantidadCosto.setBorder(this.costoConstantesFunciones.resaltarcantidadCosto);}
		if(this.costoConstantesFunciones.resaltarvalor_unitarioCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jTextFieldvalor_unitarioCosto.setBorder(this.costoConstantesFunciones.resaltarvalor_unitarioCosto);}
		if(this.costoConstantesFunciones.resaltarvalor_totalCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jTextFieldvalor_totalCosto.setBorder(this.costoConstantesFunciones.resaltarvalor_totalCosto);}
		if(this.costoConstantesFunciones.resaltarid_anioCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setBorder(this.costoConstantesFunciones.resaltarid_anioCosto);}
		if(this.costoConstantesFunciones.resaltarid_mesCosto!=null && this.jInternalFrameDetalleFormCosto!=null) {this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setBorder(this.costoConstantesFunciones.resaltarid_mesCosto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCosto() throws Exception {		
		if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCosto!=null) {
	
		//this.jInternalFrameDetalleFormCosto.jLabelidCosto.setVisible(this.costoConstantesFunciones.mostraridCosto);
		this.jInternalFrameDetalleFormCosto.jPanelidCosto.setVisible(this.costoConstantesFunciones.mostraridCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setVisible(this.costoConstantesFunciones.mostrarid_empresaCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_empresaCosto.setVisible(this.costoConstantesFunciones.mostrarid_empresaCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setVisible(this.costoConstantesFunciones.mostrarid_sucursalCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_sucursalCosto.setVisible(this.costoConstantesFunciones.mostrarid_sucursalCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setVisible(this.costoConstantesFunciones.mostrarid_bodegaCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_bodegaCosto.setVisible(this.costoConstantesFunciones.mostrarid_bodegaCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setVisible(this.costoConstantesFunciones.mostrarid_productoCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_productoCosto.setVisible(this.costoConstantesFunciones.mostrarid_productoCosto);
			this.jInternalFrameDetalleFormCosto.jButtonid_productoCosto.setVisible(this.costoConstantesFunciones.mostrarid_productoCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setVisible(this.costoConstantesFunciones.mostrarid_periodoCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_periodoCosto.setVisible(this.costoConstantesFunciones.mostrarid_periodoCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setVisible(this.costoConstantesFunciones.mostrarid_ejercicioCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_ejercicioCosto.setVisible(this.costoConstantesFunciones.mostrarid_ejercicioCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setVisible(this.costoConstantesFunciones.mostrarid_detalle_movimiento_inventarioCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_detalle_movimiento_inventarioCosto.setVisible(this.costoConstantesFunciones.mostrarid_detalle_movimiento_inventarioCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setVisible(this.costoConstantesFunciones.mostrarid_tipo_costoCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_tipo_costoCosto.setVisible(this.costoConstantesFunciones.mostrarid_tipo_costoCosto);
		//this.jInternalFrameDetalleFormCosto.jTextFieldnumero_comprobanteCosto.setVisible(this.costoConstantesFunciones.mostrarnumero_comprobanteCosto);
		this.jInternalFrameDetalleFormCosto.jPanelnumero_comprobanteCosto.setVisible(this.costoConstantesFunciones.mostrarnumero_comprobanteCosto);
		//this.jInternalFrameDetalleFormCosto.jDateChooserfechaCosto.setVisible(this.costoConstantesFunciones.mostrarfechaCosto);
		this.jInternalFrameDetalleFormCosto.jPanelfechaCosto.setVisible(this.costoConstantesFunciones.mostrarfechaCosto);
		//this.jInternalFrameDetalleFormCosto.jTextFieldcantidadCosto.setVisible(this.costoConstantesFunciones.mostrarcantidadCosto);
		this.jInternalFrameDetalleFormCosto.jPanelcantidadCosto.setVisible(this.costoConstantesFunciones.mostrarcantidadCosto);
		//this.jInternalFrameDetalleFormCosto.jTextFieldvalor_unitarioCosto.setVisible(this.costoConstantesFunciones.mostrarvalor_unitarioCosto);
		this.jInternalFrameDetalleFormCosto.jPanelvalor_unitarioCosto.setVisible(this.costoConstantesFunciones.mostrarvalor_unitarioCosto);
		//this.jInternalFrameDetalleFormCosto.jTextFieldvalor_totalCosto.setVisible(this.costoConstantesFunciones.mostrarvalor_totalCosto);
		this.jInternalFrameDetalleFormCosto.jPanelvalor_totalCosto.setVisible(this.costoConstantesFunciones.mostrarvalor_totalCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setVisible(this.costoConstantesFunciones.mostrarid_anioCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_anioCosto.setVisible(this.costoConstantesFunciones.mostrarid_anioCosto);
		//this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setVisible(this.costoConstantesFunciones.mostrarid_mesCosto);
		this.jInternalFrameDetalleFormCosto.jPanelid_mesCosto.setVisible(this.costoConstantesFunciones.mostrarid_mesCosto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCosto() throws Exception {
		if(this.jInternalFrameDetalleFormCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCosto!=null) {
	
		this.jInternalFrameDetalleFormCosto.jLabelidCosto.setEnabled(this.costoConstantesFunciones.activaridCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_empresaCosto.setEnabled(this.costoConstantesFunciones.activarid_empresaCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_sucursalCosto.setEnabled(this.costoConstantesFunciones.activarid_sucursalCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_bodegaCosto.setEnabled(this.costoConstantesFunciones.activarid_bodegaCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_productoCosto.setEnabled(this.costoConstantesFunciones.activarid_productoCosto);
			this.jInternalFrameDetalleFormCosto.jButtonid_productoCosto.setEnabled(this.costoConstantesFunciones.activarid_productoCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_periodoCosto.setEnabled(this.costoConstantesFunciones.activarid_periodoCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_ejercicioCosto.setEnabled(this.costoConstantesFunciones.activarid_ejercicioCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_detalle_movimiento_inventarioCosto.setEnabled(this.costoConstantesFunciones.activarid_detalle_movimiento_inventarioCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_tipo_costoCosto.setEnabled(this.costoConstantesFunciones.activarid_tipo_costoCosto);
		this.jInternalFrameDetalleFormCosto.jTextFieldnumero_comprobanteCosto.setEnabled(this.costoConstantesFunciones.activarnumero_comprobanteCosto);
		this.jInternalFrameDetalleFormCosto.jDateChooserfechaCosto.setEnabled(this.costoConstantesFunciones.activarfechaCosto);
		this.jInternalFrameDetalleFormCosto.jTextFieldcantidadCosto.setEnabled(this.costoConstantesFunciones.activarcantidadCosto);
		this.jInternalFrameDetalleFormCosto.jTextFieldvalor_unitarioCosto.setEnabled(this.costoConstantesFunciones.activarvalor_unitarioCosto);
		this.jInternalFrameDetalleFormCosto.jTextFieldvalor_totalCosto.setEnabled(this.costoConstantesFunciones.activarvalor_totalCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_anioCosto.setEnabled(this.costoConstantesFunciones.activarid_anioCosto);
		this.jInternalFrameDetalleFormCosto.jComboBoxid_mesCosto.setEnabled(this.costoConstantesFunciones.activarid_mesCosto);
		}
	}
	
		
}