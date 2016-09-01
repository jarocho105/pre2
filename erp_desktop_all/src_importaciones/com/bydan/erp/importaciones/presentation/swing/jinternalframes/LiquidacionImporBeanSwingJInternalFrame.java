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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.LiquidacionImporConstantesFunciones;
import com.bydan.erp.importaciones.util.LiquidacionImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.LiquidacionImporParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.LiquidacionImporBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
public class LiquidacionImporBeanSwingJInternalFrame extends LiquidacionImporJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LiquidacionImporBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<LiquidacionImpor> liquidacionimporValidator = new ClassValidator<LiquidacionImpor>(LiquidacionImpor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public LiquidacionImpor liquidacionimpor;	
	public LiquidacionImpor liquidacionimporAux;
	public LiquidacionImpor liquidacionimporAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public LiquidacionImpor liquidacionimporTotales;
	public Long idLiquidacionImporActual;
	public Long iIdNuevoLiquidacionImpor=0L;
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

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
	}

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboPuerto="";

	public List<Puerto> puertosForeignKey;

	public List<Puerto> getpuertosForeignKey() {
		return puertosForeignKey;
	}

	public void setpuertosForeignKey(List<Puerto> puertosForeignKey) {
		this.puertosForeignKey = puertosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Puerto puertoForeignKey;

	public Puerto getpuertoForeignKey() {
		return puertoForeignKey;
	}

	public void setpuertoForeignKey(Puerto puertoForeignKey) {
		this.puertoForeignKey = puertoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleLiquidacionImpor=false;

	public Boolean getIsTienePermisosDetalleLiquidacionImpor() {
		return isTienePermisosDetalleLiquidacionImpor;
	}

	public void setIsTienePermisosDetalleLiquidacionImpor(Boolean isTienePermisosDetalleLiquidacionImpor) {
		this.isTienePermisosDetalleLiquidacionImpor= isTienePermisosDetalleLiquidacionImpor;
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
	
	public Boolean isPermisoTodoLiquidacionImpor;
	public Boolean isPermisoNuevoLiquidacionImpor;
	public Boolean isPermisoActualizarLiquidacionImpor;
	public Boolean isPermisoActualizarOriginalLiquidacionImpor;
	public Boolean isPermisoEliminarLiquidacionImpor;
	public Boolean isPermisoGuardarCambiosLiquidacionImpor;
	public Boolean isPermisoConsultaLiquidacionImpor;
	public Boolean isPermisoBusquedaLiquidacionImpor;
	public Boolean isPermisoReporteLiquidacionImpor;
	public Boolean isPermisoPaginacionMedioLiquidacionImpor;
	public Boolean isPermisoPaginacionAltoLiquidacionImpor;
	public Boolean isPermisoPaginacionTodoLiquidacionImpor;
	public Boolean isPermisoCopiarLiquidacionImpor;
	public Boolean isPermisoVerFormLiquidacionImpor;
	public Boolean isPermisoDuplicarLiquidacionImpor;
	public Boolean isPermisoOrdenLiquidacionImpor;
	
	
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
	
	public LiquidacionImporParameterReturnGeneral liquidacionimporReturnGeneral;
	public LiquidacionImporParameterReturnGeneral liquidacionimporParameterGeneral;
	
	

	public DetalleLiquidacionImporLogic detalleliquidacionimporLogic=null;

	public DetalleLiquidacionImporLogic getDetalleLiquidacionImporLogic() {
		return detalleliquidacionimporLogic;
	}

	public void setDetalleLiquidacionImporLogic(DetalleLiquidacionImporLogic detalleliquidacionimporLogic) {
		this.detalleliquidacionimporLogic = detalleliquidacionimporLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoLiquidacionImpor=false;
	public Boolean esParaAccionDesdeFormularioLiquidacionImpor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected LiquidacionImporSessionBeanAdditional liquidacionimporSessionBeanAdditional=null;
	
	public LiquidacionImporSessionBeanAdditional getLiquidacionImporSessionBeanAdditional() {
		return this.liquidacionimporSessionBeanAdditional;
	}
	
	public void setLiquidacionImporSessionBeanAdditional(LiquidacionImporSessionBeanAdditional liquidacionimporSessionBeanAdditional) {
		try {
			this.liquidacionimporSessionBeanAdditional=liquidacionimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected LiquidacionImporBeanSwingJInternalFrameAdditional liquidacionimporBeanSwingJInternalFrameAdditional=null;
	//public class LiquidacionImporBeanSwingJInternalFrame
	
	public LiquidacionImporBeanSwingJInternalFrameAdditional getLiquidacionImporBeanSwingJInternalFrameAdditional() {
		return this.liquidacionimporBeanSwingJInternalFrameAdditional;
	}
	
	public void setLiquidacionImporBeanSwingJInternalFrameAdditional(LiquidacionImporBeanSwingJInternalFrameAdditional liquidacionimporBeanSwingJInternalFrameAdditional) {
		try {
			this.liquidacionimporBeanSwingJInternalFrameAdditional=liquidacionimporBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public LiquidacionImporLogic liquidacionimporLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public LiquidacionImpor liquidacionimporBean;
	public LiquidacionImporConstantesFunciones liquidacionimporConstantesFunciones;
	//public LiquidacionImporParameterReturnGeneral liquidacionimporReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public CentroCostoLogic centrocostoLogic;
	public CuentaContableLogic cuentacontableLogic;
	public PaisLogic paisLogic;
	public PuertoLogic puertoLogic;
	
	//PARAMETROS
	
	
	//public List<LiquidacionImpor> liquidacionimpors;	
	//public List<LiquidacionImpor> liquidacionimporsEliminados;
	//public List<LiquidacionImpor> liquidacionimporsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaDuplicarLiquidacionImpor=true;
	public Boolean isVisibilidadCeldaCopiarLiquidacionImpor=true;
	public Boolean isVisibilidadCeldaVerFormLiquidacionImpor=true;
	public Boolean isVisibilidadCeldaOrdenLiquidacionImpor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaModificarLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaActualizarLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaEliminarLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaCancelarLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaGuardarLiquidacionImpor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;	
	
	
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdPuerto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoLiquidacionImpor() {
		return this.iIdNuevoLiquidacionImpor;
	}

	public void setiIdNuevoLiquidacionImpor(Long iIdNuevoLiquidacionImpor) {
		this.iIdNuevoLiquidacionImpor = iIdNuevoLiquidacionImpor;
	}
	
	public Long getidLiquidacionImporActual() {
		return this.idLiquidacionImporActual;
	}

	public void setidLiquidacionImporActual(Long idLiquidacionImporActual) {
		this.idLiquidacionImporActual = idLiquidacionImporActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public LiquidacionImpor getliquidacionimpor() {
		return this.liquidacionimpor;
	}

	public void setliquidacionimpor(LiquidacionImpor liquidacionimpor) {
		this.liquidacionimpor = liquidacionimpor;
	}
	
	public LiquidacionImpor getliquidacionimporAux() {
		return this.liquidacionimporAux;
	}

	public void setliquidacionimporAux(LiquidacionImpor liquidacionimporAux) {
		this.liquidacionimporAux = liquidacionimporAux;
	}				
	
	public LiquidacionImpor getliquidacionimporAnterior() {
		return this.liquidacionimporAnterior;
	}

	public void setliquidacionimporAnterior(LiquidacionImpor liquidacionimporAnterior) {
		this.liquidacionimporAnterior = liquidacionimporAnterior;
	}	
	
	public LiquidacionImpor getliquidacionimporTotales() {
		return this.liquidacionimporTotales;
	}

	public void setliquidacionimporTotales(LiquidacionImpor liquidacionimporTotales) {
		this.liquidacionimporTotales = liquidacionimporTotales;
	}	
	
	public LiquidacionImpor getliquidacionimporBean() {
		return this.liquidacionimporBean;
	}

	public void setliquidacionimporBean(LiquidacionImpor liquidacionimporBean) {
		this.liquidacionimporBean = liquidacionimporBean;
	}	
	
	public LiquidacionImporParameterReturnGeneral getliquidacionimporReturnGeneral() {
		return this.liquidacionimporReturnGeneral;
	}

	public void setliquidacionimporReturnGeneral(LiquidacionImporParameterReturnGeneral liquidacionimporReturnGeneral) {
		this.liquidacionimporReturnGeneral = liquidacionimporReturnGeneral;
	}	
	
	
	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_puertoFK_IdPuerto=-1L;

	public Long getid_puertoFK_IdPuerto() {
		return this.id_puertoFK_IdPuerto;
	}

	public void setid_puertoFK_IdPuerto(Long id_puertoFK_IdPuerto) {
		this.id_puertoFK_IdPuerto = id_puertoFK_IdPuerto;
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
	
	
	public LiquidacionImporLogic getLiquidacionImporLogic()	{		
		return liquidacionimporLogic;
	}

	public void setLiquidacionImporLogic(LiquidacionImporLogic liquidacionimporLogic) {
		this.liquidacionimporLogic = liquidacionimporLogic;
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
	
	public Boolean getIsEsNuevoLiquidacionImpor() {
		return isEsNuevoLiquidacionImpor;
	}

	public void setIsEsNuevoLiquidacionImpor(Boolean isEsNuevoLiquidacionImpor) {
		this.isEsNuevoLiquidacionImpor = isEsNuevoLiquidacionImpor;
	}

	public Boolean getEsParaAccionDesdeFormularioLiquidacionImpor() {
		return esParaAccionDesdeFormularioLiquidacionImpor;
	}
	
	public void setEsParaAccionDesdeFormularioLiquidacionImpor(Boolean esParaAccionDesdeFormularioLiquidacionImpor) {
		this.esParaAccionDesdeFormularioLiquidacionImpor = esParaAccionDesdeFormularioLiquidacionImpor;
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

			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(liquidacionimporSessionBean.getlidEmpresaActual());
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

			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(liquidacionimporSessionBean.getlidSucursalActual());
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

			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
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
					centrocostoLogic.getEntityWithConnection(liquidacionimporSessionBean.getlidCentroCostoActual());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(liquidacionimporSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(liquidacionimporSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosPuertosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.puertosForeignKey=new ArrayList<Puerto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PuertoLogic puertoLogic=new PuertoLogic();

			//puertoLogic.getPuertoDataAccess().setIsForForeingKeyData(true);

			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionPuerto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//puertoLogic.getPuertoDataAccess().setIsForForeingKeyData(true);

					puertoLogic.getTodosPuertosWithConnection(sFinalQuery,new Pagination());

					this.puertosForeignKey=puertoLogic.getPuertos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPuerto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					puertoLogic.getEntityWithConnection(liquidacionimporSessionBean.getlidPuertoActual());
					this.puertosForeignKey.add(puertoLogic.getPuerto());
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

					if(this.liquidacionimpor!=null) {
						this.liquidacionimpor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaLiquidacionImpor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaLiquidacionImporGenerico)throws Exception
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
				jComboBoxid_empresaLiquidacionImporGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaLiquidacionImporGenerico!=null && jComboBoxid_empresaLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_empresaLiquidacionImporGenerico.setSelectedIndex(0);
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

					if(this.liquidacionimpor!=null) {
						this.liquidacionimpor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalLiquidacionImpor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalLiquidacionImporGenerico)throws Exception
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
				jComboBoxid_sucursalLiquidacionImporGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalLiquidacionImporGenerico!=null && jComboBoxid_sucursalLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_sucursalLiquidacionImporGenerico.setSelectedIndex(0);
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

					if(this.liquidacionimpor!=null) {
						this.liquidacionimpor.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoLiquidacionImpor.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.setSelectedIndex(0);
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
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoLiquidacionImporGenerico)throws Exception
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
				jComboBoxid_centro_costoLiquidacionImporGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoLiquidacionImporGenerico!=null && jComboBoxid_centro_costoLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoLiquidacionImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.liquidacionimpor!=null) {
						this.liquidacionimpor.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableLiquidacionImpor.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableLiquidacionImporGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contableLiquidacionImporGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableLiquidacionImporGenerico!=null && jComboBoxid_cuenta_contableLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableLiquidacionImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.liquidacionimpor!=null) {
						this.liquidacionimpor.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisLiquidacionImpor.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisLiquidacionImpor!=null) {
						jComboBoxid_paisFK_IdPaisLiquidacionImpor.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisLiquidacionImpor!=null) {
							//jComboBoxid_paisFK_IdPaisLiquidacionImpor.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisLiquidacionImpor.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisLiquidacionImpor.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisLiquidacionImporGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisLiquidacionImporGenerico!=null && jComboBoxid_paisLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_paisLiquidacionImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPuertoForeignKey(Long idPuertoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Puerto  puertoTemp=null;

			for(Puerto puertoAux:puertosForeignKey) {
				if(puertoAux.getId()!=null && puertoAux.getId().equals(idPuertoSeleccionado)) {
					puertoTemp=puertoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(puertoTemp!=null) {

					if(this.liquidacionimpor!=null) {
						this.liquidacionimpor.setPuerto(puertoTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setSelectedItem(puertoTemp);
					}
				} else {
					//jComboBoxid_puertoLiquidacionImpor.setSelectedItem(puertoTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPuerto") || sFormularioTipoBusqueda.equals("Todos")){
					if(puertoTemp!=null && jComboBoxid_puertoFK_IdPuertoLiquidacionImpor!=null) {
						jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.setSelectedItem(puertoTemp);
					} else {
						if(jComboBoxid_puertoFK_IdPuertoLiquidacionImpor!=null) {
							//jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.setSelectedItem(puertoTemp);
							if(jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.getItemCount()>0) {
								jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.setSelectedIndex(0);
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

	public String getActualPuertoForeignKeyDescripcion(Long idPuertoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Puerto  puertoTemp=null;

			for(Puerto puertoAux:puertosForeignKey) {
				if(puertoAux.getId()!=null && puertoAux.getId().equals(idPuertoSeleccionado)) {
					puertoTemp=puertoAux;
					break;
				}
			}


			sDescripcion=PuertoConstantesFunciones.getPuertoDescripcion(puertoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPuertoForeignKeyGenerico(Long idPuertoSeleccionado,JComboBox jComboBoxid_puertoLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Puerto  puertoTemp=null;

			for(Puerto puertoAux:puertosForeignKey) {
				if(puertoAux.getId()!=null && puertoAux.getId().equals(idPuertoSeleccionado)) {
					puertoTemp=puertoAux;
					break;
				}
			}

			if(puertoTemp!=null) {
				jComboBoxid_puertoLiquidacionImporGenerico.setSelectedItem(puertoTemp);
			} else {
				if(jComboBoxid_puertoLiquidacionImporGenerico!=null && jComboBoxid_puertoLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_puertoLiquidacionImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(LiquidacionImpor liquidacionimpor,JComboBox jComboBoxid_empresaLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaLiquidacionImporGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaLiquidacionImporGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				liquidacionimpor.setid_empresa(empresaAux.getId());
				liquidacionimpor.setempresa_descripcion(LiquidacionImporConstantesFunciones.getEmpresaDescripcion(empresaAux));
				liquidacionimpor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(LiquidacionImpor liquidacionimpor,JComboBox jComboBoxid_sucursalLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalLiquidacionImporGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalLiquidacionImporGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				liquidacionimpor.setid_sucursal(sucursalAux.getId());
				liquidacionimpor.setsucursal_descripcion(LiquidacionImporConstantesFunciones.getSucursalDescripcion(sucursalAux));
				liquidacionimpor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(LiquidacionImpor liquidacionimpor,JComboBox jComboBoxid_centro_costoLiquidacionImporGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoLiquidacionImporGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoLiquidacionImporGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				liquidacionimpor.setid_centro_costo(centrocostoAux.getId());
				liquidacionimpor.setcentrocosto_descripcion(LiquidacionImporConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				liquidacionimpor.setCentroCosto(centrocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(LiquidacionImpor liquidacionimpor,JComboBox jComboBoxid_cuenta_contableLiquidacionImporGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableLiquidacionImporGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableLiquidacionImporGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				liquidacionimpor.setid_cuenta_contable(cuentacontableAux.getId());
				liquidacionimpor.setcuentacontable_descripcion(LiquidacionImporConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				liquidacionimpor.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(LiquidacionImpor liquidacionimpor,JComboBox jComboBoxid_paisLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisLiquidacionImporGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisLiquidacionImporGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				liquidacionimpor.setid_pais(paisAux.getId());
				liquidacionimpor.setpais_descripcion(LiquidacionImporConstantesFunciones.getPaisDescripcion(paisAux));
				liquidacionimpor.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPuertoForeignKey(LiquidacionImpor liquidacionimpor,JComboBox jComboBoxid_puertoLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Puerto  puertoAux=new Puerto();

			if(jComboBoxid_puertoLiquidacionImporGenerico==null) {
				puertoAux=(Puerto)this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.getSelectedItem();
			} else {
				puertoAux=(Puerto)jComboBoxid_puertoLiquidacionImporGenerico.getSelectedItem();
			}

			if(puertoAux!=null && puertoAux.getId()!=null) {
				liquidacionimpor.setid_puerto(puertoAux.getId());
				liquidacionimpor.setpuerto_descripcion(LiquidacionImporConstantesFunciones.getPuertoDescripcion(puertoAux));
				liquidacionimpor.setPuerto(puertoAux);			}
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

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
					}

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
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

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
					}

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
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

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
					}

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.addItem(centrocosto);
							}
						}

						if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
					}

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.addItem(cuentacontable);
							}
						}

						if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
					}

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisLiquidacionImpor.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisLiquidacionImpor.addItem(pais);
							}
						}

						if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePuertosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPuerto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.removeAllItems();

							for(Puerto puerto:this.puertosForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.addItem(puerto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { 
					}

					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPuerto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.removeAllItems();

							for(Puerto puerto:this.puertosForeignKey) {
								this.jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.addItem(puerto);
							}
						}

						if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisLiquidacionImpor.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePuertoForeignKey(Puerto puerto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setSelectedItem(puerto);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.setSelectedItem(puerto);
						} else {
							this.jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesLiquidacionImpor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			LiquidacionImporConstantesFunciones.refrescarForeignKeysDescripcionesLiquidacionImpor(this.liquidacionimporLogic.getLiquidacionImpors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			LiquidacionImporConstantesFunciones.refrescarForeignKeysDescripcionesLiquidacionImpor(this.liquidacionimpors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(CentroCosto.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Puerto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//liquidacionimporLogic.setLiquidacionImpors(this.liquidacionimpors);
			liquidacionimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public LiquidacionImporParameterReturnGeneral getLiquidacionImporParameterGeneral() {
		return this.liquidacionimporParameterGeneral;
	}
	
	public void setLiquidacionImporParameterGeneral(LiquidacionImporParameterReturnGeneral liquidacionimporParameterGeneral) {
		this.liquidacionimporParameterGeneral = liquidacionimporParameterGeneral;
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
	
	public Boolean getIsPermisoTodoLiquidacionImpor() {
		return isPermisoTodoLiquidacionImpor;
	}

	public void setIsPermisoTodoLiquidacionImpor(Boolean isPermisoTodoLiquidacionImpor) {
		this.isPermisoTodoLiquidacionImpor = isPermisoTodoLiquidacionImpor;
	}

	public Boolean getIsPermisoNuevoLiquidacionImpor() {
		return isPermisoNuevoLiquidacionImpor;
	}

	public void setIsPermisoNuevoLiquidacionImpor(Boolean isPermisoNuevoLiquidacionImpor) {
		this.isPermisoNuevoLiquidacionImpor = isPermisoNuevoLiquidacionImpor;
	}

	public Boolean getIsPermisoActualizarLiquidacionImpor() {
		return isPermisoActualizarLiquidacionImpor;
	}

	public void setIsPermisoActualizarLiquidacionImpor(Boolean isPermisoActualizarLiquidacionImpor) {
		this.isPermisoActualizarLiquidacionImpor = isPermisoActualizarLiquidacionImpor;
	}

	public Boolean getIsPermisoEliminarLiquidacionImpor() {
		return isPermisoEliminarLiquidacionImpor;
	}

	public void setIsPermisoEliminarLiquidacionImpor(Boolean isPermisoEliminarLiquidacionImpor) {
		this.isPermisoEliminarLiquidacionImpor = isPermisoEliminarLiquidacionImpor;
	}

	public Boolean getIsPermisoGuardarCambiosLiquidacionImpor() {
		return isPermisoGuardarCambiosLiquidacionImpor;
	}

	public void setIsPermisoGuardarCambiosLiquidacionImpor(Boolean isPermisoGuardarCambiosLiquidacionImpor) {
		this.isPermisoGuardarCambiosLiquidacionImpor = isPermisoGuardarCambiosLiquidacionImpor;
	}
	
	public Boolean getIsPermisoConsultaLiquidacionImpor() {
		return isPermisoConsultaLiquidacionImpor;
	}

	public void setIsPermisoConsultaLiquidacionImpor(Boolean isPermisoConsultaLiquidacionImpor) {
		this.isPermisoConsultaLiquidacionImpor = isPermisoConsultaLiquidacionImpor;
	}

	public Boolean getIsPermisoBusquedaLiquidacionImpor() {
		return isPermisoBusquedaLiquidacionImpor;
	}

	public void setIsPermisoBusquedaLiquidacionImpor(Boolean isPermisoBusquedaLiquidacionImpor) {
		this.isPermisoBusquedaLiquidacionImpor = isPermisoBusquedaLiquidacionImpor;
	}

	public Boolean getIsPermisoReporteLiquidacionImpor() {
		return isPermisoReporteLiquidacionImpor;
	}

	public void setIsPermisoReporteLiquidacionImpor(Boolean isPermisoReporteLiquidacionImpor) {
		this.isPermisoReporteLiquidacionImpor = isPermisoReporteLiquidacionImpor;
	}
	
	public Boolean getIsPermisoPaginacionMedioLiquidacionImpor() {
		return isPermisoPaginacionMedioLiquidacionImpor;
	}

	public void setIsPermisoPaginacionMedioLiquidacionImpor(Boolean isPermisoPaginacionMedioLiquidacionImpor) {
		this.isPermisoPaginacionMedioLiquidacionImpor = isPermisoPaginacionMedioLiquidacionImpor;
	}
	
	public Boolean getIsPermisoPaginacionTodoLiquidacionImpor() {
		return isPermisoPaginacionTodoLiquidacionImpor;
	}

	public void setIsPermisoPaginacionTodoLiquidacionImpor(Boolean isPermisoPaginacionTodoLiquidacionImpor) {
		this.isPermisoPaginacionTodoLiquidacionImpor = isPermisoPaginacionTodoLiquidacionImpor;
	}
	
	public Boolean getIsPermisoPaginacionAltoLiquidacionImpor() {
		return isPermisoPaginacionAltoLiquidacionImpor;
	}

	public void setIsPermisoPaginacionAltoLiquidacionImpor(Boolean isPermisoPaginacionAltoLiquidacionImpor) {
		this.isPermisoPaginacionAltoLiquidacionImpor = isPermisoPaginacionAltoLiquidacionImpor;
	}
	
	public Boolean getIsPermisoCopiarLiquidacionImpor() {
		return isPermisoCopiarLiquidacionImpor;
	}

	public void setIsPermisoCopiarLiquidacionImpor(Boolean isPermisoCopiarLiquidacionImpor) {
		this.isPermisoCopiarLiquidacionImpor = isPermisoCopiarLiquidacionImpor;
	}
	
	public Boolean getIsPermisoVerFormLiquidacionImpor() {
		return isPermisoVerFormLiquidacionImpor;
	}

	public void setIsPermisoVerFormLiquidacionImpor(Boolean isPermisoVerFormLiquidacionImpor) {
		this.isPermisoVerFormLiquidacionImpor = isPermisoVerFormLiquidacionImpor;
	}
	
	public Boolean getIsPermisoDuplicarLiquidacionImpor() {
		return isPermisoDuplicarLiquidacionImpor;
	}

	public void setIsPermisoDuplicarLiquidacionImpor(Boolean isPermisoDuplicarLiquidacionImpor) {
		this.isPermisoDuplicarLiquidacionImpor = isPermisoDuplicarLiquidacionImpor;
	}
	
	public Boolean getIsPermisoOrdenLiquidacionImpor() {
		return isPermisoOrdenLiquidacionImpor;
	}

	public void setIsPermisoOrdenLiquidacionImpor(Boolean isPermisoOrdenLiquidacionImpor) {
		this.isPermisoOrdenLiquidacionImpor = isPermisoOrdenLiquidacionImpor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoLiquidacionImpor() {
		return isVisibilidadCeldaNuevoLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaNuevoLiquidacionImpor(Boolean isVisibilidadCeldaNuevoLiquidacionImpor) {
		this.isVisibilidadCeldaNuevoLiquidacionImpor = isVisibilidadCeldaNuevoLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarLiquidacionImpor() {
		return isVisibilidadCeldaDuplicarLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaDuplicarLiquidacionImpor(Boolean isVisibilidadCeldaDuplicarLiquidacionImpor) {
		this.isVisibilidadCeldaDuplicarLiquidacionImpor = isVisibilidadCeldaDuplicarLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarLiquidacionImpor() {
		return isVisibilidadCeldaCopiarLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaCopiarLiquidacionImpor(Boolean isVisibilidadCeldaCopiarLiquidacionImpor) {
		this.isVisibilidadCeldaCopiarLiquidacionImpor = isVisibilidadCeldaCopiarLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormLiquidacionImpor() {
		return isVisibilidadCeldaVerFormLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaVerFormLiquidacionImpor(Boolean isVisibilidadCeldaVerFormLiquidacionImpor) {
		this.isVisibilidadCeldaVerFormLiquidacionImpor = isVisibilidadCeldaVerFormLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenLiquidacionImpor() {
		return isVisibilidadCeldaOrdenLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaOrdenLiquidacionImpor(Boolean isVisibilidadCeldaOrdenLiquidacionImpor) {
		this.isVisibilidadCeldaOrdenLiquidacionImpor = isVisibilidadCeldaOrdenLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesLiquidacionImpor() {
		return isVisibilidadCeldaNuevoRelacionesLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesLiquidacionImpor(Boolean isVisibilidadCeldaNuevoRelacionesLiquidacionImpor) {
		this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor = isVisibilidadCeldaNuevoRelacionesLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarLiquidacionImpor() {
		return isVisibilidadCeldaModificarLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaModificarLiquidacionImpor(Boolean isVisibilidadCeldaModificarLiquidacionImpor) {
		this.isVisibilidadCeldaModificarLiquidacionImpor = isVisibilidadCeldaModificarLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarLiquidacionImpor() {
		return isVisibilidadCeldaActualizarLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaActualizarLiquidacionImpor(Boolean isVisibilidadCeldaActualizarLiquidacionImpor) {
		this.isVisibilidadCeldaActualizarLiquidacionImpor = isVisibilidadCeldaActualizarLiquidacionImpor;
	}

	public Boolean getIsVisibilidadCeldaEliminarLiquidacionImpor() {
		return isVisibilidadCeldaEliminarLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaEliminarLiquidacionImpor(Boolean isVisibilidadCeldaEliminarLiquidacionImpor) {
		this.isVisibilidadCeldaEliminarLiquidacionImpor = isVisibilidadCeldaEliminarLiquidacionImpor;
	}

	public Boolean getIsVisibilidadCeldaCancelarLiquidacionImpor() {
		return isVisibilidadCeldaCancelarLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaCancelarLiquidacionImpor(Boolean isVisibilidadCeldaCancelarLiquidacionImpor) {
		this.isVisibilidadCeldaCancelarLiquidacionImpor = isVisibilidadCeldaCancelarLiquidacionImpor;
	}

	public Boolean getIsVisibilidadCeldaGuardarLiquidacionImpor() {
		return isVisibilidadCeldaGuardarLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaGuardarLiquidacionImpor(Boolean isVisibilidadCeldaGuardarLiquidacionImpor) {
		this.isVisibilidadCeldaGuardarLiquidacionImpor = isVisibilidadCeldaGuardarLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosLiquidacionImpor() {
		return isVisibilidadCeldaGuardarCambiosLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosLiquidacionImpor(Boolean isVisibilidadCeldaGuardarCambiosLiquidacionImpor) {
		this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor = isVisibilidadCeldaGuardarCambiosLiquidacionImpor;
	}
		
	public LiquidacionImporSessionBean getliquidacionimporSessionBean() {
		return this.liquidacionimporSessionBean;
	}
	
	public void setliquidacionimporSessionBean(LiquidacionImporSessionBean liquidacionimporSessionBean) {
		this.liquidacionimporSessionBean=liquidacionimporSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdPuerto() {
		return this.isVisibilidadFK_IdPuerto;
	}

	public void setisVisibilidadFK_IdPuerto(Boolean isVisibilidadFK_IdPuerto) {
		this.isVisibilidadFK_IdPuerto=isVisibilidadFK_IdPuerto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(LiquidacionImpor liquidacionimpor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(liquidacionimpor,null);
				this.setActualParaGuardarSucursalForeignKey(liquidacionimpor,null);
				this.setActualParaGuardarCentroCostoForeignKey(liquidacionimpor,null);
				this.setActualParaGuardarCuentaContableForeignKey(liquidacionimpor,null);
				this.setActualParaGuardarPaisForeignKey(liquidacionimpor,null);
				this.setActualParaGuardarPuertoForeignKey(liquidacionimpor,null);
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
	
	public void bugActualizarReferenciaActual(LiquidacionImpor liquidacionimpor,LiquidacionImpor liquidacionimporAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalLiquidacionImpor(liquidacionimpor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		liquidacionimporAux.setId(liquidacionimpor.getId());
		liquidacionimporAux.setVersionRow(liquidacionimpor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessLiquidacionImpor();
		
			int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = liquidacionimporValidator.getInvalidValues(this.liquidacionimpor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			liquidacionimporLogic.setDatosCliente(datosCliente);
			liquidacionimporLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				liquidacionimporAux=new  LiquidacionImpor();
				
				liquidacionimporAux.setIsNew(true);
				liquidacionimporAux.setIsChanged(true);
				
				liquidacionimporAux.setLiquidacionImporOriginal(this.liquidacionimpor);
				
				liquidacionimporAux.setId(this.liquidacionimpor.getId());	
				liquidacionimporAux.setVersionRow(this.liquidacionimpor.getVersionRow());	
				liquidacionimporAux.setid_empresa(this.liquidacionimpor.getid_empresa());	
				liquidacionimporAux.setid_sucursal(this.liquidacionimpor.getid_sucursal());	
				liquidacionimporAux.setid_centro_costo(this.liquidacionimpor.getid_centro_costo());	
				liquidacionimporAux.setid_cuenta_contable(this.liquidacionimpor.getid_cuenta_contable());	
				liquidacionimporAux.setid_pais(this.liquidacionimpor.getid_pais());	
				liquidacionimporAux.setid_puerto(this.liquidacionimpor.getid_puerto());	
				liquidacionimporAux.setnombre(this.liquidacionimpor.getnombre());	
				liquidacionimporAux.setdescripcion(this.liquidacionimpor.getdescripcion());	
				liquidacionimporAux.setfecha(this.liquidacionimpor.getfecha());	
				liquidacionimporAux.setfecha_liquidacion(this.liquidacionimpor.getfecha_liquidacion());	
				liquidacionimporAux.setflete(this.liquidacionimpor.getflete());	
				liquidacionimporAux.settipo(this.liquidacionimpor.gettipo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.liquidacionimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(liquidacionimporAux,liquidacionimporLogic.getLiquidacionImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(liquidacionimporAux,liquidacionimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.liquidacionimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.saveLiquidacionImpors();//WithConnection
						//liquidacionimporLogic.getSetVersionRowLiquidacionImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.liquidacionimpor,liquidacionimporAux);
					
					this.refrescarForeignKeysDescripcionesLiquidacionImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors.addAll(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								liquidacionimporLogic.saveLiquidacionImporRelaciones(liquidacionimporAux,this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());//WithConnection
								//liquidacionimporLogic.getSetVersionRowLiquidacionImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.liquidacionimpor,liquidacionimporAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors= new ArrayList<DetalleLiquidacionImpor>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							liquidacionimporAux.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.liquidacionimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(liquidacionimporAux,liquidacionimporLogic.getLiquidacionImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(liquidacionimporAux,liquidacionimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.liquidacionimpor,liquidacionimporAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				liquidacionimporAux=new  LiquidacionImpor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado() 
					|| (this.liquidacionimporSessionBean.getEsGuardarRelacionado() && this.liquidacionimpor.getId()>=0)) {
						
					liquidacionimporAux.setIsNew(false);
				}
				
				liquidacionimporAux.setIsDeleted(false);
			
				liquidacionimporAux.setId(this.liquidacionimpor.getId());	
				liquidacionimporAux.setVersionRow(this.liquidacionimpor.getVersionRow());	
				liquidacionimporAux.setid_empresa(this.liquidacionimpor.getid_empresa());	
				liquidacionimporAux.setid_sucursal(this.liquidacionimpor.getid_sucursal());	
				liquidacionimporAux.setid_centro_costo(this.liquidacionimpor.getid_centro_costo());	
				liquidacionimporAux.setid_cuenta_contable(this.liquidacionimpor.getid_cuenta_contable());	
				liquidacionimporAux.setid_pais(this.liquidacionimpor.getid_pais());	
				liquidacionimporAux.setid_puerto(this.liquidacionimpor.getid_puerto());	
				liquidacionimporAux.setnombre(this.liquidacionimpor.getnombre());	
				liquidacionimporAux.setdescripcion(this.liquidacionimpor.getdescripcion());	
				liquidacionimporAux.setfecha(this.liquidacionimpor.getfecha());	
				liquidacionimporAux.setfecha_liquidacion(this.liquidacionimpor.getfecha_liquidacion());	
				liquidacionimporAux.setflete(this.liquidacionimpor.getflete());	
				liquidacionimporAux.settipo(this.liquidacionimpor.gettipo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(liquidacionimporAux,liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(liquidacionimporAux,liquidacionimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.liquidacionimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.saveLiquidacionImpors();//WithConnection
						//liquidacionimporLogic.getSetVersionRowLiquidacionImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.liquidacionimpor,liquidacionimporAux);
					
					this.refrescarForeignKeysDescripcionesLiquidacionImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors.addAll(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								liquidacionimporLogic.saveLiquidacionImporRelaciones(liquidacionimporAux,this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());//WithConnection
								//liquidacionimporLogic.getSetVersionRowLiquidacionImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.liquidacionimpor,liquidacionimporAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors= new ArrayList<DetalleLiquidacionImpor>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							liquidacionimporAux.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.liquidacionimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(liquidacionimporAux,liquidacionimporLogic.getLiquidacionImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(liquidacionimporAux,liquidacionimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.liquidacionimpor,liquidacionimporAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				liquidacionimporAux=new  LiquidacionImpor();
				
				liquidacionimporAux.setIsNew(false);
				liquidacionimporAux.setIsChanged(false);
				
				liquidacionimporAux.setIsDeleted(true);
				
				liquidacionimporAux.setId(this.liquidacionimpor.getId());	
				liquidacionimporAux.setVersionRow(this.liquidacionimpor.getVersionRow());	
				liquidacionimporAux.setid_empresa(this.liquidacionimpor.getid_empresa());	
				liquidacionimporAux.setid_sucursal(this.liquidacionimpor.getid_sucursal());	
				liquidacionimporAux.setid_centro_costo(this.liquidacionimpor.getid_centro_costo());	
				liquidacionimporAux.setid_cuenta_contable(this.liquidacionimpor.getid_cuenta_contable());	
				liquidacionimporAux.setid_pais(this.liquidacionimpor.getid_pais());	
				liquidacionimporAux.setid_puerto(this.liquidacionimpor.getid_puerto());	
				liquidacionimporAux.setnombre(this.liquidacionimpor.getnombre());	
				liquidacionimporAux.setdescripcion(this.liquidacionimpor.getdescripcion());	
				liquidacionimporAux.setfecha(this.liquidacionimpor.getfecha());	
				liquidacionimporAux.setfecha_liquidacion(this.liquidacionimpor.getfecha_liquidacion());	
				liquidacionimporAux.setflete(this.liquidacionimpor.getflete());	
				liquidacionimporAux.settipo(this.liquidacionimpor.gettipo());	
				
				if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.liquidacionimporAux.getId()>=0) {	
						this.liquidacionimporsEliminados.add(liquidacionimporAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(liquidacionimporAux,liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(liquidacionimporAux,liquidacionimpors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.liquidacionimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.saveLiquidacionImpors();//WithConnection
						//liquidacionimporLogic.getSetVersionRowLiquidacionImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors.addAll(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								liquidacionimporLogic.saveLiquidacionImporRelaciones(liquidacionimporAux,this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());//WithConnection
								//liquidacionimporLogic.getSetVersionRowLiquidacionImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors= new ArrayList<DetalleLiquidacionImpor>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							liquidacionimporAux.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
								|| this.liquidacionimporSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(liquidacionimporAux,liquidacionimporLogic.getLiquidacionImpors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(liquidacionimporAux,liquidacionimpors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getLiquidacionImpors().addAll(this.liquidacionimporsEliminados);
					
					liquidacionimporLogic.saveLiquidacionImpors();//WithConnection
					//liquidacionimporLogic.getSetVersionRowLiquidacionImpors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesLiquidacionImpor();
				
				this.liquidacionimporsEliminados= new ArrayList<LiquidacionImpor>();		
			}
			
			if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Liquidacion Impor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.liquidacionimpor=liquidacionimporAux;
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
      		//this.finishProcessLiquidacionImpor();
      	}
		
	}	
	
	public void actualizarRelaciones(LiquidacionImpor liquidacionimporLocal) throws Exception {
		
		if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				liquidacionimporLocal.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
			
			} else {
			
				liquidacionimporLocal.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(LiquidacionImpor liquidacionimporLocal) throws Exception {	
		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				liquidacionimporLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				liquidacionimporLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				liquidacionimporLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				liquidacionimporLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				liquidacionimporLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PuertoDetalleFormJInternalFrame.class)) {
				PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrameLocal=(PuertoBeanSwingJInternalFrame) ((PuertoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				puertoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPuerto(puertoBeanSwingJInternalFrameLocal.getpuerto(),true);
				puertoBeanSwingJInternalFrameLocal.actualizarLista(puertoBeanSwingJInternalFrameLocal.puerto,this.puertosForeignKey);

				puertoBeanSwingJInternalFrameLocal.actualizarRelaciones(puertoBeanSwingJInternalFrameLocal.puerto);

				liquidacionimporLocal.setPuerto(puertoBeanSwingJInternalFrameLocal.puerto);

				this.addItemDefectoCombosForeignKeyPuerto();
				this.cargarCombosFramePuertosForeignKey("Formulario");
				this.setActualPuertoForeignKey(puertoBeanSwingJInternalFrameLocal.puerto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarLiquidacionImporActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = liquidacionimporValidator.getInvalidValues(this.liquidacionimpor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(LiquidacionImpor liquidacionimpor,List<LiquidacionImpor> liquidacionimpors) throws Exception {
		try	{		
			LiquidacionImporConstantesFunciones.actualizarLista(liquidacionimpor,liquidacionimpors,this.liquidacionimporSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(LiquidacionImpor liquidacionimpor,List<LiquidacionImpor> liquidacionimpors) throws Exception {
		try	{			
			LiquidacionImporConstantesFunciones.actualizarSelectedLista(liquidacionimpor,liquidacionimpors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<LiquidacionImpor> liquidacionimporsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				liquidacionimporsLocal=this.liquidacionimporLogic.getLiquidacionImpors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				liquidacionimporsLocal=this.liquidacionimpors;
			}
			//ARCHITECTURE
		
			for(LiquidacionImpor liquidacionimporLocal:liquidacionimporsLocal) {
				if(this.permiteMantenimiento(liquidacionimporLocal) && liquidacionimporLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+LiquidacionImporConstantesFunciones.getLiquidacionImporLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_empresaLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_sucursalLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_centro_costoLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_cuenta_contableLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_paisLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.IDPUERTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_puertoLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelnombreLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabeldescripcionLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfechaLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.FECHALIQUIDACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfecha_liquidacionLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfleteLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImporConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabeltipoLiquidacionImpor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_empresaLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_sucursalLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_centro_costoLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_cuenta_contableLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_paisLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelid_puertoLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelnombreLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabeldescripcionLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfechaLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfecha_liquidacionLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfleteLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpor.jLabeltipoLiquidacionImpor,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleLiquidacionImpor")) {
			if(this.liquidacionimpor==null) {
				this.liquidacionimpor= new LiquidacionImpor();
			}

			if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLiquidacionImpor
				this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);

				this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.getdetalleliquidacionimpor().setLiquidacionImpor(this.liquidacionimpor);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoLiquidacionImpor--;	
		
		
		this.liquidacionimporAux=new LiquidacionImpor();
		
		this.liquidacionimporAux.setId(this.iIdNuevoLiquidacionImpor);
		this.liquidacionimporAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.liquidacionimporLogic.getLiquidacionImpors().add(this.liquidacionimporAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.liquidacionimpors.add(this.liquidacionimporAux);
		}
		//ARCHITECTURE
		
		this.liquidacionimpor=this.liquidacionimporAux;
		
		if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioLiquidacionImpor(this.liquidacionimpor);
			this.setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpor(this.liquidacionimpor);
		}
				
		//this.setDefaultControlesLiquidacionImpor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyLiquidacionImpor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyLiquidacionImpor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyLiquidacionImpor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLiquidacionImpor(this.liquidacionimporBean,this.liquidacionimpor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(LiquidacionImporConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
			classes=LiquidacionImporConstantesFunciones.getClassesRelationshipsOfLiquidacionImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.liquidacionimporReturnGeneral=liquidacionimporLogic.procesarEventosLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.liquidacionimporLogic.getLiquidacionImpors(),this.liquidacionimpor,this.liquidacionimporParameterGeneral,this.isEsNuevoLiquidacionImpor,classes);//this.liquidacionimporLogic.getLiquidacionImpor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanLiquidacionImpor(this.liquidacionimporReturnGeneral,this.liquidacionimporBean,false);
		
		if(this.liquidacionimporReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpor(this.liquidacionimporReturnGeneral.getLiquidacionImpor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioLiquidacionImpor(this.liquidacionimporReturnGeneral.getLiquidacionImpor());
		}
		
		if(this.liquidacionimporReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioLiquidacionImpor(this.liquidacionimporReturnGeneral.getLiquidacionImpor(),classes);//this.liquidacionimporBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyLiquidacionImpor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyLiquidacionImpor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.RecargarFormLiquidacionImpor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingLiquidacionImpor(false);
						
			if(liquidacionimporSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() && DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleLiquidacionImporActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLiquidacionImpor();
			}
			
			this.actualizarVisualTableDatosLiquidacionImpor();
			
			this.jTableDatosLiquidacionImpor.setRowSelectionInterval(this.getIndiceNuevoLiquidacionImpor(), this.getIndiceNuevoLiquidacionImpor());
			
			this.seleccionarFilaTablaLiquidacionImporActual();
						
			this.actualizarEstadoCeldasBotonesLiquidacionImpor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesLiquidacionImpor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreanombreLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarnombreLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreadescripcionLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activardescripcionLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfechaLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarfechaLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfecha_liquidacionLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarfecha_liquidacionLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldfleteLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarfleteLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldtipoLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activartipoLiquidacionImpor);	
		//
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarid_empresaLiquidacionImpor);//
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarid_sucursalLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarid_centro_costoLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarid_cuenta_contableLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarid_paisLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setEnabled(isHabilitar && this.liquidacionimporConstantesFunciones.activarid_puertoLiquidacionImpor);
	};
	
	public void setDefaultControlesLiquidacionImpor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoLiquidacionImpor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.liquidacionimporSessionBean.setConGuardarRelaciones(true);			
			this.liquidacionimporSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.liquidacionimporSessionBean.setConGuardarRelaciones(false);			
			this.liquidacionimporSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoLiquidacionImpor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
				if(liquidacionimporAux.getId().equals(this.iIdNuevoLiquidacionImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpor liquidacionimporAux:this.liquidacionimpors) {
				if(liquidacionimporAux.getId().equals(this.iIdNuevoLiquidacionImpor)) {
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
	
	public int getIndiceActualLiquidacionImpor(LiquidacionImpor liquidacionimpor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
				if(liquidacionimporAux.getId().equals(liquidacionimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpor liquidacionimporAux:this.liquidacionimpors) {
				if(liquidacionimporAux.getId().equals(liquidacionimpor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalLiquidacionImpor(LiquidacionImpor liquidacionimporOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
				if(liquidacionimporAux.getLiquidacionImporOriginal().getId().equals(liquidacionimporOriginal.getId())) {
					existe=true;
					liquidacionimporOriginal.setId(liquidacionimporAux.getId());
					liquidacionimporOriginal.setVersionRow(liquidacionimporAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpor liquidacionimporAux:this.liquidacionimpors) {
				if(liquidacionimporAux.getLiquidacionImporOriginal().getId().equals(liquidacionimporOriginal.getId())) {
					existe=true;
					liquidacionimporOriginal.setId(liquidacionimporAux.getId());
					liquidacionimporOriginal.setVersionRow(liquidacionimporAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosLiquidacionImpor(Boolean esParaCancelar) throws Exception {
		liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
		liquidacionimporAux=new LiquidacionImpor();
		
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
					if(liquidacionimporAux.getId()<0) {
						liquidacionimporsAux.add(liquidacionimporAux);
					}		
				}
				this.iIdNuevoLiquidacionImpor=0L;
				this.liquidacionimporLogic.getLiquidacionImpors().removeAll(liquidacionimporsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LiquidacionImpor liquidacionimporAux:this.liquidacionimpors) {
					if(liquidacionimporAux.getId()<0) {
						liquidacionimporsAux.add(liquidacionimporAux);
					}		
				}
				this.iIdNuevoLiquidacionImpor=0L;
				this.liquidacionimpors.removeAll(liquidacionimporsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoLiquidacionImpor 
					&& this.liquidacionimporLogic.getLiquidacionImpors().size()>0
					) {
					liquidacionimporAux=this.liquidacionimporLogic.getLiquidacionImpors().get(this.liquidacionimporLogic.getLiquidacionImpors().size() - 1);
				
					if(liquidacionimporAux.getId()<0) {
						this.liquidacionimporLogic.getLiquidacionImpors().remove(liquidacionimporAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoLiquidacionImpor && this.liquidacionimpors.size()>0) {
					liquidacionimporAux=this.liquidacionimpors.get(this.liquidacionimpors.size() - 1);
				
					if(liquidacionimporAux.getId()<0) {
						this.liquidacionimpors.remove(liquidacionimporAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoLiquidacionImpor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(liquidacionimpor.getId()<0) {
				this.liquidacionimporLogic.getLiquidacionImpors().remove(this.liquidacionimpor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(liquidacionimpor.getId()<0) {
				this.liquidacionimpors.remove(this.liquidacionimpor);
			}
		}			
	}
	
	public void setEstadosInicialesLiquidacionImpor(List<LiquidacionImpor> liquidacionimporsAux) throws Exception {
		LiquidacionImporConstantesFunciones.setEstadosInicialesLiquidacionImpor(liquidacionimporsAux);
	}
	
	public void setEstadosInicialesLiquidacionImpor(LiquidacionImpor liquidacionimporAux) throws Exception {
		LiquidacionImporConstantesFunciones.setEstadosInicialesLiquidacionImpor(liquidacionimporAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarLiquidacionImporActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarLiquidacionImporActual()) {
				if(!this.isEsNuevoLiquidacionImpor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoLiquidacionImpor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarLiquidacionImporActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Liquidacion Impor ?", "MANTENIMIENTO DE Liquidacion Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(LiquidacionImpor liquidacionimpor) throws Exception {
		LiquidacionImporConstantesFunciones.seleccionarAsignar(this.liquidacionimpor,liquidacionimpor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarLiquidacionImpor=this.isPermisoActualizarOriginalLiquidacionImpor;
			
			
			this.seleccionarAsignar(liquidacionimpor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LiquidacionImporConstantesFunciones.quitarEspaciosLiquidacionImpor(this.liquidacionimpor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesLiquidacionImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.liquidacionimporSessionBean.setsFuncionBusquedaRapida(this.liquidacionimporSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoLiquidacionImpor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosLiquidacionImpor(esParaCancelar);				
				this.cancelarNuevoLiquidacionImpor(esParaCancelar);								
			}
			
			this.liquidacionimpor=new LiquidacionImpor();
			
			this.inicializarLiquidacionImpor();
			
			this.actualizarEstadoCeldasBotonesLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarLiquidacionImpor() throws Exception {
		try {
			LiquidacionImporConstantesFunciones.inicializarLiquidacionImpor(this.liquidacionimpor);
			
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
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.liquidacionimporLogic.getLiquidacionImpors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteLiquidacionImpors(String sAccionBusqueda,List<LiquidacionImpor> liquidacionimporsParaReportes) throws Exception {
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
					sPathReporteFinal="LiquidacionImpor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="LiquidacionImporMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("LiquidacionImporMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="LiquidacionImpor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Liquidacion Impores");		
		parameters.put("busquedapor", LiquidacionImporConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleLiquidacionImpor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					LiquidacionImporLogic liquidacionimporLogicAuxiliar=new LiquidacionImporLogic();
					liquidacionimporLogicAuxiliar.setDatosCliente(liquidacionimporLogic.getDatosCliente());				
					liquidacionimporLogicAuxiliar.setLiquidacionImpors(liquidacionimporsParaReportes);
					
					liquidacionimporLogicAuxiliar.cargarRelacionesLoteForeignKeyLiquidacionImporWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					liquidacionimporsParaReportes=liquidacionimporLogicAuxiliar.getLiquidacionImpors();
					
					//liquidacionimporLogic.getNewConnexionToDeep();
					
					//for (LiquidacionImpor liquidacionimpor:liquidacionimporsParaReportes) {
					//	liquidacionimporLogic.deepLoad(liquidacionimpor, false, DeepLoadType.INCLUDE, classes);
					//}						
					//liquidacionimporLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//liquidacionimporLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleLiquidacionImpor = AuxiliarReportes.class.getResourceAsStream("DetalleLiquidacionImporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleliquidacionimpor", reportFileDetalleLiquidacionImpor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceLiquidacionImpor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			LiquidacionImporConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			LiquidacionImporConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceLiquidacionImpor=new JRBeanArrayDataSource(LiquidacionImporJInternalFrame.TraerLiquidacionImporBeans(liquidacionimporsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceLiquidacionImpor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+LiquidacionImporConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+LiquidacionImporConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(LiquidacionImporBean.TraerLiquidacionImporBeans(liquidacionimporsParaReportes).toArray()));
							
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
				this.generarExcelReporteLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimporsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimporsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoLiquidacionImporActionPerformed(null);
					//this.generarExcelReporteLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimporsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimporsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimporsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimporsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteLiquidacionImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<LiquidacionImpor> liquidacionimporsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LiquidacionImpors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLiquidacionImpor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(LiquidacionImpor liquidacionimpor : liquidacionimporsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			LiquidacionImporConstantesFunciones.generarExcelReporteDataLiquidacionImpor("NORMAL",row,workbook,liquidacionimpor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderLiquidacionImpor(String sTipo,Row row,Workbook workbook) {
		
		LiquidacionImporConstantesFunciones.generarExcelReporteHeaderLiquidacionImpor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalLiquidacionImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<LiquidacionImpor> liquidacionimporsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LiquidacionImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(LiquidacionImpor liquidacionimpor : liquidacionimporsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(LiquidacionImporConstantesFunciones.getLiquidacionImporDescripcion(liquidacionimpor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_IDPUERTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDPUERTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getpuerto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getfecha_liquidacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImporConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpor.gettipo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesLiquidacionImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<LiquidacionImpor> liquidacionimporsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<LiquidacionImpor> liquidacionimporsRespaldo=null;
		
		classes=LiquidacionImporConstantesFunciones.getClassesRelationshipsOfLiquidacionImpor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.liquidacionimporLogic.setDatosCliente(this.datosCliente);
		this.liquidacionimporLogic.setDatosDeep(this.datosDeep);
		this.liquidacionimporLogic.setIsConDeep(true);
		
		liquidacionimporsRespaldo=this.liquidacionimporLogic.getLiquidacionImpors();
		
		this.liquidacionimporLogic.setLiquidacionImpors(liquidacionimporsParaReportes);	
		this.liquidacionimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		liquidacionimporsParaReportes=this.liquidacionimporLogic.getLiquidacionImpors();
		this.liquidacionimporLogic.setLiquidacionImpors(liquidacionimporsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LiquidacionImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLiquidacionImpor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(LiquidacionImpor liquidacionimpor : liquidacionimporsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderLiquidacionImpor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			LiquidacionImporConstantesFunciones.generarExcelReporteDataLiquidacionImpor("NORMAL",row,workbook,liquidacionimpor,cellStyleDataAux);
		
			
			


				//DetalleLiquidacionImpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO))) {

				if(liquidacionimpor.getDetalleLiquidacionImpors()!=null && liquidacionimpor.getDetalleLiquidacionImpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleLiquidacionImporConstantesFunciones.generarExcelReporteHeaderDetalleLiquidacionImpor("RELACIONADO",row,workbook);
				}

				if(liquidacionimpor.getDetalleLiquidacionImpors()!=null) {
					i2=0;
					for(DetalleLiquidacionImpor detalleliquidacionimpor : liquidacionimpor.getDetalleLiquidacionImpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleLiquidacionImporConstantesFunciones.generarExcelReporteDataDetalleLiquidacionImpor("RELACIONADO",row,workbook,detalleliquidacionimpor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(LiquidacionImporConstantesFunciones.getLiquidacionImporDescripcion(liquidacionimpor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessLiquidacionImpor() throws Exception {		
		this.startProcessLiquidacionImpor(true);
	}
	
	public void startProcessLiquidacionImpor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasLiquidacionImpor ,this.jPanelParametrosReportesLiquidacionImpor, this.jScrollPanelDatosLiquidacionImpor,this.jPanelPaginacionLiquidacionImpor, this.jScrollPanelDatosEdicionLiquidacionImpor, this.jPanelAccionesLiquidacionImpor,this.jPanelAccionesFormularioLiquidacionImpor,this.jmenuBarLiquidacionImpor,this.jmenuBarDetalleLiquidacionImpor,this.jTtoolBarLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasLiquidacionImpor=this.jTabbedPaneBusquedasLiquidacionImpor; 
		
		final JPanel jPanelParametrosReportesLiquidacionImpor=this.jPanelParametrosReportesLiquidacionImpor;
		//final JScrollPane jScrollPanelDatosLiquidacionImpor=this.jScrollPanelDatosLiquidacionImpor;
		final JTable jTableDatosLiquidacionImpor=this.jTableDatosLiquidacionImpor;		
		final JPanel jPanelPaginacionLiquidacionImpor=this.jPanelPaginacionLiquidacionImpor;
		//final JScrollPane jScrollPanelDatosEdicionLiquidacionImpor=this.jScrollPanelDatosEdicionLiquidacionImpor;
		final JPanel jPanelAccionesLiquidacionImpor=this.jPanelAccionesLiquidacionImpor;
		
		JPanel jPanelCamposAuxiliarLiquidacionImpor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarLiquidacionImpor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			jPanelCamposAuxiliarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jPanelCamposLiquidacionImpor;
			jPanelAccionesFormularioAuxiliarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jPanelAccionesFormularioLiquidacionImpor;
		}
		
		final JPanel jPanelCamposLiquidacionImpor=jPanelCamposAuxiliarLiquidacionImpor;
		final JPanel jPanelAccionesFormularioLiquidacionImpor=jPanelAccionesFormularioAuxiliarLiquidacionImpor;
		
		
		final JMenuBar jmenuBarLiquidacionImpor=this.jmenuBarLiquidacionImpor;
		final JToolBar jTtoolBarLiquidacionImpor=this.jTtoolBarLiquidacionImpor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarLiquidacionImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLiquidacionImpor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			jmenuBarDetalleAuxiliarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jmenuBarDetalleLiquidacionImpor;
			jTtoolBarDetalleAuxiliarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jTtoolBarDetalleLiquidacionImpor;
		}
		
		final JMenuBar jmenuBarDetalleLiquidacionImpor=jmenuBarDetalleAuxiliarLiquidacionImpor;
		final JToolBar jTtoolBarDetalleLiquidacionImpor=jTtoolBarDetalleAuxiliarLiquidacionImpor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLiquidacionImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLiquidacionImpor;
			processRunnable.jTableDatos=jTableDatosLiquidacionImpor;
			processRunnable.jPanelCampos=jPanelCamposLiquidacionImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionLiquidacionImpor;
			processRunnable.jPanelAcciones=jPanelAccionesLiquidacionImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLiquidacionImpor;
			
			
			processRunnable.jmenuBar=jmenuBarLiquidacionImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLiquidacionImpor;
			processRunnable.jTtoolBar=jTtoolBarLiquidacionImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLiquidacionImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLiquidacionImpor ,jPanelParametrosReportesLiquidacionImpor,jTableDatosLiquidacionImpor, /*jScrollPanelDatosLiquidacionImpor,*/jPanelCamposLiquidacionImpor,jPanelPaginacionLiquidacionImpor, /*jScrollPanelDatosEdicionLiquidacionImpor,*/ jPanelAccionesLiquidacionImpor,jPanelAccionesFormularioLiquidacionImpor,jmenuBarLiquidacionImpor,jmenuBarDetalleLiquidacionImpor,jTtoolBarLiquidacionImpor,jTtoolBarDetalleLiquidacionImpor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLiquidacionImpor ,jPanelParametrosReportesLiquidacionImpor, jScrollPanelDatosLiquidacionImpor,jPanelPaginacionLiquidacionImpor, jScrollPanelDatosEdicionLiquidacionImpor, jPanelAccionesLiquidacionImpor,jPanelAccionesFormularioLiquidacionImpor,jmenuBarLiquidacionImpor,jmenuBarDetalleLiquidacionImpor,jTtoolBarLiquidacionImpor,jTtoolBarDetalleLiquidacionImpor);
						
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
	
	public void finishProcessLiquidacionImpor() {// throws Exception 
		this.finishProcessLiquidacionImpor(true);
	}
	
	public void finishProcessLiquidacionImpor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasLiquidacionImpor ,this.jPanelParametrosReportesLiquidacionImpor, this.jScrollPanelDatosLiquidacionImpor,this.jPanelPaginacionLiquidacionImpor, this.jScrollPanelDatosEdicionLiquidacionImpor, this.jPanelAccionesLiquidacionImpor,this.jPanelAccionesFormularioLiquidacionImpor,this.jmenuBarLiquidacionImpor,this.jmenuBarDetalleLiquidacionImpor,this.jTtoolBarLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasLiquidacionImpor=this.jTabbedPaneBusquedasLiquidacionImpor; 
		
		final JPanel jPanelParametrosReportesLiquidacionImpor=this.jPanelParametrosReportesLiquidacionImpor;
		//final JScrollPane jScrollPanelDatosLiquidacionImpor=this.jScrollPanelDatosLiquidacionImpor;
		final JTable jTableDatosLiquidacionImpor=this.jTableDatosLiquidacionImpor;		
		final JPanel jPanelPaginacionLiquidacionImpor=this.jPanelPaginacionLiquidacionImpor;
		//final JScrollPane jScrollPanelDatosEdicionLiquidacionImpor=this.jScrollPanelDatosEdicionLiquidacionImpor;
		final JPanel jPanelAccionesLiquidacionImpor=this.jPanelAccionesLiquidacionImpor;
		
		JPanel jPanelCamposAuxiliarLiquidacionImpor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarLiquidacionImpor=new JPanel();
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			jPanelCamposAuxiliarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jPanelCamposLiquidacionImpor;
			jPanelAccionesFormularioAuxiliarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jPanelAccionesFormularioLiquidacionImpor;
		}
		
		final JPanel jPanelCamposLiquidacionImpor=jPanelCamposAuxiliarLiquidacionImpor;
		final JPanel jPanelAccionesFormularioLiquidacionImpor=jPanelAccionesFormularioAuxiliarLiquidacionImpor;
		
		
		final JMenuBar jmenuBarLiquidacionImpor=this.jmenuBarLiquidacionImpor;		
		final JToolBar jTtoolBarLiquidacionImpor=this.jTtoolBarLiquidacionImpor;
				
		JMenuBar jmenuBarDetalleAuxiliarLiquidacionImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLiquidacionImpor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			jmenuBarDetalleAuxiliarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jmenuBarDetalleLiquidacionImpor;
			jTtoolBarDetalleAuxiliarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jTtoolBarDetalleLiquidacionImpor;		
		}
		
		final JMenuBar jmenuBarDetalleLiquidacionImpor=jmenuBarDetalleAuxiliarLiquidacionImpor;
		final JToolBar jTtoolBarDetalleLiquidacionImpor=jTtoolBarDetalleAuxiliarLiquidacionImpor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLiquidacionImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLiquidacionImpor;
			processRunnable.jTableDatos=jTableDatosLiquidacionImpor;
			processRunnable.jPanelCampos=jPanelCamposLiquidacionImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionLiquidacionImpor;
			processRunnable.jPanelAcciones=jPanelAccionesLiquidacionImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLiquidacionImpor;
			
			
			processRunnable.jmenuBar=jmenuBarLiquidacionImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLiquidacionImpor;
			processRunnable.jTtoolBar=jTtoolBarLiquidacionImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLiquidacionImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasLiquidacionImpor ,jPanelParametrosReportesLiquidacionImpor, jTableDatosLiquidacionImpor,/*jScrollPanelDatosLiquidacionImpor,*/jPanelCamposLiquidacionImpor,jPanelPaginacionLiquidacionImpor, /*jScrollPanelDatosEdicionLiquidacionImpor,*/ jPanelAccionesLiquidacionImpor,jPanelAccionesFormularioLiquidacionImpor,jmenuBarLiquidacionImpor,jmenuBarDetalleLiquidacionImpor,jTtoolBarLiquidacionImpor,jTtoolBarDetalleLiquidacionImpor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesLiquidacionImpor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarLiquidacionImpor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuLiquidacionImpor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarLiquidacionImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarLiquidacionImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLiquidacionImpor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuLiquidacionImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarLiquidacionImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLiquidacionImpor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.liquidacionimporConstantesFunciones.getsFinalQueryLiquidacionImpor();
		String  finalQueryPaginacionTodos=this.liquidacionimporConstantesFunciones.getsFinalQueryLiquidacionImpor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=LiquidacionImporConstantesFunciones.getArrayColumnasGlobalesNoLiquidacionImpor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=LiquidacionImporConstantesFunciones.getArrayColumnasGlobalesLiquidacionImpor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,LiquidacionImporConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.liquidacionimporsEliminados= new ArrayList<LiquidacionImpor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessLiquidacionImpor();
		
				///*LiquidacionImporSessionBean*/this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			
			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
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
					this.iNumeroPaginacion=LiquidacionImporConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=LiquidacionImporConstantesFunciones.getClassesForeignKeysOfLiquidacionImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/liquidacionimpor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			liquidacionimporsAux= new ArrayList<LiquidacionImpor>();
			
				
			liquidacionimporLogic.setDatosCliente(this.datosCliente);
			liquidacionimporLogic.setDatosDeep(this.datosDeep);
			liquidacionimporLogic.setIsConDeep(true);
			
			
			liquidacionimporLogic.getLiquidacionImporDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					liquidacionimporLogic.getTodosLiquidacionImpors(finalQueryGlobal,pagination);
					
					//liquidacionimporLogic.getTodosLiquidacionImporsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(liquidacionimporLogic.getLiquidacionImpors()==null|| liquidacionimporLogic.getLiquidacionImpors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							liquidacionimporsAux= new ArrayList<LiquidacionImpor>();
							liquidacionimporsAux.addAll(liquidacionimporLogic.getLiquidacionImpors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimporsAux= new ArrayList<LiquidacionImpor>();
							liquidacionimporsAux.addAll(liquidacionimpors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							liquidacionimporLogic.getTodosLiquidacionImpors(finalQueryGlobal+"",this.pagination);												
							
							//liquidacionimporLogic.getTodosLiquidacionImporsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteLiquidacionImpors("Todos",liquidacionimporLogic.getLiquidacionImpors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());					
							liquidacionimporLogic.getLiquidacionImpors().addAll(liquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpors=new ArrayList<LiquidacionImpor>();
							liquidacionimpors.addAll(liquidacionimporsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idLiquidacionImpor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idLiquidacionImpor=this.idActual;
				
				} else if(this.idLiquidacionImporActual!=null && this.idLiquidacionImporActual!=0L) {
					idLiquidacionImpor=idLiquidacionImporActual;
				}
				
					
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndicePorId(idLiquidacionImpor);
				
				this.liquidacionimpors=new ArrayList<LiquidacionImpor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					liquidacionimporLogic.getEntity(idLiquidacionImpor);
					
					//liquidacionimporLogic.getEntityWithConnection(idLiquidacionImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
					liquidacionimporLogic.getLiquidacionImpors().add(liquidacionimporLogic.getLiquidacionImpor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpors=new ArrayList<LiquidacionImpor>();
					this.liquidacionimpors.add(liquidacionimpor);
				}
				
				if(liquidacionimporLogic.getLiquidacionImpor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimporLogic.getLiquidacionImporsFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimporLogic.getLiquidacionImpors()==null||liquidacionimporLogic.getLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpors==null|| liquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
						liquidacionimporsAux.addAll(liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
							liquidacionimporsAux.addAll(liquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimporLogic.getLiquidacionImporsFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpors("FK_IdCentroCosto",liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpors("FK_IdCentroCosto",liquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
						liquidacionimporLogic.getLiquidacionImpors().addAll(liquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpors=new ArrayList<LiquidacionImpor>();
							liquidacionimpors.addAll(liquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimporLogic.getLiquidacionImporsFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimporLogic.getLiquidacionImpors()==null||liquidacionimporLogic.getLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpors==null|| liquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
						liquidacionimporsAux.addAll(liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
							liquidacionimporsAux.addAll(liquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimporLogic.getLiquidacionImporsFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpors("FK_IdCuentaContable",liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpors("FK_IdCuentaContable",liquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
						liquidacionimporLogic.getLiquidacionImpors().addAll(liquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpors=new ArrayList<LiquidacionImpor>();
							liquidacionimpors.addAll(liquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimporLogic.getLiquidacionImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimporLogic.getLiquidacionImpors()==null||liquidacionimporLogic.getLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpors==null|| liquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
						liquidacionimporsAux.addAll(liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
							liquidacionimporsAux.addAll(liquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimporLogic.getLiquidacionImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpors("FK_IdEmpresa",liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpors("FK_IdEmpresa",liquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
						liquidacionimporLogic.getLiquidacionImpors().addAll(liquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpors=new ArrayList<LiquidacionImpor>();
							liquidacionimpors.addAll(liquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimporLogic.getLiquidacionImporsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimporLogic.getLiquidacionImpors()==null||liquidacionimporLogic.getLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpors==null|| liquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
						liquidacionimporsAux.addAll(liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
							liquidacionimporsAux.addAll(liquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimporLogic.getLiquidacionImporsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpors("FK_IdPais",liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpors("FK_IdPais",liquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
						liquidacionimporLogic.getLiquidacionImpors().addAll(liquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpors=new ArrayList<LiquidacionImpor>();
							liquidacionimpors.addAll(liquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPuerto")) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimporLogic.getLiquidacionImporsFK_IdPuerto(finalQueryGlobal,pagination,id_puertoFK_IdPuerto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimporLogic.getLiquidacionImpors()==null||liquidacionimporLogic.getLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpors==null|| liquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
						liquidacionimporsAux.addAll(liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
							liquidacionimporsAux.addAll(liquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimporLogic.getLiquidacionImporsFK_IdPuerto(finalQueryGlobal,pagination,id_puertoFK_IdPuerto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpors("FK_IdPuerto",liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpors("FK_IdPuerto",liquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
						liquidacionimporLogic.getLiquidacionImpors().addAll(liquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpors=new ArrayList<LiquidacionImpor>();
							liquidacionimpors.addAll(liquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimporLogic.getLiquidacionImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimporLogic.getLiquidacionImpors()==null||liquidacionimporLogic.getLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpors==null|| liquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
						liquidacionimporsAux.addAll(liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimporsAux=new ArrayList<LiquidacionImpor>();
							liquidacionimporsAux.addAll(liquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimporLogic.getLiquidacionImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpors("FK_IdSucursal",liquidacionimporLogic.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpors("FK_IdSucursal",liquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporLogic.setLiquidacionImpors(new ArrayList<LiquidacionImpor>());
						liquidacionimporLogic.getLiquidacionImpors().addAll(liquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpors=new ArrayList<LiquidacionImpor>();
							liquidacionimpors.addAll(liquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesLiquidacionImpor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessLiquidacionImpor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=liquidacionimporLogic.getLiquidacionImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=liquidacionimpors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=liquidacionimporLogic.getLiquidacionImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=liquidacionimpors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(LiquidacionImpor liquidacionimpor) {
		Boolean permite=true;
		
		if(this.liquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=LiquidacionImporConstantesFunciones.getOrderByListaLiquidacionImpor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=LiquidacionImporConstantesFunciones.getOrderByListaLiquidacionImpor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpor liquidacionimpor:liquidacionimporLogic.getLiquidacionImpors()) {
				if(liquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
					liquidacionimporTotales=liquidacionimpor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpor liquidacionimpor:this.liquidacionimpors) {
				if(liquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
					liquidacionimporTotales=liquidacionimpor;
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
			this.liquidacionimporAux=new LiquidacionImpor();
			this.liquidacionimporAux.setsType(Constantes2.S_TOTALES);
			this.liquidacionimporAux.setIsNew(false);
			this.liquidacionimporAux.setIsChanged(false);
			this.liquidacionimporAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				LiquidacionImporConstantesFunciones.TotalizarValoresFilaLiquidacionImpor(this.liquidacionimporLogic.getLiquidacionImpors(),this.liquidacionimporAux);
				
				this.liquidacionimporLogic.getLiquidacionImpors().add(this.liquidacionimporAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				LiquidacionImporConstantesFunciones.TotalizarValoresFilaLiquidacionImpor(this.liquidacionimpors,this.liquidacionimporAux);
				
				this.liquidacionimpors.add(this.liquidacionimporAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		liquidacionimporTotales=new LiquidacionImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.liquidacionimporLogic.getLiquidacionImpors().remove(liquidacionimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.liquidacionimpors.remove(liquidacionimporTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		liquidacionimporTotales=new LiquidacionImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpor liquidacionimpor:liquidacionimporLogic.getLiquidacionImpors()) {
				if(liquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
					liquidacionimporTotales=liquidacionimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LiquidacionImporConstantesFunciones.TotalizarValoresFilaLiquidacionImpor(this.liquidacionimporLogic.getLiquidacionImpors(),liquidacionimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpor liquidacionimpor:this.liquidacionimpors) {
				if(liquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
					liquidacionimporTotales=liquidacionimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LiquidacionImporConstantesFunciones.TotalizarValoresFilaLiquidacionImpor(this.liquidacionimpors,liquidacionimporTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getLiquidacionImporsFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImporsFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImporsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImporsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImporsFK_IdPuerto()throws Exception {
		try {
			sAccionBusqueda="FK_IdPuerto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImporsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getLiquidacionImporsFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.getLiquidacionImporsFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImporsFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.getLiquidacionImporsFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImporsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.getLiquidacionImporsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImporsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.getLiquidacionImporsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImporsFK_IdPuerto(String sFinalQuery,Long id_puerto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.getLiquidacionImporsFK_IdPuerto(sFinalQuery,this.pagination,id_puerto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImporsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.getLiquidacionImporsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosLiquidacionImpor() {
		this.isPermisoTodoLiquidacionImpor=false;
		this.isPermisoNuevoLiquidacionImpor=false;
		this.isPermisoActualizarLiquidacionImpor=false;
		this.isPermisoActualizarOriginalLiquidacionImpor=false;
		this.isPermisoEliminarLiquidacionImpor=false;
		this.isPermisoGuardarCambiosLiquidacionImpor=false;
		this.isPermisoConsultaLiquidacionImpor=false;
		this.isPermisoBusquedaLiquidacionImpor=false;
		this.isPermisoReporteLiquidacionImpor=false;		
		this.isPermisoOrdenLiquidacionImpor=false;		
		this.isPermisoPaginacionMedioLiquidacionImpor=false;		
		this.isPermisoPaginacionAltoLiquidacionImpor=false;
		this.isPermisoPaginacionTodoLiquidacionImpor=false;
		this.isPermisoCopiarLiquidacionImpor=false;		
		this.isPermisoVerFormLiquidacionImpor=false;		
		this.isPermisoDuplicarLiquidacionImpor=false;		
		this.isPermisoOrdenLiquidacionImpor=false;		
	}
	
	public void setPermisosUsuarioLiquidacionImpor(Boolean isPermiso) {
		this.isPermisoTodoLiquidacionImpor=isPermiso;
		this.isPermisoNuevoLiquidacionImpor=isPermiso;
		this.isPermisoActualizarLiquidacionImpor=isPermiso;
		this.isPermisoActualizarOriginalLiquidacionImpor=isPermiso;
		this.isPermisoEliminarLiquidacionImpor=isPermiso;
		this.isPermisoGuardarCambiosLiquidacionImpor=isPermiso;
		this.isPermisoConsultaLiquidacionImpor=isPermiso;
		this.isPermisoBusquedaLiquidacionImpor=isPermiso;
		this.isPermisoReporteLiquidacionImpor=isPermiso;
		this.isPermisoOrdenLiquidacionImpor=isPermiso;		
		this.isPermisoPaginacionMedioLiquidacionImpor=isPermiso;		
		this.isPermisoPaginacionAltoLiquidacionImpor=isPermiso;		
		this.isPermisoPaginacionTodoLiquidacionImpor=isPermiso;		
		this.isPermisoCopiarLiquidacionImpor=isPermiso;		
		this.isPermisoVerFormLiquidacionImpor=isPermiso;		
		this.isPermisoDuplicarLiquidacionImpor=isPermiso;
		this.isPermisoOrdenLiquidacionImpor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioLiquidacionImpor(Boolean isPermiso) {
		//this.isPermisoTodoLiquidacionImpor=isPermiso;
		this.isPermisoNuevoLiquidacionImpor=isPermiso;
		this.isPermisoActualizarLiquidacionImpor=isPermiso;
		this.isPermisoActualizarOriginalLiquidacionImpor=isPermiso;
		this.isPermisoEliminarLiquidacionImpor=isPermiso;
		this.isPermisoGuardarCambiosLiquidacionImpor=isPermiso;
		//this.isPermisoConsultaLiquidacionImpor=isPermiso;
		//this.isPermisoBusquedaLiquidacionImpor=isPermiso;
		//this.isPermisoReporteLiquidacionImpor=isPermiso;
		//this.isPermisoOrdenLiquidacionImpor=isPermiso;		
		//this.isPermisoPaginacionMedioLiquidacionImpor=isPermiso;		
		//this.isPermisoPaginacionAltoLiquidacionImpor=isPermiso;		
		//this.isPermisoPaginacionTodoLiquidacionImpor=isPermiso;		
		//this.isPermisoCopiarLiquidacionImpor=isPermiso;		
		//this.isPermisoDuplicarLiquidacionImpor=isPermiso;
		//this.isPermisoOrdenLiquidacionImpor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioLiquidacionImporClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION);
		
		if(LiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleLiquidacionImpor=false;
		this.isTienePermisosDetalleLiquidacionImpor=this.verificarGetPermisosUsuarioOpcionLiquidacionImporClaseRelacionada(this.opcionsRelacionadas,DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebLiquidacionImpor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioLiquidacionImporClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleLiquidacionImpor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioLiquidacionImporClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionLiquidacionImporClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioLiquidacionImporClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleLiquidacionImpor && this.jInternalFrameDetalleFormLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.remove(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioLiquidacionImpor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(LiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, LiquidacionImporConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoLiquidacionImpor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarLiquidacionImpor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalLiquidacionImpor=this.isPermisoActualizarLiquidacionImpor;
			this.isPermisoEliminarLiquidacionImpor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosLiquidacionImpor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaLiquidacionImpor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaLiquidacionImpor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoLiquidacionImpor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteLiquidacionImpor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLiquidacionImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioLiquidacionImpor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoLiquidacionImpor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoLiquidacionImpor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarLiquidacionImpor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormLiquidacionImpor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarLiquidacionImpor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLiquidacionImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosLiquidacionImpor.setToolTipText(this.jTableDatosLiquidacionImpor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioLiquidacionImpor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioLiquidacionImpor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(LiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(LiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioLiquidacionImpor() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleLiquidacionImpor && this.liquidacionimporConstantesFunciones.mostrarDetalleLiquidacionImporLiquidacionImpor && !LiquidacionImporConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Liquidacion Impor");
			reporte.setsDescripcion("Detalle Liquidacion Impor");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyLiquidacionImporListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.puertosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyLiquidacionImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(LiquidacionImporJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyLiquidacionImporListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPuertoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPuertoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.puertosForeignKey==null||this.puertosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PuertoConstantesFunciones.getArrayColumnasGlobalesPuerto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PuertoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PuertoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPuertosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyLiquidacionImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			LiquidacionImporParameterReturnGeneral liquidacionimporReturnGeneral=new LiquidacionImporParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.liquidacionimporConstantesFunciones.cargarid_empresaLiquidacionImpor)
					 || (this.esRecargarFks && this.liquidacionimporConstantesFunciones.cargarid_empresaLiquidacionImpor)) {

					if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+liquidacionimporSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.liquidacionimporConstantesFunciones.cargarid_sucursalLiquidacionImpor)
					 || (this.esRecargarFks && this.liquidacionimporConstantesFunciones.cargarid_sucursalLiquidacionImpor)) {

					if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+liquidacionimporSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.liquidacionimporConstantesFunciones.cargarid_centro_costoLiquidacionImpor)
					 || (this.esRecargarFks && this.liquidacionimporConstantesFunciones.cargarid_centro_costoLiquidacionImpor)) {

					if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+liquidacionimporSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.liquidacionimporConstantesFunciones.cargarid_cuenta_contableLiquidacionImpor)
					 || (this.esRecargarFks && this.liquidacionimporConstantesFunciones.cargarid_cuenta_contableLiquidacionImpor)) {

					if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+liquidacionimporSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.liquidacionimporConstantesFunciones.cargarid_paisLiquidacionImpor)
					 || (this.esRecargarFks && this.liquidacionimporConstantesFunciones.cargarid_paisLiquidacionImpor)) {

					if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+liquidacionimporSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalPuerto="";

				if(((this.puertosForeignKey==null||this.puertosForeignKey.size()<=0) && this.liquidacionimporConstantesFunciones.cargarid_puertoLiquidacionImpor)
					 || (this.esRecargarFks && this.liquidacionimporConstantesFunciones.cargarid_puertoLiquidacionImpor)) {

					if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionPuerto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PuertoConstantesFunciones.getArrayColumnasGlobalesPuerto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPuerto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PuertoConstantesFunciones.TABLENAME);

						finalQueryGlobalPuerto=Funciones.GetFinalQueryAppend(finalQueryGlobalPuerto, "");
						finalQueryGlobalPuerto+=PuertoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPuertosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPuerto=" WHERE " + ConstantesSql.ID + "="+liquidacionimporSessionBean.getlidPuertoActual();
					}
				} else {
					finalQueryGlobalPuerto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				liquidacionimporReturnGeneral=liquidacionimporLogic.cargarCombosLoteForeignKeyLiquidacionImpor(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCentroCosto,finalQueryGlobalCuentaContable,finalQueryGlobalPais,finalQueryGlobalPuerto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=liquidacionimporReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=liquidacionimporReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=liquidacionimporReturnGeneral.getcentrocostosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=liquidacionimporReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=liquidacionimporReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalPuerto.equals("NONE")) {
				this.puertosForeignKey=liquidacionimporReturnGeneral.getpuertosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyLiquidacionImpor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCentroCosto();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyPuerto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPuerto()throws Exception {
		try {

			if(!this.liquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionPuerto()) {
				Puerto puerto=new Puerto();
				PuertoConstantesFunciones.setPuertoDescripcion(puerto,Constantes.SMENSAJE_ESCOJA_OPCION);
				puerto.setId(null);

				if(!PuertoConstantesFunciones.ExisteEnLista(this.puertosForeignKey,puerto,true)) {

					this.puertosForeignKey.add(0,puerto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyLiquidacionImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyLiquidacionImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyLiquidacionImpor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.liquidacionimpor.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
				this.liquidacionimpor.setfecha_liquidacion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyLiquidacionImpor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpor(LiquidacionImpor liquidacionimpor)throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(liquidacionimpor.getid_centro_costo(),false,"Formulario");
			this.setActualCuentaContableForeignKey(liquidacionimpor.getid_cuenta_contable(),false,"Formulario");
			this.setActualPaisForeignKey(liquidacionimpor.getid_pais(),false,"Formulario");
			this.setActualPuertoForeignKey(liquidacionimpor.getid_puerto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyLiquidacionImpor(LiquidacionImpor liquidacionimpor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyLiquidacionImpor()throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(this.liquidacionimporConstantesFunciones.getid_centro_costo(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.liquidacionimporConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualPaisForeignKey(this.liquidacionimporConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualPuertoForeignKey(this.liquidacionimporConstantesFunciones.getid_puerto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyLiquidacionImpor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyLiquidacionImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyLiquidacionImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroLiquidacionImpor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyLiquidacionImpor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFramePuertosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyLiquidacionImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePuertosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyLiquidacionImpor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public LiquidacionImporBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public LiquidacionImporBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public LiquidacionImporBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.liquidacionimporSessionBean=new LiquidacionImporSessionBean(); 
		this.liquidacionimporConstantesFunciones=new LiquidacionImporConstantesFunciones(); 
		this.liquidacionimporBean=new LiquidacionImpor();//(this.liquidacionimporConstantesFunciones); 		
		this.liquidacionimporReturnGeneral=new LiquidacionImporParameterReturnGeneral(); 
		
		this.liquidacionimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.liquidacionimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public LiquidacionImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public LiquidacionImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public LiquidacionImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessLiquidacionImpor(true);
			
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
			
			this.liquidacionimporConstantesFunciones=new LiquidacionImporConstantesFunciones(); 
			this.liquidacionimporBean=new LiquidacionImpor();//this.liquidacionimporConstantesFunciones); 			
			this.liquidacionimporReturnGeneral=new LiquidacionImporParameterReturnGeneral(); 
		
			LiquidacionImporBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Liquidacion Impor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.liquidacionimpor=new LiquidacionImpor();
			this.liquidacionimpors = new ArrayList<LiquidacionImpor>();
			this.liquidacionimporsAux = new ArrayList<LiquidacionImpor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic=new LiquidacionImporLogic();
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			//this.liquidacionimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.liquidacionimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormLiquidacionImpor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLiquidacionImpor);	
					}
					
					if(this.jInternalFrameImportacionLiquidacionImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLiquidacionImpor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByLiquidacionImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByLiquidacionImpor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormLiquidacionImpor);
				this.jInternalFrameDetalleFormLiquidacionImpor.setVisible(false);
				this.jInternalFrameDetalleFormLiquidacionImpor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLiquidacionImpor);
					this.jInternalFrameReporteDinamicoLiquidacionImpor.setVisible(false);
					this.jInternalFrameReporteDinamicoLiquidacionImpor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionLiquidacionImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionLiquidacionImpor);
					this.jInternalFrameImportacionLiquidacionImpor.setVisible(false);
					this.jInternalFrameImportacionLiquidacionImpor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByLiquidacionImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByLiquidacionImpor);
					this.jInternalFrameOrderByLiquidacionImpor.setVisible(false);
					this.jInternalFrameOrderByLiquidacionImpor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idLiquidacionImporActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=LiquidacionImporConstantesFunciones.INUMEROPAGINACION;
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
			
			this.liquidacionimporReturnGeneral=new LiquidacionImporParameterReturnGeneral();
			
			this.liquidacionimporParameterGeneral=new LiquidacionImporParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.liquidacionimporLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
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
			
			if(LiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LiquidacionImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.liquidacionimporSessionBean.getEsGuardarRelacionado(),this.liquidacionimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LiquidacionImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.liquidacionimporSessionBean.getEsGuardarRelacionado(),this.liquidacionimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoLiquidacionImpor=false;
			this.isVisibilidadCeldaDuplicarLiquidacionImpor=true;
			this.isVisibilidadCeldaCopiarLiquidacionImpor=true;
			this.isVisibilidadCeldaVerFormLiquidacionImpor=true;
			this.isVisibilidadCeldaOrdenLiquidacionImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;
			
			
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdPuerto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosLiquidacionImpor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioLiquidacionImpor(false);
			
			this.setPermisosUsuarioLiquidacionImpor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado() 
				|| (this.liquidacionimporSessionBean.getEsGuardarRelacionado() && this.liquidacionimporSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioLiquidacionImporClasesRelacionadas();
			}
			
			if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioLiquidacionImporClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosLiquidacionImpor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualLiquidacionImpor();
			}
			
			if(!this.isPermisoBusquedaLiquidacionImpor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioLiquidacionImpor,this.isPermisoPaginacionMedioLiquidacionImpor,this.isPermisoPaginacionTodoLiquidacionImpor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(LiquidacionImporConstantesFunciones.getTiposSeleccionarLiquidacionImpor());
				
				this.tiposColumnasSelect=LiquidacionImporConstantesFunciones.getTiposSeleccionarLiquidacionImpor(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectLiquidacionImpor();				
				//this.tiposRelacionesSelect=LiquidacionImporConstantesFunciones.getTiposRelacionesLiquidacionImpor(true);
				
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
			//if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioLiquidacionImpor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioLiquidacionImpor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioLiquidacionImpor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesLiquidacionImpor() ;
			
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
			
			
			this.detalleliquidacionimporLogic=new DetalleLiquidacionImporLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.centrocostoLogic=new CentroCostoLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.paisLogic=new PaisLogic();
			this.puertoLogic=new PuertoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				liquidacionimporImplementable= (LiquidacionImporImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LiquidacionImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				liquidacionimporImplementableHome= (LiquidacionImporImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LiquidacionImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.liquidacionimpors= new ArrayList<LiquidacionImpor>();
			this.liquidacionimporsEliminados= new ArrayList<LiquidacionImpor>();
						
			this.isEsNuevoLiquidacionImpor=false;
			this.esParaAccionDesdeFormularioLiquidacionImpor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.puertosForeignKey=new ArrayList<Puerto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyLiquidacionImpor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroLiquidacionImpor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			LiquidacionImporBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=LiquidacionImporConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingLiquidacionImpor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioLiquidacionImpor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioLiquidacionImpor();
			}
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasLiquidacionImpor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasLiquidacionImpor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasLiquidacionImpor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessLiquidacionImpor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga LiquidacionImpor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectLiquidacionImpor() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesLiquidacionImpor")) {
				iIndex=this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Liquidacion Impores")) {
					if(!DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLiquidacionImpor();

						this.cargarParteTabPanelRelacionadaDetalleLiquidacionImpor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessLiquidacionImpor();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleLiquidacionImpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLiquidacionImpor.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(false,true,iIndex);
		this.jButtonDetalleLiquidacionImporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleLiquidacionImpor();

		//this.jTabbedPaneRelacionesLiquidacionImpor.updateUI();
		//this.jTabbedPaneRelacionesLiquidacionImpor.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLiquidacionImpor.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleLiquidacionImpor")) {
				int row=this.jTableDatosLiquidacionImpor.getSelectedRow();
				jButtonDetalleLiquidacionImporActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Liquidacion Impor")) {

					if(this.isTienePermisosDetalleLiquidacionImpor && this.liquidacionimporConstantesFunciones.mostrarDetalleLiquidacionImporLiquidacionImpor && !LiquidacionImporConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Liquidacion Impores"+"("+DetalleLiquidacionImporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Liquidacion Impores");

						if(liquidacionimporConstantesFunciones.resaltarDetalleLiquidacionImporLiquidacionImpor!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(liquidacionimporConstantesFunciones.resaltarDetalleLiquidacionImporLiquidacionImpor);
						}

						jmenuItem.setEnabled(this.liquidacionimporConstantesFunciones.activarDetalleLiquidacionImporLiquidacionImpor);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleLiquidacionImpor"));

						

						this.jInternalFrameDetalleFormLiquidacionImpor.jmenuDetalleLiquidacionImpor.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyLiquidacionImpor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyLiquidacionImpor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyLiquidacionImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyLiquidacionImporListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyLiquidacionImpor();
		
		this.cargarCombosFrameForeignKeyLiquidacionImpor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyLiquidacionImpor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyLiquidacionImpor();
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

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPuerto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPuertoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPuerto();
				this.cargarCombosFramePuertosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPuerto(this.puertosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoLiquidacionImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
			
			if(jTableDatosLiquidacionImpor.getRowCount()>=1) {
				jTableDatosLiquidacionImpor.removeRowSelectionInterval(0, jTableDatosLiquidacionImpor.getRowCount()-1);						
			}
			
			this.isEsNuevoLiquidacionImpor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoLiquidacionImpor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesLiquidacionImpor(true);			
			//this.liquidacionimpor=new LiquidacionImpor();
			//this.liquidacionimpor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLiquidacionImpor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLiquidacionImpor() ;
			
			if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLiquidacionImpor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.liquidacionimpor);	
			this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);				
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
			if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar LiquidacionImpor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarLiquidacionImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosLiquidacionImpor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosLiquidacionImpor.getSelectedRows().length;			
			}
			
			liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoLiquidacionImpor--;			
				//LiquidacionImpor liquidacionimporAux= new LiquidacionImpor();			
				//liquidacionimporAux.setId(this.iIdNuevoLiquidacionImpor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//LiquidacionImpor liquidacionimporOrigen=new LiquidacionImpor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(LiquidacionImpor liquidacionimporOrigen : liquidacionimporsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							liquidacionimporOrigen =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimporOrigen =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaLiquidacionImpor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.liquidacionimpor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosLiquidacionImpor(liquidacionimporOrigen,this.liquidacionimpor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.liquidacionimporLogic.getLiquidacionImpors().add(this.liquidacionimporAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.liquidacionimpors.add(this.liquidacionimporAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaLiquidacionImpor(false);
				
				this.jTableDatosLiquidacionImpor.setRowSelectionInterval(this.getIndiceNuevoLiquidacionImpor(), this.getIndiceNuevoLiquidacionImpor());
				
				int iLastRow =  this.jTableDatosLiquidacionImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLiquidacionImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLiquidacionImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLiquidacionImpor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();									
		
			LiquidacionImpor liquidacionimporOrigen=new LiquidacionImpor();
			LiquidacionImpor liquidacionimporDestino=new LiquidacionImpor();
				
			liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosLiquidacionImpor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || liquidacionimporsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosLiquidacionImpor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporOrigen =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						liquidacionimporOrigen =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimporDestino =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						liquidacionimporDestino =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				liquidacionimporOrigen =liquidacionimporsSeleccionados.get(0);
				liquidacionimporDestino =liquidacionimporsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosLiquidacionImpor(liquidacionimporOrigen,liquidacionimporDestino,true,false);
				
				liquidacionimporDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(liquidacionimporDestino,liquidacionimporLogic.getLiquidacionImpors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(liquidacionimporDestino,liquidacionimpors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaLiquidacionImpor(false);
				
				//this.jTableDatosLiquidacionImpor.setRowSelectionInterval(this.getIndiceNuevoLiquidacionImpor(), this.getIndiceNuevoLiquidacionImpor());
				
				int iLastRow =  this.jTableDatosLiquidacionImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLiquidacionImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLiquidacionImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLiquidacionImpor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormLiquidacionImpor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesLiquidacionImpor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesLiquidacionImpor.setVisible(!isVisible);
			this.jPanelPaginacionLiquidacionImpor.setVisible(!isVisible);
			this.jPanelAccionesLiquidacionImpor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameLiquidacionImpor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoLiquidacionImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionLiquidacionImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByLiquidacionImpor();
			
			this.abrirFrameOrderByLiquidacionImpor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByLiquidacionImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleLiquidacionImpor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormLiquidacionImpor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormLiquidacionImpor.isMaximum()) {
					this.jInternalFrameDetalleFormLiquidacionImpor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormLiquidacionImpor.setSize(this.jInternalFrameDetalleFormLiquidacionImpor.iWidthFormulario,this.jInternalFrameDetalleFormLiquidacionImpor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormLiquidacionImpor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormLiquidacionImpor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormLiquidacionImpor.isMaximum()) {
						this.jInternalFrameDetalleFormLiquidacionImpor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormLiquidacionImpor.jContentPaneDetalleLiquidacionImpor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormLiquidacionImpor.jContentPaneDetalleLiquidacionImpor.getWidth(),LiquidacionImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormLiquidacionImpor.jContentPaneDetalleLiquidacionImpor.getWidth(),LiquidacionImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormLiquidacionImpor.jContentPaneDetalleLiquidacionImpor.getWidth(),LiquidacionImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleLiquidacionImpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormLiquidacionImpor.setVisible(true);
	        this.jInternalFrameDetalleFormLiquidacionImpor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByLiquidacionImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByLiquidacionImpor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByLiquidacionImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLiquidacionImpor,false,this);
				} else {
					this.jInternalFrameOrderByLiquidacionImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLiquidacionImpor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByLiquidacionImpor);
				this.jInternalFrameOrderByLiquidacionImpor.setVisible(false);
				this.jInternalFrameOrderByLiquidacionImpor.setSelected(false);
				
				this.jInternalFrameOrderByLiquidacionImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLiquidacionImpor"));
				
				this.inicializarActualizarBindingTablaOrderByLiquidacionImpor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionLiquidacionImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionLiquidacionImpor==null) {
				
				this.jInternalFrameImportacionLiquidacionImpor=new ImportacionJInternalFrame(LiquidacionImporConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLiquidacionImpor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionLiquidacionImpor);
				this.jInternalFrameImportacionLiquidacionImpor.setVisible(false);
				this.jInternalFrameImportacionLiquidacionImpor.setSelected(false);


				this.jInternalFrameImportacionLiquidacionImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLiquidacionImpor"));
				this.jInternalFrameImportacionLiquidacionImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLiquidacionImpor"));
				this.jInternalFrameImportacionLiquidacionImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLiquidacionImpor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoLiquidacionImpor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoLiquidacionImpor==null) {
				this.jInternalFrameReporteDinamicoLiquidacionImpor=new ReporteDinamicoJInternalFrame(LiquidacionImporConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLiquidacionImpor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLiquidacionImpor);
				this.jInternalFrameReporteDinamicoLiquidacionImpor.setVisible(false);
				this.jInternalFrameReporteDinamicoLiquidacionImpor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoLiquidacionImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLiquidacionImpor"));
				this.jInternalFrameReporteDinamicoLiquidacionImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLiquidacionImpor"));
				this.jInternalFrameReporteDinamicoLiquidacionImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLiquidacionImpor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLiquidacionImpor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleLiquidacionImpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLiquidacionImpor.jContentPaneDetalleLiquidacionImpor.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleLiquidacionImpor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormLiquidacionImpor);
			
	       	this.jInternalFrameDetalleFormLiquidacionImpor.setVisible(false);
	        this.jInternalFrameDetalleFormLiquidacionImpor.setSelected(false);
			
			//this.jInternalFrameDetalleFormLiquidacionImpor.dispose();
			//this.jInternalFrameDetalleFormLiquidacionImpor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoLiquidacionImpor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoLiquidacionImpor.setVisible(true);
	        this.jInternalFrameReporteDinamicoLiquidacionImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionLiquidacionImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionLiquidacionImpor.setVisible(true);
	        this.jInternalFrameImportacionLiquidacionImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByLiquidacionImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByLiquidacionImpor.setVisible(true);
	        this.jInternalFrameOrderByLiquidacionImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByLiquidacionImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByLiquidacionImpor.setVisible(false);
	        this.jInternalFrameOrderByLiquidacionImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoLiquidacionImpor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoLiquidacionImpor.setVisible(false);
	        this.jInternalFrameReporteDinamicoLiquidacionImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionLiquidacionImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionLiquidacionImpor.setVisible(false);
	        this.jInternalFrameImportacionLiquidacionImpor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Centro Costo");


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

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarLiquidacionImpor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarLiquidacionImpor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesLiquidacionImpor(true);
			//this.isEsNuevoLiquidacionImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesLiquidacionImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLiquidacionImpor(false) ;
			
			if(liquidacionimporSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() && DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleLiquidacionImporActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLiquidacionImpor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLiquidacionImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaLiquidacionImporActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarLiquidacionImpor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesLiquidacionImpor(true);
			//this.isEsNuevoLiquidacionImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.liquidacionimpor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesLiquidacionImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesLiquidacionImpor(false) ;
			
			if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLiquidacionImpor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLiquidacionImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLiquidacionImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLiquidacionImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLiquidacionImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPuerto(List<Puerto> puertosForeignKey)throws Exception{
		TableColumn tableColumnPuerto=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDPUERTO));
		TableCellEditor tableCellEditorPuerto =tableColumnPuerto.getCellEditor();

		PuertoTableCell puertoTableCellFk=(PuertoTableCell)tableCellEditorPuerto;

		if(puertoTableCellFk!=null) {
			puertoTableCellFk.setpuertosForeignKey(puertosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLiquidacionImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//puertoTableCellFk.setRowActual(intSelectedRow);
			//puertoTableCellFk.setpuertosForeignKeyActual(puertosForeignKey);
		//}


		if(puertoTableCellFk!=null) {
			puertoTableCellFk.RecargarPuertosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesLiquidacionImpor(false);
			
			//if(!this.isEsNuevoLiquidacionImpor) {								
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				
			}
			
			if(this.permiteMantenimiento(this.liquidacionimpor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoLiquidacionImpor=true;
					this.inicializarActualizarBindingTablaLiquidacionImpor(false);
					this.isEsNuevoLiquidacionImpor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoLiquidacionImpor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoLiquidacionImpor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLiquidacionImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLiquidacionImpor(false);
				
				this.habilitarDeshabilitarControlesLiquidacionImpor(false);
			
												
				
				if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleLiquidacionImpor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoLiquidacionImporActionPerformed(evt,liquidacionimporSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualLiquidacionImpor(this.liquidacionimpor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosLiquidacionImpor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,liquidacionimporSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.liquidacionimpor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				this.liquidacionimpor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				this.liquidacionimpor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.liquidacionimpor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((LiquidacionImporModel) this.jTableDatosLiquidacionImpor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoLiquidacionImpor=true;
				this.inicializarActualizarBindingTablaLiquidacionImpor(false);
				this.isEsNuevoLiquidacionImpor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLiquidacionImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLiquidacionImpor(false);
				
				this.habilitarDeshabilitarControlesLiquidacionImpor(false);
				
				
				
				if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleLiquidacionImpor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosLiquidacionImpor.getRowCount()>=1) {
				jTableDatosLiquidacionImpor.removeRowSelectionInterval(0, jTableDatosLiquidacionImpor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesLiquidacionImpor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaLiquidacionImpor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLiquidacionImpor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLiquidacionImpor(false) ;
			
			this.isEsNuevoLiquidacionImpor=false;
			
			if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleLiquidacionImpor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingLiquidacionImpor(false);
				
				//SI ES MANUAL
				if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualLiquidacionImpor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoLiquidacionImpor--;			
			//LiquidacionImpor liquidacionimporAux= new LiquidacionImpor();			
			//liquidacionimporAux.setId(this.iIdNuevoLiquidacionImpor);
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaLiquidacionImpor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
			
			this.liquidacionimpor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.liquidacionimporLogic.getLiquidacionImpors().add(this.liquidacionimporAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.liquidacionimpors.add(this.liquidacionimporAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaLiquidacionImpor(false);
			
			this.jTableDatosLiquidacionImpor.setRowSelectionInterval(this.getIndiceNuevoLiquidacionImpor(), this.getIndiceNuevoLiquidacionImpor());
			
			int iLastRow =  this.jTableDatosLiquidacionImpor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosLiquidacionImpor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosLiquidacionImpor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaLiquidacionImpor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingLiquidacionImpor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLiquidacionImpor(false);
			
			//SI ES MANUAL
			if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLiquidacionImpor();
			}
			
			//this.abrirFrameTreeLiquidacionImpor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Liquidacion ImporES ?", "MANTENIMIENTO DE Liquidacion Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionLiquidacionImpor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralLiquidacionImpor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.liquidacionimporReturnGeneral=liquidacionimporLogic.procesarImportacionLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.liquidacionimporParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarLiquidacionImporReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionLiquidacionImpor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionLiquidacionImpor.setFileImportacion(this.jInternalFrameImportacionLiquidacionImpor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionLiquidacionImpor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionLiquidacionImpor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionLiquidacionImpor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionLiquidacionImpor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		

		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("LiquidacionImporBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"LiquidacionImporBaseDesign.jrxml";
			
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
			
			this.generarReporteLiquidacionImpors("Todos",liquidacionimporsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPUERTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Puerto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Puerto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Puerto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Puerto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaLiquidacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaLiquidacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaLiquidacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaLiquidacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImporConstantesFunciones.LABEL_TIPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_po_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_po_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_po_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_po_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoLiquidacionImpor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPUERTO:
					sNombreCampoCategoria="id_puerto";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoria="fecha_liquidacion";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPUERTO:
					sNombreCampoCategoriaValor="id_puerto";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoriaValor="fecha_liquidacion";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case LiquidacionImporConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPUERTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Puerto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_puerto");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Liquacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_liquidacion");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case LiquidacionImporConstantesFunciones.LABEL_TIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo");
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
	
	public void jButtonGenerarExcelReporteDinamicoLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("LiquidacionImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_IDPUERTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDPUERTO);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getpuerto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getfecha_liquidacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImporConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(LiquidacionImpor liquidacionimpor:liquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpor.gettipo());
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
			//	this.getFilaCabeceraExportarExcelLiquidacionImpor(row);				
			//	iRow++;
			//}				
			
			//for(LiquidacionImpor liquidacionimporAux:liquidacionimporsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelLiquidacionImpor(liquidacionimporAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
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
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLiquidacionImpor(false);
			
			//SI ES MANUAL
			if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLiquidacionImpor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLiquidacionImpor(false);
			
			//SI ES MANUAL
			if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLiquidacionImpor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLiquidacionImpor(false);
			
			//SI ES MANUAL
			if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLiquidacionImpor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaLiquidacionImpor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosLiquidacionImpor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosLiquidacionImpor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosLiquidacionImpor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosLiquidacionImpor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosLiquidacionImpor.setMinimumSize(dimensionMinimum);
		this.jTableDatosLiquidacionImpor.setMaximumSize(dimensionMaximum);
		this.jTableDatosLiquidacionImpor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingLiquidacionImpor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingLiquidacionImpor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingLiquidacionImpor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaLiquidacionImpor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesLiquidacionImpor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasLiquidacionImpor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLiquidacionImpor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesLiquidacionImpor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualLiquidacionImpor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaLiquidacionImpor();
		
		this.inicializarActualizarBindingBotonesManualLiquidacionImpor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualLiquidacionImpor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLiquidacionImpor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualLiquidacionImpor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualLiquidacionImpor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosLiquidacionImpor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosLiquidacionImpor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteLiquidacionImpor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormLiquidacionImpor.jCheckBoxPostAccionNuevoLiquidacionImpor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormLiquidacionImpor.jCheckBoxPostAccionSinCerrarLiquidacionImpor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormLiquidacionImpor.jCheckBoxPostAccionSinMensajeLiquidacionImpor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosLiquidacionImpor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosLiquidacionImpor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteLiquidacionImpor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
				this.jInternalFrameDetalleFormLiquidacionImpor.jCheckBoxPostAccionNuevoLiquidacionImpor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormLiquidacionImpor.jCheckBoxPostAccionSinCerrarLiquidacionImpor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormLiquidacionImpor.jCheckBoxPostAccionSinMensajeLiquidacionImpor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionLiquidacionImpor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionLiquidacionImpor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesLiquidacionImpor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesLiquidacionImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesLiquidacionImpor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarLiquidacionImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesLiquidacionImpor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesLiquidacionImpor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralLiquidacionImpor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesLiquidacionImpor(Boolean esInicializar) throws Exception {
		try	{	
			if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualLiquidacionImpor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesLiquidacionImpor() throws Exception {
		try	{
			if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualLiquidacionImpor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLiquidacionImpor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualLiquidacionImpor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesLiquidacionImpor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesLiquidacionImpor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesLiquidacionImpor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionLiquidacionImpor.addItem(reporte);
			}
			
			
			if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionLiquidacionImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionLiquidacionImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesLiquidacionImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesLiquidacionImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarLiquidacionImpor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarLiquidacionImpor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLiquidacionImpor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLiquidacionImpor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
				this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
				this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
				
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=LiquidacionImporConstantesFunciones.getTiposSeleccionarLiquidacionImpor(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=LiquidacionImporConstantesFunciones.getTiposSeleccionarLiquidacionImpor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=LiquidacionImporConstantesFunciones.getTiposSeleccionarLiquidacionImpor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoLiquidacionImpor.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualLiquidacionImpor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisLiquidacionImpor.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisLiquidacionImpor.getSelectedItem()).getId();}
		if(this.jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.getSelectedItem()!=null){this.id_puertoFK_IdPuerto=((Puerto)this.jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasLiquidacionImpor(Boolean esInicializar) throws Exception {				
		if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualLiquidacionImpor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaLiquidacionImpor() throws Exception {
		this.inicializarActualizarBindingTablaLiquidacionImpor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByLiquidacionImpor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosLiquidacionImporOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImporOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaLiquidacionImpor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=liquidacionimporLogic.getLiquidacionImpors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=liquidacionimpors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosLiquidacionImpor.setModel(new LiquidacionImporModel(this.liquidacionimporLogic.getLiquidacionImpors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosLiquidacionImpor.setModel(new LiquidacionImporModel(this.liquidacionimpors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByLiquidacionImpor!=null && this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByLiquidacionImpor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO,liquidacionimporConstantesFunciones.resaltarSeleccionarLiquidacionImpor,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO,liquidacionimporConstantesFunciones.resaltarSeleccionarLiquidacionImpor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_ID));

		if(this.liquidacionimporConstantesFunciones.mostraridLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimporConstantesFunciones.resaltaridLiquidacionImpor,this.liquidacionimporConstantesFunciones.activaridLiquidacionImpor,iSizeTabla,this,true,"idLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimporConstantesFunciones.resaltaridLiquidacionImpor,this.liquidacionimporConstantesFunciones.activaridLiquidacionImpor,this,true,"idLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA));

		if(this.liquidacionimporConstantesFunciones.mostrarid_empresaLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_empresaLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_empresaLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_empresaLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_empresaLiquidacionImpor,false,"id_empresaLiquidacionImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.liquidacionimporConstantesFunciones.mostrarid_sucursalLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_sucursalLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_sucursalLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_sucursalLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_sucursalLiquidacionImpor,false,"id_sucursalLiquidacionImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.liquidacionimporConstantesFunciones.mostrarid_centro_costoLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_centro_costoLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_centro_costoLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_centro_costoLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_centro_costoLiquidacionImpor,true,"id_centro_costoLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.liquidacionimporConstantesFunciones.mostrarid_cuenta_contableLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_cuenta_contableLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_cuenta_contableLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_cuenta_contableLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_cuenta_contableLiquidacionImpor,true,"id_cuenta_contableLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDPAIS));

		if(this.liquidacionimporConstantesFunciones.mostrarid_paisLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_paisLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_paisLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_paisLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_paisLiquidacionImpor,true,"id_paisLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_IDPUERTO));

		if(this.liquidacionimporConstantesFunciones.mostrarid_puertoLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_IDPUERTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PuertoTableCell(this.puertosForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_puertoLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_puertoLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new PuertoTableCell(this.puertosForeignKey,this.liquidacionimporConstantesFunciones.resaltarid_puertoLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarid_puertoLiquidacionImpor,true,"id_puertoLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_NOMBRE));

		if(this.liquidacionimporConstantesFunciones.mostrarnombreLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.liquidacionimporConstantesFunciones.resaltarnombreLiquidacionImpor,this.liquidacionimporConstantesFunciones.activarnombreLiquidacionImpor,iSizeTabla,this,true,"nombreLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimporConstantesFunciones.resaltarnombreLiquidacionImpor,this.liquidacionimporConstantesFunciones.activarnombreLiquidacionImpor,this,true,"nombreLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION));

		if(this.liquidacionimporConstantesFunciones.mostrardescripcionLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.liquidacionimporConstantesFunciones.resaltardescripcionLiquidacionImpor,this.liquidacionimporConstantesFunciones.activardescripcionLiquidacionImpor,iSizeTabla,this,true,"descripcionLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimporConstantesFunciones.resaltardescripcionLiquidacionImpor,this.liquidacionimporConstantesFunciones.activardescripcionLiquidacionImpor,this,true,"descripcionLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_FECHA));

		if(this.liquidacionimporConstantesFunciones.mostrarfechaLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.liquidacionimporConstantesFunciones.resaltarfechaLiquidacionImpor,this.liquidacionimporConstantesFunciones.activarfechaLiquidacionImpor,iSizeTabla,this,true,"fechaLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.liquidacionimporConstantesFunciones.resaltarfechaLiquidacionImpor,this.liquidacionimporConstantesFunciones.activarfechaLiquidacionImpor,this,true,"fechaLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION));

		if(this.liquidacionimporConstantesFunciones.mostrarfecha_liquidacionLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.liquidacionimporConstantesFunciones.resaltarfecha_liquidacionLiquidacionImpor,this.liquidacionimporConstantesFunciones.activarfecha_liquidacionLiquidacionImpor,iSizeTabla,this,true,"fecha_liquidacionLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.liquidacionimporConstantesFunciones.resaltarfecha_liquidacionLiquidacionImpor,this.liquidacionimporConstantesFunciones.activarfecha_liquidacionLiquidacionImpor,this,true,"fecha_liquidacionLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_FLETE));

		if(this.liquidacionimporConstantesFunciones.mostrarfleteLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimporConstantesFunciones.resaltarfleteLiquidacionImpor,this.liquidacionimporConstantesFunciones.activarfleteLiquidacionImpor,iSizeTabla,this,true,"fleteLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimporConstantesFunciones.resaltarfleteLiquidacionImpor,this.liquidacionimporConstantesFunciones.activarfleteLiquidacionImpor,this,true,"fleteLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,LiquidacionImporConstantesFunciones.LABEL_TIPO));

		if(this.liquidacionimporConstantesFunciones.mostrartipoLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImporConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.liquidacionimporConstantesFunciones.resaltartipoLiquidacionImpor,this.liquidacionimporConstantesFunciones.activartipoLiquidacionImpor,iSizeTabla,this,true,"tipoLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimporConstantesFunciones.resaltartipoLiquidacionImpor,this.liquidacionimporConstantesFunciones.activartipoLiquidacionImpor,this,true,"tipoLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleLiquidacionImpor && this.liquidacionimporConstantesFunciones.mostrarDetalleLiquidacionImporLiquidacionImpor && !LiquidacionImporConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Liquidacion Impores");
				tableColumn.setHeaderValue("Detalle Liquidacion Impores");
				tableColumn.setCellRenderer(new DetalleLiquidacionImporTableCell(liquidacionimporConstantesFunciones.resaltarDetalleLiquidacionImporLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarDetalleLiquidacionImporLiquidacionImpor));
				tableColumn.setCellEditor(new DetalleLiquidacionImporTableCell(liquidacionimporConstantesFunciones.resaltarDetalleLiquidacionImporLiquidacionImpor,this,this.liquidacionimporConstantesFunciones.activarDetalleLiquidacionImporLiquidacionImpor));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLiquidacionImpor.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.liquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.liquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLiquidacionImpor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.liquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.liquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLiquidacionImpor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.liquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.liquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosLiquidacionImpor.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosLiquidacionImpor.addColumn(tableColumn);
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
			
			this.jTableDatosLiquidacionImpor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.liquidacionimporSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosLiquidacionImpor.moveColumn(this.jTableDatosLiquidacionImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosLiquidacionImpor.moveColumn(this.jTableDatosLiquidacionImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.liquidacionimporSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosLiquidacionImpor.moveColumn(this.jTableDatosLiquidacionImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosLiquidacionImpor.moveColumn(this.jTableDatosLiquidacionImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosLiquidacionImpor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosLiquidacionImpor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosLiquidacionImpor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosLiquidacionImpor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosLiquidacionImpor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosLiquidacionImpor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosLiquidacionImpor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=liquidacionimporLogic.getLiquidacionImpors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=liquidacionimpors.size()-1;
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
		//this.jTableDatosLiquidacionImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosLiquidacionImpor();
			
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
				
				//this.isEsNuevoLiquidacionImpor=false;
					
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
				if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormLiquidacionImpor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLiquidacionImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLiquidacionImpor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.liquidacionimpor.getsType().equals("DUPLICADO")
				   || this.liquidacionimpor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoLiquidacionImpor=true;
				
				} else {
					this.isEsNuevoLiquidacionImpor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
					if(this.liquidacionimpor.getId()>=0 && !this.liquidacionimpor.getIsNew()) {						
						this.isEsNuevoLiquidacionImpor=false;
						
					} else {
						this.isEsNuevoLiquidacionImpor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoLiquidacionImpor(esRelaciones);						
				
				this.seleccionarLiquidacionImpor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.liquidacionimpor.getId()<0) {
					this.isEsNuevoLiquidacionImpor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarLiquidacionImpor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarLiquidacionImpor(evt,rowIndex);
				}	
				
				if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion LiquidacionImpor: " + this.dDif); 
					}
				}								
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarLiquidacionImpor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.liquidacionimpor)) {
					if(this.liquidacionimpor.getId()>0) {
						this.liquidacionimpor.setIsDeleted(true);
						
						this.liquidacionimporsEliminados.add(this.liquidacionimpor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.liquidacionimporLogic.getLiquidacionImpors().remove(this.liquidacionimpor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.liquidacionimpors.remove(this.liquidacionimpor);				
					}
					
					
					((LiquidacionImporModel) this.jTableDatosLiquidacionImpor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaLiquidacionImpor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarLiquidacionImpor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoLiquidacionImpor) {
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLiquidacionImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLiquidacionImpor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioLiquidacionImpor(this.liquidacionimpor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.liquidacionimporConstantesFunciones.cargarid_empresaLiquidacionImpor || this.liquidacionimporConstantesFunciones.event_dependid_empresaLiquidacionImpor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.liquidacionimpor.getid_empresa());
									//this.inicializarActualizarBindingLiquidacionImpor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(liquidacionimpor.getEmpresa()!=null) {
							this.empresasForeignKey.add(liquidacionimpor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.liquidacionimpor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.liquidacionimporConstantesFunciones.cargarid_sucursalLiquidacionImpor || this.liquidacionimporConstantesFunciones.event_dependid_sucursalLiquidacionImpor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.liquidacionimpor.getid_sucursal());
									//this.inicializarActualizarBindingLiquidacionImpor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(liquidacionimpor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(liquidacionimpor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.liquidacionimpor.getid_sucursal(),false,"Formulario");

					//CentroCosto
					if(!this.liquidacionimporConstantesFunciones.cargarid_centro_costoLiquidacionImpor || this.liquidacionimporConstantesFunciones.event_dependid_centro_costoLiquidacionImpor) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.liquidacionimpor.getid_centro_costo());
									//this.inicializarActualizarBindingLiquidacionImpor(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(liquidacionimpor.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(liquidacionimpor.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.liquidacionimpor.getid_centro_costo(),false,"Formulario");

					//CuentaContable
					if(!this.liquidacionimporConstantesFunciones.cargarid_cuenta_contableLiquidacionImpor || this.liquidacionimporConstantesFunciones.event_dependid_cuenta_contableLiquidacionImpor) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.liquidacionimpor.getid_cuenta_contable());
									//this.inicializarActualizarBindingLiquidacionImpor(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(liquidacionimpor.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(liquidacionimpor.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.liquidacionimpor.getid_cuenta_contable(),false,"Formulario");

					//Pais
					if(!this.liquidacionimporConstantesFunciones.cargarid_paisLiquidacionImpor || this.liquidacionimporConstantesFunciones.event_dependid_paisLiquidacionImpor) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.liquidacionimpor.getid_pais());
									//this.inicializarActualizarBindingLiquidacionImpor(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(liquidacionimpor.getPais()!=null) {
							this.paissForeignKey.add(liquidacionimpor.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.liquidacionimpor.getid_pais(),false,"Formulario");

					//Puerto
					if(!this.liquidacionimporConstantesFunciones.cargarid_puertoLiquidacionImpor || this.liquidacionimporConstantesFunciones.event_dependid_puertoLiquidacionImpor) {
						//this.cargarCombosPuertosForeignKeyLista(" where id="+this.liquidacionimpor.getid_puerto());
									//this.inicializarActualizarBindingLiquidacionImpor(false,false);
						this.puertosForeignKey=new ArrayList<Puerto>();

						if(liquidacionimpor.getPuerto()!=null) {
							this.puertosForeignKey.add(liquidacionimpor.getPuerto());
						}

						this.addItemDefectoCombosForeignKeyPuerto();
						this.cargarCombosFramePuertosForeignKey("Todos");
					}
					this.setActualPuertoForeignKey(this.liquidacionimpor.getid_puerto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesLiquidacionImpor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesLiquidacionImpor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLiquidacionImpor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoLiquidacionImpor(LiquidacionImpor liquidacionimpor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoLiquidacionImpor(liquidacionimpor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoLiquidacionImpor(LiquidacionImpor liquidacionimpor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioLiquidacionImpor(liquidacionimpor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyLiquidacionImpor(liquidacionimpor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpor(liquidacionimpor);
	}
	
	public void setVariablesObjetoActualToFormularioLiquidacionImpor(LiquidacionImpor liquidacionimpor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.setText(liquidacionimpor.getId().toString());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreanombreLiquidacionImpor.setText(liquidacionimpor.getnombre());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreadescripcionLiquidacionImpor.setText(liquidacionimpor.getdescripcion());
			this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfechaLiquidacionImpor.setDate(liquidacionimpor.getfecha());
			this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfecha_liquidacionLiquidacionImpor.setDate(liquidacionimpor.getfecha_liquidacion());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldfleteLiquidacionImpor.setText(liquidacionimpor.getflete().toString());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldtipoLiquidacionImpor.setText(liquidacionimpor.gettipo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,LiquidacionImpor liquidacionimporLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,liquidacionimporLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,LiquidacionImpor liquidacionimporLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				liquidacionimporLocal=this.liquidacionimpor;
			} else {
				liquidacionimporLocal=this.liquidacionimporAnterior;
			}
		}
		
		if(this.permiteMantenimiento(liquidacionimporLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoLiquidacionImpor(liquidacionimporLocal,true);
					
					if(liquidacionimporSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(liquidacionimporLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(liquidacionimporLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoLiquidacionImpor(LiquidacionImpor liquidacionimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLiquidacionImpor(liquidacionimpor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(liquidacionimpor);
	}
	
	public void setVariablesFormularioToObjetoActualLiquidacionImpor(LiquidacionImpor liquidacionimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLiquidacionImpor(liquidacionimpor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualLiquidacionImpor(LiquidacionImpor liquidacionimpor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.getText()==null || this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.getText()=="" || this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.getText()=="Id") {
				this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.setText("0");
			}

			if(conColumnasBase) {liquidacionimpor.setId(Long.parseLong(this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImporConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelIdLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpor.setnombre(this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreanombreLiquidacionImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImporConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelnombreLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpor.setdescripcion(this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreadescripcionLiquidacionImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabeldescripcionLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpor.setfecha(this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfechaLiquidacionImpor.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImporConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfechaLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpor.setfecha_liquidacion(this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfecha_liquidacionLiquidacionImpor.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfecha_liquidacionLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpor.setflete(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldfleteLiquidacionImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImporConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabelfleteLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpor.settipo(this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldtipoLiquidacionImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImporConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpor.jLabeltipoLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLiquidacionImpor(LiquidacionImpor liquidacionimporBean,LiquidacionImpor liquidacionimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && liquidacionimporBean.getid_centro_costo()!=null && !liquidacionimporBean.getid_centro_costo().equals(null))) {liquidacionimpor.setid_centro_costo(liquidacionimporBean.getid_centro_costo());}
			if(conDefault || (!conDefault && liquidacionimporBean.getid_cuenta_contable()!=null && !liquidacionimporBean.getid_cuenta_contable().equals(-1L))) {liquidacionimpor.setid_cuenta_contable(liquidacionimporBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && liquidacionimporBean.getid_pais()!=null && !liquidacionimporBean.getid_pais().equals(-1L))) {liquidacionimpor.setid_pais(liquidacionimporBean.getid_pais());}
			if(conDefault || (!conDefault && liquidacionimporBean.getid_puerto()!=null && !liquidacionimporBean.getid_puerto().equals(-1L))) {liquidacionimpor.setid_puerto(liquidacionimporBean.getid_puerto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosLiquidacionImpor(LiquidacionImpor liquidacionimporOrigen,LiquidacionImpor liquidacionimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && liquidacionimporOrigen.getId()!=null && !liquidacionimporOrigen.getId().equals(0L))) {liquidacionimpor.setId(liquidacionimporOrigen.getId());}}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getid_centro_costo()!=null && !liquidacionimporOrigen.getid_centro_costo().equals(null))) {liquidacionimpor.setid_centro_costo(liquidacionimporOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getid_cuenta_contable()!=null && !liquidacionimporOrigen.getid_cuenta_contable().equals(-1L))) {liquidacionimpor.setid_cuenta_contable(liquidacionimporOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getid_pais()!=null && !liquidacionimporOrigen.getid_pais().equals(-1L))) {liquidacionimpor.setid_pais(liquidacionimporOrigen.getid_pais());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getid_puerto()!=null && !liquidacionimporOrigen.getid_puerto().equals(-1L))) {liquidacionimpor.setid_puerto(liquidacionimporOrigen.getid_puerto());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getnombre()!=null && !liquidacionimporOrigen.getnombre().equals(""))) {liquidacionimpor.setnombre(liquidacionimporOrigen.getnombre());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getdescripcion()!=null && !liquidacionimporOrigen.getdescripcion().equals(""))) {liquidacionimpor.setdescripcion(liquidacionimporOrigen.getdescripcion());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getfecha()!=null && !liquidacionimporOrigen.getfecha().equals(new Date()))) {liquidacionimpor.setfecha(liquidacionimporOrigen.getfecha());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getfecha_liquidacion()!=null && !liquidacionimporOrigen.getfecha_liquidacion().equals(new Date()))) {liquidacionimpor.setfecha_liquidacion(liquidacionimporOrigen.getfecha_liquidacion());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.getflete()!=null && !liquidacionimporOrigen.getflete().equals(0.0))) {liquidacionimpor.setflete(liquidacionimporOrigen.getflete());}
			if(conDefault || (!conDefault && liquidacionimporOrigen.gettipo()!=null && !liquidacionimporOrigen.gettipo().equals(""))) {liquidacionimpor.settipo(liquidacionimporOrigen.gettipo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLiquidacionImpor(LiquidacionImpor liquidacionimpor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.setText(liquidacionimpor.getId().toString());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreanombreLiquidacionImpor.setText(liquidacionimpor.getnombre());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreadescripcionLiquidacionImpor.setText(liquidacionimpor.getdescripcion());
			this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfechaLiquidacionImpor.setDate(liquidacionimpor.getfecha());
			this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfecha_liquidacionLiquidacionImpor.setDate(liquidacionimpor.getfecha_liquidacion());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldfleteLiquidacionImpor.setText(liquidacionimpor.getflete().toString());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldtipoLiquidacionImpor.setText(liquidacionimpor.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLiquidacionImpor(LiquidacionImporBean liquidacionimporBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.setText(liquidacionimporBean.getId().toString());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreanombreLiquidacionImpor.setText(liquidacionimporBean.getnombre());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreadescripcionLiquidacionImpor.setText(liquidacionimporBean.getdescripcion());
			this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfechaLiquidacionImpor.setDate(liquidacionimporBean.getfecha());
			this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfecha_liquidacionLiquidacionImpor.setDate(liquidacionimporBean.getfecha_liquidacion());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldfleteLiquidacionImpor.setText(liquidacionimporBean.getflete().toString());
			this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldtipoLiquidacionImpor.setText(liquidacionimporBean.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanLiquidacionImpor(LiquidacionImporParameterReturnGeneral liquidacionimporReturnGeneral,LiquidacionImporBean liquidacionimporBean,Boolean conDefault) throws Exception { 
		try {
			LiquidacionImpor liquidacionimporLocal=new LiquidacionImpor();
			
			liquidacionimporLocal=liquidacionimporReturnGeneral.getLiquidacionImpor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && liquidacionimporLocal.getId()!=null && !liquidacionimporLocal.getId().equals(0L))) {liquidacionimporBean.setId(liquidacionimporLocal.getId());}}
			if(conDefault || (!conDefault && liquidacionimporLocal.getid_centro_costo()!=null && !liquidacionimporLocal.getid_centro_costo().equals(null))) {liquidacionimporBean.setid_centro_costo(liquidacionimporLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && liquidacionimporLocal.getid_cuenta_contable()!=null && !liquidacionimporLocal.getid_cuenta_contable().equals(-1L))) {liquidacionimporBean.setid_cuenta_contable(liquidacionimporLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && liquidacionimporLocal.getid_pais()!=null && !liquidacionimporLocal.getid_pais().equals(-1L))) {liquidacionimporBean.setid_pais(liquidacionimporLocal.getid_pais());}
			if(conDefault || (!conDefault && liquidacionimporLocal.getid_puerto()!=null && !liquidacionimporLocal.getid_puerto().equals(-1L))) {liquidacionimporBean.setid_puerto(liquidacionimporLocal.getid_puerto());}
			if(conDefault || (!conDefault && liquidacionimporLocal.getnombre()!=null && !liquidacionimporLocal.getnombre().equals(""))) {liquidacionimporBean.setnombre(liquidacionimporLocal.getnombre());}
			if(conDefault || (!conDefault && liquidacionimporLocal.getdescripcion()!=null && !liquidacionimporLocal.getdescripcion().equals(""))) {liquidacionimporBean.setdescripcion(liquidacionimporLocal.getdescripcion());}
			if(conDefault || (!conDefault && liquidacionimporLocal.getfecha()!=null && !liquidacionimporLocal.getfecha().equals(new Date()))) {liquidacionimporBean.setfecha(liquidacionimporLocal.getfecha());}
			if(conDefault || (!conDefault && liquidacionimporLocal.getfecha_liquidacion()!=null && !liquidacionimporLocal.getfecha_liquidacion().equals(new Date()))) {liquidacionimporBean.setfecha_liquidacion(liquidacionimporLocal.getfecha_liquidacion());}
			if(conDefault || (!conDefault && liquidacionimporLocal.getflete()!=null && !liquidacionimporLocal.getflete().equals(0.0))) {liquidacionimporBean.setflete(liquidacionimporLocal.getflete());}
			if(conDefault || (!conDefault && liquidacionimporLocal.gettipo()!=null && !liquidacionimporLocal.gettipo().equals(""))) {liquidacionimporBean.settipo(liquidacionimporLocal.gettipo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxLiquidacionImporGenerico(Long idLiquidacionImporSeleccionado,JComboBox jComboBoxLiquidacionImpor,List<LiquidacionImpor> liquidacionimporsLocal)throws Exception {
		try {
			LiquidacionImpor  liquidacionimporTemp=null;

			for(LiquidacionImpor liquidacionimporAux:liquidacionimporsLocal) {
				if(liquidacionimporAux.getId()!=null && liquidacionimporAux.getId().equals(idLiquidacionImporSeleccionado)) {
					liquidacionimporTemp=liquidacionimporAux;
					break;
				}
			}

			jComboBoxLiquidacionImpor.setSelectedItem(liquidacionimporTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxLiquidacionImporGenerico(JComboBox jComboBoxLiquidacionImpor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLiquidacionImpor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxLiquidacionImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLiquidacionImpor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxLiquidacionImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleLiquidacionImpor")) {
			jButtonDetalleLiquidacionImporActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			liquidacionimpor=(LiquidacionImpor) liquidacionimporLogic.getLiquidacionImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			liquidacionimpor =(LiquidacionImpor) liquidacionimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!liquidacionimpor.getIsNew() && !liquidacionimpor.getIsChanged() && !liquidacionimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!liquidacionimpor.getIsNew() && !liquidacionimpor.getIsChanged() && !liquidacionimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!liquidacionimpor.getIsNew() && !liquidacionimpor.getIsChanged() && !liquidacionimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpor.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpor.getcentrocosto_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!liquidacionimpor.getIsNew() && !liquidacionimpor.getIsChanged() && !liquidacionimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpor.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpor.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!liquidacionimpor.getIsNew() && !liquidacionimpor.getIsChanged() && !liquidacionimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpor.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpor.getpais_descripcion();
			}
		}

		if(sTipo.equals("Puerto")) {
			//sDescripcion=this.getActualPuertoForeignKeyDescripcion((Long)value);
			if(!liquidacionimpor.getIsNew() && !liquidacionimpor.getIsChanged() && !liquidacionimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpor.getpuerto_descripcion();
			} else {
				//sDescripcion=this.getActualPuertoForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpor.getpuerto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		LiquidacionImpor liquidacionimporRow=new LiquidacionImpor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			liquidacionimporRow=(LiquidacionImpor) liquidacionimporLogic.getLiquidacionImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			liquidacionimporRow=(LiquidacionImpor) liquidacionimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleLiquidacionImporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,LiquidacionImpor liquidacionimpor) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLiquidacionImpor==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor = (LiquidacionImpor)this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.liquidacionimpor = (LiquidacionImpor)this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(liquidacionimpor!=null) {
						this.liquidacionimpor = liquidacionimpor;
					} else {
						this.liquidacionimpor = new LiquidacionImpor();
					}
				}

				if(this.isTienePermisosDetalleLiquidacionImpor && this.permiteMantenimiento(this.liquidacionimpor)) {
					DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFramePopup=new DetalleLiquidacionImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleliquidacionimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFramePopup;
					} else {
						detalleliquidacionimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame;
					}

					List<LiquidacionImpor> liquidacionimpors=new ArrayList<LiquidacionImpor>();
					liquidacionimpors.add(this.liquidacionimpor);
					if(!esRelacionado) {
						//detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setConGuardarRelaciones(false);
						//detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleliquidacionimporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLiquidacionImpor.cargarDetalleLiquidacionImporBeanSwingJInternalFrame(liquidacionimpors,this.liquidacionimpor,detalleliquidacionimporBeanSwingJInternalFrame,/*conInicializar,*/detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.getConGuardarRelaciones(),detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
					detalleliquidacionimporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleliquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpor("no_relacionado");

						detalleliquidacionimporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleLiquidacionImporConstantesFunciones.ITAMANIOFILATABLA + (DetalleLiquidacionImporConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleliquidacionimporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
						TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();

						titledBorderDetalleLiquidacionImpor.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Detalle Liquidacion Impor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleliquidacionimporBeanSwingJInternalFrame);
						}

						detalleliquidacionimporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleliquidacionimporBeanSwingJInternalFrame);

						detalleliquidacionimporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Liquidacion Impor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualLiquidacionImpor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor));			
			this.jButtonDuplicarLiquidacionImpor.setVisible((this.isVisibilidadCeldaDuplicarLiquidacionImpor && this.isPermisoDuplicarLiquidacionImpor));			
			this.jButtonCopiarLiquidacionImpor.setVisible((this.isVisibilidadCeldaCopiarLiquidacionImpor && this.isPermisoCopiarLiquidacionImpor));
			this.jButtonVerFormLiquidacionImpor.setVisible((this.isVisibilidadCeldaVerFormLiquidacionImpor && this.isPermisoVerFormLiquidacionImpor));
			
			this.jButtonAbrirOrderByLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpor && this.isPermisoOrdenLiquidacionImpor));			
			
			this.jButtonNuevoRelacionesLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor));			
			this.jButtonNuevoGuardarCambiosLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarLiquidacionImpor.setVisible((this.isVisibilidadCeldaModificarLiquidacionImpor && this.isPermisoActualizarLiquidacionImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarLiquidacionImpor.setVisible((this.isVisibilidadCeldaActualizarLiquidacionImpor && this.isPermisoActualizarLiquidacionImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarLiquidacionImpor.setVisible((this.isVisibilidadCeldaEliminarLiquidacionImpor && this.isPermisoEliminarLiquidacionImpor));
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpor);							
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));			
			
			}
						
			this.jButtonGuardarCambiosTablaLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor));						
			this.jButtonDuplicarToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaDuplicarLiquidacionImpor && this.isPermisoDuplicarLiquidacionImpor));						
			this.jButtonCopiarToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaCopiarLiquidacionImpor && this.isPermisoCopiarLiquidacionImpor));			
			this.jButtonVerFormToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaVerFormLiquidacionImpor && this.isPermisoVerFormLiquidacionImpor));			
			this.jButtonAbrirOrderByToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpor && this.isPermisoOrdenLiquidacionImpor));
			this.jButtonNuevoRelacionesToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor));			
			this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));			
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaModificarLiquidacionImpor && this.isPermisoActualizarLiquidacionImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaActualizarLiquidacionImpor  && this.isPermisoActualizarLiquidacionImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaEliminarLiquidacionImpor && this.isPermisoEliminarLiquidacionImpor));
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarToolBarLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpor);				
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor));			
			this.jMenuItemDuplicarLiquidacionImpor.setVisible((this.isVisibilidadCeldaDuplicarLiquidacionImpor && this.isPermisoDuplicarLiquidacionImpor));			
			this.jMenuItemCopiarLiquidacionImpor.setVisible((this.isVisibilidadCeldaCopiarLiquidacionImpor && this.isPermisoCopiarLiquidacionImpor));			
			this.jMenuItemVerFormLiquidacionImpor.setVisible((this.isVisibilidadCeldaVerFormLiquidacionImpor && this.isPermisoVerFormLiquidacionImpor));			
			this.jMenuItemAbrirOrderByLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpor && this.isPermisoOrdenLiquidacionImpor));			
			//this.jMenuItemMostrarOcultarLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpor && this.isPermisoOrdenLiquidacionImpor));
			this.jMenuItemDetalleAbrirOrderByLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpor && this.isPermisoOrdenLiquidacionImpor));			
			//this.jMenuItemDetalleMostrarOcultarLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpor && this.isPermisoOrdenLiquidacionImpor));			
			this.jMenuItemNuevoRelacionesLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor));			
			this.jMenuItemNuevoGuardarCambiosLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpor && this.isPermisoNuevoLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));									
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemModificarLiquidacionImpor.setVisible((this.isVisibilidadCeldaModificarLiquidacionImpor && this.isPermisoActualizarLiquidacionImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemActualizarLiquidacionImpor.setVisible((this.isVisibilidadCeldaActualizarLiquidacionImpor && this.isPermisoActualizarLiquidacionImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemEliminarLiquidacionImpor.setVisible((this.isVisibilidadCeldaEliminarLiquidacionImpor && this.isPermisoEliminarLiquidacionImpor));
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemCancelarLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpor);				
			}
			
			this.jMenuItemGuardarCambiosLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));						
			this.jMenuItemGuardarCambiosTablaLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoLiquidacionImpor=this.jButtonNuevoLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaDuplicarLiquidacionImpor=this.jButtonDuplicarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaCopiarLiquidacionImpor=this.jButtonCopiarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaVerFormLiquidacionImpor=this.jButtonVerFormLiquidacionImpor.isVisible();
			
			this.isVisibilidadCeldaOrdenLiquidacionImpor=this.jButtonAbrirOrderByLiquidacionImpor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=this.jButtonNuevoRelacionesLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaModificarLiquidacionImpor=this.jButtonModificarLiquidacionImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			this.isVisibilidadCeldaActualizarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaEliminarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaCancelarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaGuardarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosLiquidacionImpor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=this.jButtonGuardarCambiosTablaLiquidacionImpor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoLiquidacionImpor=this.jButtonNuevoToolBarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=this.jButtonNuevoRelacionesToolBarLiquidacionImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			this.isVisibilidadCeldaModificarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarToolBarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaActualizarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarToolBarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaEliminarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarToolBarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaCancelarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarToolBarLiquidacionImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLiquidacionImpor=this.jButtonGuardarCambiosToolBarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=this.jButtonGuardarCambiosTablaToolBarLiquidacionImpor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoLiquidacionImpor=this.jMenuItemNuevoLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=this.jMenuItemNuevoRelacionesLiquidacionImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			this.isVisibilidadCeldaModificarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemModificarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaActualizarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemActualizarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaEliminarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemEliminarLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaCancelarLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemCancelarLiquidacionImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLiquidacionImpor=this.jMenuItemGuardarCambiosLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=this.jMenuItemGuardarCambiosTablaLiquidacionImpor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesLiquidacionImpor(Boolean esInicializar) {
		if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {			
			if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
				//if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesLiquidacionImpor();
			}
			
			this.inicializarActualizarBindingBotonesManualLiquidacionImpor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualLiquidacionImpor() {
		this.jButtonNuevoLiquidacionImpor.setVisible(this.isPermisoNuevoLiquidacionImpor);			
		this.jButtonDuplicarLiquidacionImpor.setVisible(this.isPermisoDuplicarLiquidacionImpor);			
		this.jButtonCopiarLiquidacionImpor.setVisible(this.isPermisoCopiarLiquidacionImpor);			
		this.jButtonVerFormLiquidacionImpor.setVisible(this.isPermisoVerFormLiquidacionImpor);			
		
		this.jButtonAbrirOrderByLiquidacionImpor.setVisible(this.isPermisoOrdenLiquidacionImpor);					
		
		this.jButtonNuevoRelacionesLiquidacionImpor.setVisible(this.isPermisoNuevoLiquidacionImpor);			
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarLiquidacionImpor.setVisible(this.isPermisoActualizarLiquidacionImpor);	
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarLiquidacionImpor.setVisible(this.isPermisoActualizarLiquidacionImpor);	
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarLiquidacionImpor.setVisible(this.isPermisoEliminarLiquidacionImpor);
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpor);						
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosLiquidacionImpor.setVisible(this.isPermisoGuardarCambiosLiquidacionImpor);							
		}
		
		this.jButtonGuardarCambiosTablaLiquidacionImpor.setVisible(this.isPermisoActualizarLiquidacionImpor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleLiquidacionImpor() {
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarLiquidacionImpor.setVisible(this.isPermisoActualizarLiquidacionImpor);	
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarLiquidacionImpor.setVisible(this.isPermisoActualizarLiquidacionImpor);	
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarLiquidacionImpor.setVisible(this.isPermisoEliminarLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpor);							
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarLiquidacionImpor && this.isPermisoGuardarCambiosLiquidacionImpor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosLiquidacionImpor() {
		if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualLiquidacionImpor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesLiquidacionImpor() {
	}
	
	public void jTableDatosLiquidacionImporListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarLiquidacionImpor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.liquidacionimpor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.liquidacionimporLogic.getConnexion());

				if(this.liquidacionimpor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.liquidacionimpor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.liquidacionimpor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.liquidacionimporLogic.getConnexion());

				if(this.liquidacionimpor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.liquidacionimpor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.liquidacionimpor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpor(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.liquidacionimporLogic.getConnexion());

				if(this.liquidacionimpor.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.liquidacionimpor.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.liquidacionimpor.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpor(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.liquidacionimporLogic.getConnexion());

				if(this.liquidacionimpor.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.liquidacionimpor.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.liquidacionimpor.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpor(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.liquidacionimporLogic.getConnexion());

				if(this.liquidacionimpor.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.liquidacionimpor.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.liquidacionimpor.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_puertoLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopuerto=true;

			idTienePermisopuerto=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpor(PuertoConstantesFunciones.CLASSNAME);

			if(idTienePermisopuerto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);

				this.puertoBeanSwingJInternalFrame=new PuertoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.puertoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.puertoBeanSwingJInternalFrame.getPuertoLogic().setConnexion(this.liquidacionimporLogic.getConnexion());

				if(this.liquidacionimpor.getid_puerto()!=null) {
					this.puertoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.puertoBeanSwingJInternalFrame.setIdActual(this.liquidacionimpor.getid_puerto());
					this.puertoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.puertoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.puertoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPuerto();
				}

				JInternalFrameBase jinternalFrame =this.puertoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpor.getBorder();
				TitledBorder titledBorderpuerto=(TitledBorder)this.puertoBeanSwingJInternalFrame.jScrollPanelDatosPuerto.getBorder();

				titledBorderpuerto.setTitle(titledBorderLiquidacionImpor.getTitle() + " -> Puerto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_puertoLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getid_puerto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_puerto = "+this.liquidacionimpor.getid_puerto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.liquidacionimpor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.liquidacionimpor.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.liquidacionimpor.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_liquidacionLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getfecha_liquidacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_liquidacion = '"+Funciones2.getStringPostgresDate(this.liquidacionimpor.getfecha_liquidacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.liquidacionimpor.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.getliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpor==null) {
						this.liquidacionimpor = new LiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);
				}

				if(this.liquidacionimpor.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.liquidacionimpor.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCentroCostoLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpor(false,false);

			this.getLiquidacionImporsFK_IdCentroCosto();

			this.inicializarActualizarBindingLiquidacionImpor(false);

			//if(LiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpor(false,false);

			this.getLiquidacionImporsFK_IdCuentaContable();

			this.inicializarActualizarBindingLiquidacionImpor(false);

			//if(LiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpor(false,false);

			this.getLiquidacionImporsFK_IdEmpresa();

			this.inicializarActualizarBindingLiquidacionImpor(false);

			//if(LiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpor(false,false);

			this.getLiquidacionImporsFK_IdPais();

			this.inicializarActualizarBindingLiquidacionImpor(false);

			//if(LiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPuertoLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpor(false,false);

			this.getLiquidacionImporsFK_IdPuerto();

			this.inicializarActualizarBindingLiquidacionImpor(false);

			//if(LiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpor(false,false);

			this.getLiquidacionImporsFK_IdSucursal();

			this.inicializarActualizarBindingLiquidacionImpor(false);

			//if(LiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameLiquidacionImpor() {
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
		

		if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpor.setVisible(false);	    			
			this.jInternalFrameDetalleFormLiquidacionImpor.dispose();
			this.jInternalFrameDetalleFormLiquidacionImpor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
			this.jInternalFrameReporteDinamicoLiquidacionImpor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoLiquidacionImpor.dispose();
			this.jInternalFrameReporteDinamicoLiquidacionImpor=null;
		}
		
		if(this.jInternalFrameImportacionLiquidacionImpor!=null) {
			this.jInternalFrameImportacionLiquidacionImpor.setVisible(false);	    			
			this.jInternalFrameImportacionLiquidacionImpor.dispose();
			this.jInternalFrameImportacionLiquidacionImpor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessLiquidacionImpor();
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
			
			if(sTipo.equals("NuevoLiquidacionImpor")) {
				jButtonNuevoLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarLiquidacionImpor")) {
				jButtonDuplicarLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarLiquidacionImpor")) {
				jButtonCopiarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormLiquidacionImpor")) {
				jButtonVerFormLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarLiquidacionImpor")) {
				jButtonNuevoLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarLiquidacionImpor")) {
				jButtonDuplicarLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoLiquidacionImpor")) {
				jButtonNuevoLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarLiquidacionImpor")) {
				jButtonDuplicarLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesLiquidacionImpor")) {
				jButtonNuevoLiquidacionImporActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarLiquidacionImpor")) {
				jButtonNuevoLiquidacionImporActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesLiquidacionImpor")) {
				jButtonNuevoLiquidacionImporActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarLiquidacionImpor")) {
				jButtonModificarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarLiquidacionImpor")) {
				jButtonModificarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarLiquidacionImpor")) {
				jButtonModificarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarLiquidacionImpor")) {
				jButtonActualizarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarLiquidacionImpor")) {
				jButtonActualizarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarLiquidacionImpor")) {
				jButtonActualizarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarLiquidacionImpor")) {
				jButtonEliminarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarLiquidacionImpor")) {
				jButtonEliminarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarLiquidacionImpor")) {
				jButtonEliminarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarLiquidacionImpor")) {
				jButtonCancelarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarLiquidacionImpor")) {
				jButtonCancelarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarLiquidacionImpor")) {
				jButtonCancelarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarLiquidacionImpor")) {
				jButtonCerrarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarLiquidacionImpor")) {
				jButtonCerrarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarLiquidacionImpor")) {
				jButtonCerrarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarLiquidacionImpor")) {
				jButtonMostrarOcultarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarLiquidacionImpor")) {
				jButtonCancelarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosLiquidacionImpor")) {
				jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarLiquidacionImpor")) {
				jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarLiquidacionImpor")) {
				jButtonCopiarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarLiquidacionImpor")) {
				jButtonVerFormLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosLiquidacionImpor")) {
				jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarLiquidacionImpor")) {
				jButtonCopiarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormLiquidacionImpor")) {
				jButtonVerFormLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaLiquidacionImpor")) {
				jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarLiquidacionImpor")) {
				jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaLiquidacionImpor")) {
				jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionLiquidacionImpor")) {
				jButtonRecargarInformacionLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarLiquidacionImpor")) {
				jButtonRecargarInformacionLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionLiquidacionImpor")) {
				jButtonRecargarInformacionLiquidacionImporActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresLiquidacionImpor")) {
				jButtonAnterioresLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarLiquidacionImpor")) {
				jButtonAnterioresLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreLiquidacionImpor")) {
				jButtonAnterioresLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesLiquidacionImpor")) {
				jButtonSiguientesLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarLiquidacionImpor")) {
				jButtonSiguientesLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesLiquidacionImpor")) {
				jButtonSiguientesLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByLiquidacionImpor") || sTipo.equals("MenuItemDetalleAbrirOrderByLiquidacionImpor")) {
				jButtonAbrirOrderByLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarLiquidacionImpor") || sTipo.equals("MenuItemDetalleMostrarOcultarLiquidacionImpor")) {
				jButtonMostrarOcultarLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosLiquidacionImpor")) {
				jButtonNuevoGuardarCambiosLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarLiquidacionImpor")) {
				jButtonNuevoGuardarCambiosLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosLiquidacionImpor")) {
				jButtonNuevoGuardarCambiosLiquidacionImporActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoLiquidacionImpor")) {
				jButtonCerrarReporteDinamicoLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoLiquidacionImpor")) {
				jButtonGenerarReporteDinamicoLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoLiquidacionImpor")) {
				
				jButtonGenerarExcelReporteDinamicoLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionLiquidacionImpor")) {
				jButtonCerrarImportacionLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionLiquidacionImpor")) {
				
				jButtonGenerarImportacionLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionLiquidacionImpor")) {
				
				jButtonAbrirImportacionLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesLiquidacionImpor")) {
				jComboBoxTiposAccionesLiquidacionImporActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesLiquidacionImpor")) {
				jComboBoxTiposRelacionesLiquidacionImporActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioLiquidacionImpor")) {
				jComboBoxTiposAccionesLiquidacionImporActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarLiquidacionImpor")) {
				
				jComboBoxTiposSeleccionarLiquidacionImporActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralLiquidacionImpor")) {
				jTextFieldValorCampoGeneralLiquidacionImporActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByLiquidacionImpor")) {
				jButtonAbrirOrderByLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarLiquidacionImpor")) {
				jButtonAbrirOrderByLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByLiquidacionImpor")) {
				jButtonCerrarOrderByLiquidacionImporActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLiquidacionImporBusqueda")) {
				this.jButtonidLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLiquidacionImporUpdate")) {
				this.jButtonid_empresaLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLiquidacionImporBusqueda")) {
				this.jButtonid_empresaLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalLiquidacionImporUpdate")) {
				this.jButtonid_sucursalLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalLiquidacionImporBusqueda")) {
				this.jButtonid_sucursalLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoLiquidacionImporUpdate")) {
				this.jButtonid_centro_costoLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoLiquidacionImporBusqueda")) {
				this.jButtonid_centro_costoLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableLiquidacionImporUpdate")) {
				this.jButtonid_cuenta_contableLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableLiquidacionImporBusqueda")) {
				this.jButtonid_cuenta_contableLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisLiquidacionImporUpdate")) {
				this.jButtonid_paisLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisLiquidacionImporBusqueda")) {
				this.jButtonid_paisLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_puertoLiquidacionImporUpdate")) {
				this.jButtonid_puertoLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_puertoLiquidacionImporBusqueda")) {
				this.jButtonid_puertoLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLiquidacionImporBusqueda")) {
				this.jButtonnombreLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionLiquidacionImporBusqueda")) {
				this.jButtondescripcionLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaLiquidacionImporBusqueda")) {
				this.jButtonfechaLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionLiquidacionImporBusqueda")) {
				this.jButtonfecha_liquidacionLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteLiquidacionImporBusqueda")) {
				this.jButtonfleteLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoLiquidacionImporBusqueda")) {
				this.jButtontipoLiquidacionImporBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCentroCostoLiquidacionImpor")) {
				this.jButtonFK_IdCentroCostoLiquidacionImporActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableLiquidacionImpor")) {
				this.jButtonFK_IdCuentaContableLiquidacionImporActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisLiquidacionImpor")) {
				this.jButtonFK_IdPaisLiquidacionImporActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPuertoLiquidacionImpor")) {
				this.jButtonFK_IdPuertoLiquidacionImporActionPerformed(evt);
			}
			
			;
			
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessLiquidacionImpor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				


				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			LiquidacionImpor liquidacionimporLocal=null;
			
			if(!this.getEsControlTabla()) {
				liquidacionimporLocal=this.liquidacionimpor;
			} else {
				liquidacionimporLocal=this.liquidacionimporAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
							
				
				


				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
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
			
			


			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
								
						
				


				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
								
				
				


				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
							
				
				


				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
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
			
			


			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImporActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
								
				
				


				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosLiquidacionImpor")) {
					jCheckBoxSeleccionarTodosLiquidacionImporItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosLiquidacionImpor")) {
					jCheckBoxSeleccionadosLiquidacionImporItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarLiquidacionImpor")) {
					
				}
				
				


				
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
												
				
				


				
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImporActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
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
			
			


			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpor);
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
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
				
				


				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimporAnterior =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarLiquidacionImpor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosLiquidacionImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosLiquidacionImpor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.liquidacionimpor =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.liquidacionimpor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarLiquidacionImpor")) {
				
				}
				
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarLiquidacionImpor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosLiquidacionImpor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarLiquidacionImpor")) {
			
			}
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLiquidacionImpor();
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
			if(sTipo.equals("NuevoLiquidacionImpor")) {
				jButtonNuevoLiquidacionImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarLiquidacionImpor")) {
				jButtonDuplicarLiquidacionImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarLiquidacionImpor")) {
				jButtonCopiarLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormLiquidacionImpor")) {
				jButtonVerFormLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesLiquidacionImpor")) {
				jButtonNuevoLiquidacionImporActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarLiquidacionImpor")) {
				jButtonModificarLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarLiquidacionImpor")) {
				jButtonActualizarLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarLiquidacionImpor")) {
				jButtonEliminarLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaLiquidacionImpor")) {
				jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLiquidacionImpor")) {
				jButtonCancelarLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarLiquidacionImpor")) {
				jButtonCerrarLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosLiquidacionImpor")) {
				jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosLiquidacionImpor")) {
				jButtonNuevoGuardarCambiosLiquidacionImporActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByLiquidacionImpor")) {
				jButtonAbrirOrderByLiquidacionImporActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionLiquidacionImpor")) {
				jButtonRecargarInformacionLiquidacionImporActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresLiquidacionImpor")) {
				jButtonAnterioresLiquidacionImporActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesLiquidacionImpor")) {
				jButtonSiguientesLiquidacionImporActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLiquidacionImporBusqueda")) {
				this.jButtonidLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLiquidacionImporUpdate")) {
				this.jButtonid_empresaLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLiquidacionImporBusqueda")) {
				this.jButtonid_empresaLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalLiquidacionImporUpdate")) {
				this.jButtonid_sucursalLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalLiquidacionImporBusqueda")) {
				this.jButtonid_sucursalLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoLiquidacionImporUpdate")) {
				this.jButtonid_centro_costoLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoLiquidacionImporBusqueda")) {
				this.jButtonid_centro_costoLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableLiquidacionImporUpdate")) {
				this.jButtonid_cuenta_contableLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableLiquidacionImporBusqueda")) {
				this.jButtonid_cuenta_contableLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisLiquidacionImporUpdate")) {
				this.jButtonid_paisLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisLiquidacionImporBusqueda")) {
				this.jButtonid_paisLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_puertoLiquidacionImporUpdate")) {
				this.jButtonid_puertoLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_puertoLiquidacionImporBusqueda")) {
				this.jButtonid_puertoLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLiquidacionImporBusqueda")) {
				this.jButtonnombreLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionLiquidacionImporBusqueda")) {
				this.jButtondescripcionLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaLiquidacionImporBusqueda")) {
				this.jButtonfechaLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionLiquidacionImporBusqueda")) {
				this.jButtonfecha_liquidacionLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteLiquidacionImporBusqueda")) {
				this.jButtonfleteLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoLiquidacionImporBusqueda")) {
				this.jButtontipoLiquidacionImporBusquedaActionPerformed(evt);
			}
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessLiquidacionImpor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameLiquidacionImpor")) {
				closingInternalFrameLiquidacionImpor();
				
			} else if(sTipo.equals("jButtonCancelarLiquidacionImpor")) {
				JInternalFrameBase jInternalFrameDetalleFormLiquidacionImpor = (JInternalFrameBase)evt.getSource();
	            	
	            LiquidacionImporBeanSwingJInternalFrame jInternalFrameParent=(LiquidacionImporBeanSwingJInternalFrame)jInternalFrameDetalleFormLiquidacionImpor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarLiquidacionImporActionPerformed(null);
			}
			
			LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.liquidacionimpor,new Object(),this.liquidacionimporParameterGeneral,this.liquidacionimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormLiquidacionImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormLiquidacionImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormLiquidacionImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.liquidacionimpor)) {
			if(!esControlTabla) {
				if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);			
				}
				
				if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualLiquidacionImpor(this.liquidacionimpor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.liquidacionimporReturnGeneral=liquidacionimporLogic.procesarEventosLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.liquidacionimporLogic.getLiquidacionImpors(),this.liquidacionimpor,this.liquidacionimporParameterGeneral,this.isEsNuevoLiquidacionImpor,classes);//this.liquidacionimporLogic.getLiquidacionImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanLiquidacionImpor(this.liquidacionimporReturnGeneral,this.liquidacionimporBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanLiquidacionImpor(classes,this.liquidacionimporReturnGeneral,this.liquidacionimporBean,false);
					}
						
					if(this.liquidacionimporReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpor(this.liquidacionimporReturnGeneral.getLiquidacionImpor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioLiquidacionImpor(this.liquidacionimporReturnGeneral.getLiquidacionImpor());	
					}
						
					if(this.liquidacionimporReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioLiquidacionImpor(this.liquidacionimporReturnGeneral.getLiquidacionImpor(),classes);//this.liquidacionimporBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioLiquidacionImpor(this.liquidacionimpor,classes);//this.liquidacionimporBean);									
				}
			
				if(LiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpor(this.liquidacionimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpor(this.liquidacionimpor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.liquidacionimporAnterior!=null) {
						this.liquidacionimpor=this.liquidacionimporAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.liquidacionimporReturnGeneral=liquidacionimporLogic.procesarEventosLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.liquidacionimporLogic.getLiquidacionImpors(),this.liquidacionimpor,this.liquidacionimporParameterGeneral,this.isEsNuevoLiquidacionImpor,classes);//this.liquidacionimporLogic.getLiquidacionImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.liquidacionimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.liquidacionimporReturnGeneral.getLiquidacionImpor(),liquidacionimporLogic.getLiquidacionImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.liquidacionimporReturnGeneral.getLiquidacionImpor(),this.liquidacionimpors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosLiquidacionImpor.repaint();
				
				//((AbstractTableModel) this.jTableDatosLiquidacionImpor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosLiquidacionImpor();
			}
		}
	}
	
	public void actualizarVisualTableDatosLiquidacionImpor() throws Exception {
		
		LiquidacionImporModel liquidacionimporModel=(LiquidacionImporModel)this.jTableDatosLiquidacionImpor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			liquidacionimporModel.liquidacionimpors=this.liquidacionimporLogic.getLiquidacionImpors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			liquidacionimporModel.liquidacionimpors=this.liquidacionimpors;
		}
		
		
		((LiquidacionImporModel) this.jTableDatosLiquidacionImpor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaLiquidacionImpor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getliquidacionimporAnterior(),this.liquidacionimporLogic.getLiquidacionImpors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getliquidacionimporAnterior(),this.liquidacionimpors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosLiquidacionImpor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioLiquidacionImpor(LiquidacionImpor liquidacionimpor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpor.class)) {
					this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(liquidacionimpor.getDetalleLiquidacionImpors());
					this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
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
										
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.liquidacionimpor,new Object(),generalEntityParameterGeneral,this.liquidacionimporReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=LiquidacionImporConstantesFunciones.getClassesRelationshipsOfLiquidacionImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=LiquidacionImporConstantesFunciones.getClassesRelationshipsFromStringsOfLiquidacionImpor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormLiquidacionImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				LiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.liquidacionimpor,new Object(),generalEntityParameterGeneral,this.liquidacionimporReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioLiquidacionImpor(LiquidacionImporBean liquidacionimporBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpor.class)) {
					this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(liquidacionimpor.getDetalleLiquidacionImpors());
					this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanLiquidacionImpor(ArrayList<Classe> classes,LiquidacionImporReturnGeneral liquidacionimporReturnGeneral,LiquidacionImporBean liquidacionimporBean,Boolean conDefault) throws Exception {
		
			this.liquidacionimporBean.setDetalleLiquidacionImpors(liquidacionimporReturnGeneral.getLiquidacionImpor().getDetalleLiquidacionImpors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualLiquidacionImpor(LiquidacionImpor liquidacionimpor,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpor.class)) {
					liquidacionimpor.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.liquidacionimpor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormLiquidacionImpor = new LiquidacionImporDetalleFormJInternalFrame(jDesktopPane,this.liquidacionimporSessionBean.getConGuardarRelaciones(),this.liquidacionimporSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.setVisible(false);
		this.jInternalFrameDetalleFormLiquidacionImpor.setSelected(false);						
		
		this.jInternalFrameDetalleFormLiquidacionImpor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormLiquidacionImpor.liquidacionimporLogic=this.liquidacionimporLogic;
		
		this.cargarCombosFrameForeignKeyLiquidacionImpor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleLiquidacionImpor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLiquidacionImpor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyLiquidacionImpor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyLiquidacionImpor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormLiquidacionImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLiquidacionImpor"));
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ModificarLiquidacionImpor"));

		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarToolBarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarLiquidacionImpor"));
					
		this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemModificarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarLiquidacionImpor"));		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"ActualizarLiquidacionImpor"));
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarToolBarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLiquidacionImpor"));
						
		this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemActualizarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLiquidacionImpor"));		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"EliminarLiquidacionImpor"));
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarLiquidacionImpor"));
								
		this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemEliminarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLiquidacionImpor"));		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CancelarLiquidacionImpor"));
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarLiquidacionImpor"));
					
		this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemCancelarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLiquidacionImpor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemDetalleCerrarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLiquidacionImpor"));		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLiquidacionImpor"));
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLiquidacionImpor"));
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLiquidacionImpor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonidLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"idLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_empresaLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_empresaLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_sucursalLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_sucursalLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_centro_costoLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_centro_costoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_cuenta_contableLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_cuenta_contableLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_paisLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_paisLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_paisLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_paisLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_puertoLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_puertoLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_puertoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_puertoLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonnombreLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtondescripcionLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfechaLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfecha_liquidacionLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfleteLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtontipoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"tipoLiquidacionImporBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLiquidacionImpor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameLiquidacionImpor"));
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLiquidacionImpor"));
		}
		
		this.jTableDatosLiquidacionImpor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarLiquidacionImpor"));
		
		this.jTableDatosLiquidacionImpor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarLiquidacionImpor"));
		
		this.jButtonNuevoLiquidacionImpor.addActionListener(new ButtonActionListener(this,"NuevoLiquidacionImpor"));
		
		this.jButtonDuplicarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"DuplicarLiquidacionImpor"));
		
		this.jButtonCopiarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"CopiarLiquidacionImpor"));
		
		this.jButtonVerFormLiquidacionImpor.addActionListener(new ButtonActionListener(this,"VerFormLiquidacionImpor"));
		
		
		this.jButtonNuevoToolBarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"NuevoToolBarLiquidacionImpor"));
			
		this.jButtonDuplicarToolBarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarLiquidacionImpor"));
			
		this.jMenuItemNuevoLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoLiquidacionImpor"));
			
		this.jMenuItemDuplicarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarLiquidacionImpor"));		
		
		
		this.jButtonNuevoRelacionesLiquidacionImpor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesLiquidacionImpor"));
		
		
		this.jButtonNuevoRelacionesToolBarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarLiquidacionImpor"));
			
		this.jMenuItemNuevoRelacionesLiquidacionImpor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesLiquidacionImpor"));		
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ModificarLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonModificarToolBarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarLiquidacionImpor"));
			
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemModificarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarLiquidacionImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"ActualizarLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonActualizarToolBarLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLiquidacionImpor"));
				
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemActualizarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLiquidacionImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"EliminarLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonEliminarToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarLiquidacionImpor"));
						
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemEliminarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLiquidacionImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CancelarLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonCancelarToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarLiquidacionImpor"));
			
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemCancelarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLiquidacionImpor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarLiquidacionImpor"));		
		
		
		this.jButtonCerrarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CerrarLiquidacionImpor"));
		
		
		this.jButtonCerrarToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CerrarToolBarLiquidacionImpor"));
			
		this.jMenuItemCerrarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarLiquidacionImpor"));
			
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jMenuItemDetalleCerrarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLiquidacionImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLiquidacionImpor"));
		}
		
		this.jButtonCopiarToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CopiarToolBarLiquidacionImpor"));
			
		this.jButtonVerFormToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"VerFormToolBarLiquidacionImpor"));
		
		this.jMenuItemGuardarCambiosLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosLiquidacionImpor"));
			
		this.jMenuItemCopiarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarLiquidacionImpor"));		
		
		this.jMenuItemVerFormLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormLiquidacionImpor"));		
		
		
		this.jButtonGuardarCambiosTablaLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLiquidacionImpor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarLiquidacionImpor"));
			
		this.jMenuItemGuardarCambiosTablaLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLiquidacionImpor"));		
		
		
		
		this.jButtonRecargarInformacionLiquidacionImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionLiquidacionImpor"));
					
		this.jButtonRecargarInformacionToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarLiquidacionImpor"));
		
		this.jMenuItemRecargarInformacionLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionLiquidacionImpor"));		
		
		
		
		this.jButtonAnterioresLiquidacionImpor.addActionListener (new ButtonActionListener(this,"AnterioresLiquidacionImpor"));
		
		
		this.jButtonAnterioresToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarLiquidacionImpor"));
		
		this.jMenuItemAnterioresLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresLiquidacionImpor"));		
		
		
		this.jButtonSiguientesLiquidacionImpor.addActionListener (new ButtonActionListener(this,"SiguientesLiquidacionImpor"));
		
		
		this.jButtonSiguientesToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarLiquidacionImpor"));
			
		this.jMenuItemSiguientesLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesLiquidacionImpor"));
			
		this.jMenuItemAbrirOrderByLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByLiquidacionImpor"));
			
		this.jMenuItemMostrarOcultarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarLiquidacionImpor"));
			
		this.jMenuItemDetalleAbrirOrderByLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByLiquidacionImpor"));
			
		this.jMenuItemDetalleMostarOcultarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarLiquidacionImpor"));		
		
		
		this.jButtonNuevoGuardarCambiosLiquidacionImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosLiquidacionImpor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarLiquidacionImpor"));
			
		this.jMenuItemNuevoGuardarCambiosLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosLiquidacionImpor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosLiquidacionImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosLiquidacionImpor"));

		this.jCheckBoxSeleccionadosLiquidacionImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosLiquidacionImpor"));
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLiquidacionImpor"));
		}
		
		
		this.jComboBoxTiposRelacionesLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposRelacionesLiquidacionImpor"));
			
		this.jComboBoxTiposAccionesLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesLiquidacionImpor"));
					
		this.jComboBoxTiposSeleccionarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarLiquidacionImpor"));
			
		this.jTextFieldValorCampoGeneralLiquidacionImpor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralLiquidacionImpor"));		
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonidLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"idLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_empresaLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_empresaLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_sucursalLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_sucursalLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_centro_costoLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_centro_costoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_cuenta_contableLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_cuenta_contableLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_paisLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_paisLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_paisLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_paisLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_puertoLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_puertoLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_puertoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_puertoLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonnombreLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtondescripcionLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfechaLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfecha_liquidacionLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfleteLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtontipoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"tipoLiquidacionImporBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCentroCostoLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoLiquidacionImpor"));

			this.jButtonFK_IdCuentaContableLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableLiquidacionImpor"));

			this.jButtonFK_IdPaisLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdPaisLiquidacionImpor"));

			this.jButtonFK_IdPuertoLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdPuertoLiquidacionImpor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoLiquidacionImpor!=null) {
				this.jInternalFrameReporteDinamicoLiquidacionImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLiquidacionImpor"));
				this.jInternalFrameReporteDinamicoLiquidacionImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLiquidacionImpor"));
				this.jInternalFrameReporteDinamicoLiquidacionImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLiquidacionImpor"));
			}
			
			//this.jButtonCerrarReporteDinamicoLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLiquidacionImpor"));				
			//this.jButtonGenerarReporteDinamicoLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLiquidacionImpor"));
			//this.jButtonGenerarExcelReporteDinamicoLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLiquidacionImpor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionLiquidacionImpor!=null) {
				this.jInternalFrameImportacionLiquidacionImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLiquidacionImpor"));
				this.jInternalFrameImportacionLiquidacionImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLiquidacionImpor"));
				this.jInternalFrameImportacionLiquidacionImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLiquidacionImpor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByLiquidacionImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByLiquidacionImpor"));
			
			this.jButtonAbrirOrderByToolBarLiquidacionImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarLiquidacionImpor"));			
			
			if(this.jInternalFrameOrderByLiquidacionImpor!=null) {
				this.jInternalFrameOrderByLiquidacionImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLiquidacionImpor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpor.jTabbedPaneRelacionesLiquidacionImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLiquidacionImpor"));
		
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
            		closingInternalFrameLiquidacionImpor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormLiquidacionImpor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormLiquidacionImpor = (JInternalFrameBase)event.getSource();
	            	
	            LiquidacionImporBeanSwingJInternalFrame jInternalFrameParent=(LiquidacionImporBeanSwingJInternalFrame)jInternalFrameDetalleFormLiquidacionImpor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarLiquidacionImporActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosLiquidacionImpor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosLiquidacionImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosLiquidacionImpor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosLiquidacionImpor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoLiquidacionImpor";
		inputMap = this.jButtonNuevoLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLiquidacionImporActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesLiquidacionImpor";
		inputMap = this.jButtonNuevoRelacionesLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLiquidacionImporActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarLiquidacionImpor";
		inputMap = this.jButtonModificarLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarLiquidacionImpor";
		inputMap = this.jButtonActualizarLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarLiquidacionImpor";
		inputMap = this.jButtonEliminarLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarLiquidacionImpor";
		inputMap = this.jButtonCancelarLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarLiquidacionImpor";
		inputMap = this.jButtonCerrarLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosLiquidacionImpor";
		inputMap = this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonGuardarCambiosLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosLiquidacionImpor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosLiquidacionImporItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesLiquidacionImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesLiquidacionImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarLiquidacionImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarLiquidacionImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralLiquidacionImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralLiquidacionImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonidLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"idLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_empresaLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_empresaLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_sucursalLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_sucursalLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_centro_costoLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_centro_costoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_cuenta_contableLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_cuenta_contableLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_paisLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_paisLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_paisLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_paisLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_puertoLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_puertoLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonid_puertoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_puertoLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonnombreLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtondescripcionLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfechaLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfecha_liquidacionLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtonfleteLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpor.jButtontipoLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"tipoLiquidacionImporBusqueda"));
		
		
		this.jButtonFK_IdCentroCostoLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoLiquidacionImpor"));

		this.jButtonFK_IdCuentaContableLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableLiquidacionImpor"));

		this.jButtonFK_IdPaisLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdPaisLiquidacionImpor"));

		this.jButtonFK_IdPuertoLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdPuertoLiquidacionImpor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarLiquidacionImporActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarLiquidacionImpor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosLiquidacionImpor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
					liquidacionimporAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LiquidacionImpor liquidacionimporAux:liquidacionimpors) {
					liquidacionimporAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosLiquidacionImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLiquidacionImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
						liquidacionimporAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LiquidacionImpor liquidacionimporAux:liquidacionimpors) {
						liquidacionimporAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LiquidacionImpor liquidacionimporAux:liquidacionimpors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaLiquidacionImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLiquidacionImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLiquidacionImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosLiquidacionImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLiquidacionImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosLiquidacionImpor.getSelectedRows();
			
			LiquidacionImpor liquidacionimporLocal=new LiquidacionImpor();
			
			//this.seleccionarTodosLiquidacionImpor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLocal =(LiquidacionImpor) this.liquidacionimporLogic.getLiquidacionImpors().toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					liquidacionimporLocal =(LiquidacionImpor) this.liquidacionimpors.toArray()[this.jTableDatosLiquidacionImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				liquidacionimporLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
						liquidacionimporAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LiquidacionImpor liquidacionimporAux:liquidacionimpors) {
						liquidacionimporAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaLiquidacionImpor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLiquidacionImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLiquidacionImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualLiquidacionImporItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarLiquidacionImporParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralLiquidacionImporActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingLiquidacionImpor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralLiquidacionImpor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LiquidacionImpor liquidacionimporAux:this.liquidacionimporLogic.getLiquidacionImpors()) {
				
						if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							liquidacionimporAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							liquidacionimporAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							liquidacionimporAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							liquidacionimporAux.setfecha_liquidacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							liquidacionimporAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							liquidacionimporAux.settipo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LiquidacionImpor liquidacionimporAux:liquidacionimpors) {
					
						if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							liquidacionimporAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							liquidacionimporAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							liquidacionimporAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							liquidacionimporAux.setfecha_liquidacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							liquidacionimporAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							liquidacionimporAux.settipo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaLiquidacionImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesLiquidacionImporActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingLiquidacionImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioLiquidacionImpor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesLiquidacionImpor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteLiquidacionImpor) {				
					conSplash=true;//false;										
					
					//this.startProcessLiquidacionImpor(conSplash);
				
					this.generarReporteLiquidacionImporsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoLiquidacionImporsSeleccionados();
				//this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLiquidacionImporsSeleccionados(false);
				//this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLiquidacionImporsSeleccionados(true);
				//this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLiquidacionImpor();
				
				this.exportarLiquidacionImporsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionLiquidacionImpors();
				//this.importarLiquidacionImpors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLiquidacionImpor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelLiquidacionImporsSeleccionados();
				//this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Liquidacion Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessLiquidacionImpor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoLiquidacionImpor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyLiquidacionImpor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.setSelectedIndex(0);					
				}	
			} 			
			else if(LiquidacionImporBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteLiquidacionImpor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessLiquidacionImpor(conSplash);
					
						//this.actualizarParametrosGeneralLiquidacionImpor();
						
						this.generarReporteProcesoAccionLiquidacionImporsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(LiquidacionImporBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Liquidacion ImporES SELECCIONADOS?", "MANTENIMIENTO DE Liquidacion Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessLiquidacionImpor();
				
						this.actualizarParametrosGeneralLiquidacionImpor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.liquidacionimporReturnGeneral=liquidacionimporLogic.procesarAccionLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.liquidacionimporLogic.getLiquidacionImpors(),this.liquidacionimporParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarLiquidacionImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralLiquidacionImpor();
					
					LiquidacionImporBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarLiquidacionImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLiquidacionImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxTiposAccionesFormularioLiquidacionImpor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessLiquidacionImpor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesLiquidacionImporActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessLiquidacionImpor();
			
			if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		
			LiquidacionImpor liquidacionimpor=new LiquidacionImpor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingLiquidacionImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesLiquidacionImpor.getSelectedItem();
			
			
			
			
			liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
			//this.sTipoAccion;
			
			if(liquidacionimporsSeleccionados.size()==1) {
				for(LiquidacionImpor liquidacionimporAux:liquidacionimporsSeleccionados) {
					liquidacionimpor=liquidacionimporAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Liquidacion Impor")) {
					jButtonDetalleLiquidacionImporActionPerformed(null,rowIndex,true,false,liquidacionimpor);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessLiquidacionImpor();
			
      		//this.finishProcessLiquidacionImpor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarLiquidacionImporReturnGeneral() throws Exception {
		if(this.liquidacionimporReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.liquidacionimporReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.liquidacionimporReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.liquidacionimporReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.liquidacionimporReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.liquidacionimporReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingLiquidacionImpor(false);
		}
		
		if(this.liquidacionimporReturnGeneral.getConRetornoLista() || this.liquidacionimporReturnGeneral.getConRetornoObjeto()) {
			if(this.liquidacionimporReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.liquidacionimporLogic.setLiquidacionImpors(this.liquidacionimporReturnGeneral.getLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.liquidacionimporReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.liquidacionimporLogic.setLiquidacionImpor(this.liquidacionimporReturnGeneral.getLiquidacionImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingLiquidacionImpor(false);
		}
	}
	
	public void actualizarParametrosGeneralLiquidacionImpor() throws Exception {
		
		
	}
	
	public ArrayList<LiquidacionImpor> getLiquidacionImporsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioLiquidacionImpor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(LiquidacionImpor liquidacionimporAux:liquidacionimporLogic.getLiquidacionImpors()) {
					if(liquidacionimporAux.getIsSelected()) {
						liquidacionimporsSeleccionados.add(liquidacionimporAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LiquidacionImpor liquidacionimporAux:this.liquidacionimpors) {
					if(liquidacionimporAux.getIsSelected()) {
						liquidacionimporsSeleccionados.add(liquidacionimporAux);				
					}
				}
			}
			
			if(liquidacionimporsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						liquidacionimporsSeleccionados.addAll(this.liquidacionimporLogic.getLiquidacionImpors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						liquidacionimporsSeleccionados.addAll(this.liquidacionimpors);				
					}
				}
			}
		} else {
			liquidacionimporsSeleccionados.add(this.liquidacionimpor);
		}
		
		return liquidacionimporsSeleccionados;
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
	
	public void generarReporteLiquidacionImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalLiquidacionImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoLiquidacionImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLiquidacionImporsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLiquidacionImporsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesLiquidacionImporsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Liquidacion Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteLiquidacionImpors("Todos",liquidacionimporsSeleccionados);
		
	}	
	
	public void generarReporteNormalLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteLiquidacionImpors("Todos",liquidacionimporsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionLiquidacionImporsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteLiquidacionImpors("Todos",liquidacionimporsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoLiquidacionImpor();
		
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoLiquidacionImpor();
		
		
		//this.generarReporteLiquidacionImpors("Todos",liquidacionimporsSeleccionados ,liquidacionimporImplementable,liquidacionimporImplementableHome);
	}
	
	public void mostrarImportacionLiquidacionImpors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionLiquidacionImpor();
		
		this.abrirFrameImportacionLiquidacionImpor();		
		
			
		//this.generarReporteLiquidacionImpors("Todos",liquidacionimporsSeleccionados ,liquidacionimporImplementable,liquidacionimporImplementableHome);
	}
	
	public void importarLiquidacionImpors() throws Exception {		
	
	}
	
	public void exportarLiquidacionImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelLiquidacionImporsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoLiquidacionImporsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlLiquidacionImporsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Liquidacion Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarLiquidacionImpor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(LiquidacionImpor liquidacionimporAux:liquidacionimporsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarLiquidacionImpor(liquidacionimporAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//liquidacionimporAux.setsDetalleGeneralEntityReporte(liquidacionimporAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarLiquidacionImpor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_IDPUERTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImporConstantesFunciones.LABEL_TIPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarLiquidacionImpor(LiquidacionImpor liquidacionimpor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=liquidacionimpor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getpuerto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getfecha_liquidacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpor.gettipo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("LiquidacionImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelLiquidacionImpor(row);				
				iRow++;
			}				
			
			for(LiquidacionImpor liquidacionimporAux:liquidacionimporsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelLiquidacionImpor(liquidacionimporAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();		
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("liquidacionimpors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("liquidacionimpor");
			//elementRoot.appendChild(element);
		
			for(LiquidacionImpor liquidacionimporAux:liquidacionimporsSeleccionados) {
				element = document.createElement("liquidacionimpor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlLiquidacionImpor(liquidacionimporAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelLiquidacionImpor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_IDPUERTO);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImporConstantesFunciones.LABEL_TIPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelLiquidacionImpor(LiquidacionImpor liquidacionimpor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getpuerto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getfecha_liquidacion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpor.gettipo());				
	}
	
	public void setFilaDatosExportarXmlLiquidacionImpor(LiquidacionImpor liquidacionimpor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(LiquidacionImporConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(liquidacionimpor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(LiquidacionImporConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(liquidacionimpor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(LiquidacionImporConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(liquidacionimpor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(LiquidacionImporConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(liquidacionimpor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(LiquidacionImporConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(liquidacionimpor.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(LiquidacionImporConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(liquidacionimpor.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementpais_descripcion = document.createElement(LiquidacionImporConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(liquidacionimpor.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementpuerto_descripcion = document.createElement(LiquidacionImporConstantesFunciones.IDPUERTO);
		elementpuerto_descripcion.appendChild(document.createTextNode(liquidacionimpor.getpuerto_descripcion()));
		element.appendChild(elementpuerto_descripcion);

		Element elementnombre = document.createElement(LiquidacionImporConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(liquidacionimpor.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(LiquidacionImporConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(liquidacionimpor.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementfecha = document.createElement(LiquidacionImporConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(liquidacionimpor.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementfecha_liquidacion = document.createElement(LiquidacionImporConstantesFunciones.FECHALIQUIDACION);
		elementfecha_liquidacion.appendChild(document.createTextNode(liquidacionimpor.getfecha_liquidacion().toString().trim()));
		element.appendChild(elementfecha_liquidacion);

		Element elementflete = document.createElement(LiquidacionImporConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(liquidacionimpor.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementtipo = document.createElement(LiquidacionImporConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(liquidacionimpor.gettipo().trim()));
		element.appendChild(elementtipo);
	}
	
	public void generarReporteGroupGenericoLiquidacionImporsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados=new ArrayList<LiquidacionImpor>();
		
		liquidacionimporsSeleccionados=this.getLiquidacionImporsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoLiquidacionImpor(liquidacionimporsSeleccionados);
		
		this.generarReporteLiquidacionImpors("Todos",liquidacionimporsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoLiquidacionImpor(ArrayList<LiquidacionImpor> liquidacionimporsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(LiquidacionImpor liquidacionimporAux:liquidacionimporsSeleccionados) {
				liquidacionimporAux.setsDetalleGeneralEntityReporte(liquidacionimporAux.toString());
			
				if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_IDPUERTO)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.getpuerto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(liquidacionimporAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(liquidacionimporAux.getfecha_liquidacion()));
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImporConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					liquidacionimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimporAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesLiquidacionImpor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoLiquidacionImpor=true;
				this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=true;
				this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=true;
			}
			
			this.isVisibilidadCeldaModificarLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpor=true;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpor=true;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=true;
			this.isVisibilidadCeldaCancelarLiquidacionImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpor=true;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoLiquidacionImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=true;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=true;
			this.isVisibilidadCeldaModificarLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpor=true;
			this.isVisibilidadCeldaActualizarLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoLiquidacionImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=true;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=true;
		} else {
			this.actualizarEstadoPanelsLiquidacionImpor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarLiquidacionImpor=false;
			//this.isVisibilidadCeldaVerFormLiquidacionImpor=false;
			this.isVisibilidadCeldaDuplicarLiquidacionImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!liquidacionimporSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
		} else {
			this.isVisibilidadCeldaNuevoLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			if(!liquidacionimporSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;												
			}
			
			this.jButtonCerrarLiquidacionImpor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpor=false;
		}
		
		if(!this.permiteMantenimiento(this.liquidacionimpor)) {
			this.isVisibilidadCeldaActualizarLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesLiquidacionImpor() {
		this.isVisibilidadCeldaNuevoLiquidacionImpor=false;
		this.isVisibilidadCeldaGuardarCambiosLiquidacionImpor=false;
	}
	
	public void actualizarEstadoPanelsLiquidacionImpor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionLiquidacionImpor!=null) {
				this.jPanelPaginacionLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosLiquidacionImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionLiquidacionImpor!=null) {
				this.jPanelPaginacionLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionLiquidacionImpor!=null) {
				this.jPanelPaginacionLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionLiquidacionImpor!=null) {
				this.jPanelPaginacionLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionLiquidacionImpor!=null) {
				this.jPanelPaginacionLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionLiquidacionImpor!=null) {
				this.jPanelPaginacionLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionLiquidacionImpor!=null) {
				this.jPanelPaginacionLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
					this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCentroCostoLiquidacionImpor);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCuentaContableLiquidacionImpor);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPaisLiquidacionImpor);}

			this.isVisibilidadFK_IdPuerto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPuertoLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCentroCosto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCentroCostoLiquidacionImpor);}

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCuentaContableLiquidacionImpor);}

			this.isVisibilidadFK_IdPais=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPaisLiquidacionImpor);}

			this.isVisibilidadFK_IdPuerto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPuertoLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCentroCostoLiquidacionImpor);}

			this.isVisibilidadFK_IdCuentaContable=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCuentaContableLiquidacionImpor);}

			this.isVisibilidadFK_IdPais=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPaisLiquidacionImpor);}

			this.isVisibilidadFK_IdPuerto=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPuertoLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCentroCosto=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCentroCostoLiquidacionImpor);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCuentaContableLiquidacionImpor);}

			this.isVisibilidadFK_IdPais=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPaisLiquidacionImpor);}

			this.isVisibilidadFK_IdPuerto=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPuertoLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCentroCosto=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCentroCostoLiquidacionImpor);}

			this.isVisibilidadFK_IdCuentaContable=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCuentaContableLiquidacionImpor);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPaisLiquidacionImpor);}

			this.isVisibilidadFK_IdPuerto=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPuertoLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaPuerto(Boolean isParaPuerto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPuertoNegation=!isParaPuerto;

			this.isVisibilidadFK_IdCentroCosto=isParaPuertoNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCentroCostoLiquidacionImpor);}

			this.isVisibilidadFK_IdCuentaContable=isParaPuertoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdCuentaContableLiquidacionImpor);}

			this.isVisibilidadFK_IdPais=isParaPuertoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPaisLiquidacionImpor);}

			this.isVisibilidadFK_IdPuerto=isParaPuerto;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasLiquidacionImpor.remove(jPanelFK_IdPuertoLiquidacionImpor);}
		}
		
	}
	
	

	public String registrarSesionLiquidacionImporParaDetalleLiquidacionImpores() throws Exception {
		Boolean isPaginaPopupDetalleLiquidacionImpor=false;

		try {

			if(this.liquidacionimporSessionBean==null) {
				this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean==null) {
				this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean.setsPathNavegacionActual(liquidacionimporSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleLiquidacionImpor=this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor(true);
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor(LiquidacionImporConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean.setisBusquedaDesdeForeignKeySesionLiquidacionImpor(true);
			this.jInternalFrameDetalleFormLiquidacionImpor.detalleliquidacionimporSessionBean.setlidLiquidacionImporActual(this.idLiquidacionImporActual);

			liquidacionimporSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLiquidacionImpor(true);
			liquidacionimporSessionBean.setlIdLiquidacionImporActualForeignKey(this.idLiquidacionImporActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//LiquidacionImporSessionBean liquidacionimporSessionBean=new LiquidacionImporSessionBean();
		
		if(this.liquidacionimporSessionBean==null) {
			this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
		}
		
		this.liquidacionimporSessionBean.setsUltimaBusquedaLiquidacionImpor(this.getsAccionBusqueda());
		this.liquidacionimporSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.liquidacionimporSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			liquidacionimporSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			liquidacionimporSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			liquidacionimporSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			liquidacionimporSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPuerto")) {
			liquidacionimporSessionBean.setid_puerto(this.getid_puertoFK_IdPuerto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			liquidacionimporSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//LiquidacionImporSessionBean liquidacionimporSessionBean=new LiquidacionImporSessionBean();
		
		if(this.liquidacionimporSessionBean==null) {
			this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
		}
		
		if(this.liquidacionimporSessionBean.getsUltimaBusquedaLiquidacionImpor()!=null&&!this.liquidacionimporSessionBean.getsUltimaBusquedaLiquidacionImpor().equals("")) {
			this.setsAccionBusqueda(liquidacionimporSessionBean.getsUltimaBusquedaLiquidacionImpor());
			this.setiNumeroPaginacion(liquidacionimporSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(liquidacionimporSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(liquidacionimporSessionBean.getid_centro_costo());
				liquidacionimporSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(liquidacionimporSessionBean.getid_cuenta_contable());
				liquidacionimporSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(liquidacionimporSessionBean.getid_empresa());
				liquidacionimporSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(liquidacionimporSessionBean.getid_pais());
				liquidacionimporSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPuerto")) {
				this.setid_puertoFK_IdPuerto(liquidacionimporSessionBean.getid_puerto());
				liquidacionimporSessionBean.setid_puerto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(liquidacionimporSessionBean.getid_sucursal());
				liquidacionimporSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.liquidacionimporSessionBean.setsUltimaBusquedaLiquidacionImpor("");
		this.liquidacionimporSessionBean.setiNumeroPaginacion(LiquidacionImporConstantesFunciones.INUMEROPAGINACION);
		this.liquidacionimporSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaLiquidacionImpor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioLiquidacionImpor() {
		this.updateBorderResaltarBusquedasFormularioLiquidacionImpor();
		this.updateVisibilidadBusquedasFormularioLiquidacionImpor();
		this.updateHabilitarBusquedasFormularioLiquidacionImpor();
	}
	
	public void updateBorderResaltarBusquedasFormularioLiquidacionImpor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasLiquidacionImpor.getComponents().length>0) {
	

		if(this.liquidacionimporConstantesFunciones.resaltarFK_IdCentroCostoLiquidacionImpor!=null) {
			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCentroCostoLiquidacionImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
				jPanel.setBorder(this.liquidacionimporConstantesFunciones.resaltarFK_IdCentroCostoLiquidacionImpor);
			}
		}

		if(this.liquidacionimporConstantesFunciones.resaltarFK_IdCuentaContableLiquidacionImpor!=null) {
			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCuentaContableLiquidacionImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
				jPanel.setBorder(this.liquidacionimporConstantesFunciones.resaltarFK_IdCuentaContableLiquidacionImpor);
			}
		}

		if(this.liquidacionimporConstantesFunciones.resaltarFK_IdPaisLiquidacionImpor!=null) {
			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdPaisLiquidacionImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
				jPanel.setBorder(this.liquidacionimporConstantesFunciones.resaltarFK_IdPaisLiquidacionImpor);
			}
		}

		if(this.liquidacionimporConstantesFunciones.resaltarFK_IdPuertoLiquidacionImpor!=null) {
			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdPuertoLiquidacionImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
				jPanel.setBorder(this.liquidacionimporConstantesFunciones.resaltarFK_IdPuertoLiquidacionImpor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioLiquidacionImpor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasLiquidacionImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCentroCostoLiquidacionImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.liquidacionimporConstantesFunciones.mostrarFK_IdCentroCostoLiquidacionImpor);
			if(!this.liquidacionimporConstantesFunciones.mostrarFK_IdCentroCostoLiquidacionImpor && index>-1) {
				this.jTabbedPaneBusquedasLiquidacionImpor.remove(index);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCuentaContableLiquidacionImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.liquidacionimporConstantesFunciones.mostrarFK_IdCuentaContableLiquidacionImpor);
			if(!this.liquidacionimporConstantesFunciones.mostrarFK_IdCuentaContableLiquidacionImpor && index>-1) {
				this.jTabbedPaneBusquedasLiquidacionImpor.remove(index);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdPaisLiquidacionImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.liquidacionimporConstantesFunciones.mostrarFK_IdPaisLiquidacionImpor);
			if(!this.liquidacionimporConstantesFunciones.mostrarFK_IdPaisLiquidacionImpor && index>-1) {
				this.jTabbedPaneBusquedasLiquidacionImpor.remove(index);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdPuertoLiquidacionImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.liquidacionimporConstantesFunciones.mostrarFK_IdPuertoLiquidacionImpor);
			if(!this.liquidacionimporConstantesFunciones.mostrarFK_IdPuertoLiquidacionImpor && index>-1) {
				this.jTabbedPaneBusquedasLiquidacionImpor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioLiquidacionImpor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasLiquidacionImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCentroCostoLiquidacionImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.liquidacionimporConstantesFunciones.activarFK_IdCentroCostoLiquidacionImpor);
				this.jTabbedPaneBusquedasLiquidacionImpor.setEnabledAt(index,this.liquidacionimporConstantesFunciones.activarFK_IdCentroCostoLiquidacionImpor);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCuentaContableLiquidacionImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.liquidacionimporConstantesFunciones.activarFK_IdCuentaContableLiquidacionImpor);
				this.jTabbedPaneBusquedasLiquidacionImpor.setEnabledAt(index,this.liquidacionimporConstantesFunciones.activarFK_IdCuentaContableLiquidacionImpor);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdPaisLiquidacionImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.liquidacionimporConstantesFunciones.activarFK_IdPaisLiquidacionImpor);
				this.jTabbedPaneBusquedasLiquidacionImpor.setEnabledAt(index,this.liquidacionimporConstantesFunciones.activarFK_IdPaisLiquidacionImpor);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdPuertoLiquidacionImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.liquidacionimporConstantesFunciones.activarFK_IdPuertoLiquidacionImpor);
				this.jTabbedPaneBusquedasLiquidacionImpor.setEnabledAt(index,this.liquidacionimporConstantesFunciones.activarFK_IdPuertoLiquidacionImpor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaLiquidacionImpor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCentroCostoLiquidacionImpor);

			this.jTabbedPaneBusquedasLiquidacionImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);

			this.liquidacionimporConstantesFunciones.setResaltarFK_IdCentroCostoLiquidacionImpor(resaltar);

			jPanel.setBorder(this.liquidacionimporConstantesFunciones.resaltarFK_IdCentroCostoLiquidacionImpor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCuentaContableLiquidacionImpor);

			this.jTabbedPaneBusquedasLiquidacionImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);

			this.liquidacionimporConstantesFunciones.setResaltarFK_IdCuentaContableLiquidacionImpor(resaltar);

			jPanel.setBorder(this.liquidacionimporConstantesFunciones.resaltarFK_IdCuentaContableLiquidacionImpor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdPaisLiquidacionImpor);

			this.jTabbedPaneBusquedasLiquidacionImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);

			this.liquidacionimporConstantesFunciones.setResaltarFK_IdPaisLiquidacionImpor(resaltar);

			jPanel.setBorder(this.liquidacionimporConstantesFunciones.resaltarFK_IdPaisLiquidacionImpor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPuerto")) {
			index= this.jTabbedPaneBusquedasLiquidacionImpor.indexOfComponent(this.jPanelFK_IdPuertoLiquidacionImpor);

			this.jTabbedPaneBusquedasLiquidacionImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpor.getComponent(index);

			this.liquidacionimporConstantesFunciones.setResaltarFK_IdPuertoLiquidacionImpor(resaltar);

			jPanel.setBorder(this.liquidacionimporConstantesFunciones.resaltarFK_IdPuertoLiquidacionImpor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarLiquidacionImpor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioLiquidacionImpor() throws Exception {

		if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioLiquidacionImpor();
		this.updateVisibilidadResaltarControlesFormularioLiquidacionImpor();
		this.updateHabilitarResaltarControlesFormularioLiquidacionImpor();
		
	}
	
	public void updateBorderResaltarControlesFormularioLiquidacionImpor() throws Exception {
		if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.liquidacionimporConstantesFunciones.resaltaridLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltaridLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarid_empresaLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarid_empresaLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarid_sucursalLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarid_sucursalLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarid_centro_costoLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarid_centro_costoLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarid_cuenta_contableLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarid_cuenta_contableLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarid_paisLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarid_paisLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarid_puertoLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarid_puertoLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarnombreLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreanombreLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarnombreLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltardescripcionLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreadescripcionLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltardescripcionLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarfechaLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfechaLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarfechaLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarfecha_liquidacionLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfecha_liquidacionLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarfecha_liquidacionLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltarfleteLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldfleteLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltarfleteLiquidacionImpor);}
		if(this.liquidacionimporConstantesFunciones.resaltartipoLiquidacionImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldtipoLiquidacionImpor.setBorder(this.liquidacionimporConstantesFunciones.resaltartipoLiquidacionImpor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioLiquidacionImpor() throws Exception {		
		if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
	
		//this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostraridLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelidLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostraridLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_empresaLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelid_empresaLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_empresaLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_sucursalLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelid_sucursalLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_sucursalLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_centro_costoLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelid_centro_costoLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_centro_costoLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_cuenta_contableLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelid_cuenta_contableLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_cuenta_contableLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_paisLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelid_paisLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_paisLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_puertoLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelid_puertoLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarid_puertoLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreanombreLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarnombreLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelnombreLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarnombreLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreadescripcionLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrardescripcionLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPaneldescripcionLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrardescripcionLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfechaLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarfechaLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelfechaLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarfechaLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfecha_liquidacionLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarfecha_liquidacionLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelfecha_liquidacionLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarfecha_liquidacionLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldfleteLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarfleteLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPanelfleteLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrarfleteLiquidacionImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldtipoLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrartipoLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jPaneltipoLiquidacionImpor.setVisible(this.liquidacionimporConstantesFunciones.mostrartipoLiquidacionImpor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioLiquidacionImpor() throws Exception {
		if(this.jInternalFrameDetalleFormLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLiquidacionImpor!=null) {
	
		this.jInternalFrameDetalleFormLiquidacionImpor.jLabelidLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activaridLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_empresaLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarid_empresaLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_sucursalLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarid_sucursalLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_centro_costoLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarid_centro_costoLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_cuenta_contableLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarid_cuenta_contableLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_paisLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarid_paisLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jComboBoxid_puertoLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarid_puertoLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreanombreLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarnombreLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jTextAreadescripcionLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activardescripcionLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfechaLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarfechaLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jDateChooserfecha_liquidacionLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarfecha_liquidacionLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldfleteLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activarfleteLiquidacionImpor);
		this.jInternalFrameDetalleFormLiquidacionImpor.jTextFieldtipoLiquidacionImpor.setEnabled(this.liquidacionimporConstantesFunciones.activartipoLiquidacionImpor);
		}
	}
	
		
}