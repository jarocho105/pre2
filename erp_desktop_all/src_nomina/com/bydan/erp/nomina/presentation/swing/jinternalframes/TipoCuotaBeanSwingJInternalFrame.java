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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.TipoCuotaConstantesFunciones;
import com.bydan.erp.nomina.util.TipoCuotaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoCuotaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoCuotaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class TipoCuotaBeanSwingJInternalFrame extends TipoCuotaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCuotaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCuota> tipocuotaValidator = new ClassValidator<TipoCuota>(TipoCuota.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCuota tipocuota;	
	public TipoCuota tipocuotaAux;
	public TipoCuota tipocuotaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCuota tipocuotaTotales;
	public Long idTipoCuotaActual;
	public Long iIdNuevoTipoCuota=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosPrestamo=false;

	public Boolean getIsTienePermisosPrestamo() {
		return isTienePermisosPrestamo;
	}

	public void setIsTienePermisosPrestamo(Boolean isTienePermisosPrestamo) {
		this.isTienePermisosPrestamo= isTienePermisosPrestamo;
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
	
	public Boolean isPermisoTodoTipoCuota;
	public Boolean isPermisoNuevoTipoCuota;
	public Boolean isPermisoActualizarTipoCuota;
	public Boolean isPermisoActualizarOriginalTipoCuota;
	public Boolean isPermisoEliminarTipoCuota;
	public Boolean isPermisoGuardarCambiosTipoCuota;
	public Boolean isPermisoConsultaTipoCuota;
	public Boolean isPermisoBusquedaTipoCuota;
	public Boolean isPermisoReporteTipoCuota;
	public Boolean isPermisoPaginacionMedioTipoCuota;
	public Boolean isPermisoPaginacionAltoTipoCuota;
	public Boolean isPermisoPaginacionTodoTipoCuota;
	public Boolean isPermisoCopiarTipoCuota;
	public Boolean isPermisoVerFormTipoCuota;
	public Boolean isPermisoDuplicarTipoCuota;
	public Boolean isPermisoOrdenTipoCuota;
	
	
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
	
	public TipoCuotaParameterReturnGeneral tipocuotaReturnGeneral;
	public TipoCuotaParameterReturnGeneral tipocuotaParameterGeneral;
	
	

	public PrestamoLogic prestamoLogic=null;

	public PrestamoLogic getPrestamoLogic() {
		return prestamoLogic;
	}

	public void setPrestamoLogic(PrestamoLogic prestamoLogic) {
		this.prestamoLogic = prestamoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCuota=false;
	public Boolean esParaAccionDesdeFormularioTipoCuota=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCuotaSessionBeanAdditional tipocuotaSessionBeanAdditional=null;
	
	public TipoCuotaSessionBeanAdditional getTipoCuotaSessionBeanAdditional() {
		return this.tipocuotaSessionBeanAdditional;
	}
	
	public void setTipoCuotaSessionBeanAdditional(TipoCuotaSessionBeanAdditional tipocuotaSessionBeanAdditional) {
		try {
			this.tipocuotaSessionBeanAdditional=tipocuotaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCuotaBeanSwingJInternalFrameAdditional tipocuotaBeanSwingJInternalFrameAdditional=null;
	//public class TipoCuotaBeanSwingJInternalFrame
	
	public TipoCuotaBeanSwingJInternalFrameAdditional getTipoCuotaBeanSwingJInternalFrameAdditional() {
		return this.tipocuotaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCuotaBeanSwingJInternalFrameAdditional(TipoCuotaBeanSwingJInternalFrameAdditional tipocuotaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocuotaBeanSwingJInternalFrameAdditional=tipocuotaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCuotaLogic tipocuotaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCuota tipocuotaBean;
	public TipoCuotaConstantesFunciones tipocuotaConstantesFunciones;
	//public TipoCuotaParameterReturnGeneral tipocuotaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCuota> tipocuotas;	
	//public List<TipoCuota> tipocuotasEliminados;
	//public List<TipoCuota> tipocuotasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCuota=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCuota=true;
	public Boolean isVisibilidadCeldaCopiarTipoCuota=true;
	public Boolean isVisibilidadCeldaVerFormTipoCuota=true;
	public Boolean isVisibilidadCeldaOrdenTipoCuota=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
	public Boolean isVisibilidadCeldaModificarTipoCuota=false;
	public Boolean isVisibilidadCeldaActualizarTipoCuota=false;
	public Boolean isVisibilidadCeldaEliminarTipoCuota=false;
	public Boolean isVisibilidadCeldaCancelarTipoCuota=false;
	public Boolean isVisibilidadCeldaGuardarTipoCuota=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCuota=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoCuota() {
		return this.iIdNuevoTipoCuota;
	}

	public void setiIdNuevoTipoCuota(Long iIdNuevoTipoCuota) {
		this.iIdNuevoTipoCuota = iIdNuevoTipoCuota;
	}
	
	public Long getidTipoCuotaActual() {
		return this.idTipoCuotaActual;
	}

	public void setidTipoCuotaActual(Long idTipoCuotaActual) {
		this.idTipoCuotaActual = idTipoCuotaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCuota gettipocuota() {
		return this.tipocuota;
	}

	public void settipocuota(TipoCuota tipocuota) {
		this.tipocuota = tipocuota;
	}
	
	public TipoCuota gettipocuotaAux() {
		return this.tipocuotaAux;
	}

	public void settipocuotaAux(TipoCuota tipocuotaAux) {
		this.tipocuotaAux = tipocuotaAux;
	}				
	
	public TipoCuota gettipocuotaAnterior() {
		return this.tipocuotaAnterior;
	}

	public void settipocuotaAnterior(TipoCuota tipocuotaAnterior) {
		this.tipocuotaAnterior = tipocuotaAnterior;
	}	
	
	public TipoCuota gettipocuotaTotales() {
		return this.tipocuotaTotales;
	}

	public void settipocuotaTotales(TipoCuota tipocuotaTotales) {
		this.tipocuotaTotales = tipocuotaTotales;
	}	
	
	public TipoCuota gettipocuotaBean() {
		return this.tipocuotaBean;
	}

	public void settipocuotaBean(TipoCuota tipocuotaBean) {
		this.tipocuotaBean = tipocuotaBean;
	}	
	
	public TipoCuotaParameterReturnGeneral gettipocuotaReturnGeneral() {
		return this.tipocuotaReturnGeneral;
	}

	public void settipocuotaReturnGeneral(TipoCuotaParameterReturnGeneral tipocuotaReturnGeneral) {
		this.tipocuotaReturnGeneral = tipocuotaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCuotaLogic getTipoCuotaLogic()	{		
		return tipocuotaLogic;
	}

	public void setTipoCuotaLogic(TipoCuotaLogic tipocuotaLogic) {
		this.tipocuotaLogic = tipocuotaLogic;
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
	
	public Boolean getIsEsNuevoTipoCuota() {
		return isEsNuevoTipoCuota;
	}

	public void setIsEsNuevoTipoCuota(Boolean isEsNuevoTipoCuota) {
		this.isEsNuevoTipoCuota = isEsNuevoTipoCuota;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCuota() {
		return esParaAccionDesdeFormularioTipoCuota;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCuota(Boolean esParaAccionDesdeFormularioTipoCuota) {
		this.esParaAccionDesdeFormularioTipoCuota = esParaAccionDesdeFormularioTipoCuota;
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

			if(this.tipocuotaSessionBean==null) {
				this.tipocuotaSessionBean=new TipoCuotaSessionBean();
			}

			if(!this.tipocuotaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocuotaSessionBean.getlidEmpresaActual());
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

					if(this.tipocuota!=null) {
						this.tipocuota.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCuota!=null) {
						this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCuota.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCuota!=null) {
						if(this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoCuotaGenerico)throws Exception
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
				jComboBoxid_empresaTipoCuotaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoCuotaGenerico!=null && jComboBoxid_empresaTipoCuotaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoCuotaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCuota tipocuota,JComboBox jComboBoxid_empresaTipoCuotaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoCuotaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoCuotaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocuota.setid_empresa(empresaAux.getId());
				tipocuota.setempresa_descripcion(TipoCuotaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocuota.setEmpresa(empresaAux);			}
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

					if(!TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCuota!=null) { 
							this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCuota!=null) { 
					}

					if(!TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCuota!=null) {
							this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCuota!=null) {
							this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoCuota() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCuotaConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuota(this.tipocuotaLogic.getTipoCuotas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCuotaConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuota(this.tipocuotas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocuotaLogic.setTipoCuotas(this.tipocuotas);
			tipocuotaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCuotaParameterReturnGeneral getTipoCuotaParameterGeneral() {
		return this.tipocuotaParameterGeneral;
	}
	
	public void setTipoCuotaParameterGeneral(TipoCuotaParameterReturnGeneral tipocuotaParameterGeneral) {
		this.tipocuotaParameterGeneral = tipocuotaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCuota() {
		return isPermisoTodoTipoCuota;
	}

	public void setIsPermisoTodoTipoCuota(Boolean isPermisoTodoTipoCuota) {
		this.isPermisoTodoTipoCuota = isPermisoTodoTipoCuota;
	}

	public Boolean getIsPermisoNuevoTipoCuota() {
		return isPermisoNuevoTipoCuota;
	}

	public void setIsPermisoNuevoTipoCuota(Boolean isPermisoNuevoTipoCuota) {
		this.isPermisoNuevoTipoCuota = isPermisoNuevoTipoCuota;
	}

	public Boolean getIsPermisoActualizarTipoCuota() {
		return isPermisoActualizarTipoCuota;
	}

	public void setIsPermisoActualizarTipoCuota(Boolean isPermisoActualizarTipoCuota) {
		this.isPermisoActualizarTipoCuota = isPermisoActualizarTipoCuota;
	}

	public Boolean getIsPermisoEliminarTipoCuota() {
		return isPermisoEliminarTipoCuota;
	}

	public void setIsPermisoEliminarTipoCuota(Boolean isPermisoEliminarTipoCuota) {
		this.isPermisoEliminarTipoCuota = isPermisoEliminarTipoCuota;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCuota() {
		return isPermisoGuardarCambiosTipoCuota;
	}

	public void setIsPermisoGuardarCambiosTipoCuota(Boolean isPermisoGuardarCambiosTipoCuota) {
		this.isPermisoGuardarCambiosTipoCuota = isPermisoGuardarCambiosTipoCuota;
	}
	
	public Boolean getIsPermisoConsultaTipoCuota() {
		return isPermisoConsultaTipoCuota;
	}

	public void setIsPermisoConsultaTipoCuota(Boolean isPermisoConsultaTipoCuota) {
		this.isPermisoConsultaTipoCuota = isPermisoConsultaTipoCuota;
	}

	public Boolean getIsPermisoBusquedaTipoCuota() {
		return isPermisoBusquedaTipoCuota;
	}

	public void setIsPermisoBusquedaTipoCuota(Boolean isPermisoBusquedaTipoCuota) {
		this.isPermisoBusquedaTipoCuota = isPermisoBusquedaTipoCuota;
	}

	public Boolean getIsPermisoReporteTipoCuota() {
		return isPermisoReporteTipoCuota;
	}

	public void setIsPermisoReporteTipoCuota(Boolean isPermisoReporteTipoCuota) {
		this.isPermisoReporteTipoCuota = isPermisoReporteTipoCuota;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCuota() {
		return isPermisoPaginacionMedioTipoCuota;
	}

	public void setIsPermisoPaginacionMedioTipoCuota(Boolean isPermisoPaginacionMedioTipoCuota) {
		this.isPermisoPaginacionMedioTipoCuota = isPermisoPaginacionMedioTipoCuota;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCuota() {
		return isPermisoPaginacionTodoTipoCuota;
	}

	public void setIsPermisoPaginacionTodoTipoCuota(Boolean isPermisoPaginacionTodoTipoCuota) {
		this.isPermisoPaginacionTodoTipoCuota = isPermisoPaginacionTodoTipoCuota;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCuota() {
		return isPermisoPaginacionAltoTipoCuota;
	}

	public void setIsPermisoPaginacionAltoTipoCuota(Boolean isPermisoPaginacionAltoTipoCuota) {
		this.isPermisoPaginacionAltoTipoCuota = isPermisoPaginacionAltoTipoCuota;
	}
	
	public Boolean getIsPermisoCopiarTipoCuota() {
		return isPermisoCopiarTipoCuota;
	}

	public void setIsPermisoCopiarTipoCuota(Boolean isPermisoCopiarTipoCuota) {
		this.isPermisoCopiarTipoCuota = isPermisoCopiarTipoCuota;
	}
	
	public Boolean getIsPermisoVerFormTipoCuota() {
		return isPermisoVerFormTipoCuota;
	}

	public void setIsPermisoVerFormTipoCuota(Boolean isPermisoVerFormTipoCuota) {
		this.isPermisoVerFormTipoCuota = isPermisoVerFormTipoCuota;
	}
	
	public Boolean getIsPermisoDuplicarTipoCuota() {
		return isPermisoDuplicarTipoCuota;
	}

	public void setIsPermisoDuplicarTipoCuota(Boolean isPermisoDuplicarTipoCuota) {
		this.isPermisoDuplicarTipoCuota = isPermisoDuplicarTipoCuota;
	}
	
	public Boolean getIsPermisoOrdenTipoCuota() {
		return isPermisoOrdenTipoCuota;
	}

	public void setIsPermisoOrdenTipoCuota(Boolean isPermisoOrdenTipoCuota) {
		this.isPermisoOrdenTipoCuota = isPermisoOrdenTipoCuota;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCuota() {
		return isVisibilidadCeldaNuevoTipoCuota;
	}

	public void setIsVisibilidadCeldaNuevoTipoCuota(Boolean isVisibilidadCeldaNuevoTipoCuota) {
		this.isVisibilidadCeldaNuevoTipoCuota = isVisibilidadCeldaNuevoTipoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCuota() {
		return isVisibilidadCeldaDuplicarTipoCuota;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCuota(Boolean isVisibilidadCeldaDuplicarTipoCuota) {
		this.isVisibilidadCeldaDuplicarTipoCuota = isVisibilidadCeldaDuplicarTipoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCuota() {
		return isVisibilidadCeldaCopiarTipoCuota;
	}

	public void setIsVisibilidadCeldaCopiarTipoCuota(Boolean isVisibilidadCeldaCopiarTipoCuota) {
		this.isVisibilidadCeldaCopiarTipoCuota = isVisibilidadCeldaCopiarTipoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCuota() {
		return isVisibilidadCeldaVerFormTipoCuota;
	}

	public void setIsVisibilidadCeldaVerFormTipoCuota(Boolean isVisibilidadCeldaVerFormTipoCuota) {
		this.isVisibilidadCeldaVerFormTipoCuota = isVisibilidadCeldaVerFormTipoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCuota() {
		return isVisibilidadCeldaOrdenTipoCuota;
	}

	public void setIsVisibilidadCeldaOrdenTipoCuota(Boolean isVisibilidadCeldaOrdenTipoCuota) {
		this.isVisibilidadCeldaOrdenTipoCuota = isVisibilidadCeldaOrdenTipoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCuota() {
		return isVisibilidadCeldaNuevoRelacionesTipoCuota;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCuota(Boolean isVisibilidadCeldaNuevoRelacionesTipoCuota) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCuota = isVisibilidadCeldaNuevoRelacionesTipoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCuota() {
		return isVisibilidadCeldaModificarTipoCuota;
	}

	public void setIsVisibilidadCeldaModificarTipoCuota(Boolean isVisibilidadCeldaModificarTipoCuota) {
		this.isVisibilidadCeldaModificarTipoCuota = isVisibilidadCeldaModificarTipoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCuota() {
		return isVisibilidadCeldaActualizarTipoCuota;
	}

	public void setIsVisibilidadCeldaActualizarTipoCuota(Boolean isVisibilidadCeldaActualizarTipoCuota) {
		this.isVisibilidadCeldaActualizarTipoCuota = isVisibilidadCeldaActualizarTipoCuota;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCuota() {
		return isVisibilidadCeldaEliminarTipoCuota;
	}

	public void setIsVisibilidadCeldaEliminarTipoCuota(Boolean isVisibilidadCeldaEliminarTipoCuota) {
		this.isVisibilidadCeldaEliminarTipoCuota = isVisibilidadCeldaEliminarTipoCuota;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCuota() {
		return isVisibilidadCeldaCancelarTipoCuota;
	}

	public void setIsVisibilidadCeldaCancelarTipoCuota(Boolean isVisibilidadCeldaCancelarTipoCuota) {
		this.isVisibilidadCeldaCancelarTipoCuota = isVisibilidadCeldaCancelarTipoCuota;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCuota() {
		return isVisibilidadCeldaGuardarTipoCuota;
	}

	public void setIsVisibilidadCeldaGuardarTipoCuota(Boolean isVisibilidadCeldaGuardarTipoCuota) {
		this.isVisibilidadCeldaGuardarTipoCuota = isVisibilidadCeldaGuardarTipoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCuota() {
		return isVisibilidadCeldaGuardarCambiosTipoCuota;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCuota(Boolean isVisibilidadCeldaGuardarCambiosTipoCuota) {
		this.isVisibilidadCeldaGuardarCambiosTipoCuota = isVisibilidadCeldaGuardarCambiosTipoCuota;
	}
		
	public TipoCuotaSessionBean gettipocuotaSessionBean() {
		return this.tipocuotaSessionBean;
	}
	
	public void settipocuotaSessionBean(TipoCuotaSessionBean tipocuotaSessionBean) {
		this.tipocuotaSessionBean=tipocuotaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCuota(TipoCuota tipocuota)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocuota,null);
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
	
	public void bugActualizarReferenciaActual(TipoCuota tipocuota,TipoCuota tipocuotaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCuota(tipocuota);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocuotaAux.setId(tipocuota.getId());
		tipocuotaAux.setVersionRow(tipocuota.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCuota();
		
			int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocuotaValidator.getInvalidValues(this.tipocuota);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocuotaLogic.setDatosCliente(datosCliente);
			tipocuotaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocuotaAux=new  TipoCuota();
				
				tipocuotaAux.setIsNew(true);
				tipocuotaAux.setIsChanged(true);
				
				tipocuotaAux.setTipoCuotaOriginal(this.tipocuota);
				
				tipocuotaAux.setId(this.tipocuota.getId());	
				tipocuotaAux.setVersionRow(this.tipocuota.getVersionRow());	
				tipocuotaAux.setid_empresa(this.tipocuota.getid_empresa());	
				tipocuotaAux.setcodigo(this.tipocuota.getcodigo());	
				tipocuotaAux.setnombre(this.tipocuota.getnombre());	
				tipocuotaAux.setes_prove(this.tipocuota.getes_prove());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuotaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocuotaAux,tipocuotaLogic.getTipoCuotas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuotaAux,tipocuotas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuotaLogic.saveTipoCuotas();//WithConnection
						//tipocuotaLogic.getSetVersionRowTipoCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuota,tipocuotaAux);
					
					this.refrescarForeignKeysDescripcionesTipoCuota();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos().addAll(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamos.addAll(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuotaLogic.saveTipoCuotaRelaciones(tipocuotaAux,this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());//WithConnection
								//tipocuotaLogic.getSetVersionRowTipoCuotas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocuota,tipocuotaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamos= new ArrayList<Prestamo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuotaAux.setPrestamos(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocuotaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocuotaAux,tipocuotaLogic.getTipoCuotas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocuotaAux,tipocuotas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocuota,tipocuotaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocuotaAux=new  TipoCuota();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocuotaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocuotaSessionBean.getEsGuardarRelacionado() && this.tipocuota.getId()>=0)) {
						
					tipocuotaAux.setIsNew(false);
				}
				
				tipocuotaAux.setIsDeleted(false);
			
				tipocuotaAux.setId(this.tipocuota.getId());	
				tipocuotaAux.setVersionRow(this.tipocuota.getVersionRow());	
				tipocuotaAux.setid_empresa(this.tipocuota.getid_empresa());	
				tipocuotaAux.setcodigo(this.tipocuota.getcodigo());	
				tipocuotaAux.setnombre(this.tipocuota.getnombre());	
				tipocuotaAux.setes_prove(this.tipocuota.getes_prove());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuotaAux,tipocuotaLogic.getTipoCuotas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuotaAux,tipocuotas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuotaLogic.saveTipoCuotas();//WithConnection
						//tipocuotaLogic.getSetVersionRowTipoCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuota,tipocuotaAux);
					
					this.refrescarForeignKeysDescripcionesTipoCuota();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos().addAll(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamos.addAll(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuotaLogic.saveTipoCuotaRelaciones(tipocuotaAux,this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());//WithConnection
								//tipocuotaLogic.getSetVersionRowTipoCuotas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocuota,tipocuotaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamos= new ArrayList<Prestamo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuotaAux.setPrestamos(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocuotaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocuotaAux,tipocuotaLogic.getTipoCuotas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocuotaAux,tipocuotas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocuota,tipocuotaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocuotaAux=new  TipoCuota();
				
				tipocuotaAux.setIsNew(false);
				tipocuotaAux.setIsChanged(false);
				
				tipocuotaAux.setIsDeleted(true);
				
				tipocuotaAux.setId(this.tipocuota.getId());	
				tipocuotaAux.setVersionRow(this.tipocuota.getVersionRow());	
				tipocuotaAux.setid_empresa(this.tipocuota.getid_empresa());	
				tipocuotaAux.setcodigo(this.tipocuota.getcodigo());	
				tipocuotaAux.setnombre(this.tipocuota.getnombre());	
				tipocuotaAux.setes_prove(this.tipocuota.getes_prove());	
				
				if(this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocuotaAux.getId()>=0) {	
						this.tipocuotasEliminados.add(tipocuotaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocuotaAux,tipocuotaLogic.getTipoCuotas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuotaAux,tipocuotas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuotaLogic.saveTipoCuotas();//WithConnection
						//tipocuotaLogic.getSetVersionRowTipoCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos().addAll(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamos.addAll(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuotaLogic.saveTipoCuotaRelaciones(tipocuotaAux,this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());//WithConnection
								//tipocuotaLogic.getSetVersionRowTipoCuotas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamos= new ArrayList<Prestamo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuotaAux.setPrestamos(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocuotaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocuotaAux,tipocuotaLogic.getTipoCuotas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocuotaAux,tipocuotas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.getTipoCuotas().addAll(this.tipocuotasEliminados);
					
					tipocuotaLogic.saveTipoCuotas();//WithConnection
					//tipocuotaLogic.getSetVersionRowTipoCuotas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCuota();
				
				this.tipocuotasEliminados= new ArrayList<TipoCuota>();		
			}
			
			if(this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Cuota GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocuota=tipocuotaAux;
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
      		//this.finishProcessTipoCuota();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCuota tipocuotaLocal) throws Exception {
		
		if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocuotaLocal.setPrestamos(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
			
			} else {
			
				tipocuotaLocal.setPrestamos(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCuota tipocuotaLocal) throws Exception {	
		if(this.tipocuotaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocuotaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCuotaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocuotaValidator.getInvalidValues(this.tipocuota);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCuota tipocuota,List<TipoCuota> tipocuotas) throws Exception {
		try	{		
			TipoCuotaConstantesFunciones.actualizarLista(tipocuota,tipocuotas,this.tipocuotaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCuota tipocuota,List<TipoCuota> tipocuotas) throws Exception {
		try	{			
			TipoCuotaConstantesFunciones.actualizarSelectedLista(tipocuota,tipocuotas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCuota> tipocuotasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocuotasLocal=this.tipocuotaLogic.getTipoCuotas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocuotasLocal=this.tipocuotas;
			}
			//ARCHITECTURE
		
			for(TipoCuota tipocuotaLocal:tipocuotasLocal) {
				if(this.permiteMantenimiento(tipocuotaLocal) && tipocuotaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCuotaConstantesFunciones.getTipoCuotaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCuotaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuota.jLabelid_empresaTipoCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuotaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuota.jLabelcodigoTipoCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuotaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuota.jLabelnombreTipoCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuotaConstantesFunciones.ESPROVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuota.jLabeles_proveTipoCuota,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuota.jLabelid_empresaTipoCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuota.jLabelcodigoTipoCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuota.jLabelnombreTipoCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuota.jLabeles_proveTipoCuota,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Prestamo")) {
			if(this.tipocuota==null) {
				this.tipocuota= new TipoCuota();
			}

			if(this.tipocuotaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuota
				this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);

				this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.getprestamo().setTipoCuota(this.tipocuota);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCuota--;	
		
		
		this.tipocuotaAux=new TipoCuota();
		
		this.tipocuotaAux.setId(this.iIdNuevoTipoCuota);
		this.tipocuotaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuotaLogic.getTipoCuotas().add(this.tipocuotaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocuotas.add(this.tipocuotaAux);
		}
		//ARCHITECTURE
		
		this.tipocuota=this.tipocuotaAux;
		
		if(TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCuota(this.tipocuota);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuota(this.tipocuota);
		}
				
		//this.setDefaultControlesTipoCuota();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCuota();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCuota();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuota();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuota(this.tipocuotaBean,this.tipocuota,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCuotaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
			classes=TipoCuotaConstantesFunciones.getClassesRelationshipsOfTipoCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocuotaReturnGeneral=tipocuotaLogic.procesarEventosTipoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuotaLogic.getTipoCuotas(),this.tipocuota,this.tipocuotaParameterGeneral,this.isEsNuevoTipoCuota,classes);//this.tipocuotaLogic.getTipoCuota()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCuota(this.tipocuotaReturnGeneral,this.tipocuotaBean,false);
		
		if(this.tipocuotaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuota(this.tipocuotaReturnGeneral.getTipoCuota());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCuota(this.tipocuotaReturnGeneral.getTipoCuota());
		}
		
		if(this.tipocuotaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCuota(this.tipocuotaReturnGeneral.getTipoCuota(),classes);//this.tipocuotaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCuota();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCuota();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuotaBeanSwingJInternalFrameAdditional.RecargarFormTipoCuota(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCuota(false);
						
			if(tipocuotaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoSessionBean.getEsGuardarRelacionado() && PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrestamoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuota();
			}
			
			this.actualizarVisualTableDatosTipoCuota();
			
			this.jTableDatosTipoCuota.setRowSelectionInterval(this.getIndiceNuevoTipoCuota(), this.getIndiceNuevoTipoCuota());
			
			this.seleccionarFilaTablaTipoCuotaActual();
						
			this.actualizarEstadoCeldasBotonesTipoCuota("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCuota(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuota.jTextFieldcodigoTipoCuota.setEnabled(isHabilitar && this.tipocuotaConstantesFunciones.activarcodigoTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jTextAreanombreTipoCuota.setEnabled(isHabilitar && this.tipocuotaConstantesFunciones.activarnombreTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.setEnabled(isHabilitar && this.tipocuotaConstantesFunciones.activares_proveTipoCuota);	
		//
		this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setEnabled(isHabilitar && this.tipocuotaConstantesFunciones.activarid_empresaTipoCuota);
	};
	
	public void setDefaultControlesTipoCuota() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCuota(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocuotaSessionBean.setConGuardarRelaciones(true);			
			this.tipocuotaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocuotaSessionBean.setConGuardarRelaciones(false);			
			this.tipocuotaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCuota() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
				if(tipocuotaAux.getId().equals(this.iIdNuevoTipoCuota)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuota tipocuotaAux:this.tipocuotas) {
				if(tipocuotaAux.getId().equals(this.iIdNuevoTipoCuota)) {
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
	
	public int getIndiceActualTipoCuota(TipoCuota tipocuota,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
				if(tipocuotaAux.getId().equals(tipocuota.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuota tipocuotaAux:this.tipocuotas) {
				if(tipocuotaAux.getId().equals(tipocuota.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCuota(TipoCuota tipocuotaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
				if(tipocuotaAux.getTipoCuotaOriginal().getId().equals(tipocuotaOriginal.getId())) {
					existe=true;
					tipocuotaOriginal.setId(tipocuotaAux.getId());
					tipocuotaOriginal.setVersionRow(tipocuotaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuota tipocuotaAux:this.tipocuotas) {
				if(tipocuotaAux.getTipoCuotaOriginal().getId().equals(tipocuotaOriginal.getId())) {
					existe=true;
					tipocuotaOriginal.setId(tipocuotaAux.getId());
					tipocuotaOriginal.setVersionRow(tipocuotaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCuota(Boolean esParaCancelar) throws Exception {
		tipocuotasAux=new ArrayList<TipoCuota>();
		tipocuotaAux=new TipoCuota();
		
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
					if(tipocuotaAux.getId()<0) {
						tipocuotasAux.add(tipocuotaAux);
					}		
				}
				this.iIdNuevoTipoCuota=0L;
				this.tipocuotaLogic.getTipoCuotas().removeAll(tipocuotasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuota tipocuotaAux:this.tipocuotas) {
					if(tipocuotaAux.getId()<0) {
						tipocuotasAux.add(tipocuotaAux);
					}		
				}
				this.iIdNuevoTipoCuota=0L;
				this.tipocuotas.removeAll(tipocuotasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCuota 
					&& this.tipocuotaLogic.getTipoCuotas().size()>0
					) {
					tipocuotaAux=this.tipocuotaLogic.getTipoCuotas().get(this.tipocuotaLogic.getTipoCuotas().size() - 1);
				
					if(tipocuotaAux.getId()<0) {
						this.tipocuotaLogic.getTipoCuotas().remove(tipocuotaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCuota && this.tipocuotas.size()>0) {
					tipocuotaAux=this.tipocuotas.get(this.tipocuotas.size() - 1);
				
					if(tipocuotaAux.getId()<0) {
						this.tipocuotas.remove(tipocuotaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCuota(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocuota.getId()<0) {
				this.tipocuotaLogic.getTipoCuotas().remove(this.tipocuota);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocuota.getId()<0) {
				this.tipocuotas.remove(this.tipocuota);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCuota(List<TipoCuota> tipocuotasAux) throws Exception {
		TipoCuotaConstantesFunciones.setEstadosInicialesTipoCuota(tipocuotasAux);
	}
	
	public void setEstadosInicialesTipoCuota(TipoCuota tipocuotaAux) throws Exception {
		TipoCuotaConstantesFunciones.setEstadosInicialesTipoCuota(tipocuotaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCuotaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCuotaActual()) {
				if(!this.isEsNuevoTipoCuota) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCuota=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCuotaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Cuota ?", "MANTENIMIENTO DE Tipo Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCuota tipocuota) throws Exception {
		TipoCuotaConstantesFunciones.seleccionarAsignar(this.tipocuota,tipocuota);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCuota=this.isPermisoActualizarOriginalTipoCuota;
			
			
			this.seleccionarAsignar(tipocuota);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuotaConstantesFunciones.quitarEspaciosTipoCuota(this.tipocuota,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocuotaSessionBean.setsFuncionBusquedaRapida(this.tipocuotaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCuota) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCuota(esParaCancelar);				
				this.cancelarNuevoTipoCuota(esParaCancelar);								
			}
			
			this.tipocuota=new TipoCuota();
			
			this.inicializarTipoCuota();
			
			this.actualizarEstadoCeldasBotonesTipoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCuota() throws Exception {
		try {
			TipoCuotaConstantesFunciones.inicializarTipoCuota(this.tipocuota);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocuotaLogic.getTipoCuotas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCuotas(String sAccionBusqueda,List<TipoCuota> tipocuotasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCuota"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCuotaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCuotaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCuota"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cuotas");		
		parameters.put("busquedapor", TipoCuotaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Prestamo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCuotaLogic tipocuotaLogicAuxiliar=new TipoCuotaLogic();
					tipocuotaLogicAuxiliar.setDatosCliente(tipocuotaLogic.getDatosCliente());				
					tipocuotaLogicAuxiliar.setTipoCuotas(tipocuotasParaReportes);
					
					tipocuotaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCuotaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocuotasParaReportes=tipocuotaLogicAuxiliar.getTipoCuotas();
					
					//tipocuotaLogic.getNewConnexionToDeep();
					
					//for (TipoCuota tipocuota:tipocuotasParaReportes) {
					//	tipocuotaLogic.deepLoad(tipocuota, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocuotaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocuotaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePrestamo = AuxiliarReportes.class.getResourceAsStream("PrestamoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_prestamo", reportFilePrestamo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCuota=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCuotaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCuotaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCuota=new JRBeanArrayDataSource(TipoCuotaJInternalFrame.TraerTipoCuotaBeans(tipocuotasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCuota);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCuotaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCuotaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCuotaBean.TraerTipoCuotaBeans(tipocuotasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCuotas(sAccionBusqueda,sTipoArchivoReporte,tipocuotasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCuotas(sAccionBusqueda,sTipoArchivoReporte,tipocuotasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCuotaActionPerformed(null);
					//this.generarExcelReporteTipoCuotas(sAccionBusqueda,sTipoArchivoReporte,tipocuotasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCuotas(sAccionBusqueda,sTipoArchivoReporte,tipocuotasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCuotas(sAccionBusqueda,sTipoArchivoReporte,tipocuotasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCuotas(sAccionBusqueda,sTipoArchivoReporte,tipocuotasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuota> tipocuotasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuota";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuotas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuota("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCuota tipocuota : tipocuotasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCuotaConstantesFunciones.generarExcelReporteDataTipoCuota("NORMAL",row,workbook,tipocuota,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCuota(String sTipo,Row row,Workbook workbook) {
		
		TipoCuotaConstantesFunciones.generarExcelReporteHeaderTipoCuota(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuota> tipocuotasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuota_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuotas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCuota tipocuota : tipocuotasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCuotaConstantesFunciones.getTipoCuotaDescripcion(tipocuota));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuotaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuota.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuotaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuota.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuotaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuota.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuotaConstantesFunciones.LABEL_ESPROVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_ESPROVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipocuota.getes_prove()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuota> tipocuotasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCuota> tipocuotasRespaldo=null;
		
		classes=TipoCuotaConstantesFunciones.getClassesRelationshipsOfTipoCuota(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocuotaLogic.setDatosCliente(this.datosCliente);
		this.tipocuotaLogic.setDatosDeep(this.datosDeep);
		this.tipocuotaLogic.setIsConDeep(true);
		
		tipocuotasRespaldo=this.tipocuotaLogic.getTipoCuotas();
		
		this.tipocuotaLogic.setTipoCuotas(tipocuotasParaReportes);	
		this.tipocuotaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocuotasParaReportes=this.tipocuotaLogic.getTipoCuotas();
		this.tipocuotaLogic.setTipoCuotas(tipocuotasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuota_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuotas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuota("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCuota tipocuota : tipocuotasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCuota("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCuotaConstantesFunciones.generarExcelReporteDataTipoCuota("NORMAL",row,workbook,tipocuota,cellStyleDataAux);
		
			
			


				//Prestamo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PrestamoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuota.getPrestamos()!=null && tipocuota.getPrestamos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PrestamoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PrestamoConstantesFunciones.generarExcelReporteHeaderPrestamo("RELACIONADO",row,workbook);
				}

				if(tipocuota.getPrestamos()!=null) {
					i2=0;
					for(Prestamo prestamo : tipocuota.getPrestamos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PrestamoConstantesFunciones.generarExcelReporteDataPrestamo("RELACIONADO",row,workbook,prestamo,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoCuotaConstantesFunciones.getTipoCuotaDescripcion(tipocuota));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuota.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCuota() throws Exception {		
		this.startProcessTipoCuota(true);
	}
	
	public void startProcessTipoCuota(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCuota ,this.jPanelParametrosReportesTipoCuota, this.jScrollPanelDatosTipoCuota,this.jPanelPaginacionTipoCuota, this.jScrollPanelDatosEdicionTipoCuota, this.jPanelAccionesTipoCuota,this.jPanelAccionesFormularioTipoCuota,this.jmenuBarTipoCuota,this.jmenuBarDetalleTipoCuota,this.jTtoolBarTipoCuota,this.jTtoolBarDetalleTipoCuota);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuota=this.jTabbedPaneBusquedasTipoCuota; 
		
		final JPanel jPanelParametrosReportesTipoCuota=this.jPanelParametrosReportesTipoCuota;
		//final JScrollPane jScrollPanelDatosTipoCuota=this.jScrollPanelDatosTipoCuota;
		final JTable jTableDatosTipoCuota=this.jTableDatosTipoCuota;		
		final JPanel jPanelPaginacionTipoCuota=this.jPanelPaginacionTipoCuota;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuota=this.jScrollPanelDatosEdicionTipoCuota;
		final JPanel jPanelAccionesTipoCuota=this.jPanelAccionesTipoCuota;
		
		JPanel jPanelCamposAuxiliarTipoCuota=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuota=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			jPanelCamposAuxiliarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jPanelCamposTipoCuota;
			jPanelAccionesFormularioAuxiliarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jPanelAccionesFormularioTipoCuota;
		}
		
		final JPanel jPanelCamposTipoCuota=jPanelCamposAuxiliarTipoCuota;
		final JPanel jPanelAccionesFormularioTipoCuota=jPanelAccionesFormularioAuxiliarTipoCuota;
		
		
		final JMenuBar jmenuBarTipoCuota=this.jmenuBarTipoCuota;
		final JToolBar jTtoolBarTipoCuota=this.jTtoolBarTipoCuota;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCuota=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuota=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			jmenuBarDetalleAuxiliarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jmenuBarDetalleTipoCuota;
			jTtoolBarDetalleAuxiliarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jTtoolBarDetalleTipoCuota;
		}
		
		final JMenuBar jmenuBarDetalleTipoCuota=jmenuBarDetalleAuxiliarTipoCuota;
		final JToolBar jTtoolBarDetalleTipoCuota=jTtoolBarDetalleAuxiliarTipoCuota;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuota;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuota;
			processRunnable.jTableDatos=jTableDatosTipoCuota;
			processRunnable.jPanelCampos=jPanelCamposTipoCuota;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuota;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuota;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuota;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuota;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuota;
			processRunnable.jTtoolBar=jTtoolBarTipoCuota;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuota;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuota ,jPanelParametrosReportesTipoCuota,jTableDatosTipoCuota, /*jScrollPanelDatosTipoCuota,*/jPanelCamposTipoCuota,jPanelPaginacionTipoCuota, /*jScrollPanelDatosEdicionTipoCuota,*/ jPanelAccionesTipoCuota,jPanelAccionesFormularioTipoCuota,jmenuBarTipoCuota,jmenuBarDetalleTipoCuota,jTtoolBarTipoCuota,jTtoolBarDetalleTipoCuota);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuota ,jPanelParametrosReportesTipoCuota, jScrollPanelDatosTipoCuota,jPanelPaginacionTipoCuota, jScrollPanelDatosEdicionTipoCuota, jPanelAccionesTipoCuota,jPanelAccionesFormularioTipoCuota,jmenuBarTipoCuota,jmenuBarDetalleTipoCuota,jTtoolBarTipoCuota,jTtoolBarDetalleTipoCuota);
						
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
	
	public void finishProcessTipoCuota() {// throws Exception 
		this.finishProcessTipoCuota(true);
	}
	
	public void finishProcessTipoCuota(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCuota ,this.jPanelParametrosReportesTipoCuota, this.jScrollPanelDatosTipoCuota,this.jPanelPaginacionTipoCuota, this.jScrollPanelDatosEdicionTipoCuota, this.jPanelAccionesTipoCuota,this.jPanelAccionesFormularioTipoCuota,this.jmenuBarTipoCuota,this.jmenuBarDetalleTipoCuota,this.jTtoolBarTipoCuota,this.jTtoolBarDetalleTipoCuota);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuota=this.jTabbedPaneBusquedasTipoCuota; 
		
		final JPanel jPanelParametrosReportesTipoCuota=this.jPanelParametrosReportesTipoCuota;
		//final JScrollPane jScrollPanelDatosTipoCuota=this.jScrollPanelDatosTipoCuota;
		final JTable jTableDatosTipoCuota=this.jTableDatosTipoCuota;		
		final JPanel jPanelPaginacionTipoCuota=this.jPanelPaginacionTipoCuota;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuota=this.jScrollPanelDatosEdicionTipoCuota;
		final JPanel jPanelAccionesTipoCuota=this.jPanelAccionesTipoCuota;
		
		JPanel jPanelCamposAuxiliarTipoCuota=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuota=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			jPanelCamposAuxiliarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jPanelCamposTipoCuota;
			jPanelAccionesFormularioAuxiliarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jPanelAccionesFormularioTipoCuota;
		}
		
		final JPanel jPanelCamposTipoCuota=jPanelCamposAuxiliarTipoCuota;
		final JPanel jPanelAccionesFormularioTipoCuota=jPanelAccionesFormularioAuxiliarTipoCuota;
		
		
		final JMenuBar jmenuBarTipoCuota=this.jmenuBarTipoCuota;		
		final JToolBar jTtoolBarTipoCuota=this.jTtoolBarTipoCuota;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCuota=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuota=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			jmenuBarDetalleAuxiliarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jmenuBarDetalleTipoCuota;
			jTtoolBarDetalleAuxiliarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jTtoolBarDetalleTipoCuota;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCuota=jmenuBarDetalleAuxiliarTipoCuota;
		final JToolBar jTtoolBarDetalleTipoCuota=jTtoolBarDetalleAuxiliarTipoCuota;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuota;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuota;
			processRunnable.jTableDatos=jTableDatosTipoCuota;
			processRunnable.jPanelCampos=jPanelCamposTipoCuota;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuota;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuota;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuota;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuota;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuota;
			processRunnable.jTtoolBar=jTtoolBarTipoCuota;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuota;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCuota ,jPanelParametrosReportesTipoCuota, jTableDatosTipoCuota,/*jScrollPanelDatosTipoCuota,*/jPanelCamposTipoCuota,jPanelPaginacionTipoCuota, /*jScrollPanelDatosEdicionTipoCuota,*/ jPanelAccionesTipoCuota,jPanelAccionesFormularioTipoCuota,jmenuBarTipoCuota,jmenuBarDetalleTipoCuota,jTtoolBarTipoCuota,jTtoolBarDetalleTipoCuota));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCuota(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCuota(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCuota(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCuota(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCuota,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCuota,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCuota(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCuota,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCuota,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocuotaConstantesFunciones.getsFinalQueryTipoCuota();
		String  finalQueryPaginacionTodos=this.tipocuotaConstantesFunciones.getsFinalQueryTipoCuota();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCuotaConstantesFunciones.getArrayColumnasGlobalesNoTipoCuota(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCuotaConstantesFunciones.getArrayColumnasGlobalesTipoCuota(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCuotaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocuotasEliminados= new ArrayList<TipoCuota>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCuota();
		
				///*TipoCuotaSessionBean*/this.tipocuotaSessionBean=new TipoCuotaSessionBean();
			
			if(this.tipocuotaSessionBean==null) {
				this.tipocuotaSessionBean=new TipoCuotaSessionBean();
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
					this.iNumeroPaginacion=TipoCuotaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCuotaConstantesFunciones.getClassesForeignKeysOfTipoCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocuota."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocuotasAux= new ArrayList<TipoCuota>();
			
				
			tipocuotaLogic.setDatosCliente(this.datosCliente);
			tipocuotaLogic.setDatosDeep(this.datosDeep);
			tipocuotaLogic.setIsConDeep(true);
			
			
			tipocuotaLogic.getTipoCuotaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocuotaLogic.getTodosTipoCuotas(finalQueryGlobal,pagination);
					
					//tipocuotaLogic.getTodosTipoCuotasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocuotaLogic.getTipoCuotas()==null|| tipocuotaLogic.getTipoCuotas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuotasAux= new ArrayList<TipoCuota>();
							tipocuotasAux.addAll(tipocuotaLogic.getTipoCuotas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuotasAux= new ArrayList<TipoCuota>();
							tipocuotasAux.addAll(tipocuotas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuotaLogic.getTodosTipoCuotas(finalQueryGlobal+"",this.pagination);												
							
							//tipocuotaLogic.getTodosTipoCuotasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCuotas("Todos",tipocuotaLogic.getTipoCuotas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuotaLogic.setTipoCuotas(new ArrayList<TipoCuota>());					
							tipocuotaLogic.getTipoCuotas().addAll(tipocuotasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuotas=new ArrayList<TipoCuota>();
							tipocuotas.addAll(tipocuotasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCuota=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCuota=this.idActual;
				
				} else if(this.idTipoCuotaActual!=null && this.idTipoCuotaActual!=0L) {
					idTipoCuota=idTipoCuotaActual;
				}
				
					
				this.sDetalleReporte=TipoCuotaConstantesFunciones.getDetalleIndicePorId(idTipoCuota);
				
				this.tipocuotas=new ArrayList<TipoCuota>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocuotaLogic.getEntity(idTipoCuota);
					
					//tipocuotaLogic.getEntityWithConnection(idTipoCuota);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuotaLogic.setTipoCuotas(new ArrayList<TipoCuota>());
					tipocuotaLogic.getTipoCuotas().add(tipocuotaLogic.getTipoCuota());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuotas=new ArrayList<TipoCuota>();
					this.tipocuotas.add(tipocuota);
				}
				
				if(tipocuotaLogic.getTipoCuota()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoCuotaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocuotaLogic.getTipoCuotasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuotaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuotaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocuotaLogic.getTipoCuotas()==null||tipocuotaLogic.getTipoCuotas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocuotas==null|| tipocuotas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuotasAux=new ArrayList<TipoCuota>();
						tipocuotasAux.addAll(tipocuotaLogic.getTipoCuotas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuotasAux=new ArrayList<TipoCuota>();
							tipocuotasAux.addAll(tipocuotas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocuotaLogic.getTipoCuotasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuotaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuotaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCuotas("FK_IdEmpresa",tipocuotaLogic.getTipoCuotas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCuotas("FK_IdEmpresa",tipocuotas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuotaLogic.setTipoCuotas(new ArrayList<TipoCuota>());
						tipocuotaLogic.getTipoCuotas().addAll(tipocuotasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuotas=new ArrayList<TipoCuota>();
							tipocuotas.addAll(tipocuotasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCuota();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCuota();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuotaLogic.getTipoCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuotas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuotaLogic.getTipoCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuotas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCuota tipocuota) {
		Boolean permite=true;
		
		if(this.tipocuota.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCuotaConstantesFunciones.getOrderByListaTipoCuota();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCuotaConstantesFunciones.getOrderByListaTipoCuota();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuota tipocuota:tipocuotaLogic.getTipoCuotas()) {
				if(tipocuota.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuotaTotales=tipocuota;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuota tipocuota:this.tipocuotas) {
				if(tipocuota.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuotaTotales=tipocuota;
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
			this.tipocuotaAux=new TipoCuota();
			this.tipocuotaAux.setsType(Constantes2.S_TOTALES);
			this.tipocuotaAux.setIsNew(false);
			this.tipocuotaAux.setIsChanged(false);
			this.tipocuotaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCuotaConstantesFunciones.TotalizarValoresFilaTipoCuota(this.tipocuotaLogic.getTipoCuotas(),this.tipocuotaAux);
				
				this.tipocuotaLogic.getTipoCuotas().add(this.tipocuotaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCuotaConstantesFunciones.TotalizarValoresFilaTipoCuota(this.tipocuotas,this.tipocuotaAux);
				
				this.tipocuotas.add(this.tipocuotaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocuotaTotales=new TipoCuota();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuotaLogic.getTipoCuotas().remove(tipocuotaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuotas.remove(tipocuotaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocuotaTotales=new TipoCuota();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuota tipocuota:tipocuotaLogic.getTipoCuotas()) {
				if(tipocuota.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuotaTotales=tipocuota;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuotaConstantesFunciones.TotalizarValoresFilaTipoCuota(this.tipocuotaLogic.getTipoCuotas(),tipocuotaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuota tipocuota:this.tipocuotas) {
				if(tipocuota.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuotaTotales=tipocuota;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuotaConstantesFunciones.TotalizarValoresFilaTipoCuota(this.tipocuotas,tipocuotaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCuotasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCuotasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuotaLogic.getTipoCuotasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoCuota() {
		this.isPermisoTodoTipoCuota=false;
		this.isPermisoNuevoTipoCuota=false;
		this.isPermisoActualizarTipoCuota=false;
		this.isPermisoActualizarOriginalTipoCuota=false;
		this.isPermisoEliminarTipoCuota=false;
		this.isPermisoGuardarCambiosTipoCuota=false;
		this.isPermisoConsultaTipoCuota=false;
		this.isPermisoBusquedaTipoCuota=false;
		this.isPermisoReporteTipoCuota=false;		
		this.isPermisoOrdenTipoCuota=false;		
		this.isPermisoPaginacionMedioTipoCuota=false;		
		this.isPermisoPaginacionAltoTipoCuota=false;
		this.isPermisoPaginacionTodoTipoCuota=false;
		this.isPermisoCopiarTipoCuota=false;		
		this.isPermisoVerFormTipoCuota=false;		
		this.isPermisoDuplicarTipoCuota=false;		
		this.isPermisoOrdenTipoCuota=false;		
	}
	
	public void setPermisosUsuarioTipoCuota(Boolean isPermiso) {
		this.isPermisoTodoTipoCuota=isPermiso;
		this.isPermisoNuevoTipoCuota=isPermiso;
		this.isPermisoActualizarTipoCuota=isPermiso;
		this.isPermisoActualizarOriginalTipoCuota=isPermiso;
		this.isPermisoEliminarTipoCuota=isPermiso;
		this.isPermisoGuardarCambiosTipoCuota=isPermiso;
		this.isPermisoConsultaTipoCuota=isPermiso;
		this.isPermisoBusquedaTipoCuota=isPermiso;
		this.isPermisoReporteTipoCuota=isPermiso;
		this.isPermisoOrdenTipoCuota=isPermiso;		
		this.isPermisoPaginacionMedioTipoCuota=isPermiso;		
		this.isPermisoPaginacionAltoTipoCuota=isPermiso;		
		this.isPermisoPaginacionTodoTipoCuota=isPermiso;		
		this.isPermisoCopiarTipoCuota=isPermiso;		
		this.isPermisoVerFormTipoCuota=isPermiso;		
		this.isPermisoDuplicarTipoCuota=isPermiso;
		this.isPermisoOrdenTipoCuota=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCuota(Boolean isPermiso) {
		//this.isPermisoTodoTipoCuota=isPermiso;
		this.isPermisoNuevoTipoCuota=isPermiso;
		this.isPermisoActualizarTipoCuota=isPermiso;
		this.isPermisoActualizarOriginalTipoCuota=isPermiso;
		this.isPermisoEliminarTipoCuota=isPermiso;
		this.isPermisoGuardarCambiosTipoCuota=isPermiso;
		//this.isPermisoConsultaTipoCuota=isPermiso;
		//this.isPermisoBusquedaTipoCuota=isPermiso;
		//this.isPermisoReporteTipoCuota=isPermiso;
		//this.isPermisoOrdenTipoCuota=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCuota=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCuota=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCuota=isPermiso;		
		//this.isPermisoCopiarTipoCuota=isPermiso;		
		//this.isPermisoDuplicarTipoCuota=isPermiso;
		//this.isPermisoOrdenTipoCuota=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuotaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PrestamoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPrestamo=false;
		this.isTienePermisosPrestamo=this.verificarGetPermisosUsuarioOpcionTipoCuotaClaseRelacionada(this.opcionsRelacionadas,PrestamoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCuota(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuotaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPrestamo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCuotaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCuotaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCuotaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPrestamo && this.jInternalFrameDetalleFormTipoCuota!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.remove(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCuota() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCuotaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCuota=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCuota=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCuota=this.isPermisoActualizarTipoCuota;
			this.isPermisoEliminarTipoCuota=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCuota=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCuota=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCuota=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCuota=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCuota=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuota=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCuota=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCuota=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCuota=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCuota=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCuota=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCuota=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuota=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCuota.setToolTipText(this.jTableDatosTipoCuota.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCuota(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCuota(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCuota() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPrestamo && this.tipocuotaConstantesFunciones.mostrarPrestamoTipoCuota && !TipoCuotaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Prestamo");
			reporte.setsDescripcion("Prestamo");
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
	public void inicializarCombosForeignKeyTipoCuotaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCuotaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCuotaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCuotaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoCuotaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCuotaParameterReturnGeneral tipocuotaReturnGeneral=new TipoCuotaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocuotaConstantesFunciones.cargarid_empresaTipoCuota)
					 || (this.esRecargarFks && this.tipocuotaConstantesFunciones.cargarid_empresaTipoCuota)) {

					if(!this.tipocuotaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocuotaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocuotaReturnGeneral=tipocuotaLogic.cargarCombosLoteForeignKeyTipoCuota(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocuotaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCuota()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocuotaSessionBean==null) {
				this.tipocuotaSessionBean=new TipoCuotaSessionBean();
			}

			if(!this.tipocuotaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoCuota()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCuota(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCuota()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuota();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCuota(TipoCuota tipocuota)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCuota(TipoCuota tipocuota,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCuota()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuota()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCuota()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCuota()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCuota()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCuota()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCuota(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCuota()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota!=null && this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoCuotaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCuotaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCuotaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocuotaSessionBean=new TipoCuotaSessionBean(); 
		this.tipocuotaConstantesFunciones=new TipoCuotaConstantesFunciones(); 
		this.tipocuotaBean=new TipoCuota();//(this.tipocuotaConstantesFunciones); 		
		this.tipocuotaReturnGeneral=new TipoCuotaParameterReturnGeneral(); 
		
		this.tipocuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCuota(true);
			
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
			
			this.tipocuotaConstantesFunciones=new TipoCuotaConstantesFunciones(); 
			this.tipocuotaBean=new TipoCuota();//this.tipocuotaConstantesFunciones); 			
			this.tipocuotaReturnGeneral=new TipoCuotaParameterReturnGeneral(); 
		
			TipoCuotaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuota Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocuota=new TipoCuota();
			this.tipocuotas = new ArrayList<TipoCuota>();
			this.tipocuotasAux = new ArrayList<TipoCuota>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic=new TipoCuotaLogic();
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCuota);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuota);	
					}
					
					if(this.jInternalFrameImportacionTipoCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuota);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCuota);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCuota!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuota);
				this.jInternalFrameDetalleFormTipoCuota.setVisible(false);
				this.jInternalFrameDetalleFormTipoCuota.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuota);
					this.jInternalFrameReporteDinamicoTipoCuota.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCuota.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuota);
					this.jInternalFrameImportacionTipoCuota.setVisible(false);
					this.jInternalFrameImportacionTipoCuota.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuota);
					this.jInternalFrameOrderByTipoCuota.setVisible(false);
					this.jInternalFrameOrderByTipoCuota.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCuotaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCuotaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocuotaReturnGeneral=new TipoCuotaParameterReturnGeneral();
			
			this.tipocuotaParameterGeneral=new TipoCuotaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocuotaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PrestamoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuotaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuotaSessionBean.getEsGuardarRelacionado(),this.tipocuotaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuotaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuotaSessionBean.getEsGuardarRelacionado(),this.tipocuotaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCuota=false;
			this.isVisibilidadCeldaDuplicarTipoCuota=true;
			this.isVisibilidadCeldaCopiarTipoCuota=true;
			this.isVisibilidadCeldaVerFormTipoCuota=true;
			this.isVisibilidadCeldaOrdenTipoCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
			this.isVisibilidadCeldaModificarTipoCuota=false;
			this.isVisibilidadCeldaActualizarTipoCuota=false;
			this.isVisibilidadCeldaEliminarTipoCuota=false;
			this.isVisibilidadCeldaCancelarTipoCuota=false;
			this.isVisibilidadCeldaGuardarTipoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCuota();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCuota(false);
			
			this.setPermisosUsuarioTipoCuota();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuotaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocuotaSessionBean.getEsGuardarRelacionado() && this.tipocuotaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCuotaClasesRelacionadas();
			}
			
			if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCuotaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCuota();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCuota();
			}
			
			if(!this.isPermisoBusquedaTipoCuota) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCuota.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCuota,this.isPermisoPaginacionMedioTipoCuota,this.isPermisoPaginacionTodoTipoCuota);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCuotaConstantesFunciones.getTiposSeleccionarTipoCuota());
				
				this.tiposColumnasSelect=TipoCuotaConstantesFunciones.getTiposSeleccionarTipoCuota(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCuota();				
				//this.tiposRelacionesSelect=TipoCuotaConstantesFunciones.getTiposRelacionesTipoCuota(true);
				
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
			//if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCuota();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCuota(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCuota(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuota() ;
			
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
			
			
			this.prestamoLogic=new PrestamoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipocuotaImplementable= (TipoCuotaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuotaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocuotaImplementableHome= (TipoCuotaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuotaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocuotas= new ArrayList<TipoCuota>();
			this.tipocuotasEliminados= new ArrayList<TipoCuota>();
						
			this.isEsNuevoTipoCuota=false;
			this.esParaAccionDesdeFormularioTipoCuota=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCuota(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCuota();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCuotaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCuotaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCuota(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			
		this.jButtonRelacionesFinNormalTipoCuotaActionPerformed(null);;
						
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCuota();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCuota();
			}
			
			TipoCuotaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCuota.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCuota.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCuota.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCuota(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCuota: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCuota() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PrestamoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PrestamoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCuota")) {
				iIndex=this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();	
				
				

				if(sTitle.equals("Prestamos")) {
					if(!PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuota();

						this.cargarParteTabPanelRelacionadaPrestamo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			
			if(sTipo.equals("RelacionesFinformas_de_pagoTipoCuota")) {
				iIndex=this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.getSelectedIndex();
				sTitle= this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.getTitleAt(iIndex);
				Integer intSelectedRow = 0;
				intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();

				if(sTitle.equals("Prestamos")) {
					if(!PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuota();

						this.cargarParteTabPanelRelacionadaPrestamo(iIndex,intSelectedRow);
					}
					
				}
			};
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCuota();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPrestamo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuota.cargarSessionConBeanSwingJInternalFramePrestamo(false,true,iIndex);
		this.jButtonPrestamoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPrestamo();

		//this.jTabbedPaneRelacionesTipoCuota.updateUI();
		//this.jTabbedPaneRelacionesTipoCuota.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuota.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Prestamo")) {
				int row=this.jTableDatosTipoCuota.getSelectedRow();
				jButtonPrestamoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Prestamo")) {

					if(this.isTienePermisosPrestamo && this.tipocuotaConstantesFunciones.mostrarPrestamoTipoCuota && !TipoCuotaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Prestamos"+"("+PrestamoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Prestamos");

						if(tipocuotaConstantesFunciones.resaltarPrestamoTipoCuota!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuotaConstantesFunciones.resaltarPrestamoTipoCuota);
						}

						jmenuItem.setEnabled(this.tipocuotaConstantesFunciones.activarPrestamoTipoCuota);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Prestamo"));

						

						this.jInternalFrameDetalleFormTipoCuota.jmenuDetalleTipoCuota.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCuota(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCuota(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCuota(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCuotaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCuota();
		
		this.cargarCombosFrameForeignKeyTipoCuota();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCuota();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCuota();
		}
	}
	
	
	
	public void jButtonNuevoTipoCuotaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
			
			if(jTableDatosTipoCuota.getRowCount()>=1) {
				jTableDatosTipoCuota.removeRowSelectionInterval(0, jTableDatosTipoCuota.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCuota=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCuota(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCuota(true);			
			//this.tipocuota=new TipoCuota();
			//this.tipocuota.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuota(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuota() ;
			
			if(TipoCuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuota(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocuota);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);				
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
			if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCuota: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCuotaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCuota.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCuota.getSelectedRows().length;			
			}
			
			tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCuota--;			
				//TipoCuota tipocuotaAux= new TipoCuota();			
				//tipocuotaAux.setId(this.iIdNuevoTipoCuota);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCuota tipocuotaOrigen=new TipoCuota();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCuota tipocuotaOrigen : tipocuotasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocuotaOrigen =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuotaOrigen =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCuota();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocuota.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCuota(tipocuotaOrigen,this.tipocuota,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuotaLogic.getTipoCuotas().add(this.tipocuotaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuotas.add(this.tipocuotaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCuota(false);
				
				this.jTableDatosTipoCuota.setRowSelectionInterval(this.getIndiceNuevoTipoCuota(), this.getIndiceNuevoTipoCuota());
				
				int iLastRow =  this.jTableDatosTipoCuota.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuota.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuota.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuota(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();									
		
			TipoCuota tipocuotaOrigen=new TipoCuota();
			TipoCuota tipocuotaDestino=new TipoCuota();
				
			tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCuota.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocuotasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCuota.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuotaOrigen =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuotaOrigen =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuotaDestino =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuotaDestino =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocuotaOrigen =tipocuotasSeleccionados.get(0);
				tipocuotaDestino =tipocuotasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCuota(tipocuotaOrigen,tipocuotaDestino,true,false);
				
				tipocuotaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuotaDestino,tipocuotaLogic.getTipoCuotas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuotaDestino,tipocuotas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCuota(false);
				
				//this.jTableDatosTipoCuota.setRowSelectionInterval(this.getIndiceNuevoTipoCuota(), this.getIndiceNuevoTipoCuota());
				
				int iLastRow =  this.jTableDatosTipoCuota.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuota.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuota.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuota(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCuota.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCuota.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCuota.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCuota.setVisible(!isVisible);
			this.jPanelPaginacionTipoCuota.setVisible(!isVisible);
			this.jPanelAccionesTipoCuota.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCuota();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCuota();
			
			this.abrirFrameOrderByTipoCuota();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCuota(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuota);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCuota.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCuota.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCuota.setSize(this.jInternalFrameDetalleFormTipoCuota.iWidthFormulario,this.jInternalFrameDetalleFormTipoCuota.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCuota.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCuota.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCuota.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCuota.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCuota.jContentPaneDetalleTipoCuota.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuota.jContentPaneDetalleTipoCuota.getWidth(),TipoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuota.jContentPaneDetalleTipoCuota.getWidth(),TipoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCuota.jContentPaneDetalleTipoCuota.getWidth(),TipoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPrestamo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCuota.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCuota.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCuota() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCuota==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuota,false,this);
				} else {
					this.jInternalFrameOrderByTipoCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuota,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuota);
				this.jInternalFrameOrderByTipoCuota.setVisible(false);
				this.jInternalFrameOrderByTipoCuota.setSelected(false);
				
				this.jInternalFrameOrderByTipoCuota.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuota"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCuota();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCuota() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCuota==null) {
				
				this.jInternalFrameImportacionTipoCuota=new ImportacionJInternalFrame(TipoCuotaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuota);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuota);
				this.jInternalFrameImportacionTipoCuota.setVisible(false);
				this.jInternalFrameImportacionTipoCuota.setSelected(false);


				this.jInternalFrameImportacionTipoCuota.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuota"));
				this.jInternalFrameImportacionTipoCuota.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuota"));
				this.jInternalFrameImportacionTipoCuota.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuota"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCuota() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCuota==null) {
				this.jInternalFrameReporteDinamicoTipoCuota=new ReporteDinamicoJInternalFrame(TipoCuotaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuota);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuota);
				this.jInternalFrameReporteDinamicoTipoCuota.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCuota.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCuota.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuota"));
				this.jInternalFrameReporteDinamicoTipoCuota.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuota"));
				this.jInternalFrameReporteDinamicoTipoCuota.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuota"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuota();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPrestamo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuota.jContentPaneDetalleTipoCuota.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCuota() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuota);
			
	       	this.jInternalFrameDetalleFormTipoCuota.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCuota.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCuota.dispose();
			//this.jInternalFrameDetalleFormTipoCuota=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCuota() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCuota.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCuota() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCuota.setVisible(true);
	        this.jInternalFrameImportacionTipoCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCuota() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCuota.setVisible(true);
	        this.jInternalFrameOrderByTipoCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCuota() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCuota.setVisible(false);
	        this.jInternalFrameOrderByTipoCuota.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCuota() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCuota.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCuota.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCuota() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCuota.setVisible(false);
	        this.jInternalFrameImportacionTipoCuota.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCuota(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCuota(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCuota(true);
			//this.isEsNuevoTipoCuota=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuota(false) ;
			
			if(tipocuotaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoSessionBean.getEsGuardarRelacionado() && PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrestamoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuota(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuota(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCuotaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCuota(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCuota(true);
			//this.isEsNuevoTipoCuota=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocuota.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCuota(false) ;
			
			if(TipoCuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuota(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuota(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCuota(false);
			
			//if(!this.isEsNuevoTipoCuota) {								
				int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
				
			}
			
			if(this.permiteMantenimiento(this.tipocuota)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCuota=true;
					this.inicializarActualizarBindingTablaTipoCuota(false);
					this.isEsNuevoTipoCuota=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCuota=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCuota=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuota(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuota(false);
				
				this.habilitarDeshabilitarControlesTipoCuota(false);
			
												
				
				if(TipoCuotaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCuota();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCuotaActionPerformed(evt,tipocuotaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCuota(this.tipocuota,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCuota.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocuotaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocuota.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				this.tipocuota.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				this.tipocuota.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocuota)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCuotaModel) this.jTableDatosTipoCuota.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCuota=true;
				this.inicializarActualizarBindingTablaTipoCuota(false);
				this.isEsNuevoTipoCuota=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuota(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuota(false);
				
				this.habilitarDeshabilitarControlesTipoCuota(false);
				
				
				
				if(TipoCuotaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCuota();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCuotaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCuota.getRowCount()>=1) {
				jTableDatosTipoCuota.removeRowSelectionInterval(0, jTableDatosTipoCuota.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCuota(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCuota(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuota(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuota(false) ;
			
			this.isEsNuevoTipoCuota=false;
			
			if(TipoCuotaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCuota();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCuota(false);
				
				//SI ES MANUAL
				if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCuota();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCuota--;			
			//TipoCuota tipocuotaAux= new TipoCuota();			
			//tipocuotaAux.setId(this.iIdNuevoTipoCuota);
			
			if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCuota();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
			
			this.tipocuota.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocuotaLogic.getTipoCuotas().add(this.tipocuotaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocuotas.add(this.tipocuotaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCuota(false);
			
			this.jTableDatosTipoCuota.setRowSelectionInterval(this.getIndiceNuevoTipoCuota(), this.getIndiceNuevoTipoCuota());
			
			int iLastRow =  this.jTableDatosTipoCuota.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCuota.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCuota.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCuota(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCuota(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuota(false);
			
			//SI ES MANUAL
			if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuota();
			}
			
			//this.abrirFrameTreeTipoCuota();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCuotaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo CuotaS ?", "MANTENIMIENTO DE Tipo Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCuota.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCuota();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocuotaReturnGeneral=tipocuotaLogic.procesarImportacionTipoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocuotaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCuotaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCuotaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCuota.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCuota.setFileImportacion(this.jInternalFrameImportacionTipoCuota.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCuota.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCuota.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCuota.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCuota.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		

		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCuotaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCuotaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCuotas("Todos",tipocuotasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuotaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuotaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuotaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuotaConstantesFunciones.LABEL_ESPROVE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Prove_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Prove_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Prove_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Prove_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoCuota.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCuotaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoCuotaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCuotaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoCuotaConstantesFunciones.LABEL_ESPROVE:
					sNombreCampoCategoria="es_prove";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCuotaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoCuotaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCuotaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoCuotaConstantesFunciones.LABEL_ESPROVE:
					sNombreCampoCategoriaValor="es_prove";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuotaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoCuotaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCuotaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoCuotaConstantesFunciones.LABEL_ESPROVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Prove",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_prove");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCuotaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuota";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCuotas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCuotaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCuota tipocuota:tipocuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuota.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuotaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCuota tipocuota:tipocuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuota.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuotaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCuota tipocuota:tipocuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuota.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuotaConstantesFunciones.LABEL_ESPROVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_ESPROVE);
					iRow++;

					for(TipoCuota tipocuota:tipocuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuota.getes_prove());
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
			//	this.getFilaCabeceraExportarExcelTipoCuota(row);				
			//	iRow++;
			//}				
			
			//for(TipoCuota tipocuotaAux:tipocuotasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCuota(tipocuotaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuota(false);
			
			//SI ES MANUAL
			if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuota();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuota(false);
			
			//SI ES MANUAL
			if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuota();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuota(false);
			
			//SI ES MANUAL
			if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuota();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCuota() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCuota.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCuota.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCuota.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCuota.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCuota.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCuota.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCuota.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCuota(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCuota(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCuota(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCuota(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCuota(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCuota(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuota(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCuota(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCuota() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCuota();
		
		this.inicializarActualizarBindingBotonesManualTipoCuota(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuota();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuota() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuota(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuota(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCuota.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCuota.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCuota.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCuota!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCuota.jCheckBoxPostAccionNuevoTipoCuota.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCuota.jCheckBoxPostAccionSinCerrarTipoCuota.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCuota.jCheckBoxPostAccionSinMensajeTipoCuota.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCuota.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCuota.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCuota.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCuota!=null) {
				this.jInternalFrameDetalleFormTipoCuota.jCheckBoxPostAccionNuevoTipoCuota.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCuota.jCheckBoxPostAccionSinCerrarTipoCuota.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCuota.jCheckBoxPostAccionSinMensajeTipoCuota.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCuota.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCuota.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCuota.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCuota.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCuota.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCuota.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCuota.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCuota.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCuota.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCuota(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuota(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuota() throws Exception {
		try	{
			if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuota();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuota() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuota() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCuota.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCuota.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCuota.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCuota.addItem(reporte);
			}
			
			
			if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCuota.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCuota.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCuota.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCuota.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCuota.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCuota.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuota();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuota() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
				this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
				this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuota.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuota.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCuota.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuota.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuota.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCuota()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCuota(Boolean esInicializar) throws Exception {				
		if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuota();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCuota() throws Exception {
		this.inicializarActualizarBindingTablaTipoCuota(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCuota() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCuotaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuotaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCuota(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocuotaLogic.getTipoCuotas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocuotas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCuota.setModel(new TipoCuotaModel(this.tipocuotaLogic.getTipoCuotas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCuota.setModel(new TipoCuotaModel(this.tipocuotas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCuota!=null && this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCuota();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuota,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO,tipocuotaConstantesFunciones.resaltarSeleccionarTipoCuota,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO,tipocuotaConstantesFunciones.resaltarSeleccionarTipoCuota,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuota,TipoCuotaConstantesFunciones.LABEL_ID));

		if(this.tipocuotaConstantesFunciones.mostraridTipoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuotaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocuotaConstantesFunciones.resaltaridTipoCuota,this.tipocuotaConstantesFunciones.activaridTipoCuota,this,true,"idTipoCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuotaConstantesFunciones.resaltaridTipoCuota,this.tipocuotaConstantesFunciones.activaridTipoCuota,this,true,"idTipoCuota","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuota,TipoCuotaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocuotaConstantesFunciones.mostrarid_empresaTipoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuotaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocuotaConstantesFunciones.resaltarid_empresaTipoCuota,this,this.tipocuotaConstantesFunciones.activarid_empresaTipoCuota));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocuotaConstantesFunciones.resaltarid_empresaTipoCuota,this,this.tipocuotaConstantesFunciones.activarid_empresaTipoCuota,false,"id_empresaTipoCuota","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuota,TipoCuotaConstantesFunciones.LABEL_CODIGO));

		if(this.tipocuotaConstantesFunciones.mostrarcodigoTipoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuotaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocuotaConstantesFunciones.resaltarcodigoTipoCuota,this.tipocuotaConstantesFunciones.activarcodigoTipoCuota,this,true,"codigoTipoCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuotaConstantesFunciones.resaltarcodigoTipoCuota,this.tipocuotaConstantesFunciones.activarcodigoTipoCuota,this,true,"codigoTipoCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuota,TipoCuotaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocuotaConstantesFunciones.mostrarnombreTipoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuotaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocuotaConstantesFunciones.resaltarnombreTipoCuota,this.tipocuotaConstantesFunciones.activarnombreTipoCuota,this,true,"nombreTipoCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuotaConstantesFunciones.resaltarnombreTipoCuota,this.tipocuotaConstantesFunciones.activarnombreTipoCuota,this,true,"nombreTipoCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuota,TipoCuotaConstantesFunciones.LABEL_ESPROVE));

		if(this.tipocuotaConstantesFunciones.mostrares_proveTipoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuotaConstantesFunciones.LABEL_ESPROVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipocuotaConstantesFunciones.resaltares_proveTipoCuota,this.tipocuotaConstantesFunciones.activares_proveTipoCuota));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipocuotaConstantesFunciones.resaltares_proveTipoCuota,this.tipocuotaConstantesFunciones.activares_proveTipoCuota,this,true,"es_proveTipoCuota","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoCuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPrestamo && this.tipocuotaConstantesFunciones.mostrarPrestamoTipoCuota && !TipoCuotaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Prestamos");
				tableColumn.setHeaderValue("Prestamos");
				tableColumn.setCellRenderer(new PrestamoTableCell(tipocuotaConstantesFunciones.resaltarPrestamoTipoCuota,this,this.tipocuotaConstantesFunciones.activarPrestamoTipoCuota));
				tableColumn.setCellEditor(new PrestamoTableCell(tipocuotaConstantesFunciones.resaltarPrestamoTipoCuota,this,this.tipocuotaConstantesFunciones.activarPrestamoTipoCuota));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuota.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuotaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuotaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuota.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuotaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuotaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuota.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCuota && this.isPermisoGuardarCambiosTipoCuota) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocuotaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocuotaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCuota.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocuotaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCuota.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCuota.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuota && this.isPermisoGuardarCambiosTipoCuota) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocuotaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuota && this.isPermisoGuardarCambiosTipoCuota) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCuota.moveColumn(this.jTableDatosTipoCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCuota.moveColumn(this.jTableDatosTipoCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocuotaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCuota.moveColumn(this.jTableDatosTipoCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCuota.moveColumn(this.jTableDatosTipoCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCuota.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCuota.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCuota,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCuota.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCuota.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCuota.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCuota.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCuota.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocuotaLogic.getTipoCuotas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocuotas.size()-1;
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
		//this.jTableDatosTipoCuota.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCuota();
			
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
				
				//this.isEsNuevoTipoCuota=false;
					
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
				if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCuota==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuota.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuota.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocuota.getsType().equals("DUPLICADO")
				   || this.tipocuota.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCuota=true;
				
				} else {
					this.isEsNuevoTipoCuota=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocuota.getId()>=0 && !this.tipocuota.getIsNew()) {						
						this.isEsNuevoTipoCuota=false;
						
					} else {
						this.isEsNuevoTipoCuota=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCuota(esRelaciones);						
				
				this.seleccionarTipoCuota(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocuota.getId()<0) {
					this.isEsNuevoTipoCuota=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCuota(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCuota(evt,rowIndex);
				}	
				
				if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCuota: " + this.dDif); 
					}
				}								
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCuota(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocuota)) {
					if(this.tipocuota.getId()>0) {
						this.tipocuota.setIsDeleted(true);
						
						this.tipocuotasEliminados.add(this.tipocuota);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuotaLogic.getTipoCuotas().remove(this.tipocuota);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuotas.remove(this.tipocuota);				
					}
					
					
					((TipoCuotaModel) this.jTableDatosTipoCuota.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuota(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCuota(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCuota) {
			
			if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuota.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuota.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCuota(this.tipocuota);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocuotaConstantesFunciones.cargarid_empresaTipoCuota || this.tipocuotaConstantesFunciones.event_dependid_empresaTipoCuota) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocuota.getid_empresa());
									//this.inicializarActualizarBindingTipoCuota(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocuota.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocuota.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocuota.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCuota("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCuota(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuota() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuota(TipoCuota tipocuota) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCuota(tipocuota,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuota(TipoCuota tipocuota,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCuota(tipocuota);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCuota(tipocuota,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCuota(tipocuota);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCuota(TipoCuota tipocuota) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.setText(tipocuota.getId().toString());
			this.jInternalFrameDetalleFormTipoCuota.jTextFieldcodigoTipoCuota.setText(tipocuota.getcodigo());
			this.jInternalFrameDetalleFormTipoCuota.jTextAreanombreTipoCuota.setText(tipocuota.getnombre());
			this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.setSelected(tipocuota.getes_prove());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCuota tipocuotaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocuotaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCuota tipocuotaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocuotaLocal=this.tipocuota;
			} else {
				tipocuotaLocal=this.tipocuotaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocuotaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCuota(tipocuotaLocal,true);
					
					if(tipocuotaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocuotaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocuotaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCuota(TipoCuota tipocuota,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuota(tipocuota,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(tipocuota);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuota(TipoCuota tipocuota,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuota(tipocuota,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuota(TipoCuota tipocuota,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.getText()==null || this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.getText()=="" || this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.setText("0");
			}

			if(conColumnasBase) {tipocuota.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuotaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuota.jLabelIdTipoCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuota.setcodigo(this.jInternalFrameDetalleFormTipoCuota.jTextFieldcodigoTipoCuota.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuotaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuota.jLabelcodigoTipoCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuota.setnombre(this.jInternalFrameDetalleFormTipoCuota.jTextAreanombreTipoCuota.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuotaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuota.jLabelnombreTipoCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuota.setes_prove(this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuotaConstantesFunciones.LABEL_ESPROVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuota.jLabeles_proveTipoCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuota(TipoCuota tipocuotaBean,TipoCuota tipocuota,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCuota(TipoCuota tipocuotaOrigen,TipoCuota tipocuota,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuotaOrigen.getId()!=null && !tipocuotaOrigen.getId().equals(0L))) {tipocuota.setId(tipocuotaOrigen.getId());}}
			if(conDefault || (!conDefault && tipocuotaOrigen.getcodigo()!=null && !tipocuotaOrigen.getcodigo().equals(""))) {tipocuota.setcodigo(tipocuotaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocuotaOrigen.getnombre()!=null && !tipocuotaOrigen.getnombre().equals(""))) {tipocuota.setnombre(tipocuotaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipocuotaOrigen.getes_prove()!=null && !tipocuotaOrigen.getes_prove().equals(false))) {tipocuota.setes_prove(tipocuotaOrigen.getes_prove());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuota(TipoCuota tipocuota) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.setText(tipocuota.getId().toString());
			this.jInternalFrameDetalleFormTipoCuota.jTextFieldcodigoTipoCuota.setText(tipocuota.getcodigo());
			this.jInternalFrameDetalleFormTipoCuota.jTextAreanombreTipoCuota.setText(tipocuota.getnombre());
			this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.setSelected(tipocuota.getes_prove());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuota(TipoCuotaBean tipocuotaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.setText(tipocuotaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCuota.jTextFieldcodigoTipoCuota.setText(tipocuotaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCuota.jTextAreanombreTipoCuota.setText(tipocuotaBean.getnombre());
			this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.setSelected(tipocuotaBean.getes_prove());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCuota(TipoCuotaParameterReturnGeneral tipocuotaReturnGeneral,TipoCuotaBean tipocuotaBean,Boolean conDefault) throws Exception { 
		try {
			TipoCuota tipocuotaLocal=new TipoCuota();
			
			tipocuotaLocal=tipocuotaReturnGeneral.getTipoCuota();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuotaLocal.getId()!=null && !tipocuotaLocal.getId().equals(0L))) {tipocuotaBean.setId(tipocuotaLocal.getId());}}
			if(conDefault || (!conDefault && tipocuotaLocal.getcodigo()!=null && !tipocuotaLocal.getcodigo().equals(""))) {tipocuotaBean.setcodigo(tipocuotaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocuotaLocal.getnombre()!=null && !tipocuotaLocal.getnombre().equals(""))) {tipocuotaBean.setnombre(tipocuotaLocal.getnombre());}
			if(conDefault || (!conDefault && tipocuotaLocal.getes_prove()!=null && !tipocuotaLocal.getes_prove().equals(false))) {tipocuotaBean.setes_prove(tipocuotaLocal.getes_prove());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCuotaGenerico(Long idTipoCuotaSeleccionado,JComboBox jComboBoxTipoCuota,List<TipoCuota> tipocuotasLocal)throws Exception {
		try {
			TipoCuota  tipocuotaTemp=null;

			for(TipoCuota tipocuotaAux:tipocuotasLocal) {
				if(tipocuotaAux.getId()!=null && tipocuotaAux.getId().equals(idTipoCuotaSeleccionado)) {
					tipocuotaTemp=tipocuotaAux;
					break;
				}
			}

			jComboBoxTipoCuota.setSelectedItem(tipocuotaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCuotaGenerico(JComboBox jComboBoxTipoCuota,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuota.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCuota.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuota.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCuota.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Prestamo")) {
			jButtonPrestamoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuota=(TipoCuota) tipocuotaLogic.getTipoCuotas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuota =(TipoCuota) tipocuotas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocuota.getIsNew() && !tipocuota.getIsChanged() && !tipocuota.getIsDeleted()) {
				sDescripcion=tipocuota.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocuota.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCuota tipocuotaRow=new TipoCuota();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuotaRow=(TipoCuota) tipocuotaLogic.getTipoCuotas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuotaRow=(TipoCuota) tipocuotas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPrestamoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuota tipocuota) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuota==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuota = (TipoCuota)this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuota = (TipoCuota)this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuota!=null) {
						this.tipocuota = tipocuota;
					} else {
						this.tipocuota = new TipoCuota();
					}
				}

				if(this.isTienePermisosPrestamo && this.permiteMantenimiento(this.tipocuota)) {
					PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFramePopup=new PrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						prestamoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFramePopup;
					} else {
						prestamoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame;
					}

					List<TipoCuota> tipocuotas=new ArrayList<TipoCuota>();
					tipocuotas.add(this.tipocuota);
					if(!esRelacionado) {
						//prestamoBeanSwingJInternalFrame.prestamoSessionBean.setConGuardarRelaciones(false);
						//prestamoBeanSwingJInternalFrame.prestamoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					prestamoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuota.cargarPrestamoBeanSwingJInternalFrame(tipocuotas,this.tipocuota,prestamoBeanSwingJInternalFrame,/*conInicializar,*/prestamoBeanSwingJInternalFrame.prestamoSessionBean.getConGuardarRelaciones(),prestamoBeanSwingJInternalFrame.prestamoSessionBean.getEsGuardarRelacionado());
					prestamoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("no_relacionado");

						prestamoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PrestamoConstantesFunciones.ITAMANIOFILATABLA + (PrestamoConstantesFunciones.ITAMANIOFILATABLA/2));

						prestamoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuota=(TitledBorder)this.jScrollPanelDatosTipoCuota.getBorder();
						TitledBorder titledBorderPrestamo=(TitledBorder)prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.getBorder();

						titledBorderPrestamo.setTitle(titledBorderTipoCuota.getTitle() + " -> Prestamo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,prestamoBeanSwingJInternalFrame);
						}

						prestamoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(prestamoBeanSwingJInternalFrame);

						prestamoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuotaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Prestamo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCuota(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCuota.setVisible((this.isVisibilidadCeldaNuevoTipoCuota && this.isPermisoNuevoTipoCuota));			
			this.jButtonDuplicarTipoCuota.setVisible((this.isVisibilidadCeldaDuplicarTipoCuota && this.isPermisoDuplicarTipoCuota));			
			this.jButtonCopiarTipoCuota.setVisible((this.isVisibilidadCeldaCopiarTipoCuota && this.isPermisoCopiarTipoCuota));
			this.jButtonVerFormTipoCuota.setVisible((this.isVisibilidadCeldaVerFormTipoCuota && this.isPermisoVerFormTipoCuota));
			
			this.jButtonAbrirOrderByTipoCuota.setVisible((this.isVisibilidadCeldaOrdenTipoCuota && this.isPermisoOrdenTipoCuota));			
			
			this.jButtonNuevoRelacionesTipoCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuota && this.isPermisoNuevoTipoCuota));			
			this.jButtonNuevoGuardarCambiosTipoCuota.setVisible((this.isVisibilidadCeldaNuevoTipoCuota && this.isPermisoNuevoTipoCuota && this.isPermisoGuardarCambiosTipoCuota));
			
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonModificarTipoCuota.setVisible((this.isVisibilidadCeldaModificarTipoCuota && this.isPermisoActualizarTipoCuota));	
			this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarTipoCuota.setVisible((this.isVisibilidadCeldaActualizarTipoCuota && this.isPermisoActualizarTipoCuota));	
			this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarTipoCuota.setVisible((this.isVisibilidadCeldaEliminarTipoCuota && this.isPermisoEliminarTipoCuota));
			this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarTipoCuota.setVisible(this.isVisibilidadCeldaCancelarTipoCuota);							
			this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosTipoCuota.setVisible((this.isVisibilidadCeldaGuardarTipoCuota && this.isPermisoGuardarCambiosTipoCuota));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuota && this.isPermisoGuardarCambiosTipoCuota));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCuota.setVisible((this.isVisibilidadCeldaNuevoTipoCuota && this.isPermisoNuevoTipoCuota));						
			this.jButtonDuplicarToolBarTipoCuota.setVisible((this.isVisibilidadCeldaDuplicarTipoCuota && this.isPermisoDuplicarTipoCuota));						
			this.jButtonCopiarToolBarTipoCuota.setVisible((this.isVisibilidadCeldaCopiarTipoCuota && this.isPermisoCopiarTipoCuota));			
			this.jButtonVerFormToolBarTipoCuota.setVisible((this.isVisibilidadCeldaVerFormTipoCuota && this.isPermisoVerFormTipoCuota));			
			this.jButtonAbrirOrderByToolBarTipoCuota.setVisible((this.isVisibilidadCeldaOrdenTipoCuota && this.isPermisoOrdenTipoCuota));
			this.jButtonNuevoRelacionesToolBarTipoCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuota && this.isPermisoNuevoTipoCuota));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCuota.setVisible((this.isVisibilidadCeldaNuevoTipoCuota && this.isPermisoNuevoTipoCuota && this.isPermisoGuardarCambiosTipoCuota));			
			
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonModificarToolBarTipoCuota.setVisible((this.isVisibilidadCeldaModificarTipoCuota && this.isPermisoActualizarTipoCuota));	
			this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarToolBarTipoCuota.setVisible((this.isVisibilidadCeldaActualizarTipoCuota  && this.isPermisoActualizarTipoCuota));	
			this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarToolBarTipoCuota.setVisible((this.isVisibilidadCeldaEliminarTipoCuota && this.isPermisoEliminarTipoCuota));
			this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarToolBarTipoCuota.setVisible(this.isVisibilidadCeldaCancelarTipoCuota);				
			this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosToolBarTipoCuota.setVisible((this.isVisibilidadCeldaGuardarTipoCuota && this.isPermisoGuardarCambiosTipoCuota));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuota && this.isPermisoGuardarCambiosTipoCuota));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCuota.setVisible((this.isVisibilidadCeldaNuevoTipoCuota && this.isPermisoNuevoTipoCuota));			
			this.jMenuItemDuplicarTipoCuota.setVisible((this.isVisibilidadCeldaDuplicarTipoCuota && this.isPermisoDuplicarTipoCuota));			
			this.jMenuItemCopiarTipoCuota.setVisible((this.isVisibilidadCeldaCopiarTipoCuota && this.isPermisoCopiarTipoCuota));			
			this.jMenuItemVerFormTipoCuota.setVisible((this.isVisibilidadCeldaVerFormTipoCuota && this.isPermisoVerFormTipoCuota));			
			this.jMenuItemAbrirOrderByTipoCuota.setVisible((this.isVisibilidadCeldaOrdenTipoCuota && this.isPermisoOrdenTipoCuota));			
			//this.jMenuItemMostrarOcultarTipoCuota.setVisible((this.isVisibilidadCeldaOrdenTipoCuota && this.isPermisoOrdenTipoCuota));
			this.jMenuItemDetalleAbrirOrderByTipoCuota.setVisible((this.isVisibilidadCeldaOrdenTipoCuota && this.isPermisoOrdenTipoCuota));			
			//this.jMenuItemDetalleMostrarOcultarTipoCuota.setVisible((this.isVisibilidadCeldaOrdenTipoCuota && this.isPermisoOrdenTipoCuota));			
			this.jMenuItemNuevoRelacionesTipoCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuota && this.isPermisoNuevoTipoCuota));			
			this.jMenuItemNuevoGuardarCambiosTipoCuota.setVisible((this.isVisibilidadCeldaNuevoTipoCuota && this.isPermisoNuevoTipoCuota && this.isPermisoGuardarCambiosTipoCuota));									
			
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemModificarTipoCuota.setVisible((this.isVisibilidadCeldaModificarTipoCuota && this.isPermisoActualizarTipoCuota));	
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemActualizarTipoCuota.setVisible((this.isVisibilidadCeldaActualizarTipoCuota && this.isPermisoActualizarTipoCuota));	
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemEliminarTipoCuota.setVisible((this.isVisibilidadCeldaEliminarTipoCuota && this.isPermisoEliminarTipoCuota));
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemCancelarTipoCuota.setVisible(this.isVisibilidadCeldaCancelarTipoCuota);				
			}
			
			this.jMenuItemGuardarCambiosTipoCuota.setVisible((this.isVisibilidadCeldaGuardarTipoCuota && this.isPermisoGuardarCambiosTipoCuota));						
			this.jMenuItemGuardarCambiosTablaTipoCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuota && this.isPermisoGuardarCambiosTipoCuota));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCuota=this.jButtonNuevoTipoCuota.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCuota=this.jButtonDuplicarTipoCuota.isVisible();
			this.isVisibilidadCeldaCopiarTipoCuota=this.jButtonCopiarTipoCuota.isVisible();
			this.isVisibilidadCeldaVerFormTipoCuota=this.jButtonVerFormTipoCuota.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCuota=this.jButtonAbrirOrderByTipoCuota.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=this.jButtonNuevoRelacionesTipoCuota.isVisible();
			this.isVisibilidadCeldaModificarTipoCuota=this.jButtonModificarTipoCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.isVisibilidadCeldaActualizarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarTipoCuota.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarTipoCuota.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarTipoCuota.isVisible();
			this.isVisibilidadCeldaGuardarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosTipoCuota.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=this.jButtonGuardarCambiosTablaTipoCuota.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCuota=this.jButtonNuevoToolBarTipoCuota.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=this.jButtonNuevoRelacionesToolBarTipoCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.isVisibilidadCeldaModificarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jButtonModificarToolBarTipoCuota.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarToolBarTipoCuota.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarToolBarTipoCuota.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarToolBarTipoCuota.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuota=this.jButtonGuardarCambiosToolBarTipoCuota.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=this.jButtonGuardarCambiosTablaToolBarTipoCuota.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCuota=this.jMenuItemNuevoTipoCuota.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=this.jMenuItemNuevoRelacionesTipoCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.isVisibilidadCeldaModificarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jMenuItemModificarTipoCuota.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jMenuItemActualizarTipoCuota.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jMenuItemEliminarTipoCuota.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuota=this.jInternalFrameDetalleFormTipoCuota.jMenuItemCancelarTipoCuota.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuota=this.jMenuItemGuardarCambiosTipoCuota.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=this.jMenuItemGuardarCambiosTablaTipoCuota.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCuota(Boolean esInicializar) {
		if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuota();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCuota(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCuota() {
		this.jButtonNuevoTipoCuota.setVisible(this.isPermisoNuevoTipoCuota);			
		this.jButtonDuplicarTipoCuota.setVisible(this.isPermisoDuplicarTipoCuota);			
		this.jButtonCopiarTipoCuota.setVisible(this.isPermisoCopiarTipoCuota);			
		this.jButtonVerFormTipoCuota.setVisible(this.isPermisoVerFormTipoCuota);			
		
		this.jButtonAbrirOrderByTipoCuota.setVisible(this.isPermisoOrdenTipoCuota);					
		
		this.jButtonNuevoRelacionesTipoCuota.setVisible(this.isPermisoNuevoTipoCuota);			
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonModificarTipoCuota.setVisible(this.isPermisoActualizarTipoCuota);	
			this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarTipoCuota.setVisible(this.isPermisoActualizarTipoCuota);	
			this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarTipoCuota.setVisible(this.isPermisoEliminarTipoCuota);
			this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarTipoCuota.setVisible(this.isVisibilidadCeldaCancelarTipoCuota);						
			this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosTipoCuota.setVisible(this.isPermisoGuardarCambiosTipoCuota);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCuota.setVisible(this.isPermisoActualizarTipoCuota);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuota() {
		this.jInternalFrameDetalleFormTipoCuota.jButtonModificarTipoCuota.setVisible(this.isPermisoActualizarTipoCuota);	
		this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarTipoCuota.setVisible(this.isPermisoActualizarTipoCuota);	
		this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarTipoCuota.setVisible(this.isPermisoEliminarTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarTipoCuota.setVisible(this.isVisibilidadCeldaCancelarTipoCuota);							
		this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosTipoCuota.setVisible((this.isVisibilidadCeldaGuardarTipoCuota && this.isPermisoGuardarCambiosTipoCuota));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCuota() {
		if(TipoCuotaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCuota();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCuota() {
	}
	
	public void jTableDatosTipoCuotaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCuota(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuota(this.gettipocuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuota==null) {
						this.tipocuota = new TipoCuota();
					}

					this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
				}

				if(this.tipocuota.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocuota.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoCuotaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCuota(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCuota.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCuota.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCuota(this.gettipocuota(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocuotaLogic.getConnexion());

				if(this.tipocuota.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocuota.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCuota=(TitledBorder)this.jScrollPanelDatosTipoCuota.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCuota.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuota(this.gettipocuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuota==null) {
						this.tipocuota = new TipoCuota();
					}

					this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
				}

				if(this.tipocuota.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocuota.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuota(this.gettipocuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuota==null) {
						this.tipocuota = new TipoCuota();
					}

					this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
				}

				if(this.tipocuota.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocuota.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuota(this.gettipocuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuota==null) {
						this.tipocuota = new TipoCuota();
					}

					this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
				}

				if(this.tipocuota.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocuota.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_proveTipoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuota(this.gettipocuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuota==null) {
						this.tipocuota = new TipoCuota();
					}

					this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);
				}

				if(this.tipocuota.getes_prove()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_prove = "+this.tipocuota.getes_prove().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoCuotaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCuota(false,false);

			this.getTipoCuotasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCuota(false);

			//if(TipoCuotaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCuota(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCuota() {
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.jInternalFrameDetalleFormTipoCuota.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCuota.dispose();
			this.jInternalFrameDetalleFormTipoCuota=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
			this.jInternalFrameReporteDinamicoTipoCuota.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCuota.dispose();
			this.jInternalFrameReporteDinamicoTipoCuota=null;
		}
		
		if(this.jInternalFrameImportacionTipoCuota!=null) {
			this.jInternalFrameImportacionTipoCuota.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCuota.dispose();
			this.jInternalFrameImportacionTipoCuota=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCuota();
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCuota")) {
				jButtonNuevoTipoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCuota")) {
				jButtonDuplicarTipoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCuota")) {
				jButtonCopiarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCuota")) {
				jButtonVerFormTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCuota")) {
				jButtonNuevoTipoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCuota")) {
				jButtonDuplicarTipoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCuota")) {
				jButtonNuevoTipoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCuota")) {
				jButtonDuplicarTipoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCuota")) {
				jButtonNuevoTipoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCuota")) {
				jButtonNuevoTipoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCuota")) {
				jButtonNuevoTipoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCuota")) {
				jButtonModificarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCuota")) {
				jButtonModificarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCuota")) {
				jButtonModificarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCuota")) {
				jButtonActualizarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCuota")) {
				jButtonActualizarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCuota")) {
				jButtonActualizarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCuota")) {
				jButtonEliminarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCuota")) {
				jButtonEliminarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCuota")) {
				jButtonEliminarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCuota")) {
				jButtonCancelarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCuota")) {
				jButtonCancelarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCuota")) {
				jButtonCancelarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCuota")) {
				jButtonCerrarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCuota")) {
				jButtonCerrarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCuota")) {
				jButtonCerrarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCuota")) {
				jButtonMostrarOcultarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCuota")) {
				jButtonCancelarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCuota")) {
				jButtonGuardarCambiosTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCuota")) {
				jButtonGuardarCambiosTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCuota")) {
				jButtonCopiarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCuota")) {
				jButtonVerFormTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCuota")) {
				jButtonGuardarCambiosTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCuota")) {
				jButtonCopiarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCuota")) {
				jButtonVerFormTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuota")) {
				jButtonGuardarCambiosTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCuota")) {
				jButtonGuardarCambiosTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCuota")) {
				jButtonGuardarCambiosTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCuota")) {
				jButtonRecargarInformacionTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCuota")) {
				jButtonRecargarInformacionTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCuota")) {
				jButtonRecargarInformacionTipoCuotaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCuota")) {
				jButtonAnterioresTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCuota")) {
				jButtonAnterioresTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCuota")) {
				jButtonAnterioresTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCuota")) {
				jButtonSiguientesTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCuota")) {
				jButtonSiguientesTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCuota")) {
				jButtonSiguientesTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCuota") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCuota")) {
				jButtonAbrirOrderByTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCuota") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCuota")) {
				jButtonMostrarOcultarTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuota")) {
				jButtonNuevoGuardarCambiosTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCuota")) {
				jButtonNuevoGuardarCambiosTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCuota")) {
				jButtonNuevoGuardarCambiosTipoCuotaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCuota")) {
				jButtonCerrarReporteDinamicoTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCuota")) {
				jButtonGenerarReporteDinamicoTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCuota")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCuota")) {
				jButtonCerrarImportacionTipoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCuota")) {
				
				jButtonGenerarImportacionTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCuota")) {
				
				jButtonAbrirImportacionTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCuota")) {
				jComboBoxTiposAccionesTipoCuotaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCuota")) {
				jComboBoxTiposRelacionesTipoCuotaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCuota")) {
				jComboBoxTiposAccionesTipoCuotaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCuota")) {
				
				jComboBoxTiposSeleccionarTipoCuotaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCuota")) {
				jTextFieldValorCampoGeneralTipoCuotaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCuota")) {
				jButtonAbrirOrderByTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCuota")) {
				jButtonAbrirOrderByTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCuota")) {
				jButtonCerrarOrderByTipoCuotaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuotaBusqueda")) {
				this.jButtonidTipoCuotaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCuotaUpdate")) {
				this.jButtonid_empresaTipoCuotaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCuotaBusqueda")) {
				this.jButtonid_empresaTipoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCuotaBusqueda")) {
				this.jButtoncodigoTipoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCuotaBusqueda")) {
				this.jButtonnombreTipoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_proveTipoCuotaBusqueda")) {
				this.jButtones_proveTipoCuotaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			
			else if(sTipo.equals("RelacionesFinformas_de_pagoTipoCuota")) {
				this.jButtonRelacionesFinformas_de_pagoTipoCuotaActionPerformed(evt);
			}
			else if(sTipo.equals("RelacionesFinNormalTipoCuota")) {
				this.jButtonRelacionesFinNormalTipoCuotaActionPerformed(evt);
			};
			
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCuota();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuotaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				


				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCuota tipocuotaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocuotaLocal=this.tipocuota;
			} else {
				tipocuotaLocal=this.tipocuotaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
							
				
				


				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
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
			
			


			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuotaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
								
						
				


				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
								
				
				


				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuotaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
							
				
				


				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuotaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuotaAnterior =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuotaAnterior =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
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
			
			


			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuotaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
								
				
				


				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuotaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuotaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCuota")) {
					jCheckBoxSeleccionarTodosTipoCuotaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCuota")) {
					jCheckBoxSeleccionadosTipoCuotaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCuota")) {
					
				}
				
				


				
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
												
				
				


				
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuotaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuotaAnterior =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuotaAnterior =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuotaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
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
			
			


			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuotaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuota);
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
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
				
				


				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuota.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuotaAnterior =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCuota")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCuotaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCuota.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocuota =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocuota =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocuota);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCuota")) {
				
				}
				
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCuota")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCuota.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCuota")) {
			
			}
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	
		public void jButtonRelacionesFinformas_de_pagoTipoCuotaActionPerformed(ActionEvent evt) {
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.setVisible(false);

			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setVisible(true);
			}
		}

		public void jButtonRelacionesFinNormalTipoCuotaActionPerformed(ActionEvent evt) {
			if(this.jInternalFrameDetalleFormTipoCuota!=null) {
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.setVisible(false);

			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.setVisible(true);
			}
		};
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCuota();
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCuota")) {
				jButtonNuevoTipoCuotaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCuota")) {
				jButtonDuplicarTipoCuotaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCuota")) {
				jButtonCopiarTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCuota")) {
				jButtonVerFormTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCuota")) {
				jButtonNuevoTipoCuotaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCuota")) {
				jButtonModificarTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCuota")) {
				jButtonActualizarTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCuota")) {
				jButtonEliminarTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuota")) {
				jButtonGuardarCambiosTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCuota")) {
				jButtonCancelarTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCuota")) {
				jButtonCerrarTipoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCuota")) {
				jButtonGuardarCambiosTipoCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuota")) {
				jButtonNuevoGuardarCambiosTipoCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCuota")) {
				jButtonAbrirOrderByTipoCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCuota")) {
				jButtonRecargarInformacionTipoCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCuota")) {
				jButtonAnterioresTipoCuotaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCuota")) {
				jButtonSiguientesTipoCuotaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuotaBusqueda")) {
				this.jButtonidTipoCuotaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCuotaUpdate")) {
				this.jButtonid_empresaTipoCuotaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCuotaBusqueda")) {
				this.jButtonid_empresaTipoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCuotaBusqueda")) {
				this.jButtoncodigoTipoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCuotaBusqueda")) {
				this.jButtonnombreTipoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_proveTipoCuotaBusqueda")) {
				this.jButtones_proveTipoCuotaBusquedaActionPerformed(evt);
			}
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCuota();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCuota")) {
				closingInternalFrameTipoCuota();
				
			} else if(sTipo.equals("jButtonCancelarTipoCuota")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCuota = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCuotaBeanSwingJInternalFrame jInternalFrameParent=(TipoCuotaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuota.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCuotaActionPerformed(null);
			}
			
			TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuota,new Object(),this.tipocuotaParameterGeneral,this.tipocuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCuota(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCuota(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCuota(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocuota)) {
			if(!esControlTabla) {
				if(TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);			
				}
				
				if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCuota(this.tipocuota,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuotaReturnGeneral=tipocuotaLogic.procesarEventosTipoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuotaLogic.getTipoCuotas(),this.tipocuota,this.tipocuotaParameterGeneral,this.isEsNuevoTipoCuota,classes);//this.tipocuotaLogic.getTipoCuota()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCuota(this.tipocuotaReturnGeneral,this.tipocuotaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuota(classes,this.tipocuotaReturnGeneral,this.tipocuotaBean,false);
					}
						
					if(this.tipocuotaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCuota(this.tipocuotaReturnGeneral.getTipoCuota());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCuota(this.tipocuotaReturnGeneral.getTipoCuota());	
					}
						
					if(this.tipocuotaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCuota(this.tipocuotaReturnGeneral.getTipoCuota(),classes);//this.tipocuotaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCuota(this.tipocuota,classes);//this.tipocuotaBean);									
				}
			
				if(TipoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCuota(this.tipocuota,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuota(this.tipocuota);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocuotaAnterior!=null) {
						this.tipocuota=this.tipocuotaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuotaReturnGeneral=tipocuotaLogic.procesarEventosTipoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuotaLogic.getTipoCuotas(),this.tipocuota,this.tipocuotaParameterGeneral,this.isEsNuevoTipoCuota,classes);//this.tipocuotaLogic.getTipoCuota()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuotaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuotaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocuotaReturnGeneral.getTipoCuota(),tipocuotaLogic.getTipoCuotas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocuotaReturnGeneral.getTipoCuota(),this.tipocuotas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCuota.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCuota.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCuota();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCuota() throws Exception {
		
		TipoCuotaModel tipocuotaModel=(TipoCuotaModel)this.jTableDatosTipoCuota.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuotaModel.tipocuotas=this.tipocuotaLogic.getTipoCuotas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocuotaModel.tipocuotas=this.tipocuotas;
		}
		
		
		((TipoCuotaModel) this.jTableDatosTipoCuota.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCuota() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocuotaAnterior(),this.tipocuotaLogic.getTipoCuotas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocuotaAnterior(),this.tipocuotas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCuota();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCuota(TipoCuota tipocuota,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Prestamo.class)) {
					this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(tipocuota.getPrestamos());
					this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
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
										
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuota,new Object(),generalEntityParameterGeneral,this.tipocuotaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCuotaConstantesFunciones.getClassesRelationshipsOfTipoCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCuotaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCuota(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCuota(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuota,new Object(),generalEntityParameterGeneral,this.tipocuotaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCuota(TipoCuotaBean tipocuotaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Prestamo.class)) {
					this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(tipocuota.getPrestamos());
					this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuota(ArrayList<Classe> classes,TipoCuotaReturnGeneral tipocuotaReturnGeneral,TipoCuotaBean tipocuotaBean,Boolean conDefault) throws Exception {
		
			this.tipocuotaBean.setPrestamos(tipocuotaReturnGeneral.getTipoCuota().getPrestamos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCuota(TipoCuota tipocuota,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Prestamo.class)) {
					tipocuota.setPrestamos(this.jInternalFrameDetalleFormTipoCuota.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocuota)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuota = new TipoCuotaDetalleFormJInternalFrame(jDesktopPane,this.tipocuotaSessionBean.getConGuardarRelaciones(),this.tipocuotaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.setVisible(false);
		this.jInternalFrameDetalleFormTipoCuota.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCuota.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCuota.tipocuotaLogic=this.tipocuotaLogic;
		
		this.cargarCombosFrameForeignKeyTipoCuota("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuota();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuota();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCuota("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCuota();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCuota.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuota"));
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonModificarTipoCuota.addActionListener(new ButtonActionListener(this,"ModificarTipoCuota"));

		
		this.jInternalFrameDetalleFormTipoCuota.jButtonModificarToolBarTipoCuota.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuota"));
					
		this.jInternalFrameDetalleFormTipoCuota.jMenuItemModificarTipoCuota.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuota"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarTipoCuota.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuota"));
		
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarToolBarTipoCuota.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuota"));
						
		this.jInternalFrameDetalleFormTipoCuota.jMenuItemActualizarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuota"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarTipoCuota.addActionListener (new ButtonActionListener(this,"EliminarTipoCuota"));
		
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuota"));
								
		this.jInternalFrameDetalleFormTipoCuota.jMenuItemEliminarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuota"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarTipoCuota.addActionListener (new ButtonActionListener(this,"CancelarTipoCuota"));
		
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuota"));
					
		this.jInternalFrameDetalleFormTipoCuota.jMenuItemCancelarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuota"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCuota.jMenuItemDetalleCerrarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuota"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuota"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuota"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuota"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonidTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuota.jButtonid_empresaTipoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonid_empresaTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtoncodigoTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonnombreTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtones_proveTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"es_proveTipoCuotaBusqueda"));
		
		
		
				this.jInternalFrameDetalleFormTipoCuota.jButtonRelacionesFinformas_de_pagoTipoCuota.addActionListener (new ButtonActionListener(this,"RelacionesFinformas_de_pagoTipoCuota"));
				this.jInternalFrameDetalleFormTipoCuota.jButtonRelacionesFinNormalTipoCuota.addActionListener (new ButtonActionListener(this,"RelacionesFinNormalTipoCuota"));;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuota"));
		
		
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFinformas_de_pagoTipoCuota"));;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCuota"));
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuota"));
		}
		
		this.jTableDatosTipoCuota.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCuota"));
		
		this.jTableDatosTipoCuota.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCuota"));
		
		this.jButtonNuevoTipoCuota.addActionListener(new ButtonActionListener(this,"NuevoTipoCuota"));
		
		this.jButtonDuplicarTipoCuota.addActionListener(new ButtonActionListener(this,"DuplicarTipoCuota"));
		
		this.jButtonCopiarTipoCuota.addActionListener(new ButtonActionListener(this,"CopiarTipoCuota"));
		
		this.jButtonVerFormTipoCuota.addActionListener(new ButtonActionListener(this,"VerFormTipoCuota"));
		
		
		this.jButtonNuevoToolBarTipoCuota.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCuota"));
			
		this.jButtonDuplicarToolBarTipoCuota.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCuota"));
			
		this.jMenuItemNuevoTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCuota"));
			
		this.jMenuItemDuplicarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCuota"));		
		
		
		this.jButtonNuevoRelacionesTipoCuota.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCuota"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuota.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCuota"));
			
		this.jMenuItemNuevoRelacionesTipoCuota.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCuota"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonModificarTipoCuota.addActionListener(new ButtonActionListener(this,"ModificarTipoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonModificarToolBarTipoCuota.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuota"));
			
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemModificarTipoCuota.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarTipoCuota.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonActualizarToolBarTipoCuota.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuota"));
				
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemActualizarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarTipoCuota.addActionListener (new ButtonActionListener(this,"EliminarTipoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonEliminarToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuota"));
						
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemEliminarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarTipoCuota.addActionListener (new ButtonActionListener(this,"CancelarTipoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonCancelarToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuota"));
			
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemCancelarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuota"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCuota"));		
		
		
		this.jButtonCerrarTipoCuota.addActionListener (new ButtonActionListener(this,"CerrarTipoCuota"));
		
		
		this.jButtonCerrarToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCuota"));
			
		this.jMenuItemCerrarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCuota"));
			
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jMenuItemDetalleCerrarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosTipoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuota"));
		}
		
		this.jButtonCopiarToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCuota"));
			
		this.jButtonVerFormToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCuota"));
		
		this.jMenuItemGuardarCambiosTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCuota"));
			
		this.jMenuItemCopiarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCuota"));		
		
		this.jMenuItemVerFormTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCuota"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuota"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCuota"));
			
		this.jMenuItemGuardarCambiosTablaTipoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuota"));		
		
		
		
		this.jButtonRecargarInformacionTipoCuota.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCuota"));
					
		this.jButtonRecargarInformacionToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCuota"));
		
		this.jMenuItemRecargarInformacionTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCuota"));		
		
		
		
		this.jButtonAnterioresTipoCuota.addActionListener (new ButtonActionListener(this,"AnterioresTipoCuota"));
		
		
		this.jButtonAnterioresToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCuota"));
		
		this.jMenuItemAnterioresTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCuota"));		
		
		
		this.jButtonSiguientesTipoCuota.addActionListener (new ButtonActionListener(this,"SiguientesTipoCuota"));
		
		
		this.jButtonSiguientesToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCuota"));
			
		this.jMenuItemSiguientesTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCuota"));
			
		this.jMenuItemAbrirOrderByTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCuota"));
			
		this.jMenuItemMostrarOcultarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCuota"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCuota"));
			
		this.jMenuItemDetalleMostarOcultarTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCuota"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCuota.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCuota"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCuota"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCuota.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCuota"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCuota.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCuota"));

		this.jCheckBoxSeleccionadosTipoCuota.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCuota"));
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuota"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCuota.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCuota"));
			
		this.jComboBoxTiposAccionesTipoCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCuota"));
					
		this.jComboBoxTiposSeleccionarTipoCuota.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCuota"));
			
		this.jTextFieldValorCampoGeneralTipoCuota.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCuota"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonidTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuota.jButtonid_empresaTipoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonid_empresaTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtoncodigoTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonnombreTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtones_proveTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"es_proveTipoCuotaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCuota!=null) {
				this.jInternalFrameReporteDinamicoTipoCuota.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuota"));
				this.jInternalFrameReporteDinamicoTipoCuota.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuota"));
				this.jInternalFrameReporteDinamicoTipoCuota.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuota"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCuota.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuota"));				
			//this.jButtonGenerarReporteDinamicoTipoCuota.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuota"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCuota.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuota"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCuota!=null) {
				this.jInternalFrameImportacionTipoCuota.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuota"));
				this.jInternalFrameImportacionTipoCuota.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuota"));
				this.jInternalFrameImportacionTipoCuota.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuota"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCuota.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCuota"));
			
			this.jButtonAbrirOrderByToolBarTipoCuota.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCuota"));			
			
			if(this.jInternalFrameOrderByTipoCuota!=null) {
				this.jInternalFrameOrderByTipoCuota.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuota"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			
				this.jInternalFrameDetalleFormTipoCuota.jButtonRelacionesFinformas_de_pagoTipoCuota.addActionListener (new ButtonActionListener(this,"RelacionesFinformas_de_pagoTipoCuota"));
				this.jInternalFrameDetalleFormTipoCuota.jButtonRelacionesFinNormalTipoCuota.addActionListener (new ButtonActionListener(this,"RelacionesFinNormalTipoCuota"));;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesTipoCuota.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuota"));
		
		
			this.jInternalFrameDetalleFormTipoCuota.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFinformas_de_pagoTipoCuota"));;
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
            		closingInternalFrameTipoCuota();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCuota.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCuota = (JInternalFrameBase)event.getSource();
	            	
	            TipoCuotaBeanSwingJInternalFrame jInternalFrameParent=(TipoCuotaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuota.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCuotaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCuota.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCuotaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCuota.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCuota.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCuota";
		inputMap = this.jButtonNuevoTipoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuotaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCuota";
		inputMap = this.jButtonNuevoRelacionesTipoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuotaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCuota";
		inputMap = this.jButtonModificarTipoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCuota";
		inputMap = this.jButtonActualizarTipoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCuota";
		inputMap = this.jButtonEliminarTipoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCuota";
		inputMap = this.jButtonCancelarTipoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCuota";
		inputMap = this.jButtonCerrarTipoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCuota";
		inputMap = this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosTipoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCuota.jButtonGuardarCambiosTipoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCuota.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCuotaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonidTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuota.jButtonid_empresaTipoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonid_empresaTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtoncodigoTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtonnombreTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuota.jButtones_proveTipoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"es_proveTipoCuotaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCuotaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCuota.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCuota(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
					tipocuotaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuota tipocuotaAux:tipocuotas) {
					tipocuotaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCuotaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuota(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
						tipocuotaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuota tipocuotaAux:tipocuotas) {
						tipocuotaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
					
						if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_ESPROVE)) {
							existe=true;
							tipocuotaAux.setes_prove(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuota tipocuotaAux:tipocuotas) {
						
						if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_ESPROVE)) {
							existe=true;
							tipocuotaAux.setes_prove(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuota(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuota.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuota.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuota,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCuotaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuota(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCuota.getSelectedRows();
			
			TipoCuota tipocuotaLocal=new TipoCuota();
			
			//this.seleccionarTodosTipoCuota(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuotaLocal =(TipoCuota) this.tipocuotaLogic.getTipoCuotas().toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocuotaLocal =(TipoCuota) this.tipocuotas.toArray()[this.jTableDatosTipoCuota.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocuotaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
						tipocuotaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuota tipocuotaAux:tipocuotas) {
						tipocuotaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCuota(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuota.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuota.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuota,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCuotaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCuotaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCuotaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCuota(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCuota.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuota tipocuotaAux:this.tipocuotaLogic.getTipoCuotas()) {
				
						if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocuotaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocuotaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuota tipocuotaAux:tipocuotas) {
					
						if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocuotaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocuotaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuota(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCuotaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCuota(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCuota=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCuota.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCuota) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCuota(conSplash);
				
					this.generarReporteTipoCuotasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCuotasSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuotasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuotasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuota();
				
				this.exportarTipoCuotasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCuotas();
				//this.importarTipoCuotas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuota();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCuotasSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCuota();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCuota)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCuota(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCuotaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCuota) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCuota(conSplash);
					
						//this.actualizarParametrosGeneralTipoCuota();
						
						this.generarReporteProcesoAccionTipoCuotasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCuotaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo CuotaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCuota();
				
						this.actualizarParametrosGeneralTipoCuota();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocuotaReturnGeneral=tipocuotaLogic.procesarAccionTipoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocuotaLogic.getTipoCuotas(),this.tipocuotaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCuotaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCuota();
					
					TipoCuotaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCuotaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCuota.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCuota.jComboBoxTiposAccionesFormularioTipoCuota.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCuota(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCuotaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCuota();
			
			if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		
			TipoCuota tipocuota=new TipoCuota();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCuota(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCuota.getSelectedItem();
			
			
			
			
			tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocuotasSeleccionados.size()==1) {
				for(TipoCuota tipocuotaAux:tipocuotasSeleccionados) {
					tipocuota=tipocuotaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Prestamo")) {
					jButtonPrestamoActionPerformed(null,rowIndex,true,false,tipocuota);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCuota();
			
      		//this.finishProcessTipoCuota(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCuotaReturnGeneral() throws Exception {
		if(this.tipocuotaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocuotaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocuotaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocuotaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocuotaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocuotaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCuota(false);
		}
		
		if(this.tipocuotaReturnGeneral.getConRetornoLista() || this.tipocuotaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocuotaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuotaLogic.setTipoCuotas(this.tipocuotaReturnGeneral.getTipoCuotas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocuotaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuotaLogic.setTipoCuota(this.tipocuotaReturnGeneral.getTipoCuota());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCuota(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCuota() throws Exception {
		
		
	}
	
	public ArrayList<TipoCuota> getTipoCuotasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCuota) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCuota tipocuotaAux:tipocuotaLogic.getTipoCuotas()) {
					if(tipocuotaAux.getIsSelected()) {
						tipocuotasSeleccionados.add(tipocuotaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuota tipocuotaAux:this.tipocuotas) {
					if(tipocuotaAux.getIsSelected()) {
						tipocuotasSeleccionados.add(tipocuotaAux);				
					}
				}
			}
			
			if(tipocuotasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocuotasSeleccionados.addAll(this.tipocuotaLogic.getTipoCuotas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocuotasSeleccionados.addAll(this.tipocuotas);				
					}
				}
			}
		} else {
			tipocuotasSeleccionados.add(this.tipocuota);
		}
		
		return tipocuotasSeleccionados;
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
	
	public void generarReporteTipoCuotasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCuotasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCuotasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuotasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuotasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCuotasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Cuota",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCuotasSeleccionados() throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCuotas("Todos",tipocuotasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCuotasSeleccionados() throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCuotas("Todos",tipocuotasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCuotasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCuotas("Todos",tipocuotasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCuotasSeleccionados() throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCuota();
		
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCuota();
		
		
		//this.generarReporteTipoCuotas("Todos",tipocuotasSeleccionados ,tipocuotaImplementable,tipocuotaImplementableHome);
	}
	
	public void mostrarImportacionTipoCuotas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCuota();
		
		this.abrirFrameImportacionTipoCuota();		
		
			
		//this.generarReporteTipoCuotas("Todos",tipocuotasSeleccionados ,tipocuotaImplementable,tipocuotaImplementableHome);
	}
	
	public void importarTipoCuotas() throws Exception {		
	
	}
	
	public void exportarTipoCuotasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCuotasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCuotasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCuotasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Cuota",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCuotasSeleccionados() throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuota."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCuota(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCuota tipocuotaAux:tipocuotasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCuota(tipocuotaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocuotaAux.setsDetalleGeneralEntityReporte(tipocuotaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCuota(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCuotaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuotaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuotaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuotaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuotaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuotaConstantesFunciones.LABEL_ESPROVE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCuota(TipoCuota tipocuota,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocuota.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuota.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuota.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuota.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuota.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuota.getes_prove().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCuotasSeleccionados() throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuota.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCuotas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCuota(row);				
				iRow++;
			}				
			
			for(TipoCuota tipocuotaAux:tipocuotasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCuota(tipocuotaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCuotasSeleccionados() throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();		
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuota.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocuotas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocuota");
			//elementRoot.appendChild(element);
		
			for(TipoCuota tipocuotaAux:tipocuotasSeleccionados) {
				element = document.createElement("tipocuota");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCuota(tipocuotaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCuota(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuotaConstantesFunciones.LABEL_ESPROVE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCuota(TipoCuota tipocuota,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuota.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuota.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuota.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuota.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuota.getes_prove());				
	}
	
	public void setFilaDatosExportarXmlTipoCuota(TipoCuota tipocuota,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCuotaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocuota.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCuotaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocuota.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoCuotaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocuota.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoCuotaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocuota.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCuotaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocuota.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_prove = document.createElement(TipoCuotaConstantesFunciones.ESPROVE);
		elementes_prove.appendChild(document.createTextNode(tipocuota.getes_prove().toString().trim()));
		element.appendChild(elementes_prove);
	}
	
	public void generarReporteGroupGenericoTipoCuotasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCuota> tipocuotasSeleccionados=new ArrayList<TipoCuota>();
		
		tipocuotasSeleccionados=this.getTipoCuotasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCuota(tipocuotasSeleccionados);
		
		this.generarReporteTipoCuotas("Todos",tipocuotasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCuota(ArrayList<TipoCuota> tipocuotasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCuota tipocuotaAux:tipocuotasSeleccionados) {
				tipocuotaAux.setsDetalleGeneralEntityReporte(tipocuotaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocuotaAux.setsDescripcionGeneralEntityReporte1(tipocuotaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocuotaAux.setsDescripcionGeneralEntityReporte1(tipocuotaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocuotaAux.setsDescripcionGeneralEntityReporte1(tipocuotaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoCuotaConstantesFunciones.LABEL_ESPROVE)) {
					existe=true;
					tipocuotaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipocuotaAux.getes_prove()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCuota(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCuota=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCuota=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCuota=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCuota=false;
			this.isVisibilidadCeldaActualizarTipoCuota=false;
			this.isVisibilidadCeldaEliminarTipoCuota=false;
			this.isVisibilidadCeldaCancelarTipoCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=false;
			this.isVisibilidadCeldaModificarTipoCuota=false;
			this.isVisibilidadCeldaActualizarTipoCuota=true;
			this.isVisibilidadCeldaEliminarTipoCuota=false;
			this.isVisibilidadCeldaCancelarTipoCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=false;
			this.isVisibilidadCeldaModificarTipoCuota=false;
			this.isVisibilidadCeldaActualizarTipoCuota=true;
			this.isVisibilidadCeldaEliminarTipoCuota=true;
			this.isVisibilidadCeldaCancelarTipoCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=false;
			this.isVisibilidadCeldaModificarTipoCuota=false;
			this.isVisibilidadCeldaActualizarTipoCuota=true;
			this.isVisibilidadCeldaEliminarTipoCuota=false;
			this.isVisibilidadCeldaCancelarTipoCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=true;
			this.isVisibilidadCeldaModificarTipoCuota=false;
			this.isVisibilidadCeldaActualizarTipoCuota=false;
			this.isVisibilidadCeldaEliminarTipoCuota=false;
			this.isVisibilidadCeldaCancelarTipoCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=false;
			this.isVisibilidadCeldaActualizarTipoCuota=false;
			this.isVisibilidadCeldaEliminarTipoCuota=false;
			this.isVisibilidadCeldaCancelarTipoCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=false;
			this.isVisibilidadCeldaModificarTipoCuota=true;
			this.isVisibilidadCeldaActualizarTipoCuota=false;
			this.isVisibilidadCeldaEliminarTipoCuota=false;
			this.isVisibilidadCeldaCancelarTipoCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuota=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCuotaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=true;
		} else {
			this.actualizarEstadoPanelsTipoCuota(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCuota=false;
			//this.isVisibilidadCeldaVerFormTipoCuota=false;
			this.isVisibilidadCeldaDuplicarTipoCuota=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocuotaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuota=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocuotaSessionBean.getEsGuardarRelacionado()) {
			if(!tipocuotaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;												
			}
			
			this.jButtonCerrarTipoCuota.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuota=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocuota)) {
			this.isVisibilidadCeldaActualizarTipoCuota=false;
			this.isVisibilidadCeldaEliminarTipoCuota=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuota() {
		this.isVisibilidadCeldaNuevoTipoCuota=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCuota=false;
	}
	
	public void actualizarEstadoPanelsTipoCuota(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCuota!=null) {
				this.jScrollPanelDatosEdicionTipoCuota.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuota!=null) {
				this.jTabbedPaneBusquedasTipoCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuota!=null) {
				this.jScrollPanelDatosTipoCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuota!=null) {
				this.jPanelPaginacionTipoCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCuota!=null) {
				this.jScrollPanelDatosEdicionTipoCuota.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuota!=null) {
				this.jTabbedPaneBusquedasTipoCuota.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCuota!=null) {
				this.jScrollPanelDatosTipoCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuota!=null) {
				this.jPanelPaginacionTipoCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCuota!=null) {
				this.jScrollPanelDatosEdicionTipoCuota.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuota!=null) {
				this.jTabbedPaneBusquedasTipoCuota.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuota!=null) {
				this.jScrollPanelDatosTipoCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuota!=null) {
				this.jPanelPaginacionTipoCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCuota!=null) {
				this.jScrollPanelDatosEdicionTipoCuota.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuota!=null) {
				this.jTabbedPaneBusquedasTipoCuota.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuota!=null) {
				this.jScrollPanelDatosTipoCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuota!=null) {
				this.jPanelPaginacionTipoCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCuota!=null) {
				this.jScrollPanelDatosEdicionTipoCuota.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuota!=null) {
				this.jTabbedPaneBusquedasTipoCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuota!=null) {
				this.jScrollPanelDatosTipoCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuota!=null) {
				this.jPanelPaginacionTipoCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCuota!=null) {
				this.jScrollPanelDatosEdicionTipoCuota.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuota!=null) {
				this.jTabbedPaneBusquedasTipoCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuota!=null) {
				this.jScrollPanelDatosTipoCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuota!=null) {
				this.jPanelPaginacionTipoCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCuota!=null) {
				this.jScrollPanelDatosEdicionTipoCuota.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuota!=null) {
				this.jTabbedPaneBusquedasTipoCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuota!=null) {
				this.jScrollPanelDatosTipoCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuota!=null) {
				this.jPanelPaginacionTipoCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCuota!=null) {
					this.jTabbedPaneBusquedasTipoCuota.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuota!=null) {
				this.jTabbedPaneBusquedasTipoCuota.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCuota!=null) {
				this.jPanelParametrosReportesTipoCuota.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoCuotaParaPrestamos() throws Exception {
		Boolean isPaginaPopupPrestamo=false;

		try {

			if(this.tipocuotaSessionBean==null) {
				this.tipocuotaSessionBean=new TipoCuotaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean=new PrestamoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean.setsPathNavegacionActual(tipocuotaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PrestamoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPrestamo=this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePrestamo(true);
			this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo(TipoCuotaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuota(true);
			this.jInternalFrameDetalleFormTipoCuota.prestamoSessionBean.setlidTipoCuotaActual(this.idTipoCuotaActual);

			tipocuotaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuota(true);
			tipocuotaSessionBean.setlIdTipoCuotaActualForeignKey(this.idTipoCuotaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCuotaSessionBean tipocuotaSessionBean=new TipoCuotaSessionBean();
		
		if(this.tipocuotaSessionBean==null) {
			this.tipocuotaSessionBean=new TipoCuotaSessionBean();
		}
		
		this.tipocuotaSessionBean.setsUltimaBusquedaTipoCuota(this.getsAccionBusqueda());
		this.tipocuotaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocuotaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocuotaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCuotaSessionBean tipocuotaSessionBean=new TipoCuotaSessionBean();
		
		if(this.tipocuotaSessionBean==null) {
			this.tipocuotaSessionBean=new TipoCuotaSessionBean();
		}
		
		if(this.tipocuotaSessionBean.getsUltimaBusquedaTipoCuota()!=null&&!this.tipocuotaSessionBean.getsUltimaBusquedaTipoCuota().equals("")) {
			this.setsAccionBusqueda(tipocuotaSessionBean.getsUltimaBusquedaTipoCuota());
			this.setiNumeroPaginacion(tipocuotaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocuotaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocuotaSessionBean.getid_empresa());
				tipocuotaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocuotaSessionBean.setsUltimaBusquedaTipoCuota("");
		this.tipocuotaSessionBean.setiNumeroPaginacion(TipoCuotaConstantesFunciones.INUMEROPAGINACION);
		this.tipocuotaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCuota(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCuota() {
		this.updateBorderResaltarBusquedasFormularioTipoCuota();
		this.updateVisibilidadBusquedasFormularioTipoCuota();
		this.updateHabilitarBusquedasFormularioTipoCuota();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCuota() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCuota.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCuota() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCuota.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCuota() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCuota.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCuota(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoCuota.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCuota() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCuota();
		this.updateVisibilidadResaltarControlesFormularioTipoCuota();
		this.updateHabilitarResaltarControlesFormularioTipoCuota();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCuota() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocuotaConstantesFunciones.resaltaridTipoCuota!=null && this.jInternalFrameDetalleFormTipoCuota!=null) {this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.setBorder(this.tipocuotaConstantesFunciones.resaltaridTipoCuota);}
		if(this.tipocuotaConstantesFunciones.resaltarid_empresaTipoCuota!=null && this.jInternalFrameDetalleFormTipoCuota!=null) {this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setBorder(this.tipocuotaConstantesFunciones.resaltarid_empresaTipoCuota);}
		if(this.tipocuotaConstantesFunciones.resaltarcodigoTipoCuota!=null && this.jInternalFrameDetalleFormTipoCuota!=null) {this.jInternalFrameDetalleFormTipoCuota.jTextFieldcodigoTipoCuota.setBorder(this.tipocuotaConstantesFunciones.resaltarcodigoTipoCuota);}
		if(this.tipocuotaConstantesFunciones.resaltarnombreTipoCuota!=null && this.jInternalFrameDetalleFormTipoCuota!=null) {this.jInternalFrameDetalleFormTipoCuota.jTextAreanombreTipoCuota.setBorder(this.tipocuotaConstantesFunciones.resaltarnombreTipoCuota);}
		if(this.tipocuotaConstantesFunciones.resaltares_proveTipoCuota!=null && this.jInternalFrameDetalleFormTipoCuota!=null) {this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.setBorderPainted(true);this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.setBorder(this.tipocuotaConstantesFunciones.resaltares_proveTipoCuota);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCuota() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
	
		//this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostraridTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jPanelidTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostraridTipoCuota);
		//this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostrarid_empresaTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jPanelid_empresaTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostrarid_empresaTipoCuota);
		//this.jInternalFrameDetalleFormTipoCuota.jTextFieldcodigoTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostrarcodigoTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jPanelcodigoTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostrarcodigoTipoCuota);
		//this.jInternalFrameDetalleFormTipoCuota.jTextAreanombreTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostrarnombreTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jPanelnombreTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostrarnombreTipoCuota);
		//this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostrares_proveTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jPaneles_proveTipoCuota.setVisible(this.tipocuotaConstantesFunciones.mostrares_proveTipoCuota);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCuota() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuota!=null) {
	
		this.jInternalFrameDetalleFormTipoCuota.jLabelidTipoCuota.setEnabled(this.tipocuotaConstantesFunciones.activaridTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jComboBoxid_empresaTipoCuota.setEnabled(this.tipocuotaConstantesFunciones.activarid_empresaTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jTextFieldcodigoTipoCuota.setEnabled(this.tipocuotaConstantesFunciones.activarcodigoTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jTextAreanombreTipoCuota.setEnabled(this.tipocuotaConstantesFunciones.activarnombreTipoCuota);
		this.jInternalFrameDetalleFormTipoCuota.jCheckBoxes_proveTipoCuota.setEnabled(this.tipocuotaConstantesFunciones.activares_proveTipoCuota);
		}
	}
	
		
}