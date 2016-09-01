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

import com.bydan.erp.importaciones.util.CostoGastoImporConstantesFunciones;
import com.bydan.erp.importaciones.util.CostoGastoImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.CostoGastoImporParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.CostoGastoImporBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CostoGastoImporBeanSwingJInternalFrame extends CostoGastoImporJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CostoGastoImporBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CostoGastoImpor> costogastoimporValidator = new ClassValidator<CostoGastoImpor>(CostoGastoImpor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CostoGastoImpor costogastoimpor;	
	public CostoGastoImpor costogastoimporAux;
	public CostoGastoImpor costogastoimporAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CostoGastoImpor costogastoimporTotales;
	public Long idCostoGastoImporActual;
	public Long iIdNuevoCostoGastoImpor=0L;
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

	public String sFinalQueryComboTipoCostoGastoImpor="";

	public List<TipoCostoGastoImpor> tipocostogastoimporsForeignKey;

	public List<TipoCostoGastoImpor> gettipocostogastoimporsForeignKey() {
		return tipocostogastoimporsForeignKey;
	}

	public void settipocostogastoimporsForeignKey(List<TipoCostoGastoImpor> tipocostogastoimporsForeignKey) {
		this.tipocostogastoimporsForeignKey = tipocostogastoimporsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCostoGastoImpor tipocostogastoimporForeignKey;

	public TipoCostoGastoImpor gettipocostogastoimporForeignKey() {
		return tipocostogastoimporForeignKey;
	}

	public void settipocostogastoimporForeignKey(TipoCostoGastoImpor tipocostogastoimporForeignKey) {
		this.tipocostogastoimporForeignKey = tipocostogastoimporForeignKey;
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
	
	public Boolean isPermisoTodoCostoGastoImpor;
	public Boolean isPermisoNuevoCostoGastoImpor;
	public Boolean isPermisoActualizarCostoGastoImpor;
	public Boolean isPermisoActualizarOriginalCostoGastoImpor;
	public Boolean isPermisoEliminarCostoGastoImpor;
	public Boolean isPermisoGuardarCambiosCostoGastoImpor;
	public Boolean isPermisoConsultaCostoGastoImpor;
	public Boolean isPermisoBusquedaCostoGastoImpor;
	public Boolean isPermisoReporteCostoGastoImpor;
	public Boolean isPermisoPaginacionMedioCostoGastoImpor;
	public Boolean isPermisoPaginacionAltoCostoGastoImpor;
	public Boolean isPermisoPaginacionTodoCostoGastoImpor;
	public Boolean isPermisoCopiarCostoGastoImpor;
	public Boolean isPermisoVerFormCostoGastoImpor;
	public Boolean isPermisoDuplicarCostoGastoImpor;
	public Boolean isPermisoOrdenCostoGastoImpor;
	
	
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
	
	public CostoGastoImporParameterReturnGeneral costogastoimporReturnGeneral;
	public CostoGastoImporParameterReturnGeneral costogastoimporParameterGeneral;
	
	

	public DetalleLiquidacionImporLogic detalleliquidacionimporLogic=null;

	public DetalleLiquidacionImporLogic getDetalleLiquidacionImporLogic() {
		return detalleliquidacionimporLogic;
	}

	public void setDetalleLiquidacionImporLogic(DetalleLiquidacionImporLogic detalleliquidacionimporLogic) {
		this.detalleliquidacionimporLogic = detalleliquidacionimporLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCostoGastoImpor=false;
	public Boolean esParaAccionDesdeFormularioCostoGastoImpor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CostoGastoImporSessionBeanAdditional costogastoimporSessionBeanAdditional=null;
	
	public CostoGastoImporSessionBeanAdditional getCostoGastoImporSessionBeanAdditional() {
		return this.costogastoimporSessionBeanAdditional;
	}
	
	public void setCostoGastoImporSessionBeanAdditional(CostoGastoImporSessionBeanAdditional costogastoimporSessionBeanAdditional) {
		try {
			this.costogastoimporSessionBeanAdditional=costogastoimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CostoGastoImporBeanSwingJInternalFrameAdditional costogastoimporBeanSwingJInternalFrameAdditional=null;
	//public class CostoGastoImporBeanSwingJInternalFrame
	
	public CostoGastoImporBeanSwingJInternalFrameAdditional getCostoGastoImporBeanSwingJInternalFrameAdditional() {
		return this.costogastoimporBeanSwingJInternalFrameAdditional;
	}
	
	public void setCostoGastoImporBeanSwingJInternalFrameAdditional(CostoGastoImporBeanSwingJInternalFrameAdditional costogastoimporBeanSwingJInternalFrameAdditional) {
		try {
			this.costogastoimporBeanSwingJInternalFrameAdditional=costogastoimporBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CostoGastoImporLogic costogastoimporLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CostoGastoImpor costogastoimporBean;
	public CostoGastoImporConstantesFunciones costogastoimporConstantesFunciones;
	//public CostoGastoImporParameterReturnGeneral costogastoimporReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoCostoGastoImporLogic tipocostogastoimporLogic;
	
	//PARAMETROS
	
	
	//public List<CostoGastoImpor> costogastoimpors;	
	//public List<CostoGastoImpor> costogastoimporsEliminados;
	//public List<CostoGastoImpor> costogastoimporsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaDuplicarCostoGastoImpor=true;
	public Boolean isVisibilidadCeldaCopiarCostoGastoImpor=true;
	public Boolean isVisibilidadCeldaVerFormCostoGastoImpor=true;
	public Boolean isVisibilidadCeldaOrdenCostoGastoImpor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaModificarCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaActualizarCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaEliminarCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaCancelarCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaGuardarCostoGastoImpor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoCostoGastoImpor=false;
	
	public Long getiIdNuevoCostoGastoImpor() {
		return this.iIdNuevoCostoGastoImpor;
	}

	public void setiIdNuevoCostoGastoImpor(Long iIdNuevoCostoGastoImpor) {
		this.iIdNuevoCostoGastoImpor = iIdNuevoCostoGastoImpor;
	}
	
	public Long getidCostoGastoImporActual() {
		return this.idCostoGastoImporActual;
	}

	public void setidCostoGastoImporActual(Long idCostoGastoImporActual) {
		this.idCostoGastoImporActual = idCostoGastoImporActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CostoGastoImpor getcostogastoimpor() {
		return this.costogastoimpor;
	}

	public void setcostogastoimpor(CostoGastoImpor costogastoimpor) {
		this.costogastoimpor = costogastoimpor;
	}
	
	public CostoGastoImpor getcostogastoimporAux() {
		return this.costogastoimporAux;
	}

	public void setcostogastoimporAux(CostoGastoImpor costogastoimporAux) {
		this.costogastoimporAux = costogastoimporAux;
	}				
	
	public CostoGastoImpor getcostogastoimporAnterior() {
		return this.costogastoimporAnterior;
	}

	public void setcostogastoimporAnterior(CostoGastoImpor costogastoimporAnterior) {
		this.costogastoimporAnterior = costogastoimporAnterior;
	}	
	
	public CostoGastoImpor getcostogastoimporTotales() {
		return this.costogastoimporTotales;
	}

	public void setcostogastoimporTotales(CostoGastoImpor costogastoimporTotales) {
		this.costogastoimporTotales = costogastoimporTotales;
	}	
	
	public CostoGastoImpor getcostogastoimporBean() {
		return this.costogastoimporBean;
	}

	public void setcostogastoimporBean(CostoGastoImpor costogastoimporBean) {
		this.costogastoimporBean = costogastoimporBean;
	}	
	
	public CostoGastoImporParameterReturnGeneral getcostogastoimporReturnGeneral() {
		return this.costogastoimporReturnGeneral;
	}

	public void setcostogastoimporReturnGeneral(CostoGastoImporParameterReturnGeneral costogastoimporReturnGeneral) {
		this.costogastoimporReturnGeneral = costogastoimporReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor=-1L;

	public Long getid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor() {
		return this.id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor;
	}

	public void setid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor(Long id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor) {
		this.id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor = id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CostoGastoImporLogic getCostoGastoImporLogic()	{		
		return costogastoimporLogic;
	}

	public void setCostoGastoImporLogic(CostoGastoImporLogic costogastoimporLogic) {
		this.costogastoimporLogic = costogastoimporLogic;
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
	
	public Boolean getIsEsNuevoCostoGastoImpor() {
		return isEsNuevoCostoGastoImpor;
	}

	public void setIsEsNuevoCostoGastoImpor(Boolean isEsNuevoCostoGastoImpor) {
		this.isEsNuevoCostoGastoImpor = isEsNuevoCostoGastoImpor;
	}

	public Boolean getEsParaAccionDesdeFormularioCostoGastoImpor() {
		return esParaAccionDesdeFormularioCostoGastoImpor;
	}
	
	public void setEsParaAccionDesdeFormularioCostoGastoImpor(Boolean esParaAccionDesdeFormularioCostoGastoImpor) {
		this.esParaAccionDesdeFormularioCostoGastoImpor = esParaAccionDesdeFormularioCostoGastoImpor;
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

			if(this.costogastoimporSessionBean==null) {
				this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
			}

			if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(costogastoimporSessionBean.getlidEmpresaActual());
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

			if(this.costogastoimporSessionBean==null) {
				this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
			}

			if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(costogastoimporSessionBean.getlidSucursalActual());
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

	public void cargarCombosTipoCostoGastoImporsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocostogastoimporsForeignKey=new ArrayList<TipoCostoGastoImpor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCostoGastoImporLogic tipocostogastoimporLogic=new TipoCostoGastoImporLogic();

			//tipocostogastoimporLogic.getTipoCostoGastoImporDataAccess().setIsForForeingKeyData(true);

			if(this.costogastoimporSessionBean==null) {
				this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
			}

			if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionTipoCostoGastoImpor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocostogastoimporLogic.getTipoCostoGastoImporDataAccess().setIsForForeingKeyData(true);

					tipocostogastoimporLogic.getTodosTipoCostoGastoImporsWithConnection(sFinalQuery,new Pagination());

					this.tipocostogastoimporsForeignKey=tipocostogastoimporLogic.getTipoCostoGastoImpors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCostoGastoImpor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocostogastoimporLogic.getEntityWithConnection(costogastoimporSessionBean.getlidTipoCostoGastoImporActual());
					this.tipocostogastoimporsForeignKey.add(tipocostogastoimporLogic.getTipoCostoGastoImpor());
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

					if(this.costogastoimpor!=null) {
						this.costogastoimpor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
						this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCostoGastoImpor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
						if(this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCostoGastoImporGenerico)throws Exception
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
				jComboBoxid_empresaCostoGastoImporGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCostoGastoImporGenerico!=null && jComboBoxid_empresaCostoGastoImporGenerico.getItemCount()>0) {
					jComboBoxid_empresaCostoGastoImporGenerico.setSelectedIndex(0);
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

					if(this.costogastoimpor!=null) {
						this.costogastoimpor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
						this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCostoGastoImpor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
						if(this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCostoGastoImporGenerico)throws Exception
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
				jComboBoxid_sucursalCostoGastoImporGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCostoGastoImporGenerico!=null && jComboBoxid_sucursalCostoGastoImporGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCostoGastoImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCostoGastoImporForeignKey(Long idTipoCostoGastoImporSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCostoGastoImpor  tipocostogastoimporTemp=null;

			for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsForeignKey) {
				if(tipocostogastoimporAux.getId()!=null && tipocostogastoimporAux.getId().equals(idTipoCostoGastoImporSeleccionado)) {
					tipocostogastoimporTemp=tipocostogastoimporAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocostogastoimporTemp!=null) {

					if(this.costogastoimpor!=null) {
						this.costogastoimpor.setTipoCostoGastoImpor(tipocostogastoimporTemp);
					}

					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
						this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setSelectedItem(tipocostogastoimporTemp);
					}
				} else {
					//jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setSelectedItem(tipocostogastoimporTemp);
					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
						if(this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCostoGastoImpor") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocostogastoimporTemp!=null && jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor!=null) {
						jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setSelectedItem(tipocostogastoimporTemp);
					} else {
						if(jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor!=null) {
							//jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setSelectedItem(tipocostogastoimporTemp);
							if(jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.getItemCount()>0) {
								jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setSelectedIndex(0);
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

	public String getActualTipoCostoGastoImporForeignKeyDescripcion(Long idTipoCostoGastoImporSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCostoGastoImpor  tipocostogastoimporTemp=null;

			for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsForeignKey) {
				if(tipocostogastoimporAux.getId()!=null && tipocostogastoimporAux.getId().equals(idTipoCostoGastoImporSeleccionado)) {
					tipocostogastoimporTemp=tipocostogastoimporAux;
					break;
				}
			}


			sDescripcion=TipoCostoGastoImporConstantesFunciones.getTipoCostoGastoImporDescripcion(tipocostogastoimporTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCostoGastoImporForeignKeyGenerico(Long idTipoCostoGastoImporSeleccionado,JComboBox jComboBoxid_tipo_costo_gasto_imporCostoGastoImporGenerico)throws Exception
	{
		try
		{
			TipoCostoGastoImpor  tipocostogastoimporTemp=null;

			for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsForeignKey) {
				if(tipocostogastoimporAux.getId()!=null && tipocostogastoimporAux.getId().equals(idTipoCostoGastoImporSeleccionado)) {
					tipocostogastoimporTemp=tipocostogastoimporAux;
					break;
				}
			}

			if(tipocostogastoimporTemp!=null) {
				jComboBoxid_tipo_costo_gasto_imporCostoGastoImporGenerico.setSelectedItem(tipocostogastoimporTemp);
			} else {
				if(jComboBoxid_tipo_costo_gasto_imporCostoGastoImporGenerico!=null && jComboBoxid_tipo_costo_gasto_imporCostoGastoImporGenerico.getItemCount()>0) {
					jComboBoxid_tipo_costo_gasto_imporCostoGastoImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CostoGastoImpor costogastoimpor,JComboBox jComboBoxid_empresaCostoGastoImporGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCostoGastoImporGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCostoGastoImporGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				costogastoimpor.setid_empresa(empresaAux.getId());
				costogastoimpor.setempresa_descripcion(CostoGastoImporConstantesFunciones.getEmpresaDescripcion(empresaAux));
				costogastoimpor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CostoGastoImpor costogastoimpor,JComboBox jComboBoxid_sucursalCostoGastoImporGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCostoGastoImporGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCostoGastoImporGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				costogastoimpor.setid_sucursal(sucursalAux.getId());
				costogastoimpor.setsucursal_descripcion(CostoGastoImporConstantesFunciones.getSucursalDescripcion(sucursalAux));
				costogastoimpor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCostoGastoImporForeignKey(CostoGastoImpor costogastoimpor,JComboBox jComboBoxid_tipo_costo_gasto_imporCostoGastoImporGenerico)throws Exception
	{
		try
		{
			TipoCostoGastoImpor  tipocostogastoimporAux=new TipoCostoGastoImpor();

			if(jComboBoxid_tipo_costo_gasto_imporCostoGastoImporGenerico==null) {
				tipocostogastoimporAux=(TipoCostoGastoImpor)this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getSelectedItem();
			} else {
				tipocostogastoimporAux=(TipoCostoGastoImpor)jComboBoxid_tipo_costo_gasto_imporCostoGastoImporGenerico.getSelectedItem();
			}

			if(tipocostogastoimporAux!=null && tipocostogastoimporAux.getId()!=null) {
				costogastoimpor.setid_tipo_costo_gasto_impor(tipocostogastoimporAux.getId());
				costogastoimpor.settipocostogastoimpor_descripcion(CostoGastoImporConstantesFunciones.getTipoCostoGastoImporDescripcion(tipocostogastoimporAux));
				costogastoimpor.setTipoCostoGastoImpor(tipocostogastoimporAux);			}
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

					if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { 
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { 
					}

					if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { 
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { 
					}

					if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCostoGastoImporsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCostoGastoImpor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { 
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.removeAllItems();

							for(TipoCostoGastoImpor tipocostogastoimpor:this.tipocostogastoimporsForeignKey) {
								this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.addItem(tipocostogastoimpor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { 
					}

					if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCostoGastoImpor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.removeAllItems();

							for(TipoCostoGastoImpor tipocostogastoimpor:this.tipocostogastoimporsForeignKey) {
								this.jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.addItem(tipocostogastoimpor);
							}
						}

						if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoCostoGastoImporForeignKey(TipoCostoGastoImpor tipocostogastoimpor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setSelectedItem(tipocostogastoimpor);
						}
					} else {
						if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setSelectedItem(tipocostogastoimpor);
						} else {
							this.jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCostoGastoImpor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CostoGastoImporConstantesFunciones.refrescarForeignKeysDescripcionesCostoGastoImpor(this.costogastoimporLogic.getCostoGastoImpors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CostoGastoImporConstantesFunciones.refrescarForeignKeysDescripcionesCostoGastoImpor(this.costogastoimpors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoCostoGastoImpor.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//costogastoimporLogic.setCostoGastoImpors(this.costogastoimpors);
			costogastoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CostoGastoImporParameterReturnGeneral getCostoGastoImporParameterGeneral() {
		return this.costogastoimporParameterGeneral;
	}
	
	public void setCostoGastoImporParameterGeneral(CostoGastoImporParameterReturnGeneral costogastoimporParameterGeneral) {
		this.costogastoimporParameterGeneral = costogastoimporParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCostoGastoImpor() {
		return isPermisoTodoCostoGastoImpor;
	}

	public void setIsPermisoTodoCostoGastoImpor(Boolean isPermisoTodoCostoGastoImpor) {
		this.isPermisoTodoCostoGastoImpor = isPermisoTodoCostoGastoImpor;
	}

	public Boolean getIsPermisoNuevoCostoGastoImpor() {
		return isPermisoNuevoCostoGastoImpor;
	}

	public void setIsPermisoNuevoCostoGastoImpor(Boolean isPermisoNuevoCostoGastoImpor) {
		this.isPermisoNuevoCostoGastoImpor = isPermisoNuevoCostoGastoImpor;
	}

	public Boolean getIsPermisoActualizarCostoGastoImpor() {
		return isPermisoActualizarCostoGastoImpor;
	}

	public void setIsPermisoActualizarCostoGastoImpor(Boolean isPermisoActualizarCostoGastoImpor) {
		this.isPermisoActualizarCostoGastoImpor = isPermisoActualizarCostoGastoImpor;
	}

	public Boolean getIsPermisoEliminarCostoGastoImpor() {
		return isPermisoEliminarCostoGastoImpor;
	}

	public void setIsPermisoEliminarCostoGastoImpor(Boolean isPermisoEliminarCostoGastoImpor) {
		this.isPermisoEliminarCostoGastoImpor = isPermisoEliminarCostoGastoImpor;
	}

	public Boolean getIsPermisoGuardarCambiosCostoGastoImpor() {
		return isPermisoGuardarCambiosCostoGastoImpor;
	}

	public void setIsPermisoGuardarCambiosCostoGastoImpor(Boolean isPermisoGuardarCambiosCostoGastoImpor) {
		this.isPermisoGuardarCambiosCostoGastoImpor = isPermisoGuardarCambiosCostoGastoImpor;
	}
	
	public Boolean getIsPermisoConsultaCostoGastoImpor() {
		return isPermisoConsultaCostoGastoImpor;
	}

	public void setIsPermisoConsultaCostoGastoImpor(Boolean isPermisoConsultaCostoGastoImpor) {
		this.isPermisoConsultaCostoGastoImpor = isPermisoConsultaCostoGastoImpor;
	}

	public Boolean getIsPermisoBusquedaCostoGastoImpor() {
		return isPermisoBusquedaCostoGastoImpor;
	}

	public void setIsPermisoBusquedaCostoGastoImpor(Boolean isPermisoBusquedaCostoGastoImpor) {
		this.isPermisoBusquedaCostoGastoImpor = isPermisoBusquedaCostoGastoImpor;
	}

	public Boolean getIsPermisoReporteCostoGastoImpor() {
		return isPermisoReporteCostoGastoImpor;
	}

	public void setIsPermisoReporteCostoGastoImpor(Boolean isPermisoReporteCostoGastoImpor) {
		this.isPermisoReporteCostoGastoImpor = isPermisoReporteCostoGastoImpor;
	}
	
	public Boolean getIsPermisoPaginacionMedioCostoGastoImpor() {
		return isPermisoPaginacionMedioCostoGastoImpor;
	}

	public void setIsPermisoPaginacionMedioCostoGastoImpor(Boolean isPermisoPaginacionMedioCostoGastoImpor) {
		this.isPermisoPaginacionMedioCostoGastoImpor = isPermisoPaginacionMedioCostoGastoImpor;
	}
	
	public Boolean getIsPermisoPaginacionTodoCostoGastoImpor() {
		return isPermisoPaginacionTodoCostoGastoImpor;
	}

	public void setIsPermisoPaginacionTodoCostoGastoImpor(Boolean isPermisoPaginacionTodoCostoGastoImpor) {
		this.isPermisoPaginacionTodoCostoGastoImpor = isPermisoPaginacionTodoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoPaginacionAltoCostoGastoImpor() {
		return isPermisoPaginacionAltoCostoGastoImpor;
	}

	public void setIsPermisoPaginacionAltoCostoGastoImpor(Boolean isPermisoPaginacionAltoCostoGastoImpor) {
		this.isPermisoPaginacionAltoCostoGastoImpor = isPermisoPaginacionAltoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoCopiarCostoGastoImpor() {
		return isPermisoCopiarCostoGastoImpor;
	}

	public void setIsPermisoCopiarCostoGastoImpor(Boolean isPermisoCopiarCostoGastoImpor) {
		this.isPermisoCopiarCostoGastoImpor = isPermisoCopiarCostoGastoImpor;
	}
	
	public Boolean getIsPermisoVerFormCostoGastoImpor() {
		return isPermisoVerFormCostoGastoImpor;
	}

	public void setIsPermisoVerFormCostoGastoImpor(Boolean isPermisoVerFormCostoGastoImpor) {
		this.isPermisoVerFormCostoGastoImpor = isPermisoVerFormCostoGastoImpor;
	}
	
	public Boolean getIsPermisoDuplicarCostoGastoImpor() {
		return isPermisoDuplicarCostoGastoImpor;
	}

	public void setIsPermisoDuplicarCostoGastoImpor(Boolean isPermisoDuplicarCostoGastoImpor) {
		this.isPermisoDuplicarCostoGastoImpor = isPermisoDuplicarCostoGastoImpor;
	}
	
	public Boolean getIsPermisoOrdenCostoGastoImpor() {
		return isPermisoOrdenCostoGastoImpor;
	}

	public void setIsPermisoOrdenCostoGastoImpor(Boolean isPermisoOrdenCostoGastoImpor) {
		this.isPermisoOrdenCostoGastoImpor = isPermisoOrdenCostoGastoImpor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCostoGastoImpor() {
		return isVisibilidadCeldaNuevoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaNuevoCostoGastoImpor(Boolean isVisibilidadCeldaNuevoCostoGastoImpor) {
		this.isVisibilidadCeldaNuevoCostoGastoImpor = isVisibilidadCeldaNuevoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCostoGastoImpor() {
		return isVisibilidadCeldaDuplicarCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaDuplicarCostoGastoImpor(Boolean isVisibilidadCeldaDuplicarCostoGastoImpor) {
		this.isVisibilidadCeldaDuplicarCostoGastoImpor = isVisibilidadCeldaDuplicarCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCostoGastoImpor() {
		return isVisibilidadCeldaCopiarCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaCopiarCostoGastoImpor(Boolean isVisibilidadCeldaCopiarCostoGastoImpor) {
		this.isVisibilidadCeldaCopiarCostoGastoImpor = isVisibilidadCeldaCopiarCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCostoGastoImpor() {
		return isVisibilidadCeldaVerFormCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaVerFormCostoGastoImpor(Boolean isVisibilidadCeldaVerFormCostoGastoImpor) {
		this.isVisibilidadCeldaVerFormCostoGastoImpor = isVisibilidadCeldaVerFormCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCostoGastoImpor() {
		return isVisibilidadCeldaOrdenCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaOrdenCostoGastoImpor(Boolean isVisibilidadCeldaOrdenCostoGastoImpor) {
		this.isVisibilidadCeldaOrdenCostoGastoImpor = isVisibilidadCeldaOrdenCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCostoGastoImpor() {
		return isVisibilidadCeldaNuevoRelacionesCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCostoGastoImpor(Boolean isVisibilidadCeldaNuevoRelacionesCostoGastoImpor) {
		this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor = isVisibilidadCeldaNuevoRelacionesCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCostoGastoImpor() {
		return isVisibilidadCeldaModificarCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaModificarCostoGastoImpor(Boolean isVisibilidadCeldaModificarCostoGastoImpor) {
		this.isVisibilidadCeldaModificarCostoGastoImpor = isVisibilidadCeldaModificarCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCostoGastoImpor() {
		return isVisibilidadCeldaActualizarCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaActualizarCostoGastoImpor(Boolean isVisibilidadCeldaActualizarCostoGastoImpor) {
		this.isVisibilidadCeldaActualizarCostoGastoImpor = isVisibilidadCeldaActualizarCostoGastoImpor;
	}

	public Boolean getIsVisibilidadCeldaEliminarCostoGastoImpor() {
		return isVisibilidadCeldaEliminarCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaEliminarCostoGastoImpor(Boolean isVisibilidadCeldaEliminarCostoGastoImpor) {
		this.isVisibilidadCeldaEliminarCostoGastoImpor = isVisibilidadCeldaEliminarCostoGastoImpor;
	}

	public Boolean getIsVisibilidadCeldaCancelarCostoGastoImpor() {
		return isVisibilidadCeldaCancelarCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaCancelarCostoGastoImpor(Boolean isVisibilidadCeldaCancelarCostoGastoImpor) {
		this.isVisibilidadCeldaCancelarCostoGastoImpor = isVisibilidadCeldaCancelarCostoGastoImpor;
	}

	public Boolean getIsVisibilidadCeldaGuardarCostoGastoImpor() {
		return isVisibilidadCeldaGuardarCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaGuardarCostoGastoImpor(Boolean isVisibilidadCeldaGuardarCostoGastoImpor) {
		this.isVisibilidadCeldaGuardarCostoGastoImpor = isVisibilidadCeldaGuardarCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCostoGastoImpor() {
		return isVisibilidadCeldaGuardarCambiosCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCostoGastoImpor(Boolean isVisibilidadCeldaGuardarCambiosCostoGastoImpor) {
		this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor = isVisibilidadCeldaGuardarCambiosCostoGastoImpor;
	}
		
	public CostoGastoImporSessionBean getcostogastoimporSessionBean() {
		return this.costogastoimporSessionBean;
	}
	
	public void setcostogastoimporSessionBean(CostoGastoImporSessionBean costogastoimporSessionBean) {
		this.costogastoimporSessionBean=costogastoimporSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoCostoGastoImpor() {
		return this.isVisibilidadFK_IdTipoCostoGastoImpor;
	}

	public void setisVisibilidadFK_IdTipoCostoGastoImpor(Boolean isVisibilidadFK_IdTipoCostoGastoImpor) {
		this.isVisibilidadFK_IdTipoCostoGastoImpor=isVisibilidadFK_IdTipoCostoGastoImpor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(CostoGastoImpor costogastoimpor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(costogastoimpor,null);
				this.setActualParaGuardarSucursalForeignKey(costogastoimpor,null);
				this.setActualParaGuardarTipoCostoGastoImporForeignKey(costogastoimpor,null);
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
	
	public void bugActualizarReferenciaActual(CostoGastoImpor costogastoimpor,CostoGastoImpor costogastoimporAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCostoGastoImpor(costogastoimpor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		costogastoimporAux.setId(costogastoimpor.getId());
		costogastoimporAux.setVersionRow(costogastoimpor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCostoGastoImpor();
		
			int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = costogastoimporValidator.getInvalidValues(this.costogastoimpor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			costogastoimporLogic.setDatosCliente(datosCliente);
			costogastoimporLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				costogastoimporAux=new  CostoGastoImpor();
				
				costogastoimporAux.setIsNew(true);
				costogastoimporAux.setIsChanged(true);
				
				costogastoimporAux.setCostoGastoImporOriginal(this.costogastoimpor);
				
				costogastoimporAux.setId(this.costogastoimpor.getId());	
				costogastoimporAux.setVersionRow(this.costogastoimpor.getVersionRow());	
				costogastoimporAux.setid_empresa(this.costogastoimpor.getid_empresa());	
				costogastoimporAux.setid_sucursal(this.costogastoimpor.getid_sucursal());	
				costogastoimporAux.setid_tipo_costo_gasto_impor(this.costogastoimpor.getid_tipo_costo_gasto_impor());	
				costogastoimporAux.setnombre(this.costogastoimpor.getnombre());	
				costogastoimporAux.setes_activo(this.costogastoimpor.getes_activo());	
				costogastoimporAux.setcon_agrupa(this.costogastoimpor.getcon_agrupa());	
				costogastoimporAux.setcon_prorratea(this.costogastoimpor.getcon_prorratea());	
				costogastoimporAux.setcon_factura(this.costogastoimpor.getcon_factura());	
				costogastoimporAux.setcon_flete(this.costogastoimpor.getcon_flete());	
				costogastoimporAux.setcon_arancel(this.costogastoimpor.getcon_arancel());	
				costogastoimporAux.setcon_seguro(this.costogastoimpor.getcon_seguro());	
				costogastoimporAux.setcon_total_general(this.costogastoimpor.getcon_total_general());	
				costogastoimporAux.setcon_digitado(this.costogastoimpor.getcon_digitado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.costogastoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(costogastoimporAux,costogastoimporLogic.getCostoGastoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(costogastoimporAux,costogastoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.costogastoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.costogastoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporLogic.saveCostoGastoImpors();//WithConnection
						//costogastoimporLogic.getSetVersionRowCostoGastoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.costogastoimpor,costogastoimporAux);
					
					this.refrescarForeignKeysDescripcionesCostoGastoImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors.addAll(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								costogastoimporLogic.saveCostoGastoImporRelaciones(costogastoimporAux,this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());//WithConnection
								//costogastoimporLogic.getSetVersionRowCostoGastoImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.costogastoimpor,costogastoimporAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors= new ArrayList<DetalleLiquidacionImpor>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							costogastoimporAux.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.costogastoimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(costogastoimporAux,costogastoimporLogic.getCostoGastoImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(costogastoimporAux,costogastoimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.costogastoimpor,costogastoimporAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				costogastoimporAux=new  CostoGastoImpor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.costogastoimporSessionBean.getEsGuardarRelacionado() 
					|| (this.costogastoimporSessionBean.getEsGuardarRelacionado() && this.costogastoimpor.getId()>=0)) {
						
					costogastoimporAux.setIsNew(false);
				}
				
				costogastoimporAux.setIsDeleted(false);
			
				costogastoimporAux.setId(this.costogastoimpor.getId());	
				costogastoimporAux.setVersionRow(this.costogastoimpor.getVersionRow());	
				costogastoimporAux.setid_empresa(this.costogastoimpor.getid_empresa());	
				costogastoimporAux.setid_sucursal(this.costogastoimpor.getid_sucursal());	
				costogastoimporAux.setid_tipo_costo_gasto_impor(this.costogastoimpor.getid_tipo_costo_gasto_impor());	
				costogastoimporAux.setnombre(this.costogastoimpor.getnombre());	
				costogastoimporAux.setes_activo(this.costogastoimpor.getes_activo());	
				costogastoimporAux.setcon_agrupa(this.costogastoimpor.getcon_agrupa());	
				costogastoimporAux.setcon_prorratea(this.costogastoimpor.getcon_prorratea());	
				costogastoimporAux.setcon_factura(this.costogastoimpor.getcon_factura());	
				costogastoimporAux.setcon_flete(this.costogastoimpor.getcon_flete());	
				costogastoimporAux.setcon_arancel(this.costogastoimpor.getcon_arancel());	
				costogastoimporAux.setcon_seguro(this.costogastoimpor.getcon_seguro());	
				costogastoimporAux.setcon_total_general(this.costogastoimpor.getcon_total_general());	
				costogastoimporAux.setcon_digitado(this.costogastoimpor.getcon_digitado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(costogastoimporAux,costogastoimporLogic.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(costogastoimporAux,costogastoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.costogastoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.costogastoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporLogic.saveCostoGastoImpors();//WithConnection
						//costogastoimporLogic.getSetVersionRowCostoGastoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.costogastoimpor,costogastoimporAux);
					
					this.refrescarForeignKeysDescripcionesCostoGastoImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors.addAll(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								costogastoimporLogic.saveCostoGastoImporRelaciones(costogastoimporAux,this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());//WithConnection
								//costogastoimporLogic.getSetVersionRowCostoGastoImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.costogastoimpor,costogastoimporAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors= new ArrayList<DetalleLiquidacionImpor>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							costogastoimporAux.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.costogastoimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(costogastoimporAux,costogastoimporLogic.getCostoGastoImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(costogastoimporAux,costogastoimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.costogastoimpor,costogastoimporAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				costogastoimporAux=new  CostoGastoImpor();
				
				costogastoimporAux.setIsNew(false);
				costogastoimporAux.setIsChanged(false);
				
				costogastoimporAux.setIsDeleted(true);
				
				costogastoimporAux.setId(this.costogastoimpor.getId());	
				costogastoimporAux.setVersionRow(this.costogastoimpor.getVersionRow());	
				costogastoimporAux.setid_empresa(this.costogastoimpor.getid_empresa());	
				costogastoimporAux.setid_sucursal(this.costogastoimpor.getid_sucursal());	
				costogastoimporAux.setid_tipo_costo_gasto_impor(this.costogastoimpor.getid_tipo_costo_gasto_impor());	
				costogastoimporAux.setnombre(this.costogastoimpor.getnombre());	
				costogastoimporAux.setes_activo(this.costogastoimpor.getes_activo());	
				costogastoimporAux.setcon_agrupa(this.costogastoimpor.getcon_agrupa());	
				costogastoimporAux.setcon_prorratea(this.costogastoimpor.getcon_prorratea());	
				costogastoimporAux.setcon_factura(this.costogastoimpor.getcon_factura());	
				costogastoimporAux.setcon_flete(this.costogastoimpor.getcon_flete());	
				costogastoimporAux.setcon_arancel(this.costogastoimpor.getcon_arancel());	
				costogastoimporAux.setcon_seguro(this.costogastoimpor.getcon_seguro());	
				costogastoimporAux.setcon_total_general(this.costogastoimpor.getcon_total_general());	
				costogastoimporAux.setcon_digitado(this.costogastoimpor.getcon_digitado());	
				
				if(this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.costogastoimporAux.getId()>=0) {	
						this.costogastoimporsEliminados.add(costogastoimporAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(costogastoimporAux,costogastoimporLogic.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(costogastoimporAux,costogastoimpors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.costogastoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.costogastoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporLogic.saveCostoGastoImpors();//WithConnection
						//costogastoimporLogic.getSetVersionRowCostoGastoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors.addAll(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								costogastoimporLogic.saveCostoGastoImporRelaciones(costogastoimporAux,this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());//WithConnection
								//costogastoimporLogic.getSetVersionRowCostoGastoImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors= new ArrayList<DetalleLiquidacionImpor>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.quitarFilaTotales();}
							costogastoimporAux.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones() 
								|| this.costogastoimporSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(costogastoimporAux,costogastoimporLogic.getCostoGastoImpors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(costogastoimporAux,costogastoimpors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getCostoGastoImpors().addAll(this.costogastoimporsEliminados);
					
					costogastoimporLogic.saveCostoGastoImpors();//WithConnection
					//costogastoimporLogic.getSetVersionRowCostoGastoImpors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCostoGastoImpor();
				
				this.costogastoimporsEliminados= new ArrayList<CostoGastoImpor>();		
			}
			
			if(this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Costo Gasto Impor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.costogastoimpor=costogastoimporAux;
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
      		//this.finishProcessCostoGastoImpor();
      	}
		
	}	
	
	public void actualizarRelaciones(CostoGastoImpor costogastoimporLocal) throws Exception {
		
		if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				costogastoimporLocal.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
			
			} else {
			
				costogastoimporLocal.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimpors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CostoGastoImpor costogastoimporLocal) throws Exception {	
		if(this.costogastoimporSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				costogastoimporLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				costogastoimporLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCostoGastoImporDetalleFormJInternalFrame.class)) {
				TipoCostoGastoImporBeanSwingJInternalFrame tipocostogastoimporBeanSwingJInternalFrameLocal=(TipoCostoGastoImporBeanSwingJInternalFrame) ((TipoCostoGastoImporDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocostogastoimporBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCostoGastoImpor(tipocostogastoimporBeanSwingJInternalFrameLocal.gettipocostogastoimpor(),true);
				tipocostogastoimporBeanSwingJInternalFrameLocal.actualizarLista(tipocostogastoimporBeanSwingJInternalFrameLocal.tipocostogastoimpor,this.tipocostogastoimporsForeignKey);

				tipocostogastoimporBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocostogastoimporBeanSwingJInternalFrameLocal.tipocostogastoimpor);

				costogastoimporLocal.setTipoCostoGastoImpor(tipocostogastoimporBeanSwingJInternalFrameLocal.tipocostogastoimpor);

				this.addItemDefectoCombosForeignKeyTipoCostoGastoImpor();
				this.cargarCombosFrameTipoCostoGastoImporsForeignKey("Formulario");
				this.setActualTipoCostoGastoImporForeignKey(tipocostogastoimporBeanSwingJInternalFrameLocal.tipocostogastoimpor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCostoGastoImporActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = costogastoimporValidator.getInvalidValues(this.costogastoimpor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CostoGastoImpor costogastoimpor,List<CostoGastoImpor> costogastoimpors) throws Exception {
		try	{		
			CostoGastoImporConstantesFunciones.actualizarLista(costogastoimpor,costogastoimpors,this.costogastoimporSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CostoGastoImpor costogastoimpor,List<CostoGastoImpor> costogastoimpors) throws Exception {
		try	{			
			CostoGastoImporConstantesFunciones.actualizarSelectedLista(costogastoimpor,costogastoimpors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CostoGastoImpor> costogastoimporsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				costogastoimporsLocal=this.costogastoimporLogic.getCostoGastoImpors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				costogastoimporsLocal=this.costogastoimpors;
			}
			//ARCHITECTURE
		
			for(CostoGastoImpor costogastoimporLocal:costogastoimporsLocal) {
				if(this.permiteMantenimiento(costogastoimporLocal) && costogastoimporLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CostoGastoImporConstantesFunciones.getCostoGastoImporLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelid_empresaCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelid_sucursalCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.IDTIPOCOSTOGASTOIMPOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelid_tipo_costo_gasto_imporCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelnombreCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabeles_activoCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.CONAGRUPA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_agrupaCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.CONPRORRATEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_prorrateaCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.CONFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_facturaCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.CONFLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_fleteCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.CONARANCEL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_arancelCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.CONSEGURO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_seguroCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.CONTOTALGENERAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_total_generalCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CostoGastoImporConstantesFunciones.CONDIGITADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_digitadoCostoGastoImpor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelid_empresaCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelid_sucursalCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelid_tipo_costo_gasto_imporCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelnombreCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabeles_activoCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_agrupaCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_prorrateaCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_facturaCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_fleteCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_arancelCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_seguroCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_total_generalCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_digitadoCostoGastoImpor,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleLiquidacionImpor")) {
			if(this.costogastoimpor==null) {
				this.costogastoimpor= new CostoGastoImpor();
			}

			if(this.costogastoimporSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCostoGastoImpor
				this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);

				this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.getdetalleliquidacionimpor().setCostoGastoImpor(this.costogastoimpor);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCostoGastoImpor--;	
		
		
		this.costogastoimporAux=new CostoGastoImpor();
		
		this.costogastoimporAux.setId(this.iIdNuevoCostoGastoImpor);
		this.costogastoimporAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.costogastoimporLogic.getCostoGastoImpors().add(this.costogastoimporAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.costogastoimpors.add(this.costogastoimporAux);
		}
		//ARCHITECTURE
		
		this.costogastoimpor=this.costogastoimporAux;
		
		if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCostoGastoImpor(this.costogastoimpor);
			this.setVariablesObjetoActualToFormularioForeignKeyCostoGastoImpor(this.costogastoimpor);
		}
				
		//this.setDefaultControlesCostoGastoImpor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCostoGastoImpor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCostoGastoImpor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCostoGastoImpor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCostoGastoImpor(this.costogastoimporBean,this.costogastoimpor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CostoGastoImporConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
			classes=CostoGastoImporConstantesFunciones.getClassesRelationshipsOfCostoGastoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.costogastoimporReturnGeneral=costogastoimporLogic.procesarEventosCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.costogastoimporLogic.getCostoGastoImpors(),this.costogastoimpor,this.costogastoimporParameterGeneral,this.isEsNuevoCostoGastoImpor,classes);//this.costogastoimporLogic.getCostoGastoImpor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCostoGastoImpor(this.costogastoimporReturnGeneral,this.costogastoimporBean,false);
		
		if(this.costogastoimporReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCostoGastoImpor(this.costogastoimporReturnGeneral.getCostoGastoImpor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCostoGastoImpor(this.costogastoimporReturnGeneral.getCostoGastoImpor());
		}
		
		if(this.costogastoimporReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCostoGastoImpor(this.costogastoimporReturnGeneral.getCostoGastoImpor(),classes);//this.costogastoimporBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCostoGastoImpor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCostoGastoImpor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.RecargarFormCostoGastoImpor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCostoGastoImpor(false);
						
			if(costogastoimporSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() && DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleLiquidacionImporActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCostoGastoImpor();
			}
			
			this.actualizarVisualTableDatosCostoGastoImpor();
			
			this.jTableDatosCostoGastoImpor.setRowSelectionInterval(this.getIndiceNuevoCostoGastoImpor(), this.getIndiceNuevoCostoGastoImpor());
			
			this.seleccionarFilaTablaCostoGastoImporActual();
						
			this.actualizarEstadoCeldasBotonesCostoGastoImpor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCostoGastoImpor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jTextAreanombreCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarnombreCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activares_activoCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarcon_agrupaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarcon_prorrateaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarcon_facturaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarcon_fleteCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarcon_arancelCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarcon_seguroCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarcon_total_generalCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarcon_digitadoCostoGastoImpor);	
		//
		this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarid_empresaCostoGastoImpor);//
		this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarid_sucursalCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setEnabled(isHabilitar && this.costogastoimporConstantesFunciones.activarid_tipo_costo_gasto_imporCostoGastoImpor);
	};
	
	public void setDefaultControlesCostoGastoImpor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCostoGastoImpor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.costogastoimporSessionBean.setConGuardarRelaciones(true);			
			this.costogastoimporSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.costogastoimporSessionBean.setConGuardarRelaciones(false);			
			this.costogastoimporSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCostoGastoImpor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
				if(costogastoimporAux.getId().equals(this.iIdNuevoCostoGastoImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CostoGastoImpor costogastoimporAux:this.costogastoimpors) {
				if(costogastoimporAux.getId().equals(this.iIdNuevoCostoGastoImpor)) {
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
	
	public int getIndiceActualCostoGastoImpor(CostoGastoImpor costogastoimpor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
				if(costogastoimporAux.getId().equals(costogastoimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CostoGastoImpor costogastoimporAux:this.costogastoimpors) {
				if(costogastoimporAux.getId().equals(costogastoimpor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCostoGastoImpor(CostoGastoImpor costogastoimporOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
				if(costogastoimporAux.getCostoGastoImporOriginal().getId().equals(costogastoimporOriginal.getId())) {
					existe=true;
					costogastoimporOriginal.setId(costogastoimporAux.getId());
					costogastoimporOriginal.setVersionRow(costogastoimporAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CostoGastoImpor costogastoimporAux:this.costogastoimpors) {
				if(costogastoimporAux.getCostoGastoImporOriginal().getId().equals(costogastoimporOriginal.getId())) {
					existe=true;
					costogastoimporOriginal.setId(costogastoimporAux.getId());
					costogastoimporOriginal.setVersionRow(costogastoimporAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCostoGastoImpor(Boolean esParaCancelar) throws Exception {
		costogastoimporsAux=new ArrayList<CostoGastoImpor>();
		costogastoimporAux=new CostoGastoImpor();
		
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
					if(costogastoimporAux.getId()<0) {
						costogastoimporsAux.add(costogastoimporAux);
					}		
				}
				this.iIdNuevoCostoGastoImpor=0L;
				this.costogastoimporLogic.getCostoGastoImpors().removeAll(costogastoimporsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CostoGastoImpor costogastoimporAux:this.costogastoimpors) {
					if(costogastoimporAux.getId()<0) {
						costogastoimporsAux.add(costogastoimporAux);
					}		
				}
				this.iIdNuevoCostoGastoImpor=0L;
				this.costogastoimpors.removeAll(costogastoimporsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCostoGastoImpor 
					&& this.costogastoimporLogic.getCostoGastoImpors().size()>0
					) {
					costogastoimporAux=this.costogastoimporLogic.getCostoGastoImpors().get(this.costogastoimporLogic.getCostoGastoImpors().size() - 1);
				
					if(costogastoimporAux.getId()<0) {
						this.costogastoimporLogic.getCostoGastoImpors().remove(costogastoimporAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCostoGastoImpor && this.costogastoimpors.size()>0) {
					costogastoimporAux=this.costogastoimpors.get(this.costogastoimpors.size() - 1);
				
					if(costogastoimporAux.getId()<0) {
						this.costogastoimpors.remove(costogastoimporAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCostoGastoImpor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(costogastoimpor.getId()<0) {
				this.costogastoimporLogic.getCostoGastoImpors().remove(this.costogastoimpor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(costogastoimpor.getId()<0) {
				this.costogastoimpors.remove(this.costogastoimpor);
			}
		}			
	}
	
	public void setEstadosInicialesCostoGastoImpor(List<CostoGastoImpor> costogastoimporsAux) throws Exception {
		CostoGastoImporConstantesFunciones.setEstadosInicialesCostoGastoImpor(costogastoimporsAux);
	}
	
	public void setEstadosInicialesCostoGastoImpor(CostoGastoImpor costogastoimporAux) throws Exception {
		CostoGastoImporConstantesFunciones.setEstadosInicialesCostoGastoImpor(costogastoimporAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCostoGastoImporActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCostoGastoImporActual()) {
				if(!this.isEsNuevoCostoGastoImpor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCostoGastoImpor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCostoGastoImporActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Costo Gasto Impor ?", "MANTENIMIENTO DE Costo Gasto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CostoGastoImpor costogastoimpor) throws Exception {
		CostoGastoImporConstantesFunciones.seleccionarAsignar(this.costogastoimpor,costogastoimpor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCostoGastoImpor=this.isPermisoActualizarOriginalCostoGastoImpor;
			
			
			this.seleccionarAsignar(costogastoimpor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CostoGastoImporConstantesFunciones.quitarEspaciosCostoGastoImpor(this.costogastoimpor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCostoGastoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.costogastoimporSessionBean.setsFuncionBusquedaRapida(this.costogastoimporSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCostoGastoImpor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCostoGastoImpor(esParaCancelar);				
				this.cancelarNuevoCostoGastoImpor(esParaCancelar);								
			}
			
			this.costogastoimpor=new CostoGastoImpor();
			
			this.inicializarCostoGastoImpor();
			
			this.actualizarEstadoCeldasBotonesCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCostoGastoImpor() throws Exception {
		try {
			CostoGastoImporConstantesFunciones.inicializarCostoGastoImpor(this.costogastoimpor);
			
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
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.costogastoimporLogic.getCostoGastoImpors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCostoGastoImpors(String sAccionBusqueda,List<CostoGastoImpor> costogastoimporsParaReportes) throws Exception {
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
					sPathReporteFinal="CostoGastoImpor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CostoGastoImporMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CostoGastoImporMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CostoGastoImpor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Costo Gasto Impores");		
		parameters.put("busquedapor", CostoGastoImporConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					CostoGastoImporLogic costogastoimporLogicAuxiliar=new CostoGastoImporLogic();
					costogastoimporLogicAuxiliar.setDatosCliente(costogastoimporLogic.getDatosCliente());				
					costogastoimporLogicAuxiliar.setCostoGastoImpors(costogastoimporsParaReportes);
					
					costogastoimporLogicAuxiliar.cargarRelacionesLoteForeignKeyCostoGastoImporWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					costogastoimporsParaReportes=costogastoimporLogicAuxiliar.getCostoGastoImpors();
					
					//costogastoimporLogic.getNewConnexionToDeep();
					
					//for (CostoGastoImpor costogastoimpor:costogastoimporsParaReportes) {
					//	costogastoimporLogic.deepLoad(costogastoimpor, false, DeepLoadType.INCLUDE, classes);
					//}						
					//costogastoimporLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//costogastoimporLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCostoGastoImpor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CostoGastoImporConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CostoGastoImporConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCostoGastoImpor=new JRBeanArrayDataSource(CostoGastoImporJInternalFrame.TraerCostoGastoImporBeans(costogastoimporsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCostoGastoImpor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CostoGastoImporConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CostoGastoImporConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CostoGastoImporBean.TraerCostoGastoImporBeans(costogastoimporsParaReportes).toArray()));
							
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
				this.generarExcelReporteCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,costogastoimporsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,costogastoimporsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCostoGastoImporActionPerformed(null);
					//this.generarExcelReporteCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,costogastoimporsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,costogastoimporsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,costogastoimporsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,costogastoimporsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCostoGastoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<CostoGastoImpor> costogastoimporsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costogastoimpor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CostoGastoImpors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCostoGastoImpor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CostoGastoImpor costogastoimpor : costogastoimporsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CostoGastoImporConstantesFunciones.generarExcelReporteDataCostoGastoImpor("NORMAL",row,workbook,costogastoimpor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCostoGastoImpor(String sTipo,Row row,Workbook workbook) {
		
		CostoGastoImporConstantesFunciones.generarExcelReporteHeaderCostoGastoImpor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCostoGastoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<CostoGastoImpor> costogastoimporsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costogastoimpor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CostoGastoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CostoGastoImpor costogastoimpor : costogastoimporsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CostoGastoImporConstantesFunciones.getCostoGastoImporDescripcion(costogastoimpor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costogastoimpor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costogastoimpor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costogastoimpor.gettipocostogastoimpor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(costogastoimpor.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getes_activo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getcon_agrupa()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getcon_prorratea()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_CONFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getcon_factura()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_CONFLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONFLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getcon_flete()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_CONARANCEL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONARANCEL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getcon_arancel()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_CONSEGURO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONSEGURO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getcon_seguro()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getcon_total_general()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(costogastoimpor.getcon_digitado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCostoGastoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<CostoGastoImpor> costogastoimporsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CostoGastoImpor> costogastoimporsRespaldo=null;
		
		classes=CostoGastoImporConstantesFunciones.getClassesRelationshipsOfCostoGastoImpor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.costogastoimporLogic.setDatosCliente(this.datosCliente);
		this.costogastoimporLogic.setDatosDeep(this.datosDeep);
		this.costogastoimporLogic.setIsConDeep(true);
		
		costogastoimporsRespaldo=this.costogastoimporLogic.getCostoGastoImpors();
		
		this.costogastoimporLogic.setCostoGastoImpors(costogastoimporsParaReportes);	
		this.costogastoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		costogastoimporsParaReportes=this.costogastoimporLogic.getCostoGastoImpors();
		this.costogastoimporLogic.setCostoGastoImpors(costogastoimporsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costogastoimpor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CostoGastoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCostoGastoImpor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CostoGastoImpor costogastoimpor : costogastoimporsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCostoGastoImpor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CostoGastoImporConstantesFunciones.generarExcelReporteDataCostoGastoImpor("NORMAL",row,workbook,costogastoimpor,cellStyleDataAux);
		
			
			


				//DetalleLiquidacionImpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO))) {

				if(costogastoimpor.getDetalleLiquidacionImpors()!=null && costogastoimpor.getDetalleLiquidacionImpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleLiquidacionImporConstantesFunciones.generarExcelReporteHeaderDetalleLiquidacionImpor("RELACIONADO",row,workbook);
				}

				if(costogastoimpor.getDetalleLiquidacionImpors()!=null) {
					i2=0;
					for(DetalleLiquidacionImpor detalleliquidacionimpor : costogastoimpor.getDetalleLiquidacionImpors()) {
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
		cell.setCellValue(CostoGastoImporConstantesFunciones.getCostoGastoImporDescripcion(costogastoimpor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCostoGastoImpor() throws Exception {		
		this.startProcessCostoGastoImpor(true);
	}
	
	public void startProcessCostoGastoImpor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCostoGastoImpor ,this.jPanelParametrosReportesCostoGastoImpor, this.jScrollPanelDatosCostoGastoImpor,this.jPanelPaginacionCostoGastoImpor, this.jScrollPanelDatosEdicionCostoGastoImpor, this.jPanelAccionesCostoGastoImpor,this.jPanelAccionesFormularioCostoGastoImpor,this.jmenuBarCostoGastoImpor,this.jmenuBarDetalleCostoGastoImpor,this.jTtoolBarCostoGastoImpor,this.jTtoolBarDetalleCostoGastoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasCostoGastoImpor=this.jTabbedPaneBusquedasCostoGastoImpor; 
		
		final JPanel jPanelParametrosReportesCostoGastoImpor=this.jPanelParametrosReportesCostoGastoImpor;
		//final JScrollPane jScrollPanelDatosCostoGastoImpor=this.jScrollPanelDatosCostoGastoImpor;
		final JTable jTableDatosCostoGastoImpor=this.jTableDatosCostoGastoImpor;		
		final JPanel jPanelPaginacionCostoGastoImpor=this.jPanelPaginacionCostoGastoImpor;
		//final JScrollPane jScrollPanelDatosEdicionCostoGastoImpor=this.jScrollPanelDatosEdicionCostoGastoImpor;
		final JPanel jPanelAccionesCostoGastoImpor=this.jPanelAccionesCostoGastoImpor;
		
		JPanel jPanelCamposAuxiliarCostoGastoImpor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCostoGastoImpor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			jPanelCamposAuxiliarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jPanelCamposCostoGastoImpor;
			jPanelAccionesFormularioAuxiliarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jPanelAccionesFormularioCostoGastoImpor;
		}
		
		final JPanel jPanelCamposCostoGastoImpor=jPanelCamposAuxiliarCostoGastoImpor;
		final JPanel jPanelAccionesFormularioCostoGastoImpor=jPanelAccionesFormularioAuxiliarCostoGastoImpor;
		
		
		final JMenuBar jmenuBarCostoGastoImpor=this.jmenuBarCostoGastoImpor;
		final JToolBar jTtoolBarCostoGastoImpor=this.jTtoolBarCostoGastoImpor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCostoGastoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCostoGastoImpor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			jmenuBarDetalleAuxiliarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jmenuBarDetalleCostoGastoImpor;
			jTtoolBarDetalleAuxiliarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jTtoolBarDetalleCostoGastoImpor;
		}
		
		final JMenuBar jmenuBarDetalleCostoGastoImpor=jmenuBarDetalleAuxiliarCostoGastoImpor;
		final JToolBar jTtoolBarDetalleCostoGastoImpor=jTtoolBarDetalleAuxiliarCostoGastoImpor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCostoGastoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCostoGastoImpor;
			processRunnable.jTableDatos=jTableDatosCostoGastoImpor;
			processRunnable.jPanelCampos=jPanelCamposCostoGastoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionCostoGastoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesCostoGastoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCostoGastoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarCostoGastoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCostoGastoImpor;
			processRunnable.jTtoolBar=jTtoolBarCostoGastoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCostoGastoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCostoGastoImpor ,jPanelParametrosReportesCostoGastoImpor,jTableDatosCostoGastoImpor, /*jScrollPanelDatosCostoGastoImpor,*/jPanelCamposCostoGastoImpor,jPanelPaginacionCostoGastoImpor, /*jScrollPanelDatosEdicionCostoGastoImpor,*/ jPanelAccionesCostoGastoImpor,jPanelAccionesFormularioCostoGastoImpor,jmenuBarCostoGastoImpor,jmenuBarDetalleCostoGastoImpor,jTtoolBarCostoGastoImpor,jTtoolBarDetalleCostoGastoImpor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCostoGastoImpor ,jPanelParametrosReportesCostoGastoImpor, jScrollPanelDatosCostoGastoImpor,jPanelPaginacionCostoGastoImpor, jScrollPanelDatosEdicionCostoGastoImpor, jPanelAccionesCostoGastoImpor,jPanelAccionesFormularioCostoGastoImpor,jmenuBarCostoGastoImpor,jmenuBarDetalleCostoGastoImpor,jTtoolBarCostoGastoImpor,jTtoolBarDetalleCostoGastoImpor);
						
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
	
	public void finishProcessCostoGastoImpor() {// throws Exception 
		this.finishProcessCostoGastoImpor(true);
	}
	
	public void finishProcessCostoGastoImpor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCostoGastoImpor ,this.jPanelParametrosReportesCostoGastoImpor, this.jScrollPanelDatosCostoGastoImpor,this.jPanelPaginacionCostoGastoImpor, this.jScrollPanelDatosEdicionCostoGastoImpor, this.jPanelAccionesCostoGastoImpor,this.jPanelAccionesFormularioCostoGastoImpor,this.jmenuBarCostoGastoImpor,this.jmenuBarDetalleCostoGastoImpor,this.jTtoolBarCostoGastoImpor,this.jTtoolBarDetalleCostoGastoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasCostoGastoImpor=this.jTabbedPaneBusquedasCostoGastoImpor; 
		
		final JPanel jPanelParametrosReportesCostoGastoImpor=this.jPanelParametrosReportesCostoGastoImpor;
		//final JScrollPane jScrollPanelDatosCostoGastoImpor=this.jScrollPanelDatosCostoGastoImpor;
		final JTable jTableDatosCostoGastoImpor=this.jTableDatosCostoGastoImpor;		
		final JPanel jPanelPaginacionCostoGastoImpor=this.jPanelPaginacionCostoGastoImpor;
		//final JScrollPane jScrollPanelDatosEdicionCostoGastoImpor=this.jScrollPanelDatosEdicionCostoGastoImpor;
		final JPanel jPanelAccionesCostoGastoImpor=this.jPanelAccionesCostoGastoImpor;
		
		JPanel jPanelCamposAuxiliarCostoGastoImpor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCostoGastoImpor=new JPanel();
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			jPanelCamposAuxiliarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jPanelCamposCostoGastoImpor;
			jPanelAccionesFormularioAuxiliarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jPanelAccionesFormularioCostoGastoImpor;
		}
		
		final JPanel jPanelCamposCostoGastoImpor=jPanelCamposAuxiliarCostoGastoImpor;
		final JPanel jPanelAccionesFormularioCostoGastoImpor=jPanelAccionesFormularioAuxiliarCostoGastoImpor;
		
		
		final JMenuBar jmenuBarCostoGastoImpor=this.jmenuBarCostoGastoImpor;		
		final JToolBar jTtoolBarCostoGastoImpor=this.jTtoolBarCostoGastoImpor;
				
		JMenuBar jmenuBarDetalleAuxiliarCostoGastoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCostoGastoImpor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			jmenuBarDetalleAuxiliarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jmenuBarDetalleCostoGastoImpor;
			jTtoolBarDetalleAuxiliarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jTtoolBarDetalleCostoGastoImpor;		
		}
		
		final JMenuBar jmenuBarDetalleCostoGastoImpor=jmenuBarDetalleAuxiliarCostoGastoImpor;
		final JToolBar jTtoolBarDetalleCostoGastoImpor=jTtoolBarDetalleAuxiliarCostoGastoImpor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCostoGastoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCostoGastoImpor;
			processRunnable.jTableDatos=jTableDatosCostoGastoImpor;
			processRunnable.jPanelCampos=jPanelCamposCostoGastoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionCostoGastoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesCostoGastoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCostoGastoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarCostoGastoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCostoGastoImpor;
			processRunnable.jTtoolBar=jTtoolBarCostoGastoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCostoGastoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCostoGastoImpor ,jPanelParametrosReportesCostoGastoImpor, jTableDatosCostoGastoImpor,/*jScrollPanelDatosCostoGastoImpor,*/jPanelCamposCostoGastoImpor,jPanelPaginacionCostoGastoImpor, /*jScrollPanelDatosEdicionCostoGastoImpor,*/ jPanelAccionesCostoGastoImpor,jPanelAccionesFormularioCostoGastoImpor,jmenuBarCostoGastoImpor,jmenuBarDetalleCostoGastoImpor,jTtoolBarCostoGastoImpor,jTtoolBarDetalleCostoGastoImpor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCostoGastoImpor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCostoGastoImpor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCostoGastoImpor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCostoGastoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCostoGastoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCostoGastoImpor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCostoGastoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCostoGastoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCostoGastoImpor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.costogastoimporConstantesFunciones.getsFinalQueryCostoGastoImpor();
		String  finalQueryPaginacionTodos=this.costogastoimporConstantesFunciones.getsFinalQueryCostoGastoImpor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CostoGastoImporConstantesFunciones.getArrayColumnasGlobalesNoCostoGastoImpor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CostoGastoImporConstantesFunciones.getArrayColumnasGlobalesCostoGastoImpor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CostoGastoImporConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.costogastoimporsEliminados= new ArrayList<CostoGastoImpor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCostoGastoImpor();
		
				///*CostoGastoImporSessionBean*/this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
			
			if(this.costogastoimporSessionBean==null) {
				this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
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
					this.iNumeroPaginacion=CostoGastoImporConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CostoGastoImporConstantesFunciones.getClassesForeignKeysOfCostoGastoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/costogastoimpor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			costogastoimporsAux= new ArrayList<CostoGastoImpor>();
			
				
			costogastoimporLogic.setDatosCliente(this.datosCliente);
			costogastoimporLogic.setDatosDeep(this.datosDeep);
			costogastoimporLogic.setIsConDeep(true);
			
			
			costogastoimporLogic.getCostoGastoImporDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					costogastoimporLogic.getTodosCostoGastoImpors(finalQueryGlobal,pagination);
					
					//costogastoimporLogic.getTodosCostoGastoImporsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(costogastoimporLogic.getCostoGastoImpors()==null|| costogastoimporLogic.getCostoGastoImpors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							costogastoimporsAux= new ArrayList<CostoGastoImpor>();
							costogastoimporsAux.addAll(costogastoimporLogic.getCostoGastoImpors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimporsAux= new ArrayList<CostoGastoImpor>();
							costogastoimporsAux.addAll(costogastoimpors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							costogastoimporLogic.getTodosCostoGastoImpors(finalQueryGlobal+"",this.pagination);												
							
							//costogastoimporLogic.getTodosCostoGastoImporsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCostoGastoImpors("Todos",costogastoimporLogic.getCostoGastoImpors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							costogastoimporLogic.setCostoGastoImpors(new ArrayList<CostoGastoImpor>());					
							costogastoimporLogic.getCostoGastoImpors().addAll(costogastoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimpors=new ArrayList<CostoGastoImpor>();
							costogastoimpors.addAll(costogastoimporsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCostoGastoImpor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCostoGastoImpor=this.idActual;
				
				} else if(this.idCostoGastoImporActual!=null && this.idCostoGastoImporActual!=0L) {
					idCostoGastoImpor=idCostoGastoImporActual;
				}
				
					
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndicePorId(idCostoGastoImpor);
				
				this.costogastoimpors=new ArrayList<CostoGastoImpor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					costogastoimporLogic.getEntity(idCostoGastoImpor);
					
					//costogastoimporLogic.getEntityWithConnection(idCostoGastoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costogastoimporLogic.setCostoGastoImpors(new ArrayList<CostoGastoImpor>());
					costogastoimporLogic.getCostoGastoImpors().add(costogastoimporLogic.getCostoGastoImpor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costogastoimpors=new ArrayList<CostoGastoImpor>();
					this.costogastoimpors.add(costogastoimpor);
				}
				
				if(costogastoimporLogic.getCostoGastoImpor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costogastoimporLogic.getCostoGastoImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costogastoimporLogic.getCostoGastoImpors()==null||costogastoimporLogic.getCostoGastoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costogastoimpors==null|| costogastoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporsAux=new ArrayList<CostoGastoImpor>();
						costogastoimporsAux.addAll(costogastoimporLogic.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimporsAux=new ArrayList<CostoGastoImpor>();
							costogastoimporsAux.addAll(costogastoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costogastoimporLogic.getCostoGastoImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostoGastoImpors("FK_IdEmpresa",costogastoimporLogic.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostoGastoImpors("FK_IdEmpresa",costogastoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporLogic.setCostoGastoImpors(new ArrayList<CostoGastoImpor>());
						costogastoimporLogic.getCostoGastoImpors().addAll(costogastoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimpors=new ArrayList<CostoGastoImpor>();
							costogastoimpors.addAll(costogastoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costogastoimporLogic.getCostoGastoImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costogastoimporLogic.getCostoGastoImpors()==null||costogastoimporLogic.getCostoGastoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costogastoimpors==null|| costogastoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporsAux=new ArrayList<CostoGastoImpor>();
						costogastoimporsAux.addAll(costogastoimporLogic.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimporsAux=new ArrayList<CostoGastoImpor>();
							costogastoimporsAux.addAll(costogastoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costogastoimporLogic.getCostoGastoImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostoGastoImpors("FK_IdSucursal",costogastoimporLogic.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostoGastoImpors("FK_IdSucursal",costogastoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporLogic.setCostoGastoImpors(new ArrayList<CostoGastoImpor>());
						costogastoimporLogic.getCostoGastoImpors().addAll(costogastoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimpors=new ArrayList<CostoGastoImpor>();
							costogastoimpors.addAll(costogastoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCostoGastoImpor")) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdTipoCostoGastoImpor(id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					costogastoimporLogic.getCostoGastoImporsFK_IdTipoCostoGastoImpor(finalQueryGlobal,pagination,id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdTipoCostoGastoImpor(id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdTipoCostoGastoImpor(id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=costogastoimporLogic.getCostoGastoImpors()==null||costogastoimporLogic.getCostoGastoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=costogastoimpors==null|| costogastoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporsAux=new ArrayList<CostoGastoImpor>();
						costogastoimporsAux.addAll(costogastoimporLogic.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimporsAux=new ArrayList<CostoGastoImpor>();
							costogastoimporsAux.addAll(costogastoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							costogastoimporLogic.getCostoGastoImporsFK_IdTipoCostoGastoImpor(finalQueryGlobal,pagination,id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdTipoCostoGastoImpor(id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CostoGastoImporConstantesFunciones.getDetalleIndiceFK_IdTipoCostoGastoImpor(id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCostoGastoImpors("FK_IdTipoCostoGastoImpor",costogastoimporLogic.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCostoGastoImpors("FK_IdTipoCostoGastoImpor",costogastoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporLogic.setCostoGastoImpors(new ArrayList<CostoGastoImpor>());
						costogastoimporLogic.getCostoGastoImpors().addAll(costogastoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimpors=new ArrayList<CostoGastoImpor>();
							costogastoimpors.addAll(costogastoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCostoGastoImpor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCostoGastoImpor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=costogastoimporLogic.getCostoGastoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=costogastoimpors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=costogastoimporLogic.getCostoGastoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=costogastoimpors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CostoGastoImpor costogastoimpor) {
		Boolean permite=true;
		
		if(this.costogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CostoGastoImporConstantesFunciones.getOrderByListaCostoGastoImpor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CostoGastoImporConstantesFunciones.getOrderByListaCostoGastoImpor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CostoGastoImpor costogastoimpor:costogastoimporLogic.getCostoGastoImpors()) {
				if(costogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					costogastoimporTotales=costogastoimpor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CostoGastoImpor costogastoimpor:this.costogastoimpors) {
				if(costogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					costogastoimporTotales=costogastoimpor;
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
			this.costogastoimporAux=new CostoGastoImpor();
			this.costogastoimporAux.setsType(Constantes2.S_TOTALES);
			this.costogastoimporAux.setIsNew(false);
			this.costogastoimporAux.setIsChanged(false);
			this.costogastoimporAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CostoGastoImporConstantesFunciones.TotalizarValoresFilaCostoGastoImpor(this.costogastoimporLogic.getCostoGastoImpors(),this.costogastoimporAux);
				
				this.costogastoimporLogic.getCostoGastoImpors().add(this.costogastoimporAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CostoGastoImporConstantesFunciones.TotalizarValoresFilaCostoGastoImpor(this.costogastoimpors,this.costogastoimporAux);
				
				this.costogastoimpors.add(this.costogastoimporAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		costogastoimporTotales=new CostoGastoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.costogastoimporLogic.getCostoGastoImpors().remove(costogastoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.costogastoimpors.remove(costogastoimporTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		costogastoimporTotales=new CostoGastoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CostoGastoImpor costogastoimpor:costogastoimporLogic.getCostoGastoImpors()) {
				if(costogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					costogastoimporTotales=costogastoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CostoGastoImporConstantesFunciones.TotalizarValoresFilaCostoGastoImpor(this.costogastoimporLogic.getCostoGastoImpors(),costogastoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CostoGastoImpor costogastoimpor:this.costogastoimpors) {
				if(costogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					costogastoimporTotales=costogastoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CostoGastoImporConstantesFunciones.TotalizarValoresFilaCostoGastoImpor(this.costogastoimpors,costogastoimporTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCostoGastoImporsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostoGastoImporsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCostoGastoImporsFK_IdTipoCostoGastoImpor()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCostoGastoImpor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCostoGastoImporsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costogastoimporLogic.getCostoGastoImporsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostoGastoImporsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costogastoimporLogic.getCostoGastoImporsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCostoGastoImporsFK_IdTipoCostoGastoImpor(String sFinalQuery,Long id_tipo_costo_gasto_impor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costogastoimporLogic.getCostoGastoImporsFK_IdTipoCostoGastoImpor(sFinalQuery,this.pagination,id_tipo_costo_gasto_impor);
				
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
	
	public void inicializarPermisosCostoGastoImpor() {
		this.isPermisoTodoCostoGastoImpor=false;
		this.isPermisoNuevoCostoGastoImpor=false;
		this.isPermisoActualizarCostoGastoImpor=false;
		this.isPermisoActualizarOriginalCostoGastoImpor=false;
		this.isPermisoEliminarCostoGastoImpor=false;
		this.isPermisoGuardarCambiosCostoGastoImpor=false;
		this.isPermisoConsultaCostoGastoImpor=false;
		this.isPermisoBusquedaCostoGastoImpor=false;
		this.isPermisoReporteCostoGastoImpor=false;		
		this.isPermisoOrdenCostoGastoImpor=false;		
		this.isPermisoPaginacionMedioCostoGastoImpor=false;		
		this.isPermisoPaginacionAltoCostoGastoImpor=false;
		this.isPermisoPaginacionTodoCostoGastoImpor=false;
		this.isPermisoCopiarCostoGastoImpor=false;		
		this.isPermisoVerFormCostoGastoImpor=false;		
		this.isPermisoDuplicarCostoGastoImpor=false;		
		this.isPermisoOrdenCostoGastoImpor=false;		
	}
	
	public void setPermisosUsuarioCostoGastoImpor(Boolean isPermiso) {
		this.isPermisoTodoCostoGastoImpor=isPermiso;
		this.isPermisoNuevoCostoGastoImpor=isPermiso;
		this.isPermisoActualizarCostoGastoImpor=isPermiso;
		this.isPermisoActualizarOriginalCostoGastoImpor=isPermiso;
		this.isPermisoEliminarCostoGastoImpor=isPermiso;
		this.isPermisoGuardarCambiosCostoGastoImpor=isPermiso;
		this.isPermisoConsultaCostoGastoImpor=isPermiso;
		this.isPermisoBusquedaCostoGastoImpor=isPermiso;
		this.isPermisoReporteCostoGastoImpor=isPermiso;
		this.isPermisoOrdenCostoGastoImpor=isPermiso;		
		this.isPermisoPaginacionMedioCostoGastoImpor=isPermiso;		
		this.isPermisoPaginacionAltoCostoGastoImpor=isPermiso;		
		this.isPermisoPaginacionTodoCostoGastoImpor=isPermiso;		
		this.isPermisoCopiarCostoGastoImpor=isPermiso;		
		this.isPermisoVerFormCostoGastoImpor=isPermiso;		
		this.isPermisoDuplicarCostoGastoImpor=isPermiso;
		this.isPermisoOrdenCostoGastoImpor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCostoGastoImpor(Boolean isPermiso) {
		//this.isPermisoTodoCostoGastoImpor=isPermiso;
		this.isPermisoNuevoCostoGastoImpor=isPermiso;
		this.isPermisoActualizarCostoGastoImpor=isPermiso;
		this.isPermisoActualizarOriginalCostoGastoImpor=isPermiso;
		this.isPermisoEliminarCostoGastoImpor=isPermiso;
		this.isPermisoGuardarCambiosCostoGastoImpor=isPermiso;
		//this.isPermisoConsultaCostoGastoImpor=isPermiso;
		//this.isPermisoBusquedaCostoGastoImpor=isPermiso;
		//this.isPermisoReporteCostoGastoImpor=isPermiso;
		//this.isPermisoOrdenCostoGastoImpor=isPermiso;		
		//this.isPermisoPaginacionMedioCostoGastoImpor=isPermiso;		
		//this.isPermisoPaginacionAltoCostoGastoImpor=isPermiso;		
		//this.isPermisoPaginacionTodoCostoGastoImpor=isPermiso;		
		//this.isPermisoCopiarCostoGastoImpor=isPermiso;		
		//this.isPermisoDuplicarCostoGastoImpor=isPermiso;
		//this.isPermisoOrdenCostoGastoImpor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCostoGastoImporClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION);
		
		if(CostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDetalleLiquidacionImpor=this.verificarGetPermisosUsuarioOpcionCostoGastoImporClaseRelacionada(this.opcionsRelacionadas,DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCostoGastoImpor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCostoGastoImporClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleLiquidacionImpor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCostoGastoImporClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCostoGastoImporClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCostoGastoImporClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleLiquidacionImpor && this.jInternalFrameDetalleFormCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.remove(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCostoGastoImpor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CostoGastoImporConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCostoGastoImpor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCostoGastoImpor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCostoGastoImpor=this.isPermisoActualizarCostoGastoImpor;
			this.isPermisoEliminarCostoGastoImpor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCostoGastoImpor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCostoGastoImpor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCostoGastoImpor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCostoGastoImpor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCostoGastoImpor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCostoGastoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCostoGastoImpor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCostoGastoImpor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCostoGastoImpor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCostoGastoImpor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCostoGastoImpor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCostoGastoImpor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCostoGastoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCostoGastoImpor.setToolTipText(this.jTableDatosCostoGastoImpor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCostoGastoImpor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCostoGastoImpor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCostoGastoImpor() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleLiquidacionImpor && this.costogastoimporConstantesFunciones.mostrarDetalleLiquidacionImporCostoGastoImpor && !CostoGastoImporConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyCostoGastoImporListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipocostogastoimporsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCostoGastoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CostoGastoImporJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCostoGastoImporListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCostoGastoImporListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoCostoGastoImporListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocostogastoimporsForeignKey==null||this.tipocostogastoimporsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCostoGastoImporConstantesFunciones.getArrayColumnasGlobalesTipoCostoGastoImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCostoGastoImporConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCostoGastoImporConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCostoGastoImporsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCostoGastoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CostoGastoImporParameterReturnGeneral costogastoimporReturnGeneral=new CostoGastoImporParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.costogastoimporConstantesFunciones.cargarid_empresaCostoGastoImpor)
					 || (this.esRecargarFks && this.costogastoimporConstantesFunciones.cargarid_empresaCostoGastoImpor)) {

					if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+costogastoimporSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.costogastoimporConstantesFunciones.cargarid_sucursalCostoGastoImpor)
					 || (this.esRecargarFks && this.costogastoimporConstantesFunciones.cargarid_sucursalCostoGastoImpor)) {

					if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+costogastoimporSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoCostoGastoImpor="";

				if(((this.tipocostogastoimporsForeignKey==null||this.tipocostogastoimporsForeignKey.size()<=0) && this.costogastoimporConstantesFunciones.cargarid_tipo_costo_gasto_imporCostoGastoImpor)
					 || (this.esRecargarFks && this.costogastoimporConstantesFunciones.cargarid_tipo_costo_gasto_imporCostoGastoImpor)) {

					if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionTipoCostoGastoImpor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCostoGastoImporConstantesFunciones.getArrayColumnasGlobalesTipoCostoGastoImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCostoGastoImpor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCostoGastoImporConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCostoGastoImpor=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCostoGastoImpor, "");
						finalQueryGlobalTipoCostoGastoImpor+=TipoCostoGastoImporConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCostoGastoImporsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCostoGastoImpor=" WHERE " + ConstantesSql.ID + "="+costogastoimporSessionBean.getlidTipoCostoGastoImporActual();
					}
				} else {
					finalQueryGlobalTipoCostoGastoImpor="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				costogastoimporReturnGeneral=costogastoimporLogic.cargarCombosLoteForeignKeyCostoGastoImpor(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoCostoGastoImpor);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=costogastoimporReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=costogastoimporReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoCostoGastoImpor.equals("NONE")) {
				this.tipocostogastoimporsForeignKey=costogastoimporReturnGeneral.gettipocostogastoimporsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCostoGastoImpor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoCostoGastoImpor();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.costogastoimporSessionBean==null) {
				this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
			}

			if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTipoCostoGastoImpor()throws Exception {
		try {

			if(!this.costogastoimporSessionBean.getisBusquedaDesdeForeignKeySesionTipoCostoGastoImpor()) {
				TipoCostoGastoImpor tipocostogastoimpor=new TipoCostoGastoImpor();
				TipoCostoGastoImporConstantesFunciones.setTipoCostoGastoImporDescripcion(tipocostogastoimpor,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocostogastoimpor.setId(null);

				if(!TipoCostoGastoImporConstantesFunciones.ExisteEnLista(this.tipocostogastoimporsForeignKey,tipocostogastoimpor,true)) {

					this.tipocostogastoimporsForeignKey.add(0,tipocostogastoimpor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCostoGastoImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCostoGastoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCostoGastoImpor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCostoGastoImpor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCostoGastoImpor(CostoGastoImpor costogastoimpor)throws Exception {	
		try {
			
			this.setActualTipoCostoGastoImporForeignKey(costogastoimpor.getid_tipo_costo_gasto_impor(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCostoGastoImpor(CostoGastoImpor costogastoimpor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCostoGastoImpor()throws Exception {	
		try {
			
			this.setActualTipoCostoGastoImporForeignKey(this.costogastoimporConstantesFunciones.getid_tipo_costo_gasto_impor(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCostoGastoImpor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCostoGastoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCostoGastoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCostoGastoImpor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCostoGastoImpor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoCostoGastoImporsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCostoGastoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCostoGastoImporsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCostoGastoImpor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CostoGastoImporBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CostoGastoImporBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CostoGastoImporBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.costogastoimporSessionBean=new CostoGastoImporSessionBean(); 
		this.costogastoimporConstantesFunciones=new CostoGastoImporConstantesFunciones(); 
		this.costogastoimporBean=new CostoGastoImpor();//(this.costogastoimporConstantesFunciones); 		
		this.costogastoimporReturnGeneral=new CostoGastoImporParameterReturnGeneral(); 
		
		this.costogastoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.costogastoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CostoGastoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CostoGastoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CostoGastoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCostoGastoImpor(true);
			
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
			
			this.costogastoimporConstantesFunciones=new CostoGastoImporConstantesFunciones(); 
			this.costogastoimporBean=new CostoGastoImpor();//this.costogastoimporConstantesFunciones); 			
			this.costogastoimporReturnGeneral=new CostoGastoImporParameterReturnGeneral(); 
		
			CostoGastoImporBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Costo Gasto Impor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.costogastoimpor=new CostoGastoImpor();
			this.costogastoimpors = new ArrayList<CostoGastoImpor>();
			this.costogastoimporsAux = new ArrayList<CostoGastoImpor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic=new CostoGastoImporLogic();
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.costogastoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.costogastoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCostoGastoImpor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCostoGastoImpor);	
					}
					
					if(this.jInternalFrameImportacionCostoGastoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCostoGastoImpor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCostoGastoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCostoGastoImpor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCostoGastoImpor);
				this.jInternalFrameDetalleFormCostoGastoImpor.setVisible(false);
				this.jInternalFrameDetalleFormCostoGastoImpor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCostoGastoImpor);
					this.jInternalFrameReporteDinamicoCostoGastoImpor.setVisible(false);
					this.jInternalFrameReporteDinamicoCostoGastoImpor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCostoGastoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCostoGastoImpor);
					this.jInternalFrameImportacionCostoGastoImpor.setVisible(false);
					this.jInternalFrameImportacionCostoGastoImpor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCostoGastoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCostoGastoImpor);
					this.jInternalFrameOrderByCostoGastoImpor.setVisible(false);
					this.jInternalFrameOrderByCostoGastoImpor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCostoGastoImporActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CostoGastoImporConstantesFunciones.INUMEROPAGINACION;
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
			
			this.costogastoimporReturnGeneral=new CostoGastoImporParameterReturnGeneral();
			
			this.costogastoimporParameterGeneral=new CostoGastoImporParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.costogastoimporLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CostoGastoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.costogastoimporSessionBean.getEsGuardarRelacionado(),this.costogastoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CostoGastoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.costogastoimporSessionBean.getEsGuardarRelacionado(),this.costogastoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCostoGastoImpor=false;
			this.isVisibilidadCeldaDuplicarCostoGastoImpor=true;
			this.isVisibilidadCeldaCopiarCostoGastoImpor=true;
			this.isVisibilidadCeldaVerFormCostoGastoImpor=true;
			this.isVisibilidadCeldaOrdenCostoGastoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoCostoGastoImpor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCostoGastoImpor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCostoGastoImpor(false);
			
			this.setPermisosUsuarioCostoGastoImpor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.costogastoimporSessionBean.getEsGuardarRelacionado() 
				|| (this.costogastoimporSessionBean.getEsGuardarRelacionado() && this.costogastoimporSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCostoGastoImporClasesRelacionadas();
			}
			
			if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCostoGastoImporClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCostoGastoImpor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCostoGastoImpor();
			}
			
			if(!this.isPermisoBusquedaCostoGastoImpor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCostoGastoImpor,this.isPermisoPaginacionMedioCostoGastoImpor,this.isPermisoPaginacionTodoCostoGastoImpor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CostoGastoImporConstantesFunciones.getTiposSeleccionarCostoGastoImpor());
				
				this.tiposColumnasSelect=CostoGastoImporConstantesFunciones.getTiposSeleccionarCostoGastoImpor(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCostoGastoImpor();				
				//this.tiposRelacionesSelect=CostoGastoImporConstantesFunciones.getTiposRelacionesCostoGastoImpor(true);
				
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
			//if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCostoGastoImpor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCostoGastoImpor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCostoGastoImpor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCostoGastoImpor() ;
			
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
			this.tipocostogastoimporLogic=new TipoCostoGastoImporLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				costogastoimporImplementable= (CostoGastoImporImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CostoGastoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				costogastoimporImplementableHome= (CostoGastoImporImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CostoGastoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.costogastoimpors= new ArrayList<CostoGastoImpor>();
			this.costogastoimporsEliminados= new ArrayList<CostoGastoImpor>();
						
			this.isEsNuevoCostoGastoImpor=false;
			this.esParaAccionDesdeFormularioCostoGastoImpor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipocostogastoimporsForeignKey=new ArrayList<TipoCostoGastoImpor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCostoGastoImpor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCostoGastoImpor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CostoGastoImporBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CostoGastoImporConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCostoGastoImpor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCostoGastoImpor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCostoGastoImpor();
			}
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCostoGastoImpor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCostoGastoImpor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCostoGastoImpor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCostoGastoImpor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CostoGastoImpor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCostoGastoImpor() {
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
			if(sTipo.equals("RelacionesCostoGastoImpor")) {
				iIndex=this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Liquidacion Impores")) {
					if(!DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCostoGastoImpor();

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
				this.finishProcessCostoGastoImpor();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleLiquidacionImpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCostoGastoImpor.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(false,true,iIndex);
		this.jButtonDetalleLiquidacionImporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleLiquidacionImpor();

		//this.jTabbedPaneRelacionesCostoGastoImpor.updateUI();
		//this.jTabbedPaneRelacionesCostoGastoImpor.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCostoGastoImpor.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleLiquidacionImpor")) {
				int row=this.jTableDatosCostoGastoImpor.getSelectedRow();
				jButtonDetalleLiquidacionImporActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Liquidacion Impor")) {

					if(this.isTienePermisosDetalleLiquidacionImpor && this.costogastoimporConstantesFunciones.mostrarDetalleLiquidacionImporCostoGastoImpor && !CostoGastoImporConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Liquidacion Impores"+"("+DetalleLiquidacionImporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Liquidacion Impores");

						if(costogastoimporConstantesFunciones.resaltarDetalleLiquidacionImporCostoGastoImpor!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(costogastoimporConstantesFunciones.resaltarDetalleLiquidacionImporCostoGastoImpor);
						}

						jmenuItem.setEnabled(this.costogastoimporConstantesFunciones.activarDetalleLiquidacionImporCostoGastoImpor);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleLiquidacionImpor"));

						

						this.jInternalFrameDetalleFormCostoGastoImpor.jmenuDetalleCostoGastoImpor.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCostoGastoImpor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCostoGastoImpor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCostoGastoImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCostoGastoImporListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCostoGastoImpor();
		
		this.cargarCombosFrameForeignKeyCostoGastoImpor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCostoGastoImpor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCostoGastoImpor();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoCostoGastoImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCostoGastoImporListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCostoGastoImpor();
				this.cargarCombosFrameTipoCostoGastoImporsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCostoGastoImpor(this.tipocostogastoimporsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCostoGastoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
			
			if(jTableDatosCostoGastoImpor.getRowCount()>=1) {
				jTableDatosCostoGastoImpor.removeRowSelectionInterval(0, jTableDatosCostoGastoImpor.getRowCount()-1);						
			}
			
			this.isEsNuevoCostoGastoImpor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCostoGastoImpor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCostoGastoImpor(true);			
			//this.costogastoimpor=new CostoGastoImpor();
			//this.costogastoimpor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCostoGastoImpor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCostoGastoImpor() ;
			
			if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCostoGastoImpor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.costogastoimpor);	
			this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);				
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
			if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CostoGastoImpor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCostoGastoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCostoGastoImpor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCostoGastoImpor.getSelectedRows().length;			
			}
			
			costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCostoGastoImpor--;			
				//CostoGastoImpor costogastoimporAux= new CostoGastoImpor();			
				//costogastoimporAux.setId(this.iIdNuevoCostoGastoImpor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CostoGastoImpor costogastoimporOrigen=new CostoGastoImpor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CostoGastoImpor costogastoimporOrigen : costogastoimporsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							costogastoimporOrigen =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							costogastoimporOrigen =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCostoGastoImpor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.costogastoimpor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCostoGastoImpor(costogastoimporOrigen,this.costogastoimpor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.costogastoimporLogic.getCostoGastoImpors().add(this.costogastoimporAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.costogastoimpors.add(this.costogastoimporAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCostoGastoImpor(false);
				
				this.jTableDatosCostoGastoImpor.setRowSelectionInterval(this.getIndiceNuevoCostoGastoImpor(), this.getIndiceNuevoCostoGastoImpor());
				
				int iLastRow =  this.jTableDatosCostoGastoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCostoGastoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCostoGastoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCostoGastoImpor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();									
		
			CostoGastoImpor costogastoimporOrigen=new CostoGastoImpor();
			CostoGastoImpor costogastoimporDestino=new CostoGastoImpor();
				
			costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCostoGastoImpor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || costogastoimporsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCostoGastoImpor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporOrigen =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						costogastoimporOrigen =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						costogastoimporDestino =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						costogastoimporDestino =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				costogastoimporOrigen =costogastoimporsSeleccionados.get(0);
				costogastoimporDestino =costogastoimporsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCostoGastoImpor(costogastoimporOrigen,costogastoimporDestino,true,false);
				
				costogastoimporDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(costogastoimporDestino,costogastoimporLogic.getCostoGastoImpors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(costogastoimporDestino,costogastoimpors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCostoGastoImpor(false);
				
				//this.jTableDatosCostoGastoImpor.setRowSelectionInterval(this.getIndiceNuevoCostoGastoImpor(), this.getIndiceNuevoCostoGastoImpor());
				
				int iLastRow =  this.jTableDatosCostoGastoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCostoGastoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCostoGastoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCostoGastoImpor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCostoGastoImpor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCostoGastoImpor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCostoGastoImpor.setVisible(!isVisible);
			this.jPanelPaginacionCostoGastoImpor.setVisible(!isVisible);
			this.jPanelAccionesCostoGastoImpor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCostoGastoImpor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCostoGastoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCostoGastoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCostoGastoImpor();
			
			this.abrirFrameOrderByCostoGastoImpor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCostoGastoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCostoGastoImpor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCostoGastoImpor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCostoGastoImpor.isMaximum()) {
					this.jInternalFrameDetalleFormCostoGastoImpor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCostoGastoImpor.setSize(this.jInternalFrameDetalleFormCostoGastoImpor.iWidthFormulario,this.jInternalFrameDetalleFormCostoGastoImpor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCostoGastoImpor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCostoGastoImpor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCostoGastoImpor.isMaximum()) {
						this.jInternalFrameDetalleFormCostoGastoImpor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCostoGastoImpor.jContentPaneDetalleCostoGastoImpor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCostoGastoImpor.jContentPaneDetalleCostoGastoImpor.getWidth(),CostoGastoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCostoGastoImpor.jContentPaneDetalleCostoGastoImpor.getWidth(),CostoGastoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCostoGastoImpor.jContentPaneDetalleCostoGastoImpor.getWidth(),CostoGastoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleLiquidacionImpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCostoGastoImpor.setVisible(true);
	        this.jInternalFrameDetalleFormCostoGastoImpor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCostoGastoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCostoGastoImpor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCostoGastoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCostoGastoImpor,false,this);
				} else {
					this.jInternalFrameOrderByCostoGastoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCostoGastoImpor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCostoGastoImpor);
				this.jInternalFrameOrderByCostoGastoImpor.setVisible(false);
				this.jInternalFrameOrderByCostoGastoImpor.setSelected(false);
				
				this.jInternalFrameOrderByCostoGastoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCostoGastoImpor"));
				
				this.inicializarActualizarBindingTablaOrderByCostoGastoImpor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCostoGastoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCostoGastoImpor==null) {
				
				this.jInternalFrameImportacionCostoGastoImpor=new ImportacionJInternalFrame(CostoGastoImporConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCostoGastoImpor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCostoGastoImpor);
				this.jInternalFrameImportacionCostoGastoImpor.setVisible(false);
				this.jInternalFrameImportacionCostoGastoImpor.setSelected(false);


				this.jInternalFrameImportacionCostoGastoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCostoGastoImpor"));
				this.jInternalFrameImportacionCostoGastoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCostoGastoImpor"));
				this.jInternalFrameImportacionCostoGastoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCostoGastoImpor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCostoGastoImpor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCostoGastoImpor==null) {
				this.jInternalFrameReporteDinamicoCostoGastoImpor=new ReporteDinamicoJInternalFrame(CostoGastoImporConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCostoGastoImpor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCostoGastoImpor);
				this.jInternalFrameReporteDinamicoCostoGastoImpor.setVisible(false);
				this.jInternalFrameReporteDinamicoCostoGastoImpor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCostoGastoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCostoGastoImpor"));
				this.jInternalFrameReporteDinamicoCostoGastoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCostoGastoImpor"));
				this.jInternalFrameReporteDinamicoCostoGastoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCostoGastoImpor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCostoGastoImpor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleLiquidacionImpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCostoGastoImpor.jContentPaneDetalleCostoGastoImpor.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCostoGastoImpor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCostoGastoImpor);
			
	       	this.jInternalFrameDetalleFormCostoGastoImpor.setVisible(false);
	        this.jInternalFrameDetalleFormCostoGastoImpor.setSelected(false);
			
			//this.jInternalFrameDetalleFormCostoGastoImpor.dispose();
			//this.jInternalFrameDetalleFormCostoGastoImpor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCostoGastoImpor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCostoGastoImpor.setVisible(true);
	        this.jInternalFrameReporteDinamicoCostoGastoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCostoGastoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCostoGastoImpor.setVisible(true);
	        this.jInternalFrameImportacionCostoGastoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCostoGastoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCostoGastoImpor.setVisible(true);
	        this.jInternalFrameOrderByCostoGastoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCostoGastoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCostoGastoImpor.setVisible(false);
	        this.jInternalFrameOrderByCostoGastoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCostoGastoImpor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCostoGastoImpor.setVisible(false);
	        this.jInternalFrameReporteDinamicoCostoGastoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCostoGastoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCostoGastoImpor.setVisible(false);
	        this.jInternalFrameImportacionCostoGastoImpor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCostoGastoImpor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCostoGastoImpor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCostoGastoImpor(true);
			//this.isEsNuevoCostoGastoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCostoGastoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCostoGastoImpor(false) ;
			
			if(costogastoimporSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() && DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleLiquidacionImporActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCostoGastoImpor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCostoGastoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCostoGastoImporActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCostoGastoImpor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCostoGastoImpor(true);
			//this.isEsNuevoCostoGastoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.costogastoimpor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCostoGastoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCostoGastoImpor(false) ;
			
			if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCostoGastoImpor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCostoGastoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoCostoGastoImpor(List<TipoCostoGastoImpor> tipocostogastoimporsForeignKey)throws Exception{
		TableColumn tableColumnTipoCostoGastoImpor=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR));
		TableCellEditor tableCellEditorTipoCostoGastoImpor =tableColumnTipoCostoGastoImpor.getCellEditor();

		TipoCostoGastoImporTableCell tipocostogastoimporTableCellFk=(TipoCostoGastoImporTableCell)tableCellEditorTipoCostoGastoImpor;

		if(tipocostogastoimporTableCellFk!=null) {
			tipocostogastoimporTableCellFk.settipocostogastoimporsForeignKey(tipocostogastoimporsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCostoGastoImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocostogastoimporTableCellFk.setRowActual(intSelectedRow);
			//tipocostogastoimporTableCellFk.settipocostogastoimporsForeignKeyActual(tipocostogastoimporsForeignKey);
		//}


		if(tipocostogastoimporTableCellFk!=null) {
			tipocostogastoimporTableCellFk.RecargarTipoCostoGastoImporsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCostoGastoImpor(false);
			
			//if(!this.isEsNuevoCostoGastoImpor) {								
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				
			}
			
			if(this.permiteMantenimiento(this.costogastoimpor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCostoGastoImpor=true;
					this.inicializarActualizarBindingTablaCostoGastoImpor(false);
					this.isEsNuevoCostoGastoImpor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCostoGastoImpor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCostoGastoImpor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCostoGastoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCostoGastoImpor(false);
				
				this.habilitarDeshabilitarControlesCostoGastoImpor(false);
			
												
				
				if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCostoGastoImpor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCostoGastoImporActionPerformed(evt,costogastoimporSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCostoGastoImpor(this.costogastoimpor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCostoGastoImpor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,costogastoimporSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.costogastoimpor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				this.costogastoimpor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				this.costogastoimpor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.costogastoimpor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CostoGastoImporModel) this.jTableDatosCostoGastoImpor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCostoGastoImpor=true;
				this.inicializarActualizarBindingTablaCostoGastoImpor(false);
				this.isEsNuevoCostoGastoImpor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCostoGastoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCostoGastoImpor(false);
				
				this.habilitarDeshabilitarControlesCostoGastoImpor(false);
				
				
				
				if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCostoGastoImpor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCostoGastoImpor.getRowCount()>=1) {
				jTableDatosCostoGastoImpor.removeRowSelectionInterval(0, jTableDatosCostoGastoImpor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCostoGastoImpor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCostoGastoImpor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCostoGastoImpor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCostoGastoImpor(false) ;
			
			this.isEsNuevoCostoGastoImpor=false;
			
			if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCostoGastoImpor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCostoGastoImpor(false);
				
				//SI ES MANUAL
				if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCostoGastoImpor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCostoGastoImpor--;			
			//CostoGastoImpor costogastoimporAux= new CostoGastoImpor();			
			//costogastoimporAux.setId(this.iIdNuevoCostoGastoImpor);
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCostoGastoImpor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
			
			this.costogastoimpor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.costogastoimporLogic.getCostoGastoImpors().add(this.costogastoimporAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.costogastoimpors.add(this.costogastoimporAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCostoGastoImpor(false);
			
			this.jTableDatosCostoGastoImpor.setRowSelectionInterval(this.getIndiceNuevoCostoGastoImpor(), this.getIndiceNuevoCostoGastoImpor());
			
			int iLastRow =  this.jTableDatosCostoGastoImpor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCostoGastoImpor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCostoGastoImpor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCostoGastoImpor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCostoGastoImpor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCostoGastoImpor(false);
			
			//SI ES MANUAL
			if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCostoGastoImpor();
			}
			
			//this.abrirFrameTreeCostoGastoImpor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Costo Gasto ImporES ?", "MANTENIMIENTO DE Costo Gasto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCostoGastoImpor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCostoGastoImpor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.costogastoimporReturnGeneral=costogastoimporLogic.procesarImportacionCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.costogastoimporParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCostoGastoImporReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCostoGastoImpor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCostoGastoImpor.setFileImportacion(this.jInternalFrameImportacionCostoGastoImpor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCostoGastoImpor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCostoGastoImpor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCostoGastoImpor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCostoGastoImpor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		

		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CostoGastoImporBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CostoGastoImporBaseDesign.jrxml";
			
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
			
			this.generarReporteCostoGastoImpors("Todos",costogastoimporsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCostoGastoImpor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCostoGastoImpor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCostoGastoImpor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCostoGastoImpor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nAgrupa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nAgrupa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nAgrupa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nAgrupa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nProrratea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nProrratea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nProrratea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nProrratea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nFlete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nFlete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nFlete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nFlete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONARANCEL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nArancel_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nArancel_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nArancel_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nArancel_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONSEGURO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nSeguro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nSeguro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nSeguro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nSeguro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nTotalGeneral_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nTotalGeneral_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nTotalGeneral_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nTotalGeneral_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nDigitado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nDigitado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nDigitado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nDigitado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCostoGastoImpor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR:
					sNombreCampoCategoria="id_tipo_costo_gasto_impor";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="es_activo";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA:
					sNombreCampoCategoria="con_agrupa";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA:
					sNombreCampoCategoria="con_prorratea";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFACTURA:
					sNombreCampoCategoria="con_factura";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFLETE:
					sNombreCampoCategoria="con_flete";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONARANCEL:
					sNombreCampoCategoria="con_arancel";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONSEGURO:
					sNombreCampoCategoria="con_seguro";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL:
					sNombreCampoCategoria="con_total_general";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO:
					sNombreCampoCategoria="con_digitado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR:
					sNombreCampoCategoriaValor="id_tipo_costo_gasto_impor";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="es_activo";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA:
					sNombreCampoCategoriaValor="con_agrupa";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA:
					sNombreCampoCategoriaValor="con_prorratea";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFACTURA:
					sNombreCampoCategoriaValor="con_factura";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFLETE:
					sNombreCampoCategoriaValor="con_flete";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONARANCEL:
					sNombreCampoCategoriaValor="con_arancel";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONSEGURO:
					sNombreCampoCategoriaValor="con_seguro";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL:
					sNombreCampoCategoriaValor="con_total_general";
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO:
					sNombreCampoCategoriaValor="con_digitado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Costo Gasto Impor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_costo_gasto_impor");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_activo");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Agrupa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_agrupa");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Prorratea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_prorratea");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_factura");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_flete");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONARANCEL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Arancel",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_arancel");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONSEGURO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Seguro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_seguro");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Total General",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_total_general");
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Digitado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_digitado");
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
	
	public void jButtonGenerarExcelReporteDinamicoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costogastoimpor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CostoGastoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.gettipocostogastoimpor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getes_activo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getcon_agrupa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getcon_prorratea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONFACTURA);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getcon_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONFLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONFLETE);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getcon_flete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONARANCEL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONARANCEL);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getcon_arancel());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONSEGURO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONSEGURO);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getcon_seguro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getcon_total_general());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO);
					iRow++;

					for(CostoGastoImpor costogastoimpor:costogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(costogastoimpor.getcon_digitado());
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
			//	this.getFilaCabeceraExportarExcelCostoGastoImpor(row);				
			//	iRow++;
			//}				
			
			//for(CostoGastoImpor costogastoimporAux:costogastoimporsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCostoGastoImpor(costogastoimporAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
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
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCostoGastoImpor(false);
			
			//SI ES MANUAL
			if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCostoGastoImpor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCostoGastoImpor(false);
			
			//SI ES MANUAL
			if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCostoGastoImpor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCostoGastoImpor(false);
			
			//SI ES MANUAL
			if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCostoGastoImpor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCostoGastoImpor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCostoGastoImpor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCostoGastoImpor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCostoGastoImpor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCostoGastoImpor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCostoGastoImpor.setMinimumSize(dimensionMinimum);
		this.jTableDatosCostoGastoImpor.setMaximumSize(dimensionMaximum);
		this.jTableDatosCostoGastoImpor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCostoGastoImpor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCostoGastoImpor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCostoGastoImpor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCostoGastoImpor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCostoGastoImpor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCostoGastoImpor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCostoGastoImpor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCostoGastoImpor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCostoGastoImpor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCostoGastoImpor();
		
		this.inicializarActualizarBindingBotonesManualCostoGastoImpor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCostoGastoImpor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCostoGastoImpor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCostoGastoImpor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCostoGastoImpor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCostoGastoImpor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCostoGastoImpor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCostoGastoImpor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxPostAccionNuevoCostoGastoImpor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxPostAccionSinCerrarCostoGastoImpor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxPostAccionSinMensajeCostoGastoImpor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCostoGastoImpor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCostoGastoImpor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCostoGastoImpor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
				this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxPostAccionNuevoCostoGastoImpor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxPostAccionSinCerrarCostoGastoImpor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxPostAccionSinMensajeCostoGastoImpor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCostoGastoImpor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCostoGastoImpor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCostoGastoImpor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCostoGastoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCostoGastoImpor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCostoGastoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCostoGastoImpor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCostoGastoImpor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCostoGastoImpor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCostoGastoImpor(Boolean esInicializar) throws Exception {
		try	{	
			if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCostoGastoImpor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCostoGastoImpor() throws Exception {
		try	{
			if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCostoGastoImpor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCostoGastoImpor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCostoGastoImpor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCostoGastoImpor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCostoGastoImpor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCostoGastoImpor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCostoGastoImpor.addItem(reporte);
			}
			
			
			if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCostoGastoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCostoGastoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCostoGastoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCostoGastoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCostoGastoImpor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCostoGastoImpor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCostoGastoImpor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCostoGastoImpor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
				this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
				this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCostoGastoImpor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
				
				if(this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCostoGastoImpor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCostoGastoImpor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.getSelectedItem()!=null){this.id_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor=((TipoCostoGastoImpor)this.jComboBoxid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImporCostoGastoImpor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCostoGastoImpor(Boolean esInicializar) throws Exception {				
		if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCostoGastoImpor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCostoGastoImpor() throws Exception {
		this.inicializarActualizarBindingTablaCostoGastoImpor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCostoGastoImpor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCostoGastoImporOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImporOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCostoGastoImpor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=costogastoimporLogic.getCostoGastoImpors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=costogastoimpors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCostoGastoImpor.setModel(new CostoGastoImporModel(this.costogastoimporLogic.getCostoGastoImpors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCostoGastoImpor.setModel(new CostoGastoImporModel(this.costogastoimpors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCostoGastoImpor!=null && this.jInternalFrameOrderByCostoGastoImpor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCostoGastoImpor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO,costogastoimporConstantesFunciones.resaltarSeleccionarCostoGastoImpor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO,costogastoimporConstantesFunciones.resaltarSeleccionarCostoGastoImpor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_ID));

		if(this.costogastoimporConstantesFunciones.mostraridCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.costogastoimporConstantesFunciones.resaltaridCostoGastoImpor,this.costogastoimporConstantesFunciones.activaridCostoGastoImpor,this,true,"idCostoGastoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.costogastoimporConstantesFunciones.resaltaridCostoGastoImpor,this.costogastoimporConstantesFunciones.activaridCostoGastoImpor,this,true,"idCostoGastoImpor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA));

		if(this.costogastoimporConstantesFunciones.mostrarid_empresaCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.costogastoimporConstantesFunciones.resaltarid_empresaCostoGastoImpor,this,this.costogastoimporConstantesFunciones.activarid_empresaCostoGastoImpor));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.costogastoimporConstantesFunciones.resaltarid_empresaCostoGastoImpor,this,this.costogastoimporConstantesFunciones.activarid_empresaCostoGastoImpor,false,"id_empresaCostoGastoImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.costogastoimporConstantesFunciones.mostrarid_sucursalCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.costogastoimporConstantesFunciones.resaltarid_sucursalCostoGastoImpor,this,this.costogastoimporConstantesFunciones.activarid_sucursalCostoGastoImpor));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.costogastoimporConstantesFunciones.resaltarid_sucursalCostoGastoImpor,this,this.costogastoimporConstantesFunciones.activarid_sucursalCostoGastoImpor,false,"id_sucursalCostoGastoImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR));

		if(this.costogastoimporConstantesFunciones.mostrarid_tipo_costo_gasto_imporCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCostoGastoImporTableCell(this.tipocostogastoimporsForeignKey,this.costogastoimporConstantesFunciones.resaltarid_tipo_costo_gasto_imporCostoGastoImpor,this,this.costogastoimporConstantesFunciones.activarid_tipo_costo_gasto_imporCostoGastoImpor));
			tableColumn.setCellEditor(new TipoCostoGastoImporTableCell(this.tipocostogastoimporsForeignKey,this.costogastoimporConstantesFunciones.resaltarid_tipo_costo_gasto_imporCostoGastoImpor,this,this.costogastoimporConstantesFunciones.activarid_tipo_costo_gasto_imporCostoGastoImpor,true,"id_tipo_costo_gasto_imporCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_NOMBRE));

		if(this.costogastoimporConstantesFunciones.mostrarnombreCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.costogastoimporConstantesFunciones.resaltarnombreCostoGastoImpor,this.costogastoimporConstantesFunciones.activarnombreCostoGastoImpor,this,true,"nombreCostoGastoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.costogastoimporConstantesFunciones.resaltarnombreCostoGastoImpor,this.costogastoimporConstantesFunciones.activarnombreCostoGastoImpor,this,true,"nombreCostoGastoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_ESACTIVO));

		if(this.costogastoimporConstantesFunciones.mostrares_activoCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltares_activoCostoGastoImpor,this.costogastoimporConstantesFunciones.activares_activoCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltares_activoCostoGastoImpor,this.costogastoimporConstantesFunciones.activares_activoCostoGastoImpor,this,true,"es_activoCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA));

		if(this.costogastoimporConstantesFunciones.mostrarcon_agrupaCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltarcon_agrupaCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_agrupaCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltarcon_agrupaCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_agrupaCostoGastoImpor,this,true,"con_agrupaCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA));

		if(this.costogastoimporConstantesFunciones.mostrarcon_prorrateaCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltarcon_prorrateaCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_prorrateaCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltarcon_prorrateaCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_prorrateaCostoGastoImpor,this,true,"con_prorrateaCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_CONFACTURA));

		if(this.costogastoimporConstantesFunciones.mostrarcon_facturaCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_CONFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltarcon_facturaCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_facturaCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltarcon_facturaCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_facturaCostoGastoImpor,this,true,"con_facturaCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_CONFLETE));

		if(this.costogastoimporConstantesFunciones.mostrarcon_fleteCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_CONFLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltarcon_fleteCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_fleteCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltarcon_fleteCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_fleteCostoGastoImpor,this,true,"con_fleteCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_CONARANCEL));

		if(this.costogastoimporConstantesFunciones.mostrarcon_arancelCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_CONARANCEL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltarcon_arancelCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_arancelCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltarcon_arancelCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_arancelCostoGastoImpor,this,true,"con_arancelCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_CONSEGURO));

		if(this.costogastoimporConstantesFunciones.mostrarcon_seguroCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_CONSEGURO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltarcon_seguroCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_seguroCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltarcon_seguroCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_seguroCostoGastoImpor,this,true,"con_seguroCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL));

		if(this.costogastoimporConstantesFunciones.mostrarcon_total_generalCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltarcon_total_generalCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_total_generalCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltarcon_total_generalCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_total_generalCostoGastoImpor,this,true,"con_total_generalCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO));

		if(this.costogastoimporConstantesFunciones.mostrarcon_digitadoCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.costogastoimporConstantesFunciones.resaltarcon_digitadoCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_digitadoCostoGastoImpor));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.costogastoimporConstantesFunciones.resaltarcon_digitadoCostoGastoImpor,this.costogastoimporConstantesFunciones.activarcon_digitadoCostoGastoImpor,this,true,"con_digitadoCostoGastoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleLiquidacionImpor && this.costogastoimporConstantesFunciones.mostrarDetalleLiquidacionImporCostoGastoImpor && !CostoGastoImporConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Liquidacion Impores");
				tableColumn.setHeaderValue("Detalle Liquidacion Impores");
				tableColumn.setCellRenderer(new DetalleLiquidacionImporTableCell(costogastoimporConstantesFunciones.resaltarDetalleLiquidacionImporCostoGastoImpor,this,this.costogastoimporConstantesFunciones.activarDetalleLiquidacionImporCostoGastoImpor));
				tableColumn.setCellEditor(new DetalleLiquidacionImporTableCell(costogastoimporConstantesFunciones.resaltarDetalleLiquidacionImporCostoGastoImpor,this,this.costogastoimporConstantesFunciones.activarDetalleLiquidacionImporCostoGastoImpor));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCostoGastoImpor.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.costogastoimporSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.costogastoimporSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCostoGastoImpor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.costogastoimporSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.costogastoimporSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCostoGastoImpor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.costogastoimporSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.costogastoimporSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCostoGastoImpor.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.costogastoimporSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosCostoGastoImpor.addColumn(tableColumn);
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
			
			this.jTableDatosCostoGastoImpor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.costogastoimporSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCostoGastoImpor.moveColumn(this.jTableDatosCostoGastoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCostoGastoImpor.moveColumn(this.jTableDatosCostoGastoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.costogastoimporSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCostoGastoImpor.moveColumn(this.jTableDatosCostoGastoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCostoGastoImpor.moveColumn(this.jTableDatosCostoGastoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCostoGastoImpor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCostoGastoImpor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCostoGastoImpor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCostoGastoImpor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCostoGastoImpor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCostoGastoImpor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCostoGastoImpor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=costogastoimporLogic.getCostoGastoImpors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=costogastoimpors.size()-1;
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
		//this.jTableDatosCostoGastoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCostoGastoImpor();
			
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
				
				//this.isEsNuevoCostoGastoImpor=false;
					
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
				if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCostoGastoImpor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCostoGastoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCostoGastoImpor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.costogastoimpor.getsType().equals("DUPLICADO")
				   || this.costogastoimpor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCostoGastoImpor=true;
				
				} else {
					this.isEsNuevoCostoGastoImpor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
					if(this.costogastoimpor.getId()>=0 && !this.costogastoimpor.getIsNew()) {						
						this.isEsNuevoCostoGastoImpor=false;
						
					} else {
						this.isEsNuevoCostoGastoImpor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCostoGastoImpor(esRelaciones);						
				
				this.seleccionarCostoGastoImpor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.costogastoimpor.getId()<0) {
					this.isEsNuevoCostoGastoImpor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCostoGastoImpor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCostoGastoImpor(evt,rowIndex);
				}	
				
				if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CostoGastoImpor: " + this.dDif); 
					}
				}								
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCostoGastoImpor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.costogastoimpor)) {
					if(this.costogastoimpor.getId()>0) {
						this.costogastoimpor.setIsDeleted(true);
						
						this.costogastoimporsEliminados.add(this.costogastoimpor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.costogastoimporLogic.getCostoGastoImpors().remove(this.costogastoimpor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.costogastoimpors.remove(this.costogastoimpor);				
					}
					
					
					((CostoGastoImporModel) this.jTableDatosCostoGastoImpor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCostoGastoImpor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCostoGastoImpor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCostoGastoImpor) {
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCostoGastoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCostoGastoImpor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCostoGastoImpor(this.costogastoimpor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.costogastoimporConstantesFunciones.cargarid_empresaCostoGastoImpor || this.costogastoimporConstantesFunciones.event_dependid_empresaCostoGastoImpor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.costogastoimpor.getid_empresa());
									//this.inicializarActualizarBindingCostoGastoImpor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(costogastoimpor.getEmpresa()!=null) {
							this.empresasForeignKey.add(costogastoimpor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.costogastoimpor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.costogastoimporConstantesFunciones.cargarid_sucursalCostoGastoImpor || this.costogastoimporConstantesFunciones.event_dependid_sucursalCostoGastoImpor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.costogastoimpor.getid_sucursal());
									//this.inicializarActualizarBindingCostoGastoImpor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(costogastoimpor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(costogastoimpor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.costogastoimpor.getid_sucursal(),false,"Formulario");

					//TipoCostoGastoImpor
					if(!this.costogastoimporConstantesFunciones.cargarid_tipo_costo_gasto_imporCostoGastoImpor || this.costogastoimporConstantesFunciones.event_dependid_tipo_costo_gasto_imporCostoGastoImpor) {
						//this.cargarCombosTipoCostoGastoImporsForeignKeyLista(" where id="+this.costogastoimpor.getid_tipo_costo_gasto_impor());
									//this.inicializarActualizarBindingCostoGastoImpor(false,false);
						this.tipocostogastoimporsForeignKey=new ArrayList<TipoCostoGastoImpor>();

						if(costogastoimpor.getTipoCostoGastoImpor()!=null) {
							this.tipocostogastoimporsForeignKey.add(costogastoimpor.getTipoCostoGastoImpor());
						}

						this.addItemDefectoCombosForeignKeyTipoCostoGastoImpor();
						this.cargarCombosFrameTipoCostoGastoImporsForeignKey("Todos");
					}
					this.setActualTipoCostoGastoImporForeignKey(this.costogastoimpor.getid_tipo_costo_gasto_impor(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCostoGastoImpor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCostoGastoImpor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCostoGastoImpor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCostoGastoImpor(CostoGastoImpor costogastoimpor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCostoGastoImpor(costogastoimpor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCostoGastoImpor(CostoGastoImpor costogastoimpor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCostoGastoImpor(costogastoimpor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCostoGastoImpor(costogastoimpor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCostoGastoImpor(costogastoimpor);
	}
	
	public void setVariablesObjetoActualToFormularioCostoGastoImpor(CostoGastoImpor costogastoimpor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.setText(costogastoimpor.getId().toString());
			this.jInternalFrameDetalleFormCostoGastoImpor.jTextAreanombreCostoGastoImpor.setText(costogastoimpor.getnombre());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.setSelected(costogastoimpor.getes_activo());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.setSelected(costogastoimpor.getcon_agrupa());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.setSelected(costogastoimpor.getcon_prorratea());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.setSelected(costogastoimpor.getcon_factura());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.setSelected(costogastoimpor.getcon_flete());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.setSelected(costogastoimpor.getcon_arancel());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.setSelected(costogastoimpor.getcon_seguro());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.setSelected(costogastoimpor.getcon_total_general());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.setSelected(costogastoimpor.getcon_digitado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CostoGastoImpor costogastoimporLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,costogastoimporLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CostoGastoImpor costogastoimporLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				costogastoimporLocal=this.costogastoimpor;
			} else {
				costogastoimporLocal=this.costogastoimporAnterior;
			}
		}
		
		if(this.permiteMantenimiento(costogastoimporLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCostoGastoImpor(costogastoimporLocal,true);
					
					if(costogastoimporSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(costogastoimporLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(costogastoimporLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCostoGastoImpor(CostoGastoImpor costogastoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCostoGastoImpor(costogastoimpor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(costogastoimpor);
	}
	
	public void setVariablesFormularioToObjetoActualCostoGastoImpor(CostoGastoImpor costogastoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCostoGastoImpor(costogastoimpor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCostoGastoImpor(CostoGastoImpor costogastoimpor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.getText()==null || this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.getText()=="" || this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.getText()=="Id") {
				this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.setText("0");
			}

			if(conColumnasBase) {costogastoimpor.setId(Long.parseLong(this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelIdCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setnombre(this.jInternalFrameDetalleFormCostoGastoImpor.jTextAreanombreCostoGastoImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelnombreCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setes_activo(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabeles_activoCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setcon_agrupa(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_agrupaCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setcon_prorratea(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_prorrateaCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setcon_factura(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_CONFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_facturaCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setcon_flete(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_CONFLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_fleteCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setcon_arancel(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_CONARANCEL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_arancelCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setcon_seguro(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_CONSEGURO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_seguroCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setcon_total_general(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_total_generalCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			costogastoimpor.setcon_digitado(this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCostoGastoImpor.jLabelcon_digitadoCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCostoGastoImpor(CostoGastoImpor costogastoimporBean,CostoGastoImpor costogastoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && costogastoimporBean.getid_tipo_costo_gasto_impor()!=null && !costogastoimporBean.getid_tipo_costo_gasto_impor().equals(-1L))) {costogastoimpor.setid_tipo_costo_gasto_impor(costogastoimporBean.getid_tipo_costo_gasto_impor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCostoGastoImpor(CostoGastoImpor costogastoimporOrigen,CostoGastoImpor costogastoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && costogastoimporOrigen.getId()!=null && !costogastoimporOrigen.getId().equals(0L))) {costogastoimpor.setId(costogastoimporOrigen.getId());}}
			if(conDefault || (!conDefault && costogastoimporOrigen.getid_tipo_costo_gasto_impor()!=null && !costogastoimporOrigen.getid_tipo_costo_gasto_impor().equals(-1L))) {costogastoimpor.setid_tipo_costo_gasto_impor(costogastoimporOrigen.getid_tipo_costo_gasto_impor());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getnombre()!=null && !costogastoimporOrigen.getnombre().equals(""))) {costogastoimpor.setnombre(costogastoimporOrigen.getnombre());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getes_activo()!=null && !costogastoimporOrigen.getes_activo().equals(false))) {costogastoimpor.setes_activo(costogastoimporOrigen.getes_activo());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getcon_agrupa()!=null && !costogastoimporOrigen.getcon_agrupa().equals(false))) {costogastoimpor.setcon_agrupa(costogastoimporOrigen.getcon_agrupa());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getcon_prorratea()!=null && !costogastoimporOrigen.getcon_prorratea().equals(false))) {costogastoimpor.setcon_prorratea(costogastoimporOrigen.getcon_prorratea());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getcon_factura()!=null && !costogastoimporOrigen.getcon_factura().equals(false))) {costogastoimpor.setcon_factura(costogastoimporOrigen.getcon_factura());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getcon_flete()!=null && !costogastoimporOrigen.getcon_flete().equals(false))) {costogastoimpor.setcon_flete(costogastoimporOrigen.getcon_flete());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getcon_arancel()!=null && !costogastoimporOrigen.getcon_arancel().equals(false))) {costogastoimpor.setcon_arancel(costogastoimporOrigen.getcon_arancel());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getcon_seguro()!=null && !costogastoimporOrigen.getcon_seguro().equals(false))) {costogastoimpor.setcon_seguro(costogastoimporOrigen.getcon_seguro());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getcon_total_general()!=null && !costogastoimporOrigen.getcon_total_general().equals(false))) {costogastoimpor.setcon_total_general(costogastoimporOrigen.getcon_total_general());}
			if(conDefault || (!conDefault && costogastoimporOrigen.getcon_digitado()!=null && !costogastoimporOrigen.getcon_digitado().equals(false))) {costogastoimpor.setcon_digitado(costogastoimporOrigen.getcon_digitado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCostoGastoImpor(CostoGastoImpor costogastoimpor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.setText(costogastoimpor.getId().toString());
			this.jInternalFrameDetalleFormCostoGastoImpor.jTextAreanombreCostoGastoImpor.setText(costogastoimpor.getnombre());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.setSelected(costogastoimpor.getes_activo());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.setSelected(costogastoimpor.getcon_agrupa());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.setSelected(costogastoimpor.getcon_prorratea());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.setSelected(costogastoimpor.getcon_factura());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.setSelected(costogastoimpor.getcon_flete());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.setSelected(costogastoimpor.getcon_arancel());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.setSelected(costogastoimpor.getcon_seguro());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.setSelected(costogastoimpor.getcon_total_general());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.setSelected(costogastoimpor.getcon_digitado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCostoGastoImpor(CostoGastoImporBean costogastoimporBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.setText(costogastoimporBean.getId().toString());
			this.jInternalFrameDetalleFormCostoGastoImpor.jTextAreanombreCostoGastoImpor.setText(costogastoimporBean.getnombre());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.setSelected(costogastoimporBean.getes_activo());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.setSelected(costogastoimporBean.getcon_agrupa());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.setSelected(costogastoimporBean.getcon_prorratea());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.setSelected(costogastoimporBean.getcon_factura());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.setSelected(costogastoimporBean.getcon_flete());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.setSelected(costogastoimporBean.getcon_arancel());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.setSelected(costogastoimporBean.getcon_seguro());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.setSelected(costogastoimporBean.getcon_total_general());
			this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.setSelected(costogastoimporBean.getcon_digitado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCostoGastoImpor(CostoGastoImporParameterReturnGeneral costogastoimporReturnGeneral,CostoGastoImporBean costogastoimporBean,Boolean conDefault) throws Exception { 
		try {
			CostoGastoImpor costogastoimporLocal=new CostoGastoImpor();
			
			costogastoimporLocal=costogastoimporReturnGeneral.getCostoGastoImpor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && costogastoimporLocal.getId()!=null && !costogastoimporLocal.getId().equals(0L))) {costogastoimporBean.setId(costogastoimporLocal.getId());}}
			if(conDefault || (!conDefault && costogastoimporLocal.getid_tipo_costo_gasto_impor()!=null && !costogastoimporLocal.getid_tipo_costo_gasto_impor().equals(-1L))) {costogastoimporBean.setid_tipo_costo_gasto_impor(costogastoimporLocal.getid_tipo_costo_gasto_impor());}
			if(conDefault || (!conDefault && costogastoimporLocal.getnombre()!=null && !costogastoimporLocal.getnombre().equals(""))) {costogastoimporBean.setnombre(costogastoimporLocal.getnombre());}
			if(conDefault || (!conDefault && costogastoimporLocal.getes_activo()!=null && !costogastoimporLocal.getes_activo().equals(false))) {costogastoimporBean.setes_activo(costogastoimporLocal.getes_activo());}
			if(conDefault || (!conDefault && costogastoimporLocal.getcon_agrupa()!=null && !costogastoimporLocal.getcon_agrupa().equals(false))) {costogastoimporBean.setcon_agrupa(costogastoimporLocal.getcon_agrupa());}
			if(conDefault || (!conDefault && costogastoimporLocal.getcon_prorratea()!=null && !costogastoimporLocal.getcon_prorratea().equals(false))) {costogastoimporBean.setcon_prorratea(costogastoimporLocal.getcon_prorratea());}
			if(conDefault || (!conDefault && costogastoimporLocal.getcon_factura()!=null && !costogastoimporLocal.getcon_factura().equals(false))) {costogastoimporBean.setcon_factura(costogastoimporLocal.getcon_factura());}
			if(conDefault || (!conDefault && costogastoimporLocal.getcon_flete()!=null && !costogastoimporLocal.getcon_flete().equals(false))) {costogastoimporBean.setcon_flete(costogastoimporLocal.getcon_flete());}
			if(conDefault || (!conDefault && costogastoimporLocal.getcon_arancel()!=null && !costogastoimporLocal.getcon_arancel().equals(false))) {costogastoimporBean.setcon_arancel(costogastoimporLocal.getcon_arancel());}
			if(conDefault || (!conDefault && costogastoimporLocal.getcon_seguro()!=null && !costogastoimporLocal.getcon_seguro().equals(false))) {costogastoimporBean.setcon_seguro(costogastoimporLocal.getcon_seguro());}
			if(conDefault || (!conDefault && costogastoimporLocal.getcon_total_general()!=null && !costogastoimporLocal.getcon_total_general().equals(false))) {costogastoimporBean.setcon_total_general(costogastoimporLocal.getcon_total_general());}
			if(conDefault || (!conDefault && costogastoimporLocal.getcon_digitado()!=null && !costogastoimporLocal.getcon_digitado().equals(false))) {costogastoimporBean.setcon_digitado(costogastoimporLocal.getcon_digitado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCostoGastoImporGenerico(Long idCostoGastoImporSeleccionado,JComboBox jComboBoxCostoGastoImpor,List<CostoGastoImpor> costogastoimporsLocal)throws Exception {
		try {
			CostoGastoImpor  costogastoimporTemp=null;

			for(CostoGastoImpor costogastoimporAux:costogastoimporsLocal) {
				if(costogastoimporAux.getId()!=null && costogastoimporAux.getId().equals(idCostoGastoImporSeleccionado)) {
					costogastoimporTemp=costogastoimporAux;
					break;
				}
			}

			jComboBoxCostoGastoImpor.setSelectedItem(costogastoimporTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCostoGastoImporGenerico(JComboBox jComboBoxCostoGastoImpor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCostoGastoImpor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCostoGastoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCostoGastoImpor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCostoGastoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			costogastoimpor=(CostoGastoImpor) costogastoimporLogic.getCostoGastoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			costogastoimpor =(CostoGastoImpor) costogastoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!costogastoimpor.getIsNew() && !costogastoimpor.getIsChanged() && !costogastoimpor.getIsDeleted()) {
				sDescripcion=costogastoimpor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=costogastoimpor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!costogastoimpor.getIsNew() && !costogastoimpor.getIsChanged() && !costogastoimpor.getIsDeleted()) {
				sDescripcion=costogastoimpor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=costogastoimpor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoCostoGastoImpor")) {
			//sDescripcion=this.getActualTipoCostoGastoImporForeignKeyDescripcion((Long)value);
			if(!costogastoimpor.getIsNew() && !costogastoimpor.getIsChanged() && !costogastoimpor.getIsDeleted()) {
				sDescripcion=costogastoimpor.gettipocostogastoimpor_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCostoGastoImporForeignKeyDescripcion((Long)value);
				sDescripcion=costogastoimpor.gettipocostogastoimpor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CostoGastoImpor costogastoimporRow=new CostoGastoImpor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			costogastoimporRow=(CostoGastoImpor) costogastoimporLogic.getCostoGastoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			costogastoimporRow=(CostoGastoImpor) costogastoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleLiquidacionImporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CostoGastoImpor costogastoimpor) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCostoGastoImpor==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor = (CostoGastoImpor)this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.costogastoimpor = (CostoGastoImpor)this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(costogastoimpor!=null) {
						this.costogastoimpor = costogastoimpor;
					} else {
						this.costogastoimpor = new CostoGastoImpor();
					}
				}

				if(this.isTienePermisosDetalleLiquidacionImpor && this.permiteMantenimiento(this.costogastoimpor)) {
					DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFramePopup=new DetalleLiquidacionImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleliquidacionimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFramePopup;
					} else {
						detalleliquidacionimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame;
					}

					List<CostoGastoImpor> costogastoimpors=new ArrayList<CostoGastoImpor>();
					costogastoimpors.add(this.costogastoimpor);
					if(!esRelacionado) {
						//detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setConGuardarRelaciones(false);
						//detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleliquidacionimporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCostoGastoImpor.cargarDetalleLiquidacionImporBeanSwingJInternalFrame(costogastoimpors,this.costogastoimpor,detalleliquidacionimporBeanSwingJInternalFrame,/*conInicializar,*/detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.getConGuardarRelaciones(),detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
					detalleliquidacionimporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleliquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpor("no_relacionado");

						detalleliquidacionimporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleLiquidacionImporConstantesFunciones.ITAMANIOFILATABLA + (DetalleLiquidacionImporConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleliquidacionimporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCostoGastoImpor=(TitledBorder)this.jScrollPanelDatosCostoGastoImpor.getBorder();
						TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)detalleliquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();

						titledBorderDetalleLiquidacionImpor.setTitle(titledBorderCostoGastoImpor.getTitle() + " -> Detalle Liquidacion Impor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleliquidacionimporBeanSwingJInternalFrame);
						}

						detalleliquidacionimporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleliquidacionimporBeanSwingJInternalFrame);

						detalleliquidacionimporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.costogastoimporSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Liquidacion Impor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCostoGastoImpor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor));			
			this.jButtonDuplicarCostoGastoImpor.setVisible((this.isVisibilidadCeldaDuplicarCostoGastoImpor && this.isPermisoDuplicarCostoGastoImpor));			
			this.jButtonCopiarCostoGastoImpor.setVisible((this.isVisibilidadCeldaCopiarCostoGastoImpor && this.isPermisoCopiarCostoGastoImpor));
			this.jButtonVerFormCostoGastoImpor.setVisible((this.isVisibilidadCeldaVerFormCostoGastoImpor && this.isPermisoVerFormCostoGastoImpor));
			
			this.jButtonAbrirOrderByCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenCostoGastoImpor && this.isPermisoOrdenCostoGastoImpor));			
			
			this.jButtonNuevoRelacionesCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor));			
			this.jButtonNuevoGuardarCambiosCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarCostoGastoImpor.setVisible((this.isVisibilidadCeldaModificarCostoGastoImpor && this.isPermisoActualizarCostoGastoImpor));	
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarCostoGastoImpor.setVisible((this.isVisibilidadCeldaActualizarCostoGastoImpor && this.isPermisoActualizarCostoGastoImpor));	
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarCostoGastoImpor.setVisible((this.isVisibilidadCeldaEliminarCostoGastoImpor && this.isPermisoEliminarCostoGastoImpor));
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarCostoGastoImpor);							
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));			
			
			}
						
			this.jButtonGuardarCambiosTablaCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor));						
			this.jButtonDuplicarToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaDuplicarCostoGastoImpor && this.isPermisoDuplicarCostoGastoImpor));						
			this.jButtonCopiarToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaCopiarCostoGastoImpor && this.isPermisoCopiarCostoGastoImpor));			
			this.jButtonVerFormToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaVerFormCostoGastoImpor && this.isPermisoVerFormCostoGastoImpor));			
			this.jButtonAbrirOrderByToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenCostoGastoImpor && this.isPermisoOrdenCostoGastoImpor));
			this.jButtonNuevoRelacionesToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor));			
			this.jButtonNuevoGuardarCambiosToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));			
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaModificarCostoGastoImpor && this.isPermisoActualizarCostoGastoImpor));	
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaActualizarCostoGastoImpor  && this.isPermisoActualizarCostoGastoImpor));	
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaEliminarCostoGastoImpor && this.isPermisoEliminarCostoGastoImpor));
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarToolBarCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarCostoGastoImpor);				
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor));			
			this.jMenuItemDuplicarCostoGastoImpor.setVisible((this.isVisibilidadCeldaDuplicarCostoGastoImpor && this.isPermisoDuplicarCostoGastoImpor));			
			this.jMenuItemCopiarCostoGastoImpor.setVisible((this.isVisibilidadCeldaCopiarCostoGastoImpor && this.isPermisoCopiarCostoGastoImpor));			
			this.jMenuItemVerFormCostoGastoImpor.setVisible((this.isVisibilidadCeldaVerFormCostoGastoImpor && this.isPermisoVerFormCostoGastoImpor));			
			this.jMenuItemAbrirOrderByCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenCostoGastoImpor && this.isPermisoOrdenCostoGastoImpor));			
			//this.jMenuItemMostrarOcultarCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenCostoGastoImpor && this.isPermisoOrdenCostoGastoImpor));
			this.jMenuItemDetalleAbrirOrderByCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenCostoGastoImpor && this.isPermisoOrdenCostoGastoImpor));			
			//this.jMenuItemDetalleMostrarOcultarCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenCostoGastoImpor && this.isPermisoOrdenCostoGastoImpor));			
			this.jMenuItemNuevoRelacionesCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor));			
			this.jMenuItemNuevoGuardarCambiosCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoCostoGastoImpor && this.isPermisoNuevoCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));									
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemModificarCostoGastoImpor.setVisible((this.isVisibilidadCeldaModificarCostoGastoImpor && this.isPermisoActualizarCostoGastoImpor));	
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemActualizarCostoGastoImpor.setVisible((this.isVisibilidadCeldaActualizarCostoGastoImpor && this.isPermisoActualizarCostoGastoImpor));	
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemEliminarCostoGastoImpor.setVisible((this.isVisibilidadCeldaEliminarCostoGastoImpor && this.isPermisoEliminarCostoGastoImpor));
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemCancelarCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarCostoGastoImpor);				
			}
			
			this.jMenuItemGuardarCambiosCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));						
			this.jMenuItemGuardarCambiosTablaCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCostoGastoImpor=this.jButtonNuevoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaDuplicarCostoGastoImpor=this.jButtonDuplicarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaCopiarCostoGastoImpor=this.jButtonCopiarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaVerFormCostoGastoImpor=this.jButtonVerFormCostoGastoImpor.isVisible();
			
			this.isVisibilidadCeldaOrdenCostoGastoImpor=this.jButtonAbrirOrderByCostoGastoImpor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=this.jButtonNuevoRelacionesCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaModificarCostoGastoImpor=this.jButtonModificarCostoGastoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			this.isVisibilidadCeldaActualizarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaEliminarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaCancelarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosCostoGastoImpor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=this.jButtonGuardarCambiosTablaCostoGastoImpor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCostoGastoImpor=this.jButtonNuevoToolBarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=this.jButtonNuevoRelacionesToolBarCostoGastoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			this.isVisibilidadCeldaModificarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarToolBarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaActualizarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarToolBarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaEliminarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarToolBarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaCancelarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarToolBarCostoGastoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCostoGastoImpor=this.jButtonGuardarCambiosToolBarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=this.jButtonGuardarCambiosTablaToolBarCostoGastoImpor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCostoGastoImpor=this.jMenuItemNuevoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=this.jMenuItemNuevoRelacionesCostoGastoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			this.isVisibilidadCeldaModificarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemModificarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaActualizarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemActualizarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaEliminarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemEliminarCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaCancelarCostoGastoImpor=this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemCancelarCostoGastoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCostoGastoImpor=this.jMenuItemGuardarCambiosCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=this.jMenuItemGuardarCambiosTablaCostoGastoImpor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCostoGastoImpor(Boolean esInicializar) {
		if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {			
			if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
				//if(this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCostoGastoImpor();
			}
			
			this.inicializarActualizarBindingBotonesManualCostoGastoImpor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCostoGastoImpor() {
		this.jButtonNuevoCostoGastoImpor.setVisible(this.isPermisoNuevoCostoGastoImpor);			
		this.jButtonDuplicarCostoGastoImpor.setVisible(this.isPermisoDuplicarCostoGastoImpor);			
		this.jButtonCopiarCostoGastoImpor.setVisible(this.isPermisoCopiarCostoGastoImpor);			
		this.jButtonVerFormCostoGastoImpor.setVisible(this.isPermisoVerFormCostoGastoImpor);			
		
		this.jButtonAbrirOrderByCostoGastoImpor.setVisible(this.isPermisoOrdenCostoGastoImpor);					
		
		this.jButtonNuevoRelacionesCostoGastoImpor.setVisible(this.isPermisoNuevoCostoGastoImpor);			
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarCostoGastoImpor.setVisible(this.isPermisoActualizarCostoGastoImpor);	
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarCostoGastoImpor.setVisible(this.isPermisoActualizarCostoGastoImpor);	
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarCostoGastoImpor.setVisible(this.isPermisoEliminarCostoGastoImpor);
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarCostoGastoImpor);						
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosCostoGastoImpor.setVisible(this.isPermisoGuardarCambiosCostoGastoImpor);							
		}
		
		this.jButtonGuardarCambiosTablaCostoGastoImpor.setVisible(this.isPermisoActualizarCostoGastoImpor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCostoGastoImpor() {
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarCostoGastoImpor.setVisible(this.isPermisoActualizarCostoGastoImpor);	
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarCostoGastoImpor.setVisible(this.isPermisoActualizarCostoGastoImpor);	
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarCostoGastoImpor.setVisible(this.isPermisoEliminarCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarCostoGastoImpor);							
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCostoGastoImpor && this.isPermisoGuardarCambiosCostoGastoImpor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCostoGastoImpor() {
		if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCostoGastoImpor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCostoGastoImpor() {
	}
	
	public void jTableDatosCostoGastoImporListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCostoGastoImpor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.costogastoimpor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCostoGastoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCostoGastoImpor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCostoGastoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCostoGastoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.costogastoimporLogic.getConnexion());

				if(this.costogastoimpor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.costogastoimpor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCostoGastoImpor=(TitledBorder)this.jScrollPanelDatosCostoGastoImpor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCostoGastoImpor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.costogastoimpor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCostoGastoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCostoGastoImpor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCostoGastoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCostoGastoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.costogastoimporLogic.getConnexion());

				if(this.costogastoimpor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.costogastoimpor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCostoGastoImpor=(TitledBorder)this.jScrollPanelDatosCostoGastoImpor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCostoGastoImpor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.costogastoimpor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocostogastoimpor=true;

			idTienePermisotipocostogastoimpor=this.tienePermisosUsuarioEnPaginaWebCostoGastoImpor(TipoCostoGastoImporConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocostogastoimpor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCostoGastoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCostoGastoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);

				this.tipocostogastoimporBeanSwingJInternalFrame=new TipoCostoGastoImporBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocostogastoimporBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocostogastoimporBeanSwingJInternalFrame.getTipoCostoGastoImporLogic().setConnexion(this.costogastoimporLogic.getConnexion());

				if(this.costogastoimpor.getid_tipo_costo_gasto_impor()!=null) {
					this.tipocostogastoimporBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocostogastoimporBeanSwingJInternalFrame.setIdActual(this.costogastoimpor.getid_tipo_costo_gasto_impor());
					this.tipocostogastoimporBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocostogastoimporBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocostogastoimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCostoGastoImpor();
				}

				JInternalFrameBase jinternalFrame =this.tipocostogastoimporBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCostoGastoImpor=(TitledBorder)this.jScrollPanelDatosCostoGastoImpor.getBorder();
				TitledBorder titledBordertipocostogastoimpor=(TitledBorder)this.tipocostogastoimporBeanSwingJInternalFrame.jScrollPanelDatosTipoCostoGastoImpor.getBorder();

				titledBordertipocostogastoimpor.setTitle(titledBorderCostoGastoImpor.getTitle() + " -> Tipo Costo Gasto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_costo_gasto_imporCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getid_tipo_costo_gasto_impor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_costo_gasto_impor = "+this.costogastoimpor.getid_tipo_costo_gasto_impor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.costogastoimpor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_activoCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getes_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_activo = "+this.costogastoimpor.getes_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_agrupaCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getcon_agrupa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_agrupa = "+this.costogastoimpor.getcon_agrupa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_prorrateaCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getcon_prorratea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_prorratea = "+this.costogastoimpor.getcon_prorratea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_facturaCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getcon_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_factura = "+this.costogastoimpor.getcon_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_fleteCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getcon_flete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_flete = "+this.costogastoimpor.getcon_flete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_arancelCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getcon_arancel()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_arancel = "+this.costogastoimpor.getcon_arancel().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_seguroCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getcon_seguro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_seguro = "+this.costogastoimpor.getcon_seguro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_total_generalCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getcon_total_general()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_total_general = "+this.costogastoimpor.getcon_total_general().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_digitadoCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.getcostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.costogastoimpor==null) {
						this.costogastoimpor = new CostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);
				}

				if(this.costogastoimpor.getcon_digitado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_digitado = "+this.costogastoimpor.getcon_digitado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCostoGastoImpor(false,false);

			this.getCostoGastoImporsFK_IdEmpresa();

			this.inicializarActualizarBindingCostoGastoImpor(false);

			//if(CostoGastoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCostoGastoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCostoGastoImpor(false,false);

			this.getCostoGastoImporsFK_IdSucursal();

			this.inicializarActualizarBindingCostoGastoImpor(false);

			//if(CostoGastoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCostoGastoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCostoGastoImporCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCostoGastoImpor(false,false);

			this.getCostoGastoImporsFK_IdTipoCostoGastoImpor();

			this.inicializarActualizarBindingCostoGastoImpor(false);

			//if(CostoGastoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCostoGastoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.costogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCostoGastoImpor() {
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
		

		if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
			this.jInternalFrameDetalleFormCostoGastoImpor.setVisible(false);	    			
			this.jInternalFrameDetalleFormCostoGastoImpor.dispose();
			this.jInternalFrameDetalleFormCostoGastoImpor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
			this.jInternalFrameReporteDinamicoCostoGastoImpor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCostoGastoImpor.dispose();
			this.jInternalFrameReporteDinamicoCostoGastoImpor=null;
		}
		
		if(this.jInternalFrameImportacionCostoGastoImpor!=null) {
			this.jInternalFrameImportacionCostoGastoImpor.setVisible(false);	    			
			this.jInternalFrameImportacionCostoGastoImpor.dispose();
			this.jInternalFrameImportacionCostoGastoImpor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCostoGastoImpor();
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
			
			if(sTipo.equals("NuevoCostoGastoImpor")) {
				jButtonNuevoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCostoGastoImpor")) {
				jButtonDuplicarCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCostoGastoImpor")) {
				jButtonCopiarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormCostoGastoImpor")) {
				jButtonVerFormCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCostoGastoImpor")) {
				jButtonNuevoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCostoGastoImpor")) {
				jButtonDuplicarCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCostoGastoImpor")) {
				jButtonNuevoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCostoGastoImpor")) {
				jButtonDuplicarCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCostoGastoImpor")) {
				jButtonNuevoCostoGastoImporActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCostoGastoImpor")) {
				jButtonNuevoCostoGastoImporActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCostoGastoImpor")) {
				jButtonNuevoCostoGastoImporActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCostoGastoImpor")) {
				jButtonModificarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCostoGastoImpor")) {
				jButtonModificarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCostoGastoImpor")) {
				jButtonModificarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCostoGastoImpor")) {
				jButtonActualizarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCostoGastoImpor")) {
				jButtonActualizarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCostoGastoImpor")) {
				jButtonActualizarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarCostoGastoImpor")) {
				jButtonEliminarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCostoGastoImpor")) {
				jButtonEliminarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCostoGastoImpor")) {
				jButtonEliminarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarCostoGastoImpor")) {
				jButtonCancelarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCostoGastoImpor")) {
				jButtonCancelarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCostoGastoImpor")) {
				jButtonCancelarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarCostoGastoImpor")) {
				jButtonCerrarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCostoGastoImpor")) {
				jButtonCerrarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCostoGastoImpor")) {
				jButtonCerrarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCostoGastoImpor")) {
				jButtonMostrarOcultarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCostoGastoImpor")) {
				jButtonCancelarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCostoGastoImpor")) {
				jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCostoGastoImpor")) {
				jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCostoGastoImpor")) {
				jButtonCopiarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCostoGastoImpor")) {
				jButtonVerFormCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCostoGastoImpor")) {
				jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCostoGastoImpor")) {
				jButtonCopiarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCostoGastoImpor")) {
				jButtonVerFormCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCostoGastoImpor")) {
				jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCostoGastoImpor")) {
				jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCostoGastoImpor")) {
				jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCostoGastoImpor")) {
				jButtonRecargarInformacionCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCostoGastoImpor")) {
				jButtonRecargarInformacionCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCostoGastoImpor")) {
				jButtonRecargarInformacionCostoGastoImporActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCostoGastoImpor")) {
				jButtonAnterioresCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCostoGastoImpor")) {
				jButtonAnterioresCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCostoGastoImpor")) {
				jButtonAnterioresCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCostoGastoImpor")) {
				jButtonSiguientesCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCostoGastoImpor")) {
				jButtonSiguientesCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCostoGastoImpor")) {
				jButtonSiguientesCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCostoGastoImpor") || sTipo.equals("MenuItemDetalleAbrirOrderByCostoGastoImpor")) {
				jButtonAbrirOrderByCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCostoGastoImpor") || sTipo.equals("MenuItemDetalleMostrarOcultarCostoGastoImpor")) {
				jButtonMostrarOcultarCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCostoGastoImpor")) {
				jButtonNuevoGuardarCambiosCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCostoGastoImpor")) {
				jButtonNuevoGuardarCambiosCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCostoGastoImpor")) {
				jButtonNuevoGuardarCambiosCostoGastoImporActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCostoGastoImpor")) {
				jButtonCerrarReporteDinamicoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCostoGastoImpor")) {
				jButtonGenerarReporteDinamicoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCostoGastoImpor")) {
				
				jButtonGenerarExcelReporteDinamicoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCostoGastoImpor")) {
				jButtonCerrarImportacionCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCostoGastoImpor")) {
				
				jButtonGenerarImportacionCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCostoGastoImpor")) {
				
				jButtonAbrirImportacionCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCostoGastoImpor")) {
				jComboBoxTiposAccionesCostoGastoImporActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCostoGastoImpor")) {
				jComboBoxTiposRelacionesCostoGastoImporActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCostoGastoImpor")) {
				jComboBoxTiposAccionesCostoGastoImporActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCostoGastoImpor")) {
				
				jComboBoxTiposSeleccionarCostoGastoImporActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCostoGastoImpor")) {
				jTextFieldValorCampoGeneralCostoGastoImporActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCostoGastoImpor")) {
				jButtonAbrirOrderByCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCostoGastoImpor")) {
				jButtonAbrirOrderByCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCostoGastoImpor")) {
				jButtonCerrarOrderByCostoGastoImporActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCostoGastoImporBusqueda")) {
				this.jButtonidCostoGastoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCostoGastoImporUpdate")) {
				this.jButtonid_empresaCostoGastoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCostoGastoImporBusqueda")) {
				this.jButtonid_empresaCostoGastoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCostoGastoImporUpdate")) {
				this.jButtonid_sucursalCostoGastoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCostoGastoImporBusqueda")) {
				this.jButtonid_sucursalCostoGastoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_costo_gasto_imporCostoGastoImporUpdate")) {
				this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_costo_gasto_imporCostoGastoImporBusqueda")) {
				this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCostoGastoImporBusqueda")) {
				this.jButtonnombreCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoCostoGastoImporBusqueda")) {
				this.jButtones_activoCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_agrupaCostoGastoImporBusqueda")) {
				this.jButtoncon_agrupaCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_prorrateaCostoGastoImporBusqueda")) {
				this.jButtoncon_prorrateaCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_facturaCostoGastoImporBusqueda")) {
				this.jButtoncon_facturaCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_fleteCostoGastoImporBusqueda")) {
				this.jButtoncon_fleteCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_arancelCostoGastoImporBusqueda")) {
				this.jButtoncon_arancelCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_seguroCostoGastoImporBusqueda")) {
				this.jButtoncon_seguroCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_total_generalCostoGastoImporBusqueda")) {
				this.jButtoncon_total_generalCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_digitadoCostoGastoImporBusqueda")) {
				this.jButtoncon_digitadoCostoGastoImporBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoCostoGastoImporCostoGastoImpor")) {
				this.jButtonFK_IdTipoCostoGastoImporCostoGastoImporActionPerformed(evt);
			}
			
			;
			
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCostoGastoImpor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoGastoImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				


				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CostoGastoImpor costogastoimporLocal=null;
			
			if(!this.getEsControlTabla()) {
				costogastoimporLocal=this.costogastoimpor;
			} else {
				costogastoimporLocal=this.costogastoimporAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
							
				
				


				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
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
			
			


			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoGastoImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
								
						
				


				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
								
				
				


				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoGastoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
							
				
				


				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoGastoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
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
			
			


			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoGastoImporActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
								
				
				


				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoGastoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoGastoImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCostoGastoImpor")) {
					jCheckBoxSeleccionarTodosCostoGastoImporItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCostoGastoImpor")) {
					jCheckBoxSeleccionadosCostoGastoImporItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCostoGastoImpor")) {
					
				}
				
				


				
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
												
				
				


				
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoGastoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoGastoImporActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
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
			
			


			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCostoGastoImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.costogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.costogastoimpor);
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
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
				
				


				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CostoGastoImpor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.costogastoimporAnterior =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCostoGastoImpor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCostoGastoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCostoGastoImpor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.costogastoimpor =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.costogastoimpor =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.costogastoimpor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCostoGastoImpor")) {
				
				}
				
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCostoGastoImpor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCostoGastoImpor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCostoGastoImpor")) {
			
			}
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCostoGastoImpor();
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
			if(sTipo.equals("NuevoCostoGastoImpor")) {
				jButtonNuevoCostoGastoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCostoGastoImpor")) {
				jButtonDuplicarCostoGastoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCostoGastoImpor")) {
				jButtonCopiarCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCostoGastoImpor")) {
				jButtonVerFormCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCostoGastoImpor")) {
				jButtonNuevoCostoGastoImporActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCostoGastoImpor")) {
				jButtonModificarCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCostoGastoImpor")) {
				jButtonActualizarCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCostoGastoImpor")) {
				jButtonEliminarCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCostoGastoImpor")) {
				jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCostoGastoImpor")) {
				jButtonCancelarCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCostoGastoImpor")) {
				jButtonCerrarCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCostoGastoImpor")) {
				jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCostoGastoImpor")) {
				jButtonNuevoGuardarCambiosCostoGastoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCostoGastoImpor")) {
				jButtonAbrirOrderByCostoGastoImporActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCostoGastoImpor")) {
				jButtonRecargarInformacionCostoGastoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCostoGastoImpor")) {
				jButtonAnterioresCostoGastoImporActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCostoGastoImpor")) {
				jButtonSiguientesCostoGastoImporActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCostoGastoImporBusqueda")) {
				this.jButtonidCostoGastoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCostoGastoImporUpdate")) {
				this.jButtonid_empresaCostoGastoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCostoGastoImporBusqueda")) {
				this.jButtonid_empresaCostoGastoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCostoGastoImporUpdate")) {
				this.jButtonid_sucursalCostoGastoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCostoGastoImporBusqueda")) {
				this.jButtonid_sucursalCostoGastoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_costo_gasto_imporCostoGastoImporUpdate")) {
				this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_costo_gasto_imporCostoGastoImporBusqueda")) {
				this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCostoGastoImporBusqueda")) {
				this.jButtonnombreCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoCostoGastoImporBusqueda")) {
				this.jButtones_activoCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_agrupaCostoGastoImporBusqueda")) {
				this.jButtoncon_agrupaCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_prorrateaCostoGastoImporBusqueda")) {
				this.jButtoncon_prorrateaCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_facturaCostoGastoImporBusqueda")) {
				this.jButtoncon_facturaCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_fleteCostoGastoImporBusqueda")) {
				this.jButtoncon_fleteCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_arancelCostoGastoImporBusqueda")) {
				this.jButtoncon_arancelCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_seguroCostoGastoImporBusqueda")) {
				this.jButtoncon_seguroCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_total_generalCostoGastoImporBusqueda")) {
				this.jButtoncon_total_generalCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_digitadoCostoGastoImporBusqueda")) {
				this.jButtoncon_digitadoCostoGastoImporBusquedaActionPerformed(evt);
			}
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCostoGastoImpor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCostoGastoImpor")) {
				closingInternalFrameCostoGastoImpor();
				
			} else if(sTipo.equals("jButtonCancelarCostoGastoImpor")) {
				JInternalFrameBase jInternalFrameDetalleFormCostoGastoImpor = (JInternalFrameBase)evt.getSource();
	            	
	            CostoGastoImporBeanSwingJInternalFrame jInternalFrameParent=(CostoGastoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormCostoGastoImpor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCostoGastoImporActionPerformed(null);
			}
			
			CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.costogastoimpor,new Object(),this.costogastoimporParameterGeneral,this.costogastoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCostoGastoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCostoGastoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCostoGastoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.costogastoimpor)) {
			if(!esControlTabla) {
				if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);			
				}
				
				if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCostoGastoImpor(this.costogastoimpor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.costogastoimporReturnGeneral=costogastoimporLogic.procesarEventosCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.costogastoimporLogic.getCostoGastoImpors(),this.costogastoimpor,this.costogastoimporParameterGeneral,this.isEsNuevoCostoGastoImpor,classes);//this.costogastoimporLogic.getCostoGastoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCostoGastoImpor(this.costogastoimporReturnGeneral,this.costogastoimporBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCostoGastoImpor(classes,this.costogastoimporReturnGeneral,this.costogastoimporBean,false);
					}
						
					if(this.costogastoimporReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCostoGastoImpor(this.costogastoimporReturnGeneral.getCostoGastoImpor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCostoGastoImpor(this.costogastoimporReturnGeneral.getCostoGastoImpor());	
					}
						
					if(this.costogastoimporReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCostoGastoImpor(this.costogastoimporReturnGeneral.getCostoGastoImpor(),classes);//this.costogastoimporBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCostoGastoImpor(this.costogastoimpor,classes);//this.costogastoimporBean);									
				}
			
				if(CostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCostoGastoImpor(this.costogastoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCostoGastoImpor(this.costogastoimpor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.costogastoimporAnterior!=null) {
						this.costogastoimpor=this.costogastoimporAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.costogastoimporReturnGeneral=costogastoimporLogic.procesarEventosCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.costogastoimporLogic.getCostoGastoImpors(),this.costogastoimpor,this.costogastoimporParameterGeneral,this.isEsNuevoCostoGastoImpor,classes);//this.costogastoimporLogic.getCostoGastoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.costogastoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.costogastoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.costogastoimporReturnGeneral.getCostoGastoImpor(),costogastoimporLogic.getCostoGastoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.costogastoimporReturnGeneral.getCostoGastoImpor(),this.costogastoimpors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCostoGastoImpor.repaint();
				
				//((AbstractTableModel) this.jTableDatosCostoGastoImpor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCostoGastoImpor();
			}
		}
	}
	
	public void actualizarVisualTableDatosCostoGastoImpor() throws Exception {
		
		CostoGastoImporModel costogastoimporModel=(CostoGastoImporModel)this.jTableDatosCostoGastoImpor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			costogastoimporModel.costogastoimpors=this.costogastoimporLogic.getCostoGastoImpors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			costogastoimporModel.costogastoimpors=this.costogastoimpors;
		}
		
		
		((CostoGastoImporModel) this.jTableDatosCostoGastoImpor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCostoGastoImpor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcostogastoimporAnterior(),this.costogastoimporLogic.getCostoGastoImpors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcostogastoimporAnterior(),this.costogastoimpors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCostoGastoImpor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCostoGastoImpor(CostoGastoImpor costogastoimpor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpor.class)) {
					this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(costogastoimpor.getDetalleLiquidacionImpors());
					this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
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
										
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.costogastoimpor,new Object(),generalEntityParameterGeneral,this.costogastoimporReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CostoGastoImporConstantesFunciones.getClassesRelationshipsOfCostoGastoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CostoGastoImporConstantesFunciones.getClassesRelationshipsFromStringsOfCostoGastoImpor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCostoGastoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.costogastoimpor,new Object(),generalEntityParameterGeneral,this.costogastoimporReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCostoGastoImpor(CostoGastoImporBean costogastoimporBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpor.class)) {
					this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(costogastoimpor.getDetalleLiquidacionImpors());
					this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCostoGastoImpor(ArrayList<Classe> classes,CostoGastoImporReturnGeneral costogastoimporReturnGeneral,CostoGastoImporBean costogastoimporBean,Boolean conDefault) throws Exception {
		
			this.costogastoimporBean.setDetalleLiquidacionImpors(costogastoimporReturnGeneral.getCostoGastoImpor().getDetalleLiquidacionImpors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCostoGastoImpor(CostoGastoImpor costogastoimpor,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpor.class)) {
					costogastoimpor.setDetalleLiquidacionImpors(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
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
		if(!paraTabla && !this.permiteMantenimiento(this.costogastoimpor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCostoGastoImpor = new CostoGastoImporDetalleFormJInternalFrame(jDesktopPane,this.costogastoimporSessionBean.getConGuardarRelaciones(),this.costogastoimporSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.setVisible(false);
		this.jInternalFrameDetalleFormCostoGastoImpor.setSelected(false);						
		
		this.jInternalFrameDetalleFormCostoGastoImpor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCostoGastoImpor.costogastoimporLogic=this.costogastoimporLogic;
		
		this.cargarCombosFrameForeignKeyCostoGastoImpor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCostoGastoImpor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCostoGastoImpor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCostoGastoImpor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCostoGastoImpor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCostoGastoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCostoGastoImpor"));
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ModificarCostoGastoImpor"));

		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarToolBarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarCostoGastoImpor"));
					
		this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemModificarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarCostoGastoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"ActualizarCostoGastoImpor"));
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarToolBarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCostoGastoImpor"));
						
		this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemActualizarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCostoGastoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"EliminarCostoGastoImpor"));
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarCostoGastoImpor"));
								
		this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemEliminarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCostoGastoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CancelarCostoGastoImpor"));
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarCostoGastoImpor"));
					
		this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemCancelarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCostoGastoImpor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemDetalleCerrarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCostoGastoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCostoGastoImpor"));
		
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCostoGastoImpor"));
		
		
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCostoGastoImpor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonidCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"idCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_empresaCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_empresaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_sucursalCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_sucursalCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_costo_gasto_imporCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_costo_gasto_imporCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonnombreCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtones_activoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"es_activoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_agrupaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_agrupaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_prorrateaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_prorrateaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_facturaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_facturaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_fleteCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_fleteCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_arancelCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_arancelCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_seguroCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_seguroCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_total_generalCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_total_generalCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_digitadoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_digitadoCostoGastoImporBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCostoGastoImpor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCostoGastoImpor"));
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCostoGastoImpor"));
		}
		
		this.jTableDatosCostoGastoImpor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCostoGastoImpor"));
		
		this.jTableDatosCostoGastoImpor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCostoGastoImpor"));
		
		this.jButtonNuevoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"NuevoCostoGastoImpor"));
		
		this.jButtonDuplicarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"DuplicarCostoGastoImpor"));
		
		this.jButtonCopiarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"CopiarCostoGastoImpor"));
		
		this.jButtonVerFormCostoGastoImpor.addActionListener(new ButtonActionListener(this,"VerFormCostoGastoImpor"));
		
		
		this.jButtonNuevoToolBarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"NuevoToolBarCostoGastoImpor"));
			
		this.jButtonDuplicarToolBarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCostoGastoImpor"));
			
		this.jMenuItemNuevoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCostoGastoImpor"));
			
		this.jMenuItemDuplicarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCostoGastoImpor"));		
		
		
		this.jButtonNuevoRelacionesCostoGastoImpor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCostoGastoImpor"));
		
		
		this.jButtonNuevoRelacionesToolBarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCostoGastoImpor"));
			
		this.jMenuItemNuevoRelacionesCostoGastoImpor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCostoGastoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ModificarCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonModificarToolBarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarCostoGastoImpor"));
			
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemModificarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarCostoGastoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"ActualizarCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonActualizarToolBarCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCostoGastoImpor"));
				
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemActualizarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCostoGastoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"EliminarCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonEliminarToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarCostoGastoImpor"));
						
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemEliminarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCostoGastoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CancelarCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonCancelarToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarCostoGastoImpor"));
			
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemCancelarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCostoGastoImpor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCostoGastoImpor"));		
		
		
		this.jButtonCerrarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CerrarCostoGastoImpor"));
		
		
		this.jButtonCerrarToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CerrarToolBarCostoGastoImpor"));
			
		this.jMenuItemCerrarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCostoGastoImpor"));
			
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jMenuItemDetalleCerrarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCostoGastoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCostoGastoImpor"));
		}
		
		this.jButtonCopiarToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CopiarToolBarCostoGastoImpor"));
			
		this.jButtonVerFormToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"VerFormToolBarCostoGastoImpor"));
		
		this.jMenuItemGuardarCambiosCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCostoGastoImpor"));
			
		this.jMenuItemCopiarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCostoGastoImpor"));		
		
		this.jMenuItemVerFormCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCostoGastoImpor"));		
		
		
		this.jButtonGuardarCambiosTablaCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCostoGastoImpor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCostoGastoImpor"));
			
		this.jMenuItemGuardarCambiosTablaCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCostoGastoImpor"));		
		
		
		
		this.jButtonRecargarInformacionCostoGastoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionCostoGastoImpor"));
					
		this.jButtonRecargarInformacionToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCostoGastoImpor"));
		
		this.jMenuItemRecargarInformacionCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCostoGastoImpor"));		
		
		
		
		this.jButtonAnterioresCostoGastoImpor.addActionListener (new ButtonActionListener(this,"AnterioresCostoGastoImpor"));
		
		
		this.jButtonAnterioresToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCostoGastoImpor"));
		
		this.jMenuItemAnterioresCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCostoGastoImpor"));		
		
		
		this.jButtonSiguientesCostoGastoImpor.addActionListener (new ButtonActionListener(this,"SiguientesCostoGastoImpor"));
		
		
		this.jButtonSiguientesToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCostoGastoImpor"));
			
		this.jMenuItemSiguientesCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCostoGastoImpor"));
			
		this.jMenuItemAbrirOrderByCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCostoGastoImpor"));
			
		this.jMenuItemMostrarOcultarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCostoGastoImpor"));
			
		this.jMenuItemDetalleAbrirOrderByCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCostoGastoImpor"));
			
		this.jMenuItemDetalleMostarOcultarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCostoGastoImpor"));		
		
		
		this.jButtonNuevoGuardarCambiosCostoGastoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCostoGastoImpor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCostoGastoImpor"));
			
		this.jMenuItemNuevoGuardarCambiosCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCostoGastoImpor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCostoGastoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCostoGastoImpor"));

		this.jCheckBoxSeleccionadosCostoGastoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCostoGastoImpor"));
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCostoGastoImpor"));
		}
		
		
		this.jComboBoxTiposRelacionesCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposRelacionesCostoGastoImpor"));
			
		this.jComboBoxTiposAccionesCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesCostoGastoImpor"));
					
		this.jComboBoxTiposSeleccionarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCostoGastoImpor"));
			
		this.jTextFieldValorCampoGeneralCostoGastoImpor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCostoGastoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonidCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"idCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_empresaCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_empresaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_sucursalCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_sucursalCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_costo_gasto_imporCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_costo_gasto_imporCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonnombreCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtones_activoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"es_activoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_agrupaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_agrupaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_prorrateaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_prorrateaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_facturaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_facturaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_fleteCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_fleteCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_arancelCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_arancelCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_seguroCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_seguroCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_total_generalCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_total_generalCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_digitadoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_digitadoCostoGastoImporBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoCostoGastoImporCostoGastoImpor.addActionListener(new ButtonActionListener(this,"FK_IdTipoCostoGastoImporCostoGastoImpor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCostoGastoImpor!=null) {
				this.jInternalFrameReporteDinamicoCostoGastoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCostoGastoImpor"));
				this.jInternalFrameReporteDinamicoCostoGastoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCostoGastoImpor"));
				this.jInternalFrameReporteDinamicoCostoGastoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCostoGastoImpor"));
			}
			
			//this.jButtonCerrarReporteDinamicoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCostoGastoImpor"));				
			//this.jButtonGenerarReporteDinamicoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCostoGastoImpor"));
			//this.jButtonGenerarExcelReporteDinamicoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCostoGastoImpor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCostoGastoImpor!=null) {
				this.jInternalFrameImportacionCostoGastoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCostoGastoImpor"));
				this.jInternalFrameImportacionCostoGastoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCostoGastoImpor"));
				this.jInternalFrameImportacionCostoGastoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCostoGastoImpor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCostoGastoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByCostoGastoImpor"));
			
			this.jButtonAbrirOrderByToolBarCostoGastoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCostoGastoImpor"));			
			
			if(this.jInternalFrameOrderByCostoGastoImpor!=null) {
				this.jInternalFrameOrderByCostoGastoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCostoGastoImpor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCostoGastoImpor.jTabbedPaneRelacionesCostoGastoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCostoGastoImpor"));
		
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
            		closingInternalFrameCostoGastoImpor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCostoGastoImpor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCostoGastoImpor = (JInternalFrameBase)event.getSource();
	            	
	            CostoGastoImporBeanSwingJInternalFrame jInternalFrameParent=(CostoGastoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormCostoGastoImpor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCostoGastoImporActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCostoGastoImpor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCostoGastoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCostoGastoImpor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCostoGastoImpor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoGastoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoGastoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoGastoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCostoGastoImpor";
		inputMap = this.jButtonNuevoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCostoGastoImporActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoGastoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoGastoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCostoGastoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCostoGastoImpor";
		inputMap = this.jButtonNuevoRelacionesCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCostoGastoImporActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCostoGastoImpor";
		inputMap = this.jButtonModificarCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCostoGastoImpor";
		inputMap = this.jButtonActualizarCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCostoGastoImpor";
		inputMap = this.jButtonEliminarCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCostoGastoImpor";
		inputMap = this.jButtonCancelarCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCostoGastoImpor";
		inputMap = this.jButtonCerrarCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCostoGastoImpor";
		inputMap = this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonGuardarCambiosCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCostoGastoImpor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCostoGastoImporItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCostoGastoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCostoGastoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCostoGastoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCostoGastoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCostoGastoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCostoGastoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonidCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"idCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_empresaCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_empresaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_sucursalCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_sucursalCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCostoGastoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_costo_gasto_imporCostoGastoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_costo_gasto_imporCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtonnombreCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtones_activoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"es_activoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_agrupaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_agrupaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_prorrateaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_prorrateaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_facturaCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_facturaCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_fleteCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_fleteCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_arancelCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_arancelCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_seguroCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_seguroCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_total_generalCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_total_generalCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCostoGastoImpor.jButtoncon_digitadoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"con_digitadoCostoGastoImporBusqueda"));
		
		
		this.jButtonFK_IdTipoCostoGastoImporCostoGastoImpor.addActionListener(new ButtonActionListener(this,"FK_IdTipoCostoGastoImporCostoGastoImpor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCostoGastoImporActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCostoGastoImpor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCostoGastoImpor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
					costogastoimporAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CostoGastoImpor costogastoimporAux:costogastoimpors) {
					costogastoimporAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCostoGastoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCostoGastoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
						costogastoimporAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CostoGastoImpor costogastoimporAux:costogastoimpors) {
						costogastoimporAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
					
						if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							costogastoimporAux.setes_activo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA)) {
							existe=true;
							costogastoimporAux.setcon_agrupa(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA)) {
							existe=true;
							costogastoimporAux.setcon_prorratea(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONFACTURA)) {
							existe=true;
							costogastoimporAux.setcon_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONFLETE)) {
							existe=true;
							costogastoimporAux.setcon_flete(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONARANCEL)) {
							existe=true;
							costogastoimporAux.setcon_arancel(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONSEGURO)) {
							existe=true;
							costogastoimporAux.setcon_seguro(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL)) {
							existe=true;
							costogastoimporAux.setcon_total_general(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO)) {
							existe=true;
							costogastoimporAux.setcon_digitado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CostoGastoImpor costogastoimporAux:costogastoimpors) {
						
						if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							costogastoimporAux.setes_activo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA)) {
							existe=true;
							costogastoimporAux.setcon_agrupa(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA)) {
							existe=true;
							costogastoimporAux.setcon_prorratea(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONFACTURA)) {
							existe=true;
							costogastoimporAux.setcon_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONFLETE)) {
							existe=true;
							costogastoimporAux.setcon_flete(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONARANCEL)) {
							existe=true;
							costogastoimporAux.setcon_arancel(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONSEGURO)) {
							existe=true;
							costogastoimporAux.setcon_seguro(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL)) {
							existe=true;
							costogastoimporAux.setcon_total_general(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO)) {
							existe=true;
							costogastoimporAux.setcon_digitado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCostoGastoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCostoGastoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCostoGastoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCostoGastoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCostoGastoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCostoGastoImpor.getSelectedRows();
			
			CostoGastoImpor costogastoimporLocal=new CostoGastoImpor();
			
			//this.seleccionarTodosCostoGastoImpor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					costogastoimporLocal =(CostoGastoImpor) this.costogastoimporLogic.getCostoGastoImpors().toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					costogastoimporLocal =(CostoGastoImpor) this.costogastoimpors.toArray()[this.jTableDatosCostoGastoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				costogastoimporLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
						costogastoimporAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CostoGastoImpor costogastoimporAux:costogastoimpors) {
						costogastoimporAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCostoGastoImpor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCostoGastoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCostoGastoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCostoGastoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCostoGastoImporItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCostoGastoImporParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCostoGastoImporActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCostoGastoImpor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCostoGastoImpor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CostoGastoImpor costogastoimporAux:this.costogastoimporLogic.getCostoGastoImpors()) {
				
						if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							costogastoimporAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CostoGastoImpor costogastoimporAux:costogastoimpors) {
					
						if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							costogastoimporAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCostoGastoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCostoGastoImporActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCostoGastoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCostoGastoImpor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCostoGastoImpor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCostoGastoImpor) {				
					conSplash=true;//false;										
					
					//this.startProcessCostoGastoImpor(conSplash);
				
					this.generarReporteCostoGastoImporsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCostoGastoImporsSeleccionados();
				//this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCostoGastoImporsSeleccionados(false);
				//this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCostoGastoImporsSeleccionados(true);
				//this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCostoGastoImpor();
				
				this.exportarCostoGastoImporsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCostoGastoImpors();
				//this.importarCostoGastoImpors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCostoGastoImpor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCostoGastoImporsSeleccionados();
				//this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Costo Gasto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCostoGastoImpor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCostoGastoImpor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCostoGastoImpor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.setSelectedIndex(0);					
				}	
			} 			
			else if(CostoGastoImporBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCostoGastoImpor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCostoGastoImpor(conSplash);
					
						//this.actualizarParametrosGeneralCostoGastoImpor();
						
						this.generarReporteProcesoAccionCostoGastoImporsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CostoGastoImporBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Costo Gasto ImporES SELECCIONADOS?", "MANTENIMIENTO DE Costo Gasto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCostoGastoImpor();
				
						this.actualizarParametrosGeneralCostoGastoImpor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.costogastoimporReturnGeneral=costogastoimporLogic.procesarAccionCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.costogastoimporLogic.getCostoGastoImpors(),this.costogastoimporParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCostoGastoImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCostoGastoImpor();
					
					CostoGastoImporBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCostoGastoImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCostoGastoImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxTiposAccionesFormularioCostoGastoImpor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCostoGastoImpor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCostoGastoImporActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCostoGastoImpor();
			
			if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		
			CostoGastoImpor costogastoimpor=new CostoGastoImpor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCostoGastoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCostoGastoImpor.getSelectedItem();
			
			
			
			
			costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
			//this.sTipoAccion;
			
			if(costogastoimporsSeleccionados.size()==1) {
				for(CostoGastoImpor costogastoimporAux:costogastoimporsSeleccionados) {
					costogastoimpor=costogastoimporAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Liquidacion Impor")) {
					jButtonDetalleLiquidacionImporActionPerformed(null,rowIndex,true,false,costogastoimpor);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCostoGastoImpor();
			
      		//this.finishProcessCostoGastoImpor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCostoGastoImporReturnGeneral() throws Exception {
		if(this.costogastoimporReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.costogastoimporReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.costogastoimporReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.costogastoimporReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.costogastoimporReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.costogastoimporReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCostoGastoImpor(false);
		}
		
		if(this.costogastoimporReturnGeneral.getConRetornoLista() || this.costogastoimporReturnGeneral.getConRetornoObjeto()) {
			if(this.costogastoimporReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.costogastoimporLogic.setCostoGastoImpors(this.costogastoimporReturnGeneral.getCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.costogastoimporReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.costogastoimporLogic.setCostoGastoImpor(this.costogastoimporReturnGeneral.getCostoGastoImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCostoGastoImpor(false);
		}
	}
	
	public void actualizarParametrosGeneralCostoGastoImpor() throws Exception {
		
		
	}
	
	public ArrayList<CostoGastoImpor> getCostoGastoImporsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCostoGastoImpor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CostoGastoImpor costogastoimporAux:costogastoimporLogic.getCostoGastoImpors()) {
					if(costogastoimporAux.getIsSelected()) {
						costogastoimporsSeleccionados.add(costogastoimporAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CostoGastoImpor costogastoimporAux:this.costogastoimpors) {
					if(costogastoimporAux.getIsSelected()) {
						costogastoimporsSeleccionados.add(costogastoimporAux);				
					}
				}
			}
			
			if(costogastoimporsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						costogastoimporsSeleccionados.addAll(this.costogastoimporLogic.getCostoGastoImpors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						costogastoimporsSeleccionados.addAll(this.costogastoimpors);				
					}
				}
			}
		} else {
			costogastoimporsSeleccionados.add(this.costogastoimpor);
		}
		
		return costogastoimporsSeleccionados;
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
	
	public void generarReporteCostoGastoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCostoGastoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCostoGastoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCostoGastoImporsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCostoGastoImporsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCostoGastoImporsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Costo Gasto Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCostoGastoImpors("Todos",costogastoimporsSeleccionados);
		
	}	
	
	public void generarReporteNormalCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCostoGastoImpors("Todos",costogastoimporsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCostoGastoImporsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCostoGastoImpors("Todos",costogastoimporsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCostoGastoImpor();
		
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCostoGastoImpor();
		
		
		//this.generarReporteCostoGastoImpors("Todos",costogastoimporsSeleccionados ,costogastoimporImplementable,costogastoimporImplementableHome);
	}
	
	public void mostrarImportacionCostoGastoImpors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCostoGastoImpor();
		
		this.abrirFrameImportacionCostoGastoImpor();		
		
			
		//this.generarReporteCostoGastoImpors("Todos",costogastoimporsSeleccionados ,costogastoimporImplementable,costogastoimporImplementableHome);
	}
	
	public void importarCostoGastoImpors() throws Exception {		
	
	}
	
	public void exportarCostoGastoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCostoGastoImporsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCostoGastoImporsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCostoGastoImporsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Costo Gasto Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costogastoimpor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCostoGastoImpor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CostoGastoImpor costogastoimporAux:costogastoimporsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCostoGastoImpor(costogastoimporAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//costogastoimporAux.setsDetalleGeneralEntityReporte(costogastoimporAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCostoGastoImpor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_ESACTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_CONFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_CONFLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_CONARANCEL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_CONSEGURO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCostoGastoImpor(CostoGastoImpor costogastoimpor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=costogastoimpor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.gettipocostogastoimpor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getes_activo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getcon_agrupa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getcon_prorratea().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getcon_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getcon_flete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getcon_arancel().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getcon_seguro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getcon_total_general().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=costogastoimpor.getcon_digitado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costogastoimpor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CostoGastoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCostoGastoImpor(row);				
				iRow++;
			}				
			
			for(CostoGastoImpor costogastoimporAux:costogastoimporsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCostoGastoImpor(costogastoimporAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();		
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"costogastoimpor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("costogastoimpors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("costogastoimpor");
			//elementRoot.appendChild(element);
		
			for(CostoGastoImpor costogastoimporAux:costogastoimporsSeleccionados) {
				element = document.createElement("costogastoimpor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCostoGastoImpor(costogastoimporAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Costo Gasto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCostoGastoImpor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_ESACTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONFLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONARANCEL);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONSEGURO);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCostoGastoImpor(CostoGastoImpor costogastoimpor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.gettipocostogastoimpor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getes_activo());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getcon_agrupa());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getcon_prorratea());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getcon_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getcon_flete());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getcon_arancel());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getcon_seguro());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getcon_total_general());
		cell = row.createCell(iColumn++);cell.setCellValue(costogastoimpor.getcon_digitado());				
	}
	
	public void setFilaDatosExportarXmlCostoGastoImpor(CostoGastoImpor costogastoimpor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CostoGastoImporConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(costogastoimpor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CostoGastoImporConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(costogastoimpor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CostoGastoImporConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(costogastoimpor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CostoGastoImporConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(costogastoimpor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtipocostogastoimpor_descripcion = document.createElement(CostoGastoImporConstantesFunciones.IDTIPOCOSTOGASTOIMPOR);
		elementtipocostogastoimpor_descripcion.appendChild(document.createTextNode(costogastoimpor.gettipocostogastoimpor_descripcion()));
		element.appendChild(elementtipocostogastoimpor_descripcion);

		Element elementnombre = document.createElement(CostoGastoImporConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(costogastoimpor.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_activo = document.createElement(CostoGastoImporConstantesFunciones.ESACTIVO);
		elementes_activo.appendChild(document.createTextNode(costogastoimpor.getes_activo().toString().trim()));
		element.appendChild(elementes_activo);

		Element elementcon_agrupa = document.createElement(CostoGastoImporConstantesFunciones.CONAGRUPA);
		elementcon_agrupa.appendChild(document.createTextNode(costogastoimpor.getcon_agrupa().toString().trim()));
		element.appendChild(elementcon_agrupa);

		Element elementcon_prorratea = document.createElement(CostoGastoImporConstantesFunciones.CONPRORRATEA);
		elementcon_prorratea.appendChild(document.createTextNode(costogastoimpor.getcon_prorratea().toString().trim()));
		element.appendChild(elementcon_prorratea);

		Element elementcon_factura = document.createElement(CostoGastoImporConstantesFunciones.CONFACTURA);
		elementcon_factura.appendChild(document.createTextNode(costogastoimpor.getcon_factura().toString().trim()));
		element.appendChild(elementcon_factura);

		Element elementcon_flete = document.createElement(CostoGastoImporConstantesFunciones.CONFLETE);
		elementcon_flete.appendChild(document.createTextNode(costogastoimpor.getcon_flete().toString().trim()));
		element.appendChild(elementcon_flete);

		Element elementcon_arancel = document.createElement(CostoGastoImporConstantesFunciones.CONARANCEL);
		elementcon_arancel.appendChild(document.createTextNode(costogastoimpor.getcon_arancel().toString().trim()));
		element.appendChild(elementcon_arancel);

		Element elementcon_seguro = document.createElement(CostoGastoImporConstantesFunciones.CONSEGURO);
		elementcon_seguro.appendChild(document.createTextNode(costogastoimpor.getcon_seguro().toString().trim()));
		element.appendChild(elementcon_seguro);

		Element elementcon_total_general = document.createElement(CostoGastoImporConstantesFunciones.CONTOTALGENERAL);
		elementcon_total_general.appendChild(document.createTextNode(costogastoimpor.getcon_total_general().toString().trim()));
		element.appendChild(elementcon_total_general);

		Element elementcon_digitado = document.createElement(CostoGastoImporConstantesFunciones.CONDIGITADO);
		elementcon_digitado.appendChild(document.createTextNode(costogastoimpor.getcon_digitado().toString().trim()));
		element.appendChild(elementcon_digitado);
	}
	
	public void generarReporteGroupGenericoCostoGastoImporsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CostoGastoImpor> costogastoimporsSeleccionados=new ArrayList<CostoGastoImpor>();
		
		costogastoimporsSeleccionados=this.getCostoGastoImporsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCostoGastoImpor(costogastoimporsSeleccionados);
		
		this.generarReporteCostoGastoImpors("Todos",costogastoimporsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCostoGastoImpor(ArrayList<CostoGastoImpor> costogastoimporsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CostoGastoImpor costogastoimporAux:costogastoimporsSeleccionados) {
				costogastoimporAux.setsDetalleGeneralEntityReporte(costogastoimporAux.toString());
			
				if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(costogastoimporAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(costogastoimporAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(costogastoimporAux.gettipocostogastoimpor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(costogastoimporAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getes_activo()));
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getcon_agrupa()));
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getcon_prorratea()));
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONFACTURA)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getcon_factura()));
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONFLETE)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getcon_flete()));
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONARANCEL)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getcon_arancel()));
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONSEGURO)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getcon_seguro()));
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getcon_total_general()));
				}
				 else if(sTipoSeleccionar.equals(CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO)) {
					existe=true;
					costogastoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(costogastoimporAux.getcon_digitado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCostoGastoImpor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCostoGastoImpor=true;
				this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=true;
				this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=true;
			}
			
			this.isVisibilidadCeldaModificarCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarCostoGastoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarCostoGastoImpor=true;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarCostoGastoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarCostoGastoImpor=true;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=true;
			this.isVisibilidadCeldaCancelarCostoGastoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarCostoGastoImpor=true;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarCostoGastoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCostoGastoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=true;
			this.isVisibilidadCeldaModificarCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarCostoGastoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarCostoGastoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarCostoGastoImpor=true;
			this.isVisibilidadCeldaActualizarCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarCostoGastoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarCostoGastoImpor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCostoGastoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=true;
		} else {
			this.actualizarEstadoPanelsCostoGastoImpor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCostoGastoImpor=false;
			//this.isVisibilidadCeldaVerFormCostoGastoImpor=false;
			this.isVisibilidadCeldaDuplicarCostoGastoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!costogastoimporSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
		} else {
			this.isVisibilidadCeldaNuevoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(costogastoimporSessionBean.getEsGuardarRelacionado()) {
			if(!costogastoimporSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;												
			}
			
			this.jButtonCerrarCostoGastoImpor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCostoGastoImpor=false;
		}
		
		if(!this.permiteMantenimiento(this.costogastoimpor)) {
			this.isVisibilidadCeldaActualizarCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarCostoGastoImpor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCostoGastoImpor() {
		this.isVisibilidadCeldaNuevoCostoGastoImpor=false;
		this.isVisibilidadCeldaGuardarCambiosCostoGastoImpor=false;
	}
	
	public void actualizarEstadoPanelsCostoGastoImpor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionCostoGastoImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCostoGastoImpor!=null) {
				this.jScrollPanelDatosCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionCostoGastoImpor!=null) {
				this.jPanelPaginacionCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionCostoGastoImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCostoGastoImpor!=null) {
				this.jScrollPanelDatosCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionCostoGastoImpor!=null) {
				this.jPanelPaginacionCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionCostoGastoImpor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCostoGastoImpor!=null) {
				this.jScrollPanelDatosCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionCostoGastoImpor!=null) {
				this.jPanelPaginacionCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionCostoGastoImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCostoGastoImpor!=null) {
				this.jScrollPanelDatosCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionCostoGastoImpor!=null) {
				this.jPanelPaginacionCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionCostoGastoImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCostoGastoImpor!=null) {
				this.jScrollPanelDatosCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionCostoGastoImpor!=null) {
				this.jPanelPaginacionCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionCostoGastoImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCostoGastoImpor!=null) {
				this.jScrollPanelDatosCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionCostoGastoImpor!=null) {
				this.jPanelPaginacionCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionCostoGastoImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCostoGastoImpor!=null) {
				this.jScrollPanelDatosCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionCostoGastoImpor!=null) {
				this.jPanelPaginacionCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
					this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCostoGastoImpor!=null) {
				this.jTabbedPaneBusquedasCostoGastoImpor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCostoGastoImpor!=null) {
				this.jPanelParametrosReportesCostoGastoImpor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoCostoGastoImpor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCostoGastoImpor) {this.jTabbedPaneBusquedasCostoGastoImpor.remove(jPanelFK_IdTipoCostoGastoImporCostoGastoImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTipoCostoGastoImpor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoCostoGastoImpor) {this.jTabbedPaneBusquedasCostoGastoImpor.remove(jPanelFK_IdTipoCostoGastoImporCostoGastoImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCostoGastoImpor(Boolean isParaTipoCostoGastoImpor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCostoGastoImporNegation=!isParaTipoCostoGastoImpor;

			this.isVisibilidadFK_IdTipoCostoGastoImpor=isParaTipoCostoGastoImpor;
			if(!this.isVisibilidadFK_IdTipoCostoGastoImpor) {this.jTabbedPaneBusquedasCostoGastoImpor.remove(jPanelFK_IdTipoCostoGastoImporCostoGastoImpor);}
		}
		
	}
	
	

	public String registrarSesionCostoGastoImporParaDetalleLiquidacionImpores() throws Exception {
		Boolean isPaginaPopupDetalleLiquidacionImpor=false;

		try {

			if(this.costogastoimporSessionBean==null) {
				this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
			}

			if(this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean==null) {
				this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean.setsPathNavegacionActual(costogastoimporSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleLiquidacionImpor=this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor(true);
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpor(CostoGastoImporConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean.setisBusquedaDesdeForeignKeySesionCostoGastoImpor(true);
			this.jInternalFrameDetalleFormCostoGastoImpor.detalleliquidacionimporSessionBean.setlidCostoGastoImporActual(this.idCostoGastoImporActual);

			costogastoimporSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCostoGastoImpor(true);
			costogastoimporSessionBean.setlIdCostoGastoImporActualForeignKey(this.idCostoGastoImporActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CostoGastoImporSessionBean costogastoimporSessionBean=new CostoGastoImporSessionBean();
		
		if(this.costogastoimporSessionBean==null) {
			this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
		}
		
		this.costogastoimporSessionBean.setsUltimaBusquedaCostoGastoImpor(this.getsAccionBusqueda());
		this.costogastoimporSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.costogastoimporSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			costogastoimporSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			costogastoimporSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCostoGastoImpor")) {
			costogastoimporSessionBean.setid_tipo_costo_gasto_impor(this.getid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CostoGastoImporSessionBean costogastoimporSessionBean=new CostoGastoImporSessionBean();
		
		if(this.costogastoimporSessionBean==null) {
			this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
		}
		
		if(this.costogastoimporSessionBean.getsUltimaBusquedaCostoGastoImpor()!=null&&!this.costogastoimporSessionBean.getsUltimaBusquedaCostoGastoImpor().equals("")) {
			this.setsAccionBusqueda(costogastoimporSessionBean.getsUltimaBusquedaCostoGastoImpor());
			this.setiNumeroPaginacion(costogastoimporSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(costogastoimporSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(costogastoimporSessionBean.getid_empresa());
				costogastoimporSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(costogastoimporSessionBean.getid_sucursal());
				costogastoimporSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCostoGastoImpor")) {
				this.setid_tipo_costo_gasto_imporFK_IdTipoCostoGastoImpor(costogastoimporSessionBean.getid_tipo_costo_gasto_impor());
				costogastoimporSessionBean.setid_tipo_costo_gasto_impor(-1L);
			}
		}
		
		this.costogastoimporSessionBean.setsUltimaBusquedaCostoGastoImpor("");
		this.costogastoimporSessionBean.setiNumeroPaginacion(CostoGastoImporConstantesFunciones.INUMEROPAGINACION);
		this.costogastoimporSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCostoGastoImpor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCostoGastoImpor() {
		this.updateBorderResaltarBusquedasFormularioCostoGastoImpor();
		this.updateVisibilidadBusquedasFormularioCostoGastoImpor();
		this.updateHabilitarBusquedasFormularioCostoGastoImpor();
	}
	
	public void updateBorderResaltarBusquedasFormularioCostoGastoImpor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCostoGastoImpor.getComponents().length>0) {
	

		if(this.costogastoimporConstantesFunciones.resaltarFK_IdTipoCostoGastoImporCostoGastoImpor!=null) {
			index= this.jTabbedPaneBusquedasCostoGastoImpor.indexOfComponent(this.jPanelFK_IdTipoCostoGastoImporCostoGastoImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCostoGastoImpor.getComponent(index);
				jPanel.setBorder(this.costogastoimporConstantesFunciones.resaltarFK_IdTipoCostoGastoImporCostoGastoImpor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCostoGastoImpor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCostoGastoImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCostoGastoImpor.indexOfComponent(this.jPanelFK_IdTipoCostoGastoImporCostoGastoImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCostoGastoImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.costogastoimporConstantesFunciones.mostrarFK_IdTipoCostoGastoImporCostoGastoImpor);
			if(!this.costogastoimporConstantesFunciones.mostrarFK_IdTipoCostoGastoImporCostoGastoImpor && index>-1) {
				this.jTabbedPaneBusquedasCostoGastoImpor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCostoGastoImpor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCostoGastoImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCostoGastoImpor.indexOfComponent(this.jPanelFK_IdTipoCostoGastoImporCostoGastoImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCostoGastoImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.costogastoimporConstantesFunciones.activarFK_IdTipoCostoGastoImporCostoGastoImpor);
				this.jTabbedPaneBusquedasCostoGastoImpor.setEnabledAt(index,this.costogastoimporConstantesFunciones.activarFK_IdTipoCostoGastoImporCostoGastoImpor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCostoGastoImpor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoCostoGastoImpor")) {
			index= this.jTabbedPaneBusquedasCostoGastoImpor.indexOfComponent(this.jPanelFK_IdTipoCostoGastoImporCostoGastoImpor);

			this.jTabbedPaneBusquedasCostoGastoImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCostoGastoImpor.getComponent(index);

			this.costogastoimporConstantesFunciones.setResaltarFK_IdTipoCostoGastoImporCostoGastoImpor(resaltar);

			jPanel.setBorder(this.costogastoimporConstantesFunciones.resaltarFK_IdTipoCostoGastoImporCostoGastoImpor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCostoGastoImpor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCostoGastoImpor() throws Exception {

		if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCostoGastoImpor();
		this.updateVisibilidadResaltarControlesFormularioCostoGastoImpor();
		this.updateHabilitarResaltarControlesFormularioCostoGastoImpor();
		
	}
	
	public void updateBorderResaltarControlesFormularioCostoGastoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.costogastoimporConstantesFunciones.resaltaridCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltaridCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarid_empresaCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarid_empresaCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarid_sucursalCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarid_sucursalCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarid_tipo_costo_gasto_imporCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarid_tipo_costo_gasto_imporCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarnombreCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jTextAreanombreCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarnombreCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltares_activoCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltares_activoCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarcon_agrupaCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarcon_agrupaCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarcon_prorrateaCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarcon_prorrateaCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarcon_facturaCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarcon_facturaCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarcon_fleteCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarcon_fleteCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarcon_arancelCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarcon_arancelCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarcon_seguroCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarcon_seguroCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarcon_total_generalCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarcon_total_generalCostoGastoImpor);}
		if(this.costogastoimporConstantesFunciones.resaltarcon_digitadoCostoGastoImpor!=null && this.jInternalFrameDetalleFormCostoGastoImpor!=null) {this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.setBorderPainted(true);this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.setBorder(this.costogastoimporConstantesFunciones.resaltarcon_digitadoCostoGastoImpor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCostoGastoImpor() throws Exception {		
		if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
	
		//this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostraridCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelidCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostraridCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarid_empresaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelid_empresaCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarid_empresaCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarid_sucursalCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelid_sucursalCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarid_sucursalCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarid_tipo_costo_gasto_imporCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelid_tipo_costo_gasto_imporCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarid_tipo_costo_gasto_imporCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jTextAreanombreCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarnombreCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelnombreCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarnombreCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrares_activoCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPaneles_activoCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrares_activoCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_agrupaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelcon_agrupaCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_agrupaCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_prorrateaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelcon_prorrateaCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_prorrateaCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_facturaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelcon_facturaCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_facturaCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_fleteCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelcon_fleteCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_fleteCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_arancelCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelcon_arancelCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_arancelCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_seguroCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelcon_seguroCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_seguroCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_total_generalCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelcon_total_generalCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_total_generalCostoGastoImpor);
		//this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_digitadoCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jPanelcon_digitadoCostoGastoImpor.setVisible(this.costogastoimporConstantesFunciones.mostrarcon_digitadoCostoGastoImpor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCostoGastoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCostoGastoImpor!=null) {
	
		this.jInternalFrameDetalleFormCostoGastoImpor.jLabelidCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activaridCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_empresaCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarid_empresaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_sucursalCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarid_sucursalCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarid_tipo_costo_gasto_imporCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jTextAreanombreCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarnombreCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxes_activoCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activares_activoCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_agrupaCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarcon_agrupaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_prorrateaCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarcon_prorrateaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_facturaCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarcon_facturaCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_fleteCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarcon_fleteCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_arancelCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarcon_arancelCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_seguroCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarcon_seguroCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_total_generalCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarcon_total_generalCostoGastoImpor);
		this.jInternalFrameDetalleFormCostoGastoImpor.jCheckBoxcon_digitadoCostoGastoImpor.setEnabled(this.costogastoimporConstantesFunciones.activarcon_digitadoCostoGastoImpor);
		}
	}
	
		
}